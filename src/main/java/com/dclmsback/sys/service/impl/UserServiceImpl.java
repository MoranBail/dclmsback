package com.dclmsback.sys.service.impl;

import com.dclmsback.sys.entity.User;
import com.dclmsback.sys.mapper.UserMapper;
import com.dclmsback.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户表 服务实现类
 * </p>
 *
 * @author bail
 * @since 2023-04-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
