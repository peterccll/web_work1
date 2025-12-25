package org.example.edushare_qa.Mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.example.edushare_qa.Pojo.Teacher;

@Mapper
public interface TeacherMapper {
    @Insert("insert into teachers(name,username,email,password,phonenumber,introduction,created_at) values(#{name},#{username},#{email},#{password},#{phonenumber},#{title},#{created_at})")
    void add(Teacher teacher);
}
