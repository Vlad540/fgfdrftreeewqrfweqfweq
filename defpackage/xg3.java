package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: xg3  reason: default package */
public final class xg3 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ bh3 Z;
    public final /* synthetic */ int w0;
    public final /* synthetic */ String x0;
    public final /* synthetic */ bg3 y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xg3(bh3 bh3, int i, String str, bg3 bg3, Continuation continuation) {
        super(2, continuation);
        this.Z = bh3;
        this.w0 = i;
        this.x0 = str;
        this.y0 = bg3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xg3 xg3 = new xg3(this.Z, this.w0, this.x0, this.y0, continuation);
        xg3.Y = obj;
        return xg3;
    }

    public final Object o(Object obj) {
        h6b h6b;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou3 = (ou3) this.Y;
            this.Z.x0 = this.w0;
            bh3 bh3 = this.Z;
            String str = this.x0;
            bg3 bg3 = this.y0;
            ((ap3) bh3.X.getValue()).a.d(bg3.a, str, str);
            bm9 bm9 = new bm9(2, bg3.a, (d10) null, (String) null, (String) null, (String) null, (String) null, (String) null);
            this.X = 1;
            obj = ((gy9) ((pk) bh3.Y.getValue())).K(bm9, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            try {
                wx3.H(obj);
            } catch (Throwable th) {
                h6b = new kcc(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        h6b = (h6b) obj;
        if (!(h6b instanceof kcc)) {
            taf.o(this.Z.A0, new qg3(new hge(cic.h2), false));
        } else {
            Throwable a = mcc.a(h6b);
            if (!(a instanceof CancellationException)) {
                udd.s(this.Z.o, "set_main: failed", a);
            }
        }
        taf.o(this.Z.A0, pg3.a);
        return jue.a;
    }
}
