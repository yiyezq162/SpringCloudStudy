package icu.meet0208.user.service.impl;

import icu.meet0208.commons.entity.User;
import icu.meet0208.user.mapper.UserMapper;
import icu.meet0208.user.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author 黎锦斌
 * * @date 2023/7/24
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper mapper;

    @Override
    public User getUserById(int uid) {
        return mapper.getUserById(uid);
    }
}
