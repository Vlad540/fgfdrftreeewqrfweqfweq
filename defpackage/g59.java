package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: g59  reason: default package */
public final class g59 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ wia Y;
    public final /* synthetic */ r59 Z;
    public final /* synthetic */ long[] w0;
    public final /* synthetic */ zb9 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g59(wia wia, r59 r59, long[] jArr, zb9 zb9, Continuation continuation) {
        super(2, continuation);
        this.Y = wia;
        this.Z = r59;
        this.w0 = jArr;
        this.x0 = zb9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        g59 g59 = new g59(this.Y, this.Z, this.w0, this.x0, continuation);
        g59.X = obj;
        return g59;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ou3 ou3 = (ou3) this.X;
        jue jue = jue.a;
        zb9 zb9 = this.x0;
        wia wia = this.Y;
        int i = 0;
        long[] jArr = this.w0;
        r59 r59 = this.Z;
        if (wia != null) {
            boolean i2 = r59.i();
            bs bsVar = r59.x0;
            if (i2 && n1g.A(ou3)) {
                wj3 wj3 = (wj3) wia.a;
                tm3 tm3 = (tm3) wia.b;
                try {
                    zj3 zj3 = (zj3) r59.c.getValue();
                    if (wj3 != null) {
                        zj3.a(wj3, jArr, 0);
                        if (tm3 != null) {
                            ((q2b) r59.o.getValue()).h(0, fu7.n(tm3.c));
                        }
                        bsVar.removeAll(cs.h0(jArr));
                        return jue;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                } catch (Throwable th) {
                    bsVar.removeAll(cs.h0(jArr));
                    throw th;
                }
            }
        }
        r59.x0.removeAll(cs.h0(jArr));
        int i3 = zb9.d;
        int length = jArr.length;
        while (i < length) {
            long j = jArr[i];
            zb9.b[zb9.e(j)] = j;
            i++;
        }
        return jue;
    }
}
