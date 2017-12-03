package com.design.service.api;

import com.design.domain.song.SongOut;
import com.design.model.Song;
import com.design.service.common.IBaseDBService;

import java.util.List;

/**
 * Created by 占大帅 on 2017/12/3.
 */
public interface ISongService extends IBaseDBService<Song> {
    /**
     * 根据场景,限制数量,按人气倒序（歌单推荐）
     */
    List<SongOut> getSceneSong(String scene, Integer count);

    /**
     * 根据歌曲地域,限制数量，按创建时间倒序(新歌首发)
     */
    List<SongOut> getDistrictSong(String district, Integer count);

    /**
     * 限制数量,按人气倒序（排行榜）
     */
    List<SongOut> getPopularitySong(Integer count);

    /**
     * 根据风格，限制数量,按人气倒序（分类歌曲）
     */
    List<SongOut> getStyleSong(String style, Integer count);

}
