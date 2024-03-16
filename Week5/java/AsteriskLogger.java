package Week5.java;
public class AsteriskLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("***" + message + "***");
    }

    @Override
    public void error(String message) {
        StringBuilder errorBox = new StringBuilder();
        errorBox.append("****************").append("\n");
        errorBox.append("***Error: ").append(message).append("***").append("\n");
        errorBox.append("****************").append("\n");
        System.out.println(errorBox);
    }
}
