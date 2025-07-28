package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: aw8  reason: default package */
public final class aw8 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pec b;
    public final /* synthetic */ cw8 c;

    public /* synthetic */ aw8(cw8 cw8, pec pec, int i) {
        this.a = i;
        this.c = cw8;
        this.b = pec;
    }

    private final Object a() {
        pec pec;
        String str;
        int i;
        boolean z;
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
        cw8 cw8 = this.c;
        aec aec = cw8.a;
        pec pec2 = this.b;
        Cursor o = aec.o(pec2, (CancellationSignal) null);
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
            int o14 = gp0.o(o, "attaches");
            pec = pec2;
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
                int i8 = o14;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j = o.getLong(o2);
                    long j2 = o.getLong(o3);
                    long j3 = o.getLong(o4);
                    long j4 = o.getLong(o5);
                    long j5 = o.getLong(o6);
                    long j6 = o.getLong(o7);
                    String string = o.isNull(o8) ? null : o.getString(o8);
                    int i9 = o.getInt(o9);
                    cw8.a().getClass();
                    bp8.b.getClass();
                    bp8 t = s59.t(i9);
                    int i10 = o.getInt(o10);
                    cw8.a().getClass();
                    ls8 b2 = p29.b(i10);
                    long j7 = o.getLong(o11);
                    String string2 = o.isNull(o12) ? null : o.getString(o12);
                    if (o.isNull(o13)) {
                        i = i8;
                        str = null;
                    } else {
                        str = o.getString(o13);
                        i = i8;
                    }
                    byte[] blob = o.isNull(i) ? null : o.getBlob(i);
                    cw8.a().getClass();
                    jj7 b3 = fu7.b(blob);
                    i8 = i;
                    int i11 = o15;
                    int i12 = o.getInt(i11);
                    o15 = i11;
                    int i13 = o16;
                    boolean z2 = false;
                    boolean z3 = o.getInt(i13) != 0;
                    int i14 = o17;
                    int i15 = i13;
                    int i16 = i14;
                    int i17 = o.getInt(i16);
                    int i18 = i16;
                    int i19 = o18;
                    long j8 = o.getLong(i19);
                    o18 = i19;
                    int i20 = o19;
                    if (o.getInt(i20) != 0) {
                        o19 = i20;
                        i2 = o20;
                        z = true;
                    } else {
                        o19 = i20;
                        i2 = o20;
                        z = false;
                    }
                    long j9 = o.getLong(i2);
                    o20 = i2;
                    int i21 = o21;
                    if (o.isNull(i21)) {
                        o21 = i21;
                        i3 = o22;
                        str2 = null;
                    } else {
                        str2 = o.getString(i21);
                        o21 = i21;
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
                    long j10 = o.getLong(i4);
                    o23 = i4;
                    int i22 = o24;
                    long j11 = o.getLong(i22);
                    o24 = i22;
                    int i23 = o25;
                    int i24 = o.getInt(i23);
                    cw8.a().getClass();
                    int a2 = us8.a(i24);
                    o25 = i23;
                    int i25 = o26;
                    long j12 = o.getLong(i25);
                    o26 = i25;
                    int i26 = o27;
                    int i27 = o.getInt(i26);
                    o27 = i26;
                    int i28 = o28;
                    int i29 = o.getInt(i28);
                    o28 = i28;
                    int i30 = o29;
                    int i31 = o.getInt(i30);
                    o29 = i30;
                    int i32 = o30;
                    long j13 = o.getLong(i32);
                    o30 = i32;
                    int i33 = o31;
                    int i34 = o.getInt(i33);
                    o31 = i33;
                    int i35 = o32;
                    int i36 = o.getInt(i35);
                    o32 = i35;
                    int i37 = o33;
                    long j14 = o.getLong(i37);
                    o33 = i37;
                    int i38 = o34;
                    byte[] blob2 = o.isNull(i38) ? null : o.getBlob(i38);
                    cw8.a().getClass();
                    List a3 = p29.a(blob2);
                    o34 = i38;
                    int i39 = o35;
                    if (o.isNull(i39)) {
                        i5 = i39;
                        i6 = o2;
                        bArr = null;
                    } else {
                        i5 = i39;
                        bArr = o.getBlob(i39);
                        i6 = o2;
                    }
                    yr8 c2 = cw8.a().c(bArr);
                    int i40 = o36;
                    if (o.isNull(i40)) {
                        i7 = o37;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i40));
                        i7 = o37;
                    }
                    Integer valueOf = o.isNull(i7) ? null : Integer.valueOf(o.getInt(i7));
                    if (valueOf == null) {
                        o36 = i40;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z2 = true;
                        }
                        bool = Boolean.valueOf(z2);
                        o36 = i40;
                    }
                    arrayList.add(new jp8(j, j2, j3, j4, j5, j6, string, t, b2, j7, string2, str, b3, i12, z3, i17, j8, z, j9, str2, str3, j10, j11, a2, j12, i27, i29, i31, j13, i34, i36, j14, a3, c2, l, bool));
                    o37 = i7;
                    o16 = i15;
                    o2 = i6;
                    o17 = i18;
                    o35 = i5;
                }
                o.close();
                pec.m();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o.close();
                pec.m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            pec = pec2;
            o.close();
            pec.m();
            throw th;
        }
    }

    private final Object b() {
        pec pec;
        jp8 jp8;
        String str;
        int i;
        String str2;
        int i2;
        Boolean bool;
        cw8 cw8 = this.c;
        aec aec = cw8.a;
        pec pec2 = this.b;
        Cursor o = aec.o(pec2, (CancellationSignal) null);
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
            int o14 = gp0.o(o, "attaches");
            pec = pec2;
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
                if (o.moveToFirst()) {
                    long j = o.getLong(o2);
                    long j2 = o.getLong(o3);
                    long j3 = o.getLong(o4);
                    long j4 = o.getLong(o5);
                    long j5 = o.getLong(o6);
                    long j6 = o.getLong(o7);
                    String string = o.isNull(o8) ? null : o.getString(o8);
                    int i3 = o.getInt(o9);
                    cw8.a().getClass();
                    bp8.b.getClass();
                    bp8 t = s59.t(i3);
                    int i4 = o.getInt(o10);
                    cw8.a().getClass();
                    ls8 b2 = p29.b(i4);
                    long j7 = o.getLong(o11);
                    String string2 = o.isNull(o12) ? null : o.getString(o12);
                    String string3 = o.isNull(o13) ? null : o.getString(o13);
                    byte[] blob = o.isNull(o14) ? null : o.getBlob(o14);
                    cw8.a().getClass();
                    jj7 b3 = fu7.b(blob);
                    int i5 = o.getInt(o15);
                    boolean z = false;
                    boolean z2 = o.getInt(o16) != 0;
                    int i6 = o.getInt(o17);
                    long j8 = o.getLong(o18);
                    boolean z3 = o.getInt(o19) != 0;
                    long j9 = o.getLong(o20);
                    int i7 = o21;
                    if (o.isNull(i7)) {
                        i = o22;
                        str = null;
                    } else {
                        str = o.getString(i7);
                        i = o22;
                    }
                    if (o.isNull(i)) {
                        i2 = o23;
                        str2 = null;
                    } else {
                        str2 = o.getString(i);
                        i2 = o23;
                    }
                    long j10 = o.getLong(i2);
                    long j11 = o.getLong(o24);
                    int i8 = o.getInt(o25);
                    cw8.a().getClass();
                    int a2 = us8.a(i8);
                    long j12 = o.getLong(o26);
                    int i9 = o.getInt(o27);
                    int i10 = o.getInt(o28);
                    int i11 = o.getInt(o29);
                    long j13 = o.getLong(o30);
                    int i12 = o.getInt(o31);
                    int i13 = o.getInt(o32);
                    long j14 = o.getLong(o33);
                    int i14 = o34;
                    byte[] blob2 = o.isNull(i14) ? null : o.getBlob(i14);
                    cw8.a().getClass();
                    List a3 = p29.a(blob2);
                    int i15 = o35;
                    yr8 c2 = cw8.a().c(o.isNull(i15) ? null : o.getBlob(i15));
                    int i16 = o36;
                    Long valueOf = o.isNull(i16) ? null : Long.valueOf(o.getLong(i16));
                    Integer valueOf2 = o.isNull(o37) ? null : Integer.valueOf(o.getInt(o37));
                    if (valueOf2 == null) {
                        bool = null;
                    } else {
                        if (valueOf2.intValue() != 0) {
                            z = true;
                        }
                        bool = Boolean.valueOf(z);
                    }
                    jp8 = new jp8(j, j2, j3, j4, j5, j6, string, t, b2, j7, string2, string3, b3, i5, z2, i6, j8, z3, j9, str, str2, j10, j11, a2, j12, i9, i10, i11, j13, i12, i13, j14, a3, c2, valueOf, bool);
                } else {
                    jp8 = null;
                }
                o.close();
                pec.m();
                return jp8;
            } catch (Throwable th) {
                th = th;
                o.close();
                pec.m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            pec = pec2;
            o.close();
            pec.m();
            throw th;
        }
    }

    private final Object c() {
        pec pec;
        String str;
        int i;
        boolean z;
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
        cw8 cw8 = this.c;
        aec aec = cw8.a;
        pec pec2 = this.b;
        Cursor o = aec.o(pec2, (CancellationSignal) null);
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
            int o14 = gp0.o(o, "attaches");
            pec = pec2;
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
                int i8 = o14;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j = o.getLong(o2);
                    long j2 = o.getLong(o3);
                    long j3 = o.getLong(o4);
                    long j4 = o.getLong(o5);
                    long j5 = o.getLong(o6);
                    long j6 = o.getLong(o7);
                    String string = o.isNull(o8) ? null : o.getString(o8);
                    int i9 = o.getInt(o9);
                    cw8.a().getClass();
                    bp8.b.getClass();
                    bp8 t = s59.t(i9);
                    int i10 = o.getInt(o10);
                    cw8.a().getClass();
                    ls8 b2 = p29.b(i10);
                    long j7 = o.getLong(o11);
                    String string2 = o.isNull(o12) ? null : o.getString(o12);
                    if (o.isNull(o13)) {
                        i = i8;
                        str = null;
                    } else {
                        str = o.getString(o13);
                        i = i8;
                    }
                    byte[] blob = o.isNull(i) ? null : o.getBlob(i);
                    cw8.a().getClass();
                    jj7 b3 = fu7.b(blob);
                    i8 = i;
                    int i11 = o15;
                    int i12 = o.getInt(i11);
                    o15 = i11;
                    int i13 = o16;
                    boolean z2 = false;
                    boolean z3 = o.getInt(i13) != 0;
                    int i14 = o17;
                    int i15 = i13;
                    int i16 = i14;
                    int i17 = o.getInt(i16);
                    int i18 = i16;
                    int i19 = o18;
                    long j8 = o.getLong(i19);
                    o18 = i19;
                    int i20 = o19;
                    if (o.getInt(i20) != 0) {
                        o19 = i20;
                        i2 = o20;
                        z = true;
                    } else {
                        o19 = i20;
                        i2 = o20;
                        z = false;
                    }
                    long j9 = o.getLong(i2);
                    o20 = i2;
                    int i21 = o21;
                    if (o.isNull(i21)) {
                        o21 = i21;
                        i3 = o22;
                        str2 = null;
                    } else {
                        str2 = o.getString(i21);
                        o21 = i21;
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
                    long j10 = o.getLong(i4);
                    o23 = i4;
                    int i22 = o24;
                    long j11 = o.getLong(i22);
                    o24 = i22;
                    int i23 = o25;
                    int i24 = o.getInt(i23);
                    cw8.a().getClass();
                    int a2 = us8.a(i24);
                    o25 = i23;
                    int i25 = o26;
                    long j12 = o.getLong(i25);
                    o26 = i25;
                    int i26 = o27;
                    int i27 = o.getInt(i26);
                    o27 = i26;
                    int i28 = o28;
                    int i29 = o.getInt(i28);
                    o28 = i28;
                    int i30 = o29;
                    int i31 = o.getInt(i30);
                    o29 = i30;
                    int i32 = o30;
                    long j13 = o.getLong(i32);
                    o30 = i32;
                    int i33 = o31;
                    int i34 = o.getInt(i33);
                    o31 = i33;
                    int i35 = o32;
                    int i36 = o.getInt(i35);
                    o32 = i35;
                    int i37 = o33;
                    long j14 = o.getLong(i37);
                    o33 = i37;
                    int i38 = o34;
                    byte[] blob2 = o.isNull(i38) ? null : o.getBlob(i38);
                    cw8.a().getClass();
                    List a3 = p29.a(blob2);
                    o34 = i38;
                    int i39 = o35;
                    if (o.isNull(i39)) {
                        i5 = i39;
                        i6 = o2;
                        bArr = null;
                    } else {
                        i5 = i39;
                        bArr = o.getBlob(i39);
                        i6 = o2;
                    }
                    yr8 c2 = cw8.a().c(bArr);
                    int i40 = o36;
                    if (o.isNull(i40)) {
                        i7 = o37;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i40));
                        i7 = o37;
                    }
                    Integer valueOf = o.isNull(i7) ? null : Integer.valueOf(o.getInt(i7));
                    if (valueOf == null) {
                        o36 = i40;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z2 = true;
                        }
                        bool = Boolean.valueOf(z2);
                        o36 = i40;
                    }
                    arrayList.add(new jp8(j, j2, j3, j4, j5, j6, string, t, b2, j7, string2, str, b3, i12, z3, i17, j8, z, j9, str2, str3, j10, j11, a2, j12, i27, i29, i31, j13, i34, i36, j14, a3, c2, l, bool));
                    o37 = i7;
                    o16 = i15;
                    o2 = i6;
                    o17 = i18;
                    o35 = i5;
                }
                o.close();
                pec.m();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o.close();
                pec.m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            pec = pec2;
            o.close();
            pec.m();
            throw th;
        }
    }

    private final Object d() {
        pec pec;
        String str;
        int i;
        boolean z;
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
        cw8 cw8 = this.c;
        aec aec = cw8.a;
        pec pec2 = this.b;
        Cursor o = aec.o(pec2, (CancellationSignal) null);
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
            int o14 = gp0.o(o, "attaches");
            pec = pec2;
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
                int i8 = o14;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j = o.getLong(o2);
                    long j2 = o.getLong(o3);
                    long j3 = o.getLong(o4);
                    long j4 = o.getLong(o5);
                    long j5 = o.getLong(o6);
                    long j6 = o.getLong(o7);
                    String string = o.isNull(o8) ? null : o.getString(o8);
                    int i9 = o.getInt(o9);
                    cw8.a().getClass();
                    bp8.b.getClass();
                    bp8 t = s59.t(i9);
                    int i10 = o.getInt(o10);
                    cw8.a().getClass();
                    ls8 b2 = p29.b(i10);
                    long j7 = o.getLong(o11);
                    String string2 = o.isNull(o12) ? null : o.getString(o12);
                    if (o.isNull(o13)) {
                        i = i8;
                        str = null;
                    } else {
                        str = o.getString(o13);
                        i = i8;
                    }
                    byte[] blob = o.isNull(i) ? null : o.getBlob(i);
                    cw8.a().getClass();
                    jj7 b3 = fu7.b(blob);
                    i8 = i;
                    int i11 = o15;
                    int i12 = o.getInt(i11);
                    o15 = i11;
                    int i13 = o16;
                    boolean z2 = false;
                    boolean z3 = o.getInt(i13) != 0;
                    int i14 = o17;
                    int i15 = i13;
                    int i16 = i14;
                    int i17 = o.getInt(i16);
                    int i18 = i16;
                    int i19 = o18;
                    long j8 = o.getLong(i19);
                    o18 = i19;
                    int i20 = o19;
                    if (o.getInt(i20) != 0) {
                        o19 = i20;
                        i2 = o20;
                        z = true;
                    } else {
                        o19 = i20;
                        i2 = o20;
                        z = false;
                    }
                    long j9 = o.getLong(i2);
                    o20 = i2;
                    int i21 = o21;
                    if (o.isNull(i21)) {
                        o21 = i21;
                        i3 = o22;
                        str2 = null;
                    } else {
                        str2 = o.getString(i21);
                        o21 = i21;
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
                    long j10 = o.getLong(i4);
                    o23 = i4;
                    int i22 = o24;
                    long j11 = o.getLong(i22);
                    o24 = i22;
                    int i23 = o25;
                    int i24 = o.getInt(i23);
                    cw8.a().getClass();
                    int a2 = us8.a(i24);
                    o25 = i23;
                    int i25 = o26;
                    long j12 = o.getLong(i25);
                    o26 = i25;
                    int i26 = o27;
                    int i27 = o.getInt(i26);
                    o27 = i26;
                    int i28 = o28;
                    int i29 = o.getInt(i28);
                    o28 = i28;
                    int i30 = o29;
                    int i31 = o.getInt(i30);
                    o29 = i30;
                    int i32 = o30;
                    long j13 = o.getLong(i32);
                    o30 = i32;
                    int i33 = o31;
                    int i34 = o.getInt(i33);
                    o31 = i33;
                    int i35 = o32;
                    int i36 = o.getInt(i35);
                    o32 = i35;
                    int i37 = o33;
                    long j14 = o.getLong(i37);
                    o33 = i37;
                    int i38 = o34;
                    byte[] blob2 = o.isNull(i38) ? null : o.getBlob(i38);
                    cw8.a().getClass();
                    List a3 = p29.a(blob2);
                    o34 = i38;
                    int i39 = o35;
                    if (o.isNull(i39)) {
                        i5 = i39;
                        i6 = o2;
                        bArr = null;
                    } else {
                        i5 = i39;
                        bArr = o.getBlob(i39);
                        i6 = o2;
                    }
                    yr8 c2 = cw8.a().c(bArr);
                    int i40 = o36;
                    if (o.isNull(i40)) {
                        i7 = o37;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i40));
                        i7 = o37;
                    }
                    Integer valueOf = o.isNull(i7) ? null : Integer.valueOf(o.getInt(i7));
                    if (valueOf == null) {
                        o36 = i40;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z2 = true;
                        }
                        bool = Boolean.valueOf(z2);
                        o36 = i40;
                    }
                    arrayList.add(new jp8(j, j2, j3, j4, j5, j6, string, t, b2, j7, string2, str, b3, i12, z3, i17, j8, z, j9, str2, str3, j10, j11, a2, j12, i27, i29, i31, j13, i34, i36, j14, a3, c2, l, bool));
                    o37 = i7;
                    o16 = i15;
                    o2 = i6;
                    o17 = i18;
                    o35 = i5;
                }
                o.close();
                pec.m();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o.close();
                pec.m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            pec = pec2;
            o.close();
            pec.m();
            throw th;
        }
    }

    private final Object e() {
        pec pec;
        String str;
        int i;
        boolean z;
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
        cw8 cw8 = this.c;
        aec aec = cw8.a;
        pec pec2 = this.b;
        Cursor o = aec.o(pec2, (CancellationSignal) null);
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
            int o14 = gp0.o(o, "attaches");
            pec = pec2;
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
                int i8 = o14;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j = o.getLong(o2);
                    long j2 = o.getLong(o3);
                    long j3 = o.getLong(o4);
                    long j4 = o.getLong(o5);
                    long j5 = o.getLong(o6);
                    long j6 = o.getLong(o7);
                    String string = o.isNull(o8) ? null : o.getString(o8);
                    int i9 = o.getInt(o9);
                    cw8.a().getClass();
                    bp8.b.getClass();
                    bp8 t = s59.t(i9);
                    int i10 = o.getInt(o10);
                    cw8.a().getClass();
                    ls8 b2 = p29.b(i10);
                    long j7 = o.getLong(o11);
                    String string2 = o.isNull(o12) ? null : o.getString(o12);
                    if (o.isNull(o13)) {
                        i = i8;
                        str = null;
                    } else {
                        str = o.getString(o13);
                        i = i8;
                    }
                    byte[] blob = o.isNull(i) ? null : o.getBlob(i);
                    cw8.a().getClass();
                    jj7 b3 = fu7.b(blob);
                    i8 = i;
                    int i11 = o15;
                    int i12 = o.getInt(i11);
                    o15 = i11;
                    int i13 = o16;
                    boolean z2 = false;
                    boolean z3 = o.getInt(i13) != 0;
                    int i14 = o17;
                    int i15 = i13;
                    int i16 = i14;
                    int i17 = o.getInt(i16);
                    int i18 = i16;
                    int i19 = o18;
                    long j8 = o.getLong(i19);
                    o18 = i19;
                    int i20 = o19;
                    if (o.getInt(i20) != 0) {
                        o19 = i20;
                        i2 = o20;
                        z = true;
                    } else {
                        o19 = i20;
                        i2 = o20;
                        z = false;
                    }
                    long j9 = o.getLong(i2);
                    o20 = i2;
                    int i21 = o21;
                    if (o.isNull(i21)) {
                        o21 = i21;
                        i3 = o22;
                        str2 = null;
                    } else {
                        str2 = o.getString(i21);
                        o21 = i21;
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
                    long j10 = o.getLong(i4);
                    o23 = i4;
                    int i22 = o24;
                    long j11 = o.getLong(i22);
                    o24 = i22;
                    int i23 = o25;
                    int i24 = o.getInt(i23);
                    cw8.a().getClass();
                    int a2 = us8.a(i24);
                    o25 = i23;
                    int i25 = o26;
                    long j12 = o.getLong(i25);
                    o26 = i25;
                    int i26 = o27;
                    int i27 = o.getInt(i26);
                    o27 = i26;
                    int i28 = o28;
                    int i29 = o.getInt(i28);
                    o28 = i28;
                    int i30 = o29;
                    int i31 = o.getInt(i30);
                    o29 = i30;
                    int i32 = o30;
                    long j13 = o.getLong(i32);
                    o30 = i32;
                    int i33 = o31;
                    int i34 = o.getInt(i33);
                    o31 = i33;
                    int i35 = o32;
                    int i36 = o.getInt(i35);
                    o32 = i35;
                    int i37 = o33;
                    long j14 = o.getLong(i37);
                    o33 = i37;
                    int i38 = o34;
                    byte[] blob2 = o.isNull(i38) ? null : o.getBlob(i38);
                    cw8.a().getClass();
                    List a3 = p29.a(blob2);
                    o34 = i38;
                    int i39 = o35;
                    if (o.isNull(i39)) {
                        i5 = i39;
                        i6 = o2;
                        bArr = null;
                    } else {
                        i5 = i39;
                        bArr = o.getBlob(i39);
                        i6 = o2;
                    }
                    yr8 c2 = cw8.a().c(bArr);
                    int i40 = o36;
                    if (o.isNull(i40)) {
                        i7 = o37;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i40));
                        i7 = o37;
                    }
                    Integer valueOf = o.isNull(i7) ? null : Integer.valueOf(o.getInt(i7));
                    if (valueOf == null) {
                        o36 = i40;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z2 = true;
                        }
                        bool = Boolean.valueOf(z2);
                        o36 = i40;
                    }
                    arrayList.add(new jp8(j, j2, j3, j4, j5, j6, string, t, b2, j7, string2, str, b3, i12, z3, i17, j8, z, j9, str2, str3, j10, j11, a2, j12, i27, i29, i31, j13, i34, i36, j14, a3, c2, l, bool));
                    o37 = i7;
                    o16 = i15;
                    o2 = i6;
                    o17 = i18;
                    o35 = i5;
                }
                o.close();
                pec.m();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o.close();
                pec.m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            pec = pec2;
            o.close();
            pec.m();
            throw th;
        }
    }

    public final Object call() {
        pec pec;
        jp8 jp8;
        String str;
        int i;
        String str2;
        int i2;
        Boolean bool;
        pec pec2;
        String str3;
        int i3;
        boolean z;
        int i4;
        String str4;
        int i5;
        String str5;
        int i6;
        int i7;
        int i8;
        byte[] bArr;
        Long l;
        int i9;
        Boolean bool2;
        switch (this.a) {
            case 0:
                cw8 cw8 = this.c;
                aec aec = cw8.a;
                pec pec3 = this.b;
                Cursor o = aec.o(pec3, (CancellationSignal) null);
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
                    int o14 = gp0.o(o, "attaches");
                    pec = pec3;
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
                        if (o.moveToFirst()) {
                            long j = o.getLong(o2);
                            long j2 = o.getLong(o3);
                            long j3 = o.getLong(o4);
                            long j4 = o.getLong(o5);
                            long j5 = o.getLong(o6);
                            long j6 = o.getLong(o7);
                            String string = o.isNull(o8) ? null : o.getString(o8);
                            int i10 = o.getInt(o9);
                            cw8.a().getClass();
                            bp8.b.getClass();
                            bp8 t = s59.t(i10);
                            int i11 = o.getInt(o10);
                            cw8.a().getClass();
                            ls8 b2 = p29.b(i11);
                            long j7 = o.getLong(o11);
                            String string2 = o.isNull(o12) ? null : o.getString(o12);
                            String string3 = o.isNull(o13) ? null : o.getString(o13);
                            byte[] blob = o.isNull(o14) ? null : o.getBlob(o14);
                            cw8.a().getClass();
                            jj7 b3 = fu7.b(blob);
                            int i12 = o.getInt(o15);
                            boolean z2 = false;
                            boolean z3 = o.getInt(o16) != 0;
                            int i13 = o.getInt(o17);
                            long j8 = o.getLong(o18);
                            boolean z4 = o.getInt(o19) != 0;
                            long j9 = o.getLong(o20);
                            int i14 = o21;
                            if (o.isNull(i14)) {
                                i = o22;
                                str = null;
                            } else {
                                str = o.getString(i14);
                                i = o22;
                            }
                            if (o.isNull(i)) {
                                i2 = o23;
                                str2 = null;
                            } else {
                                str2 = o.getString(i);
                                i2 = o23;
                            }
                            long j10 = o.getLong(i2);
                            long j11 = o.getLong(o24);
                            int i15 = o.getInt(o25);
                            cw8.a().getClass();
                            int a2 = us8.a(i15);
                            long j12 = o.getLong(o26);
                            int i16 = o.getInt(o27);
                            int i17 = o.getInt(o28);
                            int i18 = o.getInt(o29);
                            long j13 = o.getLong(o30);
                            int i19 = o.getInt(o31);
                            int i20 = o.getInt(o32);
                            long j14 = o.getLong(o33);
                            int i21 = o34;
                            byte[] blob2 = o.isNull(i21) ? null : o.getBlob(i21);
                            cw8.a().getClass();
                            List a3 = p29.a(blob2);
                            int i22 = o35;
                            yr8 c2 = cw8.a().c(o.isNull(i22) ? null : o.getBlob(i22));
                            int i23 = o36;
                            Long valueOf = o.isNull(i23) ? null : Long.valueOf(o.getLong(i23));
                            Integer valueOf2 = o.isNull(o37) ? null : Integer.valueOf(o.getInt(o37));
                            if (valueOf2 == null) {
                                bool = null;
                            } else {
                                if (valueOf2.intValue() != 0) {
                                    z2 = true;
                                }
                                bool = Boolean.valueOf(z2);
                            }
                            jp8 = new jp8(j, j2, j3, j4, j5, j6, string, t, b2, j7, string2, string3, b3, i12, z3, i13, j8, z4, j9, str, str2, j10, j11, a2, j12, i16, i17, i18, j13, i19, i20, j14, a3, c2, valueOf, bool);
                        } else {
                            jp8 = null;
                        }
                        o.close();
                        pec.m();
                        return jp8;
                    } catch (Throwable th) {
                        th = th;
                        o.close();
                        pec.m();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    pec = pec3;
                    o.close();
                    pec.m();
                    throw th;
                }
            case 1:
                return a();
            case 2:
                return b();
            case 3:
                return c();
            case 4:
                return d();
            case 5:
                return e();
            default:
                cw8 cw82 = this.c;
                aec aec2 = cw82.a;
                pec pec4 = this.b;
                Cursor o38 = aec2.o(pec4, (CancellationSignal) null);
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
                    int o49 = gp0.o(o38, "error");
                    int o50 = gp0.o(o38, "localized_error");
                    int o51 = gp0.o(o38, "attaches");
                    pec2 = pec4;
                    try {
                        int o52 = gp0.o(o38, "media_type");
                        int o53 = gp0.o(o38, "detect_share");
                        int o54 = gp0.o(o38, "msg_link_type");
                        int o55 = gp0.o(o38, "msg_link_id");
                        int o56 = gp0.o(o38, "inserted_from_msg_link");
                        int o57 = gp0.o(o38, "msg_link_chat_id");
                        int o58 = gp0.o(o38, "msg_link_chat_name");
                        int o59 = gp0.o(o38, "msg_link_chat_link");
                        int o60 = gp0.o(o38, "msg_link_out_chat_id");
                        int o61 = gp0.o(o38, "msg_link_out_msg_id");
                        int o62 = gp0.o(o38, "type");
                        int o63 = gp0.o(o38, "chat_id");
                        int o64 = gp0.o(o38, "ttl");
                        int o65 = gp0.o(o38, "channel_views");
                        int o66 = gp0.o(o38, "channel_forwards");
                        int o67 = gp0.o(o38, "view_time");
                        int o68 = gp0.o(o38, "zoom");
                        int o69 = gp0.o(o38, "options");
                        int o70 = gp0.o(o38, "live_until");
                        int o71 = gp0.o(o38, "elements");
                        int o72 = gp0.o(o38, "reactions");
                        int o73 = gp0.o(o38, "delayed_attrs_time_to_fire");
                        int o74 = gp0.o(o38, "delayed_attrs_notify_sender");
                        int i24 = o51;
                        ArrayList arrayList = new ArrayList(o38.getCount());
                        while (o38.moveToNext()) {
                            long j15 = o38.getLong(o39);
                            long j16 = o38.getLong(o40);
                            long j17 = o38.getLong(o41);
                            long j18 = o38.getLong(o42);
                            long j19 = o38.getLong(o43);
                            long j20 = o38.getLong(o44);
                            String string4 = o38.isNull(o45) ? null : o38.getString(o45);
                            int i25 = o38.getInt(o46);
                            cw82.a().getClass();
                            bp8.b.getClass();
                            bp8 t2 = s59.t(i25);
                            int i26 = o38.getInt(o47);
                            cw82.a().getClass();
                            ls8 b4 = p29.b(i26);
                            long j21 = o38.getLong(o48);
                            String string5 = o38.isNull(o49) ? null : o38.getString(o49);
                            if (o38.isNull(o50)) {
                                i3 = i24;
                                str3 = null;
                            } else {
                                str3 = o38.getString(o50);
                                i3 = i24;
                            }
                            byte[] blob3 = o38.isNull(i3) ? null : o38.getBlob(i3);
                            cw82.a().getClass();
                            jj7 b5 = fu7.b(blob3);
                            i24 = i3;
                            int i27 = o52;
                            int i28 = o38.getInt(i27);
                            o52 = i27;
                            int i29 = o53;
                            boolean z5 = false;
                            boolean z6 = o38.getInt(i29) != 0;
                            int i30 = o54;
                            int i31 = i29;
                            int i32 = i30;
                            int i33 = o38.getInt(i32);
                            int i34 = i32;
                            int i35 = o55;
                            long j22 = o38.getLong(i35);
                            o55 = i35;
                            int i36 = o56;
                            if (o38.getInt(i36) != 0) {
                                o56 = i36;
                                i4 = o57;
                                z = true;
                            } else {
                                o56 = i36;
                                i4 = o57;
                                z = false;
                            }
                            long j23 = o38.getLong(i4);
                            o57 = i4;
                            int i37 = o58;
                            if (o38.isNull(i37)) {
                                o58 = i37;
                                i5 = o59;
                                str4 = null;
                            } else {
                                str4 = o38.getString(i37);
                                o58 = i37;
                                i5 = o59;
                            }
                            if (o38.isNull(i5)) {
                                o59 = i5;
                                i6 = o60;
                                str5 = null;
                            } else {
                                str5 = o38.getString(i5);
                                o59 = i5;
                                i6 = o60;
                            }
                            long j24 = o38.getLong(i6);
                            o60 = i6;
                            int i38 = o61;
                            long j25 = o38.getLong(i38);
                            o61 = i38;
                            int i39 = o62;
                            int i40 = o38.getInt(i39);
                            cw82.a().getClass();
                            int a4 = us8.a(i40);
                            o62 = i39;
                            int i41 = o63;
                            long j26 = o38.getLong(i41);
                            o63 = i41;
                            int i42 = o64;
                            int i43 = o38.getInt(i42);
                            o64 = i42;
                            int i44 = o65;
                            int i45 = o38.getInt(i44);
                            o65 = i44;
                            int i46 = o66;
                            int i47 = o38.getInt(i46);
                            o66 = i46;
                            int i48 = o67;
                            long j27 = o38.getLong(i48);
                            o67 = i48;
                            int i49 = o68;
                            int i50 = o38.getInt(i49);
                            o68 = i49;
                            int i51 = o69;
                            int i52 = o38.getInt(i51);
                            o69 = i51;
                            int i53 = o70;
                            long j28 = o38.getLong(i53);
                            o70 = i53;
                            int i54 = o71;
                            byte[] blob4 = o38.isNull(i54) ? null : o38.getBlob(i54);
                            cw82.a().getClass();
                            List a5 = p29.a(blob4);
                            o71 = i54;
                            int i55 = o72;
                            if (o38.isNull(i55)) {
                                i7 = i55;
                                i8 = o39;
                                bArr = null;
                            } else {
                                i7 = i55;
                                bArr = o38.getBlob(i55);
                                i8 = o39;
                            }
                            yr8 c3 = cw82.a().c(bArr);
                            int i56 = o73;
                            if (o38.isNull(i56)) {
                                i9 = o74;
                                l = null;
                            } else {
                                l = Long.valueOf(o38.getLong(i56));
                                i9 = o74;
                            }
                            Integer valueOf3 = o38.isNull(i9) ? null : Integer.valueOf(o38.getInt(i9));
                            if (valueOf3 == null) {
                                o73 = i56;
                                bool2 = null;
                            } else {
                                if (valueOf3.intValue() != 0) {
                                    z5 = true;
                                }
                                bool2 = Boolean.valueOf(z5);
                                o73 = i56;
                            }
                            arrayList.add(new jp8(j15, j16, j17, j18, j19, j20, string4, t2, b4, j21, string5, str3, b5, i28, z6, i33, j22, z, j23, str4, str5, j24, j25, a4, j26, i43, i45, i47, j27, i50, i52, j28, a5, c3, l, bool2));
                            o74 = i9;
                            o53 = i31;
                            o39 = i8;
                            o54 = i34;
                            o72 = i7;
                        }
                        o38.close();
                        pec2.m();
                        return arrayList;
                    } catch (Throwable th3) {
                        th = th3;
                        o38.close();
                        pec2.m();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    pec2 = pec4;
                    o38.close();
                    pec2.m();
                    throw th;
                }
        }
    }
}
