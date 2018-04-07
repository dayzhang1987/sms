package cn.edu.buaa.sms.modular.system.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import cn.edu.buaa.sms.core.node.ZTreeNode;
import cn.edu.buaa.sms.modular.system.model.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 部门表 Mapper 接口
 */
public interface DeptMapper extends BaseMapper<Dept> {

    /**
     * 获取ztree的节点列表
     */
    List<ZTreeNode> tree();

    /**
     * 获取所有部门列表
     */
    List<Map<String, Object>> list(@Param("condition") String condition);

}