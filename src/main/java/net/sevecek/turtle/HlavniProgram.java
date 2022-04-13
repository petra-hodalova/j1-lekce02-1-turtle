package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        int x=50,y=300;
        int velikost=100;

        for (int i = 0; i < 5; i++) {
            zofka.drawHouse(x,300,velikost);
            x=x+velikost+30;
        }



    }

}
