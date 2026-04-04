package interviewImportentConcepts;

public class Resource {
    public static void main(String[] args) throws Throwable {

        Resource r = new Resource();
        r.finalize();
    }
        public Resource() {
            System.out.println("Resource created.");
        }

        @Override
        protected void finalize() throws Throwable {
            try {
                System.out.println("Finalize called: Cleaning up native resources...");
                // Logic to close files or sockets
            } finally {
                super.finalize();
            }
        }
    }
