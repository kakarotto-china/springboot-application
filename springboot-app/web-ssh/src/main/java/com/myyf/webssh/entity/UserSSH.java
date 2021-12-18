package com.myyf.webssh.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.myyf.webssh.entity.convert.UserSSHConvert;
import lombok.Data;
import org.mapstruct.factory.Mappers;

/**
 * 表t_user_ssh实体
 */
@Data
@TableName("t_user_ssh")
public class UserSSH extends Model<UserSSH> {
    /**
     * 转换器
     */
    public static final UserSSHConvert CONVERT = Mappers.getMapper(UserSSHConvert.class);

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String name;

    @TableField("host")
    private String host;

    @TableField("port")
    private Integer port;

    @TableField("user")
    private String user;

    @TableField("passwd")
    private String passwd;

    @TableField("uid")
    private Long uid;
}
