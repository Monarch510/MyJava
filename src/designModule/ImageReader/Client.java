package designModule.ImageReader;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageReaderFactory factory;
		factory = (ImageReaderFactory)XMLUtil.getClassBean();
		ImageReader imageReader;
		imageReader = factory.createReader();
		imageReader.readImage();
	}

}
