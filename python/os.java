package python;

import java.io.File;

public class os {
    
    public static String getcwd(){
        String cwd ;
        cwd = System.getProperty("user.dir");
        return cwd;
    }

    public static boolean mkdirs(String filepath){
        boolean is_created;
        File file = new File(filepath);
        is_created = file.mkdirs();
        return is_created;
    }
}
