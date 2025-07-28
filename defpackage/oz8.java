package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: oz8  reason: default package */
public final class oz8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zz8 Y;
    public final /* synthetic */ u1f Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oz8(zz8 zz8, u1f u1f, Continuation continuation) {
        super(2, continuation);
        this.Y = zz8;
        this.Z = u1f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new oz8(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            u1f u1f = this.Z;
            long j = u1f.a;
            String str = u1f.b;
            long j2 = u1f.d;
            long j3 = u1f.e;
            boolean z = u1f.f;
            this.X = 1;
            if (((okc) this.Y.f1.getValue()).a(j, str, j2, j3, z, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
