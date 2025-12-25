package org.example.edushare_qa.Controller;

import org.example.edushare_qa.Pojo.Result;
import org.example.edushare_qa.Pojo.Classes;
import org.example.edushare_qa.Service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/class")
public class ClassController {
    @Autowired
    private ClassService classService;

    /**
     * 添加课程
     * @param clazz
     * @return
     */
    @PostMapping("/add")
    public Result Classadd(@RequestBody Classes clazz){
        classService.add(clazz);
        return Result.success();
    }
    /*
     * 查询所有课程
     */
   // @GetMapping("/")
}
