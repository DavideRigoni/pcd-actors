package it.unipd.math.pcd.actors.impl;

import it.unipd.math.pcd.actors.AbsActorSystem;
import it.unipd.math.pcd.actors.ActorRef;
import it.unipd.math.pcd.actors.ActorSystem;
import it.unipd.math.pcd.actors.exceptions.NoSuchActorException;

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
            if (mode==ActorMode.REMOTE)
                return new implActorRefRemote();
            else
                throw new NoSuchActorException();
    }
}
