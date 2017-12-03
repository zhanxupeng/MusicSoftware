package com.design.service.impl;

import com.design.domain.singer.SingerCriteria;
import com.design.model.Singer;
import com.design.repo.SingerMapper;
import com.design.service.api.ISingerService;
import com.design.service.common.BaseDBService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 占大帅 on 2017/12/3.
 */
@Service
public class SingerService extends BaseDBService<SingerMapper, Singer> implements ISingerService {
    @Override
    public List<Singer> getCondition(SingerCriteria singerCriteria) {
        return getRepo().getByCondition(singerCriteria);
    }
}
