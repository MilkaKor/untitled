import java.awt.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class PictureTest {
    public void testName() {
        String name = "test";
        Picture picture = new Picture(name);
        if (picture.getName().equals(name)) {
            System.out.println("Name test passed");
        } else {
            System.out.println("Name test failed");
        }
    }

    public void testShapes() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(50, 50, 100, 100));
        shapes.add(new Rectangle(50, 100, 100, 100));
        Picture picture = new Picture(shapes);
        if ((picture.getShapes() != null) && (picture.getShapes() == shapes) && !(picture.getShapes().isEmpty())){
            System.out.println("Shapes test passed");
        }
        else
        {
            System.out.println("Shapes test failed");
        }
    }

    public void testOpacity() {
        boolean opacity = true;
        Picture picture = new Picture(opacity);
        if(picture.isOpacity()){
            System.out.println("Opacity test passed");
        }
        else{
            System.out.println("Opacity test failed");
        }
    }

    public void testPanel() {
        Panel panel = new Panel();
        panel.add(new Button());
        Picture picture = new Picture(panel);
        if(picture.getPanel() == panel){
            System.out.println("Panel test passed");
        }
        else
        {
            System.out.println("Panel test failed");
        }

    }

    public void testSaveLoad() throws Exception {
        Picture picture = new Picture();
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            picture.save(baos);
            byte[] bytes = baos.toByteArray();
            try (ByteArrayInputStream bais = new ByteArrayInputStream(bytes)) {
                Picture loadedPicture = new Picture().load(bais);
                if ((loadedPicture.getName() == picture.getName() && loadedPicture.getShapes() == picture.getShapes())){
                    System.out.println("Picture load passed");
                }
                else {
                    System.out.println("Picture load failed");
                }
            }
        }
    }

    public void testDraw() {
        Picture picture = new Picture();
        picture.draw();
    }

    public static void main(String[] args) {
        PictureTest tester = new PictureTest();
        tester.testName();
        tester.testShapes();
        tester.testOpacity();
        tester.testPanel();
        try {
            tester.testSaveLoad();
        } catch (Exception e) {
            e.printStackTrace();
        }
        tester.testDraw();
    }
}
