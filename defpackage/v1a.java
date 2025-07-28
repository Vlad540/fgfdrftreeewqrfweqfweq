package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: v1a  reason: default package */
public final class v1a implements og6 {
    public final long b;
    public final lh6 c;
    public final t97 d;
    public final t97 e;
    public boolean f;
    public final xb4 g = new xb4(11);

    public v1a(t97 t97, t97 t972, long j, lh6 lh6) {
        this.b = j;
        this.c = lh6;
        this.d = t97;
        this.e = t972;
    }

    public final boolean a() {
        return false;
    }

    public final void b() {
        this.f = true;
    }

    public final Comparator c() {
        return new xb4(12);
    }

    public final yx2 d(long j) {
        return swb.o(j, i());
    }

    public final Comparator e() {
        return this.g;
    }

    public final yx2 f(long j) {
        return swb.n(j, i());
    }

    public final long g() {
        pec pec;
        nd4 nd4;
        String str;
        int i;
        boolean z;
        int i2;
        boolean z2;
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
        if (!this.f) {
            return 0;
        }
        nec nec = ((b29) this.e.getValue()).a;
        cw8 d2 = nec.d();
        d2.getClass();
        pec a = pec.a(3, "SELECT * FROM messages WHERE chat_id = ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire DESC LIMIT ?");
        us8.n(a, 1, this.b, d2);
        a.j(2, (long) 10);
        a.j(3, 1);
        aec aec = d2.a;
        aec.b();
        Cursor o = aec.o(a, (CancellationSignal) null);
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
            pec = a;
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
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j = o.getLong(o2);
                    long j2 = o.getLong(o3);
                    long j3 = o.getLong(o4);
                    long j4 = o.getLong(o5);
                    long j5 = o.getLong(o6);
                    long j6 = o.getLong(o7);
                    String string = o.isNull(o8) ? null : o.getString(o8);
                    int i10 = o.getInt(o9);
                    d2.a().getClass();
                    bp8.b.getClass();
                    bp8 t = s59.t(i10);
                    int i11 = o.getInt(o10);
                    d2.a().getClass();
                    ls8 b2 = p29.b(i11);
                    long j7 = o.getLong(o11);
                    String string2 = o.isNull(o12) ? null : o.getString(o12);
                    if (o.isNull(o13)) {
                        i = i9;
                        str = null;
                    } else {
                        str = o.getString(o13);
                        i = i9;
                    }
                    byte[] blob = o.isNull(i) ? null : o.getBlob(i);
                    d2.a().getClass();
                    jj7 b3 = fu7.b(blob);
                    int i12 = o13;
                    int i13 = o15;
                    int i14 = o.getInt(i13);
                    o15 = i13;
                    int i15 = o16;
                    boolean z3 = false;
                    if (o.getInt(i15) != 0) {
                        o16 = i15;
                        i2 = o17;
                        z = true;
                    } else {
                        o16 = i15;
                        i2 = o17;
                        z = false;
                    }
                    int i16 = o.getInt(i2);
                    o17 = i2;
                    int i17 = o18;
                    long j8 = o.getLong(i17);
                    o18 = i17;
                    int i18 = o19;
                    if (o.getInt(i18) != 0) {
                        o19 = i18;
                        i3 = o20;
                        z2 = true;
                    } else {
                        o19 = i18;
                        i3 = o20;
                        z2 = false;
                    }
                    long j9 = o.getLong(i3);
                    o20 = i3;
                    int i19 = o21;
                    if (o.isNull(i19)) {
                        o21 = i19;
                        i4 = o22;
                        str2 = null;
                    } else {
                        str2 = o.getString(i19);
                        o21 = i19;
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
                    long j10 = o.getLong(i5);
                    o23 = i5;
                    int i20 = o24;
                    long j11 = o.getLong(i20);
                    o24 = i20;
                    int i21 = o25;
                    int i22 = o.getInt(i21);
                    d2.a().getClass();
                    int a2 = us8.a(i22);
                    o25 = i21;
                    int i23 = o26;
                    long j12 = o.getLong(i23);
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
                    long j13 = o.getLong(i30);
                    o30 = i30;
                    int i31 = o31;
                    int i32 = o.getInt(i31);
                    o31 = i31;
                    int i33 = o32;
                    int i34 = o.getInt(i33);
                    o32 = i33;
                    int i35 = o33;
                    long j14 = o.getLong(i35);
                    o33 = i35;
                    int i36 = o34;
                    byte[] blob2 = o.isNull(i36) ? null : o.getBlob(i36);
                    d2.a().getClass();
                    List a3 = p29.a(blob2);
                    o34 = i36;
                    int i37 = o35;
                    if (o.isNull(i37)) {
                        i6 = i37;
                        i7 = i;
                        bArr = null;
                    } else {
                        i6 = i37;
                        bArr = o.getBlob(i37);
                        i7 = i;
                    }
                    yr8 c2 = d2.a().c(bArr);
                    int i38 = o36;
                    if (o.isNull(i38)) {
                        i8 = o37;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i38));
                        i8 = o37;
                    }
                    Integer valueOf = o.isNull(i8) ? null : Integer.valueOf(o.getInt(i8));
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
                    arrayList.add(new jp8(j, j2, j3, j4, j5, j6, string, t, b2, j7, string2, str, b3, i14, z, i16, j8, z2, j9, str2, str3, j10, j11, a2, j12, i25, i27, i29, j13, i32, i34, j14, a3, c2, l, bool));
                    o37 = i8;
                    o13 = i12;
                    i9 = i7;
                    o35 = i6;
                }
                o.close();
                pec.m();
                jp8 jp8 = (jp8) o23.X(arrayList);
                vo8 b4 = jp8 != null ? nec2.b(jp8) : null;
                if (b4 == null || (nd4 = b4.X0) == null || !this.c.n(nd4.a)) {
                    return 0;
                }
                return b4.b;
            } catch (Throwable th) {
                th = th;
                o.close();
                pec.m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            pec = a;
            o.close();
            pec.m();
            throw th;
        }
    }

    public final long h() {
        nd4 nd4;
        nec nec = ((b29) this.e.getValue()).a;
        jp8 jp8 = (jp8) o23.X(cw8.j(nec.d(), this.b));
        vo8 b2 = jp8 != null ? nec.b(jp8) : null;
        if (b2 == null || (nd4 = b2.X0) == null || !this.c.n(nd4.a)) {
            return 0;
        }
        return b2.b;
    }

    public final List i() {
        return ((i22) xs7.M(bw4.a, new u1a(this, (Continuation) null))).b.n.d(md4.DELAYED);
    }
}
