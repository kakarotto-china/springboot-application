/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package com.example.enums;

import com.example.exception.AutoTableException;

import lombok.NonNull;

/**
 * @author yWX978481
 * @since 2021/10/26
 */
public enum ProductType {
    MYSQL;

    public static ProductType findByProductName(@NonNull String productName) {
        String name = productName.toLowerCase();
        if ("mysql".equals(name)) {
            return MYSQL;
        }
        throw new AutoTableException("不支持的数据库枚举类型: " + name);
    }
}
