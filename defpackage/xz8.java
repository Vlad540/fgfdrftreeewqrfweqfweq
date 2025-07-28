package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xz8  reason: default package */
public final class xz8 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ zz8 Z;
    public final /* synthetic */ long w0;
    public final /* synthetic */ long x0;
    public final /* synthetic */ long y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xz8(zz8 zz8, long j, long j2, long j3, Continuation continuation) {
        super(2, continuation);
        this.Z = zz8;
        this.w0 = j;
        this.x0 = j2;
        this.y0 = j3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xz8 xz8 = new xz8(this.Z, this.w0, this.x0, this.y0, continuation);
        xz8.Y = obj;
        return xz8;
    }

    public final Object o(Object obj) {
        ou3 ou3;
        jue jue = pu3.a;
        int i = this.X;
        jue jue2 = jue.a;
        zz8 zz8 = this.Z;
        if (i == 0) {
            wx3.H(obj);
            ou3 = (ou3) this.Y;
            bv2 bv2 = zz8.w0;
            this.Y = ou3;
            this.X = 1;
            t52 l = ((aw2) bv2).l();
            Long l2 = new Long(this.w0);
            l.getClass();
            l.c(l2.longValue(), z52.o);
            l.h(l2.longValue(), false, new ak0(18));
            if (jue2 == jue) {
                return jue;
            }
        } else if (i == 1) {
            ou3 = (ou3) this.Y;
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
            return jue2;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a73 a = z3d.a();
        hu3 plus = zz8.Y.b().plus(sk9.a);
        ru3 ru3 = ru3.c;
        a73 a73 = a;
        jue jue3 = jue2;
        vz8 vz8 = r7;
        jue jue4 = jue;
        vz8 vz82 = new vz8(a73, this.Z, this.w0, this.x0, this.y0, (Continuation) null);
        xs7.c(ou3, plus, ru3, vz8);
        zr7 c = zz8.Y.c();
        wz8 wz8 = new wz8(zz8, a73, (Continuation) null);
        this.Y = null;
        this.X = 2;
        Object U = xs7.U(c, wz8, this);
        jue jue5 = jue4;
        return U == jue5 ? jue5 : jue3;
    }
}
