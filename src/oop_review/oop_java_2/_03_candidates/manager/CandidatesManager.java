package oop_review.oop_java_2._03_candidates.manager;

import java.util.Scanner;

public class CandidatesManager {
    Scanner scanner = new Scanner(System.in);
    CandidatesManager candidatesManager;

    public String[] add() {
        String identificationNumber = inputIdentification();
        String candidateName = inputCandidateName();
        String candidateAddress = inputCandidateAddress();
        String priority = inputPriority();
        String[] strings = {identificationNumber, candidateName, candidateAddress, priority};
        return strings;
    }

    private String inputCandidateAddress() {
        System.out.println("Enter candidate address");
        return scanner.nextLine();
    }

    private String inputPriority() {
        System.out.println("Enter candidate priority");
        return scanner.nextLine();
    }

    private String inputCandidateName() {
        System.out.println("Enter candidate name");
        return scanner.nextLine();
    }

    private String inputIdentification() {
        System.out.println("Enter candidate identification");
        return scanner.nextLine();
    }
}
