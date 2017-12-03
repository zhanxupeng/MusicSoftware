package com.design.service.impl;

import com.design.domain.album.AlbumCriteria;
import com.design.domain.album.AlbumOut;
import com.design.model.Album;
import com.design.repo.AlbumMapper;
import com.design.service.api.IAlbumService;
import com.design.service.common.BaseDBService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 占大帅 on 2017/12/3.
 */
@Service
public class AlbumService extends BaseDBService<AlbumMapper, Album> implements IAlbumService {
    @Override
    public List<AlbumOut> findList(AlbumCriteria albumCriteria) {
        return getRepo().getByCondition(albumCriteria);
    }
}
