package hw.behave;

import java.util.Iterator;
import java.util.Random;


public class Randoms implements Iterable<Integer> {
    protected Random random;
    int min;
    int max;

    public Randoms(int min, int max) {
        random = new Random(min);
        this.min = min;
        this.max = max + 1;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(min, max);
            }
        };
    }
}
