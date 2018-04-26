package com.project.entity;

/**
 * 向前台返回的数据
 *
 * @param <T> 需要返回的数据类型
 * @author 大哲哥
 */
public class ResultData<T> {

    private T data;

    // 请求结果信息
    private String msg;

    private int code;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
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

    public void setStatus(RequestMsg requestMsg) {
        setCode(requestMsg.getCode());
        setMsg(requestMsg.getMsg());
    }

}
