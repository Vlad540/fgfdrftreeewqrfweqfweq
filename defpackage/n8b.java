package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: n8b  reason: default package */
public final class n8b extends l5e implements i26 {
    public int X;
    public final /* synthetic */ p8b Y;
    public final /* synthetic */ iab Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n8b(p8b p8b, iab iab, Continuation continuation) {
        super(2, continuation);
        this.Y = p8b;
        this.Z = iab;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new n8b(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            p8b p8b = this.Y;
            hcd hcd = p8b.a;
            i8b i8b = new i8b((Long) null, p8b.a(p8b, this.Z.b));
            this.X = 1;
            if (hcd.a(i8b, this) == pu3) {
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
