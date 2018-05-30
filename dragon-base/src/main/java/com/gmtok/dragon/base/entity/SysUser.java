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
@TableName("sys_user")
public class SysUser extends Model<SysUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
	private String id;
	@TableField("user_code")
	private String userCode;
	@TableField("user_name")
	private String userName;
	private String password;
	@TableField("user_type")
	private String userType;
	private String phone;
	private String email;
	@TableField("is_disabled")
	private String isDisabled;


	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
