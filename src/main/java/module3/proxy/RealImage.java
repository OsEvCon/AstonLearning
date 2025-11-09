package module3.proxy;

public class RealImage implements Image {
    private String imageName;

    public RealImage(String imageName) {
        this.imageName = imageName;
        loadImage();
    }

    @Override
    public void showImage() {
        System.out.println("Показываю картинку: " + imageName);
    }

    @Override
    public String getImageName() {
        return imageName;
    }

    private void loadImage() {
        System.out.println("Загружаю картинку: " + imageName);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
