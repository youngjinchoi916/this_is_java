package chapter08_Interface.sec03_Implement.part01_name_implement_class;

public class Audio implements RemoteControl {
	//필드
	private int volume;
	
	/*
	 * [추상메소드들에 대한 실체 메소드를 작성할 때 주의할 점]
	 *  - 인터페이스의 모든 메소드는 기본적으로 public 접근제한을 갖기 때문에
	 *     public 보다 더 낮은 접근 제한으로 작성할 수 없다.
	 */
	//turnOn() turnOn() 추상메소드의 실체 메소드
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}	
	
	//turnOff() 추상메소드의 실체 메소드
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	//setVolume() 추상메소드의 실체 메소드
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + volume);
	}
	
	
}
