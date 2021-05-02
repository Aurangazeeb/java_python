import static python.Python.*;
import python.os;

import java.util.ArrayList;

public class read_write {
    public static void main(String[] args) {
        // String filename = "hi.txt";
        String filename = "pytest.txt";
        String fileContent = "Test input line 1";
        String filecontent = openr(filename, (short)100);
        // print(filecontent);
        if (!filecontent.isEmpty()){
            printf("File content is : %s ", filecontent);
        }
        else printf("File %s is empty", filename);

        openw(filename, fileContent);
        print("checking types ");
        print(type(filename));
        print(type(5));

        ArrayList animalArrayList = listStr("cat", "dog", "mouse");
        ArrayList numArrayList = listInt(1,2,3);
        println("Printing arrays ");
        print("Animals");
        print(animalArrayList);
        for (Object animal : animalArrayList){
            println(_str(animal));
        }
        print("Numbers");
        print(numArrayList);
        for (Object number : numArrayList){
            println(_str(number));
        }
        print(os.getcwd());
        print(os.mkdirs())
    }
}
