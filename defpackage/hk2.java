package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.util.Iterator;
import java.util.Map;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.chats.tab.ChatsTabWidget;
import one.me.chatscreen.ChatScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.complaintbottomsheet.ComplaintBottomSheet;
import one.me.login.confirm.ConfirmPhoneScreen;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* renamed from: hk2  reason: default package */
public final /* synthetic */ class hk2 implements s16 {
    public final /* synthetic */ int a;

    public /* synthetic */ hk2(int i) {
        this.a = i;
    }

    public final Object invoke() {
        boolean z;
        Object obj;
        Class<Context> cls = Context.class;
        Class<xzc> cls2 = xzc.class;
        Class<bv2> cls3 = bv2.class;
        Class<pae> cls4 = pae.class;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ChatScreen.n1;
                return new u68((f87) sl2.a.getAccessor().c(f87.class), 7);
            case 1:
                k77[] k77Arr2 = ChatScreen.n1;
                return sl2.a.c();
            case 2:
                k77[] k77Arr3 = ChatScreen.n1;
                sl2 sl2 = sl2.a;
                r7e d = sl2.getAccessor().d(ip.class);
                r7e d2 = sl2.getAccessor().d(dhe.class);
                r7e d3 = sl2.getAccessor().d(f03.class);
                r7e d4 = sl2.getAccessor().d(cls4);
                r7e d5 = sl2.getAccessor().d(cls);
                r7e d6 = sl2.getAccessor().d(rp8.class);
                sl2.getAccessor().d(cls3);
                return new ny(d, d2, d3, d4, d5, d6, sl2.getAccessor().d(zf3.class), sl2.getAccessor().d(w6a.class));
            case 3:
                k77[] k77Arr4 = ChatScreen.n1;
                return new h3c();
            case 4:
                k77[] k77Arr5 = ChatScreen.n1;
                return (tt6) sl2.a.getAccessor().e();
            case 5:
                sl2 sl22 = sl2.a;
                return new qxc(sl22.getAccessor().d(cls4), sl22.getAccessor().d(luf.class), sl22.getAccessor().d(th8.class), sl22.getAccessor().d(g86.class), sl22.getAccessor().d(gw8.class), sl22.getAccessor().d(m86.class));
            case 6:
                k77[] k77Arr6 = ChatTitleIconScreen.D0;
                return ipd.a.b();
            case 7:
                k77[] k77Arr7 = ChatsListSearchScreen.N0;
                return new bt2();
            case 8:
                k77[] k77Arr8 = ChatsListSearchScreen.N0;
                return new xf0(zf0.a.getAccessor().d(kp3.class), true, (ll3) null, 46);
            case 9:
                k77[] k77Arr9 = ChatsListWidget.O0;
                t52 l = ((bv2) tp2.a.getAccessor().c(cls3)).l();
                l.e();
                Iterator it = l.f.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        i22 i22 = (i22) ((Map.Entry) it.next()).getValue();
                        try {
                            z = t52.N.test(i22);
                        } catch (Exception unused) {
                            z = true;
                        }
                        if (z && t52.m(i22, t52.L, false, l.n.e)) {
                            z2 = true;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            case 10:
                k77[] k77Arr10 = ChatsListWidget.O0;
                ql3 ql3 = ql3.b;
                co3 co3 = co3.a;
                r7e d7 = co3.getAccessor().d(cls);
                ok3.a.getClass();
                return new kl3(ql3, d7, nk3.b, co3.getAccessor().d(vs7.class), (pae) co3.getAccessor().c(cls4), co3.getAccessor().d(gsc.class), co3.getAccessor().d(wf3.class), co3.getAccessor().d(ap3.class), co3.getAccessor().d(cls3), co3.getAccessor().d(ch3.class), co3.getAccessor().d(mn3.class), co3.getAccessor().d(xf3.class), co3.getAccessor().d(cn3.class), co3.getAccessor().d(g5e.class), co3.getAccessor().d(cls2));
            case 11:
                k77[] k77Arr11 = ChatsListWidget.O0;
                return new ak3(tp2.a.getAccessor().d(cls2));
            case 12:
                return new hs2();
            case 13:
                return new hs2();
            case 14:
                k77[] k77Arr12 = ChatsTabWidget.F0;
                return new qt5();
            case 15:
                return new xbb(l8a.D, (nge) null, 6);
            case 16:
                k77[] k77Arr13 = ComplaintBottomSheet.X;
                return new kc3(c4a.a, new hge(d4a.d), 2, false);
            case 17:
                return new bhd(false);
            case 18:
                return new bhd(true);
            case 19:
                try {
                    Resources system = Resources.getSystem();
                    int identifier = system.getIdentifier("db_connection_pool_size", "integer", "android");
                    int integer = identifier != 0 ? system.getInteger(identifier) : -1;
                    if (integer <= 0) {
                        integer = 4;
                    }
                    obj = Integer.valueOf(integer);
                } catch (Throwable th) {
                    obj = new kcc(th);
                }
                if (obj instanceof kcc) {
                    obj = 4;
                }
                return Integer.valueOf(((Number) obj).intValue());
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                return nqc.a.i();
            case 21:
                return new q15("io", ((Number) y93.b.getValue()).intValue(), 1000, true, false, 0, 96);
            case 22:
                return new q15("net", 2, 60000, true, false, 0, 64);
            case 23:
                int i = zp4.o;
                eq4 eq4 = eq4.SECONDS;
                zb8 zb8 = new zb8(true, mt0.P(1, eq4), mt0.P(3, eq4), new t13(1), new t13(2));
                boolean z3 = hhd.a;
                he heVar = he.a;
                q15 q15 = y93.a;
                return new x4a(zb8, new x93(0), z3 ? q15 : (q15) y93.c.getValue(), z3 ? q15 : (q15) y93.d.getValue(), z3 ? q15 : y93.e);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new nbe(y93.f, new r7e(new hk2(27)));
            case 25:
                return new qj(new r7e(new hk2(20)));
            case 26:
                return new n3a(y93.f);
            case 27:
                return de.a();
            case 28:
                k77[] k77Arr14 = ConfirmPhoneScreen.G0;
                int i2 = e87.a;
                return Boolean.valueOf(e87.b(e87.c));
            default:
                k77[] k77Arr15 = ConfirmPhoneScreen.G0;
                return mnc.X;
        }
    }
}
