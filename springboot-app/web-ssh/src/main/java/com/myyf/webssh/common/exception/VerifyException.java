package com.myyf.webssh.common.exception;

import com.myyf.webssh.common.CodeEnum;
import com.myyf.webssh.common.International;

/**
 * 验证异常
 */
public class VerifyException extends ServiceRuntimeException {
    public VerifyException(CodeEnum codeEnum) {
        super(codeEnum);
    }

    public VerifyException(CodeEnum codeEnum, International error) {
        super(codeEnum, error);
    }
}
