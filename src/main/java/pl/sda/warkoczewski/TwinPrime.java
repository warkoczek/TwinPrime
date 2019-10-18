package pl.sda.warkoczewski;

import java.math.BigDecimal;

public class TwinPrime {


    public boolean areTwins(int m,int n){

        if(isDifferenceTwo(m,n) && isMultipleOfSix(m,n)) {
            return true;
        }else{
            return false;
        }


    }

    public boolean isDifferenceTwo(int m, int n){

        int subtract = (m - n)*-1;

        if ( subtract == 2){
            return true;
        }else
        {
            return false;
        }


    }

    public boolean isMultipleOfSix(int m, int n){

        int between = (m+n)/2;

        if ( between % 6 == 0){
            return true;
        }else{
            return false;
        }


    }


}
