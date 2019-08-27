package com.zmh.multi_thread;

/**
 * Java代码的执行线程
 * @author zmh
 * @date 2019/8/27 17:42
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        System.out.println("The main thread was excuted by thread:"+Thread.currentThread().getName());
        Helper helper = new Helper("Java thread Anywhere");
        helper.run();

    }
    static class Helper implements Runnable {
        private final String message;

        public Helper(String  message) {
            this.message=message;
        }

        private void doSomething(String message) {
            System.out.println("The doSomething method was excuted by thread:"+Thread.currentThread().getName());
            System.out.println("Do Something with "+message);
        }

        @Override
        public void run() {
            doSomething(message);
        }
    }

}
