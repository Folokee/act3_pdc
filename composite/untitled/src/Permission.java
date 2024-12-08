public class Permission implements PermissionComponent{
    private String action;

    public Permission(String action) {
        this.action=action;
    }

    public void add(PermissionComponent component){
        throw new UnsupportedOperationException("Cannot add to a leaf");

    }
    public void remove(PermissionComponent component){
        throw new UnsupportedOperationException("Cannot remove from a leaf");

    }
    public boolean checkPermission(String action){
        return this.action.equals(action);
    }
}
