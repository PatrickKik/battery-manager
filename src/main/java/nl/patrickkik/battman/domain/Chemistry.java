package nl.patrickkik.battman.domain;

import java.util.stream.Stream;

public enum Chemistry {

    NICD ("NiCd"),
    NIMH ("NiMH"),
    LIION ("Li-ion");

    private final String abbreviation;

    Chemistry(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public static Chemistry of(final String abbreviation) {
        return Stream.of(values())
                .filter(c -> c.getAbbreviation().equals(abbreviation))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("No Chemistry found for " + abbreviation));
    }
}
