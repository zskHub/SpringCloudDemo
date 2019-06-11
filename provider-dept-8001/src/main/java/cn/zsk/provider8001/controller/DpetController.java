package cn.zsk.provider8001.controller;

import cn.zsk.entity.DeptEntity;
import cn.zsk.provider8001.service.DeptService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author:zsk
 * @CreateTime:2019-06-03 11:01
 */
@RequestMapping("dept")
@RestController
public class DpetController {
    @Autowired
    private DeptService deptService;

    @PostMapping("/save")
    public boolean save(@RequestBody DeptEntity deptEntity){

        return deptService.save(deptEntity);
    }
    @GetMapping("/getByDeptId/{deptId}")
    public DeptEntity getByDeptId(@PathVariable("deptId") Long deptId){

        return deptService.getById(deptId);
    }

    @GetMapping("/list")
    public List<DeptEntity> list(){

        return deptService.list();
    }
}
