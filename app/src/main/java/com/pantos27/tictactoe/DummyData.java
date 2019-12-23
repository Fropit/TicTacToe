package com.pantos27.tictactoe;

public class DummyData {

    private final String[] args;

    public DummyData(String... args){
        this.args = args;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(this.getClass().getSimpleName()).append(" ");

        for (String arg : args) {
            builder.append(arg).append(" ");
        }

        return builder.toString();
    }
}
