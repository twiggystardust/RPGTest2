package com.stardust.rpgtest2;

public class StateEngine 
{
    public State state;
    public MenuState menuState;
    
    public enum State
    {
        STATE_WORLD,
        STATE_TOWN,
        STATE_SHOP,
        STATE_DUNGEON,
        STATE_ITEMMENU
    };
    
    public enum MenuState
    {
        CLOSED,
        MAIN,
        ITEM,
        SKILL,
        EQUIP,
        STATUS
    };
    
    public StateEngine()
    {
        state = State.STATE_WORLD;
        menuState = menuState.CLOSED;
    }
}
