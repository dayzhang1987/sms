package cn.edu.buaa.sms.config;

import cn.edu.buaa.sms.config.properties.SmsFlowableProperties;
import cn.edu.buaa.sms.core.datasource.DruidProperties;
import com.alibaba.druid.pool.DruidDataSource;
import cn.edu.buaa.sms.core.flowable.SmsDefaultProcessDiagramGenerator;
import org.flowable.spring.SpringAsyncExecutor;
import org.flowable.spring.SpringProcessEngineConfiguration;
import org.flowable.spring.boot.AbstractProcessEngineAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

import java.io.IOException;

/**
 * 工作流配置
 *
 */
@Configuration
public class FlowableConfig extends AbstractProcessEngineAutoConfiguration {

    @Autowired
    DruidProperties druidProperties;

    @Autowired
    SmsFlowableProperties smsFlowableProperties;

    /**
     * flowable单独的数据源
     */
    private DruidDataSource flowableDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        druidProperties.config(dataSource);
        smsFlowableProperties.config(dataSource);
        return dataSource;
    }


    /**
     * spring-flowable拓展配置
     */
    @Bean
    public SpringProcessEngineConfiguration springProcessEngineConfiguration(
            PlatformTransactionManager transactionManager,
            SpringAsyncExecutor springAsyncExecutor) throws IOException {
        SpringProcessEngineConfiguration configuration = this.baseSpringProcessEngineConfiguration(flowableDataSource(), transactionManager, springAsyncExecutor);
        configuration.setActivityFontName("宋体");
        configuration.setLabelFontName("宋体");
        configuration.setProcessDiagramGenerator(new SmsDefaultProcessDiagramGenerator());
        return configuration;
    }
}
