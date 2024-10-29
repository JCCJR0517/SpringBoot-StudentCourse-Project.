public double calculateGPA(Student student) {
    double totalPoints = 0;
    int totalCredits = 0;
    
    for (Course course : student.getCourses()) {
        int points = convertGradeToPoints(course.getGrade());
        totalPoints += points * course.getCreditHours();
        totalCredits += course.getCreditHours();
    }
    return totalCredits > 0 ? totalPoints / totalCredits : 0;
}

private int convertGradeToPoints(String grade) {
    switch (grade.toUpperCase()) {
        case "A": return 4;
        case "B": return 3;
        case "C": return 2;
        case "D": return 1;
        default: return 0; // F or invalid grades
    }
}
