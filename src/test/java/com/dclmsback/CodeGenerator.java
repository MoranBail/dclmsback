package com.dclmsback;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import java.util.Collections;

public class CodeGenerator {
    public static void main(String[] args) {
        String url="jdbc:mysql://rm-cn-pe3360u1e000ekwo.rwlb.rds.aliyuncs.com/dclms";
        String username="bailstudio";
        String password="icanfly86!!";
        String moduleName="sys";
        String ouputDir="";
        String mapperLocation="/Users/bailstudio/Code/dclmsback/src/main/resources/mapper/"+moduleName;
        String tables="sys_user,sys_role,sys_company,sys_user_role,sys_user_company,sys_role_company";
        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("bail") // 设置作者
                           // .enableSwagger() // 开启 swagge  模式
                           // .fileOverride() // 覆盖已生成文件
                            .outputDir("/Users/bailstudio/Code/dclmsback/src/main/java"); // 指定输出目录
                })

                .packageConfig(builder -> {
                    builder.parent("com.dclmsback") // 设置父包名
                            .moduleName(moduleName) // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, mapperLocation)); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude(tables) // 设置需要生成的表名
                            .addTablePrefix("sys_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
