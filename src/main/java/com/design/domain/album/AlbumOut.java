package com.design.domain.album;

import com.design.common.base.BaseModel;
import com.design.model.Singer;

/**
 * Created by 占大帅 on 2017/12/3.
 */
public class AlbumOut extends BaseModel {
    private String langueges;

    private String sect;

    private Singer singer;

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

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }
}
