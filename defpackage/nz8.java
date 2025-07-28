package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: nz8  reason: default package */
public final class nz8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zz8 Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ o10 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nz8(zz8 zz8, String str, o10 o10, Continuation continuation) {
        super(2, continuation);
        this.Y = zz8;
        this.Z = str;
        this.w0 = o10;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new nz8(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            ikc ikc = this.Y.A0;
            boolean z = this.w0.b.X;
            this.X = 1;
            obj = ikc.b(this.Z, z, this);
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
