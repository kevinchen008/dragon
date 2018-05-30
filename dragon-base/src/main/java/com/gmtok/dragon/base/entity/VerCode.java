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
public class VerCode extends Model<VerCode> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("id")
	private String id;
    /**
     * 手机号
     */
	@TableField("phone")
	private String phone;
    /**
     * 验证码
     */
	@TableField("v_code")
	private String vCode;
    /**
     * 类型
     */
	@TableField("code_type")
	private String codeType;
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
