package com.mycompany.labsession01;

public interface MyFirstInterface
{
    final int x = 5;
    int y = 20;
    //In an interface, declaring a variable wihout using public static final keywords will not make any difference.
    //The interface will automatically takes the variable as public static final.
    
    public abstract void display();
    public void display01();
    //In an interface, declaring a method without using abstract keyword will not make any difference.
    //The interface will automatically takes the method as a abstract method.    
}
