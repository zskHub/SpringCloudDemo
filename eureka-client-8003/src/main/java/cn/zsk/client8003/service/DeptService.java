package cn.zsk.client8003.service;

import cn.zsk.entity.DeptEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author:zsk
 * @CreateTime:2019-06-03 10:56
 */
public interface DeptService extends IService<DeptEntity> {

    @Override
    boolean save(DeptEntity deptEntity);

    void update(DeptEntity deptEntity);

    @Override
    List<DeptEntity> list();
}
