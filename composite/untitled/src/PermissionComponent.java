public interface PermissionComponent {
    void add(PermissionComponent component);
    void remove(PermissionComponent component);
    boolean checkPermission(String action);
}
