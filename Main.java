package com.example;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;


public class Main {
    public static void main(String[] args) {
        Mybook newNovel = new Mybook();
        newNovel.setTitle("Novel");
        System.out.println("The title of the book is " + newNovel.getTitle());
    }
}