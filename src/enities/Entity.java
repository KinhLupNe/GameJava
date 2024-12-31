package enities;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public abstract class Entity {
    protected float x, y;
    protected int width, height;
    protected Rectangle2D.Float hitbox;

    public Entity(float x, float y, int width, int height){
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    protected void drawHitbox(Graphics g){
        g.setColor(Color.PINK);
        g.drawRect((int)hitbox.x, (int)hitbox.y, (int)hitbox.width, (int)hitbox.height);
    }
    protected void initHitbox(float x, float y, float w, float h) {
        hitbox = new Rectangle2D.Float((int)x,(int)y,w,h);
    }
//
//    protected void updateHitbox(){
//        hitbox.x = (int)x;
//        hitbox.y = (int)y;
//    }

    public Rectangle2D.Float getHitbox(){
        return hitbox;
    }

}
