package cn.chinaunicom.util.exception;

import lombok.extern.log4j.Log4j2;

/**
 * @author 杨立新
 * @version 1.0
 * TODO 自定义异常类
 * @date 2019年12月26日 16:00
 */
@Log4j2
public class BizException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    protected String errorCode;
    protected String errorMsg;
    protected Object data;

    public BizException() {
        super();
    }

    public BizException(BaseErrorInfoInterface errorInfoInterface) {
        super(errorInfoInterface.getResultCode());
        this.errorCode = errorInfoInterface.getResultCode();
        this.errorMsg = errorInfoInterface.getResultMsg();
    }

    public BizException(BaseErrorInfoInterface errorInfoInterface, Throwable cause) {
        super(errorInfoInterface.getResultCode(), cause);
        this.errorCode = errorInfoInterface.getResultCode();
        this.errorMsg = errorInfoInterface.getResultMsg();
    }

    public BizException(String errorMsg) {
        super(errorMsg);
        this.errorMsg = errorMsg;
    }

    public BizException(String errorCode, String errorMsg) {
        super(errorCode);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public BizException(String errorCode, String errorMsg, Throwable cause) {
        super(errorCode, cause);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public BizException(BaseErrorInfoInterface internalServerError, Object data) {

        this.errorCode = internalServerError.getResultCode();
        this.errorMsg = internalServerError.getResultMsg();
        this.data = data;
    }


    @Override
    public Throwable fillInStackTrace() {
        return this;
    }


    public String getErrorMsg() {

        return errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public Object getData() {
        return data;
    }
}
