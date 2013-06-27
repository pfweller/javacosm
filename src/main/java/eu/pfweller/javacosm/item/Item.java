package eu.pfweller.javacosm.item;

import java.util.Date;
import java.util.List;

import eu.pfweller.javacosm.Flags;
import eu.pfweller.javacosm.Link;
import eu.pfweller.javacosm.user.User;

public class Item {
  private int microcosmId;
  private ItemType itemType;
  private int id;
  private String title;
  private int comments;
  private int views;
  private int lastCommentId;
  private User lastCommentCreatedBy;
  private Date lastCommentCreated;
  private ItemMeta meta;

  public class ItemMeta {
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
   * @return the microcosmId
   */
  public int getMicrocosmId() {
    return microcosmId;
  }

  /**
   * @param microcosmId
   *            the microcosmId to set
   */
  public void setMicrocosmId(int microcosmId) {
    this.microcosmId = microcosmId;
  }

  /**
   * @return the itemType
   */
  public ItemType getItemType() {
    return itemType;
  }

  /**
   * @param itemType
   *            the itemType to set
   */
  public void setItemType(ItemType itemType) {
    this.itemType = itemType;
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
   * @return the comments
   */
  public int getComments() {
    return comments;
  }

  /**
   * @param comments
   *            the comments to set
   */
  public void setComments(int comments) {
    this.comments = comments;
  }

  /**
   * @return the views
   */
  public int getViews() {
    return views;
  }

  /**
   * @param views
   *            the views to set
   */
  public void setViews(int views) {
    this.views = views;
  }

  /**
   * @return the lastCommentId
   */
  public int getLastCommentId() {
    return lastCommentId;
  }

  /**
   * @param lastCommentId
   *            the lastCommentId to set
   */
  public void setLastCommentId(int lastCommentId) {
    this.lastCommentId = lastCommentId;
  }

  /**
   * @return the lastCommentCreatedBy
   */
  public User getLastCommentCreatedBy() {
    return lastCommentCreatedBy;
  }

  /**
   * @param lastCommentCreatedBy
   *            the lastCommentCreatedBy to set
   */
  public void setLastCommentCreatedBy(User lastCommentCreatedBy) {
    this.lastCommentCreatedBy = lastCommentCreatedBy;
  }

  /**
   * @return the lastCommentCreated
   */
  public Date getLastCommentCreated() {
    return lastCommentCreated;
  }

  /**
   * @param lastCommentCreated
   *            the lastCommentCreated to set
   */
  public void setLastCommentCreated(Date lastCommentCreated) {
    this.lastCommentCreated = lastCommentCreated;
  }

  /**
   * @return the meta
   */
  public ItemMeta getMeta() {
    return meta;
  }

  /**
   * @param meta
   *            the meta to set
   */
  public void setMeta(ItemMeta meta) {
    this.meta = meta;
  }
}
