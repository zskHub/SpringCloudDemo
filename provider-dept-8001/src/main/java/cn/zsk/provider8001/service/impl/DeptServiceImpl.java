package cn.zsk.provider8001.service.impl;

import cn.zsk.api.entity.DeptEntity;
import cn.zsk.provider8001.dao.DeptDao;
import cn.zsk.provider8001.service.DeptService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:zsk
 * @CreateTime:2019-06-03 10:57
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptDao, DeptEntity> implements DeptService {
    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean save(DeptEntity deptEntity){
        deptEntity.setDbSource("springclouddemo");
        return true;
    }
    @Override
    public void update(DeptEntity deptEntity) {

    }

    @Override
    public List<DeptEntity> list(){
        return deptDao.selectList(new QueryWrapper<DeptEntity>());
    }
}
