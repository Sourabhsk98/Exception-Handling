package com.ExceptionOverLodingExample;
import java.io.IOException;
public class MethodOverLoading {

        void method(Exception e){
            System.out.println(e+" caught in Exception method");
        }
        void method(ArithmeticException ae){
            System.out.println(ae+" caught in ArithmeticException method");
        }

        public static void main(String[] args) {
            MethodOverLoading obj=new MethodOverLoading();
            obj.method(new ArithmeticException());
            obj.method(new IOException());
        }
    }


