package cn.tulingxueyuan.beans;

public class Wife {
    private Integer age;
    private String name;

    public Wife(){
        System.out.println("Wife已加载");
    }
    public Wife(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
