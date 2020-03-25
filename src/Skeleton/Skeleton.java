package Skeleton;



import Field.*;
import Item.*;
import Player.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Skeleton {
    static int n = 0;
    static HashMap<Object,String> names;
    public static void Initialise(){
        names = new HashMap<>();
    }
    public static void Called(Object object,String FuncHeader){
        for (int i = 0;i<n;i++) System.out.print("\t");
        System.out.println(names.get(object)+":"+FuncHeader+"()");
        n++;
    }

    public static void Return(){
        n--;
    }

    public static void Test1(){
        Player player = new Eskimo();
        Player target = new Researcher();
        Item rope = new Rope();
        Field mezo = new IceBlock();

        names.put(player,"EskimoPlayer");
        names.put(target,"ResearcherTarget");
        names.put(rope,"RopeItem");

        player.AcceptItem(rope);
        player.Step(mezo);

        try {
            Runtime.getRuntime().exec("cls");
        }catch(Exception e){
            System.out.println("Nem lehetett törölni a console-t");
        }


        player.UseItem(rope,target);

    }
    public static boolean Question(){
        String input;

        BufferedReader obj = new BufferedReader(new InputStreamReader((System.in)));
        try{input = obj.readLine();
            switch(input.charAt(0)) {
                case 'y':
                case 'Y':
                    return true;
                case'n':
                case'N':
                    return false;
                default:
                    return false;
            }



        }catch (Exception e){
            System.out.print("Input Failed");

        }
        return false;
    }

}
