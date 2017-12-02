package com.design.model;

import com.design.common.base.BaseModel;

public class Album extends BaseModel{

    private String langueges;

    private String sect;

    private String songerId;

    private Integer popularity;

    public String getLangueges() {
        return langueges;
    }

    public void setLangueges(String langueges) {
        this.langueges = langueges;
    }

    public String getSect() {
        return sect;
    }

    public void setSect(String sect) {
        this.sect = sect;
    }

    public String getSongerId() {
        return songerId;
    }

    public void setSongerId(String songerId) {
        this.songerId = songerId;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }
}