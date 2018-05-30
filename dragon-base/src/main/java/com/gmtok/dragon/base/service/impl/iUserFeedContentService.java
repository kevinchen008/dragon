package com.gmtok.dragon.base.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gmtok.dragon.base.entity.UserFeedContent;
import com.gmtok.dragon.base.mapper.UserFeedContentMapper;
import com.gmtok.dragon.base.service.UserFeedContentService;
import com.gmtok.dragon.base.utils.PagingRequest;
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
public class iUserFeedContentService extends ServiceImpl<UserFeedContentMapper, UserFeedContent> implements UserFeedContentService {


    @Override
    public PageInfo<UserFeedContent> listPage( PagingRequest pagingRequest ) {
        PageHelper.startPage( pagingRequest.getPageNumber(), pagingRequest.getPageSize() );
        return new PageInfo<>( super.selectList( null ) );
    }
    
    
}
