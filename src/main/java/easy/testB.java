package easy;


import controlleradvice.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("testB")
public class testB  implements myinter{

    public void say() {
        System.out.println("testB");
    }
}
