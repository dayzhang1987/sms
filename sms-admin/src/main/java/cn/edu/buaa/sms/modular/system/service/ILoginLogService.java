package cn.edu.buaa.sms.modular.system.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import cn.edu.buaa.sms.modular.system.model.LoginLog;
import cn.edu.buaa.sms.modular.system.model.OperationLog;

import java.util.List;
import java.util.Map;

/**
 * 登录记录 服务类
 */
public interface ILoginLogService extends IService<LoginLog> {

    /**
     * 获取登录日志列表
     */
    List<Map<String, Object>> getLoginLogs(Page<OperationLog> page, String beginTime, String endTime, String logName, String orderByField, boolean asc);
}
