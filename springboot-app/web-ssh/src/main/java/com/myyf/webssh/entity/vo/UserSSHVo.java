package com.myyf.webssh.entity.vo;

import lombok.Data;

@Data
public class UserSSHVo {
    private Long id;

    private String name;

    private String host;

    private String user;

    private Long uid;
}