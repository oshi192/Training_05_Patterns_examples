package patterns.builder;

public class ClassWithBuilder {
    private int intValue;
    private long longValue;
    private String stringValue;
    private char charValue;

    private ClassWithBuilder(Builder builder) {
        this.intValue = builder.intValue;
        this.longValue = builder.longValue;
        this.stringValue = builder.stringValue;
        this.charValue = builder.charValue;
    }

    public static class Builder {
        private int intValue;
        private long longValue;
        private String stringValue;
        private char charValue;

        public Builder intValue(int intValue) {
            this.intValue = intValue;
            return this;
        }

        public Builder longValue(long longValue) {
            this.longValue = longValue;
            return this;
        }

        public Builder stringValue(String stringValue) {
            this.stringValue = stringValue;
            return this;
        }

        public Builder charValue(char charValue) {
            this.charValue = charValue;
            return this;
        }

        public ClassWithBuilder build() {
            return new ClassWithBuilder(this);
        }
    }


}
