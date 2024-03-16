package Week5.java;

public class SpacedLogger implements Logger {
    @Override
    public void log(String message) {
        StringBuilder spacedMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            spacedMessage.append(message.charAt(i)).append(" ");
        }
        System.out.println(spacedMessage);
    }

    @Override
    public void error(String message) {
        StringBuilder errorBox = new StringBuilder();
        errorBox.append("ERROR: ");
        for (int i = 0; i < message.length(); i++) {
            errorBox.append(message.charAt(i)).append(" ");
        }
        System.out.println(errorBox);
    }
}
