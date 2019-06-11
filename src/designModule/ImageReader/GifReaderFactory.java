package designModule.ImageReader;

public class GifReaderFactory extends ImageReaderFactory{
	public ImageReader createReader() {
		return new GifReader();
	}

}
