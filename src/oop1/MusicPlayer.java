package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    public MusicPlayer() {
    }

    void on() {
        this.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    void off() {
        this.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp() {
        ++this.volume;
        System.out.println("음악 플레이어 볼륨:" + this.volume);
    }

    void volumeDown() {
        --this.volume;
        System.out.println("음악 플레이어 볼륨:" + this.volume);
    }

    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (this.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + this.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

    }
}
