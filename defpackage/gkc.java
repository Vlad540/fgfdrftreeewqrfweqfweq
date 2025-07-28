package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gkc  reason: default package */
public final class gkc extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ikc Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ boolean w0;
    public final /* synthetic */ boolean x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gkc(ikc ikc, String str, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.Y = ikc;
        this.Z = str;
        this.w0 = z;
        this.x0 = z2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gkc(this.Y, this.Z, this.w0, this.x0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            obj = ikc.a(this.Y, this.Z, this.w0, this.x0, this);
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
