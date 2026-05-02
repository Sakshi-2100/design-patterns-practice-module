package designPatterns.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    List<FileSystem> fileSystems = new ArrayList<>();
    public void add(FileSystem fs){
        fileSystems.add(fs);
    }
    @Override
    public void ls() {
        for(FileSystem fileSystemsObj : fileSystems){
            fileSystemsObj.ls();
        }
    }
}
