package hello.bean;

import org.springframework.stereotype.Component;

/**
 * created by 不器 on 2019/9/9.
 */
@Component
public class Dog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
