package cn.edu.buaa.sms.core.util;

import cn.edu.buaa.sms.core.common.constant.Const;
import cn.edu.buaa.sms.config.properties.SmsProperties;
import cn.edu.buaa.sms.core.node.MenuNode;

import java.util.ArrayList;
import java.util.List;

/**
 * api接口文档显示过滤
 *
 */
public class ApiMenuFilter extends MenuNode {

    public static List<MenuNode> build(List<MenuNode> nodes) {

        //如果关闭了接口文档,则不显示接口文档菜单
        SmsProperties smsProperties = SpringContextHolder.getBean(SmsProperties.class);
        if (!smsProperties.getSwaggerOpen()) {
            List<MenuNode> menuNodesCopy = new ArrayList<>();
            for (MenuNode menuNode : nodes) {
                if (Const.API_MENU_NAME.equals(menuNode.getName())) {
                    continue;
                } else {
                    menuNodesCopy.add(menuNode);
                }
            }
            nodes = menuNodesCopy;
        }

        return nodes;
    }
}
