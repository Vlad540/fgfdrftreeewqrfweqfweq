package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ui3  reason: default package */
public final class ui3 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ hj3 Y;
    public final /* synthetic */ boolean Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ui3(hj3 hj3, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = hj3;
        this.Z = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ui3(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        hj3 hj3 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            ijb ijb = hj3.y;
            this.X = 1;
            bm9 bm9 = new bm9(dfa.PROFILE_DELETE, 6);
            bm9.d("delete", this.Z);
            obj = ((sce) ((d8a) ijb.a.getValue()).a.getValue()).e(bm9, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Long l = ((d9c) obj).c;
        hj3.p(hj3, l != null ? l.longValue() : 0);
        return jue.a;
    }
}
