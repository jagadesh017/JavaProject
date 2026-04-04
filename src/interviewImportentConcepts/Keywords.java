package interviewImportentConcepts;

public class Keywords {

    /*
    Final: we can use at variable level-> variable is constant
    we can use method level-> it can not override
    at class level-> we can not inherit the class
    finally:
    A block used in exception handling that always executes, regardless of whether an exception was thrown or caught
    finalized:

    */
        public static void main(String[] args) {
            try {
                System.out.println("1. Inside try block");
            } catch (Exception e) {
                System.out.println("Inside catch block");
            } finally {
                // This runs AFTER the return statement is evaluated
                System.out.println("2. Inside finally block (Cleanup)");
            }
        }
    }