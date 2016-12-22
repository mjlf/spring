package com.mjlf.DI;

import org.springframework.stereotype.Component;

/**
 * Created by a123 on 16/12/22.
 */

@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("playing " + title + "by " + artist);
    }
}
