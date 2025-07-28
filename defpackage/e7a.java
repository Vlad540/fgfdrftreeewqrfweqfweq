package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: e7a  reason: default package */
public final class e7a extends l5e implements i26 {
    public int X;
    public final /* synthetic */ h7a Y;
    public final /* synthetic */ i22 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e7a(h7a h7a, i22 i22, Continuation continuation) {
        super(2, continuation);
        this.Y = h7a;
        this.Z = i22;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e7a) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new e7a(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            zm9 a = this.Y.a();
            this.X = 1;
            obj = a.b(this.Z, this);
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
