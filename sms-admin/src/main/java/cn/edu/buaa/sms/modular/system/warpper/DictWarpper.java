package cn.edu.buaa.sms.modular.system.warpper;

import cn.edu.buaa.sms.core.common.constant.factory.ConstantFactory;
import cn.edu.buaa.sms.modular.system.model.Dict;
import cn.edu.buaa.sms.core.base.warpper.BaseControllerWarpper;
import cn.edu.buaa.sms.core.util.ToolUtil;

import java.util.List;
import java.util.Map;

/**
 * 字典列表的包装
 *
 */
public class DictWarpper extends BaseControllerWarpper {

    public DictWarpper(Object list) {
        super(list);
    }

    @Override
    public void warpTheMap(Map<String, Object> map) {
        StringBuffer detail = new StringBuffer();
        Integer id = (Integer) map.get("id");
        List<Dict> dicts = ConstantFactory.me().findInDict(id);
        if(dicts != null){
            for (Dict dict : dicts) {
                detail.append(dict.getNum() + ":" +dict.getName() + ",");
            }
            map.put("detail", ToolUtil.removeSuffix(detail.toString(),","));
        }
    }

}
