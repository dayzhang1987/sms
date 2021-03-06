package cn.edu.buaa.sms.modular.system.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.edu.buaa.sms.core.datascope.DataScope;
import cn.edu.buaa.sms.modular.system.dao.UserMapper;
import cn.edu.buaa.sms.modular.system.model.User;
import cn.edu.buaa.sms.modular.system.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 管理员表 服务实现类
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public int setStatus(Integer userId, int status) {
        return this.baseMapper.setStatus(userId, status);
    }

    @Override
    public int changePwd(Integer userId, String pwd) {
        return this.baseMapper.changePwd(userId, pwd);
    }

    @Override
    public List<Map<String, Object>> selectUsers(DataScope dataScope, String name, String beginTime, String endTime, Integer deptid) {
        return this.baseMapper.selectUsers(dataScope, name, beginTime, endTime, deptid);
    }

    @Override
    public int setRoles(Integer userId, String roleIds) {
        return this.baseMapper.setRoles(userId, roleIds);
    }

    @Override
    public User getByAccount(String account) {
        return this.baseMapper.getByAccount(account);
    }
}
