package org.example.edushare_qa.Mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.example.edushare_qa.Pojo.ResourcesParam;

@Mapper
public interface ResourceMapper {
    @Insert("insert into resources(title,description,file_url,file_type,uploader_id,download_count,created_at) values(#{title},#{description},#{file_url},#{file_type},#{uploader_id},#{download_count},#{create_at})")
    void add(ResourcesParam resourcesParam);
}
