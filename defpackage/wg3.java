package defpackage;

import android.net.Uri;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: wg3  reason: default package */
public final class wg3 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ bh3 Z;
    public final /* synthetic */ String w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wg3(bh3 bh3, String str, Continuation continuation) {
        super(2, continuation);
        this.Z = bh3;
        this.w0 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wg3 wg3 = new wg3(this.Z, this.w0, continuation);
        wg3.Y = obj;
        return wg3;
    }

    public final Object o(Object obj) {
        kcc kcc;
        pu3 pu3 = pu3.a;
        int i = this.X;
        bh3 bh3 = this.Z;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou3 = (ou3) this.Y;
            taf.o(bh3.A0, tg3.a);
            String str = this.w0;
            ikc ikc = bh3.c;
            this.X = 1;
            obj = ikc.c(ikc, str, false, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            try {
                wx3.H(obj);
            } catch (Throwable th) {
                kcc = new kcc(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kcc = (Uri) obj;
        if (!(kcc instanceof kcc)) {
            taf.o(bh3.A0, new qg3(new hge(cic.s2), false));
        } else {
            Throwable a = mcc.a(kcc);
            if (!(a instanceof CancellationException)) {
                taf.o(bh3.A0, new qg3(new hge(cic.r2), true));
                udd.s(bh3.o, "save: failed", a);
            }
        }
        taf.o(bh3.A0, pg3.a);
        return jue.a;
    }
}
