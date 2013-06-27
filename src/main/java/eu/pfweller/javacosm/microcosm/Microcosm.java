package eu.pfweller.javacosm.microcosm;

import java.util.Date;
import java.util.List;

import eu.pfweller.javacosm.Flags;
import eu.pfweller.javacosm.Link;
import eu.pfweller.javacosm.Moderator;
import eu.pfweller.javacosm.item.Item;
import eu.pfweller.javacosm.user.User;

public class Microcosm {
  private int id;
  private String visibility;
  private String title;
  private String description;
  private List<Moderator> moderators;
  private Item mostRecentUpdate;
  private Meta meta;

  public class Meta {
    private Date created;
    private User createdBy;
    private Flags flags;
    private List<Link> links;

    /**
     * @return the created
     */
    public Date getCreated() {
      return created;
    }

    /**
     * @param created
     *            the created to set
     */
    public void setCreated(Date created) {
      this.created = created;
    }

    /**
     * @return the createdBy
     */
    public User getCreatedBy() {
      return createdBy;
    }

    /**
     * @param createdBy
     *            the createdBy to set
     */
    public void setCreatedBy(User createdBy) {
      this.createdBy = createdBy;
    }

    /**
     * @return the flags
     */
    public Flags getFlags() {
      return flags;
    }

    /**
     * @param flags
     *            the flags to set
     */
    public void setFlags(Flags flags) {
      this.flags = flags;
    }

    /**
     * @return the links
     */
    public List<Link> getLinks() {
      return links;
    }

    /**
     * @param links
     *            the links to set
     */
    public void setLinks(List<Link> links) {
      this.links = links;
    }
  }

  /**
   * @return the id
   */
  public int getId() {
    return id;
  }

  /**
   * @param id
   *            the id to set
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * @return the visibility
   */
  public String getVisibility() {
    return visibility;
  }

  /**
   * @param visibility
   *            the visibility to set
   */
  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

  /**
   * @return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * @param title
   *            the title to set
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * @param description
   *            the description to set
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * @return the moderators
   */
  public List<Moderator> getModerators() {
    return moderators;
  }

  /**
   * @param moderators
   *            the moderators to set
   */
  public void setModerators(List<Moderator> moderators) {
    this.moderators = moderators;
  }

  /**
   * @return the mostRecentUpdate
   */
  public Item getMostRecentUpdate() {
    return mostRecentUpdate;
  }

  /**
   * @param mostRecentUpdate
   *            the mostRecentUpdate to set
   */
  public void setMostRecentUpdate(Item mostRecentUpdate) {
    this.mostRecentUpdate = mostRecentUpdate;
  }

  /**
   * @return the meta
   */
  public Meta getMeta() {
    return meta;
  }

  /**
   * @param meta
   *            the meta to set
   */
  public void setMeta(Meta meta) {
    this.meta = meta;
  }
}
