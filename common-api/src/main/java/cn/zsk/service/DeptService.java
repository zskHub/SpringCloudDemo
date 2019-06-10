package cn.zsk.service;

import cn.zsk.entity.DeptEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author:zsk
 * @CreateTime:2019-06-10 17:44
 */
@FeignClient(value = "EUREKA-CLIENT-8001")
public interface DeptService {

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    DeptEntity getByDeptId(@PathVariable("deptId") long deptId);

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    List<DeptEntity> list();

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    boolean add(DeptEntity deptEntity);
}
