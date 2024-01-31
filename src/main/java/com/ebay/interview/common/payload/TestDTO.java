package com.ebay.interview.common.payload;

public class TestDTO {
    public TestDTO(String input, int times) {
        this.input = input;
        this.times = times;
    }

    private String input;

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    private int times;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
