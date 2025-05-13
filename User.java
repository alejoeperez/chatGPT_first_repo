public class User{

    private String id;
    private String name;
    private int age;

    //GETTERS AND SETTERS
    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String geName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

}