package com.project.entity;

/**
 * Created by 大哲哥 on 2018/4/25.
 */
public enum RequestMsg {

    // 成功
    SUCCESS(0, "成功"),

    // 失败
    FAILED(-1, "服务器异常"),

    // 信息重复
    ERROR_REPEAT(-10, "信息重复"),

    // 密码错误
    ERROR_PWD(-11, "密码错误"),

    // 查无此信息
    ERROR_SELECT(-12, "查无此信息"),

    // 用户Id错误
    ERROR_LOGIN(-13, "请重新登录"),

    // 正在使用，无法删除
    ERROR_USED(-14, "正在使用"),

    // 没有需要上传的文件
    NULL_FILE(-22, "当前没有文件");

    private String msg;

    private int code = 0;

    private RequestMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
