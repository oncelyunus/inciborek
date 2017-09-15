package tr.com.inciborek.service;


import tr.com.inciborek.domains.User;

public interface UserService extends GenericService<User> {

    boolean authenticate(String email, String password);

    User findByEmail(String email);

}
