package io.ivanbyone.ghook.types;

public enum ConfigFormat {
    YAML("yaml");

    private final String format;

    ConfigFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
