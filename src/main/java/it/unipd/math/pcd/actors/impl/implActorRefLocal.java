package it.unipd.math.pcd.actors.impl;

import it.unipd.math.pcd.actors.Actor;
import it.unipd.math.pcd.actors.ActorRef;
import it.unipd.math.pcd.actors.ActorSystem;
import it.unipd.math.pcd.actors.Message;

/**
 * Created by davide on 10/01/16.
 */
public class implActorRefLocal implements ActorRef{

    @Override
    public void send(Message message, ActorRef to) {

    }

    @Override
    public int compareTo(Object o) {
        if(this.equals(o))
            return 0;
        else
            return 1;
    }

    private class MessagesManager extends Thread{
        Message m;
        ActorRef to;
        ActorRef who;

        public MessagesManager(ActorRef _who, Message message, ActorRef _to){
            m = message;
            to = _to;
            who = _who;
        }

        @Override
        public void run() {
            implActorSystem as = new implActorSystem();
            Actor a = as.getUnderlyingActor(to);
            a.addMessage(m,who);
        }
    }
}
