/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas.pkg6;

/**
 *
 * @author Aria
 */
public class Tugas6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
        {
       String[][] jawaban = 
        {
            {"A", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
            {"D", "B", "A", "B", "C", "A", "E", "E", "A", "D"},
            {"E", "D", "D", "A", "C", "B", "E", "E", "A", "D"},
            {"C", "B", "A", "E", "D", "C", "E", "E", "A", "D"},
            {"A", "B", "D", "C", "C", "D", "E", "E", "A", "D"},
            {"B", "B", "E", "C", "C", "D", "E", "E", "A", "D"},
            {"B", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
            {"E", "B", "E", "C", "C", "D", "E", "E", "A", "D"}
        };
        
        String[] answers = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};
        
        int[] CorrectAnswers = new int[8];
        
        for(int i = 0; i <= 7; i++)
        {
            int correct = 0;
        for(int j = 0; j <= 9; j++)
            {
                if(jawaban[i][j].equals(answers[j]))
                    correct++;
            }
            CorrectAnswers[i] = correct;
        }
        
       System.out.println("Results: ");
       for(int i = 0; i <= 7; i++)
       {
           System.out.println("Mahasiswa " + i + " jumlah jawaban benar adalah " + CorrectAnswers[i]);
       }
        
        
    }
}


