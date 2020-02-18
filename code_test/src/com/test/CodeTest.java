package com.test;

import com.gensheng.Person;

/**
 * @creat 2020/2/17
 */
public class CodeTest {
    public static void main(String[] args) {
        Person p = new Person("test01",23);
        try {
            System.out.println(p.getName()+"------"+p.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
