/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

/**
 *
 * @author sheeplove
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String questions[] = new String[4];
        questions[0]="How many bits in a byte?";
        questions[1]="What even is a Pandicorn?";
        questions[2]="Who invented the internet?";
        questions[3]="Why are questions so hard to come up with?";
        int[] answers = {1,2,3,1};
        int[] solutions = {1,2,3,2};
        MCQ Questionnaire = new MCQ(questions.length, questions, answers, solutions);
        System.out.println("This person recieved the following questions:\n" + Questionnaire.getQuestions());
        System.out.println("This person's score is: " + Questionnaire.getScore()+ "/" + questions.length);
    }
}
