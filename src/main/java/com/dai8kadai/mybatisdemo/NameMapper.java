package com.dai8kadai.mybatisdemo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NameMapper {
    @Select("SELECT * FROM names")
    List<Name> findAll();
}
