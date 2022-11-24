package school.mjc.stage0.loops.task1;

public class RepeatIsBad {

    @SuppressWarnings("java:S106")
    public void repeatIsBad(){
        int count = 1;
        while (count <= 20){
            System.out.println("writing the same code doesn't have much impact, and it's also time consuming");
            count ++;
        }
    }
}
