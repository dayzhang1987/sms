package cn.edu.buaa.sms.modular.system.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.edu.buaa.sms.modular.system.dao.LoginLogMapper;
import cn.edu.buaa.sms.modular.system.model.LoginLog;
import cn.edu.buaa.sms.modular.system.model.OperationLog;
import cn.edu.buaa.sms.modular.system.service.ILoginLogService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 登录记录 服务实现类
 */
@Service
public class LoginLogServiceImpl extends ServiceImpl<LoginLogMapper, LoginLog> implements ILoginLogService {

    @Override
    public List<Map<String, Object>> getLoginLogs(Page<OperationLog> page, String beginTime, String endTime, String logName, String orderByField, boolean asc) {
        return this.baseMapper.getLoginLogs(page, beginTime, endTime, logName, orderByField, asc);
    }
}
