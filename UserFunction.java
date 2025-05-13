public class UserFunction {
    
    public void printUserToString(){
        User user = new User();
        user.setId("ABC00001");
        user.setName("Fred");
        user.setAge(28);

        System.out.println(user.toString());
    }
}
