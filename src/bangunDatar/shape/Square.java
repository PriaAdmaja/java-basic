package bangunDatar.shape;

import bangunDatar.FlatShapes;

public class Square implements FlatShapes {

    private Float side;

    public void setSide(Float side) throws Exception {
        if (side <= 0) {
            throw new Exception("Angka harus bilangan bulat positif!");
        }
        this.side = side;
    }

    public Float getSide() {
        return this.side;
    }

    public Square(Float side) throws Exception {
        this.setSide(side);
    }

    @Override
    public void showShape() {
        // TODO Auto-generated method stub
       for(int i = 1; i <= side; i++) {
        for(int j = 1; j <= side; j++) {
            System.out.print("* ");
        }
        System.out.println();
       }
    }

    @Override
    public Float perimeter() {
        // TODO Auto-generated method stub
        return this.side * 4;
    }

    @Override
    public Float area() {
        // TODO Auto-generated method stub
        return this.side * this.side;
    }

}
