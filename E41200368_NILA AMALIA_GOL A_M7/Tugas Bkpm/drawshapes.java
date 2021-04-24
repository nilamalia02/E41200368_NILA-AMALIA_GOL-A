package wsibd_m7_nila;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
/**
 *
 * @author Nila Amalia
 */
public class drawshapes extends Applet {
    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;
    
    @Override
    public void init() {
        font = new Font("Arial", Font.ITALIC, 18);
        redColor = Color.RED;
        backgroundColor = Color.orange;
        blueColor = new Color(0,0,112);
        setBackground(backgroundColor);   
    }
    @Override
    public void stop() {
    }
    public void paint(Graphics g) {
        g.setFont(font);
        g.drawString("Draw shapes", 90, 20);
        g.setColor(blueColor);
        g.drawRect(120, 120, 120, 120);
        g.fillRect(115, 115, 90, 90);
        g.setColor(redColor);
        g.drawArc(110, 110, 50, 50, 0, 360);
        g.setColor(Color.CYAN);
        g.drawRect(50, 50, 50, 50);
        g.fillRect(50, 50, 60, 60);
    }
}
