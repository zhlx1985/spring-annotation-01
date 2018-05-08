package cc.jnote.config;

import cc.jnote.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //配置类 等同于配置文件beans.xml 告诉spring这是一个配置文件
public class MainConfig {

    @Bean //给容器中注入bean，类型为返回值的类型，id默认用方法名作为id
    public Person person(){
        return new Person("xiaohong",19);
    }
}
