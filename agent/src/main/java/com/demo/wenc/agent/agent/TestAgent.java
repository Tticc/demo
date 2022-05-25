package com.demo.wenc.agent.agent;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

/**
 * @Author 温昌营
 * @Date 2022-5-24 15:35:52
 */
public class TestAgent {

    public static void premain(String arg, Instrumentation inst){
        System.out.println("this is the premain");
    }


    public static void agentmain(String arg, Instrumentation inst){
        System.out.println("come in agentmain");
        System.out.println("arg: "+arg);
        inst.addTransformer(new ClassFileTransformer(){
            @Override
            public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
                System.out.println("agentmain load class: "+className);
                return classfileBuffer;
            }
        },true);

//        printLoadedClasses(arg, inst);
    }


    public static void printLoadedClasses(String arg, Instrumentation inst){
        Class<?>[] clss = inst.getAllLoadedClasses();
        for (Class<?> aClass : clss) {
            System.out.println(aClass.getName());
        }
        System.out.println("agent run completed");
    }
}
