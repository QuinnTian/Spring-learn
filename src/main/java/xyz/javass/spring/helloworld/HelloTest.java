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
     * @Description ͨ��ID��ȡbean
     */
    @Test
    public void testHelloworld(){
       //1.��ȡ�����ļ�ʵ����һ��IOC����
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:Spring.xml");
       //2.�������л�ȡBean
        HelloApi helloApi = context.getBean("hello",HelloApi.class);
       //3.ִ��ҵ���߼�
        helloApi.sayHello();
    }
    /**
     * 
     * @Description ͨ��ȫ������ȡID
     */
//    @Test
//    public void testHelloworldByClass(){
//        //1.��ȡ�����ļ�ʵ����һ��IOC����
//         BeanFactory beanfactory2 = new ClassPathXmlApplicationContext("classpath:Spring.xml");
//        //2.�������л�ȡBean
//         HelloApi helloApi = beanfactory2.getBean(HelloApi.class);
//        //3.ִ��ҵ���߼�
//         helloApi.sayHello();
//     }
    /**
     * 
     * @Description ͨ�����ƻ�ȡ
     */
    @Test
    public void testHelloworldByname(){
      //1.��ȡ�����ļ�ʵ����һ��IOC����
       BeanFactory beanfactory = new ClassPathXmlApplicationContext("classpath:Spring.xml");
      //2.�������л�ȡBean
       HelloApi helloApi = beanfactory.getBean("hello",HelloApi.class);
      //3.ִ��ҵ���߼�
       helloApi.sayHello();
   }
  @Test
  public void testHelloworldBynameAndID(){
     //1.��ȡ�����ļ�ʵ����һ��IOC����
     BeanFactory beanfactory = new ClassPathXmlApplicationContext("classpath:Spring.xml");
     //ͨ��ID
     HelloApi helloApi = beanfactory.getBean("hello",HelloApi.class);
     helloApi.sayHello();
     //ͨ��Name
     HelloApi helloApi1 = beanfactory.getBean("h1",HelloApi.class);
     helloApi1.sayHello();
     //ͨ�����name
     HelloApi helloApi2 = beanfactory.getBean("h2",HelloApi.class);
     helloApi2.sayHello();
     HelloApi helloApi3 = beanfactory.getBean("h3",HelloApi.class);
     helloApi3.sayHello();
     //��֤ȷʵ3������
     String[] h2Alias = beanfactory.getAliases("h2");
     System.out.println("=======namingbean5.xml bean2 ����========");
     for(String alias : h2Alias) {
         System.out.println(alias);
     }    
     Assert.assertEquals(3, h2Alias.length); 
     //��֤������ID�ظ�
     String[] h6Alias = beanfactory.getAliases("h6");
     //��˱������ܺ�idһ�������һ������IoC��������������ͻ
     System.out.println(h6Alias.length);
     Assert.assertEquals(0, h6Alias.length);

 }
    
    

   

}
