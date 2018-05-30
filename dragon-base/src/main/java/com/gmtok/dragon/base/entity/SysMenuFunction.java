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
@TableName("sys_menu_function")
public class SysMenuFunction extends Model<SysMenuFunction> {

    private static final long serialVersionUID = 1L;

	private String id;
	@TableField("function_name")
	private String functionName;
	@TableField("menu_id")
	private String menuId;
	@TableField("function_path")
	private String functionPath;
	@TableField("order_index")
	private Integer orderIndex;
	private String status;
	private String remark;


	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
