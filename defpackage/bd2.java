package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.chat.FrgChatMediaLoader;

/* renamed from: bd2  reason: default package */
public final class bd2 {
    public final long a;
    public final long b;
    public final boolean c;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Set f;
    public final Set g;
    public final qmc h;
    public final qmc i;
    public final qmc j;
    public boolean k;
    public boolean l;
    public long m;
    public long n;
    public final Set o = Collections.newSetFromMap(new WeakHashMap());
    public final tt0 p;
    public final t52 q;
    public final to8 r;
    public final hb2 s;
    public final n1b t;
    public final rp8 u;

    public bd2(long j2, Long l2, boolean z, HashSet hashSet, tt0 tt0, t52 t52, to8 to8, hb2 hb2, n1b n1b, rp8 rp8, qmc qmc, qmc qmc2, qmc qmc3) {
        this.p = tt0;
        this.q = t52;
        this.r = to8;
        this.s = hb2;
        this.t = n1b;
        this.u = rp8;
        this.a = j2;
        this.c = z;
        this.b = l2.longValue();
        this.f = hashSet;
        this.g = d(hashSet);
        this.h = qmc;
        this.i = qmc2;
        this.j = qmc3;
        udd.q("bd2", "newInstance: chatId = " + j2 + ", initialMessageId = " + l2);
    }

    public static Set d(Set set) {
        return kg8.a.equals(set) ? e00.G0 : kg8.b.equals(set) ? e00.J0 : kg8.c.equals(set) ? e00.K0 : kg8.d.equals(set) ? e00.H0 : kg8.g.equals(set) ? e00.L0 : kg8.f.equals(set) ? e00.I0 : kg8.h.equals(set) ? e00.M0 : Collections.emptySet();
    }

    public final ArrayList a(List list, boolean z) {
        HashSet hashSet;
        udd.q("bd2", "addMessages count = " + list.size());
        if (!this.c) {
            Collections.reverse(list);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashSet = this.e;
            if (!hasNext) {
                break;
            }
            xm8 xm8 = (xm8) it.next();
            if (!xm8.a.r() && !hashSet.contains(Long.valueOf(xm8.a.b))) {
                arrayList.add(xm8);
            }
        }
        udd.q("bd2", "addMessages count after checkExists = " + arrayList.size());
        if (arrayList.size() > 0) {
            ArrayList arrayList2 = this.d;
            if (z) {
                arrayList2.addAll(arrayList);
            } else {
                arrayList2.addAll(0, arrayList);
            }
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    arrayList3.add(Long.valueOf(((xm8) it2.next()).a.b));
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            hashSet.addAll(arrayList3);
        }
        return arrayList;
    }

    public final void b(boolean z) {
        new mv9(1, new xc2(this, z)).m(this.j).i(this.h).k(new pn1(new xc2(this, z), 2, z3d.k));
    }

