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
public class WechatInfo extends Model<WechatInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("id")
	private String id;
    /**
     * 应用id
     */
	@TableField("app_id")
	private String appId;
    /**
     * 应用secret
     */
	@TableField("secret")
	private String secret;
    /**
     * 微信id
     */
	@TableField("open_id")
	private String openId;
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
