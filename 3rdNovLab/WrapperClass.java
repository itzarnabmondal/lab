package com.demo;
class Student { // student class
    int fees;
    void calculateFeesStructure(Long studentId, Character studentGrade, Double monthlyFees, Boolean isScholarshipEligible) { // calculate fee method
        if (studentId != 0 && studentGrade == 'A' && isScholarshipEligible) { // condition 1
            fees = (int) (monthlyFees - (monthlyFees * 10 / 100));
            System.out.println("10% of fees is exempted, the calculated fees is: " + fees);
        } else if (studentId != 0 && studentGrade == 'B' && isScholarshipEligible) { // condition 2
            fees = (int) (monthlyFees - (monthlyFees * 8 / 100));
            System.out.println("8% of fees is exempted, the calculated fees is: " + fees);
        } else if (studentId != 0 && studentGrade == 'C' && isScholarshipEligible) { // condition 3
            fees = (int) (monthlyFees - (monthlyFees * 6 / 100));
            System.out.println("6% of fees is exempted, the calculated fees is: " + fees);
        } else if (studentId != 0 && studentGrade == 'D' && isScholarshipEligible) { // // condition 4
            fees = (int) (monthlyFees - (monthlyFees * 4 / 100));
            System.out.println("6% of fees is exempted, the calculated fees is: " + fees);
        } else {
            System.out.println("Not Eligible for Exemption");
        }
    }
    void compareMarks(Long maths, Double english) { // compare marks method
        Integer highestMark = 0;
        if (english > maths) {
            System.out.println("English is high");
            highestMark = english.intValue();
        }
        else if (maths > english) {
            System.out.println("Math is high");
            highestMark = maths.intValue();
        }
        else {
            System.out.println("Both are Equal");
        }
        System.out.println("Highest Mark: "+highestMark); // printing highest marks
    }
    void validateFree(Double fees) {
        Byte mByte;
        if (fees.isInfinite())
            System.out.println("Fees is infinite");
        else
            System.out.println("Fees is not infinite");
        mByte = fees.byteValue();
        System.out.println("Byte value is:" + mByte);
    }
    public static void main(String[] args) { // main method
        Student s1 = new Student(); // creating student class obj
        s1.calculateFeesStructure(100L, 'A', 600D, true);
        s1.compareMarks(85L, 65D); // calling methods with parameters

        Student s2 = new Student();
        s1.calculateFeesStructure(115L, 'B', 909.50, true);
        s2.compareMarks(56L, 98D);

        Student s3 = new Student();
        s1.calculateFeesStructure(980L, 'G', 1810D, false);
        s3.compareMarks(84L, 84D);
    }
}