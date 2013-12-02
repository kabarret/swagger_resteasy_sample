package com.kbarret.swaggerresteasy.representation;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "echo")
public class Echo {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
