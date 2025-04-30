package com.javaex.ex13;

public class Tv {

	private int channel;
    private int volume;
    private boolean power;

    // 생성자 (기본 초기값 설정)
    public TV() {
        this.channel = channel;
        this.volume = volume;
        this.power = power;
    }

    // 오버로딩 생성자
    public TV(int channel, int volume, boolean power) {
        this.channel = (channel >= 1 && channel <= 255) ? channel : 7;
        this.volume = (volume >= 0 && volume <= 100) ? volume : 20;
        this.power = power;
    }

    // Getter 메서드
    public int getChannel() {
        return channel;
    }

    public int getVolueme() {  
        return volume;
    }

    public boolean getPower() {
        return power;
    }

    // 전원 설정
    public void setPower(boolean on) {
        this.power = on;
    }

    // 채널 설정
    public void setChannel(int channel) {
        if (channel >= 1 && channel <= 255) {
            this.channel = channel;
        }
    }

    // 채널 증감
    public void setChannel(boolean up) {
        if (up) {
            if (channel < 255) {
                channel++;
            }
        } else {
            if (channel > 1) {
                channel--;
            }
        }
    }

    // 볼륨 설정
    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    // 볼륨 증감
    public void setVolume(boolean up) {
        if (up) {
            if (volume < 100) {
                volume++;
            }
        } else {
            if (volume > 0) {
                volume--;
            }
        }
    }

    // 상태 출력
    public void status() {
        System.out.println("파워:" + power + "    채널:" + channel + "    볼륨:" + volume);
    }
}

}
