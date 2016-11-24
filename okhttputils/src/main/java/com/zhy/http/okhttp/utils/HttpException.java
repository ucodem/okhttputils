package com.zhy.http.okhttp.utils;

/**
 * 项目名称：HuixinDoctor
 * 类名称：com.zhy.http.okhttp.utils
 * 类描述：
 * 创建人：dxqit
 * 创建时间：2016/11/24 上午10:29
 *
 * @version 1.0.0
 */
public class HttpException extends Exception {

    private int code;

    public HttpException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
