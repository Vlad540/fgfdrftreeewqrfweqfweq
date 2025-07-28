package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: cw8  reason: default package */
public final class cw8 {
    public final aec a;
    public final xp2 b;
    public p29 c;
    public final bw8 d;
    public final bw8 e;
    public final bw8 f;
    public final yv8 g;
    public final yv8 h;
    public final th i;
    public final th j;
    public final th k;
    public final th l;
    public final yv8 m;
    public final yv8 n;
    public final yv8 o;
    public final yv8 p;
    public final yv8 q;
    public final yv8 r;
    public final yv8 s;

    public cw8(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new xp2(this, oneMeRoomDatabase, 1);
        this.d = new bw8(this, oneMeRoomDatabase, 0);
        new bw8(this, oneMeRoomDatabase, 1);
        new f74(oneMeRoomDatabase, 1);
        this.e = new bw8(this, oneMeRoomDatabase, 2);
        new f74(oneMeRoomDatabase, 2);
        this.f = new bw8(this, oneMeRoomDatabase, 3);
        this.g = new yv8(oneMeRoomDatabase, 9);
        this.h = new yv8(oneMeRoomDatabase, 10);
        this.i = new th(oneMeRoomDatabase, 26);
        this.j = new th(oneMeRoomDatabase, 27);
        this.k = new th(oneMeRoomDatabase, 28);
        this.l = new th(oneMeRoomDatabase, 29);
        new yv8(oneMeRoomDatabase, 0);
        this.m = new yv8(oneMeRoomDatabase, 1);
        this.n = new yv8(oneMeRoomDatabase, 2);
        this.o = new yv8(oneMeRoomDatabase, 3);
        this.p = new yv8(oneMeRoomDatabase, 4);
        this.q = new yv8(oneMeRoomDatabase, 5);
        this.r = new yv8(oneMeRoomDatabase, 6);
        this.s = new yv8(oneMeRoomDatabase, 7);
        new yv8(oneMeRoomDatabase, 8);
    }

    public static or8 g(cw8 cw8, jp8 jp8, or8 or8, long j2, Long l2, Long l3, int i2) {
        String str;
        jp8 jp82 = jp8;
        or8 or82 = or8;
        Long l4 = null;
        Long l5 = (i2 & 8) != 0 ? null : l2;
        if ((i2 & 16) == 0) {
            l4 = l3;
        }
        String str2 = or82.h;
        String str3 = ((str2 != null && str2.length() != 0) || (str = jp82.g) == null || str.length() == 0) ? str2 : str;
        long j3 = or82.l;
        if (j3 == 0) {
            j3 = jp82.q;
        }
        long j4 = j3;
        int i3 = or82.k;
        if (i3 == 0) {
            i3 = jp82.p;
        }
        int i4 = i3;
        long j5 = or82.n;
        if (j5 == 0) {
            j5 = jp82.s;
        }
        long j6 = j5;
        String str4 = or82.p;
        if (str4 == null) {
            str4 = jp82.u;
        }
        String str5 = str4;
        String str6 = or82.o;
        if (str6 == null) {
            str6 = jp82.t;
        }
        String str7 = str6;
        yr8 yr8 = or82.j;
        if (yr8 == null) {
            yr8 = jp82.G;
        }
        return new or8(jp82.a, l5 != null ? l5.longValue() : or82.b, or82.c, j2, or82.e, or82.f, l4 != null ? l4.longValue() : or82.g, str3, or82.i, yr8, i4, j4, jp82.r && or82.m, j6, str7, str5, or82.q, or82.r, or82.s, or82.t, or82.u, or82.v, or82.w, or82.x, or82.y);
    }

