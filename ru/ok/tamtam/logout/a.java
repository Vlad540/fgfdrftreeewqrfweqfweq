package ru.ok.tamtam.logout;

import kotlin.coroutines.Continuation;

public interface a {
    Object a(Continuation continuation) {
        return ez3.D(new ik5(new s0c(((LogoutEventsByBus) this).b), 2), continuation);
    }

    void b();

    t0c c(ac7 ac7) {
        return ez3.d0(new ik5(new s0c(((LogoutEventsByBus) this).b), 13), ac7, ucd.b, Boolean.FALSE);
    }
}
