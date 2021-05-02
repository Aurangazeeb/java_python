package python;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static java.lang.System.out;
// import java
// import

//lang, util, io, net, awt (gui element) are built in
public class Python{
        
    // public static void main(String[] args){
    //     String[] animals =  {"cat", "dog", "fish"};
    //     Python.println("Array print");
    //     for (String animal : animals){
    //         Python.println(animal);
    //     }
    //     ArrayList<String> arraAnimals = new ArrayList<>(Arrays.asList(animals));
    //     Python.println("ArrayList print");
    //     for (String animal: arraAnimals){
    //         Python.println(animal);
    //     }
    // }

    // // get input from user
    // public void getUserInput(){
    //     // Scanner input = new Scanner(System.in);
    //     // // show("im here 0");
    //     // String line = input.nextLine();
    //     // print(line);
    //     // input.close();
    //     Calendar cal = Calendar.getInstance();
    //     Date date = cal.getTime();
        
    //     //print time
    //     // print("Current time  is : " +_str(LocalTime.now()));
    //     // print("Current date obj is : " + _str(cal.getTime()));
    //     // print("Current month is : " + _str(cal.get(Calendar.MONTH/)));
    //     // print("Current day of month is : " + _str(cal.get(Calendar.DAY_OF_MONTH)));
    //     // print("Num fields  : " + _str(Calendar.FIELD_COUNT));
    //     List<Integer> list = new Arrays<Integer>();
    //     for (Integer i = 0; i<= Calendar.FIELD_COUNT;i++){
    //         _str(i.toString());
    //         list.add(i);
    //     }
    //     for (int field_id : list) {
    //         print("Field is : %d ", field_id);
    //     }
    //     // print("Current field 3 is : " + _str(cal.get(3)));
    //     // print("Current field 4 is : " + _str(cal.get(4)));
    //     // print("Current field 5 is : " + _str(cal.get(5)));


    // }

    public static void print(Object message){
        System.out.println(message);
    }
    public static void printf(String message, Object args){
        System.out.printf(message + "\n", args);
    }
    public static void println(String message){
        System.out.println(message);
    }
    
    public static String _str(Object obj){
        return String.valueOf(obj);
    }

    public static String type(Object obj){
        return obj.getClass().getSimpleName();
    }
    public static Object input(){
        Scanner scanner = new Scanner(System.in);
        out.print("Your input : ");
        Object inputObject = scanner.next();
        out.println("Your input is : " + inputObject);
        return inputObject;
    }

    public static String openr(String filename, Short stringlen){
        String returnString = "";
        if (stringlen == null){stringlen = 500;}
        char[] filearray = new char[stringlen];
        try{
            FileReader fileReader = new FileReader(filename);
            fileReader.read(filearray);
            fileReader.close();
            returnString = new String(filearray);
        }catch (IOException exception){
            // out.printf("File %s does not exist \n", filename);
            exception.getStackTrace();
        }
        return returnString;
    }

    public static void openw(String filename, String fileContent){
        boolean is_created;
        
        try {
            File file = new File(filename);
            is_created = file.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(filename);
            fileWriter.write(fileContent);
            fileWriter.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static ArrayList listStr(String ... strArray){
        ArrayList<String> pylist = new ArrayList<>(Arrays.asList(strArray));
        return pylist;
    }
    public static ArrayList listInt(Integer ... intArray){
        ArrayList<Integer> pylist = new ArrayList<>(Arrays.asList(intArray));
        return pylist;
    }
    public static ArrayList listObj(Object ... objArray){
        ArrayList<Object> pylist = new ArrayList<>(Arrays.asList(objArray));
        return pylist;
    }
    
}
