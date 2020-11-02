package eventlisten;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyListener {

	@Async
	@EventListener // 注意此处
	public void handleDemoEvent(MyEvent event)
	{
		System.out.println("发布的data为:{}"+ event.getData());
	}
}