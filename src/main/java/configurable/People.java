package configurable;

import org.springframework.beans.factory.annotation.Configurable;

import javax.annotation.Resource;

@Configurable
public class People {

    @Resource
    private Student student;

    public void doSomething(){
        student.study();
    }

}
