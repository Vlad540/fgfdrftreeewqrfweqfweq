package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: jwd  reason: default package */
public final class jwd extends l5e implements i26 {
    public gvd X;
    public int Y;
    public final /* synthetic */ lwd Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jwd(lwd lwd, Continuation continuation) {
        super(2, continuation);
        this.Z = lwd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jwd(this.Z, continuation);
    }

    public final Object o(Object obj) {
        gvd gvd;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        lwd lwd = this.Z;
        if (i == 0) {
            wx3.H(obj);
            long longValue = ((Long) lwd.f.get()).longValue();
            this.Y = 1;
            obj = kvd.d((kvd) lwd.b.getValue(), (String) null, longValue, this, 5);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            gvd = this.X;
            wx3.H(obj);
            lwd.f.updateAndGet(new iwd(gvd, 0));
            grd grd = lwd.d;
            grd.m((Object) null, o23.i0((Collection) grd.getValue(), (List) obj));
            return jue.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gvd gvd2 = (gvd) obj;
        phd c = ((lud) lwd.a.getValue()).c(gvd2.a);
        this.X = gvd2;
        this.Y = 2;
        Object d = e07.d(c, this);
        if (d == pu3) {
            return pu3;
        }
        gvd gvd3 = gvd2;
        obj = d;
        gvd = gvd3;
        lwd.f.updateAndGet(new iwd(gvd, 0));
        grd grd2 = lwd.d;
        grd2.m((Object) null, o23.i0((Collection) grd2.getValue(), (List) obj));
        return jue.a;
    }
}