    public static ArrayList j(cw8 cw8, long j2) {
        pec pec;
        boolean z;
        int i2;
        String str;
        int i3;
        String str2;
        int i4;
        int i5;
        int i6;
        byte[] bArr;
        Long l2;
        int i7;
        Boolean bool;
        cw8 cw82 = cw8;
        cw8.getClass();
        pec a2 = pec.a(3, "SELECT * FROM messages WHERE chat_id = ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire ASC LIMIT ?");
        us8.n(a2, 1, j2, cw82);
        a2.j(2, (long) 10);
        a2.j(3, 1);
        aec aec = cw82.a;
        aec.b();
        Cursor o2 = aec.o(a2, (CancellationSignal) null);
        try {
            int o3 = gp0.o(o2, ApiProtocol.KEY_ID);
            int o4 = gp0.o(o2, "server_id");
            int o5 = gp0.o(o2, "time");
            int o6 = gp0.o(o2, "update_time");
            int o7 = gp0.o(o2, "sender");
            int o8 = gp0.o(o2, "cid");
            int o9 = gp0.o(o2, "text");
            int o10 = gp0.o(o2, "delivery_status");
            int o11 = gp0.o(o2, "status");
            int o12 = gp0.o(o2, "time_local");
            int o13 = gp0.o(o2, "error");
            int o14 = gp0.o(o2, "localized_error");
            int o15 = gp0.o(o2, "attaches");
            int o16 = gp0.o(o2, "media_type");
            pec = a2;
            try {
                int o17 = gp0.o(o2, "detect_share");
                int o18 = gp0.o(o2, "msg_link_type");
                int o19 = gp0.o(o2, "msg_link_id");
                int o20 = gp0.o(o2, "inserted_from_msg_link");
                int o21 = gp0.o(o2, "msg_link_chat_id");
                int o22 = gp0.o(o2, "msg_link_chat_name");
                int o23 = gp0.o(o2, "msg_link_chat_link");
                int o24 = gp0.o(o2, "msg_link_out_chat_id");
                int o25 = gp0.o(o2, "msg_link_out_msg_id");
                int o26 = gp0.o(o2, "type");
                int o27 = gp0.o(o2, "chat_id");
                int o28 = gp0.o(o2, "ttl");
                int o29 = gp0.o(o2, "channel_views");
                int o30 = gp0.o(o2, "channel_forwards");
                int o31 = gp0.o(o2, "view_time");
                int o32 = gp0.o(o2, "zoom");
                int o33 = gp0.o(o2, "options");
                int o34 = gp0.o(o2, "live_until");
                int o35 = gp0.o(o2, "elements");
                int o36 = gp0.o(o2, "reactions");
                int o37 = gp0.o(o2, "delayed_attrs_time_to_fire");
                int o38 = gp0.o(o2, "delayed_attrs_notify_sender");
                int i8 = o16;
                ArrayList arrayList = new ArrayList(o2.getCount());
                while (o2.moveToNext()) {
                    long j3 = o2.getLong(o3);
                    long j4 = o2.getLong(o4);
                    long j5 = o2.getLong(o5);
                    long j6 = o2.getLong(o6);
                    long j7 = o2.getLong(o7);
                    long j8 = o2.getLong(o8);
                    String string = o2.isNull(o9) ? null : o2.getString(o9);
                    int i9 = o2.getInt(o10);
                    cw8.a().getClass();
                    bp8.b.getClass();
                    bp8 t = s59.t(i9);
                    int i10 = o2.getInt(o11);
                    cw8.a().getClass();
                    ls8 b2 = p29.b(i10);
                    long j9 = o2.getLong(o12);
                    String string2 = o2.isNull(o13) ? null : o2.getString(o13);
                    String string3 = o2.isNull(o14) ? null : o2.getString(o14);
                    byte[] blob = o2.isNull(o15) ? null : o2.getBlob(o15);
                    cw8.a().getClass();
                    jj7 b3 = fu7.b(blob);
                    int i11 = i8;
                    int i12 = o2.getInt(i11);
                    i8 = i11;
                    int i13 = o17;
                    int i14 = o2.getInt(i13);
                    boolean z2 = false;
                    o17 = i13;
                    int i15 = o18;
                    boolean z3 = i14 != 0;
                    int i16 = o2.getInt(i15);
                    int i17 = i15;
                    int i18 = o19;
                    long j10 = o2.getLong(i18);
                    o19 = i18;
                    int i19 = o20;
                    if (o2.getInt(i19) != 0) {
                        o20 = i19;
                        i2 = o21;
                        z = true;
                    } else {
                        o20 = i19;
                        i2 = o21;
                        z = false;
                    }
                    long j11 = o2.getLong(i2);
                    o21 = i2;
                    int i20 = o22;
                    if (o2.isNull(i20)) {
                        o22 = i20;
                        i3 = o23;
                        str = null;
                    } else {
                        str = o2.getString(i20);
                        o22 = i20;
                        i3 = o23;
                    }
                    if (o2.isNull(i3)) {
                        o23 = i3;
                        i4 = o24;
                        str2 = null;
                    } else {
                        str2 = o2.getString(i3);
                        o23 = i3;
                        i4 = o24;
                    }
                    long j12 = o2.getLong(i4);
                    o24 = i4;
                    int i21 = o25;
                    long j13 = o2.getLong(i21);
                    o25 = i21;
                    int i22 = o26;
                    int i23 = o2.getInt(i22);
                    cw8.a().getClass();
                    int a3 = us8.a(i23);
                    o26 = i22;
                    int i24 = o27;
                    long j14 = o2.getLong(i24);
                    o27 = i24;
                    int i25 = o28;
                    int i26 = o2.getInt(i25);
                    o28 = i25;
                    int i27 = o29;
                    int i28 = o2.getInt(i27);
                    o29 = i27;
                    int i29 = o30;
                    int i30 = o2.getInt(i29);
                    o30 = i29;
                    int i31 = o31;
                    long j15 = o2.getLong(i31);
                    o31 = i31;
                    int i32 = o32;
                    int i33 = o2.getInt(i32);
                    o32 = i32;
                    int i34 = o33;
                    int i35 = o2.getInt(i34);
                    o33 = i34;
                    int i36 = o34;
                    long j16 = o2.getLong(i36);
                    o34 = i36;
                    int i37 = o35;
                    byte[] blob2 = o2.isNull(i37) ? null : o2.getBlob(i37);
                    cw8.a().getClass();
                    List a4 = p29.a(blob2);
                    o35 = i37;
                    int i38 = o36;
                    if (o2.isNull(i38)) {
                        i5 = i38;
                        i6 = o14;
                        bArr = null;
                    } else {
                        i5 = i38;
                        bArr = o2.getBlob(i38);
                        i6 = o14;
                    }
                    yr8 c2 = cw8.a().c(bArr);
                    int i39 = o37;
                    if (o2.isNull(i39)) {
                        i7 = o38;
                        l2 = null;
                    } else {
                        l2 = Long.valueOf(o2.getLong(i39));
                        i7 = o38;
                    }
                    Integer valueOf = o2.isNull(i7) ? null : Integer.valueOf(o2.getInt(i7));
                    if (valueOf == null) {
                        o37 = i39;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z2 = true;
                        }
                        bool = Boolean.valueOf(z2);
                        o37 = i39;
                    }
                    arrayList.add(new jp8(j3, j4, j5, j6, j7, j8, string, t, b2, j9, string2, string3, b3, i12, z3, i16, j10, z, j11, str, str2, j12, j13, a3, j14, i26, i28, i30, j15, i33, i35, j16, a4, c2, l2, bool));
                    o38 = i7;
                    o14 = i6;
                    o18 = i17;
                    o36 = i5;
                }
                o2.close();
                pec.m();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o2.close();
                pec.m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            pec = a2;
            o2.close();
            pec.m();
            throw th;
        }
    }

