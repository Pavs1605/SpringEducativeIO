package org.example.service;

import org.example.model.Student;

public class StudentService {

    private Student studentDao;

    public StudentService(Student studentDao) {
        super();
        this.studentDao = studentDao;
    }

   public int findTotal() {
        //fetch student marks from a database
        int[] array = studentDao.getMarks();
        int sum = 0;

        for(int value : array) {
            sum += value;
        }
        return sum;
    }
}
