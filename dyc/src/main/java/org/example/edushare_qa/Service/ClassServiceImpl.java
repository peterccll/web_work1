package org.example.edushare_qa.Service;

import lombok.extern.slf4j.Slf4j;
import org.example.edushare_qa.Mapper.ClassMapper;
import org.example.edushare_qa.Pojo.Classes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
@Slf4j
public class ClassServiceImpl implements ClassService{
    @Autowired
    private ClassMapper classMapper;
    @Override
    public void add(Classes clazz) {
        clazz.setCreated_at(LocalDateTime.now());
        classMapper.add(clazz);
    }
}
