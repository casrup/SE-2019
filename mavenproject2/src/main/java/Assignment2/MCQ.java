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
public class MCQ{
    // The amount of questions in this test
    int numQuestions;
    // Every questions represented as a string in an array, each element is a question
    String[] questions;
    // This will assume that the multiple choice questions have 3 choices represented by an index of int 1-3
    int[] answers;
    // answers is the given answers by the examinee and solutions are the index of the correct answers
    int[] solutions;
    // score is the number of answers that are equal to their corresponding solutions
    private int score = 0;
    // Constructor
    public MCQ(int numQuestions, String[] questions, int[] answers, int[] solutions){
        this.numQuestions = numQuestions;
        this.questions = questions;
        this.answers = answers;
        this.solutions = solutions;
    }
    
    // Method to compute the score by checking the given answers to their corresponding solutions
    public int computeScore(){
        this.score=0;
        for(int i=0; i < this.numQuestions; i++){
            if(this.answers[i] == this.solutions[i]){
                this.score++;
            }
        }
        return this.score;
    }
    
    // Returns the score
    public int getScore(){
        if(this.score == 0){
            computeScore();
        }
        return this.score;
    }
    
    // Returns a formatted string of the questions so they are easier to read
    public String getQuestions(){
        String retString="";
        for(int i=0; i<numQuestions; i++){
            retString+=(String.format("Question %d: ", i+1)+questions[i]+"\n");
        }
        return retString;
    }
    // TODO: add a method to show which questions were correct and which were wrong
    
    
    
}
