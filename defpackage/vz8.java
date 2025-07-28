package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vz8  reason: default package */
public final class vz8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ z63 Y;
    public final /* synthetic */ zz8 Z;
    public final /* synthetic */ long w0;
    public final /* synthetic */ long x0;
    public final /* synthetic */ long y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vz8(a73 a73, zz8 zz8, long j, long j2, long j3, Continuation continuation) {
        super(2, continuation);
        this.Y = a73;
        this.Z = zz8;
        this.w0 = j;
        this.x0 = j2;
        this.y0 = j3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vz8(this.Y, this.Z, this.w0, this.x0, this.y0, continuation);
    }

    public final Object o(Object obj) {
        jue jue = pu3.a;
        int i = this.X;
        jue jue2 = jue.a;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            obj = this.Y.awaitInternal(this);
            if (obj == jue) {
                return jue;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2 || i == 3) {
            wx3.H(obj);
            return jue2;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zz8 zz8 = this.Z;
        if (booleanValue) {
            bv2 bv2 = zz8.w0;
            this.X = 2;
            t52 l = ((aw2) bv2).l();
            z52 z52 = z52.o;
            long j = this.w0;
            l.c(j, z52);
            l.h(j, false, new f00(this.x0, 1));
            if (jue2 == jue) {
                return jue;
            }
        } else {
            this.X = 3;
            ((kp2) zz8.T0.getValue()).a(this.w0, this.y0, this);
            if (jue2 == jue) {
                return jue;
            }
        }
        return jue2;
    }
}
