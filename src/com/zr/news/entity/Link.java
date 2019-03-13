package com.zr.news.entity;

/**
 * @author :Mr.Xu
 * Date    :2019-3-11
 */
public class Link {

    private int linkId;
    private String linkName;
    private String emil;
    private String linkUrl;
    private int linkOrder;

    public int getLinkId() {
        return linkId;
    }

    public void setLinkId(int linkId) {
        this.linkId = linkId;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public String getEmil() {
        return emil;
    }

    public void setEmil(String emil) {
        this.emil = emil;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public int getLinkOrder() {
        return linkOrder;
    }

    public void setLinkOrder(int linkOrder) {
        this.linkOrder = linkOrder;
    }

    public Link() {
    }

    public Link(int linkId, String linkName, String emil, String linkUrl, int linkOrder) {
        this.linkId = linkId;
        this.linkName = linkName;
        this.emil = emil;
        this.linkUrl = linkUrl;
        this.linkOrder = linkOrder;
    }
}
