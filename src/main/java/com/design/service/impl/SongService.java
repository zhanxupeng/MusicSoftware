package com.design.service.impl;

import com.design.domain.song.SongCriteria;
import com.design.domain.song.SongOut;
import com.design.model.Song;
import com.design.repo.SongMapper;
import com.design.service.api.ISongService;
import com.design.service.common.BaseDBService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 占大帅 on 2017/12/3.
 */
@Service
public class SongService extends BaseDBService<SongMapper, Song> implements ISongService {
    @Override
    public List<SongOut> getSceneSong(String scene, Integer count) {
        SongCriteria songCriteria = new SongCriteria();
        songCriteria.setScene(scene);
        songCriteria.setCount(count);
        return getRepo().getByConditionAndPopularity(songCriteria);
    }

    @Override
    public List<SongOut> getDistrictSong(String district, Integer count) {
        SongCriteria songCriteria = new SongCriteria();
        songCriteria.setDistrict(district);
        songCriteria.setCount(count);
        return getRepo().getByConditionAndCreateDate(songCriteria);
    }

    @Override
    public List<SongOut> getPopularitySong(Integer count) {
        SongCriteria songCriteria = new SongCriteria();
        songCriteria.setCount(count);
        return getRepo().getByConditionAndPopularity(songCriteria);
    }

    @Override
    public List<SongOut> getStyleSong(String style, Integer count) {
        SongCriteria songCriteria = new SongCriteria();
        songCriteria.setStyle(style);
        songCriteria.setCount(count);
        return getRepo().getByConditionAndPopularity(songCriteria);
    }
}
