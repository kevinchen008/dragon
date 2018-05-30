package com.gmtok.dragon.base.service;

import com.baomidou.mybatisplus.service.IService;
import com.github.pagehelper.PageInfo;
import com.gmtok.dargon.base.entity.SysUser;
import com.goblin.common.PagingRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Kevin.Chen
 * @since 2018-05-30
 */
public interface SysUserService extends IService<SysUser> {
    
    /**
     * 默认分页(PageHelper分页)
     *   <pre>
     *      <table border="1">
     *          <caption>参数说明({@link PagingRequest})</caption>
     *          <tr>
     *              <td>参数名称</td>
     *              <td>参数类型</td>
     *              <td>参数说明</td>
     *          </tr>
     *          <tr>
     *              <td>PagingRequest#getPageNumber()</td>
     *              <td>int</td>
     *              <td>页码</td>
     *          </tr>
     *          <tr>
     *              <td>PagingRequest#getPageSize()</td>
     *              <td>int</td>
     *              <td>每页显示数量</td>
     *          </tr>
     *      </table>
     *      <br>
     *     示例 :
     *          <ul>
     *              <li> 1. PageInfo page = listPage(new PagingRequest(1,10)); </li>
     *              <li> 
     *                  2. 控制器中直接使用 PagingRequest 作为参数接收即可,就算客户端不传值也会有默认值. <br/>
     *                     默认分页起始值 : {@link com.goblin.common.GlobalConstant#DEFAULT_PAGE_NUMBER} <br/>
     *                     默认分页大小值 : {@link com.goblin.common.GlobalConstant#DEFAULT_PAGE_SIZE} 
     *              </li>
     *          </ul>
     *
     *
     *   </pre>   
     * @param pagingRequest
     * @return PageInfo
     */
    PageInfo<SysUser> listPage(PagingRequest pagingRequest);
    
    
    
        
}
