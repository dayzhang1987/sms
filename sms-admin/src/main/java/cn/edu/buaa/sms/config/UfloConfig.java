package cn.edu.buaa.sms.config;

import cn.edu.buaa.sms.config.properties.SmsUfloProperties;
import cn.edu.buaa.sms.core.datasource.DruidProperties;
import cn.edu.buaa.sms.modular.uflo.service.UfloEnvironmentProvider;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import java.io.IOException;
import java.util.Properties;

/**
 * 工作流配置
 *
 */
@Configuration
@EntityScan("com.bstek.uflo.model")
public class UfloConfig {

    @Autowired
    DruidProperties druidProperties;

    @Autowired
    SmsUfloProperties smsUfloProperties;

    public DruidDataSource ufloDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        druidProperties.config(dataSource);
        smsUfloProperties.config(dataSource);
        return dataSource;
    }

    @Bean("ufloFactory")
    public LocalSessionFactoryBean ufloFactory(){
        Properties pro = new Properties();
        pro.setProperty("hibernate.show_sql","true");
        pro.setProperty("hibernate.hbm2ddl.auto", "update");
        LocalSessionFactoryBean localSessionFactory = new LocalSessionFactoryBean();
        localSessionFactory.setDataSource(ufloDataSource());
        localSessionFactory.setPackagesToScan("com.bstek.uflo.model*");
        localSessionFactory.setHibernateProperties(pro);
        return  localSessionFactory;

    }

    @Bean("ufloTransactionManagera")
    public HibernateTransactionManager ufloTransactionManagera() {
        HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
        hibernateTransactionManager.setSessionFactory(ufloFactory().getObject());
        return hibernateTransactionManager;
    }

}
