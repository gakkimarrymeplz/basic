package com.zmh.keywords_this;

/**
 * @author zmh
 * @date 2019/8/28 8:57
 * 1��this��������
 * 2��this���÷���
 * 3��this��ʾ��ǰ����
 */

class Book{
    private String title;
    private double price;

    //getter��setter��
    public Book(String title,double price) {
        /*
         public Book(String t,double p) {
            title=t;
            price=p;
          }
        * �˴�ʹ�õ���һ�����췽������������췽������Ҫ������Ϊtitle��price�������Գ�ʼ��ʹ�ã�
        * ������һ�㲻�ã��������Ƿ����еĲ������Ʋ��á���Ȼ���췽���в�����Ŀ����Ϊ�����е�����
        * ��ʼ������ô��õ�������ֱ�ӽ���������Ϊ���������Ʊ���һ�¡�
        *
          public Book(String title,double price) {
            title=title;
            price=price;
          }
        * �޸�Ϊ���ϵĲ�����ʽ�����þ����Ǻ����ˣ����Ƿ��������ڹ��췽���д��ݵĲ������ݲ�û�д���
        * ������֮�С�
        *
          public Book(String title,double price) {
            this.title=title;
            this.price=price;
          }
        * ��Java�������������ԡ�{}��Ϊ���ޡ������������������������Ƴ���������������£���ôĬ�����
        * �����û�м����κε����ƣ�ָ�Ķ�������ġ�{}���ڵı������ơ����������������Ϊ�˿�����ȷ����
        * ��Ҫ���ʵı��������������Ե�ʱ����Ҫ�ڱ���ǰ����this�������Ϳ���׼ȷ�Ľ������Եı�ǡ�
        *
        * ���Ժ�Ŀ���֮�У�ֻҪ�Ƿ������е�����ǰ��������this��
        * */
        this.title=title;
        this.price=price;
    }
    public String getInfo() {
        return "����"+this.title+",�۸�"+this.price;
    }
}
public class ThisDemo1 {
    public static void main(String[] args) {
        Book book = new Book("Java����",79.8);
        System.out.println(book.getInfo());
    }
}
