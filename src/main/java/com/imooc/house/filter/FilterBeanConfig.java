package com.imooc.house.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.FilterRegistration;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class FilterBeanConfig {
    /**
     * 1、 构造filter
     * 2、 配置拦截urlPattern
     * 3、 利用FilterRegistrationBean进行包装
     */
    public FilterRegistrationBean logFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new LogFilter());
        List<String> urList = new ArrayList<String>();
        urList.add("*");
        filterRegistrationBean.setUrlPatterns(urList);
        return filterRegistrationBean;
    }
}
