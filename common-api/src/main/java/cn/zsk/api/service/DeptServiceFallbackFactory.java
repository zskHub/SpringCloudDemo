package cn.zsk.api.service;

import cn.zsk.api.entity.DeptEntity;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:zsk
 * @CreateTime:2019-06-11 14:09
 */
@Component
public class DeptServiceFallbackFactory implements FallbackFactory<DeptService> {

    @Override
    public DeptService create(Throwable throwable) {
        return new DeptService() {
            @Override
            public DeptEntity getByDeptId(long deptId) {
                DeptEntity deptEntity = new DeptEntity();
                deptEntity.setDeptNo(0L).setDeptName("异常了，服务降级返回的假的信息").setDbSource("hystrix");
                return deptEntity;
            }

            @Override
            public List<DeptEntity> list() {
                DeptEntity deptEntity = new DeptEntity();
                deptEntity.setDeptNo(0L).setDeptName("异常了，服务降级返回的假的信息").setDbSource("hystrix");
                List<DeptEntity> deptEntityList = new ArrayList<>();
                deptEntityList.add(deptEntity);
                return deptEntityList;
            }

            @Override
            public boolean add(DeptEntity deptEntity) {
                return false;
            }
        };
    }
}
