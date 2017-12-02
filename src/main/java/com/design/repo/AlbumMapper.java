package com.design.repo;

import com.design.common.base.BaseMapper;
import com.design.model.Album;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AlbumMapper extends BaseMapper<Album>{
}