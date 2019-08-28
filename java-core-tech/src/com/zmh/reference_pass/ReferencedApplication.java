package com.zmh.reference_pass;

/**
 * 引用传递的应用
 * @author zmh
 * @date 2019/8/28 16:52
 */
class Member{
    private int mid;
    private String name;
    private Member child;
    //car有实例化对象表示有车
    //car为null表示没有车
    private Car car;//表示属于人的车

    public Member(int mid, String name) {
        this.mid = mid;
        this.name = name;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Member getChild() {
        return child;
    }

    public void setChild(Member child) {
        this.child = child;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getInfo() {
        return "人员编号"+this.name+",人员姓名:"+this.name;

    }}
class Car{
    private String pname;
    private Member member;

    public Car(String pname) {
        this.pname = pname;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public String getInfo() {
        return "车型"+this.pname;
    }
}
public class ReferencedApplication {
    public static void main(String[] args) {
        Member member = new Member(1,"黄晓明");
        Member child = new Member(2,"黄大名");
        Car car1 = new Car("劳斯莱斯幻影");
        Car car2 = new Car("劳奇瑞qq");
        member.setChild(child);
        member.setCar(car1);
        car1.setMember(member);
        car2.setMember(child);
        child.setCar(car2);
        //通过人找到他儿子的车的信息

        System.out.println(member.getChild().getCar().getInfo());




    }
}
