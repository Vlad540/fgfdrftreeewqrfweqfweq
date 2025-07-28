package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yfb  reason: default package */
public final class yfb extends l5e implements i26 {
    public int X;
    public final /* synthetic */ l7c Y;
    public final /* synthetic */ k7c Z;
    public final /* synthetic */ fgb w0;
    public final /* synthetic */ boolean x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yfb(l7c l7c, k7c k7c, fgb fgb, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = l7c;
        this.Z = k7c;
        this.w0 = fgb;
        this.x0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yfb(this.Y, this.Z, this.w0, this.x0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        String str = null;
        k7c k7c = this.Z;
        fgb fgb = this.w0;
        l7c l7c = this.Y;
        if (i == 0) {
            wx3.H(obj);
            if (l7c.a == r6b.LOCAL_CHAT) {
                Long j = fgb.T0.j();
                if (j == null) {
                    return jue;
                }
                k7c.a = j.longValue();
                l7c.a = r6b.SERVER_CHAT;
            }
            if (l7c.a == r6b.SERVER_CHAT) {
                h5b h5b = fgb.T0;
                this.X = 1;
                obj = h5b.n(this);
                if (obj == pu3) {
                    return pu3;
                }
            }
            taf.o(fgb.F0, new udb(k7c.a, (r6b) l7c.a, this.x0, str));
            return jue;
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i22 i22 = (i22) obj;
        if (i22 != null) {
            o62 o62 = i22.b;
            n00 n00 = o62 == null ? null : o62.T;
            if (n00 != null) {
                str = n00.c;
            }
        }
        taf.o(fgb.F0, new udb(k7c.a, (r6b) l7c.a, this.x0, str));
        return jue;
    }
}