    public final void c() {
        Set<ad2> set = this.o;
        if (set != null) {
            for (ad2 ad2 : set) {
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final yc2 e(boolean z) {
        h62 h62;
        pec pec;
        String str;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        String str2;
        int i5;
        String str3;
        int i6;
        int i7;
        int i8;
        byte[] bArr;
        Long l2;
        int i9;
        Boolean bool;
        long j2 = this.a;
        t52 t52 = this.q;
        i22 B = t52.B(j2);
        if (B == null) {
            return new yc2(Collections.emptyList(), false, false, 0, 100, 0);
        }
        o62 o62 = B.b;
        Set set = this.g;
        b62 H = t52.H(o62, set);
        boolean K = t52.K(o62, set);
        hb2 hb2 = this.s;
        if (K && H.a != null) {
            hb2.getClass();
            h62 h622 = H.a;
            long j3 = h622.a;
            cw8 d2 = ((hz3) hb2.c.a).c.d();
            d2.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND media_type in (");
            Set<Integer> set2 = this.f;
            int size = set2.size();
            a06.e(sb, size);
            sb.append(") AND inserted_from_msg_link = 0 AND status <> ");
            sb.append("?");
            int i10 = size + 4;
            pec a2 = pec.a(i10, sb.toString());
            a2.j(1, j2);
            a2.j(2, j3);
            a2.j(3, h622.b);
            int i11 = 4;
            for (Integer num : set2) {
                if (num == null) {
                    a2.W(i11);
                } else {
                    a2.j(i11, (long) num.intValue());
                }
                i11++;
            }
            d2.a().getClass();
            a2.j(i10, (long) 10);
            aec aec = d2.a;
            aec.b();
            Cursor o2 = aec.o(a2, (CancellationSignal) null);
            try {
                long j4 = o2.moveToFirst() ? o2.getLong(0) : 0;
                o2.close();
                a2.m();
                if (j4 == 0) {
                    udd.q("hb2", "clearMediaChunkIfEmpty: empty chunk removed");
                    t52 t522 = hb2.b;
                    t522.getClass();
                    t522.h(j2, false, new xz((Object) t522, (Object) set, (Object) null, 3));
                    i22 B2 = t52.B(j2);
                    if (B2 == null) {
                        return null;
                    }
                    H = t52.H(B2.b, set);
                    B = B2;
                }
            } catch (Throwable th) {
                o2.close();
                a2.m();
                throw th;
            }
        }
        if (!t52.K(B.b, set) || (h62 = H.a) == null) {
            udd.q("bd2", "obsLoadNetwork: requestMediaBackward from last");
            this.n = hb2.a(B, (vo8) null, false, set);
            return new yc2(Collections.emptyList(), false, true, 0, 100, 0);
        }
        to8 to8 = this.r;
        if (z) {
            long j5 = H.c;
            if (j5 > 0) {
                vo8 q2 = to8.q(j5);
                if (q2 != null && oyb.I(q2.o, h62)) {
                    return new yc2(Collections.emptyList(), false, false, 0, 100, 0);
                }
                vo8 r2 = to8.r(j2, h62.a);
                udd.p("bd2", "obsLoadNetwork: requestMediaBackward from after chunk start %s, message=%s", new Object[]{oyb.N(h62), r2});
                this.n = hb2.a(B, r2, false, set);
                return new yc2(Collections.emptyList(), false, true, 0, 100, 0);
            }
            vo8 r3 = to8.r(j2, h62.a);
            udd.p("bd2", "obsLoadNetwork: requestMediaBackward from after chunk start %s, message=%s", new Object[]{oyb.N(h62), r3});
            this.n = hb2.a(B, r3, false, set);
            return new yc2(Collections.emptyList(), false, true, 0, 100, 0);
        }
        vo8 o3 = to8.o(j2);
        if (o3 != null && oyb.I(o3.o, h62)) {
            return new yc2(Collections.emptyList(), true, false, 100, 0, 0);
        }
        long j6 = h62.b;
        nec nec = ((hz3) to8.a).c;
        cw8 d3 = nec.d();
        d3.getClass();
        pec a3 = pec.a(4, "SELECT * FROM messages WHERE chat_id = ? AND time <= ? AND inserted_from_msg_link = 0 AND status <> ? ORDER BY time DESC LIMIT ?");
        a3.j(1, j2);
        us8.n(a3, 2, j6, d3);
        a3.j(3, (long) 10);
        a3.j(4, (long) 1);
        aec aec2 = d3.a;
        aec2.b();
        Cursor o4 = aec2.o(a3, (CancellationSignal) null);
        try {
            int o5 = gp0.o(o4, ApiProtocol.KEY_ID);
            int o6 = gp0.o(o4, "server_id");
            int o7 = gp0.o(o4, "time");
            int o8 = gp0.o(o4, "update_time");
            int o9 = gp0.o(o4, "sender");
            int o10 = gp0.o(o4, "cid");
            int o11 = gp0.o(o4, "text");
            i22 i22 = B;
            int o12 = gp0.o(o4, "delivery_status");
            Set set3 = set;
            int o13 = gp0.o(o4, "status");
            hb2 hb22 = hb2;
            int o14 = gp0.o(o4, "time_local");
            String str4 = "bd2";
            int o15 = gp0.o(o4, "error");
            h62 h623 = h62;
            int o16 = gp0.o(o4, "localized_error");
            nec nec2 = nec;
            int o17 = gp0.o(o4, "attaches");
            pec = a3;
            try {
                int o18 = gp0.o(o4, "media_type");
                int o19 = gp0.o(o4, "detect_share");
                int o20 = gp0.o(o4, "msg_link_type");
                int o21 = gp0.o(o4, "msg_link_id");
                int o22 = gp0.o(o4, "inserted_from_msg_link");
                int o23 = gp0.o(o4, "msg_link_chat_id");
                int o24 = gp0.o(o4, "msg_link_chat_name");
                int o25 = gp0.o(o4, "msg_link_chat_link");
                int o26 = gp0.o(o4, "msg_link_out_chat_id");
                int o27 = gp0.o(o4, "msg_link_out_msg_id");
                int o28 = gp0.o(o4, "type");
                int o29 = gp0.o(o4, "chat_id");
                int o30 = gp0.o(o4, "ttl");
                int o31 = gp0.o(o4, "channel_views");
                int o32 = gp0.o(o4, "channel_forwards");
                int o33 = gp0.o(o4, "view_time");
                int o34 = gp0.o(o4, "zoom");
                int o35 = gp0.o(o4, "options");
                int o36 = gp0.o(o4, "live_until");
                int o37 = gp0.o(o4, "elements");
                int o38 = gp0.o(o4, "reactions");
                int o39 = gp0.o(o4, "delayed_attrs_time_to_fire");
                int o40 = gp0.o(o4, "delayed_attrs_notify_sender");
                int i12 = o17;
                ArrayList arrayList = new ArrayList(o4.getCount());
                while (o4.moveToNext()) {
                    long j7 = o4.getLong(o5);
                    long j8 = o4.getLong(o6);
                    long j9 = o4.getLong(o7);
                    long j10 = o4.getLong(o8);
                    long j11 = o4.getLong(o9);
                    long j12 = o4.getLong(o10);
                    String string = o4.isNull(o11) ? null : o4.getString(o11);
                    int i13 = o4.getInt(o12);
                    d3.a().getClass();
                    bp8.b.getClass();
                    bp8 t2 = s59.t(i13);
                    int i14 = o4.getInt(o13);
                    d3.a().getClass();
                    ls8 b2 = p29.b(i14);
                    long j13 = o4.getLong(o14);
                    String string2 = o4.isNull(o15) ? null : o4.getString(o15);
                    if (o4.isNull(o16)) {
                        i2 = i12;
                        str = null;
                    } else {
                        str = o4.getString(o16);
                        i2 = i12;
                    }
                    byte[] blob = o4.isNull(i2) ? null : o4.getBlob(i2);
                    d3.a().getClass();
                    jj7 b3 = fu7.b(blob);
                    int i15 = o11;
                    int i16 = o18;
                    int i17 = o4.getInt(i16);
                    o18 = i16;
                    int i18 = o19;
                    if (o4.getInt(i18) != 0) {
                        o19 = i18;
                        i3 = o20;
                        z2 = true;
                    } else {
                        o19 = i18;
                        i3 = o20;
                        z2 = false;
                    }
                    int i19 = o4.getInt(i3);
                    o20 = i3;
                    int i20 = o21;
                    long j14 = o4.getLong(i20);
                    o21 = i20;
                    int i21 = o22;
                    if (o4.getInt(i21) != 0) {
                        o22 = i21;
                        i4 = o23;
                        z3 = true;
                    } else {
                        o22 = i21;
                        i4 = o23;
                        z3 = false;
                    }
                    long j15 = o4.getLong(i4);
                    o23 = i4;
                    int i23 = o24;
                    if (o4.isNull(i23)) {
                        o24 = i23;
                        i5 = o25;
                        str2 = null;
                    } else {
                        str2 = o4.getString(i23);
                        o24 = i23;
                        i5 = o25;
                    }
                    if (o4.isNull(i5)) {
                        o25 = i5;
                        i6 = o26;
                        str3 = null;
                    } else {
                        str3 = o4.getString(i5);
                        o25 = i5;
                        i6 = o26;
                    }
                    long j16 = o4.getLong(i6);
                    o26 = i6;
                    int i24 = o27;
                    long j17 = o4.getLong(i24);
                    o27 = i24;
                    int i25 = o28;
                    int i26 = o4.getInt(i25);
                    d3.a().getClass();
                    int a4 = us8.a(i26);
                    o28 = i25;
                    int i27 = o29;
                    long j18 = o4.getLong(i27);
                    o29 = i27;
                    int i28 = o30;
                    int i29 = o4.getInt(i28);
                    o30 = i28;
                    int i30 = o31;
                    int i31 = o4.getInt(i30);
                    o31 = i30;
                    int i32 = o32;
                    int i33 = o4.getInt(i32);
                    o32 = i32;
                    int i34 = o33;
                    long j19 = o4.getLong(i34);
                    o33 = i34;
                    int i35 = o34;
                    int i36 = o4.getInt(i35);
                    o34 = i35;
                    int i37 = o35;
                    int i38 = o4.getInt(i37);
                    o35 = i37;
                    int i39 = o36;
                    long j20 = o4.getLong(i39);
                    o36 = i39;
                    int i40 = o37;
                    byte[] blob2 = o4.isNull(i40) ? null : o4.getBlob(i40);
                    d3.a().getClass();
                    List a5 = p29.a(blob2);
                    o37 = i40;
                    int i41 = o38;
                    if (o4.isNull(i41)) {
                        i7 = i41;
                        i8 = o16;
                        bArr = null;
                    } else {
                        i7 = i41;
                        bArr = o4.getBlob(i41);
                        i8 = o16;
                    }
                    yr8 c2 = d3.a().c(bArr);
                    int i42 = o39;
                    if (o4.isNull(i42)) {
                        i9 = o40;
                        l2 = null;
                    } else {
                        l2 = Long.valueOf(o4.getLong(i42));
                        i9 = o40;
                    }
                    Integer valueOf = o4.isNull(i9) ? null : Integer.valueOf(o4.getInt(i9));
                    if (valueOf == null) {
                        o39 = i42;
                        bool = null;
                    } else {
                        bool = Boolean.valueOf(valueOf.intValue() != 0);
                        o39 = i42;
                    }
                    arrayList.add(new jp8(j7, j8, j9, j10, j11, j12, string, t2, b2, j13, string2, str, b3, i17, z2, i19, j14, z3, j15, str2, str3, j16, j17, a4, j18, i29, i31, i33, j19, i36, i38, j20, a5, c2, l2, bool));
                    o40 = i9;
                    o16 = i8;
                    o11 = i15;
                    o38 = i7;
                    i12 = i2;
                }
                o4.close();
                pec.m();
                jp8 jp8 = (jp8) o23.X(arrayList);
                vo8 b4 = jp8 != null ? nec2.b(jp8) : null;
                udd.p(str4, "obsLoadNetwork: requestMediaForward from before chunk end %s, message=%s", new Object[]{oyb.N(h623), b4});
                this.m = hb22.a(i22, b4, true, set3);
                return new yc2(Collections.emptyList(), true, true, 100, 0, 0);
            } catch (Throwable th2) {
                th = th2;
                o4.close();
                pec.m();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            pec = a3;
            o4.close();
            pec.m();
            throw th;
        }
    }

    public final void f(yc2 yc2) {
        udd.p("bd2", "onLoadNetwork, result = %s", new Object[]{yc2});
        boolean isEmpty = yc2.a.isEmpty();
        boolean z = yc2.b;
        if (!isEmpty) {
            boolean z2 = this.c;
            boolean z3 = (z && !z2) || (!z && z2);
            ArrayList a2 = a(yc2.a, z3);
            Set<ad2> set = this.o;
            if (set != null) {
                if (z3) {
                    for (ad2 ad2 : set) {
                        if (ad2 != null) {
                            ActAttachesView actAttachesView = (ActAttachesView) ad2;
                            udd.q("ru.ok.messages.media.attaches.ActAttachesView", "onLoadNextPage, count = " + a2.size());
                            if (actAttachesView.j1.getVisibility() == 0 && actAttachesView.a1 != null) {
                                actAttachesView.a1.j(FrgChatMediaLoader.s1(a2, ActAttachesView.D1), true);
                                actAttachesView.a1.d();
                                actAttachesView.q0();
                            }
                        }
                    }
                } else {
                    for (ad2 ad22 : set) {
                        if (ad22 != null) {
                            ActAttachesView actAttachesView2 = (ActAttachesView) ad22;
                            udd.q("ru.ok.messages.media.attaches.ActAttachesView", "onLoadPrevPage, count = " + a2.size());
                            if (actAttachesView2.j1.getVisibility() == 0 && actAttachesView2.a1 != null) {
                                actAttachesView2.a1.j(FrgChatMediaLoader.s1(a2, ActAttachesView.D1), false);
                                actAttachesView2.a1.d();
                                actAttachesView2.q0();
                            }
                        }
                    }
                }
            }
        }
        this.l = yc2.c;
        c();
        if (!this.l) {
            int i2 = yc2.d;
            if (z) {
                if (i2 >= yc2.e) {
                    f(e(false));
                    return;
                }
                c();
                f(e(true));
            } else if (i2 >= yc2.f) {
                c();
                f(e(true));
            } else {
                c();
            }
        }
    }

    @a1e
    public void onEvent(ove ove) {
        if (ove.b == this.a) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                long j2 = ((xm8) it.next()).a.b;
                long j3 = ove.c;
                if (j2 == j3) {
                    udd.q("bd2", "onEvent: UpdateMessageEvent id = " + j3);
                    new mv9(1, new sq1(this, j3, 1)).m(this.i).i(this.h).k(new pn1(new zx1(8, this), 2, z3d.k));
                    return;
                }
            }
        }
    }

    @a1e
    public void onEvent(hc2 hc2) {
        hc2 hc22 = hc2;
        int i2 = (hc22.a > this.m ? 1 : (hc22.a == this.m ? 0 : -1));
        lu7 lu7 = z3d.k;
        qmc qmc = this.h;
        qmc qmc2 = this.i;
        long j2 = hc22.b;
        if (i2 == 0) {
            udd.q("bd2", "onEvent, loadNextPageRequestId");
            this.m = 0;
            new mv9(1, new qh0(this, j2, false)).m(qmc2).i(qmc).k(new pn1(new wc2(this, hc22, 0), 2, lu7));
        }
        if (hc22.a == this.n) {
            udd.q("bd2", "onEvent, loadPrevPageRequestId");
            this.n = 0;
            new mv9(1, new qh0(this, j2, true)).m(qmc2).i(qmc).k(new pn1(new wc2(this, hc22, 1), 2, lu7));
        }
    }

    @a1e
    public void onEvent(jh0 jh0) {
        if (jh0.a == this.m) {
            udd.n("bd2", "onEvent: chat media error in loading next page");
            this.m = 0;
            b(true);
        }
        if (jh0.a == this.n) {
            udd.n("bd2", "onEvent: chat media error in loading prev page");
            this.n = 0;
            b(true);
        }
    }

    @a1e
    public void onEvent(to7 to7) {
        udd.n("bd2", "onEvent: LoginEvent");
        b(true);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.content.Context, ru.ok.messages.media.attaches.ActAttachesView] */
    @a1e
    public void onEvent(nl4 nl4) {
        for (ad2 ad2 : this.o) {
            if (ad2 != null) {
                ? r0 = (ActAttachesView) ad2;
                udd.t("ru.ok.messages.media.attaches.ActAttachesView", "onDownloadError: messageId=$d", new Object[]{Long.valueOf(nl4.c)});
                int i2 = cic.D;
                Handler handler = a06.h;
                a06.H(0, r0, r0.getString(i2));
            }
        }
    }
}
