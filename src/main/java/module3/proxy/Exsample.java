package module3.proxy;

public class Exsample {
    public static void main(String[] args) {
        Image image = new ImageProxy("Котик");
        image.showImage();
        image.showImage();
    }
}
