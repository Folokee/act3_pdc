import java.util.ArrayList;

public class Member {
    String username;
    ArrayList<Role> roles =new ArrayList<Role>();

    void addRole(Role role){
        roles.add(role);
    }

    void removeRole (Role role){
        roles.remove(role);
    }

    boolean hasPermission(String action){
        for (Role role : roles) {
            if (role.hasPermission(action)) {
                return true;
            }
        }
        return false;

    }

}
