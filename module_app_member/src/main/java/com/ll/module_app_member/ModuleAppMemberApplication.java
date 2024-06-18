package com.ll.module_app_member;

import com.ll.common.util.StrUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModuleAppMemberApplication {

    public static void main(String[] args) {
        System.out.println(StrUtil.isBlank("test"));
        SpringApplication.run(ModuleAppMemberApplication.class, args);
    }

}
