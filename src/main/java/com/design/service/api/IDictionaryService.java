package com.design.service.api;

import com.design.model.Dictionary;
import com.design.service.common.IBaseDBService;

import java.util.List;

/**
 * Created by 占大帅 on 2017/12/3.
 */
public interface IDictionaryService extends IBaseDBService<Dictionary>{
    /**
     * 歌曲场景
     */
    List<Dictionary> getSongScene();
    /**
     * 歌曲地域
     */
    List<Dictionary> getSongDistrict();
    /**
     * MV地域
     */
    List<Dictionary> getMusicVideoDistrict();
    /**
     * 歌手地域组合
     */
    List<Dictionary> getSingerDistrict();
    /**
     * 歌手首字母
     */
    List<Dictionary> getSingerFirstChar();
    /**
     * 专辑语种
     */
    List<Dictionary> getAlbumLanguages();
    /**
     * 专辑流派
     */
    List<Dictionary> getAlbumSect();
    /**
     * 歌曲风格
     */
    List<Dictionary> getSongStyle();
    /**
     * MV类型
     */
    List<Dictionary> getMusicVideoType();
    /**
     * MV年份
     */
    List<Dictionary> getMusicVideoYears();
}
