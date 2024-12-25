package Lesson_3.HomeWork;

import java.io.*;

public class FileHandler implements Writer{
    private final String dirName;

    public FileHandler(){
        this.dirName = "src\\Lesson_3\\HomeWork\\Data";
    }

    public void saveObject(Object object, String fileName) throws IOException {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(getFilePath(fileName))))
        {
            objectOutputStream.writeObject(object);
        }
    }

    public Object openObject(String fileName) throws IOException, ClassNotFoundException {
        Object object;

        try(ObjectInputStream objectInputStream =  new ObjectInputStream(new FileInputStream(getFilePath(fileName))))
        {
            object = objectInputStream.readObject();
        }

        return object;
    }

    private String getFilePath(String fileName){
        return this.dirName + "\\" + fileName;
    }
}
