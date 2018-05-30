package com.gmtok.dragon.base.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gmtok.dargon.base.entity.SysUserGroupRole;
import com.gmtok.dargon.base.mapper.SysUserGroupRoleMapper;
import com.gmtok.dragon.base.service.SysUserGroupRoleService;
import com.goblin.common.PagingRequest;
import org.springframework.stereotype.Service;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Kevin.Chen
 * @since 2018-05-30
 */
@Service
public class SysUserGroupRoleServiceImpl extends ServiceImpl<SysUserGroupRoleMapper, SysUserGroupRole> implements SysUserGroupRoleService {


    @Override
    public PageInfo<SysUserGroupRole> listPage( PagingRequest pagingRequest ) {
        PageHelper.startPage( pagingRequest.getPageNumber(), pagingRequest.getPageSize() );
        return new PageInfo<>( super.selectList( null ) );
    }
    
    
}
