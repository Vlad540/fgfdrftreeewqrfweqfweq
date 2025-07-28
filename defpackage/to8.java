package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: to8  reason: default package */
public final class to8 {
    public final a04 a;
    public final tt0 b;
    public final g2b c;
    public final eha d;
    public final luf e;
    public final n1b f;
    public final nj4 g;
    public final qmc h;
    public of3 i;

    public to8(a04 a04, tt0 tt0, g2b g2b, eha eha, luf luf, n1b n1b, nj4 nj4, qmc qmc) {
        this.a = a04;
        this.b = tt0;
        this.c = g2b;
        this.d = eha;
        this.e = luf;
        this.f = n1b;
        this.g = nj4;
        this.h = qmc;
    }

    public final void A(long j, long j2) {
        cw8 d2 = ((hz3) this.a).c.d();
        aec aec = d2.a;
        aec.b();
        th thVar = d2.j;
        yz5 f2 = thVar.f();
        f2.j(1, j2);
        f2.j(2, j);
        try {
            aec.c();
            f2.n();
            aec.r();
            aec.l();
            thVar.u(f2);
        } catch (Throwable th) {
            thVar.u(f2);
            throw th;
        }
    }

    public final long a(long j, long j2) {
        udd.p("to8", "countMessagesFrom chatId = %d, timeFrom = %d", new Object[]{Long.valueOf(j), Long.valueOf(j2)});
        cw8 d2 = ((hz3) this.a).c.d();
        d2.getClass();
        pec a2 = pec.a(4, "SELECT COUNT(*) FROM messages WHERE chat_id = ? AND time >= ? AND inserted_from_msg_link = ? AND status <> ?");
        a2.j(1, j);
        a2.j(2, j2);
        us8.n(a2, 3, (long) 0, d2);
        a2.j(4, (long) 10);
        aec aec = d2.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            return o.moveToFirst() ? o.getLong(0) : 0;
        } finally {
            o.close();
            a2.m();
        }
    }

    public final void b(long j, long j2, long j3) {
        pec pec;
        String str;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        String str2;
        int i5;
        String str3;
        int i6;
        int i7;
        int i8;
        byte[] bArr;
        Long l;
        int i9;
        Boolean bool;
        long j4 = j;
        long j5 = j3;
        hz3 hz3 = (hz3) this.a;
        nec nec = hz3.c;
        cw8 d2 = nec.d();
        d2.getClass();
        pec a2 = pec.a(2, "SELECT * FROM messages WHERE time >= ? AND time <= ? AND msg_link_id > 0");
        a2.j(1, j2);
        a2.j(2, Long.MAX_VALUE);
        aec aec = d2.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            int o2 = gp0.o(o, ApiProtocol.KEY_ID);
            int o3 = gp0.o(o, "server_id");
            int o4 = gp0.o(o, "time");
            int o5 = gp0.o(o, "update_time");
            int o6 = gp0.o(o, "sender");
            int o7 = gp0.o(o, "cid");
            int o8 = gp0.o(o, "text");
            int o9 = gp0.o(o, "delivery_status");
            int o10 = gp0.o(o, "status");
            int o11 = gp0.o(o, "time_local");
            int o12 = gp0.o(o, "error");
            hz3 hz32 = hz3;
            int o13 = gp0.o(o, "localized_error");
            nec nec2 = nec;
            int o14 = gp0.o(o, "attaches");
            pec = a2;
            try {
                int o15 = gp0.o(o, "media_type");
                int o16 = gp0.o(o, "detect_share");
                int o17 = gp0.o(o, "msg_link_type");
                int o18 = gp0.o(o, "msg_link_id");
                int o19 = gp0.o(o, "inserted_from_msg_link");
                int o20 = gp0.o(o, "msg_link_chat_id");
                int o21 = gp0.o(o, "msg_link_chat_name");
                int o22 = gp0.o(o, "msg_link_chat_link");
                int o23 = gp0.o(o, "msg_link_out_chat_id");
                int o24 = gp0.o(o, "msg_link_out_msg_id");
                int o25 = gp0.o(o, "type");
                int o26 = gp0.o(o, "chat_id");
                int o27 = gp0.o(o, "ttl");
                int o28 = gp0.o(o, "channel_views");
                int o29 = gp0.o(o, "channel_forwards");
                int o30 = gp0.o(o, "view_time");
                int o31 = gp0.o(o, "zoom");
                int o32 = gp0.o(o, "options");
                int o33 = gp0.o(o, "live_until");
                int o34 = gp0.o(o, "elements");
                int o35 = gp0.o(o, "reactions");
                int o36 = gp0.o(o, "delayed_attrs_time_to_fire");
                int o37 = gp0.o(o, "delayed_attrs_notify_sender");
                int i10 = o14;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j6 = o.getLong(o2);
                    long j7 = o.getLong(o3);
                    long j8 = o.getLong(o4);
                    long j9 = o.getLong(o5);
                    long j10 = o.getLong(o6);
                    long j11 = o.getLong(o7);
                    String string = o.isNull(o8) ? null : o.getString(o8);
                    int i11 = o.getInt(o9);
                    d2.a().getClass();
                    bp8.b.getClass();
                    bp8 t = s59.t(i11);
                    int i12 = o.getInt(o10);
                    d2.a().getClass();
                    ls8 b2 = p29.b(i12);
                    long j12 = o.getLong(o11);
                    String string2 = o.isNull(o12) ? null : o.getString(o12);
                    if (o.isNull(o13)) {
                        i2 = i10;
                        str = null;
                    } else {
                        str = o.getString(o13);
                        i2 = i10;
                    }
                    byte[] blob = o.isNull(i2) ? null : o.getBlob(i2);
                    d2.a().getClass();
                    jj7 b3 = fu7.b(blob);
                    int i13 = o6;
                    int i14 = o15;
                    int i15 = o.getInt(i14);
                    o15 = i14;
                    int i16 = o16;
                    boolean z3 = false;
                    if (o.getInt(i16) != 0) {
                        o16 = i16;
                        i3 = o17;
                        z = true;
                    } else {
                        o16 = i16;
                        i3 = o17;
                        z = false;
                    }
                    int i17 = o.getInt(i3);
                    o17 = i3;
                    int i18 = o18;
                    long j13 = o.getLong(i18);
                    o18 = i18;
                    int i19 = o19;
                    if (o.getInt(i19) != 0) {
                        o19 = i19;
                        i4 = o20;
                        z2 = true;
                    } else {
                        o19 = i19;
                        i4 = o20;
                        z2 = false;
                    }
                    long j14 = o.getLong(i4);
                    o20 = i4;
                    int i20 = o21;
                    if (o.isNull(i20)) {
                        o21 = i20;
                        i5 = o22;
                        str2 = null;
                    } else {
                        str2 = o.getString(i20);
                        o21 = i20;
                        i5 = o22;
                    }
                    if (o.isNull(i5)) {
                        o22 = i5;
                        i6 = o23;
                        str3 = null;
                    } else {
                        str3 = o.getString(i5);
                        o22 = i5;
                        i6 = o23;
                    }
                    long j15 = o.getLong(i6);
                    o23 = i6;
                    int i21 = o24;
                    long j16 = o.getLong(i21);
                    o24 = i21;
                    int i22 = o25;
                    int i23 = o.getInt(i22);
                    d2.a().getClass();
                    int a3 = us8.a(i23);
                    o25 = i22;
                    int i24 = o26;
                    long j17 = o.getLong(i24);
                    o26 = i24;
                    int i25 = o27;
                    int i26 = o.getInt(i25);
                    o27 = i25;
                    int i27 = o28;
                    int i28 = o.getInt(i27);
                    o28 = i27;
                    int i29 = o29;
                    int i30 = o.getInt(i29);
                    o29 = i29;
                    int i31 = o30;
                    long j18 = o.getLong(i31);
                    o30 = i31;
                    int i32 = o31;
                    int i33 = o.getInt(i32);
                    o31 = i32;
                    int i34 = o32;
                    int i35 = o.getInt(i34);
                    o32 = i34;
                    int i36 = o33;
                    long j19 = o.getLong(i36);
                    o33 = i36;
                    int i37 = o34;
                    byte[] blob2 = o.isNull(i37) ? null : o.getBlob(i37);
                    d2.a().getClass();
                    List a4 = p29.a(blob2);
                    o34 = i37;
                    int i38 = o35;
                    if (o.isNull(i38)) {
                        i7 = i38;
                        i8 = o13;
                        bArr = null;
                    } else {
                        i7 = i38;
                        bArr = o.getBlob(i38);
                        i8 = o13;
                    }
                    yr8 c2 = d2.a().c(bArr);
                    int i39 = o36;
                    if (o.isNull(i39)) {
                        i9 = o37;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i39));
                        i9 = o37;
                    }
                    Integer valueOf = o.isNull(i9) ? null : Integer.valueOf(o.getInt(i9));
                    if (valueOf == null) {
                        o36 = i39;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z3 = true;
                        }
                        bool = Boolean.valueOf(z3);
                        o36 = i39;
                    }
                    arrayList.add(new jp8(j6, j7, j8, j9, j10, j11, string, t, b2, j12, string2, str, b3, i15, z, i17, j13, z2, j14, str2, str3, j15, j16, a3, j17, i26, i28, i30, j18, i33, i35, j19, a4, c2, l, bool));
                    o37 = i9;
                    o13 = i8;
                    o6 = i13;
                    o35 = i7;
                    i10 = i2;
                }
                o.close();
                pec.m();
                ArrayList arrayList2 = new ArrayList(q23.H(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(nec2.b((jp8) it.next()));
                }
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    try {
                        vo8 vo8 = ((vo8) it2.next()).G0;
                        arrayList3.add(Long.valueOf(vo8 != null ? vo8.b : 0));
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                nec nec3 = hz32.c;
                md4 md4 = md4.REGULAR;
                nec3.getClass();
                int ordinal = md4.ordinal();
                int i40 = 4;
                if (ordinal == 0) {
                    aec aec2 = nec3.d().a;
                    aec2.b();
                    StringBuilder sb = new StringBuilder();
                    sb.append("DELETE FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND id NOT IN (");
                    a06.e(sb, arrayList3.size());
                    sb.append(")");
                    yz5 d3 = aec2.d(sb.toString());
                    d3.j(1, j);
                    d3.j(2, j2);
                    d3.j(3, j3);
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        Long l2 = (Long) it3.next();
                        if (l2 == null) {
                            d3.W(i40);
                        } else {
                            d3.j(i40, l2.longValue());
                        }
                        i40++;
                    }
                    aec2.c();
                    try {
                        d3.n();
                        aec2.r();
                    } finally {
                        aec2.l();
                    }
                } else if (ordinal == 1) {
                    aec aec3 = nec3.d().a;
                    aec3.b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("DELETE FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire >= ? AND delayed_attrs_time_to_fire <= ? AND id NOT IN (");
                    a06.e(sb2, arrayList3.size());
                    sb2.append(")");
                    yz5 d4 = aec3.d(sb2.toString());
                    d4.j(1, j);
                    d4.j(2, j2);
                    d4.j(3, j3);
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        Long l3 = (Long) it4.next();
                        if (l3 == null) {
                            d4.W(i40);
                        } else {
                            d4.j(i40, l3.longValue());
                        }
                        i40++;
                    }
                    aec3.c();
                    try {
                        d4.n();
                        aec3.r();
                    } finally {
                        aec3.l();
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                this.b.c(new l89(j, j2, j3, md4.REGULAR));
            } catch (Throwable th2) {
                th = th2;
                o.close();
                pec.m();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            pec = a2;
            o.close();
            pec.m();
            throw th;
        }
    }

    public final void c(long j, Collection collection) {
        Long valueOf = Long.valueOf(j);
        gw2 gw2 = new gw2(26, new be8(11));
        StringBuilder sb = new StringBuilder();
        o23.a0(collection, sb, ",", "[", "]", -1, "", gw2);
        udd.p("to8", "deleteMessages %d ids = %s", new Object[]{valueOf, sb.toString()});
        this.d.getClass();
        if (j != 0) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                eha.b(j, ((Long) it.next()).longValue());
            }
        }
        n1b n1b = this.f;
        n1b.getClass();
        for (Number longValue : o23.s0(collection)) {
            n1b.c.remove(Long.valueOf(longValue.longValue()));
        }
        cw8 d2 = ((hz3) this.a).c.d();
        List<Long> s0 = o23.s0(collection);
        aec aec = d2.a;
        aec.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DELETE FROM messages WHERE chat_id = ? AND id in (");
        a06.e(sb2, s0.size());
        sb2.append(")");
        yz5 d3 = aec.d(sb2.toString());
        d3.j(1, j);
        int i2 = 2;
        for (Long l : s0) {
            if (l == null) {
                d3.W(i2);
            } else {
                d3.j(i2, l.longValue());
            }
            i2++;
        }
        aec.c();
        try {
            d3.n();
            aec.r();
        } finally {
            aec.l();
        }
    }

    public final int d(long j, long j2, md4 md4) {
        ConcurrentHashMap concurrentHashMap = this.f.c;
        int i2 = 0;
        for (o1b o1b : o23.s0(concurrentHashMap.values())) {
            vo8 vo8 = o1b.d;
            if (vo8.x0 == j) {
                int i3 = md4 == null ? -1 : m1b.$EnumSwitchMapping$0[md4.ordinal()];
                long j3 = vo8.b;
                if (i3 == -1 || i3 == 1) {
                    if (vo8.o <= j2) {
                        concurrentHashMap.remove(Long.valueOf(j3));
                    }
                } else if (i3 == 2) {
                    nd4 nd4 = vo8.X0;
                    if (nd4 != null && nd4.a <= j2) {
                        concurrentHashMap.remove(Long.valueOf(j3));
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                i2++;
            }
        }
        if (i2 > 0) {
            udd.p("n1b", "clearPreprocessedDataInChat: chatId = %d, itemType = %s, count = %d", new Object[]{Long.valueOf(j), md4, Integer.valueOf(i2)});
        }
        return ((hz3) this.a).c.a(j, j2, md4);
    }

    public final boolean e(long j, long j2) {
        return ((hz3) this.a).c.d().i(j, j2) != null;
    }

    public final long f(long j, long j2, ym8 ym8) {
        List singletonList = Collections.singletonList(ym8);
        of3 of3 = this.i;
        if (of3 != null) {
            try {
                of3.accept(singletonList);
            } catch (Throwable th) {
                udd.s("to8", "validateMessages: exception", th);
            }
        }
        return ((hz3) this.a).c.e(j, j2, ym8);
    }

    public final void g(long j, long j2, List list) {
        of3 of3 = this.i;
        if (of3 != null) {
            try {
                of3.accept(list);
            } catch (Throwable th) {
                udd.s("to8", "validateMessages: exception", th);
            }
        }
        nec nec = ((hz3) this.a).c;
        nec.a.m().q(new u50(list, nec, j, j2, 2));
    }

    public final void h(Map map) {
        nec nec = ((hz3) this.a).c;
        nec.a.m().q(new sbc(map, 2, nec));
    }

    public final ArrayList i(long j) {
        nec nec;
        ArrayList<jp8> arrayList;
        pec pec;
        String str;
        int i2;
        boolean z;
        int i3;
        String str2;
        int i4;
        String str3;
        int i5;
        int i6;
        int i7;
        byte[] bArr;
        Long l;
        int i8;
        Boolean bool;
        pec pec2;
        String str4;
        int i9;
        boolean z2;
        int i10;
        String str5;
        int i11;
        String str6;
        int i12;
        int i13;
        int i14;
        byte[] bArr2;
        Long l2;
        int i15;
        Boolean bool2;
        long j2 = j;
        nec nec2 = ((hz3) this.a).c;
        nec2.getClass();
        int ordinal = md4.REGULAR.ordinal();
        String str7 = "delayed_attrs_notify_sender";
        String str8 = "delayed_attrs_time_to_fire";
        String str9 = "reactions";
        String str10 = "elements";
        String str11 = "live_until";
        String str12 = "options";
        String str13 = "zoom";
        String str14 = "view_time";
        String str15 = "channel_forwards";
        String str16 = "channel_views";
        String str17 = "ttl";
        String str18 = "chat_id";
        String str19 = "type";
        String str20 = "msg_link_out_msg_id";
        String str21 = "msg_link_out_chat_id";
        String str22 = "msg_link_chat_link";
        String str23 = "msg_link_chat_name";
        String str24 = "msg_link_chat_id";
        String str25 = "inserted_from_msg_link";
        String str26 = "msg_link_id";
        String str27 = "msg_link_type";
        String str28 = "detect_share";
        String str29 = "media_type";
        String str30 = "attaches";
        String str31 = "localized_error";
        if (ordinal == 0) {
            nec = nec2;
            String str32 = "error";
            cw8 d2 = nec.d();
            d2.getClass();
            String str33 = str30;
            String str34 = str31;
            pec a2 = pec.a(2, "SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time ASC LIMIT ?");
            a2.j(1, j2);
            a2.j(2, (long) -1);
            aec aec = d2.a;
            aec.b();
            Cursor o = aec.o(a2, (CancellationSignal) null);
            try {
                int o2 = gp0.o(o, ApiProtocol.KEY_ID);
                int o3 = gp0.o(o, "server_id");
                int o4 = gp0.o(o, "time");
                int o5 = gp0.o(o, "update_time");
                int o6 = gp0.o(o, "sender");
                int o7 = gp0.o(o, "cid");
                int o8 = gp0.o(o, "text");
                int o9 = gp0.o(o, "delivery_status");
                int o10 = gp0.o(o, "status");
                int o11 = gp0.o(o, "time_local");
                int o12 = gp0.o(o, str32);
                int o13 = gp0.o(o, str34);
                int o14 = gp0.o(o, str33);
                pec = a2;
                try {
                    int o15 = gp0.o(o, str29);
                    int o16 = gp0.o(o, str28);
                    int o17 = gp0.o(o, str27);
                    int o18 = gp0.o(o, str26);
                    int o19 = gp0.o(o, str25);
                    int o20 = gp0.o(o, str24);
                    int o21 = gp0.o(o, str23);
                    int o22 = gp0.o(o, str22);
                    int o23 = gp0.o(o, str21);
                    int o24 = gp0.o(o, str20);
                    int o25 = gp0.o(o, str19);
                    int o26 = gp0.o(o, str18);
                    int o27 = gp0.o(o, str17);
                    int o28 = gp0.o(o, str16);
                    int o29 = gp0.o(o, str15);
                    int o30 = gp0.o(o, str14);
                    int o31 = gp0.o(o, str13);
                    int o32 = gp0.o(o, str12);
                    int o33 = gp0.o(o, str11);
                    int o34 = gp0.o(o, str10);
                    int o35 = gp0.o(o, str9);
                    int o36 = gp0.o(o, str8);
                    int o37 = gp0.o(o, str7);
                    int i16 = o14;
                    ArrayList arrayList2 = new ArrayList(o.getCount());
                    while (o.moveToNext()) {
                        long j3 = o.getLong(o2);
                        long j4 = o.getLong(o3);
                        long j5 = o.getLong(o4);
                        long j6 = o.getLong(o5);
                        long j7 = o.getLong(o6);
                        long j8 = o.getLong(o7);
                        String string = o.isNull(o8) ? null : o.getString(o8);
                        int i17 = o.getInt(o9);
                        d2.a().getClass();
                        bp8.b.getClass();
                        bp8 t = s59.t(i17);
                        int i18 = o.getInt(o10);
                        d2.a().getClass();
                        ls8 b2 = p29.b(i18);
                        long j9 = o.getLong(o11);
                        String string2 = o.isNull(o12) ? null : o.getString(o12);
                        if (o.isNull(o13)) {
                            i2 = i16;
                            str = null;
                        } else {
                            str = o.getString(o13);
                            i2 = i16;
                        }
                        byte[] blob = o.isNull(i2) ? null : o.getBlob(i2);
                        d2.a().getClass();
                        jj7 b3 = fu7.b(blob);
                        int i19 = o2;
                        int i20 = o15;
                        int i21 = o.getInt(i20);
                        o15 = i20;
                        int i22 = o16;
                        int i23 = o.getInt(i22);
                        o16 = i22;
                        int i24 = o17;
                        boolean z3 = i23 != 0;
                        int i25 = o.getInt(i24);
                        o17 = i24;
                        int i26 = o18;
                        long j10 = o.getLong(i26);
                        o18 = i26;
                        int i27 = o19;
                        if (o.getInt(i27) != 0) {
                            o19 = i27;
                            i3 = o20;
                            z = true;
                        } else {
                            o19 = i27;
                            i3 = o20;
                            z = false;
                        }
                        long j11 = o.getLong(i3);
                        o20 = i3;
                        int i28 = o21;
                        if (o.isNull(i28)) {
                            o21 = i28;
                            i4 = o22;
                            str2 = null;
                        } else {
                            str2 = o.getString(i28);
                            o21 = i28;
                            i4 = o22;
                        }
                        if (o.isNull(i4)) {
                            o22 = i4;
                            i5 = o23;
                            str3 = null;
                        } else {
                            str3 = o.getString(i4);
                            o22 = i4;
                            i5 = o23;
                        }
                        long j12 = o.getLong(i5);
                        o23 = i5;
                        int i29 = o24;
                        long j13 = o.getLong(i29);
                        o24 = i29;
                        int i30 = o25;
                        int i31 = o.getInt(i30);
                        d2.a().getClass();
                        int a3 = us8.a(i31);
                        o25 = i30;
                        int i32 = o26;
                        long j14 = o.getLong(i32);
                        o26 = i32;
                        int i33 = o27;
                        int i34 = o.getInt(i33);
                        o27 = i33;
                        int i35 = o28;
                        int i36 = o.getInt(i35);
                        o28 = i35;
                        int i37 = o29;
                        int i38 = o.getInt(i37);
                        o29 = i37;
                        int i39 = o30;
                        long j15 = o.getLong(i39);
                        o30 = i39;
                        int i40 = o31;
                        int i41 = o.getInt(i40);
                        o31 = i40;
                        int i42 = o32;
                        int i43 = o.getInt(i42);
                        o32 = i42;
                        int i44 = o33;
                        long j16 = o.getLong(i44);
                        o33 = i44;
                        int i45 = o34;
                        byte[] blob2 = o.isNull(i45) ? null : o.getBlob(i45);
                        d2.a().getClass();
                        List a4 = p29.a(blob2);
                        o34 = i45;
                        int i46 = o35;
                        if (o.isNull(i46)) {
                            i6 = i46;
                            i7 = i2;
                            bArr = null;
                        } else {
                            i6 = i46;
                            bArr = o.getBlob(i46);
                            i7 = i2;
                        }
                        yr8 c2 = d2.a().c(bArr);
                        int i47 = o36;
                        if (o.isNull(i47)) {
                            i8 = o37;
                            l = null;
                        } else {
                            l = Long.valueOf(o.getLong(i47));
                            i8 = o37;
                        }
                        Integer valueOf = o.isNull(i8) ? null : Integer.valueOf(o.getInt(i8));
                        if (valueOf == null) {
                            o36 = i47;
                            bool = null;
                        } else {
                            o36 = i47;
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        }
                        arrayList2.add(new jp8(j3, j4, j5, j6, j7, j8, string, t, b2, j9, string2, str, b3, i21, z3, i25, j10, z, j11, str2, str3, j12, j13, a3, j14, i34, i36, i38, j15, i41, i43, j16, a4, c2, l, bool));
                        o37 = i8;
                        o2 = i19;
                        i16 = i7;
                        o35 = i6;
                    }
                    o.close();
                    pec.m();
                    arrayList = arrayList2;
                } catch (Throwable th) {
                    th = th;
                    o.close();
                    pec.m();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                pec = a2;
                o.close();
                pec.m();
                throw th;
            }
        } else if (ordinal == 1) {
            cw8 d3 = nec2.d();
            d3.getClass();
            nec = nec2;
            String str35 = "error";
            pec a5 = pec.a(2, "SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire DESC LIMIT ?");
            a5.j(1, j2);
            a5.j(2, (long) -1);
            aec aec2 = d3.a;
            aec2.b();
            Cursor o38 = aec2.o(a5, (CancellationSignal) null);
            try {
                int o39 = gp0.o(o38, ApiProtocol.KEY_ID);
                int o40 = gp0.o(o38, "server_id");
                int o41 = gp0.o(o38, "time");
                int o42 = gp0.o(o38, "update_time");
                int o43 = gp0.o(o38, "sender");
                int o44 = gp0.o(o38, "cid");
                int o45 = gp0.o(o38, "text");
                int o46 = gp0.o(o38, "delivery_status");
                int o47 = gp0.o(o38, "status");
                int o48 = gp0.o(o38, "time_local");
                int o49 = gp0.o(o38, str35);
                int o50 = gp0.o(o38, str31);
                int o51 = gp0.o(o38, str30);
                pec2 = a5;
                try {
                    int o52 = gp0.o(o38, str29);
                    int o53 = gp0.o(o38, str28);
                    int o54 = gp0.o(o38, str27);
                    int o55 = gp0.o(o38, str26);
                    int o56 = gp0.o(o38, str25);
                    int o57 = gp0.o(o38, str24);
                    int o58 = gp0.o(o38, str23);
                    int o59 = gp0.o(o38, str22);
                    int o60 = gp0.o(o38, str21);
                    int o61 = gp0.o(o38, str20);
                    int o62 = gp0.o(o38, str19);
                    int o63 = gp0.o(o38, str18);
                    int o64 = gp0.o(o38, str17);
                    int o65 = gp0.o(o38, str16);
                    int o66 = gp0.o(o38, str15);
                    int o67 = gp0.o(o38, str14);
                    int o68 = gp0.o(o38, str13);
                    int o69 = gp0.o(o38, str12);
                    int o70 = gp0.o(o38, str11);
                    int o71 = gp0.o(o38, str10);
                    int o72 = gp0.o(o38, str9);
                    int o73 = gp0.o(o38, str8);
                    int o74 = gp0.o(o38, str7);
                    int i48 = o51;
                    arrayList = new ArrayList<>(o38.getCount());
                    while (o38.moveToNext()) {
                        long j17 = o38.getLong(o39);
                        long j18 = o38.getLong(o40);
                        long j19 = o38.getLong(o41);
                        long j20 = o38.getLong(o42);
                        long j21 = o38.getLong(o43);
                        long j22 = o38.getLong(o44);
                        String string3 = o38.isNull(o45) ? null : o38.getString(o45);
                        int i49 = o38.getInt(o46);
                        d3.a().getClass();
                        bp8.b.getClass();
                        bp8 t2 = s59.t(i49);
                        int i50 = o38.getInt(o47);
                        d3.a().getClass();
                        ls8 b4 = p29.b(i50);
                        long j23 = o38.getLong(o48);
                        String string4 = o38.isNull(o49) ? null : o38.getString(o49);
                        if (o38.isNull(o50)) {
                            i9 = i48;
                            str4 = null;
                        } else {
                            str4 = o38.getString(o50);
                            i9 = i48;
                        }
                        byte[] blob3 = o38.isNull(i9) ? null : o38.getBlob(i9);
                        d3.a().getClass();
                        jj7 b5 = fu7.b(blob3);
                        int i51 = o39;
                        int i52 = o52;
                        int i53 = o38.getInt(i52);
                        o52 = i52;
                        int i54 = o53;
                        int i55 = o38.getInt(i54);
                        o53 = i54;
                        int i56 = o54;
                        boolean z4 = i55 != 0;
                        int i57 = o38.getInt(i56);
                        o54 = i56;
                        int i58 = o55;
                        long j24 = o38.getLong(i58);
                        o55 = i58;
                        int i59 = o56;
                        if (o38.getInt(i59) != 0) {
                            o56 = i59;
                            i10 = o57;
                            z2 = true;
                        } else {
                            o56 = i59;
                            i10 = o57;
                            z2 = false;
                        }
                        long j25 = o38.getLong(i10);
                        o57 = i10;
                        int i60 = o58;
                        if (o38.isNull(i60)) {
                            o58 = i60;
                            i11 = o59;
                            str5 = null;
                        } else {
                            str5 = o38.getString(i60);
                            o58 = i60;
                            i11 = o59;
                        }
                        if (o38.isNull(i11)) {
                            o59 = i11;
                            i12 = o60;
                            str6 = null;
                        } else {
                            str6 = o38.getString(i11);
                            o59 = i11;
                            i12 = o60;
                        }
                        long j26 = o38.getLong(i12);
                        o60 = i12;
                        int i61 = o61;
                        long j27 = o38.getLong(i61);
                        o61 = i61;
                        int i62 = o62;
                        int i63 = o38.getInt(i62);
                        d3.a().getClass();
                        int a6 = us8.a(i63);
                        o62 = i62;
                        int i64 = o63;
                        long j28 = o38.getLong(i64);
                        o63 = i64;
                        int i65 = o64;
                        int i66 = o38.getInt(i65);
                        o64 = i65;
                        int i67 = o65;
                        int i68 = o38.getInt(i67);
                        o65 = i67;
                        int i69 = o66;
                        int i70 = o38.getInt(i69);
                        o66 = i69;
                        int i71 = o67;
                        long j29 = o38.getLong(i71);
                        o67 = i71;
                        int i72 = o68;
                        int i73 = o38.getInt(i72);
                        o68 = i72;
                        int i74 = o69;
                        int i75 = o38.getInt(i74);
                        o69 = i74;
                        int i76 = o70;
                        long j30 = o38.getLong(i76);
                        o70 = i76;
                        int i77 = o71;
                        byte[] blob4 = o38.isNull(i77) ? null : o38.getBlob(i77);
                        d3.a().getClass();
                        List a7 = p29.a(blob4);
                        o71 = i77;
                        int i78 = o72;
                        if (o38.isNull(i78)) {
                            i13 = i78;
                            i14 = o40;
                            bArr2 = null;
                        } else {
                            i13 = i78;
                            bArr2 = o38.getBlob(i78);
                            i14 = o40;
                        }
                        yr8 c3 = d3.a().c(bArr2);
                        int i79 = o73;
                        if (o38.isNull(i79)) {
                            i15 = o74;
                            l2 = null;
                        } else {
                            l2 = Long.valueOf(o38.getLong(i79));
                            i15 = o74;
                        }
                        Integer valueOf2 = o38.isNull(i15) ? null : Integer.valueOf(o38.getInt(i15));
                        if (valueOf2 == null) {
                            o73 = i79;
                            bool2 = null;
                        } else {
                            o73 = i79;
                            bool2 = Boolean.valueOf(valueOf2.intValue() != 0);
                        }
                        arrayList.add(new jp8(j17, j18, j19, j20, j21, j22, string3, t2, b4, j23, string4, str4, b5, i53, z4, i57, j24, z2, j25, str5, str6, j26, j27, a6, j28, i66, i68, i70, j29, i73, i75, j30, a7, c3, l2, bool2));
                        o74 = i15;
                        o40 = i14;
                        o39 = i51;
                        o72 = i13;
                        i48 = i9;
                    }
                    o38.close();
                    pec2.m();
                } catch (Throwable th3) {
                    th = th3;
                    o38.close();
                    pec2.m();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                pec2 = a5;
                o38.close();
                pec2.m();
                throw th;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList3 = new ArrayList(q23.H(arrayList, 10));
        for (jp8 b6 : arrayList) {
            arrayList3.add(nec.b(b6));
        }
        return arrayList3;
    }

    public final vo8 j(long j, long j2) {
        nec nec = ((hz3) this.a).c;
        jp8 b2 = nec.d().b(j, j2);
        if (b2 != null) {
            return nec.b(b2);
        }
        return null;
    }

    public final ArrayList k(long j, Collection collection) {
        pec pec;
        String str;
        int i2;
        boolean z;
        int i3;
        String str2;
        int i4;
        String str3;
        int i5;
        int i6;
        int i7;
        byte[] bArr;
        Long l;
        int i8;
        Boolean bool;
        nec nec = ((hz3) this.a).c;
        cw8 d2 = nec.d();
        List<Long> s0 = o23.s0(collection);
        d2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM messages WHERE chat_id = ? AND server_id in (");
        int size = s0.size();
        a06.e(sb, size);
        sb.append(")");
        pec a2 = pec.a(size + 1, sb.toString());
        a2.j(1, j);
        int i9 = 2;
        for (Long l2 : s0) {
            if (l2 == null) {
                a2.W(i9);
            } else {
                a2.j(i9, l2.longValue());
            }
            i9++;
        }
        aec aec = d2.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            int o2 = gp0.o(o, ApiProtocol.KEY_ID);
            int o3 = gp0.o(o, "server_id");
            int o4 = gp0.o(o, "time");
            int o5 = gp0.o(o, "update_time");
            int o6 = gp0.o(o, "sender");
            int o7 = gp0.o(o, "cid");
            int o8 = gp0.o(o, "text");
            int o9 = gp0.o(o, "delivery_status");
            int o10 = gp0.o(o, "status");
            int o11 = gp0.o(o, "time_local");
            int o12 = gp0.o(o, "error");
            int o13 = gp0.o(o, "localized_error");
            nec nec2 = nec;
            int o14 = gp0.o(o, "attaches");
            pec = a2;
            try {
                int o15 = gp0.o(o, "media_type");
                int o16 = gp0.o(o, "detect_share");
                int o17 = gp0.o(o, "msg_link_type");
                int o18 = gp0.o(o, "msg_link_id");
                int o19 = gp0.o(o, "inserted_from_msg_link");
                int o20 = gp0.o(o, "msg_link_chat_id");
                int o21 = gp0.o(o, "msg_link_chat_name");
                int o22 = gp0.o(o, "msg_link_chat_link");
                int o23 = gp0.o(o, "msg_link_out_chat_id");
                int o24 = gp0.o(o, "msg_link_out_msg_id");
                int o25 = gp0.o(o, "type");
                int o26 = gp0.o(o, "chat_id");
                int o27 = gp0.o(o, "ttl");
                int o28 = gp0.o(o, "channel_views");
                int o29 = gp0.o(o, "channel_forwards");
                int o30 = gp0.o(o, "view_time");
                int o31 = gp0.o(o, "zoom");
                int o32 = gp0.o(o, "options");
                int o33 = gp0.o(o, "live_until");
                int o34 = gp0.o(o, "elements");
                int o35 = gp0.o(o, "reactions");
                int o36 = gp0.o(o, "delayed_attrs_time_to_fire");
                int o37 = gp0.o(o, "delayed_attrs_notify_sender");
                int i10 = o14;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j2 = o.getLong(o2);
                    long j3 = o.getLong(o3);
                    long j4 = o.getLong(o4);
                    long j5 = o.getLong(o5);
                    long j6 = o.getLong(o6);
                    long j7 = o.getLong(o7);
                    String string = o.isNull(o8) ? null : o.getString(o8);
                    int i11 = o.getInt(o9);
                    d2.a().getClass();
                    bp8.b.getClass();
                    bp8 t = s59.t(i11);
                    int i12 = o.getInt(o10);
                    d2.a().getClass();
                    ls8 b2 = p29.b(i12);
                    long j8 = o.getLong(o11);
                    String string2 = o.isNull(o12) ? null : o.getString(o12);
                    if (o.isNull(o13)) {
                        i2 = i10;
                        str = null;
                    } else {
                        str = o.getString(o13);
                        i2 = i10;
                    }
                    byte[] blob = o.isNull(i2) ? null : o.getBlob(i2);
                    d2.a().getClass();
                    jj7 b3 = fu7.b(blob);
                    i10 = i2;
                    int i13 = o15;
                    int i14 = o.getInt(i13);
                    o15 = i13;
                    int i15 = o16;
                    int i16 = o.getInt(i15);
                    boolean z2 = false;
                    o16 = i15;
                    int i17 = o17;
                    boolean z3 = i16 != 0;
                    int i18 = o.getInt(i17);
                    int i19 = i17;
                    int i20 = o18;
                    long j9 = o.getLong(i20);
                    o18 = i20;
                    int i21 = o19;
                    if (o.getInt(i21) != 0) {
                        o19 = i21;
                        i3 = o20;
                        z = true;
                    } else {
                        o19 = i21;
                        i3 = o20;
                        z = false;
                    }
                    long j10 = o.getLong(i3);
                    o20 = i3;
                    int i22 = o21;
                    if (o.isNull(i22)) {
                        o21 = i22;
                        i4 = o22;
                        str2 = null;
                    } else {
                        str2 = o.getString(i22);
                        o21 = i22;
                        i4 = o22;
                    }
                    if (o.isNull(i4)) {
                        o22 = i4;
                        i5 = o23;
                        str3 = null;
                    } else {
                        str3 = o.getString(i4);
                        o22 = i4;
                        i5 = o23;
                    }
                    long j11 = o.getLong(i5);
                    o23 = i5;
                    int i23 = o24;
                    long j12 = o.getLong(i23);
                    o24 = i23;
                    int i24 = o25;
                    int i25 = o.getInt(i24);
                    d2.a().getClass();
                    int a3 = us8.a(i25);
                    o25 = i24;
                    int i26 = o26;
                    long j13 = o.getLong(i26);
                    o26 = i26;
                    int i27 = o27;
                    int i28 = o.getInt(i27);
                    o27 = i27;
                    int i29 = o28;
                    int i30 = o.getInt(i29);
                    o28 = i29;
                    int i31 = o29;
                    int i32 = o.getInt(i31);
                    o29 = i31;
                    int i33 = o30;
                    long j14 = o.getLong(i33);
                    o30 = i33;
                    int i34 = o31;
                    int i35 = o.getInt(i34);
                    o31 = i34;
                    int i36 = o32;
                    int i37 = o.getInt(i36);
                    o32 = i36;
                    int i38 = o33;
                    long j15 = o.getLong(i38);
                    o33 = i38;
                    int i39 = o34;
                    byte[] blob2 = o.isNull(i39) ? null : o.getBlob(i39);
                    d2.a().getClass();
                    List a4 = p29.a(blob2);
                    o34 = i39;
                    int i40 = o35;
                    if (o.isNull(i40)) {
                        i6 = i40;
                        i7 = o12;
                        bArr = null;
                    } else {
                        i6 = i40;
                        bArr = o.getBlob(i40);
                        i7 = o12;
                    }
                    yr8 c2 = d2.a().c(bArr);
                    int i41 = o36;
                    if (o.isNull(i41)) {
                        i8 = o37;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i41));
                        i8 = o37;
                    }
                    Integer valueOf = o.isNull(i8) ? null : Integer.valueOf(o.getInt(i8));
                    if (valueOf == null) {
                        o36 = i41;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z2 = true;
                        }
                        bool = Boolean.valueOf(z2);
                        o36 = i41;
                    }
                    arrayList.add(new jp8(j2, j3, j4, j5, j6, j7, string, t, b2, j8, string2, str, b3, i14, z3, i18, j9, z, j10, str2, str3, j11, j12, a3, j13, i28, i30, i32, j14, i35, i37, j15, a4, c2, l, bool));
                    o37 = i8;
                    o12 = i7;
                    o17 = i19;
                    o35 = i6;
                }
                o.close();
                pec.m();
                ArrayList arrayList2 = new ArrayList(q23.H(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(nec2.b((jp8) it.next()));
                }
                return arrayList2;
            } catch (Throwable th) {
                th = th;
                o.close();
                pec.m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            pec = a2;
            o.close();
            pec.m();
            throw th;
        }
    }

    public final yr l(ArrayList arrayList) {
        nec nec = ((hz3) this.a).c;
        nec.getClass();
        es esVar = new es(2, arrayList);
        pfa.c(200, 200);
        xi5 P = myc.P(new vqe(new yjd(esVar, 200, 200), new e98(28, nec)), x51.x0);
        kgd kgd = new kgd(0);
        rg5 rg5 = new rg5(P);
        while (rg5.hasNext()) {
            vo8 b2 = nec.b((jp8) rg5.next());
            kgd.put(Long.valueOf(b2.b), b2);
        }
        return kgd;
    }

    public final ArrayList m(long j, long j2) {
        pec pec;
        String str;
        int i2;
        String str2;
        int i3;
        String str3;
        int i4;
        int i5;
        int i6;
        byte[] bArr;
        Long l;
        int i7;
        Boolean bool;
        rp8 rp8 = (rp8) this.g.get();
        nec nec = ((hz3) this.a).c;
        cw8 d2 = nec.d();
        Set<Integer> singleton = Collections.singleton(8);
        d2.getClass();
        StringBuilder l2 = hr1.l("SELECT * FROM messages WHERE media_type in (");
        int size = singleton.size();
        a06.e(l2, size);
        l2.append(") AND time >= ");
        l2.append("?");
        l2.append(" AND time <= ");
        l2.append("?");
        l2.append(" AND inserted_from_msg_link = 0 AND status <> ");
        l2.append("?");
        l2.append(" ORDER BY time DESC LIMIT ");
        l2.append("?");
        int i8 = size + 4;
        pec a2 = pec.a(i8, l2.toString());
        int i9 = 1;
        for (Integer num : singleton) {
            if (num == null) {
                a2.W(i9);
            } else {
                a2.j(i9, (long) num.intValue());
            }
            i9++;
        }
        a2.j(size + 1, j);
        a2.j(size + 2, j2);
        d2.a().getClass();
        a2.j(size + 3, (long) 10);
        a2.j(i8, (long) 100);
        aec aec = d2.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            int o2 = gp0.o(o, ApiProtocol.KEY_ID);
            int o3 = gp0.o(o, "server_id");
            int o4 = gp0.o(o, "time");
            int o5 = gp0.o(o, "update_time");
            int o6 = gp0.o(o, "sender");
            int o7 = gp0.o(o, "cid");
            int o8 = gp0.o(o, "text");
            int o9 = gp0.o(o, "delivery_status");
            int o10 = gp0.o(o, "status");
            int o11 = gp0.o(o, "time_local");
            int o12 = gp0.o(o, "error");
            rp8 rp82 = rp8;
            int o13 = gp0.o(o, "localized_error");
            nec nec2 = nec;
            int o14 = gp0.o(o, "attaches");
            pec = a2;
            try {
                int o15 = gp0.o(o, "media_type");
                int o16 = gp0.o(o, "detect_share");
                int o17 = gp0.o(o, "msg_link_type");
                int o18 = gp0.o(o, "msg_link_id");
                int o19 = gp0.o(o, "inserted_from_msg_link");
                int o20 = gp0.o(o, "msg_link_chat_id");
                int o21 = gp0.o(o, "msg_link_chat_name");
                int o22 = gp0.o(o, "msg_link_chat_link");
                int o23 = gp0.o(o, "msg_link_out_chat_id");
                int o24 = gp0.o(o, "msg_link_out_msg_id");
                int o25 = gp0.o(o, "type");
                int o26 = gp0.o(o, "chat_id");
                int o27 = gp0.o(o, "ttl");
                int o28 = gp0.o(o, "channel_views");
                int o29 = gp0.o(o, "channel_forwards");
                int o30 = gp0.o(o, "view_time");
                int o31 = gp0.o(o, "zoom");
                int o32 = gp0.o(o, "options");
                int o33 = gp0.o(o, "live_until");
                int o34 = gp0.o(o, "elements");
                int o35 = gp0.o(o, "reactions");
                int o36 = gp0.o(o, "delayed_attrs_time_to_fire");
                int o37 = gp0.o(o, "delayed_attrs_notify_sender");
                int i10 = o14;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j3 = o.getLong(o2);
                    long j4 = o.getLong(o3);
                    long j5 = o.getLong(o4);
                    long j6 = o.getLong(o5);
                    long j7 = o.getLong(o6);
                    long j8 = o.getLong(o7);
                    String string = o.isNull(o8) ? null : o.getString(o8);
                    int i11 = o.getInt(o9);
                    d2.a().getClass();
                    bp8.b.getClass();
                    bp8 t = s59.t(i11);
                    int i12 = o.getInt(o10);
                    d2.a().getClass();
                    ls8 b2 = p29.b(i12);
                    long j9 = o.getLong(o11);
                    String string2 = o.isNull(o12) ? null : o.getString(o12);
                    if (o.isNull(o13)) {
                        i2 = i10;
                        str = null;
                    } else {
                        str = o.getString(o13);
                        i2 = i10;
                    }
                    byte[] blob = o.isNull(i2) ? null : o.getBlob(i2);
                    d2.a().getClass();
                    jj7 b3 = fu7.b(blob);
                    i10 = i2;
                    int i13 = o15;
                    int i14 = o.getInt(i13);
                    o15 = i13;
                    int i15 = o16;
                    boolean z = false;
                    o16 = i15;
                    boolean z2 = o.getInt(i15) != 0;
                    int i16 = o17;
                    int i17 = o.getInt(i16);
                    o17 = i16;
                    int i18 = o18;
                    long j10 = o.getLong(i18);
                    o18 = i18;
                    int i19 = o19;
                    boolean z3 = o.getInt(i19) != 0;
                    int i20 = o20;
                    int i21 = i19;
                    int i22 = i20;
                    long j11 = o.getLong(i22);
                    int i23 = i22;
                    int i24 = o21;
                    if (o.isNull(i24)) {
                        o21 = i24;
                        i3 = o22;
                        str2 = null;
                    } else {
                        str2 = o.getString(i24);
                        o21 = i24;
                        i3 = o22;
                    }
                    if (o.isNull(i3)) {
                        o22 = i3;
                        i4 = o23;
                        str3 = null;
                    } else {
                        str3 = o.getString(i3);
                        o22 = i3;
                        i4 = o23;
                    }
                    long j12 = o.getLong(i4);
                    o23 = i4;
                    int i25 = o24;
                    long j13 = o.getLong(i25);
                    o24 = i25;
                    int i26 = o25;
                    int i27 = o.getInt(i26);
                    d2.a().getClass();
                    int a3 = us8.a(i27);
                    o25 = i26;
                    int i28 = o26;
                    long j14 = o.getLong(i28);
                    o26 = i28;
                    int i29 = o27;
                    int i30 = o.getInt(i29);
                    o27 = i29;
                    int i31 = o28;
                    int i32 = o.getInt(i31);
                    o28 = i31;
                    int i33 = o29;
                    int i34 = o.getInt(i33);
                    o29 = i33;
                    int i35 = o30;
                    long j15 = o.getLong(i35);
                    o30 = i35;
                    int i36 = o31;
                    int i37 = o.getInt(i36);
                    o31 = i36;
                    int i38 = o32;
                    int i39 = o.getInt(i38);
                    o32 = i38;
                    int i40 = o33;
                    long j16 = o.getLong(i40);
                    o33 = i40;
                    int i41 = o34;
                    byte[] blob2 = o.isNull(i41) ? null : o.getBlob(i41);
                    d2.a().getClass();
                    List a4 = p29.a(blob2);
                    o34 = i41;
                    int i42 = o35;
                    if (o.isNull(i42)) {
                        i5 = i42;
                        i6 = o13;
                        bArr = null;
                    } else {
                        i5 = i42;
                        bArr = o.getBlob(i42);
                        i6 = o13;
                    }
                    yr8 c2 = d2.a().c(bArr);
                    int i43 = o36;
                    if (o.isNull(i43)) {
                        i7 = o37;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i43));
                        i7 = o37;
                    }
                    Integer valueOf = o.isNull(i7) ? null : Integer.valueOf(o.getInt(i7));
                    if (valueOf == null) {
                        o36 = i43;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z = true;
                        }
                        bool = Boolean.valueOf(z);
                        o36 = i43;
                    }
                    arrayList.add(new jp8(j3, j4, j5, j6, j7, j8, string, t, b2, j9, string2, str, b3, i14, z2, i17, j10, z3, j11, str2, str3, j12, j13, a3, j14, i30, i32, i34, j15, i37, i39, j16, a4, c2, l, bool));
                    o37 = i7;
                    o19 = i21;
                    o13 = i6;
                    o20 = i23;
                    o35 = i5;
                }
                o.close();
                pec.m();
                ArrayList arrayList2 = new ArrayList(q23.H(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(nec2.b((jp8) it.next()));
                }
                return rp82.b(arrayList2);
            } catch (Throwable th) {
                th = th;
                o.close();
                pec.m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            pec = a2;
            o.close();
            pec.m();
            throw th;
        }
    }

    public final ArrayList n(long j, long j2, long j3, boolean z, md4 md4) {
        nec nec;
        ArrayList<jp8> arrayList;
        pec pec;
        String str;
        int i2;
        String str2;
        int i3;
        String str3;
        int i4;
        int i5;
        int i6;
        byte[] bArr;
        Long l;
        int i7;
        Boolean bool;
        pec pec2;
        String str4;
        int i8;
        String str5;
        int i9;
        String str6;
        int i10;
        int i11;
        int i12;
        byte[] bArr2;
        Long l2;
        int i13;
        Boolean bool2;
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        boolean z2 = z;
        StringBuilder k = hr1.k(j4, "selectFromTo chatId = ", "; timeFrom = ");
        k.append(j5);
        hr1.s(k, "; timeTo = ", j6, "; backwards = ");
        k.append(z2);
        udd.q("to8", k.toString());
        nec nec2 = ((hz3) this.a).c;
        nec2.getClass();
        int ordinal = md4.ordinal();
        if (ordinal == 0) {
            nec = nec2;
            arrayList = nec.d().d(j, j2, z, j3);
        } else if (ordinal == 1) {
            cw8 d2 = nec2.d();
            aec aec = d2.a;
            nec = nec2;
            String str7 = "delayed_attrs_notify_sender";
            String str8 = "delayed_attrs_time_to_fire";
            String str9 = "reactions";
            String str10 = "elements";
            String str11 = "live_until";
            String str12 = "options";
            String str13 = "zoom";
            String str14 = "view_time";
            String str15 = "channel_forwards";
            String str16 = "channel_views";
            String str17 = "ttl";
            String str18 = "chat_id";
            String str19 = "type";
            String str20 = "msg_link_out_msg_id";
            String str21 = "msg_link_out_chat_id";
            String str22 = "msg_link_chat_link";
            String str23 = "msg_link_chat_name";
            String str24 = "msg_link_chat_id";
            String str25 = "inserted_from_msg_link";
            String str26 = "msg_link_id";
            String str27 = "msg_link_type";
            String str28 = "detect_share";
            String str29 = "media_type";
            String str30 = "attaches";
            String str31 = "localized_error";
            String str32 = "error";
            String str33 = "time_local";
            String str34 = "status";
            String str35 = "delivery_status";
            String str36 = "text";
            if (z2) {
                String str37 = "cid";
                pec a2 = pec.a(5, "SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire >= ? AND delayed_attrs_time_to_fire <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire ASC LIMIT ?");
                a2.j(1, j4);
                a2.j(2, j5);
                us8.n(a2, 3, j6, d2);
                a2.j(4, (long) 10);
                a2.j(5, (long) 40);
                aec.b();
                Cursor o = aec.o(a2, (CancellationSignal) null);
                try {
                    int o2 = gp0.o(o, ApiProtocol.KEY_ID);
                    int o3 = gp0.o(o, "server_id");
                    int o4 = gp0.o(o, "time");
                    int o5 = gp0.o(o, "update_time");
                    int o6 = gp0.o(o, "sender");
                    int o7 = gp0.o(o, str37);
                    int o8 = gp0.o(o, str36);
                    int o9 = gp0.o(o, str35);
                    int o10 = gp0.o(o, str34);
                    int o11 = gp0.o(o, str33);
                    int o12 = gp0.o(o, str32);
                    int o13 = gp0.o(o, str31);
                    int o14 = gp0.o(o, str30);
                    pec2 = a2;
                    try {
                        int o15 = gp0.o(o, str29);
                        int o16 = gp0.o(o, str28);
                        int o17 = gp0.o(o, str27);
                        int o18 = gp0.o(o, str26);
                        int o19 = gp0.o(o, str25);
                        int o20 = gp0.o(o, str24);
                        int o21 = gp0.o(o, str23);
                        int o22 = gp0.o(o, str22);
                        int o23 = gp0.o(o, str21);
                        int o24 = gp0.o(o, str20);
                        int o25 = gp0.o(o, str19);
                        int o26 = gp0.o(o, str18);
                        int o27 = gp0.o(o, str17);
                        int o28 = gp0.o(o, str16);
                        int o29 = gp0.o(o, str15);
                        int o30 = gp0.o(o, str14);
                        int o31 = gp0.o(o, str13);
                        int o32 = gp0.o(o, str12);
                        int o33 = gp0.o(o, str11);
                        int o34 = gp0.o(o, str10);
                        int o35 = gp0.o(o, str9);
                        int o36 = gp0.o(o, str8);
                        int o37 = gp0.o(o, str7);
                        int i14 = o14;
                        arrayList = new ArrayList<>(o.getCount());
                        while (o.moveToNext()) {
                            long j7 = o.getLong(o2);
                            long j8 = o.getLong(o3);
                            long j9 = o.getLong(o4);
                            long j10 = o.getLong(o5);
                            long j11 = o.getLong(o6);
                            long j12 = o.getLong(o7);
                            String string = o.isNull(o8) ? null : o.getString(o8);
                            int i15 = o.getInt(o9);
                            d2.a().getClass();
                            bp8.b.getClass();
                            bp8 t = s59.t(i15);
                            int i16 = o.getInt(o10);
                            d2.a().getClass();
                            ls8 b2 = p29.b(i16);
                            long j13 = o.getLong(o11);
                            String string2 = o.isNull(o12) ? null : o.getString(o12);
                            if (o.isNull(o13)) {
                                i8 = i14;
                                str4 = null;
                            } else {
                                str4 = o.getString(o13);
                                i8 = i14;
                            }
                            byte[] blob = o.isNull(i8) ? null : o.getBlob(i8);
                            d2.a().getClass();
                            jj7 b3 = fu7.b(blob);
                            int i17 = o2;
                            int i18 = o15;
                            int i19 = o.getInt(i18);
                            o15 = i18;
                            int i20 = o16;
                            o16 = i20;
                            boolean z3 = o.getInt(i20) != 0;
                            int i21 = o17;
                            int i22 = o.getInt(i21);
                            o17 = i21;
                            int i23 = o18;
                            long j14 = o.getLong(i23);
                            o18 = i23;
                            int i24 = o19;
                            o19 = i24;
                            boolean z4 = o.getInt(i24) != 0;
                            int i25 = o20;
                            long j15 = o.getLong(i25);
                            o20 = i25;
                            int i26 = o21;
                            if (o.isNull(i26)) {
                                o21 = i26;
                                i9 = o22;
                                str5 = null;
                            } else {
                                str5 = o.getString(i26);
                                o21 = i26;
                                i9 = o22;
                            }
                            if (o.isNull(i9)) {
                                o22 = i9;
                                i10 = o23;
                                str6 = null;
                            } else {
                                str6 = o.getString(i9);
                                o22 = i9;
                                i10 = o23;
                            }
                            long j16 = o.getLong(i10);
                            o23 = i10;
                            int i27 = o24;
                            long j17 = o.getLong(i27);
                            o24 = i27;
                            int i28 = o25;
                            int i29 = o.getInt(i28);
                            d2.a().getClass();
                            int a3 = us8.a(i29);
                            o25 = i28;
                            int i30 = o26;
                            long j18 = o.getLong(i30);
                            o26 = i30;
                            int i31 = o27;
                            int i32 = o.getInt(i31);
                            o27 = i31;
                            int i33 = o28;
                            int i34 = o.getInt(i33);
                            o28 = i33;
                            int i35 = o29;
                            int i36 = o.getInt(i35);
                            o29 = i35;
                            int i37 = o30;
                            long j19 = o.getLong(i37);
                            o30 = i37;
                            int i38 = o31;
                            int i39 = o.getInt(i38);
                            o31 = i38;
                            int i40 = o32;
                            int i41 = o.getInt(i40);
                            o32 = i40;
                            int i42 = o33;
                            long j20 = o.getLong(i42);
                            o33 = i42;
                            int i43 = o34;
                            byte[] blob2 = o.isNull(i43) ? null : o.getBlob(i43);
                            d2.a().getClass();
                            List a4 = p29.a(blob2);
                            o34 = i43;
                            int i44 = o35;
                            if (o.isNull(i44)) {
                                i11 = i44;
                                i12 = o3;
                                bArr2 = null;
                            } else {
                                i11 = i44;
                                bArr2 = o.getBlob(i44);
                                i12 = o3;
                            }
                            yr8 c2 = d2.a().c(bArr2);
                            int i45 = o36;
                            if (o.isNull(i45)) {
                                i13 = o37;
                                l2 = null;
                            } else {
                                l2 = Long.valueOf(o.getLong(i45));
                                i13 = o37;
                            }
                            Integer valueOf = o.isNull(i13) ? null : Integer.valueOf(o.getInt(i13));
                            if (valueOf == null) {
                                o36 = i45;
                                bool2 = null;
                            } else {
                                o36 = i45;
                                bool2 = Boolean.valueOf(valueOf.intValue() != 0);
                            }
                            arrayList.add(new jp8(j7, j8, j9, j10, j11, j12, string, t, b2, j13, string2, str4, b3, i19, z3, i22, j14, z4, j15, str5, str6, j16, j17, a3, j18, i32, i34, i36, j19, i39, i41, j20, a4, c2, l2, bool2));
                            o37 = i13;
                            o3 = i12;
                            o2 = i17;
                            o35 = i11;
                            i14 = i8;
                        }
                        o.close();
                        pec2.m();
                    } catch (Throwable th) {
                        th = th;
                        o.close();
                        pec2.m();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    pec2 = a2;
                    o.close();
                    pec2.m();
                    throw th;
                }
            } else {
                String str38 = "cid";
                pec a5 = pec.a(5, "SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire >= ? AND delayed_attrs_time_to_fire <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire DESC LIMIT ?");
                a5.j(1, j4);
                a5.j(2, j5);
                us8.n(a5, 3, j6, d2);
                a5.j(4, (long) 10);
                a5.j(5, (long) 40);
                aec.b();
                Cursor o38 = aec.o(a5, (CancellationSignal) null);
                try {
                    int o39 = gp0.o(o38, ApiProtocol.KEY_ID);
                    int o40 = gp0.o(o38, "server_id");
                    int o41 = gp0.o(o38, "time");
                    int o42 = gp0.o(o38, "update_time");
                    int o43 = gp0.o(o38, "sender");
                    int o44 = gp0.o(o38, str38);
                    int o45 = gp0.o(o38, str36);
                    int o46 = gp0.o(o38, str35);
                    int o47 = gp0.o(o38, str34);
                    int o48 = gp0.o(o38, str33);
                    int o49 = gp0.o(o38, str32);
                    int o50 = gp0.o(o38, str31);
                    int o51 = gp0.o(o38, str30);
                    pec = a5;
                    try {
                        int o52 = gp0.o(o38, str29);
                        int o53 = gp0.o(o38, str28);
                        int o54 = gp0.o(o38, str27);
                        int o55 = gp0.o(o38, str26);
                        int o56 = gp0.o(o38, str25);
                        int o57 = gp0.o(o38, str24);
                        int o58 = gp0.o(o38, str23);
                        int o59 = gp0.o(o38, str22);
                        int o60 = gp0.o(o38, str21);
                        int o61 = gp0.o(o38, str20);
                        int o62 = gp0.o(o38, str19);
                        int o63 = gp0.o(o38, str18);
                        int o64 = gp0.o(o38, str17);
                        int o65 = gp0.o(o38, str16);
                        int o66 = gp0.o(o38, str15);
                        int o67 = gp0.o(o38, str14);
                        int o68 = gp0.o(o38, str13);
                        int o69 = gp0.o(o38, str12);
                        int o70 = gp0.o(o38, str11);
                        int o71 = gp0.o(o38, str10);
                        int o72 = gp0.o(o38, str9);
                        int o73 = gp0.o(o38, str8);
                        int o74 = gp0.o(o38, str7);
                        int i46 = o51;
                        arrayList = new ArrayList<>(o38.getCount());
                        while (o38.moveToNext()) {
                            long j21 = o38.getLong(o39);
                            long j22 = o38.getLong(o40);
                            long j23 = o38.getLong(o41);
                            long j24 = o38.getLong(o42);
                            long j25 = o38.getLong(o43);
                            long j26 = o38.getLong(o44);
                            String string3 = o38.isNull(o45) ? null : o38.getString(o45);
                            int i47 = o38.getInt(o46);
                            d2.a().getClass();
                            bp8.b.getClass();
                            bp8 t2 = s59.t(i47);
                            int i48 = o38.getInt(o47);
                            d2.a().getClass();
                            ls8 b4 = p29.b(i48);
                            long j27 = o38.getLong(o48);
                            String string4 = o38.isNull(o49) ? null : o38.getString(o49);
                            if (o38.isNull(o50)) {
                                i2 = i46;
                                str = null;
                            } else {
                                str = o38.getString(o50);
                                i2 = i46;
                            }
                            byte[] blob3 = o38.isNull(i2) ? null : o38.getBlob(i2);
                            d2.a().getClass();
                            jj7 b5 = fu7.b(blob3);
                            int i49 = o50;
                            int i50 = o52;
                            int i51 = o38.getInt(i50);
                            o52 = i50;
                            int i52 = o53;
                            o53 = i52;
                            boolean z5 = o38.getInt(i52) != 0;
                            int i53 = o54;
                            int i54 = o38.getInt(i53);
                            o54 = i53;
                            int i55 = o55;
                            long j28 = o38.getLong(i55);
                            o55 = i55;
                            int i56 = o56;
                            o56 = i56;
                            boolean z6 = o38.getInt(i56) != 0;
                            int i57 = o57;
                            long j29 = o38.getLong(i57);
                            o57 = i57;
                            int i58 = o58;
                            if (o38.isNull(i58)) {
                                o58 = i58;
                                i3 = o59;
                                str2 = null;
                            } else {
                                str2 = o38.getString(i58);
                                o58 = i58;
                                i3 = o59;
                            }
                            if (o38.isNull(i3)) {
                                o59 = i3;
                                i4 = o60;
                                str3 = null;
                            } else {
                                str3 = o38.getString(i3);
                                o59 = i3;
                                i4 = o60;
                            }
                            long j30 = o38.getLong(i4);
                            o60 = i4;
                            int i59 = o61;
                            long j31 = o38.getLong(i59);
                            o61 = i59;
                            int i60 = o62;
                            int i61 = o38.getInt(i60);
                            d2.a().getClass();
                            int a6 = us8.a(i61);
                            o62 = i60;
                            int i62 = o63;
                            long j32 = o38.getLong(i62);
                            o63 = i62;
                            int i63 = o64;
                            int i64 = o38.getInt(i63);
                            o64 = i63;
                            int i65 = o65;
                            int i66 = o38.getInt(i65);
                            o65 = i65;
                            int i67 = o66;
                            int i68 = o38.getInt(i67);
                            o66 = i67;
                            int i69 = o67;
                            long j33 = o38.getLong(i69);
                            o67 = i69;
                            int i70 = o68;
                            int i71 = o38.getInt(i70);
                            o68 = i70;
                            int i72 = o69;
                            int i73 = o38.getInt(i72);
                            o69 = i72;
                            int i74 = o70;
                            long j34 = o38.getLong(i74);
                            o70 = i74;
                            int i75 = o71;
                            byte[] blob4 = o38.isNull(i75) ? null : o38.getBlob(i75);
                            d2.a().getClass();
                            List a7 = p29.a(blob4);
                            o71 = i75;
                            int i76 = o72;
                            if (o38.isNull(i76)) {
                                i5 = i76;
                                i6 = i2;
                                bArr = null;
                            } else {
                                i5 = i76;
                                bArr = o38.getBlob(i76);
                                i6 = i2;
                            }
                            yr8 c3 = d2.a().c(bArr);
                            int i77 = o73;
                            if (o38.isNull(i77)) {
                                i7 = o74;
                                l = null;
                            } else {
                                l = Long.valueOf(o38.getLong(i77));
                                i7 = o74;
                            }
                            Integer valueOf2 = o38.isNull(i7) ? null : Integer.valueOf(o38.getInt(i7));
                            if (valueOf2 == null) {
                                o73 = i77;
                                bool = null;
                            } else {
                                o73 = i77;
                                bool = Boolean.valueOf(valueOf2.intValue() != 0);
                            }
                            arrayList.add(new jp8(j21, j22, j23, j24, j25, j26, string3, t2, b4, j27, string4, str, b5, i51, z5, i54, j28, z6, j29, str2, str3, j30, j31, a6, j32, i64, i66, i68, j33, i71, i73, j34, a7, c3, l, bool));
                            o74 = i7;
                            o50 = i49;
                            i46 = i6;
                            o72 = i5;
                        }
                        o38.close();
                        pec.m();
                    } catch (Throwable th3) {
                        th = th3;
                        o38.close();
                        pec.m();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    pec = a5;
                    o38.close();
                    pec.m();
                    throw th;
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList2 = new ArrayList(q23.H(arrayList, 10));
        for (jp8 b6 : arrayList) {
            arrayList2.add(nec.b(b6));
        }
        if (z) {
            Collections.reverse(arrayList2);
        }
        return arrayList2;
    }

    public final vo8 o(long j) {
        pec pec;
        String str;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        String str2;
        int i5;
        String str3;
        int i6;
        int i7;
        int i8;
        byte[] bArr;
        Long l;
        int i9;
        Boolean bool;
        nec nec = ((hz3) this.a).c;
        cw8 d2 = nec.d();
        d2.getClass();
        pec a2 = pec.a(3, "SELECT * FROM messages WHERE chat_id = ? AND server_id > 0 AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time DESC LIMIT ?");
        us8.n(a2, 1, j, d2);
        a2.j(2, (long) 10);
        a2.j(3, (long) 1);
        aec aec = d2.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            int o2 = gp0.o(o, ApiProtocol.KEY_ID);
            int o3 = gp0.o(o, "server_id");
            int o4 = gp0.o(o, "time");
            int o5 = gp0.o(o, "update_time");
            int o6 = gp0.o(o, "sender");
            int o7 = gp0.o(o, "cid");
            int o8 = gp0.o(o, "text");
            int o9 = gp0.o(o, "delivery_status");
            int o10 = gp0.o(o, "status");
            int o11 = gp0.o(o, "time_local");
            int o12 = gp0.o(o, "error");
            int o13 = gp0.o(o, "localized_error");
            nec nec2 = nec;
            int o14 = gp0.o(o, "attaches");
            pec = a2;
            try {
                int o15 = gp0.o(o, "media_type");
                int o16 = gp0.o(o, "detect_share");
                int o17 = gp0.o(o, "msg_link_type");
                int o18 = gp0.o(o, "msg_link_id");
                int o19 = gp0.o(o, "inserted_from_msg_link");
                int o20 = gp0.o(o, "msg_link_chat_id");
                int o21 = gp0.o(o, "msg_link_chat_name");
                int o22 = gp0.o(o, "msg_link_chat_link");
                int o23 = gp0.o(o, "msg_link_out_chat_id");
                int o24 = gp0.o(o, "msg_link_out_msg_id");
                int o25 = gp0.o(o, "type");
                int o26 = gp0.o(o, "chat_id");
                int o27 = gp0.o(o, "ttl");
                int o28 = gp0.o(o, "channel_views");
                int o29 = gp0.o(o, "channel_forwards");
                int o30 = gp0.o(o, "view_time");
                int o31 = gp0.o(o, "zoom");
                int o32 = gp0.o(o, "options");
                int o33 = gp0.o(o, "live_until");
                int o34 = gp0.o(o, "elements");
                int o35 = gp0.o(o, "reactions");
                int o36 = gp0.o(o, "delayed_attrs_time_to_fire");
                int o37 = gp0.o(o, "delayed_attrs_notify_sender");
                int i10 = o14;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j2 = o.getLong(o2);
                    long j3 = o.getLong(o3);
                    long j4 = o.getLong(o4);
                    long j5 = o.getLong(o5);
                    long j6 = o.getLong(o6);
                    long j7 = o.getLong(o7);
                    String string = o.isNull(o8) ? null : o.getString(o8);
                    int i11 = o.getInt(o9);
                    d2.a().getClass();
                    bp8.b.getClass();
                    bp8 t = s59.t(i11);
                    int i12 = o.getInt(o10);
                    d2.a().getClass();
                    ls8 b2 = p29.b(i12);
                    long j8 = o.getLong(o11);
                    String string2 = o.isNull(o12) ? null : o.getString(o12);
                    if (o.isNull(o13)) {
                        i2 = i10;
                        str = null;
                    } else {
                        str = o.getString(o13);
                        i2 = i10;
                    }
                    byte[] blob = o.isNull(i2) ? null : o.getBlob(i2);
                    d2.a().getClass();
                    jj7 b3 = fu7.b(blob);
                    i10 = i2;
                    int i13 = o15;
                    int i14 = o.getInt(i13);
                    o15 = i13;
                    int i15 = o16;
                    boolean z3 = false;
                    if (o.getInt(i15) != 0) {
                        o16 = i15;
                        i3 = o17;
                        z = true;
                    } else {
                        o16 = i15;
                        i3 = o17;
                        z = false;
                    }
                    int i16 = o.getInt(i3);
                    o17 = i3;
                    int i17 = o18;
                    long j9 = o.getLong(i17);
                    o18 = i17;
                    int i18 = o19;
                    if (o.getInt(i18) != 0) {
                        o19 = i18;
                        i4 = o20;
                        z2 = true;
                    } else {
                        o19 = i18;
                        i4 = o20;
                        z2 = false;
                    }
                    long j10 = o.getLong(i4);
                    o20 = i4;
                    int i19 = o21;
                    if (o.isNull(i19)) {
                        o21 = i19;
                        i5 = o22;
                        str2 = null;
                    } else {
                        str2 = o.getString(i19);
                        o21 = i19;
                        i5 = o22;
                    }
                    if (o.isNull(i5)) {
                        o22 = i5;
                        i6 = o23;
                        str3 = null;
                    } else {
                        str3 = o.getString(i5);
                        o22 = i5;
                        i6 = o23;
                    }
                    long j11 = o.getLong(i6);
                    o23 = i6;
                    int i20 = o24;
                    long j12 = o.getLong(i20);
                    o24 = i20;
                    int i21 = o25;
                    int i22 = o.getInt(i21);
                    d2.a().getClass();
                    int a3 = us8.a(i22);
                    o25 = i21;
                    int i23 = o26;
                    long j13 = o.getLong(i23);
                    o26 = i23;
                    int i24 = o27;
                    int i25 = o.getInt(i24);
                    o27 = i24;
                    int i26 = o28;
                    int i27 = o.getInt(i26);
                    o28 = i26;
                    int i28 = o29;
                    int i29 = o.getInt(i28);
                    o29 = i28;
                    int i30 = o30;
                    long j14 = o.getLong(i30);
                    o30 = i30;
                    int i31 = o31;
                    int i32 = o.getInt(i31);
                    o31 = i31;
                    int i33 = o32;
                    int i34 = o.getInt(i33);
                    o32 = i33;
                    int i35 = o33;
                    long j15 = o.getLong(i35);
                    o33 = i35;
                    int i36 = o34;
                    byte[] blob2 = o.isNull(i36) ? null : o.getBlob(i36);
                    d2.a().getClass();
                    List a4 = p29.a(blob2);
                    o34 = i36;
                    int i37 = o35;
                    if (o.isNull(i37)) {
                        i7 = i37;
                        i8 = o12;
                        bArr = null;
                    } else {
                        i7 = i37;
                        bArr = o.getBlob(i37);
                        i8 = o12;
                    }
                    yr8 c2 = d2.a().c(bArr);
                    int i38 = o36;
                    if (o.isNull(i38)) {
                        i9 = o37;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i38));
                        i9 = o37;
                    }
                    Integer valueOf = o.isNull(i9) ? null : Integer.valueOf(o.getInt(i9));
                    if (valueOf == null) {
                        o36 = i38;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z3 = true;
                        }
                        bool = Boolean.valueOf(z3);
                        o36 = i38;
                    }
                    arrayList.add(new jp8(j2, j3, j4, j5, j6, j7, string, t, b2, j8, string2, str, b3, i14, z, i16, j9, z2, j10, str2, str3, j11, j12, a3, j13, i25, i27, i29, j14, i32, i34, j15, a4, c2, l, bool));
                    o37 = i9;
                    o12 = i8;
                    o35 = i7;
                }
                o.close();
                pec.m();
                jp8 jp8 = (jp8) o23.X(arrayList);
                if (jp8 != null) {
                    return nec2.b(jp8);
                }
                return null;
            } catch (Throwable th) {
                th = th;
                o.close();
                pec.m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            pec = a2;
            o.close();
            pec.m();
            throw th;
        }
    }

    public final vo8 p(long j, md4 md4) {
        nec nec;
        ArrayList<jp8> arrayList;
        pec pec;
        String str;
        int i2;
        boolean z;
        int i3;
        String str2;
        int i4;
        String str3;
        int i5;
        int i6;
        int i7;
        byte[] bArr;
        Long l;
        int i8;
        Boolean bool;
        long j2 = j;
        nec nec2 = ((hz3) this.a).c;
        nec2.getClass();
        int ordinal = md4.ordinal();
        if (ordinal == 0) {
            cw8 d2 = nec2.d();
            d2.getClass();
            pec a2 = pec.a(3, "SELECT * FROM messages WHERE chat_id = ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time DESC LIMIT ?");
            us8.n(a2, 1, j2, d2);
            a2.j(2, (long) 10);
            a2.j(3, 1);
            aec aec = d2.a;
            aec.b();
            Cursor o = aec.o(a2, (CancellationSignal) null);
            try {
                int o2 = gp0.o(o, ApiProtocol.KEY_ID);
                int o3 = gp0.o(o, "server_id");
                int o4 = gp0.o(o, "time");
                int o5 = gp0.o(o, "update_time");
                int o6 = gp0.o(o, "sender");
                int o7 = gp0.o(o, "cid");
                int o8 = gp0.o(o, "text");
                int o9 = gp0.o(o, "delivery_status");
                int o10 = gp0.o(o, "status");
                int o11 = gp0.o(o, "time_local");
                int o12 = gp0.o(o, "error");
                int o13 = gp0.o(o, "localized_error");
                nec = nec2;
                int o14 = gp0.o(o, "attaches");
                pec = a2;
                try {
                    int o15 = gp0.o(o, "media_type");
                    int o16 = gp0.o(o, "detect_share");
                    int o17 = gp0.o(o, "msg_link_type");
                    int o18 = gp0.o(o, "msg_link_id");
                    int o19 = gp0.o(o, "inserted_from_msg_link");
                    int o20 = gp0.o(o, "msg_link_chat_id");
                    int o21 = gp0.o(o, "msg_link_chat_name");
                    int o22 = gp0.o(o, "msg_link_chat_link");
                    int o23 = gp0.o(o, "msg_link_out_chat_id");
                    int o24 = gp0.o(o, "msg_link_out_msg_id");
                    int o25 = gp0.o(o, "type");
                    int o26 = gp0.o(o, "chat_id");
                    int o27 = gp0.o(o, "ttl");
                    int o28 = gp0.o(o, "channel_views");
                    int o29 = gp0.o(o, "channel_forwards");
                    int o30 = gp0.o(o, "view_time");
                    int o31 = gp0.o(o, "zoom");
                    int o32 = gp0.o(o, "options");
                    int o33 = gp0.o(o, "live_until");
                    int o34 = gp0.o(o, "elements");
                    int o35 = gp0.o(o, "reactions");
                    int o36 = gp0.o(o, "delayed_attrs_time_to_fire");
                    int o37 = gp0.o(o, "delayed_attrs_notify_sender");
                    int i9 = o14;
                    ArrayList arrayList2 = new ArrayList(o.getCount());
                    while (o.moveToNext()) {
                        long j3 = o.getLong(o2);
                        long j4 = o.getLong(o3);
                        long j5 = o.getLong(o4);
                        long j6 = o.getLong(o5);
                        long j7 = o.getLong(o6);
                        long j8 = o.getLong(o7);
                        String string = o.isNull(o8) ? null : o.getString(o8);
                        int i10 = o.getInt(o9);
                        d2.a().getClass();
                        bp8.b.getClass();
                        bp8 t = s59.t(i10);
                        int i11 = o.getInt(o10);
                        d2.a().getClass();
                        ls8 b2 = p29.b(i11);
                        long j9 = o.getLong(o11);
                        String string2 = o.isNull(o12) ? null : o.getString(o12);
                        if (o.isNull(o13)) {
                            i2 = i9;
                            str = null;
                        } else {
                            str = o.getString(o13);
                            i2 = i9;
                        }
                        byte[] blob = o.isNull(i2) ? null : o.getBlob(i2);
                        d2.a().getClass();
                        jj7 b3 = fu7.b(blob);
                        int i12 = o2;
                        int i13 = o15;
                        int i14 = o.getInt(i13);
                        o15 = i13;
                        int i15 = o16;
                        int i16 = o.getInt(i15);
                        boolean z2 = false;
                        o16 = i15;
                        int i17 = o17;
                        boolean z3 = i16 != 0;
                        int i18 = o.getInt(i17);
                        int i19 = i17;
                        int i20 = o18;
                        long j10 = o.getLong(i20);
                        o18 = i20;
                        int i21 = o19;
                        if (o.getInt(i21) != 0) {
                            o19 = i21;
                            i3 = o20;
                            z = true;
                        } else {
                            o19 = i21;
                            i3 = o20;
                            z = false;
                        }
                        long j11 = o.getLong(i3);
                        o20 = i3;
                        int i22 = o21;
                        if (o.isNull(i22)) {
                            o21 = i22;
                            i4 = o22;
                            str2 = null;
                        } else {
                            str2 = o.getString(i22);
                            o21 = i22;
                            i4 = o22;
                        }
                        if (o.isNull(i4)) {
                            o22 = i4;
                            i5 = o23;
                            str3 = null;
                        } else {
                            str3 = o.getString(i4);
                            o22 = i4;
                            i5 = o23;
                        }
                        long j12 = o.getLong(i5);
                        o23 = i5;
                        int i23 = o24;
                        long j13 = o.getLong(i23);
                        o24 = i23;
                        int i24 = o25;
                        int i25 = o.getInt(i24);
                        d2.a().getClass();
                        int a3 = us8.a(i25);
                        o25 = i24;
                        int i26 = o26;
                        long j14 = o.getLong(i26);
                        o26 = i26;
                        int i27 = o27;
                        int i28 = o.getInt(i27);
                        o27 = i27;
                        int i29 = o28;
                        int i30 = o.getInt(i29);
                        o28 = i29;
                        int i31 = o29;
                        int i32 = o.getInt(i31);
                        o29 = i31;
                        int i33 = o30;
                        long j15 = o.getLong(i33);
                        o30 = i33;
                        int i34 = o31;
                        int i35 = o.getInt(i34);
                        o31 = i34;
                        int i36 = o32;
                        int i37 = o.getInt(i36);
                        o32 = i36;
                        int i38 = o33;
                        long j16 = o.getLong(i38);
                        o33 = i38;
                        int i39 = o34;
                        byte[] blob2 = o.isNull(i39) ? null : o.getBlob(i39);
                        d2.a().getClass();
                        List a4 = p29.a(blob2);
                        o34 = i39;
                        int i40 = o35;
                        if (o.isNull(i40)) {
                            i6 = i40;
                            i7 = o11;
                            bArr = null;
                        } else {
                            i6 = i40;
                            bArr = o.getBlob(i40);
                            i7 = o11;
                        }
                        yr8 c2 = d2.a().c(bArr);
                        int i41 = o36;
                        if (o.isNull(i41)) {
                            i8 = o37;
                            l = null;
                        } else {
                            l = Long.valueOf(o.getLong(i41));
                            i8 = o37;
                        }
                        Integer valueOf = o.isNull(i8) ? null : Integer.valueOf(o.getInt(i8));
                        if (valueOf == null) {
                            o36 = i41;
                            bool = null;
                        } else {
                            if (valueOf.intValue() != 0) {
                                z2 = true;
                            }
                            bool = Boolean.valueOf(z2);
                            o36 = i41;
                        }
                        arrayList2.add(new jp8(j3, j4, j5, j6, j7, j8, string, t, b2, j9, string2, str, b3, i14, z3, i18, j10, z, j11, str2, str3, j12, j13, a3, j14, i28, i30, i32, j15, i35, i37, j16, a4, c2, l, bool));
                        o37 = i8;
                        o11 = i7;
                        o2 = i12;
                        o17 = i19;
                        o35 = i6;
                        i9 = i2;
                    }
                    o.close();
                    pec.m();
                    arrayList = arrayList2;
                } catch (Throwable th) {
                    th = th;
                    o.close();
                    pec.m();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                pec = a2;
                o.close();
                pec.m();
                throw th;
            }
        } else if (ordinal == 1) {
            arrayList = cw8.j(nec2.d(), j2);
            nec = nec2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList3 = new ArrayList(q23.H(arrayList, 10));
        for (jp8 b4 : arrayList) {
            arrayList3.add(nec.b(b4));
        }
        return (vo8) o23.X(arrayList3);
    }

    public final vo8 q(long j) {
        nec nec = ((hz3) this.a).c;
        jp8 c2 = nec.d().c(j);
        if (c2 != null) {
            return nec.b(c2);
        }
        return null;
    }

    public final vo8 r(long j, long j2) {
        nec nec;
        ArrayList arrayList;
        pec pec;
        String str;
        int i2;
        boolean z;
        int i3;
        String str2;
        int i4;
        String str3;
        int i5;
        int i6;
        int i7;
        byte[] bArr;
        Long l;
        int i8;
        Boolean bool;
        pec pec2;
        String str4;
        int i9;
        boolean z2;
        int i10;
        String str5;
        int i11;
        String str6;
        int i12;
        int i13;
        int i14;
        byte[] bArr2;
        Long l2;
        int i15;
        Boolean bool2;
        long j3 = j;
        long j4 = j2;
        md4 md4 = md4.REGULAR;
        nec nec2 = ((hz3) this.a).c;
        nec2.getClass();
        int ordinal = md4.ordinal();
        String str7 = "delayed_attrs_notify_sender";
        String str8 = "delayed_attrs_time_to_fire";
        String str9 = "reactions";
        String str10 = "elements";
        String str11 = "live_until";
        String str12 = "options";
        String str13 = "zoom";
        String str14 = "view_time";
        String str15 = "channel_forwards";
        String str16 = "channel_views";
        String str17 = "ttl";
        String str18 = "chat_id";
        String str19 = "type";
        String str20 = "msg_link_out_msg_id";
        String str21 = "msg_link_out_chat_id";
        String str22 = "msg_link_chat_link";
        String str23 = "msg_link_chat_name";
        String str24 = "msg_link_chat_id";
        String str25 = "inserted_from_msg_link";
        String str26 = "msg_link_id";
        String str27 = "msg_link_type";
        String str28 = "detect_share";
        String str29 = "media_type";
        String str30 = "attaches";
        String str31 = "localized_error";
        String str32 = "error";
        String str33 = "time_local";
        if (ordinal == 0) {
            nec = nec2;
            String str34 = str32;
            String str35 = str33;
            String str36 = str31;
            cw8 d2 = nec.d();
            d2.getClass();
            String str37 = str34;
            String str38 = str35;
            pec a2 = pec.a(4, "SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time ASC LIMIT ?");
            a2.j(1, j3);
            us8.n(a2, 2, j4, d2);
            a2.j(3, (long) 10);
            a2.j(4, (long) 1);
            aec aec = d2.a;
            aec.b();
            Cursor o = aec.o(a2, (CancellationSignal) null);
            try {
                int o2 = gp0.o(o, ApiProtocol.KEY_ID);
                int o3 = gp0.o(o, "server_id");
                int o4 = gp0.o(o, "time");
                int o5 = gp0.o(o, "update_time");
                int o6 = gp0.o(o, "sender");
                int o7 = gp0.o(o, "cid");
                int o8 = gp0.o(o, "text");
                int o9 = gp0.o(o, "delivery_status");
                int o10 = gp0.o(o, "status");
                int o11 = gp0.o(o, str38);
                int o12 = gp0.o(o, str37);
                int o13 = gp0.o(o, str36);
                int o14 = gp0.o(o, str30);
                pec = a2;
                try {
                    int o15 = gp0.o(o, str29);
                    int o16 = gp0.o(o, str28);
                    int o17 = gp0.o(o, str27);
                    int o18 = gp0.o(o, str26);
                    int o19 = gp0.o(o, str25);
                    int o20 = gp0.o(o, str24);
                    int o21 = gp0.o(o, str23);
                    int o22 = gp0.o(o, str22);
                    int o23 = gp0.o(o, str21);
                    int o24 = gp0.o(o, str20);
                    int o25 = gp0.o(o, str19);
                    int o26 = gp0.o(o, str18);
                    int o27 = gp0.o(o, str17);
                    int o28 = gp0.o(o, str16);
                    int o29 = gp0.o(o, str15);
                    int o30 = gp0.o(o, str14);
                    int o31 = gp0.o(o, str13);
                    int o32 = gp0.o(o, str12);
                    int o33 = gp0.o(o, str11);
                    int o34 = gp0.o(o, str10);
                    int o35 = gp0.o(o, str9);
                    int o36 = gp0.o(o, str8);
                    int o37 = gp0.o(o, str7);
                    int i16 = o14;
                    arrayList = new ArrayList(o.getCount());
                    while (o.moveToNext()) {
                        long j5 = o.getLong(o2);
                        long j6 = o.getLong(o3);
                        long j7 = o.getLong(o4);
                        long j8 = o.getLong(o5);
                        long j9 = o.getLong(o6);
                        long j10 = o.getLong(o7);
                        String string = o.isNull(o8) ? null : o.getString(o8);
                        int i17 = o.getInt(o9);
                        d2.a().getClass();
                        bp8.b.getClass();
                        bp8 t = s59.t(i17);
                        int i18 = o.getInt(o10);
                        d2.a().getClass();
                        ls8 b2 = p29.b(i18);
                        long j11 = o.getLong(o11);
                        String string2 = o.isNull(o12) ? null : o.getString(o12);
                        if (o.isNull(o13)) {
                            i2 = i16;
                            str = null;
                        } else {
                            str = o.getString(o13);
                            i2 = i16;
                        }
                        byte[] blob = o.isNull(i2) ? null : o.getBlob(i2);
                        d2.a().getClass();
                        jj7 b3 = fu7.b(blob);
                        int i19 = o2;
                        int i20 = o15;
                        int i21 = o.getInt(i20);
                        o15 = i20;
                        int i22 = o16;
                        o16 = i22;
                        boolean z3 = o.getInt(i22) != 0;
                        int i23 = o17;
                        int i24 = o.getInt(i23);
                        o17 = i23;
                        int i25 = o18;
                        long j12 = o.getLong(i25);
                        o18 = i25;
                        int i26 = o19;
                        if (o.getInt(i26) != 0) {
                            o19 = i26;
                            i3 = o20;
                            z = true;
                        } else {
                            o19 = i26;
                            i3 = o20;
                            z = false;
                        }
                        long j13 = o.getLong(i3);
                        o20 = i3;
                        int i27 = o21;
                        if (o.isNull(i27)) {
                            o21 = i27;
                            i4 = o22;
                            str2 = null;
                        } else {
                            str2 = o.getString(i27);
                            o21 = i27;
                            i4 = o22;
                        }
                        if (o.isNull(i4)) {
                            o22 = i4;
                            i5 = o23;
                            str3 = null;
                        } else {
                            str3 = o.getString(i4);
                            o22 = i4;
                            i5 = o23;
                        }
                        long j14 = o.getLong(i5);
                        o23 = i5;
                        int i28 = o24;
                        long j15 = o.getLong(i28);
                        o24 = i28;
                        int i29 = o25;
                        int i30 = o.getInt(i29);
                        d2.a().getClass();
                        int a3 = us8.a(i30);
                        o25 = i29;
                        int i31 = o26;
                        long j16 = o.getLong(i31);
                        o26 = i31;
                        int i32 = o27;
                        int i33 = o.getInt(i32);
                        o27 = i32;
                        int i34 = o28;
                        int i35 = o.getInt(i34);
                        o28 = i34;
                        int i36 = o29;
                        int i37 = o.getInt(i36);
                        o29 = i36;
                        int i38 = o30;
                        long j17 = o.getLong(i38);
                        o30 = i38;
                        int i39 = o31;
                        int i40 = o.getInt(i39);
                        o31 = i39;
                        int i41 = o32;
                        int i42 = o.getInt(i41);
                        o32 = i41;
                        int i43 = o33;
                        long j18 = o.getLong(i43);
                        o33 = i43;
                        int i44 = o34;
                        byte[] blob2 = o.isNull(i44) ? null : o.getBlob(i44);
                        d2.a().getClass();
                        List a4 = p29.a(blob2);
                        o34 = i44;
                        int i45 = o35;
                        if (o.isNull(i45)) {
                            i6 = i45;
                            i7 = o13;
                            bArr = null;
                        } else {
                            i6 = i45;
                            bArr = o.getBlob(i45);
                            i7 = o13;
                        }
                        yr8 c2 = d2.a().c(bArr);
                        int i46 = o36;
                        if (o.isNull(i46)) {
                            i8 = o37;
                            l = null;
                        } else {
                            l = Long.valueOf(o.getLong(i46));
                            i8 = o37;
                        }
                        Integer valueOf = o.isNull(i8) ? null : Integer.valueOf(o.getInt(i8));
                        if (valueOf == null) {
                            o36 = i46;
                            bool = null;
                        } else {
                            o36 = i46;
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        }
                        arrayList.add(new jp8(j5, j6, j7, j8, j9, j10, string, t, b2, j11, string2, str, b3, i21, z3, i24, j12, z, j13, str2, str3, j14, j15, a3, j16, i33, i35, i37, j17, i40, i42, j18, a4, c2, l, bool));
                        o37 = i8;
                        o13 = i7;
                        o2 = i19;
                        o35 = i6;
                        i16 = i2;
                    }
                    o.close();
                    pec.m();
                } catch (Throwable th) {
                    th = th;
                    o.close();
                    pec.m();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                pec = a2;
                o.close();
                pec.m();
                throw th;
            }
        } else if (ordinal == 1) {
            cw8 d3 = nec2.d();
            d3.getClass();
            nec = nec2;
            String str39 = "status";
            pec a5 = pec.a(4, "SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY time ASC LIMIT ?");
            a5.j(1, j3);
            us8.n(a5, 2, j4, d3);
            a5.j(3, (long) 10);
            a5.j(4, (long) 1);
            aec aec2 = d3.a;
            aec2.b();
            Cursor o38 = aec2.o(a5, (CancellationSignal) null);
            try {
                int o39 = gp0.o(o38, ApiProtocol.KEY_ID);
                int o40 = gp0.o(o38, "server_id");
                int o41 = gp0.o(o38, "time");
                int o42 = gp0.o(o38, "update_time");
                int o43 = gp0.o(o38, "sender");
                int o44 = gp0.o(o38, "cid");
                int o45 = gp0.o(o38, "text");
                int o46 = gp0.o(o38, "delivery_status");
                int o47 = gp0.o(o38, str39);
                int o48 = gp0.o(o38, str33);
                int o49 = gp0.o(o38, str32);
                int o50 = gp0.o(o38, str31);
                int o51 = gp0.o(o38, str30);
                pec2 = a5;
                try {
                    int o52 = gp0.o(o38, str29);
                    int o53 = gp0.o(o38, str28);
                    int o54 = gp0.o(o38, str27);
                    int o55 = gp0.o(o38, str26);
                    int o56 = gp0.o(o38, str25);
                    int o57 = gp0.o(o38, str24);
                    int o58 = gp0.o(o38, str23);
                    int o59 = gp0.o(o38, str22);
                    int o60 = gp0.o(o38, str21);
                    int o61 = gp0.o(o38, str20);
                    int o62 = gp0.o(o38, str19);
                    int o63 = gp0.o(o38, str18);
                    int o64 = gp0.o(o38, str17);
                    int o65 = gp0.o(o38, str16);
                    int o66 = gp0.o(o38, str15);
                    int o67 = gp0.o(o38, str14);
                    int o68 = gp0.o(o38, str13);
                    int o69 = gp0.o(o38, str12);
                    int o70 = gp0.o(o38, str11);
                    int o71 = gp0.o(o38, str10);
                    int o72 = gp0.o(o38, str9);
                    int o73 = gp0.o(o38, str8);
                    int o74 = gp0.o(o38, str7);
                    int i47 = o51;
                    arrayList = new ArrayList(o38.getCount());
                    while (o38.moveToNext()) {
                        long j19 = o38.getLong(o39);
                        long j20 = o38.getLong(o40);
                        long j21 = o38.getLong(o41);
                        long j22 = o38.getLong(o42);
                        long j23 = o38.getLong(o43);
                        long j24 = o38.getLong(o44);
                        String string3 = o38.isNull(o45) ? null : o38.getString(o45);
                        int i48 = o38.getInt(o46);
                        d3.a().getClass();
                        bp8.b.getClass();
                        bp8 t2 = s59.t(i48);
                        int i49 = o38.getInt(o47);
                        d3.a().getClass();
                        ls8 b4 = p29.b(i49);
                        long j25 = o38.getLong(o48);
                        String string4 = o38.isNull(o49) ? null : o38.getString(o49);
                        if (o38.isNull(o50)) {
                            i9 = i47;
                            str4 = null;
                        } else {
                            str4 = o38.getString(o50);
                            i9 = i47;
                        }
                        byte[] blob3 = o38.isNull(i9) ? null : o38.getBlob(i9);
                        d3.a().getClass();
                        jj7 b5 = fu7.b(blob3);
                        int i50 = o39;
                        int i51 = o52;
                        int i52 = o38.getInt(i51);
                        o52 = i51;
                        int i53 = o53;
                        o53 = i53;
                        boolean z4 = o38.getInt(i53) != 0;
                        int i54 = o54;
                        int i55 = o38.getInt(i54);
                        o54 = i54;
                        int i56 = o55;
                        long j26 = o38.getLong(i56);
                        o55 = i56;
                        int i57 = o56;
                        if (o38.getInt(i57) != 0) {
                            o56 = i57;
                            i10 = o57;
                            z2 = true;
                        } else {
                            o56 = i57;
                            i10 = o57;
                            z2 = false;
                        }
                        long j27 = o38.getLong(i10);
                        o57 = i10;
                        int i58 = o58;
                        if (o38.isNull(i58)) {
                            o58 = i58;
                            i11 = o59;
                            str5 = null;
                        } else {
                            str5 = o38.getString(i58);
                            o58 = i58;
                            i11 = o59;
                        }
                        if (o38.isNull(i11)) {
                            o59 = i11;
                            i12 = o60;
                            str6 = null;
                        } else {
                            str6 = o38.getString(i11);
                            o59 = i11;
                            i12 = o60;
                        }
                        long j28 = o38.getLong(i12);
                        o60 = i12;
                        int i59 = o61;
                        long j29 = o38.getLong(i59);
                        o61 = i59;
                        int i60 = o62;
                        int i61 = o38.getInt(i60);
                        d3.a().getClass();
                        int a6 = us8.a(i61);
                        o62 = i60;
                        int i62 = o63;
                        long j30 = o38.getLong(i62);
                        o63 = i62;
                        int i63 = o64;
                        int i64 = o38.getInt(i63);
                        o64 = i63;
                        int i65 = o65;
                        int i66 = o38.getInt(i65);
                        o65 = i65;
                        int i67 = o66;
                        int i68 = o38.getInt(i67);
                        o66 = i67;
                        int i69 = o67;
                        long j31 = o38.getLong(i69);
                        o67 = i69;
                        int i70 = o68;
                        int i71 = o38.getInt(i70);
                        o68 = i70;
                        int i72 = o69;
                        int i73 = o38.getInt(i72);
                        o69 = i72;
                        int i74 = o70;
                        long j32 = o38.getLong(i74);
                        o70 = i74;
                        int i75 = o71;
                        byte[] blob4 = o38.isNull(i75) ? null : o38.getBlob(i75);
                        d3.a().getClass();
                        List a7 = p29.a(blob4);
                        o71 = i75;
                        int i76 = o72;
                        if (o38.isNull(i76)) {
                            i13 = i76;
                            i14 = o40;
                            bArr2 = null;
                        } else {
                            i13 = i76;
                            bArr2 = o38.getBlob(i76);
                            i14 = o40;
                        }
                        yr8 c3 = d3.a().c(bArr2);
                        int i77 = o73;
                        if (o38.isNull(i77)) {
                            i15 = o74;
                            l2 = null;
                        } else {
                            l2 = Long.valueOf(o38.getLong(i77));
                            i15 = o74;
                        }
                        Integer valueOf2 = o38.isNull(i15) ? null : Integer.valueOf(o38.getInt(i15));
                        if (valueOf2 == null) {
                            o73 = i77;
                            bool2 = null;
                        } else {
                            o73 = i77;
                            bool2 = Boolean.valueOf(valueOf2.intValue() != 0);
                        }
                        arrayList.add(new jp8(j19, j20, j21, j22, j23, j24, string3, t2, b4, j25, string4, str4, b5, i52, z4, i55, j26, z2, j27, str5, str6, j28, j29, a6, j30, i64, i66, i68, j31, i71, i73, j32, a7, c3, l2, bool2));
                        o74 = i15;
                        o40 = i14;
                        o39 = i50;
                        o72 = i13;
                        i47 = i9;
                    }
                    o38.close();
                    pec2.m();
                } catch (Throwable th3) {
                    th = th3;
                    o38.close();
                    pec2.m();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                pec2 = a5;
                o38.close();
                pec2.m();
                throw th;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        jp8 jp8 = (jp8) o23.X(arrayList);
        if (jp8 != null) {
            return nec.b(jp8);
        }
        return null;
    }

    public final ArrayList s() {
        pec pec;
        String str;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        String str2;
        int i5;
        String str3;
        int i6;
        int i7;
        int i8;
        byte[] bArr;
        Long l;
        int i9;
        Boolean bool;
        s59 s59 = bp8.b;
        nec nec = ((hz3) this.a).c;
        cw8 d2 = nec.d();
        d2.getClass();
        pec a2 = pec.a(2, "SELECT * FROM messages WHERE delivery_status = ? AND inserted_from_msg_link = 0 AND status <> ?");
        d2.a().getClass();
        long j = (long) 10;
        us8.n(a2, 1, j, d2);
        a2.j(2, j);
        aec aec = d2.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            int o2 = gp0.o(o, ApiProtocol.KEY_ID);
            int o3 = gp0.o(o, "server_id");
            int o4 = gp0.o(o, "time");
            int o5 = gp0.o(o, "update_time");
            int o6 = gp0.o(o, "sender");
            int o7 = gp0.o(o, "cid");
            int o8 = gp0.o(o, "text");
            int o9 = gp0.o(o, "delivery_status");
            int o10 = gp0.o(o, "status");
            int o11 = gp0.o(o, "time_local");
            int o12 = gp0.o(o, "error");
            int o13 = gp0.o(o, "localized_error");
            nec nec2 = nec;
            int o14 = gp0.o(o, "attaches");
            pec = a2;
            try {
                int o15 = gp0.o(o, "media_type");
                int o16 = gp0.o(o, "detect_share");
                int o17 = gp0.o(o, "msg_link_type");
                int o18 = gp0.o(o, "msg_link_id");
                int o19 = gp0.o(o, "inserted_from_msg_link");
                int o20 = gp0.o(o, "msg_link_chat_id");
                int o21 = gp0.o(o, "msg_link_chat_name");
                int o22 = gp0.o(o, "msg_link_chat_link");
                int o23 = gp0.o(o, "msg_link_out_chat_id");
                int o24 = gp0.o(o, "msg_link_out_msg_id");
                int o25 = gp0.o(o, "type");
                int o26 = gp0.o(o, "chat_id");
                int o27 = gp0.o(o, "ttl");
                int o28 = gp0.o(o, "channel_views");
                int o29 = gp0.o(o, "channel_forwards");
                int o30 = gp0.o(o, "view_time");
                int o31 = gp0.o(o, "zoom");
                int o32 = gp0.o(o, "options");
                int o33 = gp0.o(o, "live_until");
                int o34 = gp0.o(o, "elements");
                int o35 = gp0.o(o, "reactions");
                int o36 = gp0.o(o, "delayed_attrs_time_to_fire");
                int o37 = gp0.o(o, "delayed_attrs_notify_sender");
                int i10 = o14;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j2 = o.getLong(o2);
                    long j3 = o.getLong(o3);
                    long j4 = o.getLong(o4);
                    long j5 = o.getLong(o5);
                    long j6 = o.getLong(o6);
                    long j7 = o.getLong(o7);
                    String string = o.isNull(o8) ? null : o.getString(o8);
                    int i11 = o.getInt(o9);
                    d2.a().getClass();
                    bp8.b.getClass();
                    bp8 t = s59.t(i11);
                    int i12 = o.getInt(o10);
                    d2.a().getClass();
                    ls8 b2 = p29.b(i12);
                    long j8 = o.getLong(o11);
                    String string2 = o.isNull(o12) ? null : o.getString(o12);
                    if (o.isNull(o13)) {
                        i2 = i10;
                        str = null;
                    } else {
                        str = o.getString(o13);
                        i2 = i10;
                    }
                    byte[] blob = o.isNull(i2) ? null : o.getBlob(i2);
                    d2.a().getClass();
                    jj7 b3 = fu7.b(blob);
                    i10 = i2;
                    int i13 = o15;
                    int i14 = o.getInt(i13);
                    o15 = i13;
                    int i15 = o16;
                    boolean z3 = false;
                    if (o.getInt(i15) != 0) {
                        o16 = i15;
                        i3 = o17;
                        z = true;
                    } else {
                        o16 = i15;
                        i3 = o17;
                        z = false;
                    }
                    int i16 = o.getInt(i3);
                    o17 = i3;
                    int i17 = o18;
                    long j9 = o.getLong(i17);
                    o18 = i17;
                    int i18 = o19;
                    if (o.getInt(i18) != 0) {
                        o19 = i18;
                        i4 = o20;
                        z2 = true;
                    } else {
                        o19 = i18;
                        i4 = o20;
                        z2 = false;
                    }
                    long j10 = o.getLong(i4);
                    o20 = i4;
                    int i19 = o21;
                    if (o.isNull(i19)) {
                        o21 = i19;
                        i5 = o22;
                        str2 = null;
                    } else {
                        str2 = o.getString(i19);
                        o21 = i19;
                        i5 = o22;
                    }
                    if (o.isNull(i5)) {
                        o22 = i5;
                        i6 = o23;
                        str3 = null;
                    } else {
                        str3 = o.getString(i5);
                        o22 = i5;
                        i6 = o23;
                    }
                    long j11 = o.getLong(i6);
                    o23 = i6;
                    int i20 = o24;
                    long j12 = o.getLong(i20);
                    o24 = i20;
                    int i21 = o25;
                    int i22 = o.getInt(i21);
                    d2.a().getClass();
                    int a3 = us8.a(i22);
                    o25 = i21;
                    int i23 = o26;
                    long j13 = o.getLong(i23);
                    o26 = i23;
                    int i24 = o27;
                    int i25 = o.getInt(i24);
                    o27 = i24;
                    int i26 = o28;
                    int i27 = o.getInt(i26);
                    o28 = i26;
                    int i28 = o29;
                    int i29 = o.getInt(i28);
                    o29 = i28;
                    int i30 = o30;
                    long j14 = o.getLong(i30);
                    o30 = i30;
                    int i31 = o31;
                    int i32 = o.getInt(i31);
                    o31 = i31;
                    int i33 = o32;
                    int i34 = o.getInt(i33);
                    o32 = i33;
                    int i35 = o33;
                    long j15 = o.getLong(i35);
                    o33 = i35;
                    int i36 = o34;
                    byte[] blob2 = o.isNull(i36) ? null : o.getBlob(i36);
                    d2.a().getClass();
                    List a4 = p29.a(blob2);
                    o34 = i36;
                    int i37 = o35;
                    if (o.isNull(i37)) {
                        i7 = i37;
                        i8 = o13;
                        bArr = null;
                    } else {
                        i7 = i37;
                        bArr = o.getBlob(i37);
                        i8 = o13;
                    }
                    yr8 c2 = d2.a().c(bArr);
                    int i38 = o36;
                    if (o.isNull(i38)) {
                        i9 = o37;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i38));
                        i9 = o37;
                    }
                    Integer valueOf = o.isNull(i9) ? null : Integer.valueOf(o.getInt(i9));
                    if (valueOf == null) {
                        o36 = i38;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z3 = true;
                        }
                        bool = Boolean.valueOf(z3);
                        o36 = i38;
                    }
                    arrayList.add(new jp8(j2, j3, j4, j5, j6, j7, string, t, b2, j8, string2, str, b3, i14, z, i16, j9, z2, j10, str2, str3, j11, j12, a3, j13, i25, i27, i29, j14, i32, i34, j15, a4, c2, l, bool));
                    o37 = i9;
                    o13 = i8;
                    o35 = i7;
                }
                o.close();
                pec.m();
                ArrayList arrayList2 = new ArrayList(q23.H(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(nec2.b((jp8) it.next()));
                }
                return arrayList2;
            } catch (Throwable th) {
                th = th;
                o.close();
                pec.m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            pec = a2;
            o.close();
            pec.m();
            throw th;
        }
    }

    public final vo8 t(vo8 vo8, String str, of3 of3) {
        wwc wwc = tic.a;
        tic.a(new qo8(this, vo8, str, of3), (qmc) wwc.b, (j6) null, new q52(str, 3), (qmc) null);
        try {
            p10 I = vo8.D0.I();
            urd.N(I, str, of3);
            uo8 E = vo8.E();
            E.n = I.c();
            return E.a();
        } catch (Throwable unused) {
            udd.s("to8", "Can't update attach localId = " + str, (Throwable) null);
            return vo8;
        }
    }

    public final xm8 u(vo8 vo8, String str, g10 g10) {
        vo8 t = t(vo8, str, new w48(this, 9, g10));
        rp8 rp8 = (rp8) this.g.get();
        vo8 a2 = t.E().a();
        rp8.getClass();
        return rp8.a(rp8, a2);
    }

    public final void v(long j, String str, of3 of3) {
        ((hz3) this.a).c.n(j, new w48(str, 8, of3));
    }

    public final void w(vo8 vo8, jj7 jj7) {
        ((hz3) this.a).c.n(vo8.b, new ro8(vo8, jj7, 0));
    }

    public final void x(vo8 vo8, bp8 bp8) {
        hz3 hz3 = (hz3) this.a;
        nec nec = hz3.c;
        nec.d().n(vo8.b, bp8);
        if (bp8 == bp8.ERROR && vo8.m()) {
            hz3.c.n(vo8.b, new hy5(29, this));
        }
    }

    public final void y(long j, long j2, ls8 ls8) {
        cw8 d2 = ((hz3) this.a).c.d();
        aec aec = d2.a;
        aec.b();
        th thVar = d2.k;
        yz5 f2 = thVar.f();
        d2.a().getClass();
        f2.j(1, (long) ls8.a);
        f2.j(2, j);
        f2.j(3, j2);
        try {
            aec.c();
            f2.n();
            aec.r();
            aec.l();
            thVar.u(f2);
        } catch (Throwable th) {
            thVar.u(f2);
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void z(long j, String str, List list, t52 t52, ls8 ls8) {
        cw8 d2 = ((hz3) this.a).c.d();
        uve uve = new uve(j, str, list, ls8);
        aec aec = d2.a;
        aec.b();
        aec.c();
        try {
            d2.f.B(uve);
            aec.r();
            aec.l();
            vo8 q = q(j);
            if (q != null) {
                this.f.b(t52.B(q.x0), q);
            }
        } catch (Throwable th) {
            aec.l();
            throw th;
        }
    }
}
