package main;

import subject.Subject;
import observer.BinObserver;
import observer.HexObserver;
import observer.OctObserver;

import java.util.Scanner;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexObserver(subject);
        new OctObserver(subject);
        new BinObserver(subject);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("\nEnter a number: ");
            subject.setState(scanner.nextInt());
        }

        scanner.close();
    }
}
