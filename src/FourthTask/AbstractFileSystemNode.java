package FourthTask;

import java.util.ArrayList;

abstract class AbstractFileSystemNode implements FileSystemNode {
    String name;
    String parent;
    String path;


    public AbstractFileSystemNode(String name){
        this.name = name;
    }
//    public AbstractFileSystemNode(String name, Object ... v) {
//        this.name = name;
//        for (int i = 0; i < v.length; i++) {
//            Object child = v[i];
//            this.children.add(child);
//        }
//    }


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
