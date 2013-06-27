package eu.pfweller.javacosm.user;

import java.util.List;

import eu.pfweller.javacosm.Link;

public class User {
  private int id;
  private int userId;
  private String profileName;
  private boolean visible;
  private String gravatar;
  private boolean banned;
  private boolean moderator;
  private boolean admin;
  private Meta meta;

  public class Meta {
    private List<Link> links;

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
   * @return the userId
   */
  public int getUserId() {
    return userId;
  }

  /**
   * @param userId
   *            the userId to set
   */
  public void setUserId(int userId) {
    this.userId = userId;
  }

  /**
   * @return the profileName
   */
  public String getProfileName() {
    return profileName;
  }

  /**
   * @param profileName
   *            the profileName to set
   */
  public void setProfileName(String profileName) {
    this.profileName = profileName;
  }

  /**
   * @return the visible
   */
  public boolean isVisible() {
    return visible;
  }

  /**
   * @param visible
   *            the visible to set
   */
  public void setVisible(boolean visible) {
    this.visible = visible;
  }

  /**
   * @return the gravatar
   */
  public String getGravatar() {
    return gravatar;
  }

  /**
   * @param gravatar
   *            the gravatar to set
   */
  public void setGravatar(String gravatar) {
    this.gravatar = gravatar;
  }

  /**
   * @return the banned
   */
  public boolean isBanned() {
    return banned;
  }

  /**
   * @param banned
   *            the banned to set
   */
  public void setBanned(boolean banned) {
    this.banned = banned;
  }

  /**
   * @return the moderator
   */
  public boolean isModerator() {
    return moderator;
  }

  /**
   * @param moderator
   *            the moderator to set
   */
  public void setModerator(boolean moderator) {
    this.moderator = moderator;
  }

  /**
   * @return the admin
   */
  public boolean isAdmin() {
    return admin;
  }

  /**
   * @param admin
   *            the admin to set
   */
  public void setAdmin(boolean admin) {
    this.admin = admin;
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
