package org.example;



import org.example.byConstructor.MessagePrinter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {

    public static void main(String[] args) {

        /*ClassPathXmlApplicationContext 使用XML加载上下文context*/
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        /*获取实例*/
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
