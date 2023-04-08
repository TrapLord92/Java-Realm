package com.traplord.collection_framework.set_interfeice.lottoapp;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LottoApp {
    public static final int NUMBERS = 6;
    public static final int MAX_NUMBERS = 40;
    public static final int PRIZE = 100;
    //Generate a set o f winning lotto numbers

    public static Set<Integer> creatingWinningNumbers() {
        Set<Integer> winning = new TreeSet<>();
        Random random = new Random();

        while (winning.size() < NUMBERS) {
            int number = random.nextInt(MAX_NUMBERS) + 1;
            winning.add(number);
        }
        return winning;
    }
    //2-Reading the players lottery ticket from consol

    public static Set<Integer> getTicket() {
        Set<Integer> ticket = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter" + NUMBERS + " Lotto Numbers : ");

        while (ticket.size() < NUMBERS) {
            int number = scanner.nextInt();
            ticket.add(number);
        }
        return ticket;
    }

    public static void main(String[] args) {
        //3 Getting winning number and ticket sets
        Set<Integer> winning = creatingWinningNumbers();
        Set<Integer> ticket = getTicket();
        // 4 keeping only the numbers from users ticket
        //using retainAll() to remove non common numbers
        Set<Integer> matches = new TreeSet<>(ticket);
        matches.retainAll(winning);
        //5calculating prize
        System.out.println("Your ticket was: " + ticket);
        System.out.println("Winning Numbers" + winning);

        if (matches.size() > 0) {
            double prize = PRIZE * Math.pow(2, matches.size());
            System.out.println("Matched Numbers: " + matches);
            System.out.printf("Your prize is $%.2f\n", prize);


        }

    }
}//classEnd
