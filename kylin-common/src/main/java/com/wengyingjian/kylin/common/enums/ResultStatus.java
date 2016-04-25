package com.wengyingjian.kylin.common.enums;

/**
 * Created by wengyingjian on 16/1/23.
 */
public enum ResultStatus {

    SUCCESS(0, "正常返回"), COMMON_ERROR(1, "程序异常");

    ResultStatus(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private int code;
    private String desc;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
