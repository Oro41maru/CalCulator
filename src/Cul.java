    import org.junit.Test;

    public class Cul extends Cal {
        @Test
        public void plusTest() {
            int a = plus(1,3);
            if (a == 4) {
                System.out.println("ok"); }
            else {
                System.out.println("error!");}
        }
        @Test
        public void minusTest() {
            int a = minus(3,1);
            if (a == 2) {
                System.out.println("ok"); }
            else {
                System.out.println("error!");}
        }
        @Test
        public void umnTest() {
            int a = umn(1,3);
            if (a == 3) {
                System.out.println("ok"); }
            else {
                System.out.println("error!");}
        }
        @Test
        public void delTest() {
            int a = del(4,2);
            if (a == 2) {
                System.out.println("ok"); }
            else {
                System.out.println("error!"); }
        }
        @Test
        public void PerTest() {
            int a = Per(1);
            if (a == 8) {
                System.out.println("ok"); }
            else {
                System.out.println("error!"); }
        }
    }

