package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.ProfileScreen;

/* renamed from: qeb  reason: default package */
public final /* synthetic */ class qeb implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ seb b;

    public /* synthetic */ qeb(seb seb, int i) {
        this.a = i;
        this.b = seb;
    }

    public final Object invoke(Object obj) {
        xeb xeb;
        xeb xeb2;
        switch (this.a) {
            case 0:
                CharSequence charSequence = (CharSequence) obj;
                fgb q0 = ((ProfileScreen) this.b.X).q0();
                String h = q0.T0.h();
                if (h != null) {
                    taf.o(q0.E0, new teb(new jge(rhc.i, cs.g0(new Object[]{h}))));
                }
                return jue.a;
            default:
                int intValue = ((Integer) obj).intValue();
                ProfileScreen profileScreen = (ProfileScreen) this.b.X;
                profileScreen.getClass();
                if (intValue == j8a.l) {
                    profileScreen.q0().w(false);
                } else if (intValue == j8a.p1) {
                    profileScreen.q0().w(true);
                } else if (intValue == j8a.l1) {
                    fgb q02 = profileScreen.q0();
                    Long i = q02.T0.i();
                    if (i != null) {
                        taf.o(q02.F0, new ydb(i.longValue()));
                    }
                } else if (intValue == j8a.V0) {
                    fgb q03 = profileScreen.q0();
                    q5b q5b = (q5b) q03.L0.getValue();
                    q5b.getClass();
                    hge hge = new hge(l8a.t2);
                    lg7 c = hwf.c();
                    c.add(new kc3(j8a.R0, new hge(l8a.v2), 3, false));
                    c.add(new kc3(j8a.S0, new hge(l8a.w2), 3, false));
                    c.add(new kc3(j8a.Q0, new hge(l8a.u2), 3, false));
                    c.add(new kc3(j8a.T0, new hge(l8a.x2), 1, false));
                    c.add(q5b.b());
                    taf.o(q03.E0, new xeb(hge, (mge) null, hwf.a(c), (Bundle) null));
                } else if (intValue == j8a.U0) {
                    fgb q04 = profileScreen.q0();
                    Long i2 = q04.T0.i();
                    if (i2 != null) {
                        ((aw2) q04.t()).l().g0(i2.longValue());
                        taf.o(q04.E0, new bfb(new hge(l8a.z2), Integer.valueOf(phc.n)));
                    }
                } else if (intValue == j8a.n1) {
                    fgb q05 = profileScreen.q0();
                    xs7.E(q05.a, q05.u().a(), (ru3) null, new zfb(q05, (Continuation) null), 2);
                } else if (intValue == j8a.m1) {
                    fgb q06 = profileScreen.q0();
                    xs7.E(q06.a, q06.u().b(), (ru3) null, new cgb(q06, (Continuation) null), 2);
                } else if (intValue == j8a.o1) {
                    fgb q07 = profileScreen.q0();
                    xs7.E(q07.a, q07.u().b(), (ru3) null, new egb(q07, (Continuation) null), 2);
                } else if (intValue == j8a.G0) {
                    fgb q08 = profileScreen.q0();
                    Long j = q08.T0.j();
                    if (j != null) {
                        taf.o(q08.F0, new mdb(j.longValue()));
                    }
                } else {
                    CharSequence charSequence2 = "";
                    if (intValue == j8a.I0) {
                        fgb q09 = profileScreen.q0();
                        h5b h5b = q09.T0;
                        h5b.getClass();
                        if (h5b instanceof jp0) {
                            q09.q();
                        } else {
                            l5b l5b = (l5b) q09.R0.getValue();
                            CharSequence charSequence3 = l5b != null ? l5b.e : null;
                            if (charSequence3 != null) {
                                charSequence2 = charSequence3;
                            }
                            int k = h5b.k();
                            if (k != 0) {
                                q5b q5b2 = (q5b) q09.L0.getValue();
                                q5b2.getClass();
                                int t = hr1.t(k);
                                if (t == 0) {
                                    jge jge = new jge(l8a.C0, cs.g0(new Object[]{charSequence2}));
                                    lg7 c2 = hwf.c();
                                    c2.add(new kc3(j8a.x, new hge(l8a.y0), 1, false));
                                    c2.add(q5b2.b());
                                    xeb2 = new xeb(jge, (mge) null, hwf.a(c2), (Bundle) null);
                                } else if (t == 1) {
                                    hge hge2 = new hge(l8a.z0);
                                    jge jge2 = new jge(l8a.B0, cs.g0(new Object[]{charSequence2}));
                                    lg7 c3 = hwf.c();
                                    c3.add(new kc3(j8a.x, new hge(l8a.y0), 1, false));
                                    c3.add(q5b2.b());
                                    xeb2 = new xeb(hge2, jge2, hwf.a(c3), (Bundle) null);
                                } else if (t == 2) {
                                    hge hge3 = new hge(l8a.x0);
                                    hge hge4 = new hge(l8a.w0);
                                    lg7 c4 = hwf.c();
                                    c4.add(new kc3(j8a.x, new hge(l8a.y0), 1, false));
                                    c4.add(q5b2.b());
                                    xeb2 = new xeb(hge3, hge4, hwf.a(c4), (Bundle) null);
                                } else if (t == 3) {
                                    xeb = q5b2.c();
                                    taf.o(q09.E0, xeb);
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                                xeb = xeb2;
                                taf.o(q09.E0, xeb);
                            }
                        }
                    } else if (intValue == j8a.O0) {
                        fgb q010 = profileScreen.q0();
                        Long i3 = q010.T0.i();
                        if (i3 != null) {
                            long longValue = i3.longValue();
                            kdb.c.getClass();
                            taf.o(q010.F0, new a34(":complaint?chat_id=" + longValue));
                        }
                    } else if (intValue == j8a.H0) {
                        fgb q011 = profileScreen.q0();
                        l5b l5b2 = (l5b) q011.R0.getValue();
                        CharSequence charSequence4 = l5b2 != null ? l5b2.e : null;
                        if (charSequence4 != null) {
                            charSequence2 = charSequence4;
                        }
                        q5b q5b3 = (q5b) q011.L0.getValue();
                        q5b3.getClass();
                        jge jge3 = new jge(l8a.U, cs.g0(new Object[]{charSequence2}));
                        hge hge5 = new hge(l8a.T);
                        lg7 c5 = hwf.c();
                        c5.add(new kc3(j8a.m, new hge(l8a.S), 1, false));
                        c5.add(q5b3.b());
                        taf.o(q011.E0, new xeb(jge3, hge5, hwf.a(c5), (Bundle) null));
                    } else {
                        int i4 = j8a.J0;
                        if (intValue == i4) {
                            profileScreen.q0().B();
                        } else if (intValue == j8a.P0) {
                            fgb q012 = profileScreen.q0();
                            q012.getClass();
                            taf.o(q012.E0, new web(new hge(l8a.F2), new kfb(q012, 1)));
                        } else if (intValue == j8a.L0) {
                            profileScreen.q0().A();
                        } else if (intValue == j8a.K0 || intValue == i4) {
                            h5b h5b2 = profileScreen.q0().T0;
                            h5b2.getClass();
                            if (h5b2 instanceof jp0) {
                                profileScreen.q0().C(false);
                            } else {
                                profileScreen.q0().B();
                            }
                        } else if (intValue == j8a.N0 || intValue == j8a.M0) {
                            fgb q013 = profileScreen.q0();
                            cfb y = q013.T0.y();
                            if (y != null) {
                                taf.o(q013.E0, y);
                            }
                        }
                    }
                }
                return jue.a;
        }
    }
}
