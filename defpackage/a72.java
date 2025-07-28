package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: a72  reason: default package */
public final class a72 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ n72 Y;
    public final /* synthetic */ int Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a72(int i, n72 n72, Continuation continuation) {
        super(2, continuation);
        this.Y = n72;
        this.Z = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new a72(this.Z, this.Y, continuation);
    }

    public final Object o(Object obj) {
        d9b d9b;
        d9b d9b2;
        pu3 pu3 = pu3.a;
        switch (this.X) {
            case 0:
                wx3.H(obj);
                n72 n72 = this.Y;
                rr4 rr4 = (rr4) n72.i.getValue();
                hge hge = null;
                String str = rr4 != null ? rr4.d : null;
                if (str == null) {
                    str = "";
                }
                i22 p = n72.p();
                boolean z = p != null && p.b();
                int i = f8a.r;
                hcd hcd = n72.d;
                int i2 = this.Z;
                if (i2 == i) {
                    ds4 c = n72.c();
                    i22 p2 = n72.p();
                    boolean z2 = p2 != null && p2.b();
                    c.getClass();
                    jge jge = new jge(i8a.S, cs.g0(new Object[]{str}));
                    if (z2) {
                        hge = new hge(i8a.Q);
                    }
                    lg7 c2 = hwf.c();
                    if (z2) {
                        c2.add(new kc3(f8a.A, new hge(i8a.s0), 1, false));
                    }
                    c2.add(new kc3(f8a.u, z2 ? new hge(i8a.R) : new hge(i8a.M), 1, false));
                    c2.add(new kc3(f8a.s, new hge(i8a.N), 2, false));
                    d9b d9b3 = new d9b(jge, hge, hwf.a(c2));
                    this.X = 1;
                    if (hcd.a(d9b3, this) == pu3) {
                        return pu3;
                    }
                } else if (i2 == f8a.k) {
                    n72.c().getClass();
                    d9b d9b4 = new d9b(new jge(i8a.D, cs.g0(new Object[]{str})), (mge) null, p23.B(new kc3[]{new kc3(f8a.m, new hge(i8a.B), 3, false), new kc3(f8a.l, new hge(i8a.C), 2, false)}));
                    this.X = 2;
                    if (hcd.a(d9b4, this) == pu3) {
                        return pu3;
                    }
                } else if (i2 == f8a.z) {
                    if (z) {
                        n72.c().getClass();
                        d9b2 = new d9b(new hge(i8a.u0), new jge(i8a.t0, cs.g0(new Object[]{str})), p23.B(new kc3[]{new kc3(f8a.A, new hge(i8a.s0), 1, false), new kc3(f8a.B, new hge(i8a.r0), 2, false)}));
                    } else {
                        n72.c().getClass();
                        d9b2 = new d9b(new hge(i8a.u0), new jge(i8a.t0, cs.g0(new Object[]{str})), p23.B(new kc3[]{new kc3(f8a.C, new hge(i8a.q0), 1, false), new kc3(f8a.B, new hge(i8a.r0), 2, false)}));
                    }
                    this.X = 3;
                    if (hcd.a(d9b2, this) == pu3) {
                        return pu3;
                    }
                } else if (i2 == f8a.n) {
                    ds4 c3 = n72.c();
                    i22 p3 = n72.p();
                    boolean z3 = p3 != null && p3.b();
                    c3.getClass();
                    jge jge2 = new jge(i8a.L, cs.g0(new Object[]{str}));
                    if (z3) {
                        hge = new hge(i8a.J);
                    }
                    lg7 c4 = hwf.c();
                    if (z3) {
                        c4.add(new kc3(f8a.w, new hge(i8a.n0), 1, false));
                    }
                    c4.add(new kc3(f8a.q, z3 ? new hge(i8a.K) : new hge(i8a.E), 1, false));
                    c4.add(new kc3(f8a.o, new hge(i8a.F), 2, false));
                    d9b d9b5 = new d9b(jge2, hge, hwf.a(c4));
                    this.X = 4;
                    if (hcd.a(d9b5, this) == pu3) {
                        return pu3;
                    }
                } else if (i2 == f8a.v) {
                    if (z) {
                        n72.c().getClass();
                        d9b = new d9b(new hge(i8a.p0), new jge(i8a.o0, cs.g0(new Object[]{str})), p23.B(new kc3[]{new kc3(f8a.w, new hge(i8a.n0), 1, false), new kc3(f8a.x, new hge(i8a.m0), 2, false)}));
                    } else {
                        n72.c().getClass();
                        d9b = new d9b(new hge(i8a.p0), new jge(i8a.o0, cs.g0(new Object[]{str})), p23.B(new kc3[]{new kc3(f8a.y, new hge(i8a.l0), 1, false), new kc3(f8a.x, new hge(i8a.m0), 2, false)}));
                    }
                    this.X = 5;
                    if (hcd.a(d9b, this) == pu3) {
                        return pu3;
                    }
                } else if (i2 == f8a.h) {
                    n72.c().getClass();
                    d9b d9b6 = new d9b(new jge(i8a.A, cs.g0(new Object[]{str})), new hge(i8a.z), p23.B(new kc3[]{new kc3(f8a.j, new hge(i8a.x), 1, false), new kc3(f8a.i, new hge(i8a.y), 2, false)}));
                    this.X = 6;
                    if (hcd.a(d9b6, this) == pu3) {
                        return pu3;
                    }
                } else {
                    int i3 = f8a.E;
                    long j = n72.n;
                    if (i2 == i3) {
                        s8b.c.getClass();
                        a34 a34 = new a34(":profile/member_permissions?id=" + j);
                        this.X = 7;
                        if (hcd.a(a34, this) == pu3) {
                            return pu3;
                        }
                    } else if (i2 == f8a.g) {
                        u8b u8b = new u8b(j, d8b.LOCAL_CHAT);
                        this.X = 8;
                        if (hcd.a(u8b, this) == pu3) {
                            return pu3;
                        }
                    } else if (i2 == f8a.h0) {
                        x8b x8b = new x8b(j);
                        this.X = 9;
                        if (hcd.a(x8b, this) == pu3) {
                            return pu3;
                        }
                    } else if (i2 == f8a.D) {
                        s8b.c.getClass();
                        a34 a342 = new a34(":profile/change-owner?chat_id=" + j + "&leave_chat=false");
                        this.X = 10;
                        if (hcd.a(a342, this) == pu3) {
                            return pu3;
                        }
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
            case 9:
            case 10:
                wx3.H(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
