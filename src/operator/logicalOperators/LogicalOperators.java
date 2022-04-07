package operator.logicalOperators;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean isInterviewQuestionSent = true;
        boolean isJavaHomeworkSent = true;

        // Send me interview questions OR Java homework
        System.out.println("The student is okay: " +
        (isInterviewQuestionSent || isJavaHomeworkSent));

        // if there is a single true for OR it is TRUE

        System.out.println("The student is okay: " +
                (isInterviewQuestionSent && isJavaHomeworkSent));

        // if there is a single false for AND it is FALSE

        System.out.println("\nThe student did send the homework " + !isInterviewQuestionSent);

    }
}
