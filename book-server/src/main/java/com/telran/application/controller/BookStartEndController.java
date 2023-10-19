package com.telran.application.controller;

import com.telran.application.model.BookModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(value="/startend")
public class BookStartEndController {

    @GetMapping(value = "/createDB")
    public Boolean createDB(@RequestParam(value = "file") String filename,
                            @RequestParam(value = "num") int numBooks) throws IOException {
        BookModel.writeBooksToFile(filename, numBooks);
        return true;
    }

    @GetMapping(value = "/readDB")
    public void readDB(@RequestParam(value = "file") String filename) throws IOException {
        BookModel.readDB(filename);
    }
}
