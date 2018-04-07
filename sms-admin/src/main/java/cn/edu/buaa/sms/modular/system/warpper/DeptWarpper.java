package cn.edu.buaa.sms.modular.system.warpper;

import cn.edu.buaa.sms.core.common.constant.factory.ConstantFactory;
import cn.edu.buaa.sms.core.base.warpper.BaseControllerWarpper;
import cn.edu.buaa.sms.core.util.ToolUtil;

import java.util.Map;

/**
 * 部门列表的包装
 *
 */
public class DeptWarpper extends BaseControllerWarpper {

    public DeptWarpper(Object list) {
        super(list);
    }

    @Override
    public void warpTheMap(Map<String, Object> map) {

        Integer pid = (Integer) map.get("pid");

        if (ToolUtil.isEmpty(pid) || pid.equals(0)) {
            map.put("pName", "--");
        } else {
            map.put("pName", ConstantFactory.me().getDeptName(pid));
        }
    }

}
