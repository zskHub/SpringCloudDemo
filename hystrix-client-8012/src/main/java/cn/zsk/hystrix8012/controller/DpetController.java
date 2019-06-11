package cn.zsk.hystrix8012.controller;

import cn.zsk.api.entity.DeptEntity;
import cn.zsk.hystrix8012.service.DeptService;
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
        if(true){
            throw  new RuntimeException("***********模拟异常了************");
        }
        return deptService.list();
    }

}
