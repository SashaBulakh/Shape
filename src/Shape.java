class ShapeTest{
    public static void main(String[] args){
        Shape shape = new Shape();

        shape.act(new Shape.Circle());
        shape.act(new Shape.Cylinder());
        shape.act(new Shape.Quad());
        shape.act(new Shape.Rectangle());
        shape.act(new Shape.Triangle());

    }
}
public class Shape {
    static abstract class ShapeItems {
        abstract String printNameFigure();
    }
    public void act(ShapeItems item){
        System.out.println(item.printNameFigure());
    }

    static class Circle extends ShapeItems {
        @Override
        public String printNameFigure() {
            return "My nane is Circle!";
        }
    }


    static class Rectangle extends ShapeItems {
        @Override
        public String printNameFigure() {
            return "My nane is Rectangle!";
        }
    }

    static class Cylinder extends ShapeItems {
        @Override
        public String printNameFigure() {
            return "My nane is Cylinder!";
        }
    }

    static class Quad extends ShapeItems {
        @Override
        public String printNameFigure() {
            return "My nane is Quad!";
        }
    }


    static class Triangle extends ShapeItems {
        @Override
        public String printNameFigure() {
            return "My nane is Triangle!";
        }
    }
}
