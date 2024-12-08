import java.util.ArrayList;

public class PermissionGroup implements PermissionComponent {
    ArrayList<PermissionComponent> permissions= new ArrayList<PermissionComponent>();
    public void add(PermissionComponent component){
        permissions.add(component);
    }
    public void remove(PermissionComponent component){
        permissions.remove(component);
    }
    public boolean checkPermission(String action){
        for (PermissionComponent permission : permissions) {
            if (permission.checkPermission(action)) {
                return true;
            }
        }
        return false;
    }
}

