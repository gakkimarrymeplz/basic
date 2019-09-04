package com.zmh.reference_pass;

/**
 * ���ô��ݵ�Ӧ��
 * @author zmh
 * @date 2019/8/28 16:52
 */
class Member{
    private int mid;
    private String name;
    private Member child;
    //car��ʵ���������ʾ�г�
    //carΪnull��ʾû�г�
    private Car car;//��ʾ�����˵ĳ�

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
        return "��Ա���"+this.name+",��Ա����:"+this.name;

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
        return "����:"+this.pname;
    }
}
public class ReferencedApplication {
    public static void main(String[] args) {
        Member member = new Member(1,"������");
        Member child = new Member(2,"�ƴ���");
        Car car1 = new Car("��˹��˹��Ӱ");
        Car car2 = new Car("����qq");
        member.setChild(child);
        member.setCar(car1);
        car1.setMember(member);
        car2.setMember(child);
        child.setCar(car2);
        //ͨ�����ҵ������ӵĳ�����Ϣ

        System.out.println(member.getChild().getCar().getInfo());//������





    }
}
