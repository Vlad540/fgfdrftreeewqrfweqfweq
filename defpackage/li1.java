package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: li1  reason: default package */
public final class li1 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ aj1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public li1(aj1 aj1, Continuation continuation) {
        super(2, continuation);
        this.Y = aj1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((li1) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new li1(this.Y, continuation);
    }

    public final Object o(Object obj) {
        Object obj2 = pu3.a;
        int i = this.X;
        Object obj3 = jue.a;
        if (i == 0) {
            wx3.H(obj);
            aj1 aj1 = this.Y;
            grd b = aj1.c.b();
            po1 po1 = aj1.c;
            zqd e = po1.e();
            grd grd = ((x11) po1.f).k;
            grd f = po1.f();
            grd grd2 = ((py0) po1.l).F0;
            ki1 ki1 = new ki1(aj1, (Continuation) null);
            this.X = 1;
            Object g = d8.g(bl9.a, yr3.Z, new zl5((Continuation) null, (Object) ki1, 3), this, new pj5[]{b, e, grd, f, grd2});
            if (g != obj2) {
                g = obj3;
            }
            if (g != obj2) {
                g = obj3;
            }
            if (g == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj3;
    }
}
