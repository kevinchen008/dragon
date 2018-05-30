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
@TableName("sys_menu")
public class SysMenu extends Model<SysMenu> {

    private static final long serialVersionUID = 1L;

	private String id;
	@TableField("menu_name")
	private String menuName;
	@TableField("menu_path")
	private String menuPath;
	@TableField("menu_icon")
	private String menuIcon;
	@TableField("order_index")
	private Integer orderIndex;
	@TableField("menu_type")
	private String menuType;
	private String status;
	private String remark;
	private String pid;


	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
