package Controller;


import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import service.FileService;

import java.io.*;

@RestController
     @RequestMapping("/files")
     public class FileController {

    private final FileService fileService;
    private String recipeFileName;

    private String ingredientFileName;

      public FileController(FileService fileService, String recipeFileName) {
        this.fileService = fileService;
        this.recipeFileName = recipeFileName;
    }
    @GetMapping(value = "/export", produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<InputStreamResource> downloadRecipesData() throws FileNotFoundException {
        File file = fileService.getDataFile(recipeFileName);
        if (file.exists()) {
            InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
            return ResponseEntity.ok()
                    .contentLength(file.length())
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename = \"Recipes.json\"")
                    .body(resource);
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @PostMapping(value = "/recipes_import", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)

    public ResponseEntity<Void> uploadRecipes(@RequestParam MultipartFile file) {
        return getVoidResponseEntity(file, recipeFileName);
    }

    @PostMapping(value ="/ingredients_import", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)

    public ResponseEntity<Void> uploadIngredients(@RequestParam MultipartFile file) {
        return getVoidResponseEntity(file, ingredientFileName);
    }

    private ResponseEntity<Void> getVoidResponseEntity(@RequestParam MultipartFile file, String FileName) {
        FileService filesService;
        fileService.cleanDataFile(FileName);
        File dataFile = fileService.getDataFile(FileName);

        try (FileOutputStream fos = new FileOutputStream(dataFile)) {
            IOUtils.copy(file.getInputStream(), fos);
            return ResponseEntity.ok().build();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    public File getDataFile(String recipeFileName) {
        return null;
    }
}