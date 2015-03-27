package com.stardust.rpgtest2.Entities;

import com.stardust.rpgtest2.gfx.Assets;
import java.awt.Graphics;

public class Player extends Entity
{
    public int lastLook = 3;
    public int anim = 0;
    public static boolean walking;
    
    public Player(int x, int y, int sizeX, int sizeY)
    {
        this.x = x;
        this.y = y;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    
    public void update()
    {
        if(anim < 7500)
        {
            anim++;
        }
        else
        {
            anim = 0;
        }
        switch(lastLook)
        {
            case 0:
            {
                image = Assets.playerUp;
                if(walking)
                {
                    if(anim % 20 > 10)
                    {
                        image = Assets.playerUp1;
                    }
                    else
                    {
                        image = Assets.playerUp2;
                    }
                }
                break;
            }
            case 1:
            {
                image = Assets.playerDn;
                if(walking)
                {
                    if(anim % 20 > 10)
                    {
                        image = Assets.playerDn1;
                    }
                    else
                    {
                        image = Assets.playerDn2;
                    }
                }
                break;
            }
            case 2:
            {
                image = Assets.playerLt;
                if(walking)
                {
                    if(anim % 12 > 4)
                    {
                        image = Assets.playerLt1;
                    }
                    else if(anim % 12 > 8)
                    {
                        image = Assets.playerLt2;
                    }
                    else
                    {
                        image = Assets.playerLt;
                    }
                }
                break;
            }
            case 3:
            {
                image = Assets.playerRt;
                if(walking)
                {
                    if(anim % 12 > 4)
                    {
                        image = Assets.playerRt1;
                    }
                    else if(anim % 12 > 8)
                    {
                        image = Assets.playerRt2;
                    }
                    else
                    {
                        image = Assets.playerRt;
                    }
                }
                break;
            }
        }
        walking = false;
    }
    
    public void render(Graphics g)
    {
        g.drawImage(image, x, y, sizeX, sizeY, null);
    }
}
