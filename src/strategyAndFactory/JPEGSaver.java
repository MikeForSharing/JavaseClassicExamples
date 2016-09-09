package strategyAndFactory;

public class JPEGSaver implements ImageSaver {
	public void save() {
		System.out.println("保存JPE格式的图片");
	}
}
