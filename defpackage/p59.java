package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: p59  reason: default package */
public final class p59 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ r59 Y;
    public final /* synthetic */ long[] Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p59(r59 r59, Continuation continuation, long[] jArr) {
        super(2, continuation);
        this.Y = r59;
        this.Z = jArr;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new p59(this.Y, continuation, this.Z);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            pn2 pn2 = new pn2(this.Z);
            this.X = 1;
            obj = ((gy9) ((pk) this.Y.b.getValue())).K(pn2, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            try {
                wx3.H(obj);
            } catch (Throwable th) {
                udd.s("MissedContactsController", "fail to fetch contact info ".concat(cs.c0(this.Z)), th);
                return null;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long[] jArr = this.Z;
        wj3 wj3 = (wj3) obj;
        fn6 fn6 = udd.e;
        if (fn6 != null) {
            if (fn6.c()) {
                tn7 tn7 = tn7.X;
                String c0 = cs.c0(jArr);
                fn6.d(tn7, "MissedContactsController", "success CONTACT_INFO request: " + wj3 + "; " + c0 + "}", (Throwable) null);
            }
        }
        return (wj3) obj;
    }
}
