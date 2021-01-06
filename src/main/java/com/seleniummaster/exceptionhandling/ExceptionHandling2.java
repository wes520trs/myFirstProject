package com.seleniummaster.exceptionhandling;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        try {
            int[] arr=new int[]{3,4,5};
            System.out.println(arr[5]);
//        }catch (Exception e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//            System.out.println("Exception catch");
//        }
        }catch (NullPointerException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("Exception catch");
        }finally {
            System.out.println("hello world");
        }

    }
}
