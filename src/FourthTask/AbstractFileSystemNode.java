package FourthTask;

import java.util.ArrayList;

abstract class AbstractFileSystemNode implements FileSystemNode {
    String parent = "";
    String name = "";
    String path = "";


    public AbstractFileSystemNode(String name){
        this.name = name;
    }

    public void changePath(String newPath) {
        this.path = newPath;
    }
    public void changeParent(String newParent) {
        this.parent = newParent;
    }


    @Override
    public final String returnParent() {
        return this.parent;
    }

    @Override
    public String returnName() {
        return this.name;
    }

    @Override
    public final String returnPath() {
        return this.path;
    }

}
