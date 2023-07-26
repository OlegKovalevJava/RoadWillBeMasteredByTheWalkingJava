package finished.lesson17.task3;

public enum GreetingType {
    HI("Hi", "Hello"),
    BYE("Bye", "Good bye"),
    HOW_ARE_YOU("How are you", "How are your doing"),
    UNKNOWN(null, "Unknown message");

    private final String greeting;
    private final String answer;

    GreetingType(String greeting, String answer) {
        this.greeting = greeting;
        this.answer = answer;
    }

    public static GreetingType findGreetingType(String greeting) {
        if (greeting == null) {
            return UNKNOWN;
        }
        for (GreetingType greetingType : GreetingType.values()) {
            if (greeting.equals(greetingType.greeting)) {
                return greetingType;
            }
        }
        return UNKNOWN;
    }

    public String getGreeting() {
        return greeting;
    }

    public String getAnswer() {
        return answer;
    }
}