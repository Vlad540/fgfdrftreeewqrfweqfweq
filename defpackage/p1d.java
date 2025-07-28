package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: p1d  reason: default package */
public final class p1d extends c0d {
    public final /* synthetic */ int b = 0;
    public final long c;
    public final Object o;

    public p1d(long j) {
        this.c = j;
        this.o = p1d.class.getName();
    }

    public final void x() {
        String str;
        long j;
        String str2;
        pec pec;
        String str3;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        String str4;
        int i4;
        String str5;
        int i5;
        int i6;
        int i7;
        byte[] bArr;
        Long l;
        int i8;
        Boolean bool;
        long j2 = 0;
        long j3 = this.c;
        switch (this.b) {
            case 0:
                ArrayList<vo8> arrayList = hw4.a;
                i22 B = d().B(j3);
                String str6 = (String) this.o;
                if (B != null) {
                    o62 o62 = B.b;
                    if (!o62.e.isEmpty()) {
                        for (Map.Entry entry : o62.e.entrySet()) {
                            long longValue = ((Number) entry.getKey()).longValue();
                            long longValue2 = ((Number) entry.getValue()).longValue();
                            if (longValue != ((j2b) p()).a.s() && longValue2 > j2) {
                                j2 = longValue2;
                            }
                        }
                    } else {
                        xm8 xm8 = B.c;
                        if (xm8 != null) {
                            j2 = xm8.a.o;
                        }
                    }
                    to8 o2 = o();
                    nec nec = ((hz3) o2.a).c;
                    long s = ((j2b) o2.c).a.s();
                    cw8 d = nec.d();
                    s59 s59 = bp8.b;
                    d.getClass();
                    pec a = pec.a(5, "SELECT * FROM messages WHERE chat_id = ? AND sender = ? AND time <= ? AND delivery_status = ? AND inserted_from_msg_link = 0 AND status <> ?");
                    a.j(1, j3);
                    a.j(2, s);
                    us8.n(a, 3, j2, d);
                    us8.n(a, 4, (long) 20, d);
                    a.j(5, (long) 10);
                    aec aec = d.a;
                    aec.b();
                    Cursor o3 = aec.o(a, (CancellationSignal) null);
                    try {
                        int o4 = gp0.o(o3, ApiProtocol.KEY_ID);
                        int o5 = gp0.o(o3, "server_id");
                        int o6 = gp0.o(o3, "time");
                        int o7 = gp0.o(o3, "update_time");
                        int o8 = gp0.o(o3, "sender");
                        int o9 = gp0.o(o3, "cid");
                        int o10 = gp0.o(o3, "text");
                        String str7 = str6;
                        int o11 = gp0.o(o3, "delivery_status");
                        String str8 = " to update = ";
                        int o12 = gp0.o(o3, "status");
                        long j4 = j3;
                        int o13 = gp0.o(o3, "time_local");
                        int o14 = gp0.o(o3, "error");
                        String str9 = "messages for chat ";
                        int o15 = gp0.o(o3, "localized_error");
                        nec nec2 = nec;
                        int o16 = gp0.o(o3, "attaches");
                        pec = a;
                        try {
                            int o17 = gp0.o(o3, "media_type");
                            int o18 = gp0.o(o3, "detect_share");
                            int o19 = gp0.o(o3, "msg_link_type");
                            int o20 = gp0.o(o3, "msg_link_id");
                            int o21 = gp0.o(o3, "inserted_from_msg_link");
                            int o22 = gp0.o(o3, "msg_link_chat_id");
                            int o23 = gp0.o(o3, "msg_link_chat_name");
                            int o24 = gp0.o(o3, "msg_link_chat_link");
                            int o25 = gp0.o(o3, "msg_link_out_chat_id");
                            int o26 = gp0.o(o3, "msg_link_out_msg_id");
                            int o27 = gp0.o(o3, "type");
                            int o28 = gp0.o(o3, "chat_id");
                            int o29 = gp0.o(o3, "ttl");
                            int o30 = gp0.o(o3, "channel_views");
                            int o31 = gp0.o(o3, "channel_forwards");
                            int o32 = gp0.o(o3, "view_time");
                            int o33 = gp0.o(o3, "zoom");
                            int o34 = gp0.o(o3, "options");
                            int o35 = gp0.o(o3, "live_until");
                            int o36 = gp0.o(o3, "elements");
                            int o37 = gp0.o(o3, "reactions");
                            int o38 = gp0.o(o3, "delayed_attrs_time_to_fire");
                            int o39 = gp0.o(o3, "delayed_attrs_notify_sender");
                            int i9 = o16;
                            ArrayList arrayList2 = new ArrayList(o3.getCount());
                            while (o3.moveToNext()) {
                                long j5 = o3.getLong(o4);
                                long j6 = o3.getLong(o5);
                                long j7 = o3.getLong(o6);
                                long j8 = o3.getLong(o7);
                                long j9 = o3.getLong(o8);
                                long j10 = o3.getLong(o9);
                                String string = o3.isNull(o10) ? null : o3.getString(o10);
                                int i10 = o3.getInt(o11);
                                d.a().getClass();
                                bp8.b.getClass();
                                bp8 t = s59.t(i10);
                                int i11 = o3.getInt(o12);
                                d.a().getClass();
                                ls8 b2 = p29.b(i11);
                                long j11 = o3.getLong(o13);
                                String string2 = o3.isNull(o14) ? null : o3.getString(o14);
                                if (o3.isNull(o15)) {
                                    i = i9;
                                    str3 = null;
                                } else {
                                    str3 = o3.getString(o15);
                                    i = i9;
                                }
                                byte[] blob = o3.isNull(i) ? null : o3.getBlob(i);
                                d.a().getClass();
                                jj7 b3 = fu7.b(blob);
                                int i12 = o10;
                                int i13 = o17;
                                int i14 = o3.getInt(i13);
                                o17 = i13;
                                int i15 = o18;
                                if (o3.getInt(i15) != 0) {
                                    o18 = i15;
                                    i2 = o19;
                                    z = true;
                                } else {
                                    o18 = i15;
                                    i2 = o19;
                                    z = false;
                                }
                                int i16 = o3.getInt(i2);
                                o19 = i2;
                                int i17 = o20;
                                long j12 = o3.getLong(i17);
                                o20 = i17;
                                int i18 = o21;
                                if (o3.getInt(i18) != 0) {
                                    o21 = i18;
                                    i3 = o22;
                                    z2 = true;
                                } else {
                                    o21 = i18;
                                    i3 = o22;
                                    z2 = false;
                                }
                                long j13 = o3.getLong(i3);
                                o22 = i3;
                                int i19 = o23;
                                if (o3.isNull(i19)) {
                                    o23 = i19;
                                    i4 = o24;
                                    str4 = null;
                                } else {
                                    str4 = o3.getString(i19);
                                    o23 = i19;
                                    i4 = o24;
                                }
                                if (o3.isNull(i4)) {
                                    o24 = i4;
                                    i5 = o25;
                                    str5 = null;
                                } else {
                                    str5 = o3.getString(i4);
                                    o24 = i4;
                                    i5 = o25;
                                }
                                long j14 = o3.getLong(i5);
                                o25 = i5;
                                int i20 = o26;
                                long j15 = o3.getLong(i20);
                                o26 = i20;
                                int i21 = o27;
                                int i22 = o3.getInt(i21);
                                d.a().getClass();
                                int a2 = us8.a(i22);
                                o27 = i21;
                                int i23 = o28;
                                long j16 = o3.getLong(i23);
                                o28 = i23;
                                int i24 = o29;
                                int i25 = o3.getInt(i24);
                                o29 = i24;
                                int i26 = o30;
                                int i27 = o3.getInt(i26);
                                o30 = i26;
                                int i28 = o31;
                                int i29 = o3.getInt(i28);
                                o31 = i28;
                                int i30 = o32;
                                long j17 = o3.getLong(i30);
                                o32 = i30;
                                int i31 = o33;
                                int i32 = o3.getInt(i31);
                                o33 = i31;
                                int i33 = o34;
                                int i34 = o3.getInt(i33);
                                o34 = i33;
                                int i35 = o35;
                                long j18 = o3.getLong(i35);
                                o35 = i35;
                                int i36 = o36;
                                byte[] blob2 = o3.isNull(i36) ? null : o3.getBlob(i36);
                                d.a().getClass();
                                List a3 = p29.a(blob2);
                                o36 = i36;
                                int i37 = o37;
                                if (o3.isNull(i37)) {
                                    i6 = i37;
                                    i7 = o9;
                                    bArr = null;
                                } else {
                                    i6 = i37;
                                    bArr = o3.getBlob(i37);
                                    i7 = o9;
                                }
                                yr8 c2 = d.a().c(bArr);
                                int i38 = o38;
                                if (o3.isNull(i38)) {
                                    i8 = o39;
                                    l = null;
                                } else {
                                    l = Long.valueOf(o3.getLong(i38));
                                    i8 = o39;
                                }
                                Integer valueOf = o3.isNull(i8) ? null : Integer.valueOf(o3.getInt(i8));
                                if (valueOf == null) {
                                    o38 = i38;
                                    bool = null;
                                } else {
                                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                                    o38 = i38;
                                }
                                arrayList2.add(new jp8(j5, j6, j7, j8, j9, j10, string, t, b2, j11, string2, str3, b3, i14, z, i16, j12, z2, j13, str4, str5, j14, j15, a2, j16, i25, i27, i29, j17, i32, i34, j18, a3, c2, l, bool));
                                o39 = i8;
                                o9 = i7;
                                o10 = i12;
                                o37 = i6;
                                i9 = i;
                            }
                            o3.close();
                            pec.m();
                            arrayList = new ArrayList<>(q23.H(arrayList2, 10));
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(nec2.b((jp8) it.next()));
                            }
                            if (!arrayList.isEmpty()) {
                                int size = arrayList.size();
                                str2 = str9;
                                StringBuilder sb = new StringBuilder(str2);
                                j = j4;
                                sb.append(j);
                                str = str8;
                                sb.append(str);
                                sb.append(size);
                                str6 = str7;
                                udd.q(str6, sb.toString());
                            } else {
                                str6 = str7;
                                str = str8;
                                j = j4;
                                str2 = str9;
                            }
                        } catch (Throwable th) {
                            th = th;
                            o3.close();
                            pec.m();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        pec = a;
                        o3.close();
                        pec.m();
                        throw th;
                    }
                } else {
                    j = j3;
                    str = " to update = ";
                    str2 = "messages for chat ";
                }
                int size2 = arrayList.size();
                udd.q(str6, str2 + j + str + size2);
                if (!arrayList.isEmpty()) {
                    to8 o40 = o();
                    s59 s592 = bp8.b;
                    nec nec3 = ((hz3) o40.a).c;
                    nec3.a.m().q(new px4(arrayList, nec3));
                    i22 B2 = d().B(j);
                    for (vo8 vo8 : arrayList) {
                        if ((B2 != null ? B2.c : null) != null && B2.c.a.b == vo8.b) {
                            d().k0(j, vo8, false);
                        }
                        d0d d0d = this.a;
                        if (d0d == null) {
                            d0d = null;
                        }
                        ((tt0) d0d.c.getValue()).c(new ove(vo8.x0, vo8.b, 0));
                    }
                    int size3 = arrayList.size();
                    udd.q(str6, "records updated " + size3);
                    return;
                }
                return;
            default:
                if (j3 > 0) {
                    y(b().B(j3));
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                int i39 = 0;
                for (i22 i222 : b().D(t52.I)) {
                    if (currentTimeMillis - i222.b.k < 1209600000) {
                        if (y(i222)) {
                            i39++;
                        }
                        if (i39 >= 10) {
                            return;
                        }
                    }
                }
                return;
        }
    }

    public boolean y(i22 i22) {
        long j;
        ArrayList<xm8> arrayList;
        i22 i222 = i22;
        Object obj = this.o;
        if (i222 == null) {
            return false;
        }
        o62 o62 = i222.b;
        md4 md4 = (md4) obj;
        if (o62.n.c(md4) == 0) {
            return false;
        }
        int ordinal = md4.ordinal();
        if (ordinal == 0) {
            b().getClass();
            j = i22.m();
            xm8 xm8 = i222.c;
            if (xm8 != null) {
                long j2 = xm8.a.o;
                if (j > j2) {
                    j = j2;
                }
            }
        } else if (ordinal == 1) {
            j = System.currentTimeMillis();
        } else {
            throw new IllegalStateException("Unexpected value: " + md4);
        }
        to8 n = n();
        ArrayList d = o62.n.d(md4);
        n.getClass();
        udd.q("to8", "loadInitialToReadMark " + ez3.T(Long.valueOf(j)) + "; chunks count = " + d.size());
        h62 h62 = (h62) oyb.x(j, d).b;
        md4 md42 = (md4) obj;
        nj4 nj4 = n.g;
        if (h62 == null) {
            h62 y = oyb.y(j, d);
            if (y != null) {
                long j3 = i222.a;
                long j4 = y.a;
                long j5 = y.b;
                arrayList = ((rp8) nj4.get()).b(n.n(j3, j4, j5, true, md42));
            } else {
                arrayList = null;
            }
        } else {
            nj4 nj42 = nj4;
            String str = "to8";
            ArrayList n2 = n.n(i222.a, h62.a, j, true, md42);
            ArrayList n3 = n.n(i222.a, j, h62.b, false, md42);
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = n2.iterator();
            while (it.hasNext()) {
                vo8 vo8 = (vo8) it.next();
                arrayList2.add(vo8);
                hashSet.add(Long.valueOf(vo8.b));
            }
            Iterator it2 = n3.iterator();
            while (it2.hasNext()) {
                vo8 vo82 = (vo8) it2.next();
                if (!hashSet.contains(Long.valueOf(vo82.b))) {
                    arrayList2.add(vo82);
                    hashSet.add(Long.valueOf(vo82.b));
                }
            }
            udd.q(str, "result record count = " + hashSet.size());
            arrayList = ((rp8) nj42.get()).b(arrayList2);
        }
        if (arrayList == null) {
            arrayList = hw4.a;
        }
        for (xm8 xm82 : arrayList) {
            d0d d0d = this.a;
            if (d0d == null) {
                d0d = null;
            }
            n1b n1b = (n1b) d0d.H.getValue();
            vo8 vo83 = xm82.a;
            ((o1b) n1b.c.computeIfAbsent(Long.valueOf(vo83.b), new di(15, new to1(n1b, vo83, i222, 11)))).h(i222);
            vo8 vo84 = xm82.a;
            if (vo84.m()) {
                jj7 jj7 = vo84.D0;
                int v = jj7.v();
                for (int i = 0; i < v; i++) {
                    d0d d0d2 = this.a;
                    if (d0d2 == null) {
                        d0d2 = null;
                    }
                    jj7.u(i);
                    ((u98) d0d2.A.getValue()).getClass();
                }
            }
        }
        return true;
    }

    public p1d(long j, md4 md4) {
        this.c = j;
        this.o = md4;
    }
}
