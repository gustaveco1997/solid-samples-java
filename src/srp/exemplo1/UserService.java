package srp.exemplo1;

public class UserService implements UserServiceInterface {


    @Override
    public void registerUser(User user) {
        final UserRepositoryInterface userRepository = new UserRepository();
        final EmaiServicelInterface emailService = new EmailService();

        userRepository.save(user);
        emailService.sendEmail(new EmailInfo("Assunto", "Corpo", "email@gmail.com"));
    }
}
