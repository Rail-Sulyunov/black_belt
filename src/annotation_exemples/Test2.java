package annotation_exemples;

import java.lang.annotation.*;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomiClass = Class.forName("annotation_exemples.Xiaomi");
        Annotation annotation1 = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone sm1 = (SmartPhone) annotation1;
        System.out.println("Anot Xaiomi class: " + sm1.OS() + " , " + sm1.year());

        Class iphoneClass = Class.forName("annotation_exemples.Iphone");
        Annotation annotation2 = iphoneClass.getAnnotation(SmartPhone.class);
        SmartPhone sm2 = (SmartPhone) annotation2;
        System.out.println("Anot Iphone class: " + sm2.OS() + " , " + sm2.year());

    }
}


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    String OS() default "Android";

    int year() default 2010;
}

@SmartPhone
class Xiaomi {
    String model;
    double price;
}

@SmartPhone(OS = "IOS", year = 1976)
class Iphone {
    String model;
    double price;
}
