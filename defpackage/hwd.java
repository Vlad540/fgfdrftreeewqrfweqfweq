package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: hwd  reason: default package */
public final class hwd extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ lwd Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hwd(lwd lwd, Continuation continuation) {
        super(2, continuation);
        this.Z = lwd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((wsc) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hwd hwd = new hwd(this.Z, continuation);
        hwd.Y = obj;
        return hwd;
    }

    public final Object o(Object obj) {
        wsc wsc;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            wsc wsc2 = (wsc) this.Y;
            String name = this.Z.getClass().getName();
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.X, name, us8.k("Sets loader. Section with sets exist:", wsc2 != null), (Throwable) null);
            }
            if ((wsc2 instanceof oud) && ((List) this.Z.d.getValue()).isEmpty()) {
                phd c = ((lud) this.Z.a.getValue()).c(((oud) wsc2).c);
                this.Y = wsc2;
                this.X = 1;
                Object d = e07.d(c, this);
                if (d == pu3) {
                    return pu3;
                }
                wsc = wsc2;
                obj = d;
            }
            return jue.a;
        } else if (i == 1) {
            wsc = (wsc) this.Y;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.Z.f.updateAndGet(new zx0(11, wsc));
        this.Z.d.m((Object) null, (List) obj);
        return jue.a;
    }
}
