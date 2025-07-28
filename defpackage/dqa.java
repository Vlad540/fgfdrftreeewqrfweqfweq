package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dqa  reason: default package */
public final class dqa extends l5e implements i26 {
    public int X;
    public final /* synthetic */ gqa Y;
    public final /* synthetic */ i22 Z;
    public final /* synthetic */ long[] w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dqa(gqa gqa, i22 i22, long[] jArr, Continuation continuation) {
        super(2, continuation);
        this.Y = gqa;
        this.Z = i22;
        this.w0 = jArr;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dqa(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            k77[] k77Arr = gqa.l;
            gqa gqa = this.Y;
            if (!((ed3) gqa.f.getValue()).f()) {
                hcd hcd = gqa.g;
                aqa aqa = aqa.a;
                this.X = 1;
                if (hcd.a(aqa, this) == pu3) {
                    return pu3;
                }
            } else {
                gqa.i.set(((gy9) ((pk) gqa.b.getValue())).d(gqa.a, this.Z.b.a, cs.f0(this.w0), true));
                return jue;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
