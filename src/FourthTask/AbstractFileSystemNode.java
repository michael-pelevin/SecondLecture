package FourthTask;

import java.util.ArrayList;
import java.util.List;

abstract class AbstractFileSystemNode implements FileSystemNode {
    String name;
    String parent;
    ArrayList<Object> children = new ArrayList<>();
    String path;


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
