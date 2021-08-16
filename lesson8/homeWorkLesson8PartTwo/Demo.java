package com.gromcode.lesson8.homeWorkLesson8PartTwo;

public class Demo {
    public Student creatHighestParent() {
        Student student = new Student("Evgeniy", "Shilenko", 1, new Course[ 4 ]);
        return student;
    }

    public SpecialStudent creatLowestChild() {
        SpecialStudent specialStudent = new SpecialStudent("Evgeniy", "Shilenko", 1,
                new Course[ 4 ], 51617181, "evgeniy.shilenko@gmail.com");
        return specialStudent;
    }
}
