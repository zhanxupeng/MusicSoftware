package com.design.controller.base;

import com.design.common.base.Response;
import com.design.common.enumeration.ResultEnum;
import com.design.common.exception.BaseRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseController {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    protected Response success() {
        return new Response<Boolean>(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMessage()).setData(true);
    }

    protected Response fail(String code, String message) {
        return new Response<Boolean>(code, message).setData(false);
    }

    protected Response fail(BaseRuntimeException e) {
        return new Response<Boolean>(e.getCode(), e.getMessage());
    }

    protected <T> Response result(T t) {
        return new Response<T>(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMessage()).setData(t);
    }
}
