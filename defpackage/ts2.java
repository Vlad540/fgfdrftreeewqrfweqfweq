package defpackage;

import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: ts2  reason: default package */
public final class ts2 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ bt2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ts2(bt2 bt2, Continuation continuation) {
        super(2, continuation);
        this.Z = bt2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ts2) n((dp6) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ts2 ts2 = new ts2(this.Z, continuation);
        ts2.Y = obj;
        return ts2;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            grd grd = this.Z.I0;
            js2 js2 = new js2(is2.c, BuildConfig.FLAVOR, (dp6) this.Y, hw4.a, false);
            this.X = 1;
            grd.m((Object) null, js2);
            if (jue == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
