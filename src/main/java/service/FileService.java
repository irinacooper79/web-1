package service;

import java.io.File;

public interface FileService {
    boolean saveToFile(String fileName, String json);

    String readFromFile(String fileName);

    File getDataFile(String filensme);

    boolean cleanDataFile(String fileName);
}