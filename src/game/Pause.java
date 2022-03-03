package game;

import java.awt.*;

public class Pause {

    private Handler handler;

    public void tick() {}

    public void render(Graphics g) {
        Font fnt = new Font("arial", Font.BOLD, 50);
        Font fnt2 = new Font("arial", Font.BOLD, 30);
        g.setFont(fnt);
        g.setColor(Color.white);
        g.drawString("PAUSE", 240, 60);
        g.setFont(fnt2);
        g.drawRect(210, 150, 200, 64);
        g.drawString("Retour", 260, 190);

    }
}
