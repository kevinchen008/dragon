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
public class Thumbsup extends Model<Thumbsup> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("id")
	private String id;
    /**
     * 经纪人id
     */
	@TableField("broker_id")
	private String brokerId;
    /**
     * 资源id
     */
	@TableField("source_id")
	private String sourceId;
    /**
     * 资源类型
     */
	@TableField("source_type")
	private String sourceType;
    /**
     * 创建时间
     */
	@TableField("create_time")
	private String createTime;


	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
