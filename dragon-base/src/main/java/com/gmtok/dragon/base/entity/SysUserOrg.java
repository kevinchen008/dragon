package com.gmtok.dragon.base.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
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
@TableName("sys_user_org")
public class SysUserOrg extends Model<SysUserOrg> {

    private static final long serialVersionUID = 1L;

    @TableId("user_id")
	private String userId;
	@TableField("org_id")
	private String orgId;
	private String id;


	@Override
	protected Serializable pkVal() {
		return this.userId;
	}

}
