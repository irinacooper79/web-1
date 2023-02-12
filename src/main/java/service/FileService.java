package service;

import Controller.FileController;
import model.Ingredient;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

public interface FileService {
    boolean saveToFile(String fileName, String json);

    String readFromFile(String fileName);

    default File getDataFile(String fileName) {
        return null;
    }

    boolean cleanDataFile(String fileName);
}