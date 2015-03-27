package com.stardust.rpgtest2;

import com.stardust.rpgtest2.Entities.Player;


public class Movement 
{
    public Movement()
    {
    }
    
    public void update()
    {
        if(Game.stateEngine.state == StateEngine.State.STATE_TOWN)
        {
            townMove();
            setTownEdges();
        }
        if(Game.stateEngine.state == StateEngine.State.STATE_WORLD)
        {
            worldMove();
            setWorldEdges();
        }
    }
    
    public void townMove()
    {
        if(Input.up)
        {
            Game.mapY += Player.SPEED;
            Game.player.lastLook = 0;
            Player.walking = true;
        }
        if(Input.dn)
        {
            Game.mapY -= Player.SPEED;
            Game.player.lastLook = 1;
            Player.walking = true;
        }
        if(Input.lt)
        {
            Game.mapX += Player.SPEED;
            Game.player.lastLook = 2;
            Player.walking = true;
        }
        if(Input.rt)
        {
            Game.mapX -= Player.SPEED;
            Game.player.lastLook = 3;
            Player.walking = true;
        }
    }
    
    public void worldMove()
    {
        if(Input.up)
        {
            Game.wMapY += Player.SPEED;
            Game.player.lastLook = 0;
            Player.walking = true;
        }
        if(Input.dn)
        {
            Game.wMapY -= Player.SPEED;
            Game.player.lastLook = 1;
            Player.walking = true;
        }
        if(Input.lt)
        {
            Game.wMapX += Player.SPEED;
            Game.player.lastLook = 2;
            Player.walking = true;
        }
        if(Input.rt)
        {
            Game.wMapX -= Player.SPEED;
            Game.player.lastLook = 3;
            Player.walking = true;
        }
    }
    
    public void setTownEdges()
    {
        if(Game.mapY >= Game.HEIGHT - 32)
        {
            Game.mapY = Game.HEIGHT - 32;
        }
        if(Game.mapY + Game.twnLyr1.mapSizeY <= Game.HEIGHT)
        {
            Game.mapY = -Game.twnLyr1.mapSizeY + Game.HEIGHT;
        }
        if(Game.mapX >= Game.WIDTH - 32)
        {
            Game.mapX = Game.WIDTH - 32;
        }
        if(Game.mapX + Game.twnLyr1.mapSizeX <= Game.WIDTH)
        {
            Game.mapX = -Game.twnLyr1.mapSizeX + Game.WIDTH;
        }
    }
    
    public void setWorldEdges()
    {
        if(Game.wMapY >= Game.HEIGHT - 32)
        {
            Game.wMapY = Game.HEIGHT - 32;
        }
        if(Game.wMapY + Game.worldLyr1.mapSizeY <= Game.HEIGHT)
        {
            Game.wMapY = -Game.worldLyr1.mapSizeY + Game.HEIGHT;
        }
        if(Game.wMapX >= Game.WIDTH - 32)
        {
            Game.wMapX = Game.WIDTH - 32;
        }
        if(Game.wMapX + Game.worldLyr1.mapSizeX <= Game.WIDTH)
        {
            Game.wMapX = -Game.worldLyr1.mapSizeX + Game.WIDTH;
        }
    }
}
