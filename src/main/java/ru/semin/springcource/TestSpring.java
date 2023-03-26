package ru.semin.springcource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        /*Класс ClassPathXmlApplicationContext обращается к файлу applicationContext.xml, считывает и помещает все
         которые там есть в
    */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    // теперь из applicationContext.xml можно достать бин обратившись к нему по id
    TestBean testBean = (TestBean) context.getBean("testBean");
    //или TestBean testBean = context.getBean("testBean", TestBean.class)
    //получаем имя обьекта testBean
        System.out.println(testBean.getName());
    // обязательно закрыть context после окончания работы с ним
    context.close();
    }
}
