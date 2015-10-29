package com.udacity.gradle.jokes.test;

import com.udacity.gradle.jokes.Joker;

import org.junit.Test;

public class JokerTest {
    @Test
    public void test() {
        Joker joker = new Joker();
        assert joker.getJoke("fr").length() != 0 && !joker.getJoke("fr").isEmpty();
        assert joker.getJoke("pa").length() != 0 && !joker.getJoke("pa").isEmpty();

    }
}