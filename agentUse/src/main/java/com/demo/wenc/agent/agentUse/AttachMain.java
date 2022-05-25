package com.demo.wenc.agent.agentUse;


import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;

import java.io.IOException;

/**
 * @Author 温昌营
 * @Date 2022-5-24 15:41:08
 */
public class AttachMain {
    public static void main(String[] args) throws IOException, AttachNotSupportedException, AgentLoadException, AgentInitializationException {
        VirtualMachine vm = VirtualMachine.attach("16344");
        vm.loadAgent("E:\\Development\\Projects\\demo\\agent\\target\\agent.jar");
    }
}
