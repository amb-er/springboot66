package com.qf.springbootmybatis.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author biubiu
 * @Data 2019/7/30
 */
@Controller
@Slf4j
public class logbackController {
    @RequestMapping("biu")
    public String biu(){

        log.error("biubiubiu------error");
        log.debug("biubiubiu------debug");
        log.warn("biubiubiu-------warn");
        int i=1/0;
        log.info("biubiubiu-------info");
        return "index";
    }

    @RequestMapping("tao")
    public String tao(){
        return "index";
    }
    @RequestMapping("a.cssa")
    public String aa(){
        return "www.baidu.com";
    }
}
