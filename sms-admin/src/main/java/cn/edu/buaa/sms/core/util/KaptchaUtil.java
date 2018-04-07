package cn.edu.buaa.sms.core.util;

import cn.edu.buaa.sms.config.properties.SmsProperties;

/**
 * 验证码工具类
 */
public class KaptchaUtil {

    /**
     * 获取验证码开关
     */
    public static Boolean getKaptchaOnOff() {
        return SpringContextHolder.getBean(SmsProperties.class).getKaptchaOpen();
    }
}