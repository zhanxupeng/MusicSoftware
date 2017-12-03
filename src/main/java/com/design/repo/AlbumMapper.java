package com.design.repo;

import com.design.common.base.BaseMapper;
import com.design.domain.album.AlbumCriteria;
import com.design.domain.album.AlbumOut;
import com.design.model.Album;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AlbumMapper extends BaseMapper<Album> {
    /**
     * 条件查询
     */
    List<AlbumOut> getByCondition(AlbumCriteria albumCriteria);
}