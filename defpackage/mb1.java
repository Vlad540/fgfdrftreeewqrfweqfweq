package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.contactlist.ContactListWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.settings.MessagesSettingsScreen;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: mb1  reason: default package */
public final class mb1 implements j26, ny4, f7d, dk3, zhd, g73, oaa, wx7 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ mb1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void j() {
    }

    public void I(CharSequence charSequence) {
        k77[] k77Arr = ContactListWidget.S0;
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        contactListWidget.getClass();
        k77[] k77Arr2 = ContactListWidget.S0;
        k77 k77 = k77Arr2[7];
        contactListWidget.P0.b(contactListWidget, Boolean.TRUE);
        k77 k772 = k77Arr2[5];
        contactListWidget.N0.b(contactListWidget, charSequence);
        if (contactListWidget.p0()) {
            kl3 o0 = contactListWidget.o0();
            String obj = charSequence != null ? charSequence.toString() : null;
            if (obj == null) {
                obj = "";
            }
            ((mc9) o0.C0.g.getValue()).setValue(obj);
        }
    }

    public void T() {
        ((ul3) ((ContactListWidget) this.b).B0.getValue()).f(false);
    }

    public void W(long j, boolean z) {
        Object obj = this.b;
        switch (this.a) {
            case 2:
                k77[] k77Arr = ChatNotificationsSettingsScreen.Y;
                ((lj2) ((ChatNotificationsSettingsScreen) obj).b.getValue()).s(j);
                return;
            case 8:
                k77[] k77Arr2 = DialogNotificationsSettingsScreen.Y;
                ((ng4) ((DialogNotificationsSettingsScreen) obj).b.getValue()).r(j);
                return;
            case LangUtils.HASH_SEED /*17*/:
                k77[] k77Arr3 = MessagesSettingsScreen.Y;
                o29 o29 = (o29) ((MessagesSettingsScreen) obj).c.getValue();
                if (j == Long.MAX_VALUE) {
                    ((kp) o29.b).i("app.messages.send.by.enter", z);
                    return;
                } else {
                    o29.getClass();
                    return;
                }
            case 18:
                k77[] k77Arr4 = NotificationsSettingsScreen.z0;
                ((NotificationsSettingsScreen) obj).l0().s(j);
                return;
            default:
                k77[] k77Arr5 = OtherNotificationsSettingsScreen.Y;
                ((uga) ((OtherNotificationsSettingsScreen) obj).b.getValue()).r(j);
                return;
        }
    }

    public void a(Object obj) {
        switch (this.a) {
            case 4:
                ((g73) this.b).b();
                return;
            default:
                ((wx7) ((bx7) this.b).b).a(obj);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, l10] */
    public Object apply(Object obj) {
        l10 l10;
        switch (this.a) {
            case 0:
                return new y63(2, new uh((kb1) obj, 3, (String) this.b));
            case 7:
                xs8 a2 = ((ys8) ((l7c) this.b).a).a();
                String str = ((z2f) obj).d;
                a2.c = lp.x(str);
                a2.b = str;
                return a2.a();
            case 9:
                nm4 nm4 = (nm4) obj;
                fm4 fm4 = (fm4) this.b;
                yl4 yl4 = fm4.a;
                zl4 zl4 = new zl4(yl4.a, yl4.b);
                f3f f3f = fm4.e;
                if (f3f == null) {
                    l10 = null;
                } else {
                    ? obj2 = new Object();
                    obj2.c = f3f.c;
                    obj2.b = f3f.b;
                    obj2.a = f3f.a;
                    obj2.d = f3f.d;
                    l10 = obj2;
                }
                return new y63(2, new uh(nm4, 5, new hm4(zl4, fm4.b, fm4.c, fm4.d, l10)));
            case 10:
                yl4 yl42 = (yl4) this.b;
                return new y63(2, new lm4((Object) (nm4) obj, yl42.a, yl42.b, 0));
            case 11:
                Object[] objArr = (Object[]) obj;
                if (objArr.length == 2) {
                    return ((mk0) this.b).apply(objArr[0], objArr[1]);
                }
                throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                Object[] objArr2 = (Object[]) obj;
                if (objArr2.length == 3) {
                    return ((l26) this.b).apply(objArr2[0], objArr2[1], objArr2[2]);
                }
                throw new IllegalArgumentException("Array of size 3 expected but got " + objArr2.length);
            case 13:
                return ((Class) this.b).cast(obj);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                List list = (List) obj;
                Collections.sort(list, (Comparator) this.b);
                return list;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                List<f2c> list2 = (List) obj;
                ArrayList arrayList = new ArrayList();
                for (f2c f2c : list2) {
                    Long l = null;
                    utd utd = f2c instanceof utd ? (utd) f2c : null;
                    if (utd != null) {
                        l = Long.valueOf(utd.c);
                    }
                    if (l != null) {
                        arrayList.add(l);
                    }
                }
                if (arrayList.isEmpty()) {
                    return c73.a;
                }
                v2c v2c = (v2c) this.b;
                return new w63(v2c.b().c(list2), 0, new y63(1, new s2c(v2c, arrayList, 1)));
            case 21:
                Object apply = ((j26) ((o73) this.b).c).apply(new Object[]{obj});
                Objects.requireNonNull(apply, "The zipper returned a null value");
                return apply;
            case 22:
                return kd8.l((kd8) this.b, (dh2) obj, "@");
            case 23:
                Boolean bool = (Boolean) obj;
                return ((mtf) this.b).h();
            case 24:
                ((Number) obj).longValue();
                pf8 pf8 = (pf8) this.b;
                pf8.getClass();
                return new mv9(1, new sic(11, pf8)).m(de.a());
            default:
                return ((d4b) this.b).o((yrd) obj);
        }
    }

    public void b() {
        switch (this.a) {
            case 5:
                kuf kuf = (kuf) this.b;
                ((n83) kuf.c).f();
                ((g73) kuf.o).b();
                return;
            default:
                ((wx7) ((bx7) this.b).b).b();
                return;
        }
    }

    public boolean c() {
        switch (this.a) {
            case 1:
                return false;
            default:
                k77[] k77Arr = MessagesListWidget.b1;
                return ((tw8) ((MessagesListWidget) this.b).t0().s1.getValue()).c;
        }
    }

    public void d(xi4 xi4) {
        switch (this.a) {
            case 4:
                ((g73) this.b).d(xi4);
                return;
            case 5:
                ((n83) ((kuf) this.b).c).a(xi4);
                return;
            default:
                bj4.e((bx7) this.b, xi4);
                return;
        }
    }

    public void f() {
        k77[] k77Arr = ContactListWidget.S0;
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        contactListWidget.getClass();
        k77 k77 = ContactListWidget.S0[6];
        Boolean bool = Boolean.TRUE;
        contactListWidget.O0.b(contactListWidget, bool);
        ((xf0) contactListWidget.D0.getValue()).Y.m((Object) null, bool);
        xg9.g((xg9) contactListWidget.b.getValue(), mnc.CONTACTS_SEARCH);
    }

    public void h(long j) {
        Object obj = this.b;
        switch (this.a) {
            case 2:
                k77[] k77Arr = ChatNotificationsSettingsScreen.Y;
                ((lj2) ((ChatNotificationsSettingsScreen) obj).b.getValue()).s(j);
                return;
            case 8:
                k77[] k77Arr2 = DialogNotificationsSettingsScreen.Y;
                ((ng4) ((DialogNotificationsSettingsScreen) obj).b.getValue()).r(j);
                return;
            case LangUtils.HASH_SEED /*17*/:
                k77[] k77Arr3 = MessagesSettingsScreen.Y;
                o29 o29 = (o29) ((MessagesSettingsScreen) obj).c.getValue();
                if (j == Long.MAX_VALUE) {
                    kp kpVar = (kp) o29.b;
                    kpVar.i("app.messages.send.by.enter", !kpVar.g.getBoolean("app.messages.send.by.enter", false));
                    o29.q();
                    return;
                }
                o29.getClass();
                if (j == 9223372036854775806L) {
                    l29.c.getClass();
                    taf.o(o29.X, new a34(":stickers/settings"));
                    return;
                }
                return;
            case 18:
                k77[] k77Arr4 = NotificationsSettingsScreen.z0;
                ((NotificationsSettingsScreen) obj).l0().s(j);
                return;
            default:
                k77[] k77Arr5 = OtherNotificationsSettingsScreen.Y;
                ((uga) ((OtherNotificationsSettingsScreen) obj).b.getValue()).r(j);
                return;
        }
    }

    public void i() {
        switch (this.a) {
            case 1:
                return;
            default:
                k77[] k77Arr = MessagesListWidget.b1;
                ((fw) ((MessagesListWidget) this.b).t0().o).y();
                return;
        }
    }

    public void l() {
        gf2 gf2;
        vc2 x;
        switch (this.a) {
            case 1:
                if ((!((le2) ((gf2) this.b).S0.getValue()).a.isEmpty()) && (x = gf2.x()) != null && x.x0.b <= 0) {
                    i22 v = (gf2 = (gf2) this.b).v();
                    xm8 xm8 = v != null ? v.c : null;
                    Long valueOf = xm8 != null ? Long.valueOf(xm8.k()) : null;
                    if (valueOf != null) {
                        long longValue = valueOf.longValue();
                        udd.p(x.a, "loadPrev: time = %d, loadPrevOperation = %s", new Object[]{Long.valueOf(longValue), x.x0});
                        synchronized (x.x0) {
                            try {
                                synchronized (x.x0) {
                                }
                                if (x.x0.b == longValue) {
                                    udd.R(x.a, (IOException) null, "loadPrev: duplicate invocation", Arrays.copyOf(new Object[0], 0));
                                    return;
                                }
                                x.y0.a();
                                x.x0.a();
                                x.w0.a();
                                x.x0.b = longValue;
                                iu iuVar = x.x0;
                                w63 w63 = new w63(new y63(0, new gu(new du(x, longValue, 0))).k(x.c).h(x.o), 1, new eu(x, 0));
                                pn1 pn1 = new pn1(new eu(x, 1), 0, new fu(x, 0));
                                w63.i(pn1);
                                iuVar.o = pn1;
                                return;
                            } catch (Throwable th) {
                                while (true) {
                                    throw th;
                                    break;
                                }
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                k77[] k77Arr = MessagesListWidget.b1;
                ((fw) ((MessagesListWidget) this.b).t0().o).w();
                return;
        }
    }

    public boolean m() {
        Object obj = this.b;
        switch (this.a) {
            case 1:
                return ((le2) ((gf2) obj).S0.getValue()).c;
            default:
                k77[] k77Arr = MessagesListWidget.b1;
                return ((tw8) ((MessagesListWidget) obj).t0().s1.getValue()).b;
        }
    }

    public void n() {
        k77[] k77Arr = ContactListWidget.S0;
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        ql3 ql3 = contactListWidget.o0().b;
        ql3.getClass();
        ((ul3) contactListWidget.B0.getValue()).f(ql3 == ql3.a);
    }

    public void onError(Throwable th) {
        switch (this.a) {
            case 4:
                ((g73) this.b).onError(th);
                return;
            case 5:
                kuf kuf = (kuf) this.b;
                ((n83) kuf.c).f();
                ((g73) kuf.o).onError(th);
                return;
            default:
                ((wx7) ((bx7) this.b).b).onError(th);
                return;
        }
    }

    public void p() {
        k77[] k77Arr = ContactListWidget.S0;
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        contactListWidget.getClass();
        k77[] k77Arr2 = ContactListWidget.S0;
        k77 k77 = k77Arr2[6];
        contactListWidget.O0.b(contactListWidget, Boolean.FALSE);
        Boolean bool = (Boolean) contactListWidget.C0.getValue();
        bool.booleanValue();
        ((xf0) contactListWidget.D0.getValue()).Y.m((Object) null, bool);
        k77 k772 = k77Arr2[5];
        contactListWidget.N0.b(contactListWidget, (Object) null);
        contactListWidget.o0().C0.b();
        xg9.g((xg9) contactListWidget.b.getValue(), mnc.CONTACTS_TAB);
    }

    public void v(long j) {
        ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) this.b;
        bm3.p(chatsListSearchScreen);
        k77[] k77Arr = ChatsListSearchScreen.N0;
        chatsListSearchScreen.m0().u(j);
    }
}
