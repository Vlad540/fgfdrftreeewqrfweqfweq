package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qx2  reason: default package */
public final class qx2 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ Throwable Y;
    public final /* synthetic */ km4 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qx2(km4 km4, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = km4;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rj5 rj5 = (rj5) obj;
        Throwable th = (Throwable) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                qx2 qx2 = new qx2(this.Z, continuation, 0);
                qx2.Y = th;
                qx2.o(jue.a);
                throw null;
            default:
                qx2 qx22 = new qx2(this.Z, continuation, 1);
                qx22.Y = th;
                jue jue = jue.a;
                qx22.o(jue);
                return jue;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                wx3.H(obj);
                Throwable th = this.Y;
                udd.s((String) this.Z.a, "big_flow: fail", th);
                throw th;
            default:
                wx3.H(obj);
                Throwable th2 = this.Y;
                km4 km4 = this.Z;
                if (th2 != null) {
                    udd.s((String) km4.a, "big_flow: completion", th2);
                } else {
                    udd.q((String) km4.a, "big_flow: completion");
                }
                return jue.a;
        }
    }
}
