package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: l8b  reason: default package */
public final class l8b extends l5e implements i26 {
    public int X;
    public final /* synthetic */ p8b Y;
    public final /* synthetic */ m5b Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l8b(p8b p8b, m5b m5b, Continuation continuation) {
        super(2, continuation);
        this.Y = p8b;
        this.Z = m5b;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new l8b(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.a;
            h8b h8b = new h8b(this.Z.c);
            this.X = 1;
            if (hcd.a(h8b, this) == pu3) {
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
