package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gb9  reason: default package */
public final class gb9 extends l5e implements i26 {
    public final /* synthetic */ nb9 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gb9(nb9 nb9, Continuation continuation) {
        super(2, continuation);
        this.X = nb9;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gb9(this.X, continuation);
    }

    public final Object o(Object obj) {
        r38 r38;
        wx3.H(obj);
        nb9 nb9 = this.X;
        r38 r382 = nb9.m;
        if ((r382 == null || r382.getPlaybackState() != 3) && (r38 = nb9.m) != null) {
            r38.prepare();
        }
        r38 r383 = nb9.m;
        if (r383 != null) {
            r383.play();
        }
        return jue.a;
    }
}
