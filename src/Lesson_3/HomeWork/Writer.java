package Lesson_3.HomeWork;

import java.io.IOException;

interface Writer {
    Object openObject(String fileName) throws IOException, ClassNotFoundException;
    void saveObject(Object object, String fileName) throws IOException;
}
