package com.gmtok.dragon.generator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.*;

/**
* @Description: java类作用描述
* @Author: kevin.chen
* @CreateDate: 2018/3/1 14:23
* @Version: 1.0
*/
public class MpGenerator {

    /**
     * <p>
     * MySQL 生成演示
     * </p>
     */
    public static void main(String[] args) {
        // 自定义需要填充的字段
        List< TableFill > tableFillList = new ArrayList<>();
        //tableFillList.add( new TableFill( "ASDD_SS", FieldIgnore.INSERT_UPDATE ) );

        // 代码生成器
        AutoGenerator mpg = new AutoGenerator().setGlobalConfig(
                // 全局配置
                new GlobalConfig()
                        .setOutputDir("D:\\work\\workspaces\\workspace\\GIT\\dragon\\dragon-base\\src\\main\\java" )//输出目录
                        .setFileOverride( true )// 是否覆盖文件
                        .setActiveRecord( true )// 开启 activeRecord 模式
                        .setEnableCache( false )// XML 二级缓存
                        .setBaseResultMap( true )// XML ResultMap
                        .setBaseColumnList( true )// XML columList
                        .setAuthor( "Kevin.Chen" )
                        // 自定义文件命名，注意 %s 会自动填充表实体属性！
                        // .setMapperName("%sDao")
                        // .setXmlName("%sDao")
                        .setServiceName( "%sService" )
                        .setServiceImplName("i%sService")
                // .setControllerName("%sAction")
        ).setDataSource(
                // 数据源配置
                new DataSourceConfig()
                        .setDbType( DbType.MYSQL )// 数据库类型
                        .setTypeConvert( new MySqlTypeConvert() {
                            // 自定义数据库表字段类型转换【可选】
                            @Override
                            public DbColumnType processTypeConvert ( String fieldType ) {
                                return super.processTypeConvert( fieldType );
                            }
                        } )
                        .setDriverName( "com.mysql.jdbc.Driver" )
                        .setUsername( "root" )
                        .setPassword( "123456" )
                        .setUrl( "jdbc:mysql://127.0.0.1:3306/agent?characterEncoding=utf8" )
        ).setStrategy(
                // 策略配置
                new StrategyConfig()
                        .setCapitalMode(true)// 全局大写命名
                        //.setDbColumnUnderline(true)//全局下划线命名
                        //.setTablePrefix( "dargon_" )// 此处可以修改为您的表前缀
                        .setNaming( NamingStrategy.underline_to_camel )// 表名生成策略
                        .entityTableFieldAnnotationEnable(true)
                        // .setInclude( new String[]{  } ) // 需要生成的表
                        // .setExclude(new String[]{"test"}) // 排除生成的表
                        // 自定义实体父类
                        // .setSuperEntityClass("com.baomidou.demo.TestEntity")
                        // 自定义实体，公共字段
                        // .setSuperEntityColumns( new String[]{ "test_id" } )
                        .setTableFillList( tableFillList )
                        // 自定义 mapper 父类
                        // .setSuperMapperClass("com.baomidou.demo.TestMapper")
                        // 自定义 service 父类
                        // .setSuperServiceClass("com.baomidou.demo.TestService")
                        // 自定义 service 实现类父类
                        // .setSuperServiceImplClass("com.baomidou.demo.TestServiceImpl")
                        // 自定义 controller 父类
                        // .setSuperControllerClass("com.baomidou.demo.TestController")
                        // 【实体】是否生成字段常量（默认 false）
                        // public static final String ID = "test_id";
                        // .setEntityColumnConstant(true)
                        // 【实体】是否为构建者模型（默认 false）
                        // public User setName(String name) {this.name = name; return this;}
                        // .setEntityBuilderModel(true)
                        // 【实体】是否为lombok模型（默认 false）<a href="https://projectlombok.org/">document</a>
                        .setEntityLombokModel( true )
                        // Boolean类型字段是否移除is前缀处理
                        .setEntityBooleanColumnRemoveIsPrefix( true )
                        .setRestControllerStyle( true )
                        .setControllerMappingHyphenStyle( false )
        ).setPackageInfo(
                // 包配置
                new PackageConfig()
                        // .setModuleName( "test" )
                        .setParent( "com.gmtok.dragon.base" )// 自定义包路径
                        .setController( "controller" )// 这里是控制器包名，默认 web
                        .setEntity( "entity" )
                        .setService("service")
                        .setServiceImpl("service.impl")
                        .setMapper("mapper")
        )
             /*   .setCfg(
                // 注入自定义配置，可以在 VM 中使用 cfg.abc 设置的值
                new InjectionConfig() {
                    @Override
                    public void initMap () {
                        Map< String, Object > map = new HashMap<>();
                        map.put( "abc" , this.getConfig().getGlobalConfig().getAuthor() + "-mp" );
                        this.setMap( map );
                    }
                }.setFileOutConfigList( Collections.singletonList(new FileOutConfig( "/templates/mapper.xml.vm" ) {
                    // 自定义输出文件目录
                    @Override
                    public String outputFile ( TableInfo tableInfo ) {
                        return "/develop/code/xml/" + tableInfo.getEntityName() + ".xml";
                    }
                } ) )
        )*/
                .setTemplate(
                // 关闭默认 xml 生成，调整生成 至 根目录
                new TemplateConfig()
                        // .setXml( null )
                        // 自定义模板配置，模板可以参考源码 /mybatis-plus/src/main/resources/template 使用 copy
                        // 至您项目 src/main/resources/template 目录下，模板名称也可自定义如下配置：
                        .setController( "templates/controller.java.vm" )
                        // .setEntity( "templates/mybatis/plus/entity.java.vm" )
                        // .setMapper("...");
                        // .setXml("...")
                        .setService( "templates/service.java.vm" )
                        .setServiceImpl( "templates/serviceImpl.java.vm" )
        );

        // 执行生成
        mpg.execute();

        // 打印注入设置，这里演示模板里面怎么获取注入内容【可无】
        System.err.println( mpg.getCfg().getMap().get( "abc" ) );
    }

}
