package defpackage;

import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: rp2  reason: default package */
public final class rp2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rp2(long j, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rp2) n((i22) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        rp2 rp2 = new rp2(this.Y, continuation);
        rp2.X = obj;
        return rp2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        i22 i22 = (i22) this.X;
        long j = this.Y;
        long e = i22.e();
        String p = i22.p();
        String f = i22.f(fj0.a, ej0.a);
        if (f == null) {
            f = BuildConfig.FLAVOR;
        }
        i22.i0();
        return new kta(j, e, i22.B0, p, f);
    }
}
