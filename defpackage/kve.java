package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: kve  reason: default package */
public final class kve extends l5e implements i26 {
    public int X;
    public final /* synthetic */ lve Y;
    public final /* synthetic */ int Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kve(lve lve, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = lve;
        this.Z = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new kve(this.Y, this.Z, continuation);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [eze, java.lang.Object] */
    public final Object o(Object obj) {
        Object obj2 = pu3.a;
        int i = this.X;
        lve lve = this.Y;
        if (i == 0) {
            wx3.H(obj);
            ? obj3 = new Object();
            obj3.v = this.Z;
            pn2 pn2 = new pn2((String) null, 0, new ra3(new gze(obj3)), false);
            this.X = 1;
            obj = ((gy9) ((pk) lve.a.getValue())).K(pn2, this);
            if (obj == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gze gze = ((la3) obj).o;
        if (gze != null) {
            ((kp) ((ip) lve.b.getValue())).w(gze);
            return jue.a;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
