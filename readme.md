### @Configuration & @Bean给容器中注册组件

#### 一、引入依赖包

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>5.0.2.RELEASE</version>
    </dependency>
</dependencies>
```

#### 二、通过xml方式在容器中注入bean，并获取注入的bean

beans.xml

```xml
<bean id="person" class="cc.jnote.bean.Person">
    <property name="age" value="18"></property>
    <property name="name" value="xiaoming"></property>
</bean>
```

MainTest.class

```java
ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
Person person = (Person) applicationContext.getBean("person");
System.out.println(person);
```

执行结果：

```xml
Person{name='xiaoming', age=18}
```



#### 三、通过注解的方式在容器中注入bean，并获取注入的bean

MainConfig.class

```java
@Configuration //配置类 等同于配置文件beans.xml 告诉spring这是一个配置文件
public class MainConfig {

    @Bean //给容器中注入bean，类型为返回值的类型，id默认用方法名作为id
    public Person person(){
        return new Person("xiaohong",19);
    }
}
```

MainTest.calss

```java
//通过注解的方式注入bean
ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
	Person person = applicationContext.getBean(Person.class);
	System.out.println(person);
```

执行结果：

```xml
Person{name='xiaohong', age=19}
```











### 



