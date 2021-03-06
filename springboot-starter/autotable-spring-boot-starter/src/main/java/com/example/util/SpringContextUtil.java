package com.example.util;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.lang.TypeReference;
import lombok.Getter;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Spring容器上下文
 *
 */
@Component
public class SpringContextUtil implements ApplicationContextAware {
    @Getter
    private static ApplicationContext context;

    public static <T> T getBean(Class<? extends T> beanClass) {
        return context.getBean(beanClass);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextUtil.context = applicationContext;
    }

    public static <T> List<T> getBeans(Class<T> type) {
        Map<String, T> types = context.getBeansOfType(type);
        return new ArrayList<T>(types.values());
    }

    public static <T> List<T> getBeans(TypeReference<List<T>> reference) {
        Map<String, ? extends Type> types = context.getBeansOfType(reference.getType().getClass());
        Collection<? extends Type> values = types.values();
        return Convert.convert(reference, values);
    }

    public static Map<String, Object> getBeansWithAnnotation(Class<? extends Annotation> annotationClass) {
        return context.getBeansWithAnnotation(annotationClass);
    }

    public static <T> Map<String, T> getBeansOfType(Class<T> clazz){
        return context.getBeansOfType(clazz);
    }
}
