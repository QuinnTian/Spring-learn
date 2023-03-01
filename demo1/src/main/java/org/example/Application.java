package org.example;



import org.example.byConstructor.MessagePrinter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan// 该注解会自动扫描包下所有@Componet@Service@Respository@Controller所有类注册成Bean
public class Application {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        /*ClassPathXmlApplicationContext 使用XML加载上下文context*/
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        /*获取实例*/
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
