package com.design.service.impl;

import com.design.common.enumeration.DictionaryTypeEnum;
import com.design.model.Dictionary;
import com.design.repo.DictionaryMapper;
import com.design.service.api.IDictionaryService;
import com.design.service.common.BaseDBService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 占大帅 on 2017/12/3.
 */
@Service
public class DictionaryService extends BaseDBService<DictionaryMapper,Dictionary> implements IDictionaryService{
    @Override
    public List<Dictionary> getSongScene() {
        return getRepo().getByType(DictionaryTypeEnum.SONG_SCENE.getValue());
    }

    @Override
    public List<Dictionary> getSongDistrict() {
        return getRepo().getByType(DictionaryTypeEnum.SONG_DISTRICT.getValue());
    }

    @Override
    public List<Dictionary> getMusicVideoDistrict() {
        return getRepo().getByType(DictionaryTypeEnum.MUSIC_VEDIO_DISTRICT.getValue());
    }

    @Override
    public List<Dictionary> getSingerDistrict() {
        return getRepo().getByType(DictionaryTypeEnum.SINGER_DISTRICT.getValue());
    }

    @Override
    public List<Dictionary> getSingerFirstChar() {
        return getRepo().getByType(DictionaryTypeEnum.SINGER_FIRST_CHAR.getValue());
    }

    @Override
    public List<Dictionary> getAlbumLanguages() {
        return getRepo().getByType(DictionaryTypeEnum.ALBUM_LANGUEGES.getValue());
    }

    @Override
    public List<Dictionary> getAlbumSect() {
        return getRepo().getByType(DictionaryTypeEnum.ALBUM_SECT.getValue());
    }

    @Override
    public List<Dictionary> getSongStyle() {
        return getRepo().getByType(DictionaryTypeEnum.SONG_STYLE.getValue());
    }

    @Override
    public List<Dictionary> getMusicVideoType() {
        return getRepo().getByType(DictionaryTypeEnum.MUSIC_VEDIO_TYPE.getValue());
    }

    @Override
    public List<Dictionary> getMusicVideoYears() {
        return getRepo().getByType(DictionaryTypeEnum.MUSIC_VEDIO_YEARS.getValue());
    }
}
