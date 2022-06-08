package module_006.Task_013;

import java.util.Arrays;

class QuarkeTrackTest {
    public static void main(String[] args) {
        int[] track1Data = {1, 3, 5};
        int[] track2Data = {3, 5, 4};
        int[] track3Data = {1, 5, 3};

        QuarkeTrack track1 = new QuarkeTrack(track1Data);
        QuarkeTrack track2 = new QuarkeTrack(track2Data);
        QuarkeTrack track3 = new QuarkeTrack(track3Data);

        //false
        System.out.println(track1.equals(track2));

        //true
        System.out.println(track1.equals(track3));

        //Can be true or false
        System.out.println(track1.hashCode() == track2.hashCode());

        //true
        System.out.println(track1.hashCode() == track3.hashCode());
    }
}

class QuarkeTrack{
    int [] lines;
    int trackSum;
    public QuarkeTrack(int[] lines){
        this.lines = Arrays.copyOf(lines, lines.length);
        this.trackSum = this.sumOfTrack(this.lines);
    }

    private int sumOfTrack(int []track){
        int res = 0;
        for (int steps: track) {
            res += steps;
        }
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        QuarkeTrack that = (QuarkeTrack) o;
        return this.trackSum == that.trackSum;
    }

    @Override
    public int hashCode() {
        return this.trackSum;
    }
}