    public final synchronized p29 a() {
        try {
            if (this.c == null) {
                this.c = (p29) this.a.l.get(p29.class);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.c;
    }

    public final jp8 b(long j2, long j3) {
        pec pec;
        jp8 jp8;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        String str;
        int i4;
        String str2;
        int i5;
        Boolean bool;
        pec a2 = pec.a(2, "SELECT * FROM messages WHERE chat_id = ? AND server_id = ?");
        a2.j(1, j2);
        a2.j(2, j3);
        aec aec = this.a;
        aec.b();
        Cursor o2 = aec.o(a2, (CancellationSignal) null);
        try {
            int o3 = gp0.o(o2, ApiProtocol.KEY_ID);
            int o4 = gp0.o(o2, "server_id");
            int o5 = gp0.o(o2, "time");
            int o6 = gp0.o(o2, "update_time");
            int o7 = gp0.o(o2, "sender");
            int o8 = gp0.o(o2, "cid");
            int o9 = gp0.o(o2, "text");
            int o10 = gp0.o(o2, "delivery_status");
            int o11 = gp0.o(o2, "status");
            int o12 = gp0.o(o2, "time_local");
            int o13 = gp0.o(o2, "error");
            int o14 = gp0.o(o2, "localized_error");
            int o15 = gp0.o(o2, "attaches");
            int o16 = gp0.o(o2, "media_type");
            pec = a2;
            try {
                int o17 = gp0.o(o2, "detect_share");
                int o18 = gp0.o(o2, "msg_link_type");
                int o19 = gp0.o(o2, "msg_link_id");
                int o20 = gp0.o(o2, "inserted_from_msg_link");
                int o21 = gp0.o(o2, "msg_link_chat_id");
                int o22 = gp0.o(o2, "msg_link_chat_name");
                int o23 = gp0.o(o2, "msg_link_chat_link");
                int o24 = gp0.o(o2, "msg_link_out_chat_id");
                int o25 = gp0.o(o2, "msg_link_out_msg_id");
                int o26 = gp0.o(o2, "type");
                int o27 = gp0.o(o2, "chat_id");
                int o28 = gp0.o(o2, "ttl");
                int o29 = gp0.o(o2, "channel_views");
                int o30 = gp0.o(o2, "channel_forwards");
                int o31 = gp0.o(o2, "view_time");
                int o32 = gp0.o(o2, "zoom");
                int o33 = gp0.o(o2, "options");
                int o34 = gp0.o(o2, "live_until");
                int o35 = gp0.o(o2, "elements");
                int o36 = gp0.o(o2, "reactions");
                int o37 = gp0.o(o2, "delayed_attrs_time_to_fire");
                int o38 = gp0.o(o2, "delayed_attrs_notify_sender");
                if (o2.moveToFirst()) {
                    long j4 = o2.getLong(o3);
                    long j5 = o2.getLong(o4);
                    long j6 = o2.getLong(o5);
                    long j7 = o2.getLong(o6);
                    long j8 = o2.getLong(o7);
                    long j9 = o2.getLong(o8);
                    String string = o2.isNull(o9) ? null : o2.getString(o9);
                    int i6 = o2.getInt(o10);
                    a().getClass();
                    bp8.b.getClass();
                    bp8 t = s59.t(i6);
                    int i7 = o2.getInt(o11);
                    a().getClass();
                    ls8 b2 = p29.b(i7);
                    long j10 = o2.getLong(o12);
                    String string2 = o2.isNull(o13) ? null : o2.getString(o13);
                    String string3 = o2.isNull(o14) ? null : o2.getString(o14);
                    byte[] blob = o2.isNull(o15) ? null : o2.getBlob(o15);
                    a().getClass();
                    jj7 b3 = fu7.b(blob);
                    int i8 = o2.getInt(o16);
                    if (o2.getInt(o17) != 0) {
                        i2 = o18;
                        z = true;
                    } else {
                        i2 = o18;
                        z = false;
                    }
                    int i9 = o2.getInt(i2);
                    long j11 = o2.getLong(o19);
                    if (o2.getInt(o20) != 0) {
                        i3 = o21;
                        z2 = true;
                    } else {
                        z2 = false;
                        i3 = o21;
                    }
                    long j12 = o2.getLong(i3);
                    int i10 = o22;
                    if (o2.isNull(i10)) {
                        i4 = o23;
                        str = null;
                    } else {
                        str = o2.getString(i10);
                        i4 = o23;
                    }
                    if (o2.isNull(i4)) {
                        i5 = o24;
                        str2 = null;
                    } else {
                        str2 = o2.getString(i4);
                        i5 = o24;
                    }
                    long j13 = o2.getLong(i5);
                    long j14 = o2.getLong(o25);
                    int i11 = o2.getInt(o26);
                    a().getClass();
                    int a3 = us8.a(i11);
                    long j15 = o2.getLong(o27);
                    int i12 = o2.getInt(o28);
                    int i13 = o2.getInt(o29);
                    int i14 = o2.getInt(o30);
                    long j16 = o2.getLong(o31);
                    int i15 = o2.getInt(o32);
                    int i16 = o2.getInt(o33);
                    long j17 = o2.getLong(o34);
                    int i17 = o35;
                    byte[] blob2 = o2.isNull(i17) ? null : o2.getBlob(i17);
                    a().getClass();
                    List a4 = p29.a(blob2);
                    int i18 = o36;
                    yr8 c2 = a().c(o2.isNull(i18) ? null : o2.getBlob(i18));
                    int i19 = o37;
                    Long valueOf = o2.isNull(i19) ? null : Long.valueOf(o2.getLong(i19));
                    Integer valueOf2 = o2.isNull(o38) ? null : Integer.valueOf(o2.getInt(o38));
                    if (valueOf2 == null) {
                        bool = null;
                    } else {
                        bool = Boolean.valueOf(valueOf2.intValue() != 0);
                    }
                    jp8 = new jp8(j4, j5, j6, j7, j8, j9, string, t, b2, j10, string2, string3, b3, i8, z, i9, j11, z2, j12, str, str2, j13, j14, a3, j15, i12, i13, i14, j16, i15, i16, j17, a4, c2, valueOf, bool);
                } else {
                    jp8 = null;
                }
                o2.close();
                pec.m();
                return jp8;
            } catch (Throwable th) {
                th = th;
                o2.close();
                pec.m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            pec = a2;
            o2.close();
            pec.m();
            throw th;
        }
    }

    public final jp8 c(long j2) {
        pec pec;
        jp8 jp8;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        String str;
        int i4;
        String str2;
        int i5;
        Boolean bool;
        pec a2 = pec.a(1, "SELECT * FROM messages WHERE id = ?");
        a2.j(1, j2);
        aec aec = this.a;
        aec.b();
        Cursor o2 = aec.o(a2, (CancellationSignal) null);
        try {
            int o3 = gp0.o(o2, ApiProtocol.KEY_ID);
            int o4 = gp0.o(o2, "server_id");
            int o5 = gp0.o(o2, "time");
            int o6 = gp0.o(o2, "update_time");
            int o7 = gp0.o(o2, "sender");
            int o8 = gp0.o(o2, "cid");
            int o9 = gp0.o(o2, "text");
            int o10 = gp0.o(o2, "delivery_status");
            int o11 = gp0.o(o2, "status");
            int o12 = gp0.o(o2, "time_local");
            int o13 = gp0.o(o2, "error");
            int o14 = gp0.o(o2, "localized_error");
            int o15 = gp0.o(o2, "attaches");
            int o16 = gp0.o(o2, "media_type");
            pec = a2;
            try {
                int o17 = gp0.o(o2, "detect_share");
                int o18 = gp0.o(o2, "msg_link_type");
                int o19 = gp0.o(o2, "msg_link_id");
                int o20 = gp0.o(o2, "inserted_from_msg_link");
                int o21 = gp0.o(o2, "msg_link_chat_id");
                int o22 = gp0.o(o2, "msg_link_chat_name");
                int o23 = gp0.o(o2, "msg_link_chat_link");
                int o24 = gp0.o(o2, "msg_link_out_chat_id");
                int o25 = gp0.o(o2, "msg_link_out_msg_id");
                int o26 = gp0.o(o2, "type");
                int o27 = gp0.o(o2, "chat_id");
                int o28 = gp0.o(o2, "ttl");
                int o29 = gp0.o(o2, "channel_views");
                int o30 = gp0.o(o2, "channel_forwards");
                int o31 = gp0.o(o2, "view_time");
                int o32 = gp0.o(o2, "zoom");
                int o33 = gp0.o(o2, "options");
                int o34 = gp0.o(o2, "live_until");
                int o35 = gp0.o(o2, "elements");
                int o36 = gp0.o(o2, "reactions");
                int o37 = gp0.o(o2, "delayed_attrs_time_to_fire");
                int o38 = gp0.o(o2, "delayed_attrs_notify_sender");
                if (o2.moveToFirst()) {
                    long j3 = o2.getLong(o3);
                    long j4 = o2.getLong(o4);
                    long j5 = o2.getLong(o5);
                    long j6 = o2.getLong(o6);
                    long j7 = o2.getLong(o7);
                    long j8 = o2.getLong(o8);
                    String string = o2.isNull(o9) ? null : o2.getString(o9);
                    int i6 = o2.getInt(o10);
                    a().getClass();
                    bp8.b.getClass();
                    bp8 t = s59.t(i6);
                    int i7 = o2.getInt(o11);
                    a().getClass();
                    ls8 b2 = p29.b(i7);
                    long j9 = o2.getLong(o12);
                    String string2 = o2.isNull(o13) ? null : o2.getString(o13);
                    String string3 = o2.isNull(o14) ? null : o2.getString(o14);
                    byte[] blob = o2.isNull(o15) ? null : o2.getBlob(o15);
                    a().getClass();
                    jj7 b3 = fu7.b(blob);
                    int i8 = o2.getInt(o16);
                    boolean z3 = false;
                    if (o2.getInt(o17) != 0) {
                        i2 = o18;
                        z = true;
                    } else {
                        z = false;
                        i2 = o18;
                    }
                    int i9 = o2.getInt(i2);
                    long j10 = o2.getLong(o19);
                    if (o2.getInt(o20) != 0) {
                        i3 = o21;
                        z2 = true;
                    } else {
                        z2 = false;
                        i3 = o21;
                    }
                    long j11 = o2.getLong(i3);
                    int i10 = o22;
                    if (o2.isNull(i10)) {
                        i4 = o23;
                        str = null;
                    } else {
                        str = o2.getString(i10);
                        i4 = o23;
                    }
                    if (o2.isNull(i4)) {
                        i5 = o24;
                        str2 = null;
                    } else {
                        str2 = o2.getString(i4);
                        i5 = o24;
                    }
                    long j12 = o2.getLong(i5);
                    long j13 = o2.getLong(o25);
                    int i11 = o2.getInt(o26);
                    a().getClass();
                    int a3 = us8.a(i11);
                    long j14 = o2.getLong(o27);
                    int i12 = o2.getInt(o28);
                    int i13 = o2.getInt(o29);
                    int i14 = o2.getInt(o30);
                    long j15 = o2.getLong(o31);
                    int i15 = o2.getInt(o32);
                    int i16 = o2.getInt(o33);
                    long j16 = o2.getLong(o34);
                    int i17 = o35;
                    byte[] blob2 = o2.isNull(i17) ? null : o2.getBlob(i17);
                    a().getClass();
                    List a4 = p29.a(blob2);
                    int i18 = o36;
                    yr8 c2 = a().c(o2.isNull(i18) ? null : o2.getBlob(i18));
                    int i19 = o37;
                    Long valueOf = o2.isNull(i19) ? null : Long.valueOf(o2.getLong(i19));
                    Integer valueOf2 = o2.isNull(o38) ? null : Integer.valueOf(o2.getInt(o38));
                    if (valueOf2 == null) {
                        bool = null;
                    } else {
                        if (valueOf2.intValue() != 0) {
                            z3 = true;
                        }
                        bool = Boolean.valueOf(z3);
                    }
                    jp8 = new jp8(j3, j4, j5, j6, j7, j8, string, t, b2, j9, string2, string3, b3, i8, z, i9, j10, z2, j11, str, str2, j12, j13, a3, j14, i12, i13, i14, j15, i15, i16, j16, a4, c2, valueOf, bool);
                } else {
                    jp8 = null;
                }
                o2.close();
                pec.m();
                return jp8;
            } catch (Throwable th) {
                th = th;
                o2.close();
                pec.m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            pec = a2;
            o2.close();
            pec.m();
            throw th;
        }
    }

    public final ArrayList d(long j2, long j3, boolean z, long j4) {
        ArrayList arrayList;
        pec pec;
        String str;
        int i2;
        String str2;
        int i3;
        int i4;
        int i5;
        byte[] bArr;
        Long l2;
        int i6;
        Boolean bool;
        pec pec2;
        String str3;
        int i7;
        String str4;
        int i8;
        int i9;
        int i10;
        byte[] bArr2;
        Long l3;
        int i11;
        Boolean bool2;
        long j5 = j2;
        long j6 = j3;
        long j7 = j4;
        String str5 = "delayed_attrs_notify_sender";
        String str6 = "delayed_attrs_time_to_fire";
        String str7 = "reactions";
        String str8 = "elements";
        String str9 = "live_until";
        String str10 = "options";
        String str11 = "zoom";
        String str12 = "view_time";
        String str13 = "channel_forwards";
        String str14 = "channel_views";
        String str15 = "ttl";
        String str16 = "chat_id";
        String str17 = "type";
        String str18 = "msg_link_out_msg_id";
        String str19 = "msg_link_out_chat_id";
        String str20 = "msg_link_chat_link";
        String str21 = "msg_link_chat_name";
        String str22 = "msg_link_chat_id";
        String str23 = "inserted_from_msg_link";
        String str24 = "msg_link_id";
        String str25 = "msg_link_type";
        String str26 = "detect_share";
        String str27 = "media_type";
        String str28 = "attaches";
        String str29 = "localized_error";
        String str30 = "error";
        String str31 = "time_local";
        String str32 = "status";
        aec aec = this.a;
        String str33 = "delivery_status";
        if (z) {
            String str34 = "text";
            pec a2 = pec.a(5, "SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time DESC, time_local DESC LIMIT ?");
            a2.j(1, j5);
            a2.j(2, j6);
            us8.n(a2, 3, j7, this);
            a2.j(4, (long) 10);
            a2.j(5, (long) 40);
            aec.b();
            Cursor o2 = aec.o(a2, (CancellationSignal) null);
            try {
                int o3 = gp0.o(o2, ApiProtocol.KEY_ID);
                int o4 = gp0.o(o2, "server_id");
                int o5 = gp0.o(o2, "time");
                int o6 = gp0.o(o2, "update_time");
                int o7 = gp0.o(o2, "sender");
                int o8 = gp0.o(o2, "cid");
                int o9 = gp0.o(o2, str34);
                int o10 = gp0.o(o2, str33);
                int o11 = gp0.o(o2, str32);
                int o12 = gp0.o(o2, str31);
                int o13 = gp0.o(o2, str30);
                int o14 = gp0.o(o2, str29);
                int o15 = gp0.o(o2, str28);
                int o16 = gp0.o(o2, str27);
                pec2 = a2;
                try {
                    int o17 = gp0.o(o2, str26);
                    int o18 = gp0.o(o2, str25);
                    int o19 = gp0.o(o2, str24);
                    int o20 = gp0.o(o2, str23);
                    int o21 = gp0.o(o2, str22);
                    int o22 = gp0.o(o2, str21);
                    int o23 = gp0.o(o2, str20);
                    int o24 = gp0.o(o2, str19);
                    int o25 = gp0.o(o2, str18);
                    int o26 = gp0.o(o2, str17);
                    int o27 = gp0.o(o2, str16);
                    int o28 = gp0.o(o2, str15);
                    int o29 = gp0.o(o2, str14);
                    int o30 = gp0.o(o2, str13);
                    int o31 = gp0.o(o2, str12);
                    int o32 = gp0.o(o2, str11);
                    int o33 = gp0.o(o2, str10);
                    int o34 = gp0.o(o2, str9);
                    int o35 = gp0.o(o2, str8);
                    int o36 = gp0.o(o2, str7);
                    int o37 = gp0.o(o2, str6);
                    int o38 = gp0.o(o2, str5);
                    int i12 = o16;
                    arrayList = new ArrayList(o2.getCount());
                    while (o2.moveToNext()) {
                        long j8 = o2.getLong(o3);
                        long j9 = o2.getLong(o4);
                        long j10 = o2.getLong(o5);
                        long j11 = o2.getLong(o6);
                        long j12 = o2.getLong(o7);
                        long j13 = o2.getLong(o8);
                        String string = o2.isNull(o9) ? null : o2.getString(o9);
                        int i13 = o2.getInt(o10);
                        a().getClass();
                        bp8.b.getClass();
                        bp8 t = s59.t(i13);
                        int i14 = o2.getInt(o11);
                        a().getClass();
                        ls8 b2 = p29.b(i14);
                        long j14 = o2.getLong(o12);
                        String string2 = o2.isNull(o13) ? null : o2.getString(o13);
                        String string3 = o2.isNull(o14) ? null : o2.getString(o14);
                        byte[] blob = o2.isNull(o15) ? null : o2.getBlob(o15);
                        a().getClass();
                        jj7 b3 = fu7.b(blob);
                        int i15 = i12;
                        int i16 = o2.getInt(i15);
                        i12 = i15;
                        int i17 = o17;
                        boolean z2 = false;
                        o17 = i17;
                        boolean z3 = o2.getInt(i17) != 0;
                        int i18 = o18;
                        int i19 = o2.getInt(i18);
                        o18 = i18;
                        int i20 = o19;
                        long j15 = o2.getLong(i20);
                        o19 = i20;
                        int i21 = o20;
                        o20 = i21;
                        boolean z4 = o2.getInt(i21) != 0;
                        int i22 = o21;
                        long j16 = o2.getLong(i22);
                        o21 = i22;
                        int i23 = o22;
                        if (o2.isNull(i23)) {
                            o22 = i23;
                            i7 = o23;
                            str3 = null;
                        } else {
                            String string4 = o2.getString(i23);
                            o22 = i23;
                            i7 = o23;
                            str3 = string4;
                        }
                        if (o2.isNull(i7)) {
                            o23 = i7;
                            i8 = o24;
                            str4 = null;
                        } else {
                            str4 = o2.getString(i7);
                            o23 = i7;
                            i8 = o24;
                        }
                        long j17 = o2.getLong(i8);
                        o24 = i8;
                        int i24 = o25;
                        long j18 = o2.getLong(i24);
                        o25 = i24;
                        int i25 = o26;
                        int i26 = o2.getInt(i25);
                        a().getClass();
                        int a3 = us8.a(i26);
                        o26 = i25;
                        int i27 = o27;
                        long j19 = o2.getLong(i27);
                        o27 = i27;
                        int i28 = o28;
                        int i29 = o2.getInt(i28);
                        o28 = i28;
                        int i30 = o29;
                        int i31 = o2.getInt(i30);
                        o29 = i30;
                        int i32 = o30;
                        int i33 = o2.getInt(i32);
                        o30 = i32;
                        int i34 = o31;
                        long j20 = o2.getLong(i34);
                        o31 = i34;
                        int i35 = o32;
                        int i36 = o2.getInt(i35);
                        o32 = i35;
                        int i37 = o33;
                        int i38 = o2.getInt(i37);
                        o33 = i37;
                        int i39 = o34;
                        long j21 = o2.getLong(i39);
                        o34 = i39;
                        int i40 = o35;
                        byte[] blob2 = o2.isNull(i40) ? null : o2.getBlob(i40);
                        a().getClass();
                        List a4 = p29.a(blob2);
                        o35 = i40;
                        int i41 = o36;
                        if (o2.isNull(i41)) {
                            i9 = i41;
                            i10 = o3;
                            bArr2 = null;
                        } else {
                            i9 = i41;
                            bArr2 = o2.getBlob(i41);
                            i10 = o3;
                        }
                        yr8 c2 = a().c(bArr2);
                        int i42 = o37;
                        if (o2.isNull(i42)) {
                            i11 = o38;
                            l3 = null;
                        } else {
                            l3 = Long.valueOf(o2.getLong(i42));
                            i11 = o38;
                        }
                        Integer valueOf = o2.isNull(i11) ? null : Integer.valueOf(o2.getInt(i11));
                        if (valueOf == null) {
                            o37 = i42;
                            bool2 = null;
                        } else {
                            if (valueOf.intValue() != 0) {
                                z2 = true;
                            }
                            o37 = i42;
                            bool2 = Boolean.valueOf(z2);
                        }
                        arrayList.add(new jp8(j8, j9, j10, j11, j12, j13, string, t, b2, j14, string2, string3, b3, i16, z3, i19, j15, z4, j16, str3, str4, j17, j18, a3, j19, i29, i31, i33, j20, i36, i38, j21, a4, c2, l3, bool2));
                        o38 = i11;
                        o3 = i10;
                        o36 = i9;
                    }
                    o2.close();
                    pec2.m();
                } catch (Throwable th) {
                    th = th;
                    o2.close();
                    pec2.m();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                pec2 = a2;
                o2.close();
                pec2.m();
                throw th;
            }
        } else {
            String str35 = "text";
            String str36 = str33;
            pec a5 = pec.a(5, "SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time ASC, time_local ASC LIMIT ?");
            a5.j(1, j5);
            a5.j(2, j6);
            String str37 = str27;
            us8.n(a5, 3, j7, this);
            a5.j(4, (long) 10);
            a5.j(5, (long) 40);
            aec.b();
            Cursor o39 = aec.o(a5, (CancellationSignal) null);
            try {
                int o40 = gp0.o(o39, ApiProtocol.KEY_ID);
                int o41 = gp0.o(o39, "server_id");
                int o42 = gp0.o(o39, "time");
                int o43 = gp0.o(o39, "update_time");
                int o44 = gp0.o(o39, "sender");
                int o45 = gp0.o(o39, "cid");
                int o46 = gp0.o(o39, str35);
                int o47 = gp0.o(o39, str33);
                int o48 = gp0.o(o39, str32);
                int o49 = gp0.o(o39, str31);
                int o50 = gp0.o(o39, str30);
                int o51 = gp0.o(o39, str29);
                int o52 = gp0.o(o39, str28);
                int o53 = gp0.o(o39, str37);
                pec = a5;
                try {
                    int o54 = gp0.o(o39, str26);
                    int o55 = gp0.o(o39, str25);
                    int o56 = gp0.o(o39, str24);
                    int o57 = gp0.o(o39, str23);
                    int o58 = gp0.o(o39, str22);
                    int o59 = gp0.o(o39, str21);
                    int o60 = gp0.o(o39, str20);
                    int o61 = gp0.o(o39, str19);
                    int o62 = gp0.o(o39, str18);
                    int o63 = gp0.o(o39, str17);
                    int o64 = gp0.o(o39, str16);
                    int o65 = gp0.o(o39, str15);
                    int o66 = gp0.o(o39, str14);
                    int o67 = gp0.o(o39, str13);
                    int o68 = gp0.o(o39, str12);
                    int o69 = gp0.o(o39, str11);
                    int o70 = gp0.o(o39, str10);
                    int o71 = gp0.o(o39, str9);
                    int o72 = gp0.o(o39, str8);
                    int o73 = gp0.o(o39, str7);
                    int o74 = gp0.o(o39, str6);
                    int o75 = gp0.o(o39, str5);
                    int i43 = o53;
                    arrayList = new ArrayList(o39.getCount());
                    while (o39.moveToNext()) {
                        long j22 = o39.getLong(o40);
                        long j23 = o39.getLong(o41);
                        long j24 = o39.getLong(o42);
                        long j25 = o39.getLong(o43);
                        long j26 = o39.getLong(o44);
                        long j27 = o39.getLong(o45);
                        String string5 = o39.isNull(o46) ? null : o39.getString(o46);
                        int i44 = o39.getInt(o47);
                        a().getClass();
                        bp8.b.getClass();
                        bp8 t2 = s59.t(i44);
                        int i45 = o39.getInt(o48);
                        a().getClass();
                        ls8 b4 = p29.b(i45);
                        long j28 = o39.getLong(o49);
                        String string6 = o39.isNull(o50) ? null : o39.getString(o50);
                        String string7 = o39.isNull(o51) ? null : o39.getString(o51);
                        byte[] blob3 = o39.isNull(o52) ? null : o39.getBlob(o52);
                        a().getClass();
                        jj7 b5 = fu7.b(blob3);
                        int i46 = i43;
                        int i47 = o39.getInt(i46);
                        int i48 = o50;
                        int i49 = o54;
                        boolean z5 = false;
                        o54 = i49;
                        boolean z6 = o39.getInt(i49) != 0;
                        int i50 = o55;
                        int i51 = o39.getInt(i50);
                        o55 = i50;
                        int i52 = o56;
                        long j29 = o39.getLong(i52);
                        o56 = i52;
                        int i53 = o57;
                        o57 = i53;
                        boolean z7 = o39.getInt(i53) != 0;
                        int i54 = o58;
                        long j30 = o39.getLong(i54);
                        o58 = i54;
                        int i55 = o59;
                        if (o39.isNull(i55)) {
                            o59 = i55;
                            i2 = o60;
                            str = null;
                        } else {
                            String string8 = o39.getString(i55);
                            o59 = i55;
                            i2 = o60;
                            str = string8;
                        }
                        if (o39.isNull(i2)) {
                            o60 = i2;
                            i3 = o61;
                            str2 = null;
                        } else {
                            str2 = o39.getString(i2);
                            o60 = i2;
                            i3 = o61;
                        }
                        long j31 = o39.getLong(i3);
                        o61 = i3;
                        int i56 = o62;
                        long j32 = o39.getLong(i56);
                        o62 = i56;
                        int i57 = o63;
                        int i58 = o39.getInt(i57);
                        a().getClass();
                        int a6 = us8.a(i58);
                        o63 = i57;
                        int i59 = o64;
                        long j33 = o39.getLong(i59);
                        o64 = i59;
                        int i60 = o65;
                        int i61 = o39.getInt(i60);
                        o65 = i60;
                        int i62 = o66;
                        int i63 = o39.getInt(i62);
                        o66 = i62;
                        int i64 = o67;
                        int i65 = o39.getInt(i64);
                        o67 = i64;
                        int i66 = o68;
                        long j34 = o39.getLong(i66);
                        o68 = i66;
                        int i67 = o69;
                        int i68 = o39.getInt(i67);
                        o69 = i67;
                        int i69 = o70;
                        int i70 = o39.getInt(i69);
                        o70 = i69;
                        int i71 = o71;
                        long j35 = o39.getLong(i71);
                        o71 = i71;
                        int i72 = o72;
                        byte[] blob4 = o39.isNull(i72) ? null : o39.getBlob(i72);
                        a().getClass();
                        List a7 = p29.a(blob4);
                        o72 = i72;
                        int i73 = o73;
                        if (o39.isNull(i73)) {
                            i4 = i73;
                            i5 = o52;
                            bArr = null;
                        } else {
                            i4 = i73;
                            bArr = o39.getBlob(i73);
                            i5 = o52;
                        }
                        yr8 c3 = a().c(bArr);
                        int i74 = o74;
                        if (o39.isNull(i74)) {
                            i6 = o75;
                            l2 = null;
                        } else {
                            l2 = Long.valueOf(o39.getLong(i74));
                            i6 = o75;
                        }
                        Integer valueOf2 = o39.isNull(i6) ? null : Integer.valueOf(o39.getInt(i6));
                        if (valueOf2 == null) {
                            o74 = i74;
                            bool = null;
                        } else {
                            if (valueOf2.intValue() != 0) {
                                z5 = true;
                            }
                            o74 = i74;
                            bool = Boolean.valueOf(z5);
                        }
                        arrayList.add(new jp8(j22, j23, j24, j25, j26, j27, string5, t2, b4, j28, string6, string7, b5, i47, z6, i51, j29, z7, j30, str, str2, j31, j32, a6, j33, i61, i63, i65, j34, i68, i70, j35, a7, c3, l2, bool));
                        o75 = i6;
                        o52 = i5;
                        o50 = i48;
                        o73 = i4;
                        i43 = i46;
                    }
                    o39.close();
                    pec.m();
                } catch (Throwable th3) {
                    th = th3;
                    o39.close();
                    pec.m();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                pec = a5;
                o39.close();
                pec.m();
                throw th;
            }
        }
        return arrayList;
    }

    public final void e(long j2) {
        aec aec = this.a;
        aec.b();
        yv8 yv8 = this.o;
        yz5 f2 = yv8.f();
        f2.j(1, j2);
        try {
            aec.c();
            f2.n();
            aec.r();
            aec.l();
            yv8.u(f2);
        } catch (Throwable th) {
            yv8.u(f2);
            throw th;
        }
    }

    public final long f(jp8 jp8) {
        aec aec = this.a;
        aec.b();
        aec.c();
        try {
            long D = this.b.D(jp8);
            aec.r();
            return D;
        } finally {
            aec.l();
        }
    }

    public final jp8 h(long j2, long j3) {
        pec pec;
        jp8 jp8;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        String str;
        int i4;
        String str2;
        int i5;
        Boolean bool;
        pec a2 = pec.a(2, "SELECT * FROM messages WHERE chat_id = ? AND cid = ?");
        a2.j(1, j2);
        a2.j(2, j3);
        aec aec = this.a;
        aec.b();
        Cursor o2 = aec.o(a2, (CancellationSignal) null);
        try {
            int o3 = gp0.o(o2, ApiProtocol.KEY_ID);
            int o4 = gp0.o(o2, "server_id");
            int o5 = gp0.o(o2, "time");
            int o6 = gp0.o(o2, "update_time");
            int o7 = gp0.o(o2, "sender");
            int o8 = gp0.o(o2, "cid");
            int o9 = gp0.o(o2, "text");
            int o10 = gp0.o(o2, "delivery_status");
            int o11 = gp0.o(o2, "status");
            int o12 = gp0.o(o2, "time_local");
            int o13 = gp0.o(o2, "error");
            int o14 = gp0.o(o2, "localized_error");
            int o15 = gp0.o(o2, "attaches");
            int o16 = gp0.o(o2, "media_type");
            pec = a2;
            try {
                int o17 = gp0.o(o2, "detect_share");
                int o18 = gp0.o(o2, "msg_link_type");
                int o19 = gp0.o(o2, "msg_link_id");
                int o20 = gp0.o(o2, "inserted_from_msg_link");
                int o21 = gp0.o(o2, "msg_link_chat_id");
                int o22 = gp0.o(o2, "msg_link_chat_name");
                int o23 = gp0.o(o2, "msg_link_chat_link");
                int o24 = gp0.o(o2, "msg_link_out_chat_id");
                int o25 = gp0.o(o2, "msg_link_out_msg_id");
                int o26 = gp0.o(o2, "type");
                int o27 = gp0.o(o2, "chat_id");
                int o28 = gp0.o(o2, "ttl");
                int o29 = gp0.o(o2, "channel_views");
                int o30 = gp0.o(o2, "channel_forwards");
                int o31 = gp0.o(o2, "view_time");
                int o32 = gp0.o(o2, "zoom");
                int o33 = gp0.o(o2, "options");
                int o34 = gp0.o(o2, "live_until");
                int o35 = gp0.o(o2, "elements");
                int o36 = gp0.o(o2, "reactions");
                int o37 = gp0.o(o2, "delayed_attrs_time_to_fire");
                int o38 = gp0.o(o2, "delayed_attrs_notify_sender");
                if (o2.moveToFirst()) {
                    long j4 = o2.getLong(o3);
                    long j5 = o2.getLong(o4);
                    long j6 = o2.getLong(o5);
                    long j7 = o2.getLong(o6);
                    long j8 = o2.getLong(o7);
                    long j9 = o2.getLong(o8);
                    String string = o2.isNull(o9) ? null : o2.getString(o9);
                    int i6 = o2.getInt(o10);
                    a().getClass();
                    bp8.b.getClass();
                    bp8 t = s59.t(i6);
                    int i7 = o2.getInt(o11);
                    a().getClass();
                    ls8 b2 = p29.b(i7);
                    long j10 = o2.getLong(o12);
                    String string2 = o2.isNull(o13) ? null : o2.getString(o13);
                    String string3 = o2.isNull(o14) ? null : o2.getString(o14);
                    byte[] blob = o2.isNull(o15) ? null : o2.getBlob(o15);
                    a().getClass();
                    jj7 b3 = fu7.b(blob);
                    int i8 = o2.getInt(o16);
                    if (o2.getInt(o17) != 0) {
                        i2 = o18;
                        z = true;
                    } else {
                        i2 = o18;
                        z = false;
                    }
                    int i9 = o2.getInt(i2);
                    long j11 = o2.getLong(o19);
                    if (o2.getInt(o20) != 0) {
                        i3 = o21;
                        z2 = true;
                    } else {
                        z2 = false;
                        i3 = o21;
                    }
                    long j12 = o2.getLong(i3);
                    int i10 = o22;
                    if (o2.isNull(i10)) {
                        i4 = o23;
                        str = null;
                    } else {
                        str = o2.getString(i10);
                        i4 = o23;
                    }
                    if (o2.isNull(i4)) {
                        i5 = o24;
                        str2 = null;
                    } else {
                        str2 = o2.getString(i4);
                        i5 = o24;
                    }
                    long j13 = o2.getLong(i5);
                    long j14 = o2.getLong(o25);
                    int i11 = o2.getInt(o26);
                    a().getClass();
                    int a3 = us8.a(i11);
                    long j15 = o2.getLong(o27);
                    int i12 = o2.getInt(o28);
                    int i13 = o2.getInt(o29);
                    int i14 = o2.getInt(o30);
                    long j16 = o2.getLong(o31);
                    int i15 = o2.getInt(o32);
                    int i16 = o2.getInt(o33);
                    long j17 = o2.getLong(o34);
                    int i17 = o35;
                    byte[] blob2 = o2.isNull(i17) ? null : o2.getBlob(i17);
                    a().getClass();
                    List a4 = p29.a(blob2);
                    int i18 = o36;
                    yr8 c2 = a().c(o2.isNull(i18) ? null : o2.getBlob(i18));
                    int i19 = o37;
                    Long valueOf = o2.isNull(i19) ? null : Long.valueOf(o2.getLong(i19));
                    Integer valueOf2 = o2.isNull(o38) ? null : Integer.valueOf(o2.getInt(o38));
                    if (valueOf2 == null) {
                        bool = null;
                    } else {
                        bool = Boolean.valueOf(valueOf2.intValue() != 0);
                    }
                    jp8 = new jp8(j4, j5, j6, j7, j8, j9, string, t, b2, j10, string2, string3, b3, i8, z, i9, j11, z2, j12, str, str2, j13, j14, a3, j15, i12, i13, i14, j16, i15, i16, j17, a4, c2, valueOf, bool);
                } else {
                    jp8 = null;
                }
                o2.close();
                pec.m();
                return jp8;
            } catch (Throwable th) {
                th = th;
                o2.close();
                pec.m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            pec = a2;
            o2.close();
            pec.m();
            throw th;
        }
    }

    public final Long i(long j2, long j3) {
        pec a2 = pec.a(2, "SELECT id FROM messages WHERE chat_id = ? AND server_id = ?");
        a2.j(1, j2);
        a2.j(2, j3);
        aec aec = this.a;
        aec.b();
        Long l2 = null;
        Cursor o2 = aec.o(a2, (CancellationSignal) null);
        try {
            if (o2.moveToFirst()) {
                if (!o2.isNull(0)) {
                    l2 = Long.valueOf(o2.getLong(0));
                }
            }
            return l2;
        } finally {
            o2.close();
            a2.m();
        }
    }

    public final long k(long j2) {
        pec a2 = pec.a(1, "SELECT time FROM messages WHERE id = ?");
        a2.j(1, j2);
        aec aec = this.a;
        aec.b();
        Cursor o2 = aec.o(a2, (CancellationSignal) null);
        try {
            return o2.moveToFirst() ? o2.getLong(0) : 0;
        } finally {
            o2.close();
            a2.m();
        }
    }

    public final int l(or8 or8) {
        aec aec = this.a;
        aec.b();
        aec.c();
        try {
            int B = this.d.B(or8);
            aec.r();
            return B;
        } finally {
            aec.l();
        }
    }

    public final int m(eve eve) {
        aec aec = this.a;
        aec.b();
        aec.c();
        try {
            int B = this.e.B(eve);
            aec.r();
            return B;
        } finally {
            aec.l();
        }
    }

    public final void n(long j2, bp8 bp8) {
        aec aec = this.a;
        aec.b();
        yv8 yv8 = this.g;
        yz5 f2 = yv8.f();
        a().getClass();
        f2.j(1, (long) bp8.a);
        f2.j(2, j2);
        try {
            aec.c();
            f2.n();
            aec.r();
            aec.l();
            yv8.u(f2);
        } catch (Throwable th) {
            yv8.u(f2);
            throw th;
        }
    }

    public final void o(long j2, List list, ls8 ls8) {
        aec aec = this.a;
        aec.b();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE messages SET status = ? WHERE chat_id = ? AND id in (");
        a06.e(sb, list.size());
        sb.append(")");
        yz5 d2 = aec.d(sb.toString());
        a().getClass();
        d2.j(1, (long) ls8.a);
        d2.j(2, j2);
        Iterator it = list.iterator();
        int i2 = 3;
        while (it.hasNext()) {
            Long l2 = (Long) it.next();
            if (l2 == null) {
                d2.W(i2);
            } else {
                d2.j(i2, l2.longValue());
            }
            i2++;
        }
        aec.c();
        try {
            d2.n();
            aec.r();
        } finally {
            aec.l();
        }
    }
}
