package com.stardust.rpgtest2.gfx.tilemaps;

import com.stardust.rpgtest2.gfx.Assets;
import java.awt.image.BufferedImage;

public enum Tile
{
    Grass(0, Assets.grass, false),
    Dirt(1, Assets.dirt, false),
    Water(2, Assets.water, true),
    Tree(3, Assets.tree, true),
    MultiTree(4, Assets.multiTree, false),
    NSPath(5, Assets.NSpath, false),
    UpRtPath(6, Assets.uprtPath, false),
    EWPath(7, Assets.EWpath, false),
    UpLtPath(8, Assets.upltPath, false),
    DnLtPath(9, Assets.dnltPath, false),
    DnRtPath(10, Assets.dnrtPath, false),
    WatGrsDn(11, Assets.watgrsdn, true),
    WatGrsLt(12, Assets.watgrslt, true),
    WatGrsUp(13, Assets.watgrsup, true),
    WatGrsRt(14, Assets.watgrsrt, true),
    WatGrsSE(15, Assets.watgrsSE, true),
    WatGrsSW(16, Assets.watgrsSW, true),
    WatGrsNW(17, Assets.watgrsNW, true),
    WatGrsNE(18, Assets.watgrsNE, true),
    //WallWood(19, Assets.wallWood, true),
    Pointer(20, Assets.pointer, false),
    PathOpRt(21, Assets.pathOpRt, false),
    PathOpLt(22, Assets.pathOpLt, false),
    PathOpDn(23, Assets.pathOpDn, false),
    PathOpUp(24, Assets.pathOpUp, false),
    PathOpAll(25, Assets.pathOpAll, false),
    //RoughWood(26, Assets.roughWood, false),
    PathOpen(27, Assets.pathOpen, false),
    SingleHouse(31, Assets.singleHouse, false),
    DoubleHouse(32, Assets.doubleHouse, false),
    WepBanner(33, Assets.wepBanner, false),
    ArmBanner(34, Assets.armBanner, false),
    InnBanner(35, Assets.innBanner, false),
    Blank(36, Assets.blankTile, false);
    
    public int texKey;
    public BufferedImage texture;
    public boolean collidable;
    Tile(int texKey, BufferedImage texture, boolean collidable)
    {
       this.texKey = texKey;
       this.texture = texture;
       this.collidable = collidable;
    }
    public static BufferedImage getTileImage(int texKey1)
    {
        BufferedImage image;
        switch(texKey1)
        {
            case 0:
            {
                image = Grass.texture;
                break;
            }
            case 1:
            {
                image = Dirt.texture;
                break;
            }
            case 2:
            {
                image = Water.texture;
                break;
            }
            case 3:
            {
                image = Tree.texture;
                break;
            }
            case 4:
            {
                image = MultiTree.texture;
                break;
            }
            case 5:
            {
                image = NSPath.texture;
                break;
            }
            case 6:
            {
                image = UpRtPath.texture;
                break;
            }
            case 7:
            {
                image = EWPath.texture;
                break;
            }
            case 8:
            {
                image = UpLtPath.texture;
                break;
            }
            case 9:
            {
                image = DnLtPath.texture;
                break;
            }
            case 10:
            {
                image = DnRtPath.texture;
                break;
            }
            case 11:
            {
                image = WatGrsDn.texture;
                break;
            }
            case 12:
            {
                image = WatGrsLt.texture;
                break;
            }
            case 13:
            {
                image = WatGrsUp.texture;
                break;
            }
            case 14:
            {
                image = WatGrsRt.texture;
                break;
            }
            case 15:
            {
                image = WatGrsSE.texture;
                break;
            }
            case 16:
            {
                image = WatGrsSW.texture;
                break;
            }
            case 17:
            {
                image = WatGrsNW.texture;
                break;
            }
            case 18:
            {
                image = WatGrsNE.texture;
                break;
            }
//            case 19:
//            {
//                image = WallWood.texture;
//                break;
//            }
            case 20:
            {
                image = Pointer.texture;
                break;
            }
            case 21:
            {
                image = PathOpRt.texture;
                break;
            }
            case 22:
            {
                image = PathOpLt.texture;
                break;
            }
            case 23:
            {
                image = PathOpDn.texture;
                break;
            }
            case 24:
            {
                image = PathOpUp.texture;
                break;
            }
            case 25:
            {
                image = PathOpAll.texture;
                break;
            }
//            case 26:
//            {
//                image = RoughWood.texture;
//                break;
//            }
            case 27:
            {
                image = PathOpen.texture;
                break;
            }
            case 31:
            {
                image = SingleHouse.texture;
                break;
            }
            case 32:
            {
                image = DoubleHouse.texture;
                break;
            }
            case 33:
            {
                image = WepBanner.texture;
                break;
            }
            case 34:
            {
                image = ArmBanner.texture;
                break;
            }
            case 35:
            {
                image = InnBanner.texture;
                break;
            }
            case 36:
            {
                image = Blank.texture;
                break;
            }
            default:
            {
                image = Blank.texture;
                break;
            }
        }
        return image;
    }
}