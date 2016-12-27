package com.github.spring.springel;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * Created by xiedan11 on 2016/12/27.
 */
@Configuration
@ComponentScan("com.github.spring.springel")
@PropertySource(value = "pan.properties", encoding = "UTF-8")
public class ELConfig {

    @Value("I Love You!")
    private String normal;
    @Value("#{systemProperties['os.name']}")
    private String osName;
    @Value("#{systemEnvironment['os.arch']}")
    private String osArch;
    @Value("#{T(java.lang.Math).random()*100}")
    private double randomNumber;
    @Value("#{personService.author}")
    private String author;
    @Value("pan.txt")
    private Resource testFile;

    @Value("http://10.137.146.59:9080/eservice_carinsure/login/login.jsp")
    private Resource testUrl;
    @Value("${sun.username}")
    private String su;
    @Value("${sun.password}")
    private String sp;
    @Value("${sun.nickname}")
    private String sn;
    @Autowired
    private Environment environment;

    public void output() {
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(osArch);
            System.out.println(randomNumber);
            System.out.println(author);
            System.out.println(IOUtils.toString(testFile.getInputStream(),"UTF-8"));

            //访问网址
            //System.out.println(IOUtils.toString(testUrl.getInputStream(),"UTF-8"));
            //获取网址
            System.out.println("testUrl.getURL():"+testUrl.getURL());
            System.out.println(su);
            System.out.println(sp);
            System.out.println(sn);
            System.out.println(environment.getProperty("pan.name"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

