package com.learning;

import java.util.Scanner;

public class EmailCondition {
    public static void main(String[] args) {
    try {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your email id");
        String name=sc.next();
        int length = name.length();
        int ind = name.indexOf("a");
        boolean valid = false;
        for (int i = 0; i < name.length(); i++) {
            for (int j=0;j< name.length(); j++)
            {
                if (name.charAt(i) == '@')
                {
                    if (name.charAt(j)=='.')
                    {
                        valid=true;
                    }

                }
            }


        }
        if (valid==true)
        {
            System.out.println("Valid email id");
        }
        else
        {
            System.out.println("invalid email id");
        }
    }
    catch (Exception e)
    {
        System.out.println(e.getMessage());
    }


    }
}
