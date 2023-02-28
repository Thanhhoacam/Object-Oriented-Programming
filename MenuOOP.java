/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import control.Validations;
import java.util.*;
/**
 *
 * @author Trang Pham
 */
public abstract class MenuOOP {
    private String title;
    private ArrayList<String> options = new ArrayList<>();
    Validations valid = new Validations();
    
    //Contructor
    public MenuOOP(String title, String[] op){
        this.title = title;
        
        //Array -> ArrayList
        this.options.addAll(Arrays.asList(op));
    }
    //display menu of functions
    public void menuDislay(){
        System.out.println("----------------------------------");
        System.out.println(title);
        System.out.println("----------------------------------");
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
        System.out.println("0. Quit");
        System.out.println("----------------------------------");
    }
    
    //Enter user select
    public int getChoice() throws NumberFormatException{
        return Integer.parseInt(valid.getAndValidValue("Enter selection..", "[\\d]+", "Selection just a number"));
    }
    // check data that user input
    public void run(){
        while(true){
            menuDislay();
            int choice = getChoice();
            if(choice == 0){
                String confirm = valid.getAndValidValue("Do you want exit? (Y/N)", "[yYnN]", "Input must Y or N");
                if(confirm.equalsIgnoreCase("Y")) break;
                continue;
            }
            if(choice < 0 || choice > options.size()){
                System.out.println("Your choice must in 0 - " + options.size());
                continue;
            }
            excute(choice);
        }
    }
    //Redefine the function to call the functions corresponding to the user's selection
    public abstract void excute(int n);
}
