package org.example.edushare_qa.Service;

import lombok.extern.slf4j.Slf4j;
import org.example.edushare_qa.Mapper.ResourceMapper;
import org.example.edushare_qa.Pojo.ResourcesParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
public class ResourceServiceImpl implements ResourceService{
    @Autowired
    private ResourceMapper resourceMapper;

    @Override
    public void add(ResourcesParam resourcesParam) {
        resourcesParam.setCreated_at(LocalDateTime.now());
        resourceMapper.add(resourcesParam);
    }
}
