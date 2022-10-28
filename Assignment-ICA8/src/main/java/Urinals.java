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
    public ArrayList<String> openFile(String File) throws FileNotFoundException{
        return new ArrayList<>();

    }
    public static void main(String[] args) {
        System.out.println("");
    }
}
