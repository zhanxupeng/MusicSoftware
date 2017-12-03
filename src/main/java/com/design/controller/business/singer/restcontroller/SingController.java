package com.design.controller.business.singer.restcontroller;

import com.design.common.base.Response;
import com.design.controller.base.BaseController;
import com.design.controller.business.singer.paramsmodel.SingerPM;
import com.design.domain.singer.SingerCriteria;
import com.design.model.Singer;
import com.design.service.api.ISingerService;
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
@RequestMapping("rest/singer")
public class SingController extends BaseController {
    @Resource
    private ISingerService singerService;

    /**
     * 按条件查询歌手
     */
    @GetMapping("list")
    public Response list(SingerPM singerPM) {
        SingerCriteria singerCriteria = new SingerCriteria();
        singerCriteria.setDistrict(StringUtils.isBlank(singerPM.getDistrict()) ? null : singerPM.getDistrict());
        singerCriteria.setFirstChar(StringUtils.isBlank(singerPM.getFirstChar()) ? null : singerPM.getFirstChar());
        singerCriteria.setCount(singerPM.getCount());
        List<Singer> singerList = singerService.getCondition(singerCriteria);
        return result(singerList);
    }
}
