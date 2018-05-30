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
@TableName("sys_org")
public class SysOrg extends Model<SysOrg> {

    private static final long serialVersionUID = 1L;

	private String id;
	@TableField("org_code")
	private String orgCode;
	@TableField("org_name")
	private String orgName;
	@TableField("org_code_path")
	private String orgCodePath;
	@TableField("org_level")
	private Integer orgLevel;
	@TableField("org_pid")
	private String orgPid;


	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
