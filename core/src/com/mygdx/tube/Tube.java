package com.mygdx.tube;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import java.util.Random;

public class Tube extends TriForceMain {
    private static final int FLUCTUATION = 130;
    private static final int TUBE_GAP = 100;
    private static  final int LOWEST_OPENING= 120;
    private Texture  topTube,bottomTube;
    private Vector2 posTopTube, posBotTube;
    private Random rand;
    public Tube(float x){
        topTube = new Texture("toptube.png");
        bottomTube = new Texture("bottomtube.png");
        rand= new Random();
        posTopTube= new Vector2(x,rand.nextInt(FLUCTUATION)+TUBE_GAP + LOWEST_OPENING);
        posBotTube = new Vector2(x,posTopTube.y - TUBE_GAP- bottomTube.getHeight());




    }

    public static int getFLUCTUATION() {
        return FLUCTUATION;
    }

    public Texture getTopTube() {
        return topTube;
    }

    public Texture getBottomTube() {
        return bottomTube;
    }

    public Vector2 getPosTopTube() {
        return posTopTube;
    }

    public Vector2 getPosBotTube() {
        return posBotTube;
    }
}



