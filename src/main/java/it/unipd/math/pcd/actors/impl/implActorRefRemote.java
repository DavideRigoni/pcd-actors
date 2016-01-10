package it.unipd.math.pcd.actors.impl;

import it.unipd.math.pcd.actors.AbsActor;
import it.unipd.math.pcd.actors.Actor;
import it.unipd.math.pcd.actors.ActorRef;
import it.unipd.math.pcd.actors.Message;

/**
 * Created by davide on 10/01/16.
 */
public class implActorRefRemote implements ActorRef{

    @Override
    public void send(Message message, ActorRef to) {

    }

    @Override
    public int compareTo(Object o) {
        /**
         * Check if the object and this have the same references?
         */
        if(this.equals(o))
            return 0;
        else
            return 1;
    }
}
