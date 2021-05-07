package pratice_pograms;

import java.util.Scanner;

public class tictaktoe {
    public static int checking(String [][] arr , int flag,String n1,String n2) {
        String r1 = arr[0][0]+arr[0][1]+arr[0][2];
        String r2 = arr[1][0]+arr[1][1]+arr[1][2];
        String r3 = arr[2][0]+arr[2][1]+arr[2][2];

        String c1 = arr[0][0]+arr[1][0]+arr[2][0];
        String c2 = arr[0][1]+arr[1][1]+arr[2][1];
        String c3 = arr[0][2]+arr[1][2]+arr[2][2];

        String d1 = arr[0][0]+arr[1][1]+arr[2][2];
        String d2 = arr[0][2]+arr[1][1]+arr[2][0];

        if(r1.equals("XXX") || r2.equals("XXX")|| r3.equals("XXX") ){
            System.out.println(n1+" Wins!!!");
            flag  = 1;
        }
        else if(c1.equals("XXX") || c2.equals("XXX")|| c3.equals("XXX") ){
            System.out.println(n1+" Wins!!!");
            flag  = 1;
        }
        else if(d1.equals("XXX") || d2.equals("XXX")){
            System.out.println(n1+" Wins!!!");
            flag  = 1;
        }
        else if(r1.equals("OOO") || r2.equals("OOO")|| r3.equals("OOO") ){
            System.out.println(n2+" Wins!!!");
            flag  = 1;
        }
        else if(c1.equals("OOO") || c2.equals("OOO")|| c3.equals("OOO") ){
            System.out.println(n2+" Wins!!!");
            flag  = 1;
        }
        else if(d1.equals("OOO") || d2.equals("OOO") ){
            System.out.println(n2+" Wins!!!");
            flag  = 1;
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String [][] arena = new String[3][3];
        for (int i = 0; i < arena.length; i++) {
            for (int j = 0; j < arena.length; j++) {
                arena[i][j] = "■";
            }
        }
        int rows, columns;
        int f = 0;
        System.out.print("\t\tWELCOME TO TIC-TAK-TOK\n\n");
        System.out.println("NOTE : just enter rows and column number and that place is your's :)\n\n");
        System.out.print("PLAYER 1 : Enter your name : \n");
        String p_n_1 = s.nextLine();
        System.out.print("PLAYER 2 : Enter your name : \n");
        String p_n_2 = s.nextLine();

            for (int i = 0; i < 9; i++) {
                
                if (i % 2 == 0) {
                    System.out.println(p_n_1 + " Enter rows and column number : ");
                    rows = s.nextInt();
                    columns = s.nextInt();
                    arena[rows][columns] = "X";
                  
                } else {
                    System.out.println(p_n_2 + " Enter rows and column number : ");
                    rows = s.nextInt();
                    columns = s.nextInt();
                    arena[rows][columns] = "O";
                  
                }
                
                System.out.println("\n");
                for (int j = 0; j < arena.length; j++) {
                    for (int j2 = 0; j2 < arena.length; j2++) {
                        System.out.print(arena[j][j2]+"  ");
                    }
                    System.out.println("\n");
                }
                
                f = checking(arena,f,p_n_1,p_n_2);
                if(f == 1){
                    break;
                }
            }
            if(f == 0){
                System.out.println("Draw......!!!");
            }

    s.close();
    }
}
