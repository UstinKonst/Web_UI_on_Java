package WebUI_less4;

public class Triangle {
    int areaTriangle(int a, int b, int c) throws TriangleException {
        if(a<0 || b<0 || c<0) throw new TriangleException("Одна из сторон меньше нуля");
        if(a==0 || b==0 || c==0) throw new TriangleException("Одна из сторон равна нулю");
        if((a<10 & b<10 & c>100) || (a<10 & b>100 & c<10) || (a>100 & b<10 & c<10)) throw new TriangleException("Такого треугольника нет");
        int p =(a+b+c)/2;
        return (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
