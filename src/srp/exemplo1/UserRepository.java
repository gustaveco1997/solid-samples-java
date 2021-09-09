package srp.exemplo1;


import java.util.ArrayList;
import java.util.List;

public class UserRepository implements UserRepositoryInterface {
    private final List<User> users = new ArrayList<>();

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public User findByDocument(String document) {
        return users.stream().filter(user -> document.equals(user.getDocument())).findFirst().orElse(null);
    }
}
