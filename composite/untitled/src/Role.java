public class Role {
    String name;
    String hierarchy;;
    PermissionGroup permissions =new PermissionGroup();

    public void assignPermission(PermissionComponent permission){
        permissions.add(permission);
    }

    public boolean hasPermission(String action){
        return permissions.checkPermission(action);
    }
}
