package UREH;

class userException extends Exception{
    String warning;
    userException(String message) {
        warning = message;
    }
}
