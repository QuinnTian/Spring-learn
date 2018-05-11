package xyz.javass.spring.helloworld;
/**
 * 
 * @ClassName HelloImpl
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author Quinntian
 * @Date 2018年5月11日 下午5:02:37
 * @version 1.0.0
 */
public class HelloImpl implements HelloApi {

    @Override
    public void sayHello() {
        // TODO Auto-generated method stub
            System.out.println("Hello World");
    }

}
