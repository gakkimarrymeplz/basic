package com.zmh.data_mapping_entity;

/**
 * @author zmh
 * @title: Emp_Dept
 * @projectName java-core-tech
 * @description: TODO
 * @date 2019/9/421:42
 */

class Dept{
    private Integer deptno;
    private String dname;
    private String loc;
    private Emp[] emps;

    public Emp[] getEmps() {
        return emps;
    }

    public void setEmps(Emp[] emps) {
        this.emps = emps;
    }

    public Dept(Integer deptno, String dname, String loc) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }
    public String getInfo() {
       return "部门编号:"+this.deptno+",部门名称:"+this.dname+",部门位置:"+this.loc;
    }


}

class Emp{
    private int empno;
    private String ename;
    private String job;
    private Double sal;
    private Double comm;
    private Dept dept;
    private Emp mgr;


    public Emp getMgr() {
        return mgr;
    }

    public void setMgr(Emp mgr) {
        this.mgr = mgr;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Emp(int empno, String ename, String job, Double sal, Double comm) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.sal = sal;
        this.comm = comm;
    }

    public String getInfo() {
        return "雇员编号:"+this.empno+",雇员姓名:"+this.ename+",雇员职位:"+this.job+",雇员工资"+
                this.sal+",雇员奖金"+this.comm;
    }
}
public class Emp_Dept {
    public static void main(String[] args) {
        Emp ea = new Emp(7369,"tom","manager",5000.0,800.0);
        Emp eb = new Emp(7370,"jerry","clerk",3000.0,300.0);
        Emp ec = new Emp(7369,"smith","worker",2000.0,200.0);
        Dept dept = new Dept(20,"sale","new york");
        ea.setDept(dept);
        eb.setDept(dept);
        ec.setDept(dept);
        Emp[] emps = new Emp[]{ea,eb,ec};
        dept.setEmps(emps);
        ec.setMgr(eb);
        eb.setMgr(ea);
        System.out.println(ec.getMgr().getMgr().getInfo());
        System.out.println(ec.getMgr().getMgr().getDept().getInfo());
        System.out.println(ec.getMgr().getInfo());
        System.out.println(ec.getMgr().getDept().getInfo());
        System.out.println("--------------------------------");
        for (Emp emp : dept.getEmps()) {
            if(emp.getMgr()!=null) {
                System.out.println(emp.getInfo());
                System.out.println(emp.getMgr().getInfo());
            }

        }



    }
}
