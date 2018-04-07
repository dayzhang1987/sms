package cn.edu.buaa.sms.modular.system.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import cn.edu.buaa.sms.modular.system.model.LoginLog;
import cn.edu.buaa.sms.modular.system.model.OperationLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 登录记录 Mapper 接口
 */
public interface LoginLogMapper extends BaseMapper<LoginLog> {

    /**
     * 获取登录日志
     */
    List<Map<String, Object>> getLoginLogs(@Param("page") Page<OperationLog> page, @Param("beginTime") String beginTime, @Param("endTime") String endTime, @Param("logName") String logName, @Param("orderByField") String orderByField, @Param("isAsc") boolean isAsc);

}