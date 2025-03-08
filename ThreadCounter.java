package Module8;

class CounterUp implements Runnable {
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println("Counting Up: " + i);
        }
    }
}

class CounterDown implements Runnable {
    public void run() {
        for (int i = 20; i >= 0; i--) {
            System.out.println("Counting Down: " + i);
        }
    }
}
