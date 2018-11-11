package patterns.decorator;

public class SeniorJavaDev extends DeveloperDecorator {
    public SeniorJavaDev(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "Make code review.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " " + makeCodeReview();
    }
}
