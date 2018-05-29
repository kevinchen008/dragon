package com.gmtok.dragon.generator;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class RelectionTest {
    public static void main(String[] args){
        String name ="";
    }

    public static void printConstructor(Class cl){
       Constructor[] constructors = cl.getDeclaredConstructors();

       for(Constructor c :constructors){
           c.getName();
           Modifier.toString(c.getModifiers());
       }
    }
}
