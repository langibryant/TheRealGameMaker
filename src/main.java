import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.*;


public class main {
    public static void main(String args[]) {
        Games gameList[] = new Games[200];

        Scanner nav = new Scanner(System.in);
        System.out.println("Press 1 to enter a new game and 2 to view existing games:");
        int myInt = nav.nextInt();
        if (myInt == 1){
            Scanner gInfo = new Scanner(System.in);
            Scanner gInfo2 = new Scanner(System.in);
            System.out.println("Enter Title:");
            String gTitle = gInfo.nextLine();
            System.out.println("Enter Price:");
            double gPrice = gInfo.nextDouble();
            System.out.println("Enter Genre:");
            String gGenre = gInfo2.nextLine();
            System.out.println("Enter Stock:");
            int gStock = gInfo.nextInt();
            StoreInventory games = new Games(gTitle, gPrice, gGenre, gStock);
            System.out.println(games.title);
        }




//        reading r = new reading();
//
//
//
//
//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("Press 1 to enter a new game and 2 to view existing games:");
//        int myInt = keyboard.nextInt();
//
//        if (myInt == 2){
//            r.read();
//        }
//
//        else if ( myInt == 1 ){
//            Scanner GINPUT = new Scanner(System.in);
//            System.out.println("Enter the name of your game:");
//            String name = GINPUT.nextLine();
//            System.out.println("Enter the Price of your game:");
//            String price = GINPUT.nextLine();
//            System.out.println("Press 1 if this is a action game, 2 if it is a RPG, or 3 if it is a survival game.");
//            int genra = GINPUT.nextInt();
//            String ggroup;
//            if ( genra == 1 ){
//                ggroup = "Action";
//            }
//            else if(genra == 2 ){
//                ggroup = "RPG";
//            }
//            else if(genra == 3){
//                ggroup = "Survival";
//            }
//            else{
//                ggroup = "Not Specified";
//            }
//            System.out.println("Enter The Number of Games in Stock:");
//            int stock = GINPUT.nextInt();
//            String gInfo = name + ", " + "$" + price + ", " + ggroup + ", # in stock:" + stock;
//            r.write(gInfo);
//        }
//
//        Scanner exit = new Scanner(System.in);
//        System.out.println("Press 1 if you would like to exit and 2 if you prefer to stay:");
//        int exits = keyboard.nextInt();

    }

}

