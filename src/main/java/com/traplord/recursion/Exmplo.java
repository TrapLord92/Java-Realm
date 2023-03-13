package com.traplord.recursion;

public class Exmplo {

  public static void main(String[] args){
        int result =calculatePower(2,3);
      System.out.println("The result is : " + result);
  }

    private static int calculatePower(int x, int y) {

      if(y==0){
          //base with y=0
          return 1;
      }else{
          //recursive case with y>0
          return x*calculatePower(x, y-1);
      }
    }


}
