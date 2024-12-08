//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Permission sendMassage =new Permission("Send_massage");
        Permission changeRole =new Permission("Change_Role");
        Permission ModerateServer =new Permission("Moderate_Server");

        PermissionGroup adminPermissions = new PermissionGroup();
        adminPermissions.add(sendMassage);
        adminPermissions.add(changeRole);
        adminPermissions.add(ModerateServer);

        PermissionGroup userPermission = new PermissionGroup();
        userPermission.add(sendMassage);

        Role adminRole=new Role();
        adminRole.hierarchy="1";
        adminRole.name="admin Role";
        adminRole.assignPermission(adminPermissions);

        Role userRole=new Role();
        userRole.hierarchy="2";
        userRole.name="user Role";
        userRole.assignPermission(userPermission);

        Member normalUser= new Member();
        normalUser.username="haifaa";
    //    normalUser.addRole(userRole);

        Member adminMember = new Member();
        adminMember.username = "adminUser";
    //    adminMember.addRole(adminRole);

        Admin admin= new Admin();
        admin.AddMember(normalUser);
        admin.AddMember(adminMember);
        admin.assignRoleToUser(adminRole,adminMember);
        admin.assignRoleToUser(userRole, normalUser);

        System.out.println(adminMember.username + " can send messages: " + adminMember.hasPermission("Send_massage")); // Should be true
        System.out.println(adminMember.username + " can change role: " + adminMember.hasPermission("Change_Role")); // Should be true
        System.out.println(adminMember.username + " can moderate server: " + adminMember.hasPermission("Moderate_Server")); // Should be true
        System.out.println(normalUser.username + " can send messages: " + normalUser.hasPermission("Send_massage")); // Should be true
        System.out.println(normalUser.username + " can change role: " + normalUser.hasPermission("Change_Role")); // Should be false


    }
}