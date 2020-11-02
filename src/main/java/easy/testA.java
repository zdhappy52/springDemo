package easy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("testA")
//@Import(value = {easy.testC.class})
//@Import(value={easy.testD.class, easy.testC.class})
public class testA   implements myinter {




    public void say() {
        System.out.println("testA");
    }
}