package com.harborkod.juc;

/**
 * Hello world!
 *
 */
public class App 
{
    // 守护线程：守护线程，当主线程执行完毕，守护线程也会执行完毕
    // 用户线程：用户线程，当主线程执行完毕，用户线程不会执行完毕
    public static void main( String[] args )
    {
        Thread thread = new Thread(() -> {

            //  用户自定义线程
            System.out.println(Thread.currentThread().getName() + "::" + Thread.currentThread().isDaemon());

            while (true) {
                 // 死循环
                //  当 thead 线程为用户线程时，主线程执行完毕后，thread 线程不会关闭
            }

        }, "tempThread");
        // thread.setDaemon(true); // 将 thread 线程设置为守护线程
        thread.start();

        //  主线程
        System.out.println(Thread.currentThread().getName() + "::" + Thread.currentThread().isDaemon());
    }
}
