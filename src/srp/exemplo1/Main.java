package srp.exemplo1;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        user.setAge(24);
        user.setDocument("123456789-09");
        user.setEmail("gustavohdosreis@gmail.com");
        user.setJobDescription("Java Developer");

        UserServiceInterface userService = new UserService();
        userService.registerUser(user); //save and send email
    }

}
