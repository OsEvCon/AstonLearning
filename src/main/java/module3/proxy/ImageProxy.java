package module3.proxy;

import java.sql.Time;

public class ImageProxy implements Image {
    private RealImage realImage;
    private String imageName;
    public ImageProxy(String imageName) {
        this.imageName = imageName;
    }
    @Override
    public void showImage() {
        long beforeTime = System.currentTimeMillis();
        if (realImage == null) {
            realImage = new RealImage(imageName);
        }

        realImage.showImage();
        long afterTime = System.currentTimeMillis();
        System.out.println("Картинка загружалась " +  (afterTime - beforeTime) / 1000 + " Секунд");
    }

    @Override
    public String getImageName() {
        return imageName;
    }
}
