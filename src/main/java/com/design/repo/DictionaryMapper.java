package com.design.repo;

import com.design.common.base.BaseMapper;
import com.design.model.Dictionary;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DictionaryMapper extends BaseMapper<Dictionary>{
    /**
     * 根据类型查找
     */
    List<Dictionary> getByType(@Param("type")String type);
}