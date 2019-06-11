package cn.zsk.client8011.controller;

import cn.zsk.client8011.service.DeptService;
import cn.zsk.entity.DeptEntity;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    //一旦调用服务失败，并抛出错误信息，会自动调动processHystrix_GetList方法
    @HystrixCommand(fallbackMethod = "processHystrix_List")
    public List<DeptEntity> list(){
        if(true){
            throw  new RuntimeException("***********模拟异常了************");
        }
        return deptService.list();
    }

   public List<DeptEntity> processHystrix_List(){
        DeptEntity deptEntity = new DeptEntity();
        deptEntity.setDeptNo(0L).setDeptName("异常了，这个是熔断器返回的假的信息").setDbSource("hystrix");
        List<DeptEntity> deptEntityList = new ArrayList<>();
        deptEntityList.add(deptEntity);
        return deptEntityList;
   }
}
