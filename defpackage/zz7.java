package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: zz7  reason: default package */
public final class zz7 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ i08 Y;
    public final /* synthetic */ Long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zz7(i08 i08, Long l, Continuation continuation) {
        super(2, continuation);
        this.Y = i08;
        this.Z = l;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zz7) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zz7(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        Object obj2;
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            long longValue = this.Z.longValue();
            this.X = 1;
            obj2 = ((b29) this.Y.c.getValue()).a(longValue, this);
            if (obj2 == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
            obj2 = obj;
        } else if (i == 2) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vo8 vo8 = (vo8) obj2;
        if (vo8 == null) {
            return jue;
        }
        i08 i08 = this.Y;
        k77[] k77Arr = i08.M0;
        pwc r = i08.r();
        r.getClass();
        if (vo8.m()) {
            int i2 = 0;
            while (true) {
                jj7 jj7 = vo8.D0;
                if (i2 >= jj7.v()) {
                    break;
                }
                mz e = mk9.e(jj7.u(i2), vo8.x0, vo8.c, (Uri) null, r.i.u());
                if (e != null) {
                    r.r(e);
                }
                i2++;
            }
        }
        ArrayList t = pfa.t(this.Y.r());
        this.Y.B0.m((Object) null, t);
        this.Y.y0 = t;
        us0 us0 = this.Y.x0;
        yy7 yy7 = yy7.a;
        this.X = 2;
        return us0.o(yy7, this) == pu3 ? pu3 : jue;
    }
}
