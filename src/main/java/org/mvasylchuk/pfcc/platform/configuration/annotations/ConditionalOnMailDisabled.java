package org.mvasylchuk.pfcc.platform.configuration.annotations;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@ConditionalOnProperty(name = "pfcc.app.mail.enabled", havingValue = "false", matchIfMissing = true)
public @interface ConditionalOnMailDisabled {
}