package com.example.android.reportcard;

import java.util.ArrayList;

/**
 * Created by mhesah on 2017-05-05.
 */

public class ReportCard {
    /*
    variables "final(subject name)" contain final grade for the subject
    variable "behaviorGrade" contains information about student behaviour marked single letter grades
    variable "opinionGrade" contains general information about student work and his behavior
     */
    private static final String schoolName = "Primary School in Kalinowka";
    private static final int subjectAmount = 14;
    private String studentName, studentSurname, opinionGrade;
    private char behaviorGrade;
    private int daysAttended, daysMissed;
    private double endGrade;
    private double finalMath;
    private double finalPhysics;
    private double finalChemistry;
    private double finalComputer;
    private double finalTech;
    private double finalEnglish;
    private double finalPolish;
    private double finalGerman;
    private double finalGym;
    private double finalHistory;
    private double finalGeography;
    private double finalArt;
    private double finalMusic;
    private double finalReligion;
    private ArrayList<Double> mathGrades = new ArrayList<>();
    private ArrayList<Double> physicsGrades = new ArrayList<>();
    private ArrayList<Double> chemistryGrades = new ArrayList<>();
    private ArrayList<Double> computerGrades = new ArrayList<>();
    private ArrayList<Double> techGrades = new ArrayList<>();
    private ArrayList<Double> englishGrades = new ArrayList<>();
    private ArrayList<Double> polishGrades = new ArrayList<>();
    private ArrayList<Double> germanGrades = new ArrayList<>();
    private ArrayList<Double> gymGrades = new ArrayList<>();
    private ArrayList<Double> historyGrades = new ArrayList<>();
    private ArrayList<Double> geographyGrades = new ArrayList<>();
    private ArrayList<Double> artGrades = new ArrayList<>();
    private ArrayList<Double> musicGrades = new ArrayList<>();
    private ArrayList<Double> religionGrades = new ArrayList<>();

    public ReportCard(String studentName, String studentSurname, String opinionGrade, char behaviorGrade, int daysAttended, int daysMissed, ArrayList<Double> mathGrades, ArrayList<Double> physicsGrades, ArrayList<Double> chemistryGrades, ArrayList<Double> computerGrades, ArrayList<Double> techGrades, ArrayList<Double> englishGrades, ArrayList<Double> polishGrades, ArrayList<Double> germanGrades, ArrayList<Double> gymGrades, ArrayList<Double> historyGrades, ArrayList<Double> geographyGrades, ArrayList<Double> artGrades, ArrayList<Double> musicGrades, ArrayList<Double> religionGrades) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.opinionGrade = opinionGrade;
        this.behaviorGrade = behaviorGrade;
        this.daysAttended = daysAttended;
        this.daysMissed = daysMissed;
        this.mathGrades = mathGrades;
        this.physicsGrades = physicsGrades;
        this.chemistryGrades = chemistryGrades;
        this.computerGrades = computerGrades;
        this.techGrades = techGrades;
        this.englishGrades = englishGrades;
        this.polishGrades = polishGrades;
        this.germanGrades = germanGrades;
        this.gymGrades = gymGrades;
        this.historyGrades = historyGrades;
        this.geographyGrades = geographyGrades;
        this.artGrades = artGrades;
        this.musicGrades = musicGrades;
        this.religionGrades = religionGrades;

