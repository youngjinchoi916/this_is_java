package chapter09_Nested.sec05_Anonymous.part02_Anonymous_Implements.my02_Button_Event;

public class Window {
	//필드
	Button button1 = new Button();
	Button button2 = new Button();
	
	//필드의 초기값으로 대입
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("버튼1 클릭");
		}
	};
	
	public Window() {
		//필드의 초기값으로 세팅한 익명 구현 객체가 대입됨
		button1.setOnClickListener(listener);
		
		//매개값으로 익명 구현 객체 대입
		button2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("버튼2 클릭");
			}
		});
	}
	
} //end class
