package it.unipd.math.pcd.actors.impl;

import it.unipd.math.pcd.actors.AbsActorSystem;
import it.unipd.math.pcd.actors.ActorRef;

/**
 * Defines common properties of all actors.
 *
 * @author Davide Rigoni
 * @version 1.0
 * @since 1.0
 */
public class implActorSystem extends AbsActorSystem{

    @Override
    protected ActorRef createActorReference(ActorMode mode) throws  IllegalArgumentException{
        if(mode==ActorMode.LOCAL)
            return new implActorRefLocal();
        else
            throw new IllegalArgumentException();
    }
}
