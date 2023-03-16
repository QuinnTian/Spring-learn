package com.ismeoh.DI.useXml.Beans_Auto_Wiring.ByType;

import com.ismeoh.DI.useXml.Beans_Auto_Wiring.ByName.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor5");
        te.spellCheck();
    }
}
