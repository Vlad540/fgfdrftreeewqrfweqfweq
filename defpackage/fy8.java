package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* renamed from: fy8  reason: default package */
public final class fy8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zz8 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ String w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fy8(zz8 zz8, long j, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = zz8;
        this.Z = j;
        this.w0 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fy8(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        zz8 zz8 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            bv2 bv2 = zz8.w0;
            this.X = 1;
            obj = ((aw2) bv2).k(this.Z, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i22 i22 = (i22) obj;
        if (i22 == null || !i22.G() || (i22.W() && !i22.b0())) {
            String str = this.w0;
            if (i22 == null && str == null) {
                taf.o(zz8.y1, new ked(new hge(c7a.P0), 0, (hge) null, 6));
            } else if (str != null) {
                ef7 ef7 = (ef7) zz8.a1.getValue();
                ef7.getClass();
                ef7.e(Uri.parse(str));
            } else {
                taf.o(zz8.y1, new ked(new hge(c7a.Q0), 0, (hge) null, 6));
            }
        } else {
            taf.o(zz8.B1, bx8.c.a2(i22.a));
        }
        return jue.a;
    }
}
