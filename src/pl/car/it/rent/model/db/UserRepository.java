package pl.car.it.rent.model.db;

import pl.car.it.rent.model.gui.User;

public class UserRepository {
    private User[] users = new User [2];

    public UserRepository(){
        this.users[0] = new User("admin", "dd2034b76585c964ac5a87f03c5549ce");
        this.users[1] = new User("Filip", "1dd90765546f376ef86c56b110ab527a");

    }

    public User findUserByLogin(String login){
        for(User user : this.users){
            if (user.getLogin().equals(login)){
                return user;
            }
        }
        return null;
    }
}
