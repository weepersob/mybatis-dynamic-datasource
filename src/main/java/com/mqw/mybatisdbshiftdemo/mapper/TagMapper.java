package com.mqw.mybatisdbshiftdemo.mapper;

import com.mqw.mybatisdbshiftdemo.domain.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface TagMapper {
    @Select("select * from tags where id = #{id}")
    Tag getTagById(Long id);
}
