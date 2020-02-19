
package getfileinfo;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.print.DocFlavor;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author Solet
 */
public class Cart {

    /**
     * @param args the command line arguments
     */
    int rn7 = 0, bs2 = 0, blackwidow = 0, deadthadder = 0, kraken = 0, index = 0, totalpieces = 0;
    int[] cost = {5890,16800,2990,990,3990};
    String start = "start";
    String SelectedItem = "";
    int whileyesno = 0;
        int whileyesno2 = 0;
        int end = 0, sport = 1;
        int mtransport1 = 45, mtransport2 = 20, mtransport3 = 48, mtransport4 = 55,sprice = 0;
        String compare = "Y";
        String cart = "haveitem";

    public void sw(int value) {
        switch (value - 1) {
            case 0:
                index = value - 1;
                rn7 = rn7 + 1;
                totalpieces++;
                break;
            case 1:
                totalpieces++;
                index = value - 1;
                bs2 = bs2 + 1;
                break;
            case 2:
                totalpieces++;
                index = value - 1;
                blackwidow = blackwidow + 1;
                break;
            case 3:
                totalpieces++;
                index = value - 1;
                deadthadder = deadthadder + 1;
                break;
            case 4:
                totalpieces++;
                index = value - 1;
                kraken = kraken + 1;
                break;
            default:
                System.out.println("Please Select 1,2,3,4 or 5");
                System.exit(0);
                break;
        }
sprice = sprice + cost[index];
                System.out.println("---------------------------------------------------------------");
    }
    
