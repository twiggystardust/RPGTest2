package com.stardust.rpgtest2;

import com.stardust.rpgtest2.Entities.Player;
import com.stardust.rpgtest2.gfx.Assets;
import com.stardust.rpgtest2.gfx.tilemaps.TileMap;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.io.IOException;
import javax.swing.JFrame;

public class Game extends Canvas implements Runnable
{
    public boolean debug;
    public String title = "RPGTest2";
    
    public static final int WIDTH = 320, HEIGHT = 320, SCALE = 2;
    public static boolean running = false;
    public Thread gameThread;
    public static JFrame frame;
        
    public static StateEngine stateEngine;
    public Assets assets;
    public Input input;
    public Movement move;
    
    public static TileMap twnLyr1;
    public static TileMap twnLyr2;
    public static TileMap twnLyr3;
    public static TileMap worldLyr1;
    public static Player player;
    
    public static int mapX = 0, mapY = 0;
    public static int wMapX = 0, wMapY = 0;
    
    public void init() throws IOException
    {
        stateEngine = new StateEngine();
        assets = new Assets();
        twnLyr1 = new TileMap(mapX, mapY, 32, "res/tileMap3.txt");
        twnLyr1.fileParser();
        twnLyr2 = new TileMap(mapX, mapY, 32, "res/newLayer2.txt");
        twnLyr2.fileParser();
        twnLyr3 = new TileMap(mapX, mapY, 32, "res/newLayer3.txt");
        twnLyr3.fileParser();
        worldLyr1 = new TileMap(wMapX, wMapY, 50, "res/worldMap.txt");
        worldLyr1.fileParser();
        
        player = new Player(WIDTH - 32, HEIGHT - 32, 32, 32);
                
        input = new Input();
        move = new Movement();
        
        this.addKeyListener(input);
        
        
    }
    
    public synchronized void start()
    {
        if(running)return;          
        running = true;
        gameThread = new Thread(this);
        gameThread.start();
    }
    
    public synchronized void stop()
    {
        if(!running)return;
        running = false;
        try
        {
            gameThread.join();
        } catch (InterruptedException e)
        {
           e.printStackTrace();
        }
    }
    
    public void run()
    {
        try
        {
            init();
        } catch (IOException e)
        {
        }
        long lastTime = System.nanoTime();
        final double amountOfTicks = 60D;        
        long timer = System.currentTimeMillis();
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        int frames = 0;
        int updates = 0;
        
        requestFocus();
        
        while(running)
        {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            if(delta >= 1)
            {
                update();
                
                updates++;
                delta--;
            }
            render();            
            frames++;
            
            if(System.currentTimeMillis() - timer > 1000)
            {
                timer += 1000;                
                frame.setTitle(title + "  |  " + "Updates/second: " + updates + " |  Renders/second: " + frames);
                updates = 0;
                frames = 0;
            }
        }
        stop();
    }
    
    public void update()
    {
        
        player.update();
        move.update();
        if(Input.x)
        {
            debug = true;
        }
        debug = false;
    }
    
    public void render()
    {
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null)
        {
            createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();
        //START RENDER
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH * SCALE, HEIGHT * SCALE);
        switch(stateEngine.state)
        {
            case STATE_WORLD:
            {
                worldLyr1.render(g);
                player.render(g);
                break;
            }
            case STATE_TOWN:
            {        
                twnLyr1.render(g);
                twnLyr2.render(g);
                twnLyr3.render(g);
                player.render(g);
                break;
            }
        }
       
        //END RENDER
        g.dispose();
        bs.show();
    }
    
    public static void main(String[] args)
    {
        Game game = new Game();
        game.setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
        game.setMaximumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
        game.setMinimumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
        
        frame = new JFrame("RPGTest2");
        frame.setSize(WIDTH * SCALE, HEIGHT * SCALE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(game);
        frame.setVisible(true);
        
        game.start();
    }
}
