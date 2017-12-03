package com.design.repo;

import com.design.common.base.BaseMapper;
import com.design.domain.singer.SingerCriteria;
import com.design.model.Singer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SingerMapper extends BaseMapper<Singer> {
    /**
     * 按条件查询,按人气倒序
     */
    List<Singer> getByCondition(SingerCriteria singerCriteria);
}