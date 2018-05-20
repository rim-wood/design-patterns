package com.icepear.builder;

/**
 * @auther rim-wood
 * @description 建造者模式
 * @date Created on 2018-05-15.
 */
public class Test {
    public static void main(String args[]){
        //传统模式下的大保健服务
        Bighealthcare tradition = new Bighealthcare("洗个脚","按个摩","ppp");
        tradition.service();

        //建造器模式下的大保健服务，先构造一个大保健服务，具体要哪些项目可以一个个拼装，扩展方便
        //运用《effective java》中说的，当构造方法过多时就应该要考虑使用构造器，其实就是建造者模式
        //简单大保健
        Bighealthcare simpleBighealthcare = new Bighealthcare.Builder().xijiao("洗个脚").build();
        simpleBighealthcare.service();
        //一般大保健
        Bighealthcare generalBighealthcare = new Bighealthcare.Builder().xijiao("洗个脚").anmo("按个摩").build();
        generalBighealthcare.service();
        //高级大保健
        Bighealthcare specialBighealthcare = new Bighealthcare.Builder().xijiao("洗个脚").anmo("按个摩").papapa("ppp").build();
        specialBighealthcare.service();
    }
}
