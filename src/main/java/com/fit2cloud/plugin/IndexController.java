package com.fit2cloud.plugin;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

/**
 * @author yankaijun
 * @date 2019-08-01 19:12
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public String index() throws IOException {
        ClassPathResource resource = new ClassPathResource("plugin/version");
        InputStream inputStream = resource.getInputStream();

        String s = new BufferedReader(new InputStreamReader(inputStream))
                .lines().collect(Collectors.joining("\n"));

        return "<h1> hello world， your deploy version " + s + "</h1>";
    }
}

