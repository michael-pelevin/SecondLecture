package FourthTask;

public class FourthTask {
    public static void main(String[] args) {

        //создание корня файловой системы
        Folder root = new Folder("root");

        //создание некоторых папок и файлов
        File file1 = new File("file1.txt");
        File file2 = new File("file2.exe");
        File file3 = new File("file3.exe");
        Folder folder1 = new Folder("folder1", file1, file2);
        Folder folder2 = new Folder("folder2", folder1, file3);

        //добавление в верхние каталоги системы
        root.addChildren(folder2);


        //отображение содержимого папки
        System.out.println(folder1.showChildren());

        //список дочерних элементов
        System.out.println(folder1.listChildren());

        //расширение файла
        System.out.println(file1.extention());

        //вывод названия, пути и родителя файла/папки
        System.out.println("---------");
        System.out.println(file1.returnName());
        System.out.println(folder1.returnName());
        System.out.println("---------");
        System.out.println(file1.returnPath());
        System.out.println(folder1.returnPath());
        System.out.println("---------");
        System.out.println(file1.returnParent());
        System.out.println(folder1.returnParent());
        System.out.println("---------");
        System.out.println(file2.returnName());
        System.out.println(folder2.returnName());
        System.out.println("---------");
        System.out.println(file2.returnPath());
        System.out.println(folder2.returnPath());
        System.out.println("---------");
        System.out.println(file2.returnParent());
        System.out.println(folder2.returnParent());

    }
}
