package uz.jl.library.enums;

import lombok.AllArgsConstructor;
import org.bouncycastle.cert.dane.DANEEntry;


@AllArgsConstructor
public enum Language {
    EN("ENGLISH"),
    RU("RUSSIAN"),
    UZ("UZBEK"),
    UNKNOWN("UNKNOWN");
    private String name;

    public static Language convertor(String name) {
        name = name.toUpperCase();
        return switch (name) {
            case "ENGLISH", "EN" -> EN;

            case "RUSSIAN","RU" -> RU;
            case "UZBEK" ,"UZ" -> UZ;
            default -> UNKNOWN;
        };
    }
}
