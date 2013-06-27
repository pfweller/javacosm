package eu.pfweller.javacosm;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import eu.pfweller.javacosm.item.Item;
import eu.pfweller.javacosm.microcosm.Microcosm;
import eu.pfweller.javacosm.user.User;

public class JavacosmTest {
  private static List<Microcosm> microcosms;
  private Microcosm microcosm;

  @BeforeClass
  public static void get_microcosms() {
    System.setProperty("javacosm.get.microcosms", "http://www.mocky.io/v2/5186c569cf096b8c025cb3b1");
    microcosms = Javacosm.getMicrocosms();
  }

  @Before
  public void create_mocked_microcosm() {
    microcosm = mock(Microcosm.class);
  }

  @Test
  public void microcosm_has_correct_title() {
    when(microcosm.getTitle()).thenReturn("General Chit-Chat");
    assertEquals("Microcosm name is not as expected", microcosm.getTitle(), microcosms.get(0).getTitle());
  }
  
  @Test
  public void microcosm_has_correct_id() {
    when(microcosm.getId()).thenReturn(1);
    assertEquals("Microcosm ID is not as expected", microcosm.getId(), microcosms.get(0).getId());
  }

  @Test
  public void microcosm_has_correct_visibility() {
    when(microcosm.getVisibility()).thenReturn("public");
    assertEquals("Microcosm visibility is not as expected", microcosm.getVisibility(), microcosms.get(0).getVisibility());
  }

  @Test
  public void microcosm_has_correct_description() {
    when(microcosm.getDescription()).thenReturn("A place to talk about anything and everything.");
    assertEquals("Microcosm description is not as expected", microcosm.getDescription(), microcosms.get(0).getDescription());
  }

  @Test
  public void microcosm_most_recent_update_has_correct_microcosm_id() {
    Item item = mock(Item.class);
    when(item.getMicrocosmId()).thenReturn(1);
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
    when(date.toString()).thenReturn("Thu Apr 11 17:22:14 UTC 2013");
    when(microcosmMeta.getCreated()).thenReturn(date);
    assertEquals("Microcosm has correct creation date in the metadata",
        microcosmMeta.getCreated().toString(), microcosms.get(0)
            .getMeta().getCreated().toString());
  }

  @Test
  public void microcosm_meta_has_correct_creator() {
    User user = mock(User.class);
    Microcosm.Meta microcosmMeta = mock(Microcosm.Meta.class);
    when(user.getId()).thenReturn(1);
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
