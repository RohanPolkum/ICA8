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
    void openFile()
    {
        System.out.println("NA");
    }
    void getString()
    {
        System.out.println("NA");
    }
    void countUrinals()
    {
        System.out.println("NA");
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
