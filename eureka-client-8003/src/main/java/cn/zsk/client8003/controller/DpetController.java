package cn.zsk.client8003.controller;

import cn.zsk.client8003.service.DeptService;
import cn.zsk.api.entity.DeptEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
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
    @Autowired
    private DiscoveryClient discoveryClient;

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

    //服务发现
    @RequestMapping(value = "/discovery",method = RequestMethod.GET)
    public Object discovery(){
        List<String> list = discoveryClient.getServices();
        System.out.printf("**************" + list);
        List<ServiceInstance> srvList = discoveryClient.getInstances("eureka-client-8001");
        for(ServiceInstance element:srvList){
            System.out.printf(element.getServiceId() +"\t" + element.getHost() + "\t" + element.getPort() + "\t"
            + element.getUri());
        }
        return this.discoveryClient;
    }
}
