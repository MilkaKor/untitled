import java.awt.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class Picture {
    private String name;
    private ArrayList<Shape> shapes;
    private boolean opacity;
    private Panel panel;

    public Picture()
    {

    }

    public Picture(String name, ArrayList<Shape> shapes, boolean opacity, Panel panel) {
        this.name = name;
        this.shapes = shapes;
        this.opacity = opacity;
    }

    public Picture(String name)
    {
        this.name = name;
    }
    public Picture(boolean opacity)
    {
        this.opacity = opacity;
    }
    public Picture(ArrayList<Shape> shapes)
    {
        this.shapes = shapes;
    }
    public Picture(Panel panel)
    {
    }

    public void save(OutputStream outputStream) {
    }

    public Picture load(InputStream inputStream) {
        return this;
    }

    public void draw() {
    }

    public boolean isOpacity() {
        return opacity;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public Panel getPanel() {
        return panel;
    }
}

