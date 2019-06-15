package com.andresmata305;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[][] grid = new char[61][61];
        for (char[] a  : grid) {
            Arrays.fill(a, '.');
        }

        String command = "";
        while (!command.equals(".EOP")) {
            command = in.next();
            switch (command) {
                case ".P":
                    place(Integer.parseInt(in.next().substring(1)), in.nextInt(), in.nextInt(), in.nextLine(), grid);
                    break;
                case ".L":
                    place(Integer.parseInt(in.next().substring(1)), in.nextInt(), 1, in.nextLine(), grid);
                    break;
                case ".R":
                    place(Integer.parseInt(in.next().substring(1)), in.nextInt(), 61, in.nextLine(), grid);
                    break;
                case ".C":
                    place(Integer.parseInt(in.next().substring(1)), in.nextInt(), 62, in.nextLine(), grid);
                    break;
                default:
                    break;
            }
        }
        for (int i = 1; i <= 60; i++) {
            for (int j = 1; j <= 60; j++) {
                System.out.print(grid[j][i]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 60; i++) {
            System.out.print("-");
        }
    }

    public static void place(float f, int r, int c, String s, char[][] grid) {
        s = s.substring(2, (s.length() - 1));
        if (c == 61) { // right justified
            if (f == 1) {
                c = (61 - s.length());
            } else if (f == 5) {
                c = (61 - (6 * s.length()));
            }
        } else if (c == 62) { // centered
            if (f == 1) {
                c = (31 - (s.length() / 2));
            } else if (f == 5) {
                c = (31 - ((6 * s.length()) / 2));
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if ((f == 1) && ((c + i) >= 0) && ((c + i) <= 60) && (r >= 0) && (r <= 60)) {
                    grid[c + i][r] = s.charAt(i);
                } else if (f == 5) {
                    String[] charGrid = charGrid(s.charAt(i));
                    for (int j = 0; j < 5; j++) {
                        for (int k = 0; k < 5; k++) {
                            int x = c + (6 * i) + j;
                            if ((x >= 0) && (x <= 60) && ((k + r) >= 0) && ((k + r) <= 60)) {
                                grid[x][k + r] = charGrid[k].charAt(j);
                            }
                        }
                    }
                } else {
                    System.out.println("Error 1");
                }
            }
        }
        return;
    }


    public static String[] charGrid(char c) {
        String[] charGrid;
        switch (c) {
            case 'A':
                charGrid = new String[]{
                        ".***.",
                        "*...*",
                        "*****",
                        "*...*",
                        "*...*" };
                break;
            case 'B':
                charGrid = new String[]{
                        "****.",
                        "*...*",
                        "****.",
                        "*...*",
                        "****." };
                break;
            case 'C':
                charGrid = new String[]{
                        ".****",
                        "*...*",
                        "*....",
                        "*....",
                        ".****" };
                break;
            case 'D':
                charGrid = new String[]{
                        "****.",
                        "*...*",
                        "*...*",
                        "*...*",
                        "****." };
                break;
            case 'E':
                charGrid = new String[]{
                        "*****",
                        "*....",
                        "***..",
                        "*....",
                        "*****" };
                break;
            case 'F':
                charGrid = new String[]{
                        "*****",
                        "*....",
                        "***..",
                        "*....",
                        "*...." };
                break;
            case 'G':
                charGrid = new String[]{
                        ".****",
                        "*....",
                        "*..**",
                        "*...*",
                        ".***." };
                break;
            case 'H':
                charGrid = new String[]{
                        "*...*",
                        "*...*",
                        "*****",
                        "*...*",
                        "*...*" };
                break;
            case 'I':
                charGrid = new String[]{
                        "*****",
                        "..*..",
                        "..*..",
                        "..*..",
                        "*****" };
                break;
            case 'J':
                charGrid = new String[]{
                        "..***",
                        "...*.",
                        "...*.",
                        "*..*.",
                        ".**.." };
                break;
            case 'K':
                charGrid = new String[]{
                        "*...*",
                        "*..*.",
                        "***..",
                        "*..*.",
                        "*...*" };
                break;
            case 'L':
                charGrid = new String[]{
                        "*....",
                        "*....",
                        "*....",
                        "*....",
                        "*****" };
                break;
            case 'M':
                charGrid = new String[]{
                        "*...*",
                        "**.**",
                        "*.*.*",
                        "*...*",
                        "*...*" };
                break;
            case 'N':
                charGrid = new String[]{
                        "*...*",
                        "**..*",
                        "*.*.*",
                        "*..**",
                        "*...*" };
                break;
            case 'O':
                charGrid = new String[]{
                        ".***.",
                        "*...*",
                        "*...*",
                        "*...*",
                        ".***." };
                break;
            case 'P':
                charGrid = new String[]{
                        "****.",
                        "*...*",
                        "****.",
                        "*....",
                        "*...." };
                break;
            case 'Q':
                charGrid = new String[]{
                        ".***.",
                        "*...*",
                        "*...*",
                        "*..**",
                        ".****" };
                break;
            case 'R':
                charGrid = new String[]{
                        "****.",
                        "*...*",
                        "****.",
                        "*..*.",
                        "*...*" };
                break;
            case 'S':
                charGrid = new String[]{
                        ".****",
                        "*....",
                        ".***.",
                        "....*",
                        "****." };
                break;
            case 'T':
                charGrid = new String[]{
                        "*****",
                        "*.*.*",
                        "..*..",
                        "..*..",
                        ".***." };
                break;
            case 'U':
                charGrid = new String[]{
                        "*...*",
                        "*...*",
                        "*...*",
                        "*...*",
                        ".***." };
                break;
            case 'V':
                charGrid = new String[]{
                        "*...*",
                        "*...*",
                        ".*.*.",
                        ".*.*.",
                        "..*.." };
                break;
            case 'W':
                charGrid = new String[]{
                        "*...*",
                        "*...*",
                        "*.*.*",
                        "**.**",
                        "*...*" };
                break;
            case 'X':
                charGrid = new String[]{
                        "*...*",
                        ".*.*.",
                        "..*..",
                        ".*.*.",
                        "*...*" };
                break;
            case 'Y':
                charGrid = new String[]{
                        "*...*",
                        ".*.*.",
                        "..*..",
                        "..*..",
                        "..*.." };
                break;
            case 'Z':
                charGrid = new String[]{
                        "*****",
                        "...*.",
                        "..*..",
                        ".*...",
                        "*****" };
                break;
            default:
                charGrid = new String[]{
                        "*****",
                        "*****",
                        "*****",
                        "*****",
                        "*****" };
                break;
        }
        return charGrid;
    }
}