package exam2;
public class Button {
	private OnClickListener listener;
	
	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	public void touch() {
		listener.onClick();
	}
	
	interface OnClickListener{
		void onClick();
	}
}