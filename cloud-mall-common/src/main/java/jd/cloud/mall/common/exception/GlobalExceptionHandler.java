package jd.cloud.mall.common.exception;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jd.cloud.mall.common.common.ApiRestResponse;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Set;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseBody
    public ApiRestResponse resolveConstraintViolationException(ConstraintViolationException exception) {
        Set<ConstraintViolation<?>> constraintViolations = exception.getConstraintViolations();
        // 处理异常信息
        if (!CollectionUtils.isEmpty(constraintViolations)) {
            StringBuilder messageBuilder = new StringBuilder();
            for (ConstraintViolation constraintViolation : constraintViolations) {
                messageBuilder.append(constraintViolation.getMessage()).append(",");
            }
            String errorMessage = messageBuilder.toString();
            if (errorMessage.length() > 1) {
                errorMessage.substring(0, errorMessage.length() - 1);
            }
            return ApiRestResponse.error(CloudMallExceptionEnum.REQUEST_PARAM_ERROR.code, errorMessage);
        }
        return ApiRestResponse.error(CloudMallExceptionEnum.PARA_NOT_NULL.code, CloudMallExceptionEnum.PARA_NOT_NULL.msg);
    }

}
