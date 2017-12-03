package com.design.repo;

import com.design.common.base.BaseMapper;
import com.design.domain.song.SongCriteria;
import com.design.domain.song.SongOut;
import com.design.model.Song;

import java.util.List;

public interface SongMapper extends BaseMapper<Song> {
    /**
     * 根据不同类型参数，限制条数查询,并按人气倒序
     */
    List<SongOut> getByConditionAndPopularity(SongCriteria songCriteria);

    /**
     * 根据不同类型参数，限制条数查询,并按时间倒序
     */
    List<SongOut> getByConditionAndCreateDate(SongCriteria songCriteria);
}