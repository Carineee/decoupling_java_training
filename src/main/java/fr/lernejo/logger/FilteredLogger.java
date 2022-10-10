package fr.lernejo.logger;

import java.util.function.Predicate;
import java.time.LocalDateTime;

public class FilteredLogger implements Logger{

    private final Logger delegate;
    private final Predicate<String> condition;

    public FilteredLogger(Logger delegate, Predicate<String> condition) {
        this.delegate = delegate;
        this.condition = condition;
    }

    @Override
    public void log(String message) {
        if(condition.test(message)) delegate.log(message);
    }

}
