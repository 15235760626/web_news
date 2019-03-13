package com.zr.news.entity;

/**
 * @author :Mr.Xu
 * Date    :2019-3-11
 */
public class NewsType {
    private int typeId;
    private String typeName;

    public NewsType() {
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public NewsType(int typeId, String typeName) {
        this.typeId = typeId;
        this.typeName = typeName;
    }
}
