package bangunDatar.shape;

import bangunDatar.FlatShapes;

public class Rectangle implements FlatShapes {
    private Float width;
    private Float height;

    public void setWidth(Float width) throws Exception {
        if (width <= 0) {
            throw new Exception("Angka harus bilangan bulat positif!");
        }
        this.width = width;
    }

    public void setHeight(Float height) throws Exception {
        if (height <= 0) {
            throw new Exception("Angka harus bilangan bulat positif!");
        }
        this.height = height;
    }

    public Float getWidth() {
        return this.width;
    }

    public Float getHeight() {
        return this.height;
    }

    public Rectangle(Float width, Float height) throws Exception {
        this.setWidth(width);
        this.setHeight(height);
    }

    @Override
    public void showShape() {
        // TODO Auto-generated method stub
        for (int i = 1; i <= this.height; i++) {
            for(int j = 1; j <= this.width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    @Override
    public Float perimeter() {
        // TODO Auto-generated method stub
        return (this.width * 2) + (this.height * 2);
    }

    @Override
    public Float area() {
        // TODO Auto-generated method stub
        return this.width * this.height;
    }
}
