package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sg2  reason: default package */
public final class sg2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ah2 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sg2(ah2 ah2, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = ah2;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sg2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new sg2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        v2f v2f;
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            k77[] k77Arr = ah2.h1;
            ah2 ah2 = this.Y;
            k68 x = ah2.x();
            i68 i68 = x instanceof i68 ? (i68) x : null;
            if (i68 == null || (v2f = ((cg2) ah2.Z0.getValue()).b) == null) {
                return jue;
            }
            long c = v2f.c();
            boolean c0 = v2f.c0();
            this.X = 1;
            if (((okc) ah2.G0.getValue()).a(i68.a, i68.X, this.Z, c, c0, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
