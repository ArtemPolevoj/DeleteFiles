import java.io.File;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        File[] openDir = Open.openFile();

        for (File dir : openDir) {
            if (dir.isFile()) {
                openFile(dir.getPath());
            } else {
                openDirectory(dir.getPath());
            }
        }
    }

    static void openFile(String path) {

        if(path.contains("pdf")){
            System.out.println("Файл - " + path);
        }



    /*    //  Calendar calendar = new Calendar() ;
       SimpleDateFormat formatDate = new SimpleDateFormat("LLLL yyyy");

        if (file.isFile()) {

        if(file.getPath().toLowerCase().contains("дефект") || file.getPath().toLowerCase().contains("разборк")){
            System.out.println("Удалён - " + file.getPath());
            file.delete();
        }

//            if(file.getName().toLowerCase().contains("jpg")){
//                String dateSaveFile = formatDate.format(new Date(file.lastModified()));
//
//                System.out.println("Картинка, дата обновления - " + dateSaveFile + "  " + file.getPath());
//            }else if (file.getName().toLowerCase().contains("mp4")) {
//                String dateSaveFile = formatDate.format(new Date(file.lastModified()));
//                System.out.println("Видео, дата обновления - " + dateSaveFile + "  " + file.getPath());
//            }
       }*/

    }

    static void openDirectory(String path) {

        File[] filesName = new File(path).listFiles();

        assert filesName != null;
        for (File file : filesName) {
            if (file.isFile()) {
                openFile(file.getPath());
            } else {
                 openDirectory(file.getPath());
            }
        }
    }
}