
package guru.springframework.spring5webapp.diWithAndWihoutSpring.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {

//1
    public LifeCycleDemoBean() {
        System.out.println("## I'm in the LifeCycleBean Constructor");
        
    }

    
//    DisposableBean
    @Override
    public void destroy() throws Exception {
        System.out.println("## The Lifecycle bean has been terminated");

    }

//    6
//    InitializingBean
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The LifeCycleBean has its properties set!");

    }

//    3
//    BeanFactoryAware
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean Factory has been set");
    }

//    2
//    BeanNameAware
    @Override
    public void setBeanName(String name) {
        System.out.println("## My Bean Name is: " + name);

    }

//    4
//    ApplicationContextAware
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Application context has been set");
    }
    
//    5
    @PostConstruct
    public void postConstruct(){
        System.out.println("## The Post Construct annotated method has been called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## The Predestroy annotated method has been called");
    }

    
//    4.1 Called From CustomBeanPostProcessor
    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    
//    4.2 Called From CustomBeanPostProcessor
    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }
}




//## I'm in the LifeCycleBean Constructor
//## My Bean Name is: lifeCycleDemoBean
//## Bean Factory has been set
//## Application context has been set
//## The Post Construct annotated method has been called
//## The LifeCycleBean has its properties set!
