package org.courrier.config;

import org.apache.commons.lang.CharEncoding;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.*;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

@Configuration
public class ThymeleafConfiguration {

    @SuppressWarnings("unused")
    private final Logger log = LoggerFactory.getLogger(ThymeleafConfiguration.class);

    @Bean
    @Description("Thymeleaf template resolver serving HTML 5 emails")
    public ClassLoaderTemplateResolver emailTemplateResolver() {
        ClassLoaderTemplateResolver emailTemplateResolver = new ClassLoaderTemplateResolver();
        emailTemplateResolver.setPrefix("mails/");
        emailTemplateResolver.setSuffix(".html");
        emailTemplateResolver.setTemplateMode("HTML5");
        emailTemplateResolver.setCharacterEncoding(CharEncoding.UTF_8);
        emailTemplateResolver.setOrder(2);
        return emailTemplateResolver;
    }

    @Bean
    @Description("Thymeleaf template resolver serving HTML 5 default")
    public ClassLoaderTemplateResolver defaultTemplateResolver() {
        ClassLoaderTemplateResolver defaultTemplateResolver = new ClassLoaderTemplateResolver();
        defaultTemplateResolver.setPrefix("templates/");
        defaultTemplateResolver.setSuffix(".html");
        defaultTemplateResolver.setTemplateMode("HTML5");
        defaultTemplateResolver.setCharacterEncoding(CharEncoding.UTF_8);
        defaultTemplateResolver.setOrder(1);
        return defaultTemplateResolver;
    }
}
