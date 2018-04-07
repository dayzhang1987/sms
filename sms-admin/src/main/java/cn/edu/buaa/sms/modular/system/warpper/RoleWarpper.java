package cn.edu.buaa.sms.modular.system.warpper;

import cn.edu.buaa.sms.core.common.constant.factory.ConstantFactory;
import cn.edu.buaa.sms.core.base.warpper.BaseControllerWarpper;

import java.util.List;
import java.util.Map;

/**
 * 角色列表的包装类
 *
 */
public class RoleWarpper extends BaseControllerWarpper {

    public RoleWarpper(List<Map<String, Object>> list) {
        super(list);
    }

    @Override
    public void warpTheMap(Map<String, Object> map) {
        map.put("pName", ConstantFactory.me().getSingleRoleName((Integer) map.get("pid")));
        map.put("deptName", ConstantFactory.me().getDeptName((Integer) map.get("deptid")));
    }

}
