package com.zr.news.entity;

import java.util.Date;

/**
 * @author :Mr.Xu
 * Date    :2019-3-11
 */
public class News {

    private int newsId;
    private String title;
    private String context;
    private String auther;
    private int pyteId;
    private Date pubishDate;
    private int isImage;
    private String imageUrl;
    private int click;
    private int isHot;

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public int getPyteId() {
        return pyteId;
    }

    public void setPyteId(int pyteId) {
        this.pyteId = pyteId;
    }

    public Date getPubishDate() {
        return pubishDate;
    }

    public void setPubishDate(Date pubishDate) {
        this.pubishDate = pubishDate;
    }

    public int getIsImage() {
        return isImage;
    }

    public void setIsImage(int isImage) {
        this.isImage = isImage;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getClick() {
        return click;
    }

    public void setClick(int click) {
        this.click = click;
    }

    public int getIsHot() {
        return isHot;
    }

    public void setIsHot(int isHot) {
        this.isHot = isHot;
    }

    public News() {
    }

    public News(int newsId, String title, String context, String auther, int pyteId, Date pubishDate, int isImage, String imageUrl, int click, int isHot) {
        this.newsId = newsId;
        this.title = title;
        this.context = context;
        this.auther = auther;
        this.pyteId = pyteId;
        this.pubishDate = pubishDate;
        this.isImage = isImage;
        this.imageUrl = imageUrl;
        this.click = click;
        this.isHot = isHot;
    }
}
