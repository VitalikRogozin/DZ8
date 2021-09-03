package com.Geekbrains;

public abstract class SuperClass {
    public void sleep(){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
