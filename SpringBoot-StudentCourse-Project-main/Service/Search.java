public Student findStudentByName(String firstName) {
    return students.stream()
            .filter(student -> student.getFirstName().equalsIgnoreCase(firstName))
            .findFirst()
            .orElse(null);
}

public Course findCourseByNumber(String courseNumber) {
    return students.stream()
            .flatMap(student -> student.getCourses().stream())
            .filter(course -> course.getCourseNumber().equalsIgnoreCase(courseNumber))
            .findFirst()
            .orElse(null);
}

