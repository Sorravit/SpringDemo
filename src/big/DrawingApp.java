package big;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String[] args) {
//        @SuppressWarnings("deprecation")
//        For this to work the file must be in SpringDemo
//        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml")); 
//        For this to work the file must be in src
        @SuppressWarnings("resource")
        ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle =(Triangle)factory.getBean("triangle");
        triangle.draw();
        Circle circle =(Circle)factory.getBean("circle");
        circle.draw();
        Rectangle rectangle =(Rectangle)factory.getBean("rectangle");
        rectangle.draw();
        Line line = (Line)factory.getBean("line");
        line.draw();
        line.setPoint4(new Point(-123,123));
//using scope="prototype" in xml to make Iterable aIterable diffrence object
        Line line2 = (Line)factory.getBean("line");
        line2.draw();
        triangle =(Triangle)factory.getBean("triangle2");
        triangle.draw();
    }

}
