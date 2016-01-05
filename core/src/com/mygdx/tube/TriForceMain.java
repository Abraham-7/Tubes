package com.mygdx.tube;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Abraham on 2015-12-14.
 */
public class  TriForceMain extends Game{
    private Tube tube;

    @Override
    public void create() {
        tube = new Tube(100);

      //  System.out.println("Sup");

    }
    public void render(SpriteBatch sb){
        super.render();
        sb.draw(tube.getTopTube(),tube.getPosTopTube().x,tube.getPosTopTube().y);
        sb.draw(tube.getBottomTube(),tube.getPosBotTube().x, tube.getPosBotTube().y);
        sb.begin();
        sb.end();
        System.out.println("SUp");


    }
}
