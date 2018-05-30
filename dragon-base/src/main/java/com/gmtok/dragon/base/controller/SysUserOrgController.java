package com.gmtok.dragon.base.controller;

import com.github.pagehelper.PageInfo;
import com.gmtok.dargon.base.entity.SysUserOrg;
import com.gmtok.dargon.base.service.SysUserOrgService;
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
@RequestMapping("sys-user-orgs")
public class SysUserOrgController {
    @Autowired
    private SysUserOrgService ${serviceVariableName};

    /*
      
 userId  String         
      
 orgId  String         
      
 id  String         
      
     */
    
    
    @GetMapping("{id}")
    public ResponseEntity< SysUserOrg > get ( @PathVariable ${primaryKeyTypeString} id ){
        return ResponseEntity.ok().setResponseContent(${serviceVariableName}.selectById( id ));
    }

    @GetMapping
    public ResponseEntity< PageInfo<SysUserOrg> > list ( PagingRequest pagingRequest ){
        return ResponseEntity.ok().setResponseContent(${serviceVariableName}.listPage( pagingRequest ));
    }

    @PostMapping
    public ResponseEntity insert ( @RequestBody SysUserOrg ${entityVariableName} ){
        if ( ! ${serviceVariableName}.insert( ${entityVariableName}) ){
            return ResponseEntity.badRequest("保存失败");    
        }
        return ResponseEntity.ok("保存成功");
    }

    @PutMapping("{id}")
    public ResponseEntity update ( @PathVariable ${primaryKeyTypeString} id,
                                              @RequestBody SysUserOrg ${entityVariableName} ){
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
