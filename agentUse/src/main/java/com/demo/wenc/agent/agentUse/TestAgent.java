package com.demo.wenc.agent.agentUse;

import java.util.concurrent.TimeUnit;

/**
 * @Author 温昌营
 * @Date 2022-5-24 15:35:41
 */
public class TestAgent {
    public static void main(String[] args) {
        System.out.println("this is the main");
        int count = 0;
        while (count < 99) {
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("time count: "+(++count));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("main end");
    }
}
