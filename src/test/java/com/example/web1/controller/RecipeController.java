package controller;

import com.example.web1.controller.Transaction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.RecipeService;

@RestController
@RequestMapping("/recipe")

public class RecipeController {
        private final RecipeService recipeService;

        public RecipeController (RecipeService recipeService, RecipeService recipeService1) {
                this.recipeService = recipeService1;
                this RecipeService resipeService = recipeService;
        }
        @PostMapping
        public ResponseEntity <Long> addTransaction (@RequestBody Transaction transaction) {
                long id = recipeService. addTransaction (transaction);
                return  ResponseEntity.ok (id);
                }
                @GetMapping("/{id}")
        public ResponseEntity<Object>
        getTransactionById (@PathVariable long id){
                Transaction trensacrtion = recipeService. getTransacrtion(id);
                        boolean transaction = false;
                        if (null == transaction){
                        return ResponseEntity. notFound(). build();
                }
                return ResponseEntity.ok (trensacrtion);
                }
}