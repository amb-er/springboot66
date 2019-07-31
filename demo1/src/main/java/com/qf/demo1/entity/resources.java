package com.qf.demo1.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author biubiu
 * @Data 2019/7/29
 */
@Component
@ConfigurationProperties(prefix = "resources")
public class resources {
    private String imageServer;

    private String emialServer;

    public String getImageServer() {
        return imageServer;
    }

    public void setImageServer(String imageServer) {
        this.imageServer = imageServer;
    }

    public String getEmialServer() {
        return emialServer;
    }

    public void setEmialServer(String emialServer) {
        this.emialServer = emialServer;
    }

    @Override
    public String toString() {
        return "resources{" +
                "imageServer='" + imageServer + '\'' +
                ", emialServer='" + emialServer + '\'' +
                '}';
    }
}
