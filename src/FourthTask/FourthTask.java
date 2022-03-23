package FourthTask;

public class FourthTask {
    public static void main(String[] args) {

        //создание корня файловой системы
        Folder root = new Folder("root");

        //создание некоторых папок и файлов
        File file1 = new File("file1.txt"); // folder1/file1.txt
        File file2 = new File("file1.exe");
        File file3 = new File("file3.exe");
        Folder folder1 = new Folder("folder1", file1, file2);
        Folder folder2 = new Folder("folder2", file3);

        //добавление в верхние каталоги системы
        folder2.addChildren(folder1);
        root.addChildren(folder2); // root/folder1
        System.out.println(folder2.path+ "  par "+ folder2.parent);
        System.out.println(folder1.path+ "  par "+ folder1.parent);
        System.out.println(file3.path+ "  par "+ file3.parent);
        System.out.println(file1.path+ "  par "+ file1.parent);

        //отображение содержимого папки
        System.out.println(folder1.showChildren());

        //список дочерних элементов
        System.out.println(folder1.listChildren());

        //расширение файла
        System.out.println(file1.extention());

        //название файла/папки
        System.out.println(file1.returnName());
        System.out.println(folder1.returnName());

    }
}
