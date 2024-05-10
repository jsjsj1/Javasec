package com.ctfjava.main;

public class TestFS {
    public static int Modreverser(int a, int m) {
        for (int x = 1; x < m; x++) {
            if ((a * x) % m == 1) {
                return x;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int x1 =0;
        int c1 =0;
        int x2 =0;
        int c2 =0;
        int m = 26;
        int a = (c1 - c2) * Modreverser(x1 - x2, m) % m;
        int b = (c1 - a * x1) % m;
        System.out.println("参数a: " + a);
        System.out.println("参数b: " + b);
        }

    }
