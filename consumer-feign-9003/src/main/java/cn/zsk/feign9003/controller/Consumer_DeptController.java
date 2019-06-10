package cn.zsk.feign9003.controller;

import cn.zsk.entity.DeptEntity;
import cn.zsk.service.DeptService;
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
        /*
        * 三个参数：(url,requestMap,Responson.class)请求地址，请求参数，http响应转换换成对象类型
        * */
        return deptService.add(deptEntity);
    }

    @RequestMapping("getByDeptId")
    public DeptEntity getByDeptId(@PathVariable("deptId") Long deptId){
        return deptService.getByDeptId(deptId);
    }

    @RequestMapping("list")
    public List<DeptEntity> list(){
        return deptService.list();
    }

}
