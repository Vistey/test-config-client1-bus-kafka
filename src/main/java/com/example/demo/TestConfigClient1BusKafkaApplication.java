package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 设置bootstrap.yml设置，application的设置不会从config server读取数据
 * bootstrap在系统启动前加载，application在系统启动后加载
 * bus需要kafka的配置信息，config server的链接git的地址和账号
 * 确保kafka是打开状态
 */
@SpringBootApplication
public class TestConfigClient1BusKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestConfigClient1BusKafkaApplication.class, args);
	}
}
