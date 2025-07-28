package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: gj9  reason: default package */
public final class gj9 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NeuroAvatarsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gj9(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.Y = neuroAvatarsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gj9 gj9 = new gj9(continuation, this.Y);
        gj9.X = obj;
        return gj9;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        a34 a34 = (sg9) this.X;
        boolean z = a34 instanceof ri9;
        jue jue = jue.a;
        if (z) {
            ((uma) ko7.a.getAccessor().c(uma.class)).c();
            cp7 cp7 = cp7.c;
            cp7.getClass();
            cp7.P1().b(":chat-list", (Bundle) null);
        } else if (a34 instanceof a34) {
            cp7.c.R1(a34);
        } else if (a34 instanceof v03) {
            this.Y.getRouter().C();
        }
        return jue;
    }
}
