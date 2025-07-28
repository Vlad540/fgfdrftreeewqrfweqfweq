package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* renamed from: vb2  reason: default package */
public final class vb2 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ a10 Z;
    public final /* synthetic */ zb2 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vb2(a10 a10, zb2 zb2, Continuation continuation) {
        super(2, continuation);
        this.Z = a10;
        this.w0 = zb2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vb2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vb2 vb2 = new vb2(this.Z, this.w0, continuation);
        vb2.Y = obj;
        return vb2;
    }

    public final Object o(Object obj) {
        ou3 ou3;
        String str;
        pu3 pu3 = pu3.a;
        int i = this.X;
        zb2 zb2 = this.w0;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou32 = (ou3) this.Y;
            a10 a10 = this.Z;
            if (a10.X) {
                String str2 = a10.a;
                str = null;
                if (!r1g.p(str2) && !r1g.p(str2)) {
                    str = hr1.g(str2, "&fn=legacy_44");
                }
            } else {
                str = a10.a();
            }
            ikc ikc = zb2.o;
            this.Y = ou32;
            this.X = 1;
            Object c = ikc.c(ikc, str, a10.X, this);
            if (c == pu3) {
                return pu3;
            }
            ou3 ou33 = ou32;
            obj = c;
            ou3 = ou33;
        } else if (i == 1) {
            ou3 = (ou3) this.Y;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Uri uri = (Uri) obj;
        ob2 ob2 = (ob2) zb2.D0.getAndUpdate(new pb2(0));
        boolean A = n1g.A(ou3);
        jue jue = jue.a;
        if (!A) {
            return jue;
        }
        hcd hcd = zb2.y0;
        if (uri != null && ob2 != null) {
            hcd.g(new fk4(uri, ob2.d));
        } else if (uri == null && ob2 != null) {
            hcd.g(new ek4(zb2.u(ob2.d, false)));
        }
        return jue;
    }
}
