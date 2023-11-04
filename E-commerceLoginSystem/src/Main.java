import com.LoginSystem.business.abstracts.UserService;
import com.LoginSystem.business.concretes.UserManager;
import com.LoginSystem.core.concretes.GLoginManagerAdapter;
import com.LoginSystem.core.concretes.VerificationEmail;
import com.LoginSystem.dataAccess.concretes.HibernateUserDao;
import com.LoginSystem.entites.concretes.User;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        UserService userService = new UserManager(new HibernateUserDao(), new VerificationEmail(), new GLoginManagerAdapter());

        User user = new User(1, "fatih", "taylan", "123456", "fatih@gmail.com");

        userService.register(user);

    }
}