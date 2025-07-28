package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gj3  reason: default package */
public final class gj3 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ hj3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gj3(hj3 hj3, Continuation continuation) {
        super(2, continuation);
        this.Y = hj3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gj3(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        hj3 hj3 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            if (!hj3.B.get()) {
                return jue;
            }
            this.X = 1;
            obj = ((sce) ((d8a) ((w86) hj3.A.getValue()).a.getValue()).a.getValue()).e(new bm9(dfa.PROFILE_DELETE_TIME, 7), this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Long l = ((e9c) obj).c;
        hj3.p(hj3, l != null ? l.longValue() : 0);
        return jue;
    }
}
