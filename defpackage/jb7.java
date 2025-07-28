package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jb7  reason: default package */
public final class jb7 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ga0 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jb7(ga0 ga0, Continuation continuation) {
        super(2, continuation);
        this.Y = ga0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jb7) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jb7(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        ga0 ga0 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            zec zec = (zec) ((t97) ga0.e).getValue();
            this.X = 1;
            Object U = xs7.U(zec.a.b(), new tec(zec, (Continuation) null), this);
            if (U != pu3) {
                U = jue;
            }
            if (U == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            try {
                wx3.H(obj);
            } catch (Throwable th) {
                udd.s("LibraryUpgradeHelper", "fail to migrate 4", th);
                ((pv3) ((t97) ga0.f).getValue()).a("ONEME-14182", new IllegalStateException("fail to clear stats", th));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
