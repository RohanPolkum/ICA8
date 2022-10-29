import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
Author: Rohan Goud Polkumpally
ASURITE: rpolkump
*/
//import java.util.*;
public class Urinals {
    public ArrayList<String> a=new ArrayList<String>();
    public void editFile(ArrayList<String> list){
        try{
            BufferedWriter wr=new BufferedWriter(
                    new FileWriter("src/results.txt"));
            System.out.println("hhhh");
            for(String c: list){
                wr.write(c);
                wr.newLine();
            }
            wr.close();
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    public int countUrinals(String c)
    {
        if(validString(c)) return -1;
        int output=0;
        int incrementor=0;
        for(int j=0;j<c.length();j++){
            if(c.charAt(j)=='0'){
                incrementor++;
                if(j>=1&&c.charAt(j-1)=='1' ){
                    incrementor--;
                }

            }
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
    Boolean goodString(String x){
        if(x==null || x.isBlank()) return false;
        for(int j=0; j<x.length();j++){
            if(x.charAt(j)=='1' && j+1<x.length() && x.charAt(j+1)=='1') return false;
        }
        return false;
    }
    //
    public boolean validString(String str) //goodString -> validateString
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

        File _file=new File(file);
        Scanner sc=new Scanner(_file);
        while(sc.hasNextLine()){
            String s=sc.nextLine().trim();
        }
        return a;

    }
    public static void main(String[] args) throws IOException {
        Urinals u=new Urinals();
        Scanner sc=new Scanner(System.in);
        int select;
        String value;
        System.out.println("Select input type \n1.command line\n2.text file");
        select=sc.nextInt();
        if(select==1)
        {
            while(true)
            {
                System.out.println("Enter the string or type -1 for exit");
                value=sc.next();
                if(Integer.parseInt(value) == -1)
                {
                    break;
                }
                else
                {
                    System.out.println(u.countUrinals(value));
                }
            }

        }
        else if (select==2)
        {
            System.out.println("Enter the input file");
            value=sc.next();
            u.openFile(value);
            u.editFile(u.a);
            System.out.println("Output file created");
        }
    }
}
