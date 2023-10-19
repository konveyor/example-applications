package com.telran.application.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import dto.Book;

import java.io.*;
import java.util.HashMap;

public class BookModel {
    private static HashMap<Long, Book> library = new HashMap<Long, Book>();

    public static void writeBooksToFile(String fileName, int numBooks) throws IOException {
        File file = new File(fileName);
        file.createNewFile();

        PrintWriter pw = new PrintWriter(new FileWriter(file));

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());

        for (int i = 0; i < numBooks; i++)
            pw.println(mapper.writeValueAsString(Book.getRandomBook()));
        pw.close();
    }

    public static void readDB(String filename) throws IOException {

        File file = new File(filename);
        if (!file.exists()) return;

        BufferedReader br = new BufferedReader(new FileReader(file));
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());

        while (true){
            String line = br.readLine();
            if (line == null) break;
            Book book = mapper.readValue(line, Book.class);
            library.put(book.getISBN(), book);
//            System.out.println(book);
        }
        br.close();
        System.out.println(library);
    }

    public static HashMap<Long, Book> getAllBooks() {
        return library;
    }
}
