package com.zmh.data_mapping_entity;

import java.util.Date;

/**
 * @author zmh
 * @title: AccessControlDemo
 * @projectName java-core-tech
 * @description: TODO
 * @date 2019/9/722:51
 */

class Admin{
    private String aid;
    private String password;
    private Date lastLoginTime;
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Admin(String aid, String password, Date lastLoginTime) {
        this.aid = aid;
        this.password = password;
        this.lastLoginTime = lastLoginTime;
    }

    public Admin(String aid, String password) {
        this.aid = aid;
        this.password = password;

    }

    public String getInfo(){
        return "????????:"+this.aid+",?????????:"+this.password+",??¦Å?????:"+this.lastLoginTime;
    }
}
class Role{
    private Integer rid;
    private String title;
    private Admin[] admins;
    private Group[] groups;
    public void setAdmins(Admin[] admins) {
        this.admins = admins;
    }

    public Admin[] getAdmins() {
        return admins;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public Role(Integer rid, String title) {
        this.rid = rid;
        this.title = title;
    }

    public String getInfo(){
        return "??????:"+this.rid+",???????:"+this.title;
    }
}

class Group{
    private Integer gid;
    private String title;
    private Role[] roles;
    private Privilege[] privileges;

    public Privilege[] getPrivileges() {
        return privileges;
    }

    public void setPrivileges(Privilege[] privileges) {
        this.privileges = privileges;
    }

    public Role[] getRoles() {
        return roles;
    }

    public void setRoles(Role[] roles) {
        this.roles = roles;
    }

    public Group(Integer gid, String title) {
        this.gid = gid;
        this.title = title;
    }
    public String getInfo(){
        return "???????:"+this.gid+",?????????:"+this.title;
    }
}

class Privilege{
    private Integer pid;
    private String title;
    private String url;
    private Group group;

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Privilege(Integer pid, String title, String url) {
        this.pid = pid;
        this.title = title;
        this.url = url;
    }

    public String getInfo(){
        return "?????:"+this.pid+",???????:"+this.title+",???¡¤??:"+this.url;
    }
}
public class AccessControlDemo {

    public static void main(String[] args) {
        //?????:???????????
        //1.????????????
        Admin a1 = new Admin("admin","hello",new Date());
        Admin a2 = new Admin("tom","hello",new Date());
        Admin a3 = new Admin("jiabao","hello",new Date());
        Role r1 = new Role(1,"???????");
        Role r2 = new Role(2,"????????");
        Group g1 = new Group(10,"???????");
        Group g2 = new Group(11,"???????");
        Group g3 = new Group(12,"???????");
        Group g4 = new Group(13,"??????");
        Group g5 = new Group(14,"???????");
        Privilege p01 = new Privilege(1001,"???????","-");
        Privilege p02 = new Privilege(1002,"?????§Ò?","-");
        Privilege p03 = new Privilege(1003,"???????","-");
        Privilege p04 = new Privilege(1004,"???????","-");
        Privilege p05 = new Privilege(1005,"????§Ò?","-");
        Privilege p06 = new Privilege(1006,"??????","-");
        Privilege p07 = new Privilege(1007,"???????","-");
        Privilege p08 = new Privilege(1008,"????????","-");
        Privilege p09 = new Privilege(1009,"???????","-");
        Privilege p10 = new Privilege(1010,"??????","-");
        Privilege p11 = new Privilege(1011,"??????","-");
        Privilege p12 = new Privilege(1012,"???????","-");
        Privilege p13 = new Privilege(1013,"???????","-");
        //2.???????§»????????????
        //???¨´????????
        a1.setRole(r1);
        a2.setRole(r2);
        a3.setRole(r2);
        r1.setAdmins(new Admin[]{a1});
        r2.setAdmins(new Admin[]{a2,a3});
        //??????????????????
        r1.setGroups(new Group[]{g1,g2,g3,g4,g5});
        r2.setGroups(new Group[]{g1,g2});
        g1.setRoles(new Role[]{r1,r2});
        g2.setRoles(new Role[]{r1,r2});
        g3.setRoles(new Role[]{r1});
        g4.setRoles(new Role[]{r1});
        g5.setRoles(new Role[]{r1});
        //???????????????????
        g1.setPrivileges(new Privilege[]{p01,p02,p03});
        g2.setPrivileges(new Privilege[]{p04,p05,p06});
        g3.setPrivileges(new Privilege[]{p07,p09,p09});
        g4.setPrivileges(new Privilege[]{p10,p11});
        g5.setPrivileges(new Privilege[]{p12,p13});
        p01.setGroup(g1);
        p02.setGroup(g1);
        p03.setGroup(g1);
        p04.setGroup(g2);
        p05.setGroup(g2);
        p06.setGroup(g2);
        p07.setGroup(g3);
        p08.setGroup(g3);
        p09.setGroup(g3);
        p10.setGroup(g4);
        p11.setGroup(g4);
        p12.setGroup(g5);
        p13.setGroup(g5);
        //?????:???????
        System.out.println(a1.getInfo());
        System.out.println("\t|-"+a1.getRole().getInfo());
        for (int i = 0; i < a1.getRole().getGroups().length; i++) {
            System.out.println("\t\t|-"+a1.getRole().getGroups()[i].getInfo());
            for (int i1 = 0; i1 < a1.getRole().getGroups()[i].getPrivileges().length; i1++) {
                System.out.println("\t\t\t|-"+a1.getRole().getGroups()[i].getPrivileges()[i1].getInfo());
            }
        }
        System.out.println("------------------");
        System.out.println(g2.getInfo());
        for (int i = 0; i < g2.getRoles().length; i++) {
            System.out.println("\t|-"+g2.getRoles()[i].getInfo());
            for (int i1 = 0; i1 < g2.getRoles()[i].getAdmins().length; i1++) {
                System.out.println("\t\t|-"+g2.getRoles()[i].getAdmins()[i1].getInfo());
            }
        }
        System.out.println("------------------");
        System.out.println("------------------");

    }
}
