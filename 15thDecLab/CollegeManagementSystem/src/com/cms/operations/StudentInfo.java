package com.cms.operations;

public class StudentInfo {

    // Variables to store customer information
    private static int studentId;
    private static String name;
    private static Long phone;
    private static String passwordHash;
    private static String recoveryKeyHash;
    private static String department;
    private static byte classXpercentage;
    private static byte classXIIpercentage;
    private static String pinHash = null;
    private static boolean isPinEnabled = false;

    public static int getStudentId() {
        return studentId;
    }

    public static void setStudentId(int studentId) {
        StudentInfo.studentId = studentId;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        StudentInfo.name = name;
    }

    public static Long getPhone() {
        return phone;
    }

    public static void setPhone(Long phone) {
        StudentInfo.phone = phone;
    }

    public static String getPasswordHash() {
        return passwordHash;
    }

    public static void setPasswordHash(String passwordHash) {
        StudentInfo.passwordHash = passwordHash;
    }

    public static String getRecoveryKeyHash() {
        return recoveryKeyHash;
    }

    public static void setRecoveryKeyHash(String recoveryKeyHash) {
        StudentInfo.recoveryKeyHash = recoveryKeyHash;
    }

    public static String getDepartment() {
        return department;
    }

    public static void setDepartment(String department) {
        StudentInfo.department = department;
    }

    public static byte getClassXpercentage() {
        return classXpercentage;
    }

    public static void setClassXpercentage(byte classXpercentage) {
        StudentInfo.classXpercentage = classXpercentage;
    }

    public static byte getClassXIIpercentage() {
        return classXIIpercentage;
    }

    public static void setClassXIIpercentage(byte classXIIpercentage) {
        StudentInfo.classXIIpercentage = classXIIpercentage;
    }

    public static String getPinHash() {
        return pinHash;
    }

    public static void setPinHash(String pinHash) {
        StudentInfo.pinHash = pinHash;
    }

    public static boolean isIsPinEnabled() {
        return isPinEnabled;
    }

    public static void setIsPinEnabled(boolean isPinEnabled) {
        StudentInfo.isPinEnabled = isPinEnabled;
    }

    public static boolean isIsLoggedIn() {
        return isLoggedIn;
    }

    public static void setIsLoggedIn(boolean isLoggedIn) {
        StudentInfo.isLoggedIn = isLoggedIn;
    }

    // Session Only
    private static boolean isLoggedIn = false;



    // Getters and Setters to do operations on private variables
}