package com.design.common.enumeration;

/**
 * Created by 占大帅 on 2017/12/3.
 */
public enum DictionaryTypeEnum {
    ALBUM_LANGUEGES("album_languages","专辑语种"),
    ALBUM_SECT("album_sect","专辑流派"),
    SONG_SCENE("song_scene","歌曲场景"),
    SONG_DISTRICT("song_district","歌曲地域"),
    SONG_STYLE("song_style","歌曲风格"),
    SONGER_DISTRICT("singer_district","歌手地域组合形式"),
    SONGER_FIRST_CHAR("singer_first_char","歌手首字母"),
    MUSIC_VEDIO_DISTRICT("music_video_district","MV地域"),
    MUSIC_VEDIO_TYPE("music_video_type","MV类型"),
    MUSIC_VEDIO_YEARS("music_video_years","MV年份");
    private String value;
    private String description;
    DictionaryTypeEnum(String value,String description){
        this.value=value;
        this.description=description;
    }

    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
