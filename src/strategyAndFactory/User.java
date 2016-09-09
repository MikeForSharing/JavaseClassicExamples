package strategyAndFactory;

public class User {
	public static void main(String[] args) {
		System.out.println("用户选择了GIF格式");
		ImageSaver gif = TypeChooser.getSaver("GIF");
		gif.save();
		System.out.println("用户选择了JPEG格式");
		ImageSaver jpeg = TypeChooser.getSaver("JPEG");
		jpeg.save();
	}
}
