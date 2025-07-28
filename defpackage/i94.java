package defpackage;

import android.app.NotificationManager;
import android.content.Context;

/* renamed from: i94  reason: default package */
public final class i94 implements e88 {
    public static final int g = cub.default_notification_channel_name;
    public final Context a;
    public final hs1 b;
    public final int c;
    public final NotificationManager d;
    public ud e;
    public final int f = ynb.media3_notification_small_icon;

    public i94(bq0 bq0) {
        Context context = (Context) bq0.d;
        this.a = context;
        this.b = (hs1) bq0.e;
        this.c = bq0.b;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        oyb.l(notificationManager);
        this.d = notificationManager;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01bc, code lost:
        if (r4 == 8) goto L_0x01c1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.og0 a(defpackage.kc8 r19, defpackage.ws6 r20, defpackage.og0 r21, ph0 r22) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r0 = r20
            r3 = r21
            int r4 = defpackage.oze.a
            r5 = 26
            java.lang.String r6 = "default_channel_id"
            android.content.Context r7 = r1.a
            if (r4 < r5) goto L_0x0024
            android.app.NotificationManager r4 = r1.d
            android.app.NotificationChannel r5 = r4.getNotificationChannel(r6)
            if (r5 == 0) goto L_0x001b
            goto L_0x0024
        L_0x001b:
            int r5 = r1.c
            java.lang.String r5 = r7.getString(r5)
            defpackage.g94.a(r4, r6, r5)
        L_0x0024:
            ts6 r4 = new ts6
            r4.<init>()
            r8 = 0
        L_0x002a:
            int r9 = r20.size()
            if (r8 >= r9) goto L_0x004e
            java.lang.Object r9 = r0.get(r8)
            t33 r9 = (defpackage.t33) r9
            v1d r10 = r9.a
            if (r10 == 0) goto L_0x004b
            int r10 = r10.a
            if (r10 != 0) goto L_0x004b
            boolean r9 = r9.h
            if (r9 == 0) goto L_0x004b
            java.lang.Object r9 = r0.get(r8)
            t33 r9 = (defpackage.t33) r9
            r4.d(r9)
        L_0x004b:
            int r8 = r8 + 1
            goto L_0x002a
        L_0x004e:
            kya r8 = r19.c()
            un9 r9 = new un9
            r9.<init>(r7, r6)
            hs1 r0 = r1.b
            r0.getClass()
            uf8 r6 = new uf8
            r6.<init>(r2)
            eya r0 = r8.s()
            e8c r4 = r4.j()
            boolean r10 = r19.e()
            boolean r10 = defpackage.oze.c0(r8, r10)
            r11 = 1
            r10 = r10 ^ r11
            ts6 r12 = new ts6
            r12.<init>()
            r13 = 7
            r14 = 6
            int[] r15 = new int[]{r13, r14}
            boolean r15 = r0.b(r15)
            java.lang.String r5 = "androidx.media3.session.command.COMPACT_VIEW_INDEX"
            r13 = -1
            if (r15 == 0) goto L_0x00aa
            android.os.Bundle r15 = wn6.g(r13, r5)
            s33 r13 = new s33
            r11 = 57413(0xe045, float:8.0453E-41)
            r13.<init>(r11)
            r13.d(r14)
            int r11 = defpackage.cub.media3_controls_seek_to_previous_description
            java.lang.String r11 = r7.getString(r11)
            r13.b(r11)
            r13.c(r15)
            t33 r11 = r13.a()
            r12.d(r11)
            r11 = 1
        L_0x00aa:
            boolean r13 = r0.a(r11)
            if (r13 == 0) goto L_0x00f4
            r13 = -1
            android.os.Bundle r15 = wn6.g(r13, r5)
            if (r10 == 0) goto L_0x00d6
            s33 r10 = new s33
            r13 = 57396(0xe034, float:8.0429E-41)
            r10.<init>(r13)
            r10.d(r11)
            r10.c(r15)
            int r13 = defpackage.cub.media3_controls_pause_description
            java.lang.String r13 = r7.getString(r13)
            r10.b(r13)
            t33 r10 = r10.a()
            r12.d(r10)
            goto L_0x00f4
        L_0x00d6:
            s33 r10 = new s33
            r13 = 57399(0xe037, float:8.0433E-41)
            r10.<init>(r13)
            r10.d(r11)
            r10.c(r15)
            int r11 = defpackage.cub.media3_controls_play_description
            java.lang.String r11 = r7.getString(r11)
            r10.b(r11)
            t33 r10 = r10.a()
            r12.d(r10)
        L_0x00f4:
            r10 = 9
            r11 = 8
            int[] r13 = new int[]{r10, r11}
            boolean r0 = r0.b(r13)
            if (r0 == 0) goto L_0x0125
            r0 = -1
            android.os.Bundle r13 = wn6.g(r0, r5)
            s33 r0 = new s33
            r15 = 57412(0xe044, float:8.0451E-41)
            r0.<init>(r15)
            r0.d(r11)
            r0.c(r13)
            int r13 = defpackage.cub.media3_controls_seek_to_next_description
            java.lang.String r13 = r7.getString(r13)
            r0.b(r13)
            t33 r0 = r0.a()
            r12.d(r0)
        L_0x0125:
            r0 = 0
        L_0x0126:
            int r13 = r4.size()
            if (r0 >= r13) goto L_0x0140
            java.lang.Object r13 = r4.get(r0)
            t33 r13 = (defpackage.t33) r13
            v1d r15 = r13.a
            if (r15 == 0) goto L_0x013d
            int r15 = r15.a
            if (r15 != 0) goto L_0x013d
            r12.d(r13)
        L_0x013d:
            int r0 = r0 + 1
            goto L_0x0126
        L_0x0140:
            e8c r0 = r12.j()
            r4 = 3
            int[] r12 = new int[r4]
            int[] r13 = new int[r4]
            r15 = -1
            java.util.Arrays.fill(r12, r15)
            java.util.Arrays.fill(r13, r15)
            r11 = 0
            r15 = 0
        L_0x0152:
            int r10 = r0.size()
            if (r15 >= r10) goto L_0x01d4
            java.lang.Object r10 = r0.get(r15)
            t33 r10 = (defpackage.t33) r10
            v1d r14 = r10.a
            int r4 = r10.b
            if (r14 == 0) goto L_0x016f
            gn9 r14 = r3.l(r2, r10)
            r9.a(r14)
            r17 = r0
        L_0x016d:
            r14 = 3
            goto L_0x018a
        L_0x016f:
            r14 = -1
            if (r4 == r14) goto L_0x0174
            r14 = 1
            goto L_0x0175
        L_0x0174:
            r14 = 0
        L_0x0175:
            defpackage.oyb.k(r14)
            int r14 = r10.d
            androidx.core.graphics.drawable.IconCompat r14 = androidx.core.graphics.drawable.IconCompat.c(r7, r14)
            r17 = r0
            java.lang.CharSequence r0 = r10.f
            gn9 r0 = r3.m(r2, r14, r0, r4)
            r9.a(r0)
            goto L_0x016d
        L_0x018a:
            if (r11 != r14) goto L_0x018d
            goto L_0x019c
        L_0x018d:
            android.os.Bundle r0 = r10.g
            r10 = -1
            int r0 = r0.getInt(r5, r10)
            if (r0 < 0) goto L_0x01a2
            if (r0 >= r14) goto L_0x01a2
            int r11 = r11 + 1
            r12[r0] = r15
        L_0x019c:
            r0 = 8
            r4 = 0
            r10 = 6
            r14 = 1
            goto L_0x01cc
        L_0x01a2:
            r0 = 7
            if (r4 == r0) goto L_0x01c5
            r10 = 6
            if (r4 != r10) goto L_0x01ad
            r0 = 8
            r4 = 0
            r14 = 1
            goto L_0x01ca
        L_0x01ad:
            r14 = 1
            if (r4 != r14) goto L_0x01b6
            r13[r14] = r15
            r0 = 8
        L_0x01b4:
            r4 = 0
            goto L_0x01cc
        L_0x01b6:
            r0 = 9
            if (r4 == r0) goto L_0x01bf
            r0 = 8
            if (r4 != r0) goto L_0x01b4
            goto L_0x01c1
        L_0x01bf:
            r0 = 8
        L_0x01c1:
            r4 = 2
            r13[r4] = r15
            goto L_0x01b4
        L_0x01c5:
            r0 = 8
            r10 = 6
            r14 = 1
            r4 = 0
        L_0x01ca:
            r13[r4] = r15
        L_0x01cc:
            int r15 = r15 + 1
            r14 = r10
            r0 = r17
            r4 = 3
            goto L_0x0152
        L_0x01d4:
            r4 = 0
            r14 = 1
            if (r11 != 0) goto L_0x01ea
            r0 = r4
            r7 = r0
        L_0x01da:
            r5 = 3
            if (r0 >= r5) goto L_0x01ea
            r5 = r13[r0]
            r10 = -1
            if (r5 != r10) goto L_0x01e3
            goto L_0x01e7
        L_0x01e3:
            r12[r7] = r5
            int r7 = r7 + 1
        L_0x01e7:
            int r0 = r0 + 1
            goto L_0x01da
        L_0x01ea:
            r0 = r4
        L_0x01eb:
            r5 = 3
            if (r0 >= r5) goto L_0x01fb
            r5 = r12[r0]
            r7 = -1
            if (r5 != r7) goto L_0x01f8
            int[] r12 = java.util.Arrays.copyOf(r12, r0)
            goto L_0x01fb
        L_0x01f8:
            int r0 = r0 + 1
            goto L_0x01eb
        L_0x01fb:
            r6.q(r12)
            r0 = 18
            boolean r0 = r8.t1(r0)
            if (r0 == 0) goto L_0x0234
            z78 r0 = r8.N0()
            java.lang.CharSequence r5 = r0.a
            r9.f(r5)
            java.lang.CharSequence r5 = r0.b
            r9.e(r5)
            wm0 r5 = r19.a()
            ch7 r0 = r5.h(r0)
            if (r0 == 0) goto L_0x0234
            ud r5 = r1.e
            if (r5 == 0) goto L_0x0225
            r5.p()
        L_0x0225:
            boolean r5 = r0.isDone()
            if (r5 == 0) goto L_0x024d
            java.lang.Object r0 = swb.u(r0)     // Catch:{ CancellationException | ExecutionException -> 0x0236 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ CancellationException | ExecutionException -> 0x0236 }
            r9.k(r0)     // Catch:{ CancellationException | ExecutionException -> 0x0236 }
        L_0x0234:
            r5 = 3
            goto L_0x026c
        L_0x0236:
            r0 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "Failed to load bitmap: "
            r5.<init>(r7)
            java.lang.String r0 = r0.getMessage()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            defpackage.ez3.j0(r0)
            goto L_0x0234
        L_0x024d:
            ud r5 = new ud
            r7 = 5
            r10 = r22
            r5.<init>((java.lang.Object) r9, (int) r7, (java.lang.Object) r10)
            r1.e = r5
            cd8 r7 = r19.b()
            android.os.Handler r7 = r7.d()
            java.util.Objects.requireNonNull(r7)
            y44 r10 = new y44
            r11 = 0
            r10.<init>(r7, r11)
            swb.a(r0, r5, r10)
            goto L_0x0234
        L_0x026c:
            boolean r0 = r8.t1(r5)
            r10 = 3
            r5 = 21
            if (r0 != 0) goto L_0x027a
            int r0 = defpackage.oze.a
            if (r0 >= r5) goto L_0x027d
        L_0x027a:
            r3.n(r2, r10)
        L_0x027d:
            int r0 = defpackage.oze.a
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 < r5) goto L_0x02ae
            boolean r5 = r8.a()
            if (r5 == 0) goto L_0x02ae
            boolean r5 = r8.n()
            if (r5 != 0) goto L_0x02ae
            boolean r5 = r8.y1()
            if (r5 != 0) goto L_0x02ae
            wxa r5 = r8.d()
            float r5 = r5.a
            r7 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x02ae
            long r15 = java.lang.System.currentTimeMillis()
            long r7 = r8.b0()
            long r15 = r15 - r7
            goto L_0x02af
        L_0x02ae:
            r15 = r12
        L_0x02af:
            int r5 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x02b5
            r5 = r14
            goto L_0x02b6
        L_0x02b5:
            r5 = r4
        L_0x02b6:
            if (r5 == 0) goto L_0x02ba
        L_0x02b8:
            r7 = r15
            goto L_0x02bd
        L_0x02ba:
            r15 = 0
            goto L_0x02b8
        L_0x02bd:
            r9.t(r7)
            r9.n(r5)
            r9.r(r5)
            r4 = 31
            if (r0 < r4) goto L_0x02cd
            defpackage.h94.a(r9)
        L_0x02cd:
            android.app.PendingIntent r0 = r19.d()
            r9.d(r0)
            android.app.PendingIntent r0 = r3.n(r2, r10)
            r9.h(r0)
            r9.m()
            int r0 = r1.f
            r9.o(r0)
            r9.q(r6)
            r9.s()
            r9.l()
            r9.j()
            android.app.Notification r0 = r9.b()
            og0 r1 = new og0
            r1.<init>((android.app.Notification) r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i94.a(kc8, ws6, og0, ph0):og0");
    }
}
