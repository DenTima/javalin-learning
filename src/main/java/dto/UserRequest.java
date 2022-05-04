package dto;

public class UserRequest {
    public String name;
    public int age;

    public UserRequest() {
    }

    public UserRequest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserRequest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
