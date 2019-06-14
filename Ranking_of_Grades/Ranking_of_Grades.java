package com.java.bit;

import java.util.*;

public class Ranking_of_Grades {

    static class Student
    {
        public String name;
        public int grade;
        public Student(String name,int grade)
        {
            this.name=name;
            this.grade =grade;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {

            int n=sc.nextInt();
            int sort=sc.nextInt();
            List<Student> stuList=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                stuList.add(new Student(sc.next(),sc.nextInt()));
            }

            //降序
            if(sort==0)
            {
                Collections.sort(stuList, new Comparator<Student>()
                {
                    public int compare(Student o1,Student o2)
                    {
                        return o2.grade -o1.grade;
                    }
                });
            }
            else if(sort==1)//升序
            {
                Collections.sort(stuList, new Comparator<Student>()
                {
                    public int compare(Student o1,Student o2)
                    {
                        return o1.grade -o2.grade;
                    }
                });
            }
           for(Student s:stuList){
               System.out.println(s.name+" "+s.grade);
           }
        }
    }
}
