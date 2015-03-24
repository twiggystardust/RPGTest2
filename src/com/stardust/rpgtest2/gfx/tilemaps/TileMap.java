package com.stardust.rpgtest2.gfx.tilemaps;

import com.stardust.rpgtest2.Game;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TileMap 
{
    int posX, posY, mapSizeX, mapSizeY; 
    public String filename;
    
    public int[][] tilemap;
    
    
    public TileMap(int posX, int posY, int mapSize, String filename)
    {
        tilemap = new int[mapSize][mapSize];
        this.posX = posX;
        this.posY = posY;
        this.mapSizeX = mapSize;
        this.mapSizeY = mapSize;
        this.filename = filename;
    }
    
    public void render(Graphics g)
    {
        
        for(int y = 0; y < tilemap.length; y++)
        {       
            for(int x = 0; x < tilemap.length; x++)
            {
                int textureType = tilemap[x][y];
               
                
                BufferedImage texture =  Tile.getTileImage(textureType);
                g.drawImage(texture, posX, posY, null);
                posY += 32;
            }
            posX += 32;
            posY = Game.mapY;
        }
        posX = Game.mapX;
        posY = Game.mapY;
    }
    
    public void fileParser() throws IOException
    {
        int x = 0, y = 0;
        BufferedReader in = new BufferedReader(new FileReader(filename));
        
        String line;
        
        while((line = in.readLine()) != null)
        {
            String[] values = line.split(",");
            
            for(String str : values)
            {
                int str_int = Integer.parseInt(str);
                tilemap[x][y] = str_int;
                ++y;
            }
            ++x;
            y = 0;
        }
        x = 0;
        
        in.close();
    }
}
