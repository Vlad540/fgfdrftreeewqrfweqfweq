package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: qi3  reason: default package */
public final class qi3 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ hj3 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qi3(int i, hj3 hj3, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.Z = hj3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new qi3(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        int i;
        pu3 pu3 = pu3.a;
        int i2 = this.X;
        jue jue = jue.a;
        if (i2 == 0) {
            wx3.H(obj);
            hge hge = null;
            hj3 hj3 = this.Z;
            int i3 = this.Y;
            if (i3 == 256) {
                xs7.E(hj3.a, hj3.q().b(), (ru3) null, new ui3(hj3, false, (Continuation) null), 2);
            } else if (i3 == 128) {
                this.X = 1;
                if (hj3.n(hj3, this) == pu3) {
                    return pu3;
                }
            } else if (i3 == f8a.e0) {
                this.X = 2;
                if (hj3.n(hj3, this) == pu3) {
                    return pu3;
                }
            } else if (i3 == 64) {
                this.X = 3;
                hcd hcd = hj3.d;
                hj3.c().getClass();
                hge hge2 = new hge(i8a.h0);
                lg7 c = hwf.c();
                u1 it = cs4.a.iterator();
                while (true) {
                    u1 u1Var = it;
                    if (u1Var.hasNext()) {
                        fze fze = (fze) u1Var.next();
                        int ordinal = fze.ordinal();
                        if (ordinal == 0) {
                            i = f8a.b;
                        } else if (ordinal == 1) {
                            i = f8a.c;
                        } else if (ordinal == 2) {
                            i = f8a.d;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        c.add(new kc3(i, new dge(h8a.a, fze.b), 2, false));
                    } else {
                        Object a = hcd.a(new d9b(hge2, (mge) null, hwf.a(c)), this);
                        if (a != pu3) {
                            a = jue;
                        }
                        if (a == pu3) {
                            return pu3;
                        }
                    }
                }
            } else if (i3 == 512) {
                this.X = 4;
                hcd hcd2 = hj3.d;
                ds4 c2 = hj3.c();
                boolean q = ((so1) hj3.u.getValue()).q();
                c2.getClass();
                hge hge3 = new hge(i8a.z0);
                if (q) {
                    hge = new hge(i8a.x0);
                }
                lg7 c3 = hwf.c();
                c3.add(new kc3(f8a.k0, q ? new hge(i8a.w0) : new hge(i8a.y0), 1, false));
                c3.add(new kc3(f8a.e, new hge(i8a.E0), 2, false));
                Object a2 = hcd2.a(new d9b(hge3, hge, hwf.a(c3)), this);
                if (a2 != pu3) {
                    a2 = jue;
                }
                if (a2 == pu3) {
                    return pu3;
                }
            } else if (i3 == f8a.v0) {
                hcd hcd3 = hj3.d;
                u8b u8b = new u8b(hj3.n, d8b.CONTACT);
                this.X = 5;
                if (hcd3.a(u8b, this) == pu3) {
                    return pu3;
                }
            }
        } else if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
