package eventlisten;

import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.logging.Logger;


@RunWith(value = SpringJUnit4ClassRunner.class)
@SpringBootTest
@EnableAsync
public class ListenerTest implements ApplicationContextAware {

	private ApplicationContext context = null;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
	}

	@Test
	public void listener() {
		context.publishEvent(new MyEvent(this, "测试"));
	}

}