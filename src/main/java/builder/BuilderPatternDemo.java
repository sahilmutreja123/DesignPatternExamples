package builder;

/**
 * Created by Sahil on 9/23/2017.
 */
public class BuilderPatternDemo {

    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;

    public BuilderPatternDemo(Builder build) {
        this.num3 = build.num3;
        this.num4 = build.num4;
        this.num5 = build.num5;
        this.num1 = build.num1;
        this.num2 = build.num2;
    }

    public static class Builder{

        private int num1;
        private int num2;
        private int num3;
        private int num4;
        private int num5;

        public Builder setNum1(int num1) {
            this.num1 = num1;
            return this;
        }

        public Builder setNum2(int num2) {
            this.num2 = num2;
            return this;
        }

        public Builder setNum3(int num3) {
            this.num3 = num3;
            return this;
        }

        public Builder setNum4(int num4) {
            this.num4 = num4;
            return this;
        }

        public Builder setNum5(int num5) {
            this.num5 = num5;
            return this;
        }

        public BuilderPatternDemo build(){
            return new BuilderPatternDemo(this);
        }
        
    }

    @Override
    public String toString() {
        return "BuilderPatternDemo{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", num3=" + num3 +
                ", num4=" + num4 +
                ", num5=" + num5 +
                '}';
    }
}
