package nected_classes.local_inner_class;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult(21,4);

    }
}

class Math {
    public void getResult(final int delimoe, final int delitil) {

        class Delenie {
//            private int delomoe;
//            private int delitil;

//            public int getDelomoe() {
//                return delomoe;
//            }
//
//            public void setDelomoe(int delomoe) {
//                this.delomoe = delomoe;
//            }

//            public int getDelitil() {
//                return delitil;
//            }
//
//            public void setDelitil(int delitil) {
//                this.delitil = delitil;
//            }

            public int getChastnoe() {
                return delimoe / delitil;
            }

            public int getOstatok() {
                return delimoe % delitil;
            }
        }

        Delenie delenie = new Delenie();
//        delenie.setDelomoe(21);

        System.out.println("Delimoe = " + delimoe);
        System.out.println("Delitel = " + delitil);
        System.out.println("Chastnoe = " + delenie.getChastnoe());
        System.out.println("Ostatok = " + delenie.getOstatok());
    }
}