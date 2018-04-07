package cn.edu.buaa.sms.core.exception;

/**
 * 封装sms的异常
 */
public class SmsException extends RuntimeException {

    private Integer code;

    private String message;

    public SmsException(ServiceExceptionEnum serviceExceptionEnum) {
        this.code = serviceExceptionEnum.getCode();
        this.message = serviceExceptionEnum.getMessage();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
