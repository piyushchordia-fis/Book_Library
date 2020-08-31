package com.library.book.controller;

import com.library.book.data.model.Book;
import com.library.book.data.model.Order;
import com.library.book.data.repository.BookRepository;
import com.library.book.data.repository.OrderRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@Api(value = "searchController", description = "This enpoints returns books")
public class MyController {

    @Autowired
    private BookRepository bookRepository;



    @RequestMapping(value = "/getBooks", method = RequestMethod.GET, produces = "application/json")
    @ApiOperation(value = "to get Books in library", response = List.class)
    public List<Book> getBooks() {
        List<Book> li = new ArrayList<Book>();
        bookRepository.findAll().forEach(li::add);
        return li;
    }
}
