package com.gmtok.dragon.base.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gmtok.dragon.base.entity.Thumbsup;
import com.gmtok.dragon.base.mapper.ThumbsupMapper;
import com.gmtok.dragon.base.service.ThumbsupService;
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
public class iThumbsupService extends ServiceImpl<ThumbsupMapper, Thumbsup> implements ThumbsupService {


    @Override
    public PageInfo<Thumbsup> listPage( PagingRequest pagingRequest ) {
        PageHelper.startPage( pagingRequest.getPageNumber(), pagingRequest.getPageSize() );
        return new PageInfo<>( super.selectList( null ) );
    }
    
    
}
