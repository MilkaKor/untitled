## unit-test
### Условия задачи
Модель данных будет состоять из списка, содержащего последовательность фигур, атрибут, определяющего их способ отображение и панели-прямоугольника, описывающего грфический контекст их отображения. 
составьте класс, реализовав методы доступа к приватным полям, и метод рисования всех фигур из списка последовательно
Надо проверить, что О. создал поля, кроме panel и реализовал методы
public class Picture {
   private ArrayList<MShape> shapes=new ArrayList<>();
   private ArrayList<MPoint> points=new ArrayList<>();
   private String name;
   private Image background;
   private double width, height;

   private  boolean opary;
   private double scale;

   public Picture(String name, double width, double height) {
       this.name = name;
       this.width = width;
       this.height = height;
   }

   public void draw(GraphicsContext gc) {
       ;
   }

   public void add(MShape shape){
       shapes.add(shape);
   }

   public MShape getFocusShape(double x, double y){
       for(MShape a: shapes){
           if (a.contains(x,y)) return a;
       }
       return null;
   }
}
