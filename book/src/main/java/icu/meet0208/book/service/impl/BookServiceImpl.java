package icu.meet0208.book.service.impl;


import icu.meet0208.book.mapper.BookMapper;
import icu.meet0208.book.service.BookService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.awt.print.Book;

/**
 * @author 黎锦斌
 * * @date 2023/7/24
 */
@Service
public class BookServiceImpl implements BookService {

    @Resource
    BookMapper mapper;

    @Override
    public Book getBookById(int bid) {
        return mapper.getBookById(bid);
    }
}
