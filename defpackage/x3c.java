package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: x3c  reason: default package */
public final class x3c extends l5e implements i26 {
    public int X;
    public final /* synthetic */ y3c Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ byte[] w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x3c(y3c y3c, long j, byte[] bArr, Continuation continuation) {
        super(2, continuation);
        this.Y = y3c;
        this.Z = j;
        this.w0 = bArr;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new x3c(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            y3c y3c = this.Y;
            z2c z2c = y3c.b;
            this.X = 1;
            if (y3c.r(y3c, z2c, this.Z, this.w0, this) == pu3) {
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
