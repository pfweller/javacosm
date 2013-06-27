package eu.pfweller.javacosm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import eu.pfweller.javacosm.microcosm.Microcosm;
import eu.pfweller.javacosm.site.Site;
import eu.pfweller.javacosm.site.SiteNotFoundException;

public class Javacosm {
  public static final String SITE = "/api/v1/site";

  public static Site getSite(String baseUrl) throws SiteNotFoundException, IOException {
    StringBuilder builder = new StringBuilder();
    HttpClient client = new DefaultHttpClient();
    HttpGet getSite = new HttpGet(baseUrl + SITE);

    HttpResponse response = client.execute(getSite);
    StatusLine statusLine = response.getStatusLine();
    int statusCode = statusLine.getStatusCode();

    if (statusCode == 200) {
      HttpEntity entity = response.getEntity();
      InputStream content = entity.getContent();
      BufferedReader reader = new BufferedReader(new InputStreamReader(content));
      String line;

      while ((line = reader.readLine()) != null) {
        builder.append(line);
      }
    } else if (statusCode == 400) {
      throw new SiteNotFoundException("Could not find site at: " + baseUrl);
    }

    JsonParser parser = new JsonParser();
    JsonObject object = parser.parse(builder.toString()).getAsJsonObject();
    String siteJson = object.getAsJsonObject("data").toString();

    Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'").create();
    return gson.fromJson(siteJson, Site.class);
  }

  public static List<Microcosm> getMicrocosms(Site site) throws LinkNotFoundException, IOException {
    String url = site.getDomain() + site.getMeta().getLink("microcosm").getHref();
    StringBuilder builder = new StringBuilder();
    HttpClient client = new DefaultHttpClient();
    HttpGet getMicrocosms = new HttpGet(url);

    HttpResponse response = client.execute(getMicrocosms);
    HttpEntity entity = response.getEntity();
    InputStream content = entity.getContent();
    BufferedReader reader = new BufferedReader(new InputStreamReader(content));
    String line;

    while ((line = reader.readLine()) != null) {
      builder.append(line);
    }

    JsonParser parser = new JsonParser();
    JsonObject object = parser.parse(builder.toString()).getAsJsonObject();
    String microcosmJson = object.getAsJsonObject("data").getAsJsonObject("microcosms").getAsJsonArray("items").toString();

    Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'").create();
    return gson.fromJson(microcosmJson, new TypeToken<List<Microcosm>>() {
    }.getType());
  }
}
