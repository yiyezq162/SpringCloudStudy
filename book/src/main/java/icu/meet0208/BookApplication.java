package icu.meet0208;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 黎锦斌
 * * @date 2023/7/24
 */

@SpringBootApplication
@MapperScan("icu.meet0208.book.mapper")
public class BookApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
    }
}
