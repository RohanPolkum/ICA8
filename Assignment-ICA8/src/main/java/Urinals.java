import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
Author: Rohan Goud Polkumpally
ASURITE: rpolkump
*/
//import java.util.*;
public class Urinals {
    void writeToFile(ArrayList<String> list)
    {
        System.out.println("NA");
    }

    public int countUrinals(String c)
    {
        int output=0;
        int incrementor=0;
        for(int j=0;j<c.length();j++){

            if(c.charAt(j)=='1'){
                if(incrementor>=1)
                    incrementor--;
                int number=(incrementor%2);
                output+=incrementor/2+ number;
                incrementor=0;
            }
        }
        int number=(incrementor%2);
        output += incrementor/2 + number;
        return output;
    }
    public boolean goodString(String str)
    {
        if(str.isBlank()){
            return true;
        }
        for(char a:str.toCharArray()){
            if(a=='0' && a=='1');
            else return false;
        }
        return true;
    }
    public ArrayList<String> openFile(String file) throws FileNotFoundException{
        ArrayList<String> a=new ArrayList<String>();
        File _file=new File(file);
        Scanner sc=new Scanner(_file);
        while(sc.hasNextLine())
            a.add(sc.nextLine());
        return a;

    }
    public static void main(String[] args) {
        System.out.println("");
    }
}
