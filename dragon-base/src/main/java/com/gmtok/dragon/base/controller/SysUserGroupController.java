package com.gmtok.dragon.base.controller;

import com.github.pagehelper.PageInfo;
import com.gmtok.dargon.base.entity.SysUserGroup;
import com.gmtok.dargon.base.service.SysUserGroupService;
import com.goblin.common.PagingRequest;
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
@RequestMapping("sys-user-groups")
public class SysUserGroupController {
    @Autowired
    private SysUserGroupService ${serviceVariableName};

    /*
      
 id  String         
      
 groupName  String         
      
     */
    
    
    @GetMapping("{id}")
    public ResponseEntity< SysUserGroup > get ( @PathVariable ${primaryKeyTypeString} id ){
        return ResponseEntity.ok().setResponseContent(${serviceVariableName}.selectById( id ));
    }

    @GetMapping
    public ResponseEntity< PageInfo<SysUserGroup> > list ( PagingRequest pagingRequest ){
        return ResponseEntity.ok().setResponseContent(${serviceVariableName}.listPage( pagingRequest ));
    }

    @PostMapping
    public ResponseEntity insert ( @RequestBody SysUserGroup ${entityVariableName} ){
        if ( ! ${serviceVariableName}.insert( ${entityVariableName}) ){
            return ResponseEntity.badRequest("保存失败");    
        }
        return ResponseEntity.ok("保存成功");
    }

    @PutMapping("{id}")
    public ResponseEntity update ( @PathVariable ${primaryKeyTypeString} id,
                                              @RequestBody SysUserGroup ${entityVariableName} ){
        if ( ! ${serviceVariableName}.updateById( ${entityVariableName}.setId(id)) ){
            return ResponseEntity.badRequest("更新失败");    
        }
        return ResponseEntity.ok("更新成功");
    }

    @DeleteMapping("{id}")
    public ResponseEntity delete ( @PathVariable ${primaryKeyTypeString} id ){
        if ( ! ${serviceVariableName}.deleteById(id) ){
            return ResponseEntity.badRequest("删除失败");    
        }
        return ResponseEntity.ok("删除成功");
    }

    
    
}
