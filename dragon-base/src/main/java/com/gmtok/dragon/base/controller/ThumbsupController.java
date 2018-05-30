package com.gmtok.dragon.base.controller;

import com.github.pagehelper.PageInfo;
import com.gmtok.dragon.base.entity.Thumbsup;
import com.gmtok.dragon.base.service.ThumbsupService;
import com.gmtok.dragon.base.utils.PagingRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Kevin.Chen
 * @since 2018-05-30
 */
@RestController
@RequestMapping("thumbsups")
public class ThumbsupController {

    private final Logger logger = LoggerFactory.getLogger(ThumbsupController.class);

    @Autowired
    private ThumbsupService iThumbsupService;

    /*
      
 主键  id  String         
      
 经纪人id  brokerId  String         
      
 资源id  sourceId  String         
      
 资源类型  sourceType  String         
      
 创建时间  createTime  String         
      
     */
    
    
    @GetMapping("{id}")
    public ResponseEntity< Thumbsup > get ( @PathVariable String id ){
        return ResponseEntity.ok().body(iThumbsupService.selectById( id ));
    }

    @GetMapping
    public ResponseEntity< PageInfo<Thumbsup> > list ( PagingRequest pagingRequest ){
        return ResponseEntity.ok().body(iThumbsupService.listPage( pagingRequest ));
    }

    @PostMapping
    public ResponseEntity insert ( @RequestBody Thumbsup requestThumbsup ){
        if ( !iThumbsupService.insert( requestThumbsup ) ){
            return ResponseEntity.badRequest().body("保存失败");
        }
        return ResponseEntity.ok("保存成功");
    }

    @PutMapping("{id}")
    public ResponseEntity update ( @PathVariable String id,
                                              @RequestBody Thumbsup requestThumbsup ){
        if ( ! iThumbsupService.updateById( requestThumbsup.setId(id)) ){
            return ResponseEntity.badRequest().body("更新失败");
        }
        return ResponseEntity.ok("更新成功");
    }

    @DeleteMapping("{id}")
    public ResponseEntity delete ( @PathVariable String id ){
        if ( ! iThumbsupService.deleteById(id) ){
            return ResponseEntity.badRequest().body("删除失败");
        }
        return ResponseEntity.ok("删除成功");
    }

    
    
}
