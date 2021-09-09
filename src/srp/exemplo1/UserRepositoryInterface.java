package srp.exemplo1;

public interface UserRepositoryInterface {
    void save(User user);
    User findByDocument(String document);
}
