package cn.zsk.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author:zsk
 * @CreateTime:2019-05-27 10:50
 */
@Data
@Accessors(chain = true)
@TableName("dept")
public class DeptEntity {

    // 主键
    @TableId
    private Long deptNo;

    // 部门名称
    private String 	deptName;

    //判断来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
    private String 	dbSource;

    public DeptEntity(String deptName)
    {
        super();
        this.deptName = deptName;
    }
}
