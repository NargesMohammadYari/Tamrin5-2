package com.company;
import java.util.Scanner;
/**
 * Created by narges nastran on 11/02/2019.
 */
public class Form {
    private static Form form=new Form();
    public static Form getInstance(){return form;}
    private Form(){}
    public void firstName(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your first name");
        String firstName=scanner.nextLine();
        System.out.println("enter your first name:"+firstName);
    }
    public void lastName(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter last name");
        String lastName=scanner.nextLine();
        System.out.println("enter your last name:"+lastName);
    }
}
