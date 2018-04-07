package cn.edu.buaa.sms;

import com.bstek.uflo.console.UfloServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import sun.misc.Contended;

/**
 * SpringBoot方式启动类
 */
@SpringBootApplication
@ImportResource("classpath:content.xml")
public class SmsApplication {

    private final static Logger logger = LoggerFactory.getLogger(SmsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SmsApplication.class, args);
        logger.info("SmsApplication is success!");
    }

    @Bean("ufloServlet")
    public ServletRegistrationBean buildUfloServlet(){
        return new ServletRegistrationBean(new UfloServlet(), "/uflo/*");
    }

}
