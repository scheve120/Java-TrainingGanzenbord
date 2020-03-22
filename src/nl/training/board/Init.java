package nl.training.board;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Init {

    public static void main(String[] args) {
        Spel ganzenbord = new Spel();
        ganzenbord.spelen();

    }
}