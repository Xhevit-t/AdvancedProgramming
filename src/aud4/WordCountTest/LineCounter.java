package aud4.WordCountTest;

import javax.sound.sampled.Line;

public class LineCounter {

    private int lines;
    private int words;
    private int chars;

    public LineCounter(int lines,int words, int chars){
        this.lines = lines;
        this.words = words;
        this.chars = chars;
    }

    public LineCounter(String line) {
        ++lines;
        words = line.split("\\s+").length;
        chars = line.length();
    }

    public LineCounter sum(LineCounter counter) {
        return new LineCounter(this.lines + counter.lines, counter.words + counter.chars, counter.chars);
    }

    @Override
    public String toString() {
        return String.format("%d words, %d chars", words, chars);
    }

}
