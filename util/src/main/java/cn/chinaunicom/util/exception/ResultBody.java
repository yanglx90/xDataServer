package cn.chinaunicom.util.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 杨立新
 * @version 1.0
 * TODO 统一返回格式
 * @date 2019年12月27日 08:20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultBody {
    /**
     * code 响应代码
     * message 响应消息
     * data 响应消息体
     */
    private String code;
    private String message;
    private Object data;

    public ResultBody(BaseErrorInfoInterface errorInfo) {
        this.code = errorInfo.getResultCode();
        this.message = errorInfo.getResultMsg();
        this.data = null;
    }


    /**
     * 返回成功信息，不携带消息体
     *
     * @return 统一返回API
     */
    public static ResultBody success() {
        return success(null);
    }

    /**
     * 返回成功信息，携带消息体
     *
     * @param data 消息体
     * @return 统一返回API
     */
    public static ResultBody success(Object data) {
        return new ResultBody(CommonEnum.SUCCESS.getResultCode(), CommonEnum.SUCCESS.getResultMsg(), data);
    }

    /**
     * 返回失败信息，不携带消息体
     *
     * @param errorInfo 错误枚举
     * @return 统一返回API
     */
    public static ResultBody error(BaseErrorInfoInterface errorInfo) {
        return new ResultBody(errorInfo);
    }

    /**
     * 返回失败信息，不携带消息体
     *
     * @param code    错误码
     * @param message 错误消息
     * @return 统一返回API
     */
    public static ResultBody error(String code, String message) {
        return error(code, message, null);
    }

    /**
     * 返回失败信息，不携带消息体
     *
     * @param message 错误消息
     * @return 统一返回API
     */
    public static ResultBody error(String message) {
        return error("-1", message);
    }

    /**
     * 返回失败信息，携带消息体
     *
     * @param code    错误码
     * @param message 错误消息
     * @param data    消息体
     * @return 统一返回API
     */
    public static ResultBody error(String code, String message, Object data) {
        return new ResultBody(code, message, data);
    }

    public static ResultBody error(Object e) {
        return error("-1",((Exception)e).getMessage(),e);
    }
}
