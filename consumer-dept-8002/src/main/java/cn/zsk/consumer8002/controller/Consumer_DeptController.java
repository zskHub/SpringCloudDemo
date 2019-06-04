package cn.zsk.consumer8002.controller;

import cn.zsk.entity.DeptEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author:zsk
 * @CreateTime:2019-06-03 11:31
 */
@RestController
@RequestMapping("consumer/dept")
public class Consumer_DeptController {
    private static final String REST_URL_PERFIX = "http://localhost:8001";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("save")
    public boolean save(DeptEntity deptEntity){
        /*
        * 三个参数：(url,requestMap,Responson.class)请求地址，请求参数，http响应转换换成对象类型
        * */
        return restTemplate.postForObject(REST_URL_PERFIX+"/dept/save",deptEntity,Boolean.class);
    }

    @RequestMapping("getByDeptId")
    public DeptEntity getByDeptId(@PathVariable("deptId") Long deptId){
        return restTemplate.getForObject(REST_URL_PERFIX+"/dept/getByDeptId/"+deptId,DeptEntity.class);
    }

    @RequestMapping("list")
    public List<DeptEntity> list(){
        return restTemplate.getForObject(REST_URL_PERFIX+"/dept/list",List.class);
    }

}
