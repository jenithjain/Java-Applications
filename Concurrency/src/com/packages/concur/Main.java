package com.packages.concur;

public class Main {
    static void main(String[] args) {
        System.out.println("Hello from com.packages.concur.Main!");

        Thread thread=new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=1;i<=5;i++){
                    System.out.println("prinitng = "+i+"in a worker thread");
                    try{
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();
        for(int i=1;i<=5;i++){
            System.out.println("prinitng = "+i+"in a main thread");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
