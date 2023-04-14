package com.dclmsback.sys.service.impl;

import com.dclmsback.sys.entity.UserCompany;
import com.dclmsback.sys.mapper.UserCompanyMapper;
import com.dclmsback.sys.service.IUserCompanyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户-公司关联表 服务实现类
 * </p>
 *
 * @author bail
 * @since 2023-04-14
 */
@Service
public class UserCompanyServiceImpl extends ServiceImpl<UserCompanyMapper, UserCompany> implements IUserCompanyService {

}
