package com.stardust.rpgtest2.gfx;

import java.awt.image.BufferedImage;

public class Assets 
{
    public ImageLoader loader;
    public SpriteSheet sheet, playerSheet;
    public BufferedImage tileSheet, playerImage;
    public static BufferedImage grass, dirt, water, tree, multiTree, NSpath, uprtPath; 
    public static BufferedImage EWpath, upltPath, dnltPath, dnrtPath, watgrsdn;
    public static BufferedImage watgrslt, watgrsup, watgrsrt, watgrsSE, watgrsSW, watgrsNW;
    public static BufferedImage watgrsNE, pointer, pathOpRt, pathOpLt, pathOpDn, pathOpUp;
    public static BufferedImage pathOpAll, pathOpen, blankTile, singleHouse, doubleHouse;
    public static BufferedImage wepBanner, armBanner, innBanner;
    public static BufferedImage playerUp, playerUp1, playerUp2, playerDn, playerDn1;
    public static BufferedImage playerDn2, playerLt, playerLt1, playerLt2, playerRt, playerRt1, playerRt2;
    
    public Assets()
    {
        loader = new ImageLoader();
        
        tileSheet = loader.load("/tileSheet.png");
        playerImage = loader.load("/newSpriteSheet11.png");
        
        sheet = new SpriteSheet(tileSheet);
         playerSheet = new SpriteSheet(playerImage);
        
        setTileImages();
        setPlayerImage();
    }
    
    public void setTileImages()
    {
        grass = sheet.crop(0, 0, 32, 32);
        dirt = sheet.crop(1, 0, 32, 32);
        water = sheet.crop(2, 0, 32, 32);
        tree = sheet.crop(3, 0, 32, 32);
        multiTree = sheet.crop(4, 0, 32, 32);
        NSpath = sheet.crop(5, 0, 32, 32);
        uprtPath = sheet.crop(6, 0, 32, 32);
        EWpath = sheet.crop(7, 0, 32, 32);
        upltPath = sheet.crop(8, 0, 32, 32);
        dnltPath = sheet.crop(9, 0, 32, 32);
        dnrtPath = sheet.crop(9, 1, 32, 32);
        watgrsdn = sheet.crop(0, 1, 32, 32);
        watgrslt = sheet.crop(1, 1, 32, 32);
        watgrsup = sheet.crop(2, 1, 32, 32);
        watgrsrt = sheet.crop(3, 1, 32, 32);
        watgrsSE = sheet.crop(4, 1, 32, 32);
        watgrsSW = sheet.crop(5, 1, 32, 32);
        watgrsNW = sheet.crop(6, 1, 32, 32);
        watgrsNE = sheet.crop(7, 1, 32, 32);
        pointer = sheet.crop(4, 2, 32, 32);
        pathOpRt = sheet.crop(5, 2, 32, 32);
        pathOpLt = sheet.crop(6, 2, 32, 32);
        pathOpDn = sheet.crop(7, 2, 32, 32);
        pathOpUp = sheet.crop(8, 2, 32, 32);
        pathOpen = sheet.crop(8, 3, 32, 32);
        pathOpAll = sheet.crop(9, 2, 32, 32);
        singleHouse = sheet.crop(0, 2, 96, 96);
        doubleHouse = sheet.crop(0, 5, 160, 96);
        wepBanner = sheet.crop(3, 3, 32, 32);
        armBanner = sheet.crop(3, 2, 32, 32);
        innBanner = sheet.crop(3, 4, 32, 32);
        blankTile = sheet.crop(4, 4, 32, 32);
    }
    
    public void setPlayerImage()
    {
        playerUp = playerSheet.crop (0, 0, 32, 32);
        playerUp1 = playerSheet.crop(0, 1, 32, 32);
        playerUp2 = playerSheet.crop(0, 2, 32, 32);
        playerDn = playerSheet.crop(2, 0, 32, 32);
        playerDn1 = playerSheet.crop(2, 1, 32, 32);
        playerDn2 = playerSheet.crop(2, 2, 32, 32);
        playerLt = playerSheet.crop(3, 0, 32, 32);
        playerLt1 = playerSheet.crop(3, 1, 32, 32);
        playerLt2 = playerSheet.crop(3, 2, 32, 32);
        playerRt = playerSheet.crop(1, 0, 32, 32);
        playerRt1 = playerSheet.crop(1, 1, 32, 32);
        playerRt2 = playerSheet.crop(1, 2, 32, 32);
    }
}
