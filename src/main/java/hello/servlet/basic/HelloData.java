    package hello.servlet.basic;

    import lombok.Getter;
    import lombok.Setter;

    @Getter @Setter //lombok getter, setter
    public class HelloData {

        private String username;
        private int age;
    //롬북이 자동생성 해줌
    //    public String getUsername() {
    //        return username;
    //    }
    //
    //    public void setUsername(String username) {
    //        this.username = username;
    //    }
    //
    //    public int getAge() {
    //        return age;
    //    }
    //
    //    public void setAge(int age) {
    //        this.age = age;
    //    }
    }
