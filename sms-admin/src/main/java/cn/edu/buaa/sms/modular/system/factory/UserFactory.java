package cn.edu.buaa.sms.modular.system.factory;

import cn.edu.buaa.sms.modular.system.transfer.UserDto;
import cn.edu.buaa.sms.modular.system.model.User;
import org.springframework.beans.BeanUtils;

/**
 * 用户创建工厂
 *
 */
public class UserFactory {

    public static User createUser(UserDto userDto){
        if(userDto == null){
            return null;
        }else{
            User user = new User();
            BeanUtils.copyProperties(userDto,user);
            return user;
        }
    }
}