        countFinalGrade();
        countEndGrade();
    }

    public static String getSchoolName() {
        return schoolName;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "studentName=" + studentName + '\'' +
                ", studentSurname=" + studentSurname +
                ", opinionGrade=" + opinionGrade +
                ", behaviorGrade=" + behaviorGrade +
                ", daysAttended=" + daysAttended +
                ", daysMissed=" + daysMissed +
                ", mathGrades=" + mathGrades +
                ", physicsGrades=" + physicsGrades +
                ", chemistryGrades=" + chemistryGrades +
                ", computerGrades=" + computerGrades +
                ", techGrades=" + techGrades +
                ", englishGrades=" + englishGrades +
                ", polishGrades=" + polishGrades +
                ", germanGrades=" + germanGrades +
                ", gymGrades=" + gymGrades +
                ", historyGrades=" + historyGrades +
                ", geographyGrades=" + geographyGrades +
                ", artGrades=" + artGrades +
                ", musicGrades=" + musicGrades +
                ", religionGrades=" + religionGrades + '\'' +
                '}';
    }

    public String fullReport() {
        return new StringBuilder().append(schoolName).append("\n")
                .append("STUDENT: ").append(studentName).append(" ").append(studentSurname).append("\n")
                .append("Opinion: ").append(opinionGrade).append("\n")
                .append("Behavior: ").append(behaviorGrade).append("\n")
                .append("Days attended/missed: ").append(daysAttended).append("/").append(daysMissed).append(" Total: [").append((100*daysAttended)/(daysAttended + daysMissed)).append("%]").append("\n")
                .append("\n")
                .append("GRADES").append("\n")
                .append("Mathematics: ").append(mathGrades).append(" [Final: ").append(finalMath).append("]").append("\n")
                .append("Physics: ").append(physicsGrades).append(" [Final: ").append(finalPhysics).append("]").append("\n")
                .append("Chemistry: ").append(chemistryGrades).append(" [Final: ").append(finalChemistry).append("]").append("\n")
                .append("Computers: ").append(computerGrades).append(" [Final: ").append(finalComputer).append("]").append("\n")
                .append("Tech: ").append(techGrades).append(" [").append(finalTech).append("]").append("\n")
                .append("English: ").append(englishGrades).append(" [Final: ").append(finalEnglish).append("]").append("\n")
                .append("Polish: ").append(polishGrades).append(" [Final: ").append(finalPolish).append("]").append("\n")
                .append("German: ").append(germanGrades).append(" [Final: ").append(finalGerman).append("]").append("\n")
                .append("Gym: ").append(gymGrades).append(" [Final: ").append(finalGym).append("]").append("\n")
                .append("History: ").append(historyGrades).append(" [Final: ").append(finalHistory).append("]").append("\n")
                .append("Geography: ").append(geographyGrades).append(" [Final: ").append(finalGeography).append("]").append("\n")
                .append("Arts: ").append(artGrades).append(" [Final: ").append(finalArt).append("]").append("\n")
                .append("Music: ").append(musicGrades).append(" [Final: ").append(finalMusic).append("]").append("\n")
                .append("Religion: ").append(religionGrades).append(" [Final: ").append(finalReligion).append("]").append("\n")
                .append("\n")
                .append("END GRADE: [").append(endGrade).append("]").toString();
    }

    //counting final grade for each subject
    private void countFinalGrade() {
        finalMath = countSubjectGrade(mathGrades);
        finalPhysics = countSubjectGrade(physicsGrades);
        finalChemistry = countSubjectGrade(chemistryGrades);
        finalComputer = countSubjectGrade(computerGrades);
        finalTech = countSubjectGrade(techGrades);
        finalEnglish = countSubjectGrade(englishGrades);
        finalPolish = countSubjectGrade(polishGrades);
        finalGerman = countSubjectGrade(germanGrades);
        finalGym = countSubjectGrade(gymGrades);
        finalHistory = countSubjectGrade(historyGrades);
        finalGeography = countSubjectGrade(geographyGrades);
        finalArt = countSubjectGrade(artGrades);
        finalMusic = countSubjectGrade(musicGrades);
        finalReligion = countSubjectGrade(religionGrades);
    }

    //counting semester grade from all the subjects
    private double countEndGrade() {
        endGrade = (finalMath + finalPhysics + finalChemistry + finalComputer + finalTech + finalEnglish +
                finalPolish + finalGerman + finalGym + finalHistory + finalGeography + finalArt + finalMusic +
                finalReligion) / subjectAmount;
        return endGrade;
    }

    private double countSubjectGrade(ArrayList<Double> subject) {
        double gradeSum = 0;
        for (Double grades : subject) {
            gradeSum += grades;
        }
        return gradeSum / subject.size();
    }

    public double getFinalMath() {
        return finalMath;
    }

    public double getFinalPhysics() {
        return finalPhysics;
    }

    public double getFinalChemistry() {
        return finalChemistry;
    }

    public double getFinalComputer() {
        return finalComputer;
    }

    public double getFinalTech() {
        return finalTech;
    }

    public double getFinalEnglish() {
        return finalEnglish;
    }

    public double getFinalPolish() {
        return finalPolish;
    }

    public double getFinalGerman() {
        return finalGerman;
    }

    public double getFinalGym() {
        return finalGym;
    }

    public double getFinalHistory() {
        return finalHistory;
    }

    public double getFinalGeography() {
        return finalGeography;
    }

    public double getFinalArt() {
        return finalArt;
    }

    public double getFinalMusic() {
        return finalMusic;
    }

    public double getFinalReligion() {
        return finalReligion;
    }

    public double getEndGrade() {
        return endGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public String getOpinionGrade() {
        return opinionGrade;
    }

    public void setOpinionGrade(String opinionGrade) {
        this.opinionGrade = opinionGrade;
    }

    public char getBehaviorGrade() {
        return behaviorGrade;
    }

    public void setBehaviorGrade(char behaviorGrade) {
        this.behaviorGrade = behaviorGrade;
    }

    public int getDaysAttended() {
        return daysAttended;
    }

    public void setDaysAttended(int daysAttended) {
        this.daysAttended = daysAttended;
    }

    public int getDaysMissed() {
        return daysMissed;
    }

    public void setDaysMissed(int daysMissed) {
        this.daysMissed = daysMissed;
    }

    public ArrayList<Double> getMathGrades() {
        return mathGrades;
    }

    public void setMathGrades(ArrayList<Double> mathGrades) {
        this.mathGrades = mathGrades;
    }

    public ArrayList<Double> getPhysicsGrades() {
        return physicsGrades;
    }

    public void setPhysicsGrades(ArrayList<Double> physicsGrades) {
        this.physicsGrades = physicsGrades;
    }

    public ArrayList<Double> getChemistryGrades() {
        return chemistryGrades;
    }

    public void setChemistryGrades(ArrayList<Double> chemistryGrades) {
        this.chemistryGrades = chemistryGrades;
    }

    public ArrayList<Double> getComputerGrades() {
        return computerGrades;
    }

    public void setComputerGrades(ArrayList<Double> computerGrades) {
        this.computerGrades = computerGrades;
    }

    public ArrayList<Double> getTechGrades() {
        return techGrades;
    }

    public void setTechGrades(ArrayList<Double> techGrades) {
        this.techGrades = techGrades;
    }

    public ArrayList<Double> getEnglishGrades() {
        return englishGrades;
    }

    public void setEnglishGrades(ArrayList<Double> englishGrades) {
        this.englishGrades = englishGrades;
    }

    public ArrayList<Double> getPolishGrades() {
        return polishGrades;
    }

    public void setPolishGrades(ArrayList<Double> polishGrades) {
        this.polishGrades = polishGrades;
    }

    public ArrayList<Double> getGermanGrades() {
        return germanGrades;
    }

    public void setGermanGrades(ArrayList<Double> germanGrades) {
        this.germanGrades = germanGrades;
    }

    public ArrayList<Double> getGymGrades() {
        return gymGrades;
    }

    public void setGymGrades(ArrayList<Double> gymGrades) {
        this.gymGrades = gymGrades;
    }

    public ArrayList<Double> getHistoryGrades() {
        return historyGrades;
    }

    public void setHistoryGrades(ArrayList<Double> historyGrades) {
        this.historyGrades = historyGrades;
    }

    public ArrayList<Double> getGeographyGrades() {
        return geographyGrades;
    }

    public void setGeographyGrades(ArrayList<Double> geographyGrades) {
        this.geographyGrades = geographyGrades;
    }

    public ArrayList<Double> getArtGrades() {
        return artGrades;
    }

    public void setArtGrades(ArrayList<Double> artGrades) {
        this.artGrades = artGrades;
    }

    public ArrayList<Double> getMusicGrades() {
        return musicGrades;
    }

    public void setMusicGrades(ArrayList<Double> musicGrades) {
        this.musicGrades = musicGrades;
    }

    public ArrayList<Double> getReligionGrades() {
        return religionGrades;
    }

    public void setReligionGrades(ArrayList<Double> religionGrades) {
        this.religionGrades = religionGrades;
    }

}