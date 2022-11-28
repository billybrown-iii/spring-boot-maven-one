package springboot.one.topic;

public class Topic {

    private String id;
    private String name;
    private String desc;

    public Topic(String id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    // define a nno-arg constructor - needed for Spring to auto-instantiate from request body
    // Spring uses deserialization instead of your hand-coded constructor
    public Topic() {}

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    // when you log an object to the console, it looks funny (not what you'd expect)
    // this method tests that you are indeed logging Topic instances
    // public String toString() {
    //     return "kitty";
    // }
}
