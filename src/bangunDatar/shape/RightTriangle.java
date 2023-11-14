package bangunDatar.shape;

import bangunDatar.FlatShapes;

public class RightTriangle implements FlatShapes {

    private Float base;
    private Float height;

    public void setBase(Float base) throws Exception{
        if (base <= 0) {
            throw new Exception("Angka harus bilangan bulat positif!");
        }
        this.base = base;
    }

    public void setHeight(Float height) throws Exception {
        if (height <= 0) {
            throw new Exception("Angka harus bilangan bulat positif!");
        }
        this.height = height;
    }

    public Float getBase() {
        return this.base;
    }

    public Float getHeight() {
        return this.height;
    }

    public RightTriangle(Float base, Float height) throws Exception {
        this.setBase(base);
        this.setHeight(height);
    }

    @Override
    public void showShape() {
        // TODO Auto-generated method stub
        // for(int i = 1; i <= this.height; i++) {
        //     for
        // }
        System.out.println("Under construction");
    }

    @Override
    public Float perimeter() {
        // TODO Auto-generated method stub
        Double tiltSide = Math.sqrt(Math.pow(this.base, 2) + Math.pow(this.height, 2));
        return (float) (this.base + this.height + tiltSide);
    }

    @Override
    public Float area() {
        // TODO Auto-generated method stub
        return (float) (0.5 * this.base * this.height);
    }
    
}
