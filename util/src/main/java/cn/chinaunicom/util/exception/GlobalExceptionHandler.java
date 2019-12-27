package cn.chinaunicom.util.exception;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 杨立新
 * @version 1.0
 * TODO 全局异常处理类
 * @date 2019年12月27日 08:28
 */
@Log4j2
@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 处理自定义的业务异常
     *
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = BizException.class)
    @ResponseBody
    public ResultBody bizExceptionHandler(HttpServletRequest req, BizException e) {
        log.error("发生业务异常！原因是：{}", e.getErrorMsg());
        return ResultBody.error(e.getErrorCode(), e.getErrorMsg(), e.getData());
    }

    /**
     * 处理空指针的异常
     *
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = NullPointerException.class)
    @ResponseBody
    public ResultBody exceptionHandler(HttpServletRequest req, NullPointerException e) {
        log.error("发生空指针异常！原因是:", e);
        return ResultBody.error(CommonEnum.BODY_NOT_MATCH);
    }


    /**
     * 处理其他异常
     *
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultBody exceptionHandler(HttpServletRequest req, Exception e) {
        log.error("未知异常！原因是:" + e);
        return ResultBody.error(CommonEnum.INTERNAL_SERVER_ERROR);
    }

    /**
     * 处理运算条件异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = ArithmeticException.class)
    @ResponseBody
    public ResultBody exceptionHandler(ArithmeticException e) {
        log.error("运算条件异常！原因是:", e);
        return ResultBody.error(CommonEnum.ARITHMETIC_EXCEPTION);
    }
}
