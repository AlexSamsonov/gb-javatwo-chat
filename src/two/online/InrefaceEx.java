package two.online;

public class InrefaceEx implements MouseListener {

    private static class Human implements PhysicalActions, VerbalAction {

        @Override
        public void walk() {
            class Footstep {

            }
        }
        @Override
        public void waveHands() {

        }
        @Override
        public void jump(int height) {

        }
        @Override
        public void speak() {

        }
        @Override
        public void read() {

        }
        @Override
        public void write(String msg) {

        }

        @Override
        public void blink() {

        }
    }
    private static class Monkey implements PhysicalActions {

        @Override
        public void walk() {

        }

        @Override
        public void waveHands() {

        }

        @Override
        public void jump(int height) {

        }

        @Override
        public void blink() {

        }
    }


    private static void mousePressed(MouseListener m) {
        m.mouseUp();
    }

    public static void main(String[] args) {

        mousePressed( () -> {
            System.out.println("MouseUp implementation");
        });


        PhysicalActions hum = new Human();
        hum.blink();

        VerbalAction hum1 = new Human();
        hum1.blink();

    }

    @Override
    public void mouseUp() {
        System.out.println("MouseUp implementation");
    }

}
