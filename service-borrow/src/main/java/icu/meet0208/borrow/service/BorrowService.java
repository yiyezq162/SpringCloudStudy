package icu.meet0208.borrow.service;

import icu.meet0208.borrow.entity.UserBorrowDetail;

/**
 * @author 黎锦斌
 * * @date 2023/9/12
 */
public interface BorrowService {
    UserBorrowDetail getUserBorrowDetailByUid(int uid);
}
