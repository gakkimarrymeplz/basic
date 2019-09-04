package com.zmh.data_mapping_entity;

/**
 * @author zmh
 * @title: Province_City
 * @projectName java-core-tech
 * @description: TODO
 * @date 2019/9/422:31
 */
class Province{
    private Integer pid;
    private String pname;
    private City[] cities;

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public Province(Integer pid, String pname) {
        this.pid = pid;
        this.pname = pname;
    }

    public String getInfo() {
        return "ʡ�ݱ��:"+this.pid+"��ʡ������:"+pname;
    }
}

class City{
    private Integer cid;
    private String cname;
    private Province pro;

    public Province getPro() {
        return pro;
    }

    public void setPro(Province pro) {
        this.pro = pro;
    }

    public City(Integer cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public String getInfo() {
        return "���б��:"+this.cid+"����������:"+cname;
    }
}
public class Province_City {

    public static void main(String[] args) {
        Province pro = new Province(1,"�㽭");
        City c1 = new City(1001,"����");
        City c2 = new City(1002,"����");
        City c3 = new City(1003,"����");
        c1.setPro(pro);
        c2.setPro(pro);
        c3.setPro(pro);
        pro.setCities(new City[]{c1,c2,c3});

        //����ʡ�ݲ�ѯ���г�����Ϣ
        for (City city : pro.getCities()) {
            System.out.println(city.getInfo());
        }
        System.out.println("------------------");
        //���ݳ��в�ѯʡ�ݵ���Ϣ
         System.out.println(c1.getPro().getInfo());
    }
}
