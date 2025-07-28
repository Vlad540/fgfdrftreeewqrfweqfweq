package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: xkb  reason: default package */
public final class xkb extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ykb Z;
    public final /* synthetic */ File w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xkb(ykb ykb, File file, Continuation continuation) {
        super(2, continuation);
        this.Z = ykb;
        this.w0 = file;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xkb xkb = new xkb(this.Z, this.w0, continuation);
        xkb.Y = obj;
        return xkb;
    }

    public final Object o(Object obj) {
        Object obj2;
        e7f e7f;
        pu3 pu3 = pu3.a;
        int i = this.X;
        e7f e7f2 = null;
        ykb ykb = this.Z;
        if (i == 0) {
            wx3.H(obj);
            lkc lkc = ykb.c;
            this.Y = (ou3) this.Y;
            this.X = 1;
            lkc.getClass();
            obj2 = xs7.U(sk9.a.plus(lkc.b), new kkc(this.w0, lkc, (Continuation) null), this);
            if (obj2 == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            ou3 ou3 = (ou3) this.Y;
            wx3.H(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Uri uri = (Uri) obj2;
        jue jue = jue.a;
        if (uri == null) {
            return jue;
        }
        try {
            e7f = ((xh0) ykb.Z).d(uri.toString());
        } catch (Throwable th) {
            e7f = new kcc(th);
        }
        if (!(e7f instanceof kcc)) {
            e7f2 = e7f;
        }
        e7f e7f3 = e7f2;
        tk7 tk7 = new tk7(3, (long) uri.toString().hashCode(), uri.toString(), e7f3 != null ? e7f3.a : uri.toString(), 0, 0, "video/mp4", 0, (Uri) null);
        taf.o(ykb.A0, new mkb(tk7, ykb.o.f.r(tk7)));
        return jue;
    }
}
