/*
<applet code = "AppletLine" height = 1000 width =1200>
</applet>
*/
import java.applet.*;
//packages to draw lines
import java.awt.*;
public class AppletLine extends Applet
{
     Font f1 = new Font("arial", Font.BOLD|Font.ITALIC, 16);
     public void paint(Graphics g)
      {          
                setBackground(Color.black);
                setForeground(Color.green);

                
                //draw line (x1, y1, x2, y2)
                g.drawLine(100, 20, 100, 600);
               //draw rectangle (x1, y1, x2, y2)
                g.drawRect(100, 200, 200, 300);
                //text (content, x, y)
                g.setFont(f1);
                g.drawString("This is my Applet text program", 100, 200);
                //set color for text
                g.setColor(Color.red);
                g.drawLine(300, 300, 300, 600);
       }
}