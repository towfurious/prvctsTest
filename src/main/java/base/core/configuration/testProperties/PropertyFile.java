package base.core.configuration.testProperties;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This class annotation gives an opportunity to read properties,
 * marked by {@link Property} annotation, from property file.
 * Insert .property file name from resources to value field of annotation and after than all
 * properties in annotated class will be loaded from this file
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface PropertyFile {
    String value() default "";
}
