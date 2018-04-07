package cn.edu.buaa.sms.modular.system.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.edu.buaa.sms.modular.system.dao.OperationLogMapper;
import cn.edu.buaa.sms.modular.system.model.OperationLog;
import cn.edu.buaa.sms.modular.system.service.IOperationLogService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 操作日志 服务实现类
 */
@Service
public class OperationLogServiceImpl extends ServiceImpl<OperationLogMapper, OperationLog> implements IOperationLogService {

    @Override
    public List<Map<String, Object>> getOperationLogs(Page<OperationLog> page, String beginTime, String endTime, String logName, String s, String orderByField, boolean asc) {
        return this.baseMapper.getOperationLogs(page, beginTime, endTime, logName, s, orderByField, asc);
    }
}
