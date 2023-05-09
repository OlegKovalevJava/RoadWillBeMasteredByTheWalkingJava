package org.example.finished.lesson17.task1;

enum Color {
    RED("#FF0000"),
    BLUE("#0000FF"),
    GREEN("#00FF00");

    private String code;

    private Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}