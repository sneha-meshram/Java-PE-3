package com.stackroute.pe3;


public class StudentMarks {

    public String gradeDetails(int n, int[] grades) {

        String sendMessage = null;
        int lengthOfGrades = grades.length;

        for (int i = 0; i < lengthOfGrades; i++) {
            if (n == 0 || (grades[i] < 0 && grades[i] > 100)) {
                sendMessage = "error,inputs are not in ranger";
            }

            if (n == (lengthOfGrades) || grades[i] > 0 && grades[i] < 100) {
                sendMessage = "inputs are in range";
            }

        }
        return sendMessage;
    }
}