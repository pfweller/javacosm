package eu.pfweller.javacosm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import eu.pfweller.javacosm.microcosm.Microcosm;

public class Javacosm {

/*  public static Site getSite(String url) {
    StringBuilder builder = new StringBuilder();
    HttpClient client = new DefaultHttpClient();
    HttpGet getSite = new HttpGet(url);

    try {
      HttpResponse response = client.execute(getSite);
      StatusLine statusLine = response.getStatusLine();
      int statusCode = statusLine.getStatusCode();
      if (statusCode == 200) {
        HttpEntity entity = response.getEntity();
        InputStream content = entity.getContent();
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(content));
        String line;

        while ((line = reader.readLine()) != null) {
          builder.append(line);
        }
      } else {
        System.out.println("Failed to get site information");
      }
    } catch (ClientProtocolException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }*/

  public static List<Microcosm> getMicrocosms(/* Site site*/) {
    //String url = Site.getDomain() + Site.getLinks().getRel("microcosm");
    StringBuilder builder = new StringBuilder();
    HttpClient client = new DefaultHttpClient();
    HttpGet getMicrocosms = new HttpGet("http://www.mocky.io/v2/5186c569cf096b8c025cb3b1");

    try {
      HttpResponse response = client.execute(getMicrocosms);
      StatusLine statusLine = response.getStatusLine();
      int statusCode = statusLine.getStatusCode();
      if (statusCode == 200) {
        HttpEntity entity = response.getEntity();
        InputStream content = entity.getContent();
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(content));
        String line;

        while ((line = reader.readLine()) != null) {
          builder.append(line);
        }
      } else {
        System.out.println("Failed to get Microcosms");
      }
    } catch (ClientProtocolException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    JsonParser parser = new JsonParser();
    JsonObject object = parser.parse(builder.toString()).getAsJsonObject();
    String microcosmJson = object.getAsJsonObject("data").getAsJsonObject("microcosms").getAsJsonArray("items").toString();

    Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'").create();
    List<Microcosm> microcosms = gson.fromJson(microcosmJson,
        new TypeToken<List<Microcosm>>() {
        }.getType());
    return microcosms;
  }
}
