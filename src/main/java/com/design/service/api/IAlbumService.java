package com.design.service.api;

import com.design.domain.album.AlbumCriteria;
import com.design.domain.album.AlbumOut;
import com.design.model.Album;
import com.design.service.common.IBaseDBService;

import java.util.List;

/**
 * Created by 占大帅 on 2017/12/3.
 */
public interface IAlbumService extends IBaseDBService<Album> {
    /**
     * 条件查找
     */
    List<AlbumOut> findList(AlbumCriteria albumCriteria);
}
