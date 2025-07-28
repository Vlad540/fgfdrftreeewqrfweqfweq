package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mh3  reason: default package */
public final class mh3 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ yh3 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mh3(yh3 yh3, Continuation continuation) {
        super(2, continuation);
        this.Z = yh3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((j8b) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        mh3 mh3 = new mh3(this.Z, continuation);
        mh3.Y = obj;
        return mh3;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            j8b j8b = (j8b) this.Y;
            if (j8b instanceof g8b) {
                Long l = ((g8b) j8b).a;
                yh3 yh3 = this.Z;
                long j = yh3.p.get();
                if (l == null || l.longValue() != j) {
                    return jue;
                }
                hcd hcd = yh3.e;
                v03 v03 = v03.b;
                this.X = 1;
                if (hcd.a(v03, this) == pu3) {
                    return pu3;
                }
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
