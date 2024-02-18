package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresAvecSpringXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        IMetier metier = (IMetier) context.getBean(IMetier.class);
        IMetier metier = (IMetier) context.getBean("metier");
        System.out.println("RES = "+metier.calcul());
    }
}
