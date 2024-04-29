package oop.inheritance.example1;

import java.util.Arrays;

public class TalkingParrot extends Parrot {
    private String[] words;

    public TalkingParrot() {
    }

    public TalkingParrot(String call, String color, String food, String movement, String sound, float maxFlewHeight, String[] words) {
        super(call, color, food, movement, sound, maxFlewHeight);
        this.words = words;
    }

    public String[] getWords() {
        return words;
    }

    public void setWords(String[] words) {
        this.words = words;
    }


    public String talk() {
        return words[(int) (Math.random() * words.length)];
    }

    @Override
    public String toString() {
        return "TalkingParrot{" +
                "words=" + Arrays.toString(words) +
                "parent=" + super.toString() +
                '}';
    }
}
