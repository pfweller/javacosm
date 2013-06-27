package eu.pfweller.javacosm;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import eu.pfweller.javacosm.site.SiteNotFoundException;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import eu.pfweller.javacosm.item.Item;
import eu.pfweller.javacosm.microcosm.Microcosm;
import eu.pfweller.javacosm.site.Site;
import eu.pfweller.javacosm.user.User;

public class JavacosmTest {
  private static String BASE_URL = "https://javacosm.microco.sm/";

  private static Site site;
  private static List<Microcosm> microcosms;

  private Microcosm microcosm;

  @BeforeClass
  public static void get_microcosms() throws SiteNotFoundException, LinkNotFoundException, IOException {
    site = Javacosm.getSite(BASE_URL);
    microcosms = Javacosm.getMicrocosms(site);
  }

  @Before
  public void create_mocked_microcosm() {
    microcosm = mock(Microcosm.class);
  }

  @Test(expected = SiteNotFoundException.class)
  public void get_site_which_does_not_exist() throws IOException, SiteNotFoundException {
    Javacosm.getSite("https://dontcreatethis.microco.sm/");
  }

  @Test
  public void microcosm_has_correct_title() {
    when(microcosm.getTitle()).thenReturn("Javacosm Tests");
    assertEquals("Microcosm name is not as expected", microcosm.getTitle(), microcosms.get(0).getTitle());
  }

  @Test
  public void microcosm_has_correct_id() {
    when(microcosm.getId()).thenReturn(92);
    assertEquals("Microcosm ID is not as expected", microcosm.getId(), microcosms.get(0).getId());
  }

  @Test
  public void microcosm_has_correct_visibility() {
    when(microcosm.getVisibility()).thenReturn("public");
    assertEquals("Microcosm visibility is not as expected", microcosm.getVisibility(), microcosms.get(0).getVisibility());
  }

  @Test
  public void microcosm_has_correct_description() {
    when(microcosm.getDescription()).thenReturn("Used for testing Javacosm");
    assertEquals("Microcosm description is not as expected", microcosm.getDescription(), microcosms.get(0).getDescription());
  }

  @Test
  public void microcosm_most_recent_update_has_correct_microcosm_id() {
    Item item = mock(Item.class);
    when(item.getMicrocosmId()).thenReturn(92);
    when(microcosm.getMostRecentUpdate()).thenReturn(item);
    assertEquals(
        "Microcosm's most recent item doesn't have the correct Microcosm ID",
        microcosm.getMostRecentUpdate().getMicrocosmId(), microcosms
            .get(0).getMostRecentUpdate().getMicrocosmId());
  }

  @Test
  public void microcosm_meta_has_correct_creation_time() {
    Date date = mock(Date.class);
    Microcosm.Meta microcosmMeta = mock(Microcosm.Meta.class);
    when(date.toString()).thenReturn("Thu Jun 27 04:42:19 PDT 2013");
    when(microcosmMeta.getCreated()).thenReturn(date);
    assertEquals("Microcosm has correct creation date in the metadata",
        microcosmMeta.getCreated().toString(), microcosms.get(0)
            .getMeta().getCreated().toString());
  }

  @Test
  public void microcosm_meta_has_correct_creator() {
    User user = mock(User.class);
    Microcosm.Meta microcosmMeta = mock(Microcosm.Meta.class);
    when(user.getId()).thenReturn(105);
    when(microcosmMeta.getCreatedBy()).thenReturn(user);
    assertEquals("Microcosm has correct creator in the metadata",
        microcosmMeta.getCreatedBy().getId(), microcosms.get(0).getMeta().getCreatedBy().getId());
  }

  @Test
  public void microcosm_has_correct_flags() {

  }

  @Test
  public void microcosm_has_correct_links() {

  }
}
