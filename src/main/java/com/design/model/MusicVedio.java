package com.design.model;

import com.design.common.base.BaseModel;

public class MusicVedio extends BaseModel{
    private String district;

    private String type;

    private String years;

    private String songerId;

    private String headPicture;

    private String srcUrl;

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public String getSongerId() {
        return songerId;
    }

    public void setSongerId(String songerId) {
        this.songerId = songerId;
    }

    public String getHeadPicture() {
        return headPicture;
    }

    public void setHeadPicture(String headPicture) {
        this.headPicture = headPicture;
    }

    public String getSrcUrl() {
        return srcUrl;
    }

    public void setSrcUrl(String srcUrl) {
        this.srcUrl = srcUrl;
    }
}