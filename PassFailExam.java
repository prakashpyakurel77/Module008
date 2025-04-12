package java.swing;

/**
This class determines a passing or failing grade for an exam.
*/
public class PassFailExam extends PassFailActivity {
private int numQuestions;   // Number of questions
private double pointsEach;  // Points for each question
private int numMissed;      // Number of questions missed

/**
   Constructor sets the number of questions, the
   number missed, and the minimum passing score.
*/
public PassFailExam(int questions, int missed, double minPassing) {
   super(minPassing);

   numQuestions = questions;
   numMissed = missed;

   pointsEach = 100.0 / questions;
   double numericScore = 100.0 - (missed * pointsEach);

   setScore(numericScore); // Set score using superclass method
}

public void setScore(double numericScore) {
	// TODO Auto-generated method stub
	
}

/**
   Returns the number of points each question is worth.
*/
public double getPointsEach() {
   return pointsEach;
}
public char getGrade() {
	return getGrade();
	
}
public double getScore() {
	return Score();
}

private double Score() {
	// TODO Auto-generated method stub
	return 0;
}

/**
   Returns the number of questions missed.
*/
public int getNumMissed() {
   return numMissed;
}
}