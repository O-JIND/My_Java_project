package Ch06_abstract_interface.myshape.cartest;

public interface Radio {

       public enum Frequency {
        AM, FM;

        public static void play(Frequency freq, double channel) {
            String label = (freq == FM) ? "FM" : "AM";
            System.out.println("재생 중: " + label + " 채널 " + channel);
        }
    }


    default void Anounce() {
        System.out.println("라디오 지금 시작합니다.");
    }


}
