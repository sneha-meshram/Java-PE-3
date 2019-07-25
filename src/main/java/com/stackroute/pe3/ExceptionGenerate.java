package com.stackroute.pe3;

public class ExceptionGenerate {
    public static void main(String[] args) {

       // IndexOutOfBoundsException
        try{
            int arr[]=new int[3];
            arr[3]=30;
        }catch(IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundsException");
        }

        //NegativeArraySizeException
        try{
            int arr[]=new int[-3];
        }catch(NegativeArraySizeException e){
            System.out.println("NegativeArraySizeException");
        }
        // NullPointerException
        try{
            int arr[]=null;
            int lengthOfarray=arr.length;
        }catch(NullPointerException e){
            System.out.println("NullPointerException");
        }
    }

}
