package icu.meet0208.borrow;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 黎锦斌
 * * @date 2023/7/24
 */

@SpringBootApplication
@MapperScan("icu.meet0208.borrow.mapper")
public class BorrowApplication {
    public static void main(String[] args) {
        SpringApplication.run(BorrowApplication.class, args);
    }
}
