package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: e72  reason: default package */
public final class e72 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ n72 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e72(int i, n72 n72, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.Z = n72;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new e72(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        jue jue = pu3.a;
        int i = this.X;
        jue jue2 = jue.a;
        switch (i) {
            case 0:
                wx3.H(obj);
                int i2 = f8a.u;
                n72 n72 = this.Z;
                int i3 = this.Y;
                if (i3 == i2) {
                    i22 p = n72.p();
                    if (p == null || !p.b()) {
                        this.X = 2;
                        n72.n(n72);
                        if (jue2 == jue) {
                            return jue;
                        }
                    } else {
                        hcd hcd = n72.d;
                        n72.c().getClass();
                        d9b d9b = new d9b(new hge(i8a.P), (mge) null, p23.B(new kc3[]{new kc3(f8a.t, new hge(i8a.O), 1, false), new kc3(f8a.s, new hge(i8a.N), 2, false)}));
                        this.X = 1;
                        if (hcd.a(d9b, this) == jue) {
                            return jue;
                        }
                    }
                } else if (i3 == f8a.q) {
                    i22 p2 = n72.p();
                    if (p2 == null || !p2.b()) {
                        this.X = 4;
                        n72.n(n72);
                        if (jue2 == jue) {
                            return jue;
                        }
                    } else {
                        hcd hcd2 = n72.d;
                        n72.c().getClass();
                        d9b d9b2 = new d9b(new hge(i8a.I), new hge(i8a.H), p23.B(new kc3[]{new kc3(f8a.p, new hge(i8a.G), 1, false), new kc3(f8a.o, new hge(i8a.F), 2, false)}));
                        this.X = 3;
                        if (hcd2.a(d9b2, this) == jue) {
                            return jue;
                        }
                    }
                } else if (i3 == f8a.t || i3 == f8a.p) {
                    this.X = 5;
                    n72.n(n72);
                    if (jue2 == jue) {
                        return jue;
                    }
                } else if (i3 == f8a.m || i3 == f8a.j) {
                    this.X = 6;
                    k77[] k77Arr = n72.E;
                    Object U = xs7.U(n72.q().b(), new b72(n72, (Continuation) null), this);
                    if (U != jue) {
                        U = jue2;
                    }
                    if (U == jue) {
                        return jue;
                    }
                } else if (i3 == f8a.C || i3 == f8a.y) {
                    this.X = 7;
                    k77[] k77Arr2 = n72.E;
                    qod D = xs7.D(n72.a, n72.q().b(), ru3.b, new d72(n72, (Continuation) null));
                    n72.y.o1(n72, n72.E[0], D);
                    if (jue2 == jue) {
                        return jue;
                    }
                } else if (i3 == f8a.A || i3 == f8a.w) {
                    hcd hcd3 = n72.d;
                    s8b.c.getClass();
                    a34 a34 = new a34(":profile/change-owner?chat_id=" + n72.n + "&leave_chat=true");
                    this.X = 8;
                    if (hcd3.a(a34, this) == jue) {
                        return jue;
                    }
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                wx3.H(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue2;
    }
}
