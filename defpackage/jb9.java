package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jb9  reason: default package */
public final class jb9 extends l5e implements i26 {
    public final /* synthetic */ long X;
    public final /* synthetic */ nb9 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jb9(long j, nb9 nb9, Continuation continuation) {
        super(2, continuation);
        this.X = j;
        this.Y = nb9;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jb9(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        int i = nb9.K;
        long j = this.X;
        udd.p("nb9", "seekToPosition, posMs %d", new Object[]{new Long(j)});
        nb9 nb9 = this.Y;
        nb9.f();
        r38 r38 = nb9.m;
        if (r38 != null) {
            r38.seekTo(j);
        }
        nb9.s.m((Object) null, new Long(j));
        nb9.G.m((Object) null, new Float(gwf.i((float) (((double) j) / ((double) nb9.E)), 0.0f, 1.0f)));
        return jue.a;
    }
}
