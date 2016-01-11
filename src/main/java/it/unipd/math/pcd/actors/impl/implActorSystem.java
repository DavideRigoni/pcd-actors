package it.unipd.math.pcd.actors.impl;

import it.unipd.math.pcd.actors.AbsActorSystem;
import it.unipd.math.pcd.actors.ActorRef;

/**
 * Created by davide on 10/01/16.
 */
public class implActorSystem extends AbsActorSystem{

    public implActorSystem(){

    }


    @Override
    protected ActorRef createActorReference(ActorMode mode) {
        if(mode==ActorMode.LOCAL)
            return new implActorRefLocal();
        else
            throw new IllegalArgumentException();
    }
}
