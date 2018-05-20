package com.icepear.prototype;

/**
 * @auther rim-wood
 * @description 大保健服务
 * @date Created on 2018-05-16.
 */
public class BigHealthCare implements Cloneable{
    private String serviceName;//服务名称

    public BigHealthCare(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public BigHealthCare clone() throws CloneNotSupportedException {
        return new BigHealthCare(serviceName);
    }
    @Override
    public String toString() {
        return "{"
                + "\"serviceName\":\"" + serviceName + "\""
                + "}";
    }
}
