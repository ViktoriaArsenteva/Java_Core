package Sem5.src;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ResCopy {
    final String dirName = "backup";

    /**
     * Метод делает резервную копию всех файлов в указанной папке
     */
    public void Copy(){
        File dir = new File("./" + dirName);
        Boolean newDir = dir.mkdir();
        if (newDir == false){
            dir.delete();
            Copy();
        }
        File folder = new File("./Sem5/TxtFiles");
        for (File file : folder.listFiles()){
            Path pathFile = file.toPath();
            System.out.println(pathFile);
            try {
                pathFile = Files.copy(pathFile, Paths.get("./"+dirName + "/"+ file.getName()));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
