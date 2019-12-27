package cn.chinaunicom.util.exception;

/**
 * @author 杨立新
 * @version 1.0
 * TODO 自定义异常接口类
 * @date 2019年12月26日 15:57
 */
public interface BaseErrorInfoInterface {
    /**
     * 获取错误码
     *
     * @return 返回错误码
     */
    String getResultCode();


    /**
     * 获取错误消息体
     *
     * @return 返回错误消息体
     */
    String getResultMsg();
}
