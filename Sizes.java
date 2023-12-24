package lab4;

public class Sizes {
    public enum Size {
        XXS(36) {
            @Override
            public String getDescription() {
                return "Children's clothing size";
            }
        },
        XS(38),
        S(40),
        M(42),
        L(44);


        private int EuroS;

        Size(int euro) {
            EuroS = euro;
        }

        Size() {
        }

        public String getDescription() {

            return "Adult clothing size";
        }

        @Override
        public String toString() {
            return name() + "(" + EuroS + ") " + getDescription();
        }
    }

    public static void main(String[] args) {

    }
}
