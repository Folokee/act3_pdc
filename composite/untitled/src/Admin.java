import java.util.ArrayList;

public class Admin {
 ArrayList<Role> roles =new ArrayList<Role>();
 ArrayList<Member> members =new ArrayList<Member>();

  public void createRole(Role role){
  roles.add(role);
 }

 public void deleteRole(Role role){
  roles.remove(role);
 }
 public void assignRoleToUser(Role role,Member member){
   member.addRole(role);
 }

 public void AddMember(Member member){
  members.add(member);
 }

 public void DeleteMember(Member member){
  members.remove(member);
 }

}
