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
@TableName("sys_role")
public class SysRole extends Model<SysRole> {

    private static final long serialVersionUID = 1L;

	private String id;
	@TableField("role_name")
	private String roleName;
	private String status;
	private String remark;


	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
