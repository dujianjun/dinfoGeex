package com.fkit.example.Generics;


import org.apache.log4j.Logger;

/**
 * Description:
 * Program Name:
 * author :dujianjun
 * Date:2018-05-24  10:16  星期四
 * version 1.0
 */
public class Generic<T> {

    Logger logger =Logger.getLogger(Generic.class);

    private  T key;

    public Generic(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public void showKeyValue1(Generic<Number> obj){
        logger.info("key value is " + obj.getKey());
    }


    public static void main(String[] args) {
        Generic<Integer> genericInteger = new Generic<Integer>(2);
        Generic<Number> gen = new Generic<Number>(1);
        Generic<Number> gen2 = new Generic<Number>(1.2);







    }
}
