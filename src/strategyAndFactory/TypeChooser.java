package strategyAndFactory;

public class TypeChooser {
	public static ImageSaver getSaver(String type) {
		if(type.equals("GIF")) {
			return new GIFSaver();
		} else if(type.equals("JPEG")) {
			return new JPEGSaver();
		} else {
			return null;
		}
	}
}