    public void sif() {

        if (rn7 > 0) {
            SelectedItem = SelectedItem + " Redmi Note 7[" + rn7 + "] ";
        }
        if (bs2 > 0) {
            SelectedItem = SelectedItem + " Black Shark 2[" + bs2 + "] ";
        }
        if (blackwidow > 0) {
            SelectedItem = SelectedItem + " Razer Black Widow[" + blackwidow + "] ";
        }
        if (deadthadder > 0) {
            SelectedItem = SelectedItem + " Razer Death Adder[" + deadthadder + "] ";
        }
        if (kraken > 0) {
            SelectedItem = SelectedItem + " Razer Kraken 7.1[" + kraken + "] ";
        }
        
        System.out.println("AllItem: " + totalpieces + "[" + SelectedItem + "]");
        System.out.println("Summary: " + sprice);
    }
    
   
    public void loopwhil(String newdata){
    while (whileyesno2 == 0) {
                    

                    if (newdata.equalsIgnoreCase(compare)) {
                        cart = "ClearItem";
                        System.out.println("---------------------------------------------------------------");
                        System.out.println("ได้ทำการยืนยันรายการสินค้าดังด้านล่างนี้");

                        Scanner pay = new Scanner(System.in);
                        System.out.println("---------------------------------------------------------------");
                        System.out.println("เลือกขั้นตอนการชำระเงิน");
                        System.out.print("โอนผ่านธนาคาร กด 1 \n");
                        System.out.print("True wallet กด 2 \n");
                        System.out.print("กรุณากรอกตัวเลือก : ");

                        int money = pay.nextInt();
                        while (end == 0) {
                            switch (money) {
                                case 1:
                                    System.out.println("---------------------------------------------------------------");
                                    System.out.println("ธนาคารกสิกร 222-2-22222-2 นายสุภเดช");
                                    System.out.println("ธนาคารไทยพาณิชย์ 222-2-22222-2 นายสุภเดช");
                                    System.out.println("ธนาคารกรุงไทย 222-2-22222-2 นายสุภเดช");
                                    System.out.println("ธนาคารกรุงเทพ 222-2-22222-2 นายสุภเดช");
                                    compare = "n";
                                    System.out.println("---------------------------------------------------------------");
                                    System.out.println("1.Kerry       2.ThaiPost     3.Lalamove       4.Alpha Fast");
                                    System.out.println("ส่งแบบ Kerry   ส่งแบบ ThaiPost  ส่งแบบ Lalamove   ส่งแบบ Alpha Fast  ");
                                    System.out.println("ค่าส่ง:+45      ค่าส่ง:+20        ค่าส่ง:+48         ค่าส่ง:+55:");
                                    System.out.print("เลือกวิธีขนส่ง :");
                                    Scanner tran = new Scanner(System.in);

                                    int tanr = tran.nextInt();
                                    
                                    while (sport == 1) {
                                        switch (tanr) {
                                            case 1:
                                                sprice = sprice + mtransport1;
                                                System.out.println("---------------------------------------------------------------");
                                                System.out.println("AllItem: " + totalpieces + "[" + SelectedItem + "]");
                                                System.out.println("รวมราคาพร้อมค่าส่ง :" + sprice);
                                                System.out.println("---------------------------------------------------------------");
                                                sport = 2;
                                                System.exit(0);
                                                break;
                                            case 2:
                                                sprice = sprice + mtransport2;
                                                System.out.println("---------------------------------------------------------------");
                                                System.out.println("AllItem: " + totalpieces + "[" + SelectedItem + "]");
                                                System.out.println("รวมราคาพร้อมค่าส่ง :" + sprice);
                                                System.out.println("---------------------------------------------------------------");
                                                sport = 2;
                                                System.exit(0);
                                                break;
                                            case 3:
                                                sprice = sprice + mtransport3;
                                                System.out.println("---------------------------------------------------------------");
                                                System.out.println("AllItem: " + totalpieces + "[" + SelectedItem + "]");
                                                System.out.println("รวมราคาพร้อมค่าส่ง :" + sprice);
                                                System.out.println("---------------------------------------------------------------");
                                                sport = 2;
                                                System.exit(0);
                                                break;
                                            case 4:
                                                sprice = sprice + mtransport4;
                                                System.out.println("---------------------------------------------------------------");
                                                System.out.println("AllItem: " + totalpieces + "[" + SelectedItem + "]");
                                                System.out.println("รวมราคาพร้อมค่าส่ง :" + sprice);
                                                System.out.println("---------------------------------------------------------------");
                                                sport = 2;
                                                System.exit(0);
                                                break;
                                            default:
                                                System.out.print("Try Again :");
                                                tanr = tran.nextInt();
                                                break;
                                        }
                                    }

                                    end = 1;
                                    break;
                                case 2:
                                    System.out.println("True Wallet : 089475456");
                                    compare = "n";
                                    System.out.println("---------------------------------------------------------------");
                                    System.out.println("1.Kerry       2.ThaiPost     3.Lalamove       4.Alpha Fast");
                                    System.out.println("ส่งแบบ Kerry   ส่งแบบ ThaiPost  ส่งแบบ Lalamove   ส่งแบบ Alpha Fast  ");
                                    System.out.println("ค่าส่ง:+45      ค่าส่ง:+20        ค่าส่ง:+48         ค่าส่ง:+55:");
                                    System.out.print("เลือกวิธีขนส่ง :");
                                    Scanner tran1 = new Scanner(System.in);

                                    int tanr1 = tran1.nextInt();

                                    while (sport == 1) {
                                        switch (tanr1) {
                                            case 1:
                                                sprice = sprice + mtransport1;
                                                System.out.println("---------------------------------------------------------------");
                                                System.out.println("AllItem: " + totalpieces + "[" + SelectedItem + "]");
                                                System.out.println("รวมราคาพร้อมค่าส่ง :" + sprice);
                                                System.out.println("---------------------------------------------------------------");
                                                sport = 2;
                                                System.exit(0);
                                                break;
                                            case 2:
                                                sprice = sprice + mtransport2;
                                                System.out.println("---------------------------------------------------------------");
                                                System.out.println("AllItem: " + totalpieces + "[" + SelectedItem + "]");
                                                System.out.println("รวมราคาพร้อมค่าส่ง :" + sprice);
                                                System.out.println("---------------------------------------------------------------");
                                                sport = 2;
                                                System.exit(0);
                                                break;
                                            case 3:
                                                sprice = sprice + mtransport3;
                                                System.out.println("---------------------------------------------------------------");
                                                System.out.println("AllItem: " + totalpieces + "[" + SelectedItem + "]");
                                                System.out.println("รวมราคาพร้อมค่าส่ง :" + sprice);
                                                System.out.println("---------------------------------------------------------------");
                                                sport = 2;
                                                System.exit(0);
                                                break;
                                            case 4:
                                                sprice = sprice + mtransport4;
                                                System.out.println("---------------------------------------------------------------");
                                                System.out.println("AllItem: " + totalpieces + "[" + SelectedItem + "]");
                                                System.out.println("รวมราคาพร้อมค่าส่ง :" + sprice);
                                                System.out.println("---------------------------------------------------------------");
                                                sport = 2;
                                                System.exit(0);
                                                break;
                                            default:
                                                System.out.print("Try Again :");
                                                tanr1 = tran1.nextInt();
                                                break;
                                        }
                                    }
                                    end = 1;
                                    break;
                                default:
                                    System.out.print("โปรดเลือกให้ถูก :");
                                    money = pay.nextInt();
                                    break;
                            }
                        }
                        whileyesno2 = 1;
                    } else if (newdata.equalsIgnoreCase("C")) {
                        rn7 = 0;
                        bs2 = 0;
                        blackwidow = 0;
                        deadthadder = 0;
                        kraken = 0;
                        totalpieces = 0;
                        sprice = 0;
                        SelectedItem = "";
                        index = 0;
                        start = "start";
                        whileyesno2 = 1;
                    } else {
                        System.out.println("คุณใส่รหัสผิดโปรแกรมหยุดการทำงาน");
                        System.exit(0);
                    }
                    newdata = "";
                }
    whileyesno2 = 0;
    }
  
}
