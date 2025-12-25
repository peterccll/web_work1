package org.example.edushare_qa.Service;

import lombok.extern.slf4j.Slf4j;
import org.example.edushare_qa.Mapper.TeacherMapper;
import org.example.edushare_qa.Pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
public class TeacherServiceImpl implements TeacherService{
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public void add(Teacher teacher) {
        teacher.setCreated_at(LocalDateTime.now());
        teacherMapper.add(teacher);
    }
}
