package com.dclmsback.sys.service.impl;

import com.dclmsback.sys.entity.Role;
import com.dclmsback.sys.mapper.RoleMapper;
import com.dclmsback.sys.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统角色表 服务实现类
 * </p>
 *
 * @author bail
 * @since 2023-04-14
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
