package com.qf.demo1.config;

import com.qf.demo1.listener.MyListener;
import com.qf.demo1.filter.MyFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Configuration;

/**
 * @author biubiu
 * @Data 2019/7/29
 */
@Configuration
public class WebConfig {
    @Autowired
    private MyFilter myFilter;
    @Autowired
    private MyListener myListener;
    //过滤器
    public FilterRegistrationBean initFilterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(myFilter);
        filterRegistrationBean.setName("myFilter");
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }
    //监听器
    public ServletListenerRegistrationBean servletListenerRegistrationBean(){
        ServletListenerRegistrationBean servletListenerRegistrationBean=new ServletListenerRegistrationBean();
        servletListenerRegistrationBean.setListener(myListener);
        return servletListenerRegistrationBean;
    }
}
