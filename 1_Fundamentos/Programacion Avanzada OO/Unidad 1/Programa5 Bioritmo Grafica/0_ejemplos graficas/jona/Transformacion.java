package newpackage1;

class Transformacion {

    public int Xmin, Xmax, Ymin, Ymax, Xtmin, Ytmin, Xtmax, Ytmax;

    public double TransformarX(double x) {
        double Xn, Xp, Xr;
        Xn = (x - Xmin) / (Xmax - Xmin);
        Xp = Xn * (Xtmax - Xtmin) + Xtmin;
        Xr = Xtmax + Xp;
        return Xr;
    }

    public double TransformarY(double y) {
        double Yn, Yp, Yr;
        Yn = (y - Ymin) / (Ymax - Ymin);
        Yp = Yn * (Ytmax - Ytmin) + Ytmin;
        Yr = Ytmax - Yp;
        return Yr;
    }
}
