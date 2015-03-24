package com.stardust.rpgtest2.Entities;


import java.awt.Graphics;
import java.awt.image.BufferedImage;

public abstract class Entity 
{
    public int x, y, sizeX, sizeY;
    
    public static final int SPEED = 2;
    
    BufferedImage image;
    
    public void update()
    {
    }
    
    public void render(Graphics g)
    {
    }
}
