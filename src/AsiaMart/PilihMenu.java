
package AsiaMart;

import java.util.Scanner;

public class PilihMenu extends Menu{
    int pilihmenu, nominal, kembalian, jmlh, total;

    void menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nomor: ");
        pilihmenu = input.nextInt();
        System.out.println("----------------");
    

        switch(pilihmenu){
            case 1:
                System.out.println("--Pilihan Menu--");
                System.out.println("Lemon Tea");
                System.out.println("Harga : Rp 7.000;");
                System.out.println("----------------");
                System.out.println("Jumlah Minuman yang Dipesan= ");
                jmlh = input.nextInt();
                total = jmlh*7000;
                System.out.println("Total Harga= "+total);
                System.out.println("Input Nominal Anda= ");
                nominal = input.nextInt();
                kembalian = nominal-total;
                System.out.println("------------------------");
                System.out.println("Kembalian Anda: "+kembalian);
                System.out.println("------Terima Kasih------");
                break;
                
            case 2:
                System.out.println("--Pilihan Menu--");
                System.out.println("Thai Tea");
                System.out.println("Harga : Rp 8.500;");
                System.out.println("----------------");
                System.out.println("Jumlah Minuman yang Dipesan= ");
                jmlh = input.nextInt();
                total = jmlh*8500;
                System.out.println("Total Harga= "+total);
                System.out.println("Input Nominal Anda= ");
                nominal = input.nextInt();
                kembalian = nominal-total;
                System.out.println("------------------------");
                System.out.println("Kembalian Anda: "+kembalian);
                System.out.println("------Terima Kasih------");
                break;
                
            case 3:
                System.out.println("--Pilihan Menu--");
                System.out.println("Milk Tea");
                System.out.println("Harga : Rp 9.000;");
                System.out.println("----------------");
                System.out.println("Jumlah Minuman yang Dipesan= ");
                jmlh = input.nextInt();
                total = jmlh*9000;
                System.out.println("Total Harga= "+total);
                System.out.println("Input Nominal Anda= ");
                nominal = input.nextInt();
                kembalian = nominal-total;
                System.out.println("------------------------");
                System.out.println("Kembalian Anda: "+kembalian);
                System.out.println("------Terima Kasih------");
                break;
                
           default:
               System.out.println("----Error----");  
        }
        
      }


    }
    

