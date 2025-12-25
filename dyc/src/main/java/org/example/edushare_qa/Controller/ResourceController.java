package org.example.edushare_qa.Controller;

import lombok.extern.slf4j.Slf4j;
import org.example.edushare_qa.Pojo.ResourcesParam;
import org.example.edushare_qa.Pojo.Result;
import org.example.edushare_qa.Service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/resource")
@Slf4j
public class ResourceController {
    @Autowired
    private ResourceService resourceService;
    /**上传资源
     * @param ResourcesParam
     */
    @PostMapping("/add")
    public Result upload(@RequestBody ResourcesParam ResourcesParam){
        resourceService.add(ResourcesParam);
        return Result.success();
    }
}
