package designModule.ImageReader;

public class JpgReaderFactory extends ImageReaderFactory{
	public ImageReader createReader() {
		return new JpgReader();
	}
}
