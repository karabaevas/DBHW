package springexample.src.main.java.com.de;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface InjectRandomInt {
    int min();
    int max();
}
