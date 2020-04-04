package c5.z5_1;

public enum Country {
    PL {
        @Override
        public String toString() {
            return "Polska";
        }
    },
    NL {
        @Override
        public String toString() {
            return "Nederland";
        }
    },
    DE {
        @Override
        public String toString() {
            return "Deutschland";
        }
    },
}
