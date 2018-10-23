package pl.kurs.adnotacje;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyDocumentation {
    String author();
    String comment();
}
