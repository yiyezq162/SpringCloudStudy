package icu.meet0208.borrow.entity;

import icu.meet0208.commons.entity.Book;
import icu.meet0208.commons.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @author 黎锦斌
 * * @date 2023/7/24
 */
@Data
@AllArgsConstructor
public class UserBorrowDetail {
    User user;
    List<Book> bookList;
}