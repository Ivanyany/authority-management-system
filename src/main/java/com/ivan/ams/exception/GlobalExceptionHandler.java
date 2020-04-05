package com.ivan.ams.exception;

import com.ivan.ams.util.IvanResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;


/**
 * @Auther: Ivan
 * @Date: 2020/4/4 12:43
 * @Description: 全局异常处理
 */
//@ControllerAdvice
//@Slf4j
//public class GlobalExceptionHandler {
//
//    @ExceptionHandler({HttpMessageNotReadableException.class,
//            HttpRequestMethodNotSupportedException.class,
//            HttpMediaTypeNotSupportedException.class,
//            TemplateModelException.class,
//            SQLException.class})
//    public void handleHttpMesageNotReadableException(HttpServletRequest request,
//                                                     HttpServletResponse response,
//                                                     Exception e){
//        IvanResult ivanResult = IvanResult.fail(e.getMessage());
//
//        try {
//            response.setContentType("application/json;charset=UTF-8");
//            PrintWriter writer = response.getWriter();
//            writer.write(JSONObject.toJSONString(ivanResult));
//            writer.flush();
//            writer.close();
//        } catch (IOException e1) {
//            e1.printStackTrace();
//        }
//    }
//}
