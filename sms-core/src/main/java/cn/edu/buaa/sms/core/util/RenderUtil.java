package cn.edu.buaa.sms.core.util;

import com.alibaba.fastjson.JSON;
import cn.edu.buaa.sms.core.exception.SmsException;
import cn.edu.buaa.sms.core.exception.SmsExceptionEnum;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 渲染工具类
 */
public class RenderUtil {

    /**
     * 渲染json对象
     */
    public static void renderJson(HttpServletResponse response, Object jsonObject) {
        try {
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            PrintWriter writer = response.getWriter();
            writer.write(JSON.toJSONString(jsonObject));
        } catch (IOException e) {
            throw new SmsException(SmsExceptionEnum.WRITE_ERROR);
        }
    }
}
