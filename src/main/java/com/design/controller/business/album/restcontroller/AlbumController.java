package com.design.controller.business.album.restcontroller;

import com.design.common.base.Response;
import com.design.controller.base.BaseController;
import com.design.controller.business.album.paramsmodel.AlbumPM;
import com.design.domain.album.AlbumCriteria;
import com.design.domain.album.AlbumOut;
import com.design.service.api.IAlbumService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 占大帅 on 2017/12/3.
 */
@RestController
@RequestMapping("rest/album")
public class AlbumController extends BaseController {
    @Resource
    private IAlbumService albumService;

    @GetMapping("list")
    public Response list(AlbumPM albumPM) {
        AlbumCriteria albumCriteria = new AlbumCriteria();
        albumCriteria.setLanguages(StringUtils.isBlank(albumPM.getLanguages()) ? null : albumPM.getLanguages());
        albumCriteria.setSect(StringUtils.isBlank(albumPM.getSect()) ? null : albumPM.getSect());
        albumCriteria.setCount(albumPM.getCount());
        List<AlbumOut> albumOutList = albumService.findList(albumCriteria);
        return result(albumOutList);
    }

}
