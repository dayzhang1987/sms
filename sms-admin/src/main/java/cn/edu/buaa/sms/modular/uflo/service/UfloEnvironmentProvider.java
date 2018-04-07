package cn.edu.buaa.sms.modular.uflo.service;

import cn.edu.buaa.sms.core.shiro.ShiroKit;
import cn.edu.buaa.sms.core.shiro.ShiroUser;
import cn.edu.buaa.sms.modular.system.model.User;
import com.bstek.uflo.env.EnvironmentProvider;
import org.hibernate.SessionFactory;
import org.springframework.transaction.PlatformTransactionManager;

public class UfloEnvironmentProvider implements EnvironmentProvider {
    private SessionFactory sessionFactory;
    private PlatformTransactionManager platformTransactionManager;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    /**
     * Sets session factory.
     *
     * @param sessionFactory the session factory
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public PlatformTransactionManager getPlatformTransactionManager() {
        return platformTransactionManager;
    }

    /**
     * Sets platform transaction manager.
     *
     * @param platformTransactionManager the platform transaction manager
     */
    public void setPlatformTransactionManager(
            PlatformTransactionManager platformTransactionManager) {
        this.platformTransactionManager = platformTransactionManager;
    }

    public String getCategoryId() {
        return null;
    }

    /**
     * 返回默认处理人
     * @return
     */
    public String getLoginUser() {
        ShiroUser user = ShiroKit.getUser();
        return user.getName();
    }
}