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
        String MCQuestions[] = new String[4];
        MCQuestions[0]="How many bits in a byte?";
        MCQuestions[1]="What even is a Pandicorn?";
        MCQuestions[2]="Who invented the internet?";
        MCQuestions[3]="Why are questions so hard to come up with?";
        int[] MCQanswers = {1,2,3,1};
        int[] MCQsolutions = {1,2,3,2};
        MCQ Questionnaire = new MCQ(MCQuestions.length, MCQuestions, MCQanswers, MCQsolutions);
        System.out.println("This person recieved the following questions:\n" + Questionnaire.getQuestions());
        System.out.println("This person's score is: " + Questionnaire.getScore()+ "/" + MCQuestions.length);
        
        String EXQuestions[] = new String[3];
        String EXanswers[] = new String[EXQuestions.length];
        String EXsolutions[] = new String[EXQuestions.length];
        EXQuestions[0] = "What even is a pandicorn?";
        EXanswers[0] = "A unicorn panda";
        EXsolutions[0] = "'A magical mix of 70% panda, 30% unicorn, 100% magical' - courtsey of Urban Dictionary";
        EXQuestions[1] = "Draw a pig";
        EXanswers[1] = "qB^)o<>";
        EXsolutions[1] = "^(*(oo)*)^";
        EXQuestions[2] = "Fill in the blank: Lorem _____ dolor sit amet";
        EXanswers[2] = "Ipsum";
        EXsolutions[2] = "Ipsum";
        Examination Exam = new Examination(EXQuestions.length, EXQuestions, EXanswers, EXsolutions);
        Exam.correctAnswer();
        Exam.correctAnswer();
        System.out.println("This person recieved the following questions:\n" + Exam.getQuestions());
        System.out.println("This person answered with:\n" + Exam.getAnswers());
        System.out.println("The correct answers for this exam were:\n"+ Exam.getSolutions());
        System.out.println("This person's score is: " + Exam.getScore() + "/" + EXQuestions.length);
    }
}
