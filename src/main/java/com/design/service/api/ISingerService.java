package com.design.service.api;

import com.design.domain.singer.SingerCriteria;
import com.design.model.Singer;
import com.design.service.common.IBaseDBService;

import java.util.List;

/**
 * Created by 占大帅 on 2017/12/3.
 */
public interface ISingerService extends IBaseDBService<Singer> {
    /**
     * 根据条件获取歌手
     */
    List<Singer> getCondition(SingerCriteria singerCriteria);
}
