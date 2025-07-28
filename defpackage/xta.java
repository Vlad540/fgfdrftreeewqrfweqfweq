package defpackage;

import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: xta  reason: default package */
public final class xta extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xta(long j, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xta) n((tf3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xta xta = new xta(this.Y, continuation);
        xta.X = obj;
        return xta;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        tf3 tf3 = (tf3) this.X;
        long n = tf3.n();
        String d = tf3.d();
        String str = d == null ? BuildConfig.FLAVOR : d;
        String p = tf3.p(fj0.a);
        return new kta(this.Y, n, tf3.m(), str, p == null ? BuildConfig.FLAVOR : p);
    }
}
