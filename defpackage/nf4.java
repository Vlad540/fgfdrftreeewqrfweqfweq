package defpackage;

import kotlin.coroutines.Continuation;
import one.me.devmenu.DevMenuScreen;

/* renamed from: nf4  reason: default package */
public final class nf4 implements pj5 {
    public final /* synthetic */ pj5 a;
    public final /* synthetic */ DevMenuScreen b;
    public final /* synthetic */ int c;

    public nf4(zqd zqd, DevMenuScreen devMenuScreen, int i) {
        this.a = zqd;
        this.b = devMenuScreen;
        this.c = i;
    }

    public final Object c(rj5 rj5, Continuation continuation) {
        Object c2 = this.a.c(new h42(rj5, this.b, this.c), continuation);
        return c2 == pu3.a ? c2 : jue.a;
    }
}
