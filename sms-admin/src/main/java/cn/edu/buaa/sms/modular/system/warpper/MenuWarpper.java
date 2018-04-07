package cn.edu.buaa.sms.modular.system.warpper;

import cn.edu.buaa.sms.core.common.constant.factory.ConstantFactory;
import cn.edu.buaa.sms.core.common.constant.state.IsMenu;
import cn.edu.buaa.sms.core.base.warpper.BaseControllerWarpper;

import java.util.List;
import java.util.Map;

/**
 * 菜单列表的包装类
 *
 */
public class MenuWarpper extends BaseControllerWarpper {

    public MenuWarpper(List<Map<String, Object>> list) {
        super(list);
    }

    @Override
    public void warpTheMap(Map<String, Object> map) {
        map.put("statusName", ConstantFactory.me().getMenuStatusName((Integer) map.get("status")));
        map.put("isMenuName", IsMenu.valueOf((Integer) map.get("ismenu")));
    }

}
