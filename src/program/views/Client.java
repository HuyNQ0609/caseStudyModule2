package program.views;

public class Client {
    private static final PerformFunction performFunction = new PerformFunction();

    public static void main(String[] args) {
        performFunction.loginUser();
        performFunction.showManagerProgram();
    }
}