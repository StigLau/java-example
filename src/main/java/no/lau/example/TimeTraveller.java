package no.lau.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeTraveller {
    public static String convert(String epochDate) {
        return new SimpleDateFormat("dd.MM.yy")
                .format(
                        new Date(Long.parseLong(epochDate)));
    }
}
