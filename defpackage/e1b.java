package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: e1b  reason: default package */
public final class e1b extends l5e implements i26 {
    public int X;
    public final /* synthetic */ f1b Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ s16 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e1b(f1b f1b, String str, nya nya, Continuation continuation) {
        super(2, continuation);
        this.Y = f1b;
        this.Z = str;
        this.w0 = nya;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e1b) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new e1b(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            f1b f1b = this.Y;
            ((f03) f1b.b.getValue()).l("server.port", this.Z);
            if (((f03) f1b.b.getValue()).s() != -1) {
                ((dce) f1b.o.getValue()).i();
            }
            zr7 c = ((pae) f1b.c.getValue()).c();
            d1b d1b = new d1b(this.w0, (Continuation) null);
            this.X = 1;
            if (xs7.U(c, d1b, this) == pu3) {
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
