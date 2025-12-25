package org.example.edushare_qa.Mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.example.edushare_qa.Pojo.Classes;

@Mapper
public interface ClassMapper {
    @Insert("insert into classes(title,class_type,description,institute,created_at,updated_at) values(#{title},#{class_type},#{description},#{institute},#{created_at},#{updated_at})")
    void add(Classes clazz);
}
