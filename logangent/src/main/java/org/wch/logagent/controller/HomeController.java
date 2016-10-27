package org.wch.logagent.controller;

import com.vf.agent.log.Agent;
import com.vf.agent.log.LogChain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 * @author weichunhe
 *         Created on 2016/10/20.
 * @version 1.0
 */
@RestController
@RequestMapping
public class HomeController {
    private static Logger log = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/hello")
    public Object hello(String name) {
        log.info("hello,your name is {},id={}", name, LogChain.getId());
        RestTemplate template = new RestTemplate();
        System.out.println("resp=" + template.getForObject("http://localhost:8080/header", String.class));
        return "hello" + name;
    }

    @RequestMapping("/header")
    public String header(HttpServletRequest request) {
        log.info("chain-id=" + LogChain.getId());
        return request.getHeader("chain-id");
    }


    public static void main(String[] args) {
        try {
            testGetFilesFromJarInClassPathWithDirPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testGetFilesFromJarInClassPathWithDirPath() throws IOException {
        String dirPath = "config/";
        URL url = Agent.class.getClassLoader().getResource(dirPath);

        JarURLConnection jarCon = (JarURLConnection) url.openConnection();
        JarFile jarFile = jarCon.getJarFile();
        Enumeration<JarEntry> jarEntrys = jarFile.entries();

        while (jarEntrys.hasMoreElements()) {
            JarEntry entry = jarEntrys.nextElement();
            // 简单的判断路径，如果想做到像Spring，Ant-Style格式的路径匹配需要用到正则。
            String name = entry.getName();

            if (name.startsWith(dirPath) && !entry.isDirectory()) {
                System.out.println(name);
                // 开始读取文件内容
                InputStream is = Agent.class.getClassLoader().getResourceAsStream(name);

            }
        }

    }
}
