package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: ht2  reason: default package */
public final class ht2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ fu2 Z;
    public final /* synthetic */ long w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ht2(int i, fu2 fu2, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.Z = fu2;
        this.w0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ht2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ht2(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        int i;
        tf3 k;
        pu3 pu3 = pu3.a;
        int i2 = this.X;
        jue jue = jue.a;
        if (i2 == 0) {
            wx3.H(obj);
            int i3 = xob.oneme_chat_action_add_to_folder;
            fu2 fu2 = this.Z;
            long j = this.w0;
            int i4 = this.Y;
            if (i4 == i3 || i4 == (i = xob.oneme_chat_action_remove_from_folder)) {
                i22 i22 = (i22) fu2.r(fu2).m(j).a.getValue();
                if (i22 == null) {
                    return jue;
                }
                taf.o(fu2.Q0, new gfa(i22.b.a));
            } else if (i4 == i) {
                taf.o(fu2.Q0, new gfa(j));
            } else if (i4 == xob.oneme_chat_action_delete_channel) {
                i22 i222 = (i22) fu2.r(fu2).m(j).a.getValue();
                if (i222 == null) {
                    return jue;
                }
                taf.o(fu2.R0, i222.b() ? l22.d(i222) : l22.e(i222));
            } else if (i4 == xob.oneme_chat_action_delete_chat) {
                i22 i223 = (i22) fu2.r(fu2).m(j).a.getValue();
                if (i223 == null) {
                    return jue;
                }
                taf.o(fu2.R0, i223.J() ? l22.g(i223) : i223.b() ? l22.f(i223) : l22.e(i223));
            } else if (i4 == xob.oneme_chat_action_leave) {
                i22 i224 = (i22) fu2.r(fu2).m(j).a.getValue();
                if (i224 == null) {
                    return jue;
                }
                taf.o(fu2.R0, i224.b() ? i224.G() ? l22.i(i224) : l22.k(i224) : i224.G() ? l22.h(i224) : l22.j(i224));
            } else if (i4 == xob.oneme_chat_action_close_chat) {
                taf.o(fu2.R0, l22.c(j));
            } else if (i4 == xob.oneme_chat_action_close_channel) {
                taf.o(fu2.R0, l22.b(j));
            } else if (i4 == xob.oneme_chat_action_block) {
                i22 i225 = (i22) fu2.r(fu2).m(j).a.getValue();
                if ((i225 != null ? i225.k() : null) != null) {
                    taf.o(fu2.R0, l22.a(i225));
                }
            } else if (i4 == xob.oneme_chat_action_add_favorite) {
                k77[] k77Arr = fu2.Z0;
                vqc vqc = (xzc) fu2.x0.getValue();
                vqc.getClass();
                int o = (int) vqc.o(PmsKey.max-favorite-chats, (long) 5);
                int F = ((bv2) fu2.y0.getValue()).l().F();
                l05 l05 = fu2.R0;
                if (F < o) {
                    t52 t = fu2.t();
                    t.getClass();
                    udd.p("t52", "addToFavorites: " + j, new Object[0]);
                    t.Z(j, System.currentTimeMillis(), true);
                    taf.o(l05, new Object());
                } else {
                    taf.o(l05, new med(new jge(cic.a0, cs.g0(new Object[]{new Integer(o)}))));
                }
            } else if (i4 == xob.oneme_chat_action_remove_favorite) {
                k77[] k77Arr2 = fu2.Z0;
                fu2.t().V(j, true);
            } else if (i4 == xob.oneme_chat_action_mark_as_unread) {
                i22 i226 = (i22) fu2.r(fu2).m(j).a.getValue();
                if (i226 != null) {
                    ((m0c) fu2.D0.getValue()).c(i226);
                }
            } else if (i4 == xob.oneme_chat_action_mark_as_read) {
                i22 i227 = (i22) fu2.r(fu2).m(j).a.getValue();
                if (i227 == null) {
                    return jue;
                }
                ((m0c) fu2.D0.getValue()).b(i227);
            } else if (i4 == xob.oneme_chat_action_unmute) {
                k77[] k77Arr3 = fu2.Z0;
                fu2.t().g0(j);
            } else if (i4 == xob.oneme_chat_action_mute) {
                i22 i228 = (i22) fu2.r(fu2).m(j).a.getValue();
                if (i228 == null) {
                    return jue;
                }
                taf.o(fu2.R0, l22.l(i228));
            } else if (i4 == xob.oneme_chat_action_select) {
                taf.o(fu2.R0, l22.m());
            } else if (i4 == qhc.a) {
                l05 l052 = fu2.Q0;
                zu2.c.getClass();
                rf0.j(":complaint?chat_id=" + j, l052);
            } else if (i4 == xob.oneme_chat_action_clear_chat_history) {
                taf.o(fu2.R0, new aed(new hge(h2a.g), new ct2(fu2, j, 2)));
            } else if (i4 == xob.oneme_chat_action_suspend_bot) {
                k77[] k77Arr4 = fu2.Z0;
                fu2.getClass();
                taf.o(fu2.R0, new aed(new hge(h2a.t), new ct2(fu2, j, 0)));
            } else if (i4 == xob.oneme_chat_action_suspend_and_delete_bot) {
                k77[] k77Arr5 = fu2.Z0;
                fu2.getClass();
                taf.o(fu2.R0, new aed(new hge(h2a.s), new ct2(fu2, j, 1)));
            } else if (i4 == xob.oneme_chat_action_move_rights_and_leave) {
                i22 i229 = (i22) fu2.r(fu2).m(j).a.getValue();
                if (i229 == null) {
                    return jue;
                }
                boolean G = i229.G();
                l05 l053 = fu2.Q0;
                if (G) {
                    taf.o(l053, new s69(j));
                } else {
                    zu2.c.getClass();
                    rf0.j(":profile/change-owner?chat_id=" + j + "&leave_chat=true", l053);
                }
            } else {
                int i5 = xob.oneme_confirm_delete;
                long j2 = this.w0;
                if (i4 == i5) {
                    k77[] k77Arr6 = fu2.Z0;
                    y8c.a((y8c) fu2.Z.getValue(), j2);
                } else if (i4 == xob.oneme_confirm_delete_for_all) {
                    k77[] k77Arr7 = fu2.Z0;
                    y8c.a((y8c) fu2.Z.getValue(), j2);
                } else if (i4 == xob.oneme_confirm_leave) {
                    k77[] k77Arr8 = fu2.Z0;
                    fu2.t().Q(j);
                } else if (i4 == xob.oneme_confirm_block) {
                    i22 i2210 = (i22) fu2.r(fu2).m(j).a.getValue();
                    if (i2210 == null || (k = i2210.k()) == null) {
                        return jue;
                    }
                    taf.o(fu2.R0, new aed(new hge(h2a.F), new ka(fu2, 7, k)));
                    long n = k.n();
                    this.X = 1;
                    ((ch3) fu2.A0.getValue()).a(n);
                    if (jue == pu3) {
                        return pu3;
                    }
                } else if (i4 == xob.oneme_confirm_mute_1_hour) {
                    int i6 = zp4.o;
                    long P = mt0.P(1, eq4.HOURS);
                    this.X = 2;
                    fu2.s(fu2, j2, P);
                    if (jue == pu3) {
                        return pu3;
                    }
                } else if (i4 == xob.oneme_confirm_mute_4_hour) {
                    int i7 = zp4.o;
                    long P2 = mt0.P(4, eq4.HOURS);
                    this.X = 3;
                    fu2.s(fu2, j2, P2);
                    if (jue == pu3) {
                        return pu3;
                    }
                } else if (i4 == xob.oneme_confirm_mute_1_day) {
                    int i8 = zp4.o;
                    long P3 = mt0.P(1, eq4.DAYS);
                    this.X = 4;
                    fu2.s(fu2, j2, P3);
                    if (jue == pu3) {
                        return pu3;
                    }
                } else if (i4 == xob.oneme_confirm_mute_infinite) {
                    this.X = 5;
                    k77[] k77Arr9 = fu2.Z0;
                    t52 t2 = fu2.t();
                    i22 B = t2.B(j);
                    if (B != null) {
                        t2.l(-1, B);
                        ((pk) t2.p.get()).r(B.a);
                    }
                    if (jue == pu3) {
                        return pu3;
                    }
                } else if (i4 == xob.oneme_chat_action_clear_saved_messages) {
                    taf.o(fu2.R0, new Object());
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
