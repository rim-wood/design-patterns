package com.icepear.builder;

/**
 * @auther rim-wood
 * @description 大保健
 * @date Created on 2018-05-15.
 */
public class Bighealthcare {
    private String xijiao;
    private String anmo;
    private String papapa;

    /**
     * 传统享受大保健服务就洗洗脚
     * @param xijiao
     */
    public Bighealthcare(String xijiao){
        this.xijiao = xijiao;
    }
    /**
     * 舒服一点就加个按摩
     * @param xijiao
     */
    public Bighealthcare(String xijiao,String anmo){
        this.xijiao = xijiao;
        this.anmo = anmo;
    }

    /**
     * 想更舒服就搞下特殊服务
     * @param xijiao
     * @param anmo
     * @param papapa
     */
    public Bighealthcare(String xijiao,String anmo,String papapa){
        this.xijiao = xijiao;
        this.anmo = anmo;
        this.papapa = papapa;
    }

    /**
     * 建造者模式的大保健服务
     */
    public Bighealthcare(Builder builder){
        this.xijiao = builder.xijiao;
        this.anmo = builder.anmo;
        this.papapa = builder.papapa;
    }
    protected static class Builder{
        protected String xijiao;
        protected String anmo;
        protected String papapa;

        protected Builder xijiao(String xijiao){
            this.xijiao = xijiao;
            return this;
        }

        protected Builder anmo(String anmo){
            this.anmo = anmo;
            return this;
        }

        protected Builder papapa(String papapa){
            this.papapa = papapa;
            return this;
        }

        protected Bighealthcare build(){
            return new Bighealthcare(this);
        }
    }

    public void service(){
        System.out.print(this.toString());
    }

    @Override
    public String toString() {
        return "{"
                + "\"xijiao\":\"" + xijiao + "\""
                + ", \"anmo\":\"" + anmo + "\""
                + ", \"papapa\":\"" + papapa + "\""
                + "}";
    }
}
