package FourthTask;

import java.util.ArrayList;

public class File extends AbstractFileSystemNode{
    String parent = "";
    String name = "";
    String path = "";

    public File(String name){
        super(name);
        if(name.split("\\.").length == 2){
            this.name = name;
            this.path = name;
            this.parent = "";
            this.changePath(name);
        }
        else {
            System.out.print("Wrong file name. File not created.");
        }
    }

    //вывод расширения файла
    public String extention(){
        String ext = "";
        if(this.name != null){
            ext = this.name.split("\\.")[1];
        }
        else{
            ext = "File not found.";
        }
        return ext;
    }

    //вывод имени файла
//    public String returnName(){
//        return this.name;
//    }
}
