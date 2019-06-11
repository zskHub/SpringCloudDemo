package cn.zsk.consume9004.controller;

import cn.zsk.api.entity.DeptEntity;
import cn.zsk.api.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author:zsk
 * @CreateTime:2019-06-03 11:31
 */
@RestController
@RequestMapping("consumer/dept")
public class Consumer_DeptController {
   @Autowired
   private DeptService deptService;

    @RequestMapping("save")
    public boolean save(DeptEntity deptEntity){
        return deptService.add(deptEntity);
    }

    @RequestMapping("getByDeptId/{deptId}")
    public DeptEntity getByDeptId(@PathVariable("deptId") Long deptId){
        return deptService.getByDeptId(deptId);
    }

    @RequestMapping("list")
    public List<DeptEntity> list(){
        return deptService.list();
    }

}
