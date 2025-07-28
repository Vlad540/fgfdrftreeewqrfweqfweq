package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: m72  reason: default package */
public final class m72 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ rr4 Y;
    public final /* synthetic */ n72 Z;
    public final /* synthetic */ i22 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m72(rr4 rr4, n72 n72, i22 i22, Continuation continuation) {
        super(2, continuation);
        this.Y = rr4;
        this.Z = n72;
        this.w0 = i22;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new m72(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        Long l;
        Long l2 = pu3.a;
        int i = this.X;
        i22 i22 = this.w0;
        String str = null;
        n72 n72 = this.Z;
        rr4 rr4 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            String str2 = rr4.d;
            rr4 rr42 = (rr4) n72.i.getValue();
            if (!hhd.f(str2, rr42 != null ? rr42.d : null) && rr4.d != null) {
                xy1 xy1 = (xy1) n72.v.getValue();
                long j = i22.a;
                this.X = 1;
                xy1.getClass();
                String name = xy1.class.getName();
                udd.q(name, "changeChatTitle, chatId = " + j);
                t97 t97 = xy1.c;
                ((aw2) ((bv2) t97.getValue())).l().c(j, z52.a);
                String str3 = rr4.d;
                i22 f = ((aw2) ((bv2) t97.getValue())).f(j, new uy1(str3, 1));
                if (f != null) {
                    ((tt0) xy1.b.getValue()).c(new mw2(hr1.o(j), false, false, (md4) null, (a4b) null, 124));
                    l = new Long(((gy9) ((pk) xy1.a.getValue())).m(j, f.b.a, str3, (String) null, (d10) null));
                } else {
                    l = new Long(0);
                }
                if (l == l2) {
                    return l2;
                }
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str4 = rr4.f;
        rr4 rr43 = (rr4) n72.i.getValue();
        if (rr43 != null) {
            str = rr43.f;
        }
        if (!hhd.f(str4, str)) {
            ((gy9) ((pk) n72.q.getValue())).n(i22.a, rr4.f, i22.b.a);
        }
        return jue.a;
    }
}
