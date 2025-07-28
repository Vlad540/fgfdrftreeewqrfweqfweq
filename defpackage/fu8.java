package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: fu8  reason: default package */
public final class fu8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ nu8 Y;
    public final /* synthetic */ Long Z;
    public final /* synthetic */ jv5 w0;
    public final /* synthetic */ CharSequence x0;
    public final /* synthetic */ boolean y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fu8(nu8 nu8, Long l, jv5 jv5, CharSequence charSequence, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = nu8;
        this.Z = l;
        this.w0 = jv5;
        this.x0 = charSequence;
        this.y0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fu8(this.Y, this.Z, this.w0, this.x0, this.y0, continuation);
    }

    public final Object o(Object obj) {
        jv5 jv5;
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        nu8 nu8 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            i22 i22 = (i22) nu8.b.getValue();
            if (i22 != null) {
                Long l = this.Z;
                long j = i22.a;
                if (l != null || (jv5 = this.w0) == null) {
                    CharSequence charSequence = this.x0;
                    if (charSequence != null && !h0e.c0(charSequence)) {
                        this.X = 3;
                        if (((h29) nu8.Y.getValue()).a(j, this.x0, this.Z, this.w0, this.y0, this) == pu3) {
                            return pu3;
                        }
                    }
                } else {
                    List o = hr1.o(j);
                    if (jv5.b == null || !jv5.c) {
                        iv5 iv5 = (iv5) nu8.w0.getValue();
                        this.X = 2;
                        iv5.getClass();
                        Object f = n1g.f(new hv5(iv5, jv5, o, (Continuation) null), this);
                        if (f != pu3) {
                            f = jue;
                        }
                        if (f == pu3) {
                            return pu3;
                        }
                    } else {
                        zu5 zu5 = (zu5) nu8.Z.getValue();
                        this.X = 1;
                        zu5.getClass();
                        Object f2 = n1g.f(new yu5(zu5, jv5, o, (Continuation) null), this);
                        if (f2 != pu3) {
                            f2 = jue;
                        }
                        if (f2 == pu3) {
                            return pu3;
                        }
                    }
                }
            }
            return jue;
        } else if (i == 1 || i == 2 || i == 3) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        nu8.M0.setValue((Object) null);
        nu8.s();
        return jue;
    }
}
