/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import getfileinfo.Cart;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.junit.Test;

/**
 *
 * @author DarkUranus
 */
public class TestCart {

    @Test
    public static void main(String[] args) {
        String[] item = {"Redmi Note 7", "Black Shark 2", "Razer BlackWidow", "Razer DeathAdder", "Razer Kraken 7.1"};
        int[] cost = {5890, 16800, 2990, 990, 3990};
        int totalpieces = 0, sprice = 0, whileyesno = 0;
        String SelectedItem = "", h = "i", start = "start";

        String compare = "Y";

        String cart = "haveitem";
        int mtransport1 = 45, mtransport2 = 20, mtransport3 = 48, mtransport4 = 55, whileyesno2 = 0;
        int rn7 = 0, bs2 = 0, blackwidow = 0, deadthadder = 0, kraken = 0;

        Cart run = new Cart();
try{
        while (whileyesno2 == 0) {

            while (h == "i") {

                Scanner selectarray = new Scanner(System.in);
                System.out.println("---------------------------------------------------------------");
                for (int i = 0, j = 1; i < item.length; i++, j++) {

                    System.out.print(j + ". " + item[i] + " ราคา :" + cost[i] + "   \n");
                }
                System.out.println("---------------------------------------------------------------");
                System.out.print("Choose item: ");
                whileyesno = 0;
                
                int value = selectarray.nextInt();

                run.sw(value);

                while (whileyesno == 0) {
                    System.out.print("Do you want to buy more? [Y/N]: ");
                    Scanner newstring = new Scanner(System.in);
                    String buyornot = newstring.nextLine();
                System.out.println("---------------------------------------------------------------");
                    if (buyornot.equalsIgnoreCase("N")) {
                        start = "unstart";
                        h = "j";
                        whileyesno = 1;
                    } else if (buyornot.equalsIgnoreCase("Y")) {
                        whileyesno = 1;
                        buyornot = "";
                        h = "i";
                    } else {
                        System.out.println("คุณใส่รหัสผิดโปรแกรมหยุดการทำงาน");
                        System.exit(0);
                        break;
                    }

                }
            }
            h = "i";
            run.sif();
            System.out.println("---------------------------------------------------------------");
            System.out.print("Comfirm or Clear order [Y/C]: ");
            Scanner again = new Scanner(System.in);
            String newdata = again.nextLine();
            run.loopwhil(newdata);

        }

        System.out.println("---------------------------------------------------------------");

    }
     catch (InputMismatchException nfe) {
            System.out.println("กรอกผิดปิดโปรแกรม");
        }
    
    }
   
          
}
