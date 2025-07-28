package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import kotlin.coroutines.Continuation;
import one.me.android.media.service.OneMeMediaSessionService;

/* renamed from: bb9  reason: default package */
public final class bb9 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ nb9 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bb9(nb9 nb9, Continuation continuation) {
        super(2, continuation);
        this.Y = nb9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bb9(this.Y, continuation);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [p38, java.lang.Object] */
    public final Object o(Object obj) {
        Object obj2 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            long j = nb9.I;
            this.X = 1;
            if (ek8.r(j, this) == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i2 = nb9.K;
        nb9 nb9 = this.Y;
        r38 r38 = nb9.m;
        if (r38 == null || !r38.c.isConnected()) {
            udd.q("nb9", "connect");
            nb9.k(true);
            Context context = nb9.a;
            m3d m3d = new m3d(context, new ComponentName(context, OneMeMediaSessionService.class));
            Bundle bundle = Bundle.EMPTY;
            Looper w = oze.w();
            ? obj3 = new Object();
            z38 z38 = new z38(w);
            oze.W(new Handler(w), new n38(z38, new r38(context, m3d, bundle, obj3, w, z38, m3d.a.e() ? new mn(4, new sz3(context)) : null), 0));
            z38.c(new px4(nb9, z38, (Object) null, 20), kq3.a(context));
        } else {
            udd.q("nb9", "connect request rejected, already connected");
            nb9.i(nb9);
            nb9.u();
        }
        return jue.a;
    }
}
