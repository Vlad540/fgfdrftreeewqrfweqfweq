package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: us2  reason: default package */
public final class us2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ bt2 Z;
    public final /* synthetic */ long w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public us2(int i, bt2 bt2, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.Z = bt2;
        this.w0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((us2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new us2(this.Y, this.Z, this.w0, continuation);
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
            bt2 bt2 = this.Z;
            long j = this.w0;
            int i4 = this.Y;
            if (i4 == i3 || i4 == (i = xob.oneme_chat_action_remove_from_folder)) {
                k77[] k77Arr = bt2.U0;
                i22 i22 = (i22) bt2.s().m(j).a.getValue();
                if (i22 == null) {
                    return jue;
                }
                taf.o(bt2.L0, new gfa(i22.b.a));
            } else if (i4 == i) {
                taf.o(bt2.L0, new gfa(j));
            } else if (i4 == xob.oneme_chat_action_delete_channel) {
                k77[] k77Arr2 = bt2.U0;
                i22 i222 = (i22) bt2.s().m(j).a.getValue();
                if (i222 == null) {
                    return jue;
                }
                taf.o(bt2.M0, i222.b() ? l22.d(i222) : l22.e(i222));
            } else if (i4 == xob.oneme_chat_action_delete_chat) {
                k77[] k77Arr3 = bt2.U0;
                i22 i223 = (i22) bt2.s().m(j).a.getValue();
                if (i223 == null) {
                    return jue;
                }
                taf.o(bt2.M0, i223.J() ? l22.g(i223) : i223.b() ? l22.f(i223) : l22.e(i223));
            } else if (i4 == xob.oneme_chat_action_leave) {
                k77[] k77Arr4 = bt2.U0;
                i22 i224 = (i22) bt2.s().m(j).a.getValue();
                if (i224 == null) {
                    return jue;
                }
                taf.o(bt2.M0, i224.b() ? i224.G() ? l22.i(i224) : l22.k(i224) : i224.G() ? l22.h(i224) : l22.j(i224));
            } else if (i4 == xob.oneme_chat_action_close_chat) {
                taf.o(bt2.M0, l22.c(j));
            } else if (i4 == xob.oneme_chat_action_close_channel) {
                taf.o(bt2.M0, l22.b(j));
            } else if (i4 == xob.oneme_chat_action_block) {
                k77[] k77Arr5 = bt2.U0;
                i22 i225 = (i22) bt2.s().m(j).a.getValue();
                if ((i225 != null ? i225.k() : null) != null) {
                    taf.o(bt2.M0, l22.a(i225));
                }
            } else if (i4 == xob.oneme_chat_action_add_favorite) {
                k77[] k77Arr6 = bt2.U0;
                vqc vqc = (xzc) bt2.y0.getValue();
                vqc.getClass();
                int o = (int) vqc.o(PmsKey.max-favorite-chats, (long) 5);
                int F = bt2.s().l().F();
                l05 l05 = bt2.M0;
                if (F < o) {
                    t52 l = bt2.s().l();
                    l.getClass();
                    udd.p("t52", "addToFavorites: " + j, new Object[0]);
                    l.Z(j, System.currentTimeMillis(), true);
                    taf.o(l05, new Object());
                } else {
                    taf.o(l05, new med(new jge(cic.a0, cs.g0(new Object[]{new Integer(o)}))));
                }
            } else if (i4 == xob.oneme_chat_action_remove_favorite) {
                k77[] k77Arr7 = bt2.U0;
                bt2.s().l().V(j, true);
            } else if (i4 == xob.oneme_chat_action_mark_as_unread) {
                k77[] k77Arr8 = bt2.U0;
                i22 i226 = (i22) bt2.s().m(j).a.getValue();
                if (i226 == null) {
                    return jue;
                }
                m0c m0c = (m0c) bt2.D0.getValue();
                i22 y = m0c.a().y(i226.b.a);
                if (y != null) {
                    m0c.c(y);
                }
            } else if (i4 == xob.oneme_chat_action_mark_as_read) {
                k77[] k77Arr9 = bt2.U0;
                i22 i227 = (i22) bt2.s().m(j).a.getValue();
                if (i227 == null) {
                    return jue;
                }
                ((m0c) bt2.D0.getValue()).b(i227);
            } else if (i4 == xob.oneme_chat_action_unmute) {
                k77[] k77Arr10 = bt2.U0;
                bt2.s().l().g0(j);
            } else if (i4 == xob.oneme_chat_action_mute) {
                k77[] k77Arr11 = bt2.U0;
                i22 i228 = (i22) bt2.s().m(j).a.getValue();
                if (i228 == null) {
                    return jue;
                }
                taf.o(bt2.M0, l22.l(i228));
            } else if (i4 == xob.oneme_chat_action_select) {
                taf.o(bt2.M0, l22.m());
            } else if (i4 == xob.oneme_chat_action_move_rights_and_leave) {
                k77[] k77Arr12 = bt2.U0;
                i22 i229 = (i22) bt2.s().m(j).a.getValue();
                if (i229 == null) {
                    return jue;
                }
                boolean G = i229.G();
                l05 l052 = bt2.L0;
                if (G) {
                    taf.o(l052, new s69(j));
                } else {
                    zu2.c.getClass();
                    rf0.j(":profile/change-owner?chat_id=" + j + "&leave_chat=true", l052);
                }
            } else {
                int i5 = xob.oneme_confirm_delete;
                long j2 = this.w0;
                if (i4 == i5) {
                    y8c.a((y8c) bt2.w0.getValue(), j2);
                } else if (i4 == xob.oneme_confirm_delete_for_all) {
                    y8c.a((y8c) bt2.w0.getValue(), j2);
                } else if (i4 == xob.oneme_confirm_leave) {
                    k77[] k77Arr13 = bt2.U0;
                    bt2.s().l().Q(j);
                } else if (i4 == xob.oneme_confirm_block) {
                    k77[] k77Arr14 = bt2.U0;
                    i22 i2210 = (i22) bt2.s().m(j).a.getValue();
                    if (i2210 == null || (k = i2210.k()) == null) {
                        return jue;
                    }
                    long n = k.n();
                    this.X = 1;
                    ((ch3) bt2.E0.getValue()).a(n);
                    if (jue == pu3) {
                        return pu3;
                    }
                } else if (i4 == xob.oneme_confirm_mute_1_hour) {
                    int i6 = zp4.o;
                    long P = mt0.P(1, eq4.HOURS);
                    this.X = 2;
                    bt2.q(bt2, j2, P);
                    if (jue == pu3) {
                        return pu3;
                    }
                } else if (i4 == xob.oneme_confirm_mute_4_hour) {
                    int i7 = zp4.o;
                    long P2 = mt0.P(4, eq4.HOURS);
                    this.X = 3;
                    bt2.q(bt2, j2, P2);
                    if (jue == pu3) {
                        return pu3;
                    }
                } else if (i4 == xob.oneme_confirm_mute_1_day) {
                    int i8 = zp4.o;
                    long P3 = mt0.P(1, eq4.DAYS);
                    this.X = 4;
                    bt2.q(bt2, j2, P3);
                    if (jue == pu3) {
                        return pu3;
                    }
                } else if (i4 == xob.oneme_confirm_mute_infinite) {
                    this.X = 5;
                    k77[] k77Arr15 = bt2.U0;
                    t52 l2 = bt2.s().l();
                    i22 B = l2.B(j);
                    if (B != null) {
                        l2.l(-1, B);
                        ((pk) l2.p.get()).r(B.a);
                    }
                    if (jue == pu3) {
                        return pu3;
                    }
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
