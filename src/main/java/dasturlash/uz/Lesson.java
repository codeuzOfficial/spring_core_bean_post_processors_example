package dasturlash.uz;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Lesson implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeforeInitialization : " + beanName);
        return bean;  // buyerda hohlagan boshga bir ob'ektni retunr qilish mumkun.
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("AfterInitialization : " + beanName);
        return bean;  // buyerda hohlagan boshga bir ob'ektni retunr qilish mumkun.
    }
}
