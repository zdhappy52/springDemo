package easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//创建spring应用上下文
@ContextConfiguration(classes= EventListenorApplication.class)//加载配置类
@ActiveProfiles("testB")

public class  test {

    @Autowired
    private Environment environment;


    private ApplicationContext applicationContext;

    @Autowired
    private  myinter myinter;

    @Test
    public void test(){
        myinter.say();

        System.out.println(environment.getActiveProfiles().toString());


    }
}