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
    int numQuestions;
    String[] questions;
    String[] answers;
    String[] solutions;
    private int score = 0;
    public Examination(int numQuestions, String[] questions, String[] answers, String[] solutions){
        this.numQuestions = numQuestions;
        this.questions = questions;
        this.answers = answers;
        this.solutions = solutions;
    }
    
    public String getQuestions(){
        String retString="";
        for(int i=0; i<numQuestions; i++){
            retString+=(String.format("Question %d: ", i+1)+questions[i]+"\n");
        }
        return retString;
    }
    public String getAnswers(){
        String retString="";
        for(int i=0; i<numQuestions; i++){
            retString+=(String.format("Answer to Q%d: ", i+1)+answers[i]+"\n");
        }
        return retString;
    }
    public String getSolutions(){
        String retString="";
        for(int i=0; i<numQuestions; i++){
            retString+=(String.format("Solution to Q%d: ", i+1)+solutions[i]+"\n");
        }
        return retString;
    }
    public void correctAnswer(){
        this.score++;
    }
    public void resetScore(){
        this.score = 0;
    }
    public int getScore(){
        return this.score;
    }
}
