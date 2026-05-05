package designPatterns.compositePattern.fileSystem;

public class FileSystemMain {
    public static void main(String[] args) {
        Directory parentDir = new Directory();
        File f1 = new File("F1");
        parentDir.add(f1);
        Directory childDir = new Directory();
        File f2 = new File("F2");
        childDir.add(f2);
        parentDir.add(childDir);
        parentDir.ls();
    }
}
