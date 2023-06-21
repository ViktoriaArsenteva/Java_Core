package Sem5.src;

import java.io.File;
import java.io.IOException;
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
            deleteDirectory(dir);
            dir.mkdir();
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
    /**
     * Метод удаляет директорию и все файлы в ней
     * @param dir 
     */
    public static void deleteDirectory(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i=0; i<children.length; i++) {
                File f = new File(dir, children[i]);
                deleteDirectory(f);
            }
            dir.delete();
        } else dir.delete();
    }
}
