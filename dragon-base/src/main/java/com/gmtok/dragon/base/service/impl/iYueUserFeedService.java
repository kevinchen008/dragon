package com.gmtok.dragon.base.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gmtok.dragon.base.entity.YueUserFeed;
import com.gmtok.dragon.base.mapper.YueUserFeedMapper;
import com.gmtok.dragon.base.service.YueUserFeedService;
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
public class iYueUserFeedService extends ServiceImpl<YueUserFeedMapper, YueUserFeed> implements YueUserFeedService {


    @Override
    public PageInfo<YueUserFeed> listPage( PagingRequest pagingRequest ) {
        PageHelper.startPage( pagingRequest.getPageNumber(), pagingRequest.getPageSize() );
        return new PageInfo<>( super.selectList( null ) );
    }
    
    
}
