package com.kuang.service;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisShardInfo;

public class Test1 {
    public static void main(String[] args) {
            //参数：（服务器地址 : 端口号 / 仓库）
        Jedis jedis = new Jedis("39.107.123.202",6379);
        jedis.auth("Wwcwwc123");
        //连接redis数据库
        jedis.set("1","Chenxixi");
        System.out.println(jedis.get("1"));
        System.out.println(jedis.ping());
        jedis.close();
        
    }
}
