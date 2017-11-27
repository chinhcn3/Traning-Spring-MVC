package com.packt.webstore.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

/**
 * Created by ChinhVD on 11/24/17.
 */
public class ProcessingTimeLogInterceptor implements HandlerInterceptor {
    private static final Logger LOGGER = Logger.getLogger(ProcessingTimeLogInterceptor.class.getName());
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) {
        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);
        return true;
    }
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler, ModelAndView
                                   modelAndView) {
        String queryString = request.getQueryString() == null ?"" : " " + request.getQueryString();
        String path = request.getRequestURL() + queryString;
        long startTime = (Long)
                request.getAttribute("startTime");
        long endTime = System.currentTimeMillis();
        LOGGER.info(String.format("%s millisecond taken to process the request %s.",(endTime - startTime), path));
    }
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception
                                        exceptionIfAny){
        // NO operation.
    }

}
