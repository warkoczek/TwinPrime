package pl.sda.warkoczewski.sequence;


import java.util.ArrayList;

public class SequenceTask {



    public int getSecondSmallestInteger(int[] array){

        int temp;


            if(array.length < 2){
                throw new IllegalStateException("The array size is too small");
            }

        for (int i = 0; i < array.length; i++) {

            for (int j = i+1; j < array.length; j++) {

                if (array[i] > array[j]){

                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;


                }

            }

        }

        return array[1];
    }





}
