package com.turing.javase4thbatch.chapter14;

class TwoD {
    int x, y;

    TwoD(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class ThreeD extends TwoD {
    int z;
    ThreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

class FourD extends ThreeD {
    int t;

    FourD(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }
}

class Coords<T extends TwoD> {
    T[] coords;

    Coords(T[] coords) {
        this.coords = coords;
    }

    static void showXY(Coords<?> c) {
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + ", " + c.coords[i].y);
        }
        System.out.println();
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + ", " + c.coords[i].y + ", " + c.coords[i].z);
        }
        System.out.println();
    }
}
public class BoundedWildcard {
    public static void main(String[] args) {
        ThreeD[] threeD = {
                new ThreeD(1, 2, 3),
                new ThreeD(4, 5, 6),
                new ThreeD(7, 8,9),
        };
        Coords<ThreeD> threeDCoords = new Coords<>(threeD);
        Coords.showXYZ(threeDCoords);
    }
}
