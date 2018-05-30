package com.gmtok.dragon.base.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
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
public class YueUserFeed extends Model<YueUserFeed> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("id")
	private String id;
    /**
     * 姓名
     */
	@TableField("name")
	private String name;
    /**
     * 手机号
     */
	@TableField("phone")
	private String phone;
    /**
     * 创建时间
     */
	@TableField("create_time")
	private String createTime;
    /**
     * 内容
     */
	@TableField("content")
	private String content;
    /**
     * 状态
     */
	@TableField("status")
	private String status;


	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
