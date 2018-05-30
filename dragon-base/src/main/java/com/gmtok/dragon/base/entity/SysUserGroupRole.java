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
@TableName("sys_user_group_role")
public class SysUserGroupRole extends Model<SysUserGroupRole> {

    private static final long serialVersionUID = 1L;

	@TableField("user_group_id")
	private String userGroupId;
	@TableField("role_id")
	private String roleId;
	private String id;


	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
