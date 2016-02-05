package it.unipd.math.pcd.actors.impl;

import it.unipd.math.pcd.actors.AbsActor;
import it.unipd.math.pcd.actors.Actor;
import it.unipd.math.pcd.actors.ActorRef;
import it.unipd.math.pcd.actors.Message;
import it.unipd.math.pcd.actors.exceptions.NoSuchActorException;

/**
 * Defines common properties of all actors.
 *
 * @author Davide Rigoni
 * @version 1.0
 * @since 1.0
 */
public class implActorRefLocal implements ActorRef{
    @Override
    public void send(Message message, ActorRef to) {
        implActorSystem as = new implActorSystem();
        //check if this ActorRef is stopped
        //if stopped this will throw NoSuchActorException
        as.getUnderlyingActor(this);

        Actor a = as.getUnderlyingActor(to);
        ((AbsActor)a).addMessage(message,this);
    }

    @Override
    public int compareTo(Object o) {
        if(this.equals(o))
            return 0;
        else
            return 1;
    }
}
