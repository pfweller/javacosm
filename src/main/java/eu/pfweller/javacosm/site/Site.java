package eu.pfweller.javacosm.site;

import java.util.Date;
import java.util.List;

import eu.pfweller.javacosm.Link;
import eu.pfweller.javacosm.LinkNotFoundException;
import eu.pfweller.javacosm.Permissions;
import eu.pfweller.javacosm.user.User;

public class Site {
  private int siteId;
  private String title;
  private String description;
  private String subDomainKey;
  private String domain;
  private User ownedBy;
  private String logoUrl;
  private Meta meta;
  private Permissions permissions;

  /**
   * @return the siteId
   */
  public int getSiteId() {
    return siteId;
  }

  /**
   * @param siteId
   *            the siteId to set
   */
  public void setSiteId(int siteId) {
    this.siteId = siteId;
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
   * @return the subDomainKey
   */
  public String getSubDomainKey() {
    return subDomainKey;
  }

  /**
   * @param subDomainKey
   *            the subDomainKey to set
   */
  public void setSubDomainKey(String subDomainKey) {
    this.subDomainKey = subDomainKey;
  }

  /**
   * @return the domain
   */
  public String getDomain() {
    return domain;
  }

  /**
   * @param domain
   *            the domain to set
   */
  public void setDomain(String domain) {
    this.domain = domain;
  }

  /**
   * @return the ownedBy
   */
  public User getOwnedBy() {
    return ownedBy;
  }

  /**
   * @param ownedBy
   *            the ownedBy to set
   */
  public void setOwnedBy(User ownedBy) {
    this.ownedBy = ownedBy;
  }

  /**
   * @return the logoUrl
   */
  public String getLogoUrl() {
    return logoUrl;
  }

  /**
   * @param logoUrl
   *            the logoUrl to set
   */
  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
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

  /**
   * @return the permissions
   */
  public Permissions getPermissions() {
    return permissions;
  }

  /**
   * @param permissions
   *            the permissions to set
   */
  public void setPermissions(Permissions permissions) {
    this.permissions = permissions;
  }

  public class Meta {
    private Date created;
    private User createdBy;
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

    public Link getLink(String rel) throws LinkNotFoundException {
      for (Link link : getLinks()) {
        if (link.getRel().equals(rel)) {
          return link;
        }
      }

      throw new LinkNotFoundException("Could not find link for: " + rel);
    }
  }
}
