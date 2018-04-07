package cn.edu.buaa.sms.modular.flowable.warpper;

import cn.edu.buaa.sms.core.common.constant.state.ExpenseState;
import cn.edu.buaa.sms.core.base.warpper.BaseControllerWarpper;

import java.util.Map;

/**
 * 报销列表的包装
 */
public class ExpenseWarpper extends BaseControllerWarpper {

    public ExpenseWarpper(Object list) {
        super(list);
    }

    @Override
    public void warpTheMap(Map<String, Object> map) {
        Integer state = (Integer) map.get("state");
        map.put("stateName", ExpenseState.valueOf(state));
    }

}
