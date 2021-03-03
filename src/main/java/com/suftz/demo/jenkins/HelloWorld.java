package com.suftz.demo.jenkins;

/**
 * Description:
 *
 * @author zhangchengy
 * @version 1.0
 * @date 2021/3/3 22:11
 */
public class HelloWorld {
    private String name="张三";
    private String age="20";

    public HelloWorld() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
