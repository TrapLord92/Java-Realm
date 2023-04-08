package com.traplord.generics.generic_class;

public class Main {

   public static void main(String[] args){
        GenericClass <String> generic=new GenericClass<>();

        generic.setT("Bernardo");
        generic.getT();
       System.out.println(generic);
   }


}
