package com.design.controller.business.dictionary.restcontroller;

import com.design.common.base.Response;
import com.design.controller.base.BaseController;
import com.design.controller.business.dictionary.viewmodel.OptionTypeVM;
import com.design.model.Dictionary;
import com.design.service.api.IDictionaryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by 占大帅 on 2017/12/3.
 */
@RestController
@RequestMapping("rest/dictionary")
public class DictionaryController extends BaseController{
    @Resource
    private IDictionaryService dictionaryService;

    /**
     * 歌曲场景
     */
    @GetMapping("songScene")
    public Response getSongScene(){
        List<Dictionary> dictionaryList=dictionaryService.getSongScene();
        return result(getOptionTypeVMList(dictionaryList));
    }

    /**
     * 歌曲地域
     */
    @GetMapping("songDistrict")
    public Response getSongDistrict(){
        List<Dictionary> dictionaryList=dictionaryService.getSongDistrict();
        return result(getOptionTypeVMList(dictionaryList));
    }

    /**
     * MV地域
     */
    @GetMapping("musicVideoDistrict")
    public Response getMusicVideoDistrict(){
        List<Dictionary> dictionaryList=dictionaryService.getMusicVideoDistrict();
        return result(getOptionTypeVMList(dictionaryList));
    }

    /**
     * 歌手地域组合
     */
    @GetMapping("singerDistrict")
    public Response getSingerDistrict(){
        List<Dictionary> dictionaryList=dictionaryService.getSingerDistrict();
        return result(getOptionTypeVMList(dictionaryList));
    }

    /**
     * 歌手首字母
     */
    @GetMapping("singerFirstChar")
    public Response getSingerFirstChar(){
        List<Dictionary> dictionaryList=dictionaryService.getSingerFirstChar();
        return result(getOptionTypeVMList(dictionaryList));
    }

    /**
     * 专辑语种
     */
    @GetMapping("albumLanguages")
    public Response getAlbumLanguages(){
        List<Dictionary> dictionaryList=dictionaryService.getAlbumLanguages();
        return result(getOptionTypeVMList(dictionaryList));
    }

    /**
     * 专辑流派
     */
    @GetMapping("albumSect")
    public Response getAlbumSect(){
        List<Dictionary> dictionaryList=dictionaryService.getAlbumSect();
        return result(getOptionTypeVMList(dictionaryList));
    }

    /**
     * 歌曲风格
     */
    @GetMapping("songStyle")
    public Response getSongStyle(){
        List<Dictionary> dictionaryList=dictionaryService.getSongStyle();
        return result(getOptionTypeVMList(dictionaryList));
    }

    /**
     * MV类型
     */
    @GetMapping("musicVideoType")
    public Response getMusicVideoType(){
        List<Dictionary> dictionaryList=dictionaryService.getMusicVideoType();
        return result(getOptionTypeVMList(dictionaryList));
    }

    /**
     * MV年份
     */
    @GetMapping("musicVideoYears")
    public Response getMusicVideoYears(){
        List<Dictionary> dictionaryList=dictionaryService.getMusicVideoYears();
        return result(getOptionTypeVMList(dictionaryList));
    }

    private List<OptionTypeVM> getOptionTypeVMList(List<Dictionary> dictionaryList){
        return dictionaryList.stream().map(x->{
            OptionTypeVM optionTypeVM=new OptionTypeVM();
            optionTypeVM.setKey(x.getKey());
            optionTypeVM.setLabel(x.getLabel());
            return optionTypeVM;
        }).collect(Collectors.toList());
    }
}
