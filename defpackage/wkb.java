package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* renamed from: wkb  reason: default package */
public final class wkb extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ykb Y;
    public final /* synthetic */ byte[] Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wkb(ykb ykb, byte[] bArr, Continuation continuation) {
        super(2, continuation);
        this.Y = ykb;
        this.Z = bArr;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wkb(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        Object obj2;
        pu3 pu3 = pu3.a;
        int i = this.X;
        ykb ykb = this.Y;
        if (i == 0) {
            wx3.H(obj);
            v2b v2b = ykb.b;
            this.X = 1;
            v2b.getClass();
            obj2 = xs7.U(sk9.a.plus((ju3) v2b.c), new jkc(v2b, this.Z, (Continuation) null), this);
            if (obj2 == pu3) {
                return pu3;
            }
        } else if (i == 1) {
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
        tk7 tk7 = new tk7(1, (long) uri.hashCode(), uri.toString(), uri.toString(), 0, 0, "image/jpeg", 0, (Uri) null);
        taf.o(ykb.A0, new mkb(tk7, ykb.o.f.r(tk7)));
        ykb.x0.m((Object) null, hkb.a);
        return jue;
    }
}
