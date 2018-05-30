package com.gmtok.dragon.base.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Kevin.Chen
 * @since 2018-05-30
 */
@Data
@EqualsAndHashCode( callSuper = true )
@Accessors(chain = true)
@TableName("sys_role_menu_function")
public class SysRoleMenuFunction extends Model<SysRoleMenuFunction> {

    private static final long serialVersionUID = 1L;

	private String id;
	@TableField("role_id")
	private String roleId;
	@TableField("menu_function_id")
	private String menuFunctionId;


	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
