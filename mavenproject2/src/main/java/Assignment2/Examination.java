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
public class Examination {
    // The amount of questions in this test
    int numQuestions;
    // Every question represented as a string in an array, each element is a question
    String[] questions;
    // Every given answer represented as a string in an array, each element is an answer
    String[] answers;
    // Every solution represented as a string in an array, each element is a solution
    String[] solutions;
    // There is no method to compute the score, so it must be manually incremented
    private int score = 0;
    
    // Constructor
    public Examination(int numQuestions, String[] questions, String[] answers, String[] solutions){
        this.numQuestions = numQuestions;
        this.questions = questions;
        this.answers = answers;
        this.solutions = solutions;
    }
    
    // Returns a formatted string of the questions so they are easier to read
    public String getQuestions(){
        String retString="";
        for(int i=0; i<numQuestions; i++){
            retString+=(String.format("Question %d: ", i+1)+questions[i]+"\n");
        }
        return retString;
    }
    
    // Returns a formatted string of the answers so they are easier to read
    public String getAnswers(){
        String retString="";
        for(int i=0; i<numQuestions; i++){
            retString+=(String.format("Answer to Q%d: ", i+1)+answers[i]+"\n");
        }
        return retString;
    }
    
    // Returns a formatted string of the solutions so they are easier to read
    public String getSolutions(){
        String retString="";
        for(int i=0; i<numQuestions; i++){
            retString+=(String.format("Solution to Q%d: ", i+1)+solutions[i]+"\n");
        }
        return retString;
    }
    
    // Since a given answer might be correct without being equivalent to the solution
    // the score must be incremented manually if the given answer is deemed close enough to the solution
    public void correctAnswer(){
        this.score++;
    }
    
    // Method to reset the score back to 0
    public void resetScore(){
        this.score = 0;
    }
    
    // Getter method for the score
    public int getScore(){
        return this.score;
    }
    
    /* TODO: Make a method that can compare an answer to a solution and figure out if
    the answer is correct, continue by reimplementing the Score computation so it isn't manual */ 
}
