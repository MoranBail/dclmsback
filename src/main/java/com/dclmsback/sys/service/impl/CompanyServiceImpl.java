package com.dclmsback.sys.service.impl;

import com.dclmsback.sys.entity.Company;
import com.dclmsback.sys.mapper.CompanyMapper;
import com.dclmsback.sys.service.ICompanyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 公司表 服务实现类
 * </p>
 *
 * @author bail
 * @since 2023-04-14
 */
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements ICompanyService {

}
