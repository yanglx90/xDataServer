package cn.chinaunicom.util.exception;

/**
 * @author 杨立新
 * @version 1.0
 * TODO 自定义异常枚举类
 * @date 2019年12月26日 15:58
 */
public enum CommonEnum implements BaseErrorInfoInterface {

    /**
     * 调用成功返回状态
     */
    SUCCESS("200", "成功"),
    BODY_NOT_MATCH("301", "错误1"),
    INTERNAL_SERVER_ERROR("401", "错误2"),
    ARITHMETIC_EXCEPTION("500", "运算条件异常");

    private String resultCode;
    private String resultMsg;

    CommonEnum(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    /**
     * @return 返回错误码
     */
    @Override
    public String getResultCode() {
        return resultCode;
    }

    /**
     * @return 返回错误信息
     */
    @Override
    public String getResultMsg() {
        return resultMsg;
    }

}
