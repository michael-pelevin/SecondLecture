package FourthTask;

import java.util.ArrayList;

public class Folder extends AbstractFileSystemNode{
    String parent = "";
    String name = "";
    String path = "";
    ArrayList<Object> children = new ArrayList<>();

    public Folder(String name) {
        super(name);
        this.name = name;
        this.parent = "";
        this.path = name;
        this.changePath(name);
    }

    public Folder(String name, Object... v) {
        super(name);
        this.name = name;
        this.path =  name;
        this.parent = "";
        this.changePath(name);


        for (int i = 0; i < v.length; i++) {
            Object child = v[i];

            if (child instanceof File) {
                ((File) child).path = this.name + "/" + ((File) child).path;
                ((File) child).changePath( ((File) child).path);
                ((File) child).parent = this.name;
                ((File) child).changeParent(this.name);
            }
            if (child instanceof Folder) {
                ((Folder) child).parent = this.name;
                ((Folder) child).changeParent(name);
                ((Folder) child).path = ((Folder) child).parent + "/" + ((Folder) child).path;
                ((Folder) child).changePath(((Folder) child).path);
                if (((Folder) child).children.size() != 0) {
                    changePaths(((Folder) child).children, ((Folder) child).path);
                }
            }
            this.children.add(child);
        }
    }

    //изменение потей дочених файлов и папок
    private void changePaths(ArrayList v, String parent) {

        for (int i = 0; i < v.size(); i++) {
            Object child = v.get(i);

            if (child instanceof File) {
                ((File) child).path = parent + "/" + ((File) child).name;
                ((File) child).changePath(((File) child).path);
            }
            if (child instanceof Folder) {
                ((Folder) child).path = parent + "/" + ((Folder) child).name;
                ((Folder) child).changePath(((Folder) child).path);
                if (((Folder) child).children.size() != 0) {
                    changePaths(((Folder) child).children, ((Folder) child).path);
                }
            }
        }

    }

    //способ добавления дочерних элементов после созданиия папки
    public void addChildren(Object... v) {

        for (int i = 0; i < v.length; i++) {

            Object child = v[i];

            if (child instanceof File) {
                ((File) child).path = name + "/" + ((File) child).name;
                ((File) child).changePath(((File) child).path);
                ((File) child).parent = this.name;
                ((File) child).changeParent(this.name);
            }
            if (child instanceof Folder) {

                ((Folder) child).path = this.name + "/" + ((Folder) child).path;
                ((Folder) child).changePath(((Folder) child).path);
                ((Folder) child).parent = this.name;
                ((Folder) child).changeParent(this.name);
                if (((Folder) child).children.size() != 0) {
                    changePaths(((Folder) child).children, ((Folder) child).path);
                }
            }
            this.children.add(child);
        }
    }

    //вывод списка дочерних элементов
    public ArrayList listChildren (){
        return this.children;
    }


    //вывод в виде строки всех дочерних элементов текущей папки
    public String showChildren() {
        String currentChildren = "";
        if (this.children.size() != 0){
            for (Object child : this.children){
                if (child instanceof File) {
                    currentChildren += ((File) child).name + "\n";
                }
                if (child instanceof Folder) {
                    currentChildren += ((Folder) child).name + "\n";
                }
            }
        }
        else {
            currentChildren += "Children list empty";
        }
        return currentChildren;
    }

    //имя текущей папки
//    public String returnName(){
//        return this.name;
//    }

}
