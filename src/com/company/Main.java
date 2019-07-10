package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        double[] array = new double[100000];
        for (int i = 0; i < array.length; i++) {
	    array[i]=Math.floor(Math.random()*100000);
        }
        StopWatch stopWatch=new StopWatch();
        stopWatch.setStartTime();
        for (int i=0;i<array.length;i++){
            for (int j=i;j<array.length;j++){
                if (array[i]<array[j]){
                    double temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println(stopWatch.getElapsedTime());
    }
}
