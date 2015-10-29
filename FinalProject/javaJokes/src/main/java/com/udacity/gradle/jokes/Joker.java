package com.udacity.gradle.jokes;

public class Joker {
    public String getJoke(String name) {
        if (name.startsWith("fr"))
            return "This is a really cheap joke";
        else if(name.startsWith("pa"))
            return "This is a really expensive joke";
        else
            return "This is a really lame joke";
    }
}