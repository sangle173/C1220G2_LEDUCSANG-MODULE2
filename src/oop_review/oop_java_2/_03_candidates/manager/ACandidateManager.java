package oop_review.oop_java_2._03_candidates.manager;

import oop_review.oop_java_2._02_book_manager.function_write_read.WriterReader;
import oop_review.oop_java_2._03_candidates.candidate.ACandidates;
import oop_review.oop_java_2._03_candidates.candidate.Candidates;
import oop_review.oop_java_2._03_candidates.candidate.Subject;

import java.util.*;

public class ACandidateManager extends CandidatesManager implements Subject {
    WriterReader writerReader = new WriterReader();
    Scanner scanner = new Scanner(System.in);
    ACandidateManager aCandidateManager;

    public void addCandidate() {
        String[] stringCandidates = super.add();
        ACandidates aCandidates = new ACandidates(stringCandidates[0], stringCandidates[1], stringCandidates[2], stringCandidates[3], MATH, PHYSICAL, CHEMISTRY);
        List<ACandidates> aCandidatesList = new ArrayList<>();
        aCandidatesList.add(aCandidates);
        writerReader.writeToFile("ACandidates.csv", aCandidatesList, true);
    }

    public List<ACandidates> searchAll() {
        List<String[]> list = writerReader.readFromFile("ACandidates.csv");
        List<ACandidates> candidatesList = new ArrayList<>();
        for (String[] candidateInfo : list) {
            ACandidates aCandidates = new ACandidates(candidateInfo[0], candidateInfo[1], candidateInfo[2], candidateInfo[3], MATH, PHYSICAL, CHEMISTRY);
            candidatesList.add(aCandidates);
        }
        return candidatesList;
    }

    public void showAllACandidates() {
        List<ACandidates> aCandidatesList = searchAll();
        int count = 1;
        for (ACandidates aCandidates : aCandidatesList) {
            System.out.println(count + ".\t" + aCandidates.showInfo());
            count++;
        }
    }

    public void searchByACandidateName() {
        List<ACandidates> aCandidatesList = searchAll();
        System.out.println("Enter the name of A Candidate you want to search");
        String nameSearch = scanner.nextLine();
        for (ACandidates aCandidates : aCandidatesList) {
            if (aCandidates.getName().equals(nameSearch)) {
                System.out.println(aCandidates.showInfo());
                return;
            }
        }
        System.out.println("The name you want to search not available");
        ;
    }

    public void deleteByIdentificationNumber() {
        List<String[]> list = writerReader.readFromFile("ACandidates.csv");
        System.out.println("Enter the identification number of A Candidate your want to delete");
        String identificationNumberSearch = scanner.nextLine();
        Iterator<String[]> itr = list.iterator();
        while (itr.hasNext()) {
            String[] strings = itr.next();
            if (strings[0].equals(identificationNumberSearch)){
                itr.remove();
                System.out.println("Deleted");
                break;
            }
        }
        System.out.println("The identification number of A Candidate your want to delete not available");
    }
}
