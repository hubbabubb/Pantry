package com.codecool.pantry.registration;

import java.util.function.Predicate;
import org.springframework.stereotype.Service;

@Service
public class EmailValidator implements Predicate<String> {

    @Override
    public boolean test(String s) {
        //TODO: validate email (regex)
        return true;
    }
}
