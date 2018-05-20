package com.icepear.prototype;

/**
 * @auther rim-wood
 * @description 原型模式
 * @date Created on 2018-05-15.
 */
public class Test {
    public static void main(String args[]){
        //小刚要做大保健服务，但是大保健服务有很多种，有洗脚、按摩、papapa。
        //小刚呼叫了一号技师，说要做个洗脚服务
        BigHealthCare simpleBighealthcare = new BigHealthCare("洗脚");
        System.out.printf("一号技师给小刚做了个"+simpleBighealthcare.getServiceName()+"服务\n");
        //小刚说一号技师不错，还想来个按摩，于是加了个服务
        try {
            BigHealthCare generalBighealthcare = simpleBighealthcare.clone();
            generalBighealthcare.setServiceName("按摩");
            System.out.printf("一号技师给小刚做了个"+generalBighealthcare.getServiceName()+"服务\n");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //技师手法把小刚弄的欲罢不能，于是小刚还想加服务
        try {
            BigHealthCare specialBighealthcare = simpleBighealthcare.clone();
            specialBighealthcare.setServiceName("papapa");
            System.out.printf("一号技师给小刚做了个"+specialBighealthcare.getServiceName()+"服务\n");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //那么问题来了小刚为什么要这么做呢，为什么不每次通过new一下叫个技师来呢？原因有二
        //1.小刚服务做得正爽，也就是在run-time时期，可以实现动态加服务
        //2.小刚觉得1号技师长得好，技术也好（保持对象原有状态），要是new了一个不好的来就不爽了（浪费资源）。

    }
}
