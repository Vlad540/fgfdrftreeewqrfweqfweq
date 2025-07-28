package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import com.facebook.fresco.middleware.HasExtraData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: px4  reason: default package */
public final /* synthetic */ class px4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ px4(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.b = obj3;
    }

    private final void a() {
        pec pec;
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
        nec nec = (nec) this.c;
        cw8 d = nec.d();
        d.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM messages WHERE media_type in (");
        Set<Integer> set = (Set) this.o;
        int size = set.size();
        a06.e(sb, size);
        sb.append(")");
        pec a2 = pec.a(size, sb.toString());
        int i9 = 1;
        for (Integer num : set) {
            if (num == null) {
                a2.W(i9);
            } else {
                a2.j(i9, (long) num.intValue());
            }
            i9++;
        }
        aec aec = d.a;
        aec.b();
        Cursor o2 = aec.o(a2, (CancellationSignal) null);
        try {
            int o3 = gp0.o(o2, HasExtraData.KEY_ID);
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
            nec nec2 = nec;
            int o14 = gp0.o(o2, "localized_error");
            int o15 = gp0.o(o2, "attaches");
            pec = a2;
            try {
                int o16 = gp0.o(o2, "media_type");
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
                int i10 = o15;
                ArrayList arrayList = new ArrayList(o2.getCount());
                while (o2.moveToNext()) {
                    long j = o2.getLong(o3);
                    long j2 = o2.getLong(o4);
                    long j3 = o2.getLong(o5);
                    long j4 = o2.getLong(o6);
                    long j5 = o2.getLong(o7);
                    long j6 = o2.getLong(o8);
                    String string = o2.isNull(o9) ? null : o2.getString(o9);
                    int i11 = o2.getInt(o10);
                    d.a().getClass();
                    bp8.b.getClass();
                    bp8 t = s59.t(i11);
                    int i12 = o2.getInt(o11);
                    d.a().getClass();
                    ls8 b2 = p29.b(i12);
                    long j7 = o2.getLong(o12);
                    String string2 = o2.isNull(o13) ? null : o2.getString(o13);
                    if (o2.isNull(o14)) {
                        i = i10;
                        str = null;
                    } else {
                        str = o2.getString(o14);
                        i = i10;
                    }
                    byte[] blob = o2.isNull(i) ? null : o2.getBlob(i);
                    d.a().getClass();
                    jj7 b3 = fu7.b(blob);
                    i10 = i;
                    int i13 = o16;
                    int i14 = o2.getInt(i13);
                    o16 = i13;
                    int i15 = o17;
                    boolean z3 = false;
                    if (o2.getInt(i15) != 0) {
                        o17 = i15;
                        i2 = o18;
                        z = true;
                    } else {
                        o17 = i15;
                        i2 = o18;
                        z = false;
                    }
                    int i16 = o2.getInt(i2);
                    o18 = i2;
                    int i17 = o19;
                    long j8 = o2.getLong(i17);
                    o19 = i17;
                    int i18 = o20;
                    if (o2.getInt(i18) != 0) {
                        o20 = i18;
                        i3 = o21;
                        z2 = true;
                    } else {
                        o20 = i18;
                        i3 = o21;
                        z2 = false;
                    }
                    long j9 = o2.getLong(i3);
                    o21 = i3;
                    int i19 = o22;
                    if (o2.isNull(i19)) {
                        o22 = i19;
                        i4 = o23;
                        str2 = null;
                    } else {
                        str2 = o2.getString(i19);
                        o22 = i19;
                        i4 = o23;
                    }
                    if (o2.isNull(i4)) {
                        o23 = i4;
                        i5 = o24;
                        str3 = null;
                    } else {
                        str3 = o2.getString(i4);
                        o23 = i4;
                        i5 = o24;
                    }
                    long j10 = o2.getLong(i5);
                    o24 = i5;
                    int i20 = o25;
                    long j11 = o2.getLong(i20);
                    o25 = i20;
                    int i21 = o26;
                    int i22 = o2.getInt(i21);
                    d.a().getClass();
                    int a3 = us8.a(i22);
                    o26 = i21;
                    int i23 = o27;
                    long j12 = o2.getLong(i23);
                    o27 = i23;
                    int i24 = o28;
                    int i25 = o2.getInt(i24);
                    o28 = i24;
                    int i26 = o29;
                    int i27 = o2.getInt(i26);
                    o29 = i26;
                    int i28 = o30;
                    int i29 = o2.getInt(i28);
                    o30 = i28;
                    int i30 = o31;
                    long j13 = o2.getLong(i30);
                    o31 = i30;
                    int i31 = o32;
                    int i32 = o2.getInt(i31);
                    o32 = i31;
                    int i33 = o33;
                    int i34 = o2.getInt(i33);
                    o33 = i33;
                    int i35 = o34;
                    long j14 = o2.getLong(i35);
                    o34 = i35;
                    int i36 = o35;
                    byte[] blob2 = o2.isNull(i36) ? null : o2.getBlob(i36);
                    d.a().getClass();
                    List a4 = p29.a(blob2);
                    o35 = i36;
                    int i37 = o36;
                    if (o2.isNull(i37)) {
                        i6 = i37;
                        i7 = o14;
                        bArr = null;
                    } else {
                        i6 = i37;
                        bArr = o2.getBlob(i37);
                        i7 = o14;
                    }
                    yr8 c2 = d.a().c(bArr);
                    int i38 = o37;
                    if (o2.isNull(i38)) {
                        i8 = o38;
                        l = null;
                    } else {
                        l = Long.valueOf(o2.getLong(i38));
                        i8 = o38;
                    }
                    Integer valueOf = o2.isNull(i8) ? null : Integer.valueOf(o2.getInt(i8));
                    if (valueOf == null) {
                        o37 = i38;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z3 = true;
                        }
                        bool = Boolean.valueOf(z3);
                        o37 = i38;
                    }
                    arrayList.add(new jp8(j, j2, j3, j4, j5, j6, string, t, b2, j7, string2, str, b3, i14, z, i16, j8, z2, j9, str2, str3, j10, j11, a3, j12, i25, i27, i29, j13, i32, i34, j14, a4, c2, l, bool));
                    o38 = i8;
                    o14 = i7;
                    o36 = i6;
                }
                o2.close();
                pec.m();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jp8 jp8 = (jp8) it.next();
                    p10 I = jp8.m.I();
                    ((of3) this.b).accept(I);
                    jj7 c3 = I.c();
                    nec2.d().m(new eve(jp8.a, c3, fu7.c(c3)));
                }
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

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d4, code lost:
        if (r6.o() == false) goto L_0x0155;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r0 = r17
            r1 = 7
            r2 = 3
            r3 = 2
            r4 = 5
            r5 = 4
            r6 = 0
            r7 = 0
            r8 = 1
            int r9 = r0.a
            switch(r9) {
                case 0: goto L_0x07e9;
                case 1: goto L_0x07c8;
                case 2: goto L_0x07ac;
                case 3: goto L_0x079a;
                case 4: goto L_0x074e;
                case 5: goto L_0x071e;
                case 6: goto L_0x06e2;
                case 7: goto L_0x06b4;
                case 8: goto L_0x06a0;
                case 9: goto L_0x0690;
                case 10: goto L_0x0677;
                case 11: goto L_0x061f;
                case 12: goto L_0x05c7;
                case 13: goto L_0x05ad;
                case 14: goto L_0x057e;
                case 15: goto L_0x04e4;
                case 16: goto L_0x04cc;
                case 17: goto L_0x04b6;
                case 18: goto L_0x04a0;
                case 19: goto L_0x047c;
                case 20: goto L_0x042f;
                case 21: goto L_0x01d7;
                case 22: goto L_0x01c5;
                case 23: goto L_0x0181;
                case 24: goto L_0x015e;
                case 25: goto L_0x0082;
                case 26: goto L_0x006a;
                case 27: goto L_0x0043;
                case 28: goto L_0x003f;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.Object r1 = r0.c
            noc r1 = (noc) r1
            java.lang.Object r2 = r0.o
            org.webrtc.Size r2 = (org.webrtc.Size) r2
            java.lang.Object r0 = r0.b
            android.content.Intent r0 = (android.content.Intent) r0
            hz5 r3 = r1.Y
            r3.e()
            ty5 r3 = r1.X
            r3.getClass()
            sy5 r5 = new sy5
            r5.<init>(r3, r7)
            jr3 r3 = r3.c
            r3.c(r5)
            py5 r1 = r1.o
            r1.getClass()
            px4 r3 = new px4
            r3.<init>((java.lang.Object) r1, (java.lang.Object) r0, (java.lang.Object) r2, (int) r4)
            jr3 r0 = r1.o
            r0.c(r3)
            return
        L_0x003f:
            r17.a()
            return
        L_0x0043:
            java.lang.Object r1 = r0.c
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x004b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0069
            java.lang.Object r2 = r1.next()
            vo8 r2 = (vo8) r2
            long r2 = r2.b
            java.lang.Object r4 = r0.o
            nec r4 = (nec) r4
            cw8 r4 = r4.d()
            java.lang.Object r5 = r0.b
            bp8 r5 = (bp8) r5
            r4.n(r2, r5)
            goto L_0x004b
        L_0x0069:
            return
        L_0x006a:
            java.lang.Object r1 = r0.c
            pb8 r1 = (defpackage.pb8) r1
            r1.getClass()
            java.lang.Object r2 = r0.o
            xq1 r2 = (defpackage.xq1) r2
            java.util.Objects.toString(r2)
            java.util.List r1 = r1.c
            java.lang.Object r0 = r0.b
            ch7 r0 = (defpackage.ch7) r0
            r1.remove(r0)
            return
        L_0x0082:
            java.lang.Object r1 = r0.c
            ug4 r1 = (defpackage.ug4) r1
            r1.getClass()
            java.lang.Object r4 = r0.o
            r11 = r4
            y4e r11 = (defpackage.y4e) r11
            boolean r4 = r11.a()
            java.lang.Object r6 = r1.g
            y5c r6 = (defpackage.y5c) r6
            if (r4 != 0) goto L_0x0155
            vj4 r4 = r6.a0
            int r9 = r4.b
            int r9 = defpackage.hr1.t(r9)
            if (r9 == 0) goto L_0x00d8
            if (r9 == r8) goto L_0x00ca
            if (r9 == r3) goto L_0x00d8
            if (r9 == r2) goto L_0x00ca
            if (r9 != r5) goto L_0x00ab
            goto L_0x00d8
        L_0x00ab:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "State "
            r1.<init>(r2)
            int r2 = r4.b
            java.lang.String r2 = sxe.u(r2)
            r1.append(r2)
            java.lang.String r2 = " is not handled"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00ca:
            java.lang.Object r4 = r4.h
            y4e r4 = (defpackage.y4e) r4
            if (r4 != r11) goto L_0x00d8
            boolean r4 = r6.o()
            if (r4 != 0) goto L_0x00d8
            goto L_0x0155
        L_0x00d8:
            vj4 r4 = new vj4
            hs1 r5 = r6.f
            java.util.concurrent.Executor r9 = r6.d
            ryc r15 = r6.e
            r4.<init>(r5, r15, r9)
            k96 r5 = r6.D
            java.lang.Object r5 = defpackage.y5c.l(r5)
            r14 = r5
            z90 r14 = (defpackage.z90) r14
            nb0 r13 = r6.u
            int r5 = r4.b
            int r5 = defpackage.hr1.t(r5)
            if (r5 == 0) goto L_0x010d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r3 = r4.b
            java.lang.String r3 = sxe.u(r3)
            java.lang.String r5 = "configure() shouldn't be called in "
            java.lang.String r3 = r5.concat(r3)
            r0.<init>(r3)
            as6 r3 = new as6
            r3.<init>(r8, r0)
            goto L_0x014a
        L_0x010d:
            r4.b = r3
            r4.h = r11
            r4.toString()
            t3f r3 = new t3f
            r3.<init>(r4, r7)
            vn1 r3 = defpackage.hwf.f(r3)
            r4.k = r3
            t3f r3 = new t3f
            r3.<init>(r4, r8)
            vn1 r3 = defpackage.hwf.f(r3)
            r4.m = r3
            scc r3 = new scc
            java.lang.Object r0 = r0.b
            r12 = r0
            kje r12 = (defpackage.kje) r12
            r9 = r3
            r10 = r4
            r9.<init>(r10, r11, r12, r13, r14)
            vn1 r0 = defpackage.hwf.f(r3)
            qqe r3 = new qqe
            r3.<init>(r4)
            java.lang.Object r5 = r4.d
            java.util.concurrent.Executor r5 = (java.util.concurrent.Executor) r5
            ct0.a(r0, r3, r5)
            ch7 r3 = ct0.A(r0)
        L_0x014a:
            r6.a0 = r4
            v2b r0 = new v2b
            r0.<init>(r1, r2, r4)
            ct0.a(r3, r0, r15)
            goto L_0x015d
        L_0x0155:
            r11.a()
            vj4 r0 = r6.a0
            java.util.Objects.toString(r0)
        L_0x015d:
            return
        L_0x015e:
            java.lang.Object r1 = r0.c
            y5c r1 = (defpackage.y5c) r1
            y4e r2 = r1.y
            if (r2 == 0) goto L_0x0171
            boolean r2 = r2.a()
            if (r2 != 0) goto L_0x0171
            y4e r2 = r1.y
            r2.d()
        L_0x0171:
            java.lang.Object r2 = r0.o
            y4e r2 = (defpackage.y4e) r2
            r1.y = r2
            java.lang.Object r0 = r0.b
            kje r0 = (defpackage.kje) r0
            r1.z = r0
            r1.h(r2, r0, r8)
            return
        L_0x0181:
            java.lang.Object r1 = r0.c
            n2c r1 = (n2c) r1
            r1.getClass()
            java.lang.Object r2 = r0.o
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r2 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r2
            b2c r2 = r2.L()
            java.lang.Object r0 = r0.b
            java.util.List r0 = (java.util.List) r0
            n73 r0 = defpackage.ms9.j(r0)
            w48 r4 = new w48
            r5 = 24
            r4.<init>((java.lang.Object) r1, (int) r5, (java.lang.Object) r2)
            au9 r1 = new au9
            r1.<init>(r0, r4, r7)
            rs9 r0 = r1.v()
            java.lang.Object r0 = r0.e()
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x01c4
            r2.getClass()
            a2c r1 = new a2c
            r1.<init>(r2, r0, r8)
            y63 r0 = new y63
            r0.<init>(r3, r1)
            r0.a()
        L_0x01c4:
            return
        L_0x01c5:
            java.lang.Object r1 = r0.c
            czb r1 = (czb) r1
            r1.a = r8
            java.lang.Object r1 = r0.o
            dzb r1 = (dzb) r1
            java.lang.Object r0 = r0.b
            one.me.rlottie.RLottieImageView r0 = (one.me.rlottie.RLottieImageView) r0
            r1.removeView(r0)
            return
        L_0x01d7:
            java.lang.Object r1 = r0.c
            zla r1 = (zla) r1
            java.lang.Object r2 = r0.o
            cc9 r2 = (cc9) r2
            java.lang.Object r0 = r0.b
            r3 = r0
            onc r3 = (onc) r3
            d r0 = r1.I0
            xp0 r0 = r0.a()
            java.lang.Object r0 = r0.b
            r1 = r0
            jl7 r1 = (jl7) r1
            if (r1 == 0) goto L_0x042e
            boolean r0 = r2.b
            boolean r4 = r2.c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r9 = "startScreenVideoCapture, start="
            r5.<init>(r9)
            r5.append(r0)
            java.lang.String r9 = ", isFast="
            r5.append(r9)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            xwb r9 = r1.n
            java.lang.String r10 = "OKRTCLmsAdapter"
            r9.log(r10, r5)
            k40 r5 = r1.e
            java.lang.String r9 = "Periodical screen dimensions check cancelled"
            if (r5 != 0) goto L_0x0230
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r4 = ": has no video capturer factory"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            xwb r4 = r1.n
            r4.log(r10, r0)
            goto L_0x0396
        L_0x0230:
            if (r0 == 0) goto L_0x0356
            ow0 r0 = r1.b
            if (r0 == 0) goto L_0x0356
            if (r4 != 0) goto L_0x0240
            gx0 r0 = r0.a
            fe1 r0 = r0.y0
            boolean r0 = r0.i
            r0 = r0 ^ r8
            goto L_0x0241
        L_0x0240:
            r0 = r8
        L_0x0241:
            if (r0 == 0) goto L_0x0356
            pnc r0 = r1.t
            if (r0 == 0) goto L_0x0249
            goto L_0x0396
        L_0x0249:
            r1.a()
            r0 = r3
            b51 r0 = (defpackage.b51) r0
            t97 r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            eq1 r0 = (defpackage.eq1) r0
            android.content.Intent r4 = r0.a
            r0.a = r6
            if (r4 != 0) goto L_0x025f
            goto L_0x0396
        L_0x025f:
            k40 r0 = r1.e
            java.util.concurrent.Executor r5 = r1.g
            java.lang.Object r0 = r0.o
            r11 = r0
            xwb r11 = (xwb) r11
            pnc r0 = new pnc     // Catch:{ Exception -> 0x026e }
            r0.<init>(r4, r5, r11)     // Catch:{ Exception -> 0x026e }
            goto L_0x027e
        L_0x026e:
            r0 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "Cant create screen capturer"
            r4.<init>(r5, r0)
            java.lang.String r0 = "OKRTCSvcFactory"
            java.lang.String r5 = "screen.capture.adapter"
            r11.reportException(r0, r5, r4)
            r0 = r6
        L_0x027e:
            r1.t = r0
            pnc r0 = r1.t
            if (r0 != 0) goto L_0x029c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r4 = ": cant get screen capturer from factory"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            xwb r4 = r1.n
            r4.log(r10, r0)
            goto L_0x0340
        L_0x029c:
            pnc r0 = r1.t     // Catch:{ RuntimeException -> 0x02a5 }
            org.webrtc.ScreenCapturerAndroid r0 = r0.a     // Catch:{ RuntimeException -> 0x02a5 }
            r1.f(r0)     // Catch:{ RuntimeException -> 0x02a5 }
            r0 = r8
            goto L_0x02ae
        L_0x02a5:
            r0 = move-exception
            xwb r4 = r1.n
            java.lang.String r5 = "screen.video.track.create"
            r4.reportException(r10, r5, r0)
            r0 = r7
        L_0x02ae:
            if (r0 == 0) goto L_0x031a
            r1.e()
            org.webrtc.Size r0 = r1.B
            android.util.DisplayMetrics r4 = r1.A
            int r5 = r4.widthPixels
            r0.width = r5
            int r4 = r4.heightPixels
            r0.height = r4
            android.graphics.Point r0 = d59.a(r5, r4)
            pnc r4 = r1.t
            int r5 = r0.x
            int r0 = r0.y
            r4.a(r5, r0)
            pnc r4 = r1.t
            xwb r0 = r4.b
            java.lang.String r5 = "ScreenCapturerAdapter"
            java.lang.String r11 = "start"
            r0.log(r5, r11)
            boolean r0 = r4.d
            if (r0 == 0) goto L_0x02e3
            xwb r0 = r4.b
            java.lang.String r4 = "Screen capturer is already started"
            r0.log(r5, r4)
            goto L_0x030c
        L_0x02e3:
            boolean r0 = r4.c
            if (r0 == 0) goto L_0x02ef
            xwb r0 = r4.b
            java.lang.String r4 = "Screen capture session stopped"
            r0.log(r5, r4)
            goto L_0x030c
        L_0x02ef:
            org.webrtc.ScreenCapturerAndroid r0 = r4.a     // Catch:{ Exception -> 0x02fd }
            int r11 = r4.g     // Catch:{ Exception -> 0x02fd }
            int r12 = r4.f     // Catch:{ Exception -> 0x02fd }
            int r13 = r4.e     // Catch:{ Exception -> 0x02fd }
            r0.startCapture(r11, r12, r13)     // Catch:{ Exception -> 0x02fd }
            r4.d = r8     // Catch:{ Exception -> 0x02fd }
            goto L_0x030c
        L_0x02fd:
            r0 = move-exception
            xwb r4 = r4.b
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r12 = "Start screen capture failed"
            r11.<init>(r12, r0)
            java.lang.String r0 = "screen.capture.start"
            r4.reportException(r5, r0, r11)
        L_0x030c:
            goc r0 = r1.z
            r0.o(r8)
            hl7 r0 = new hl7
            r0.<init>(r1)
            r1.b(r0)
            goto L_0x0340
        L_0x031a:
            j8e r0 = r1.D
            if (r0 == 0) goto L_0x0334
            r0.a = r6
            java.lang.Object r4 = r0.b
            android.os.Handler r4 = (android.os.Handler) r4
            java.lang.Object r5 = r0.c
            lde r5 = (defpackage.lde) r5
            r4.removeCallbacks(r5)
            java.lang.Object r0 = r0.o
            jl7 r0 = (jl7) r0
            xwb r0 = r0.n
            r0.log(r10, r9)
        L_0x0334:
            pnc r0 = r1.t
            r0.b()
            r1.t = r6
            goc r0 = r1.z
            r0.o(r7)
        L_0x0340:
            java.util.concurrent.CopyOnWriteArraySet r0 = r1.c
            java.util.Iterator r0 = r0.iterator()
        L_0x0346:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0396
            java.lang.Object r4 = r0.next()
            ll7 r4 = (ll7) r4
            r4.b(r1)
            goto L_0x0346
        L_0x0356:
            pnc r0 = r1.t
            if (r0 == 0) goto L_0x0396
            j8e r0 = r1.D
            if (r0 == 0) goto L_0x0374
            r0.a = r6
            java.lang.Object r4 = r0.b
            android.os.Handler r4 = (android.os.Handler) r4
            java.lang.Object r5 = r0.c
            lde r5 = (defpackage.lde) r5
            r4.removeCallbacks(r5)
            java.lang.Object r0 = r0.o
            jl7 r0 = (jl7) r0
            xwb r0 = r0.n
            r0.log(r10, r9)
        L_0x0374:
            pnc r0 = r1.t
            r0.b()
            r1.t = r6
            goc r0 = r1.z
            r0.o(r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = r1.c
            java.util.Iterator r0 = r0.iterator()
        L_0x0386:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0396
            java.lang.Object r4 = r0.next()
            ll7 r4 = (ll7) r4
            r4.b(r1)
            goto L_0x0386
        L_0x0396:
            boolean r0 = r2.b
            boolean r2 = r2.c
            noc r4 = r1.u
            if (r4 != 0) goto L_0x03a7
            xwb r0 = r1.n
            java.lang.String r1 = "Data channel screen share sender doesn't exist"
            r0.log(r10, r1)
            goto L_0x042e
        L_0x03a7:
            if (r0 == 0) goto L_0x03f6
            if (r2 != 0) goto L_0x03f6
            r1.e()
            org.webrtc.Size r0 = r1.B
            android.util.DisplayMetrics r2 = r1.A
            int r5 = r2.widthPixels
            r0.width = r5
            int r2 = r2.heightPixels
            r0.height = r2
            org.webrtc.Size r0 = new org.webrtc.Size
            r0.<init>(r5, r2)
            boolean r2 = r4.Z
            if (r2 != 0) goto L_0x03f2
            if (r3 != 0) goto L_0x03c6
            goto L_0x03f2
        L_0x03c6:
            b51 r3 = (defpackage.b51) r3
            t97 r2 = r3.a
            java.lang.Object r2 = r2.getValue()
            eq1 r2 = (defpackage.eq1) r2
            android.content.Intent r3 = r2.a
            r2.a = r6
            if (r3 != 0) goto L_0x03d7
            goto L_0x03f2
        L_0x03d7:
            r4.Z = r8
            jr3 r2 = r4.b
            px4 r5 = new px4
            r6 = 29
            r5.<init>((java.lang.Object) r4, (java.lang.Object) r0, (java.lang.Object) r3, (int) r6)
            r2.c(r5)
            jr3 r0 = r4.b
            moc r2 = r4.w0
            java.lang.Object r0 = r0.b
            android.os.Handler r0 = (android.os.Handler) r0
            r5 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r2, r5)
        L_0x03f2:
            r1.b(r4)
            goto L_0x042e
        L_0x03f6:
            if (r0 != 0) goto L_0x0412
            j8e r0 = r1.D
            if (r0 == 0) goto L_0x0412
            r0.a = r6
            java.lang.Object r1 = r0.b
            android.os.Handler r1 = (android.os.Handler) r1
            java.lang.Object r2 = r0.c
            lde r2 = (defpackage.lde) r2
            r1.removeCallbacks(r2)
            java.lang.Object r0 = r0.o
            jl7 r0 = (jl7) r0
            xwb r0 = r0.n
            r0.log(r10, r9)
        L_0x0412:
            boolean r0 = r4.Z
            if (r0 != 0) goto L_0x0417
            goto L_0x042e
        L_0x0417:
            r4.Z = r7
            jr3 r0 = r4.b
            moc r1 = new moc
            r1.<init>(r4, r8)
            r0.c(r1)
            jr3 r0 = r4.b
            moc r1 = r4.w0
            java.lang.Object r0 = r0.b
            android.os.Handler r0 = (android.os.Handler) r0
            r0.removeCallbacks(r1)
        L_0x042e:
            return
        L_0x042f:
            java.lang.Object r1 = r0.c
            nb9 r1 = (nb9) r1
            java.lang.Object r2 = r0.o
            ch7 r2 = (defpackage.ch7) r2
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0456 }
            r38 r2 = (defpackage.r38) r2     // Catch:{ all -> 0x0456 }
            r1.m = r2     // Catch:{ all -> 0x0456 }
            if (r2 == 0) goto L_0x0458
            q38 r2 = r2.c     // Catch:{ all -> 0x0456 }
            boolean r2 = r2.isConnected()     // Catch:{ all -> 0x0456 }
            if (r2 != r8) goto L_0x0458
            nb9.i(r1)     // Catch:{ all -> 0x0456 }
            java.lang.Object r0 = r0.b
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto L_0x0458
            r0.run()     // Catch:{ all -> 0x0456 }
            goto L_0x0458
        L_0x0456:
            r0 = move-exception
            goto L_0x045b
        L_0x0458:
            jue r0 = defpackage.jue.a     // Catch:{ all -> 0x0456 }
            goto L_0x0461
        L_0x045b:
            kcc r2 = new kcc
            r2.<init>(r0)
            r0 = r2
        L_0x0461:
            java.lang.Throwable r0 = defpackage.mcc.a(r0)
            if (r0 == 0) goto L_0x047b
            r1.k(r8)
            java.lang.String r0 = "retry connect"
            java.lang.String r2 = "nb9"
            defpackage.udd.p(r2, r0, new java.lang.Object[0])
            int r0 = r1.l
            if (r0 >= r4) goto L_0x047b
            int r0 = r0 + r8
            r1.l = r0
            r1.h()
        L_0x047b:
            return
        L_0x047c:
            java.lang.Object r1 = r0.c
            otf r1 = (defpackage.otf) r1
            java.lang.Object r1 = r1.b
            pf8 r1 = (defpackage.pf8) r1
            java.lang.Object r1 = r1.j
            g44 r1 = (defpackage.g44) r1
            java.lang.Object r2 = r0.o
            android.util.Pair r2 = (android.util.Pair) r2
            java.lang.Object r3 = r2.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.second
            se8 r2 = (defpackage.se8) r2
            java.lang.Object r0 = r0.b
            java.lang.Exception r0 = (java.lang.Exception) r0
            r1.s(r3, r2, r0)
            return
        L_0x04a0:
            java.lang.Object r1 = r0.c
            jn r1 = (defpackage.jn) r1
            int r2 = r1.b
            java.lang.Object r1 = r1.c
            se8 r1 = (defpackage.se8) r1
            java.lang.Object r3 = r0.o
            cf8 r3 = (defpackage.cf8) r3
            java.lang.Object r0 = r0.b
            i78 r0 = (defpackage.i78) r0
            r3.E(r2, r1, r0)
            return
        L_0x04b6:
            java.lang.Object r1 = r0.c
            af8 r1 = (defpackage.af8) r1
            int r2 = r1.b
            java.lang.Object r1 = r1.c
            re8 r1 = (defpackage.re8) r1
            java.lang.Object r3 = r0.o
            bf8 r3 = (defpackage.bf8) r3
            java.lang.Object r0 = r0.b
            i78 r0 = (defpackage.i78) r0
            r3.D(r2, r1, r0)
            return
        L_0x04cc:
            java.lang.Object r1 = r0.c
            cd8 r1 = (defpackage.cd8) r1
            boolean r2 = r1.i()
            if (r2 != 0) goto L_0x04e3
            qza r1 = r1.s
            java.lang.Object r2 = r0.o
            be8 r2 = (defpackage.be8) r2
            java.lang.Object r0 = r0.b
            jc8 r0 = (defpackage.jc8) r0
            r2.e(r1, r0)
        L_0x04e3:
            return
        L_0x04e4:
            java.lang.Object r1 = r0.c
            vd8 r1 = (defpackage.vd8) r1
            r1.getClass()
            java.lang.Object r2 = r0.o
            ue r2 = (defpackage.ue) r2
            java.lang.Object r3 = r2.i
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r0 = r0.b
            kc8 r0 = (defpackage.kc8) r0
            boolean r4 = r3.containsKey(r0)
            if (r4 == 0) goto L_0x04ff
            goto L_0x0572
        L_0x04ff:
            i88 r4 = new i88
            java.lang.Object r9 = r2.c
            r10 = r9
            vd8 r10 = (defpackage.vd8) r10
            r4.<init>(r10, r0)
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r11 = "androidx.media3.session.MediaNotificationManager"
            r9.putBoolean(r11, r8)
            cd8 r8 = r0.a
            m3d r11 = r8.j
            r10.getClass()
            r11.getClass()
            android.os.Bundle r8 = android.os.Bundle.EMPTY
            defpackage.oze.w()
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>(r9)
            android.os.Looper r8 = android.os.Looper.getMainLooper()
            r8.getClass()
            z38 r15 = new z38
            r15.<init>(r8)
            l3d r9 = r11.a
            boolean r9 = r9.e()
            if (r9 == 0) goto L_0x0545
            mn r6 = new mn
            sz3 r9 = new sz3
            r9.<init>(r10)
            r6.<init>((int) r5, (java.lang.Object) r9)
        L_0x0545:
            r16 = r6
            r38 r5 = new r38
            r9 = r5
            r13 = r4
            r14 = r8
            r6 = r15
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            android.os.Handler r9 = new android.os.Handler
            r9.<init>(r8)
            n38 r8 = new n38
            r8.<init>(r6, r5, r7)
            defpackage.oze.W(r9, r8)
            r3.put(r0, r6)
            wc3 r3 = new wc3
            r14 = 7
            r9 = r3
            r10 = r2
            r11 = r6
            r12 = r4
            r13 = r0
            r9.<init>((java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (java.lang.Object) r13, (int) r14)
            java.lang.Object r2 = r2.g
            y44 r2 = (defpackage.y44) r2
            r6.c(r3, r2)
        L_0x0572:
            wwc r2 = new wwc
            r3 = 17
            r2.<init>(r3, r1)
            cd8 r0 = r0.a
            r0.v = r2
            return
        L_0x057e:
            java.lang.Object r2 = r0.c
            f18 r2 = (defpackage.f18) r2
            java.lang.Object r3 = r2.c
            cd8 r3 = (defpackage.cd8) r3
            java.lang.Object r4 = r0.o
            ic8 r4 = (defpackage.ic8) r4
            boolean r5 = r3.h(r4)
            if (r5 == 0) goto L_0x0598
            java.lang.Object r0 = r0.b
            android.view.KeyEvent r0 = (android.view.KeyEvent) r0
            r3.a(r0, r7)
            goto L_0x05aa
        L_0x0598:
            pd8 r0 = r4.a
            r0.getClass()
            md8 r3 = r3.h
            r3.getClass()
            dd8 r4 = new dd8
            r4.<init>((defpackage.md8) r3, (int) r1)
            r3.N(r8, r4, r0, r8)
        L_0x05aa:
            r2.b = r6
            return
        L_0x05ad:
            java.lang.Object r1 = r0.c
            cd8 r1 = (defpackage.cd8) r1
            r1.getClass()
            java.lang.Object r2 = r0.o
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            me8 r1 = r1.g
            nxc r1 = r1.e
            java.lang.Object r0 = r0.b
            ic8 r0 = (defpackage.ic8) r0
            r1.r(r0)
            return
        L_0x05c7:
            java.lang.Object r1 = r0.c
            z88 r1 = (defpackage.z88) r1
            r1.getClass()
            java.lang.Object r2 = r0.o
            ts6 r2 = (defpackage.ts6) r2
            e8c r2 = r2.j()
            g44 r1 = r1.c
            kya r3 = r1.Z
            r3.getClass()
            yd3 r1 = r1.o
            r1.getClass()
            ws6 r4 = defpackage.ws6.j(r2)
            r1.b = r4
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L_0x05ff
            java.lang.Object r2 = r2.get(r7)
            se8 r2 = (defpackage.se8) r2
            r1.e = r2
            java.lang.Object r0 = r0.b
            se8 r0 = (defpackage.se8) r0
            r0.getClass()
            r1.f = r0
        L_0x05ff:
            java.lang.Object r0 = r1.d
            se8 r0 = (defpackage.se8) r0
            if (r0 != 0) goto L_0x0617
            java.lang.Object r0 = r1.b
            ws6 r0 = (defpackage.ws6) r0
            java.lang.Object r2 = r1.e
            se8 r2 = (defpackage.se8) r2
            java.lang.Object r4 = r1.a
            qje r4 = (defpackage.qje) r4
            se8 r0 = yd3.d(r3, r0, r2, r4)
            r1.d = r0
        L_0x0617:
            vje r0 = r3.x0()
            r1.f(r0)
            return
        L_0x061f:
            java.lang.Object r1 = r0.c
            y88 r1 = (defpackage.y88) r1
            r1.getClass()
            java.lang.Object r2 = r0.o
            ts6 r2 = (defpackage.ts6) r2
            e8c r2 = r2.j()
            f44 r1 = r1.c
            u2 r3 = r1.Z
            r3.getClass()
            oz2 r1 = r1.o
            r1.getClass()
            ws6 r4 = defpackage.ws6.j(r2)
            r1.a = r4
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L_0x0657
            java.lang.Object r2 = r2.get(r7)
            re8 r2 = (defpackage.re8) r2
            r1.e = r2
            java.lang.Object r0 = r0.b
            re8 r0 = (defpackage.re8) r0
            r0.getClass()
            r1.f = r0
        L_0x0657:
            java.lang.Object r0 = r1.d
            re8 r0 = (defpackage.re8) r0
            if (r0 != 0) goto L_0x066f
            java.lang.Object r0 = r1.a
            ws6 r0 = (defpackage.ws6) r0
            java.lang.Object r2 = r1.e
            re8 r2 = (defpackage.re8) r2
            java.lang.Object r4 = r1.b
            pje r4 = (defpackage.pje) r4
            re8 r0 = defpackage.oz2.g(r3, r0, r2, r4)
            r1.d = r0
        L_0x066f:
            uje r0 = r3.O1()
            r1.n(r0)
            return
        L_0x0677:
            java.lang.Object r1 = r0.c
            b2b r1 = (defpackage.b2b) r1
            java.lang.Object r1 = r1.b
            vb9 r1 = (defpackage.vb9) r1
            java.lang.Object r2 = r0.o
            ai7 r2 = (defpackage.ai7) r2
            if (r2 == 0) goto L_0x0688
            r1.j(r2)
        L_0x0688:
            java.lang.Object r0 = r0.b
            ai7 r0 = (defpackage.ai7) r0
            r1.f(r0)
            return
        L_0x0690:
            java.lang.Object r1 = r0.c
            bq6 r1 = (defpackage.bq6) r1
            java.lang.Object r2 = r0.b
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            java.lang.Object r0 = r0.o
            lv1 r0 = (lv1) r0
            r1.J(r2, r0)
            return
        L_0x06a0:
            java.lang.Object r1 = r0.c
            mod r1 = (defpackage.mod) r1
            java.lang.Object r1 = r1.b
            sp6 r1 = (defpackage.sp6) r1
            java.lang.Object r2 = r0.o
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            java.lang.Object r0 = r0.b
            xu5 r0 = (defpackage.xu5) r0
            r1.b(r2, r0)
            return
        L_0x06b4:
            java.lang.Object r1 = r0.c
            qm6 r1 = (qm6) r1
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.w0
            boolean r2 = r2.get()
            if (r2 == 0) goto L_0x06c1
            goto L_0x06e1
        L_0x06c1:
            java.lang.Object r2 = r0.o
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.b
            am6 r0 = (am6) r0
            java.lang.Object[] r3 = new java.lang.Object[]{r2, r0}
            java.lang.String r4 = "rm6"
            java.lang.String r5 = "onFileUploadFailed: message =%s, httpError=%s"
            defpackage.udd.t(r4, r5, r3)
            one.me.sdk.transfer.exceptions.HttpErrorException r3 = new one.me.sdk.transfer.exceptions.HttpErrorException
            r3.<init>(r2, r0)
            bw9 r0 = r1.Z
            r0.onError(r3)
            r1.a(r7)
        L_0x06e1:
            return
        L_0x06e2:
            java.lang.Object r1 = r0.c
            ty5 r1 = (ty5) r1
            java.lang.Object r2 = r0.o
            hz5 r2 = (hz5) r2
            java.lang.Object r0 = r0.b
            org.webrtc.VideoFrame r0 = (org.webrtc.VideoFrame) r0
            boolean r3 = r1.B0
            if (r3 == 0) goto L_0x0715
            long r3 = android.os.SystemClock.elapsedRealtime()
            if (r2 == 0) goto L_0x06ff
            boolean r5 = r2.h
            r2.h = r7
            if (r5 == 0) goto L_0x06ff
            r7 = r8
        L_0x06ff:
            long r5 = r1.x0
            long r9 = r1.a
            long r5 = r5 + r9
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x0709
            goto L_0x070a
        L_0x0709:
            r8 = r7
        L_0x070a:
            if (r8 == 0) goto L_0x070e
            r1.x0 = r3
        L_0x070e:
            org.webrtc.VpxEncoderWrapper r2 = r1.Y
            if (r2 == 0) goto L_0x0715
            r2.encode(r0, r8)
        L_0x0715:
            java.util.concurrent.atomic.AtomicInteger r1 = r1.A0
            r1.decrementAndGet()
            r0.release()
            return
        L_0x071e:
            java.lang.Object r1 = r0.c
            py5 r1 = (py5) r1
            java.lang.Object r2 = r0.o
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.Object r0 = r0.b
            org.webrtc.Size r0 = (org.webrtc.Size) r0
            org.webrtc.SurfaceTextureHelper r3 = r1.X
            if (r3 != 0) goto L_0x0738
            org.webrtc.EglBase$Context r3 = r1.a
            java.lang.String r4 = "SSFCTextureHelper"
            org.webrtc.SurfaceTextureHelper r3 = org.webrtc.SurfaceTextureHelper.create(r4, r3)
            r1.X = r3
        L_0x0738:
            org.webrtc.ScreenCapturerAndroid r3 = new org.webrtc.ScreenCapturerAndroid
            r3.<init>(r2, r1)
            r1.Y = r3
            org.webrtc.ScreenCapturerAndroid r2 = r1.Y
            org.webrtc.SurfaceTextureHelper r3 = r1.X
            android.content.Context r4 = r1.b
            r2.initialize(r3, r4, r1)
            r1.x0 = r8
            r1.b(r0, r8)
            return
        L_0x074e:
            java.lang.Object r2 = r0.c
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            java.lang.Object r2 = r0.o
            zh5 r2 = (zh5) r2
            java.util.WeakHashMap r2 = r2.a
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0763:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0799
            java.lang.Object r3 = r2.next()
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            boolean r4 = r4.isCurrentThread()
            java.lang.Object r6 = r0.b
            bi5 r6 = (bi5) r6
            if (r4 == 0) goto L_0x0781
            tge.b(r3, r6)
            goto L_0x0763
        L_0x0781:
            android.os.Handler r4 = r3.getHandler()
            if (r4 == 0) goto L_0x0790
            q36 r7 = new q36
            r7.<init>((java.lang.Object) r3, (int) r5, (java.lang.Object) r6)
            r4.postAtFrontOfQueue(r7)
            goto L_0x0763
        L_0x0790:
            p36 r4 = new p36
            r4.<init>((java.lang.Object) r3, (int) r1, (java.lang.Object) r6)
            r3.post(r4)
            goto L_0x0763
        L_0x0799:
            return
        L_0x079a:
            java.lang.Object r1 = r0.c
            ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl r1 = (ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl) r1
            java.lang.Object r2 = r0.b
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r0 = r0.o
            java.util.List r0 = (java.util.List) r0
            ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl.a(r1, r0, r2)
            return
        L_0x07ac:
            java.lang.Object r1 = r0.o
            android.content.Intent r1 = (android.content.Intent) r1
            java.lang.Object r2 = r0.b
            vde r2 = (defpackage.vde) r2
            java.lang.Object r0 = r0.c
            zy4 r0 = (defpackage.zy4) r0
            r0.getClass()
            r0.b(r1)     // Catch:{ all -> 0x07c2 }
            r2.b(r6)
            return
        L_0x07c2:
            r0 = move-exception
            r1 = r0
            r2.b(r6)
            throw r1
        L_0x07c8:
            java.lang.Object r1 = r0.b
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            java.lang.Object r2 = r0.o
            ix4 r2 = (defpackage.ix4) r2
            java.lang.Object r0 = r0.c
            vx4 r0 = (defpackage.vx4) r0
            xx4 r0 = r0.k
            int r0 = r0.D
            r3 = 8
            if (r0 != r3) goto L_0x07dd
            goto L_0x07e8
        L_0x07dd:
            java.util.Objects.requireNonNull(r2)     // Catch:{ RejectedExecutionException -> 0x07e8 }
            ux4 r0 = new ux4     // Catch:{ RejectedExecutionException -> 0x07e8 }
            r0.<init>(r2, r8)     // Catch:{ RejectedExecutionException -> 0x07e8 }
            r1.execute(r0)     // Catch:{ RejectedExecutionException -> 0x07e8 }
        L_0x07e8:
            return
        L_0x07e9:
            java.lang.Object r1 = r0.c
            tx4 r1 = (defpackage.tx4) r1
            java.util.LinkedHashMap r2 = r1.a
            java.lang.Object r3 = r0.o
            ls9 r3 = (defpackage.ls9) r3
            r3.getClass()
            java.lang.Object r0 = r0.b
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            r0.getClass()
            r2.put(r3, r0)
            gs0 r1 = r1.b
            ii4 r2 = new ii4
            r4 = 11
            r2.<init>(r3, r4, r1)
            r0.execute(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.px4.run():void");
    }

    public /* synthetic */ px4(Object obj, Executor executor, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = executor;
        this.o = obj2;
    }

    public /* synthetic */ px4(List list, nec nec) {
        this.a = 27;
        bp8 bp8 = bp8.Z;
        this.c = list;
        this.o = nec;
        this.b = bp8;
    }
}
