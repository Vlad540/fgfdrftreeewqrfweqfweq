package defpackage;

import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: im1  reason: default package */
public final class im1 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ km1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public im1(km1 km1, Continuation continuation) {
        super(2, continuation);
        this.Y = km1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((im1) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new im1(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            obj = ((ap3) this.Y.b.getValue()).d(this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        tf3 tf3 = (tf3) obj;
        long n = tf3.n();
        String d = tf3.d();
        if (d == null) {
            d = BuildConfig.FLAVOR;
        }
        return new cze(n, d, tf3.m(), tf3.w(), tf3.p(fj0.o));
    }
}
