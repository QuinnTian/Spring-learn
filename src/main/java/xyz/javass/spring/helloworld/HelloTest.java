package xyz.javass.spring.helloworld;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class HelloTest {
    /**
     * 
     * @Description 通过ID获取bean
     */
    @Test
    public void testHelloworld(){
       //1.读取配置文件实例化一个IOC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:Spring.xml");
       //2.从容器中获取Bean
        HelloApi helloApi = context.getBean("hello",HelloApi.class);
       //3.执行业务逻辑
        helloApi.sayHello();
    }
    /**
     * 
     * @Description 通过全类名获取ID
     */
//    @Test
//    public void testHelloworldByClass(){
//        //1.读取配置文件实例化一个IOC容器
//         BeanFactory beanfactory2 = new ClassPathXmlApplicationContext("classpath:Spring.xml");
//        //2.从容器中获取Bean
//         HelloApi helloApi = beanfactory2.getBean(HelloApi.class);
//        //3.执行业务逻辑
//         helloApi.sayHello();
//     }
    /**
     * 
     * @Description 通过名称获取
     */
    @Test
    public void testHelloworldByname(){
      //1.读取配置文件实例化一个IOC容器
       BeanFactory beanfactory = new ClassPathXmlApplicationContext("classpath:Spring.xml");
      //2.从容器中获取Bean
       HelloApi helloApi = beanfactory.getBean("hello",HelloApi.class);
      //3.执行业务逻辑
       helloApi.sayHello();
   }
  @Test
  public void testHelloworldBynameAndID(){
     //1.读取配置文件实例化一个IOC容器
     BeanFactory beanfactory = new ClassPathXmlApplicationContext("classpath:Spring.xml");
     //通过ID
     HelloApi helloApi = beanfactory.getBean("hello",HelloApi.class);
     helloApi.sayHello();
     //通过Name
     HelloApi helloApi1 = beanfactory.getBean("h1",HelloApi.class);
     helloApi1.sayHello();
     //通过多个name
     HelloApi helloApi2 = beanfactory.getBean("h2",HelloApi.class);
     helloApi2.sayHello();
     HelloApi helloApi3 = beanfactory.getBean("h3",HelloApi.class);
     helloApi3.sayHello();
     //验证确实3个别名
     String[] h2Alias = beanfactory.getAliases("h2");
     System.out.println("=======namingbean5.xml bean2 别名========");
     for(String alias : h2Alias) {
         System.out.println(alias);
     }    
     Assert.assertEquals(3, h2Alias.length); 
     //验证别名和ID重复
     String[] h6Alias = beanfactory.getAliases("h6");
     //因此别名不能和id一样，如果一样则由IoC容器负责消除冲突
     System.out.println(h6Alias.length);
     Assert.assertEquals(0, h6Alias.length);

 }
    
    

   

}
