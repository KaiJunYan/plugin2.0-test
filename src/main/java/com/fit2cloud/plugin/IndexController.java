package com.fit2cloud.plugin;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;

/**
 * @author yankaijun
 * @date 2019-08-01 19:12
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public String index() throws IOException {
        Resource resource = new ClassPathResource("plugin/version");
        BufferedReader reader = new BufferedReader(new FileReader(resource.getFile()));
        String s = reader.readLine();
        return "<h1> hello world， your deploy version " + s + "</h1>";
    }
}

