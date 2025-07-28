package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: a4f  reason: default package */
public final class a4f extends l5e implements i26 {
    public int X;
    public final /* synthetic */ c4f Y;
    public final /* synthetic */ o10 Z;
    public final /* synthetic */ long w0;
    public final /* synthetic */ long x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a4f(c4f c4f, o10 o10, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.Y = c4f;
        this.Z = o10;
        this.w0 = j;
        this.x0 = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new a4f(this.Y, this.Z, this.w0, this.x0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (this.Y.b(this.Z, this.w0, this.x0, this) == pu3) {
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
