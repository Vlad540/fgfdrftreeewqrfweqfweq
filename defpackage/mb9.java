package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mb9  reason: default package */
public final class mb9 extends l5e implements i26 {
    public final /* synthetic */ nb9 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mb9(nb9 nb9, Continuation continuation) {
        super(2, continuation);
        this.X = nb9;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new mb9(this.X, continuation);
    }

    public final Object o(Object obj) {
        wxa d;
        wx3.H(obj);
        nb9 nb9 = this.X;
        grd grd = nb9.s;
        r38 r38 = nb9.m;
        long j = -1;
        grd.m((Object) null, new Long(r38 != null ? r38.k() : -1));
        r38 r382 = nb9.m;
        nb9.u.m((Object) null, new Long(r382 != null ? r382.e0() : -1));
        r38 r383 = nb9.m;
        boolean z = true;
        int playbackState = r383 != null ? r383.getPlaybackState() : 1;
        nb9.v = playbackState;
        nb9.y = playbackState == 2;
        nb9.A = playbackState == 4;
        r38 r384 = nb9.m;
        boolean z2 = r384 != null && r384.a();
        nb9.x = z2;
        if (z2 || nb9.v != 3) {
            z = false;
        }
        nb9.w = z;
        r38 r385 = nb9.m;
        if (r385 != null) {
            r385.n();
        }
        r38 r386 = nb9.m;
        nb9.B = r386 != null ? r386.R0() : null;
        r38 r387 = nb9.m;
        int i = -1;
        nb9.C = nb9.d(nb9, r387 != null ? r387.h() : -1);
        r38 r388 = nb9.m;
        if (r388 != null) {
            i = r388.i();
        }
        nb9.d(nb9, i);
        r38 r389 = nb9.m;
        if (r389 != null) {
            r389.E0();
        }
        r38 r3810 = nb9.m;
        if (r3810 != null) {
            r3810.getRepeatMode();
        }
        r38 r3811 = nb9.m;
        nb9.D = r3811 != null ? r3811.N0() : null;
        r38 r3812 = nb9.m;
        if (r3812 != null) {
            j = r3812.c();
        }
        nb9.E = j;
        r38 r3813 = nb9.m;
        nb9.F = (r3813 == null || (d = r3813.d()) == null) ? 1.0f : d.a;
        r38 r3814 = nb9.m;
        if (r3814 != null) {
            r3814.n1();
        }
        nb9.G.m((Object) null, new Float(gwf.i((float) (((Number) nb9.s.getValue()).doubleValue() / ((double) nb9.E)), 0.0f, 1.0f)));
        return jue.a;
    }
}
