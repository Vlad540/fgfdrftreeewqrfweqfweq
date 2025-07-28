package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: a59  reason: default package */
public final class a59 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ m18 Y;
    public final /* synthetic */ byte[] Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a59(m18 m18, byte[] bArr, Continuation continuation) {
        super(2, continuation);
        this.Y = m18;
        this.Z = bArr;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a59) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new a59(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            obj = this.Y.e(this.Z);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
