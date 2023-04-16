package pl.car.it.rent.model.Authenticator;

import org.apache.commons.codec.digest.DigestUtils;
import pl.car.it.rent.model.db.UserRepository;
import pl.car.it.rent.model.gui.Gui;
import pl.car.it.rent.model.gui.User;

public class Authenticator {

    Gui gui = new Gui();
    UserRepository usersDatabase = new UserRepository();

    private String seed = "tM&@9g7vq$e4gGZ54rf8@Qru";
    public boolean authenticate() {

        int counter = 0;

        while (counter <3) {

            User userFromGui = gui.readLoginAndPassword();

            User userFromDb = usersDatabase.findUserByLogin(userFromGui.getLogin());

            if (userFromDb != null && userFromDb.getPassword().
                    equals(DigestUtils.md5Hex(userFromGui
                            .getPassword() + this.seed))) {

                    System.out.println("Poprawne zalogowanie");
                    return true;

            }
            System.out.println("Incorrect login or password !");
            counter++;
        }
        return false;
    }
}
