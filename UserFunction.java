public class UserFunction {
    
    public void printUserToString(){
        User user = new User();
        user.setId("ABC00001");
        user.setName("Fred");
        user.setAge(28);

        System.out.println(user.toString());        
    }

    /*
     * That's don't make sense, but is only for testing git stash command
     */
    public void createPaymentMethod(){
        PaymentDTO payment = new PaymentDTO();
        payment.setPaymentMethodCode("AB");
    }
}
