package com.design.controller.business.song.restcontroller;

import com.design.common.base.Response;
import com.design.controller.base.BaseController;
import com.design.controller.business.song.paramsmodel.SongCriteriaPM;
import com.design.domain.song.SongOut;
import com.design.service.api.ISongService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 占大帅 on 2017/12/3.
 */
@RestController
@RequestMapping("rest/song")
public class SongController extends BaseController {
    @Resource
    private ISongService songService;

    /**
     * 歌单推荐
     */
    @GetMapping("recommend")
    public Response getRecommend(SongCriteriaPM songCriteriaPM) {
        List<SongOut> songList = songService.getSceneSong(songCriteriaPM.getScene(), songCriteriaPM.getCount());
        return result(songList);
    }

    /**
     * 新歌首发
     */
    @GetMapping("firstIssue")
    public Response getFirstIssue(SongCriteriaPM songCriteriaPM) {
        List<SongOut> songList = songService.getDistrictSong(songCriteriaPM.getDistrict(), songCriteriaPM.getCount());
        return result(songList);
    }

    /**
     * 排行榜
     */
    @GetMapping("popularity")
    public Response getPopularity(SongCriteriaPM songCriteriaPM) {
        List<SongOut> songList = songService.getPopularitySong(songCriteriaPM.getCount());
        return result(songList);
    }

    /**
     * 分类歌曲
     */
    @GetMapping("style")
    public Response getStyleSong(SongCriteriaPM songCriteriaPM) {
        List<SongOut> songList = songService.getStyleSong(songCriteriaPM.getStyle(), songCriteriaPM.getCount());
        return result(songList);
    }
}
