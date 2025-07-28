package defpackage;

import one.me.rlottie.RLottieDrawable;

/* renamed from: rwb  reason: default package */
public final class rwb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RLottieDrawable b;

    public /* synthetic */ rwb(RLottieDrawable rLottieDrawable, int i) {
        this.a = i;
        this.b = rLottieDrawable;
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0139 A[Catch:{ Exception -> 0x0106 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0148 A[Catch:{ Exception -> 0x0106 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0198 A[Catch:{ Exception -> 0x0106 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x019b A[Catch:{ Exception -> 0x0106 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b8 A[Catch:{ Exception -> 0x0106 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r1 = r20
            int r0 = r1.a
            switch(r0) {
                case 0: goto L_0x0300;
                case 1: goto L_0x02ed;
                case 2: goto L_0x02b5;
                case 3: goto L_0x0299;
                default: goto L_0x0007;
            }
        L_0x0007:
            one.me.rlottie.RLottieDrawable r0 = r1.b
            boolean r0 = r0.g1
            if (r0 == 0) goto L_0x000f
            goto L_0x0298
        L_0x000f:
            one.me.rlottie.RLottieDrawable r0 = r1.b
            boolean r0 = r0.canLoadFrames()
            if (r0 != 0) goto L_0x0034
            gg9 r0 = one.me.rlottie.RLottie.getLogger()
            java.lang.String r2 = "RLottieDrawable. Load frame !canLoadFrames()"
            r0.e(r2)
            one.me.rlottie.RLottieDrawable r0 = r1.b
            java.util.concurrent.CountDownLatch r0 = r0.Q0
            if (r0 == 0) goto L_0x0029
            r0.countDown()
        L_0x0029:
            android.os.Handler r0 = one.me.rlottie.RLottieDrawable.L1
            one.me.rlottie.RLottieDrawable r1 = r1.b
            rwb r1 = r1.r1
            r0.post(r1)
            goto L_0x0298
        L_0x0034:
            one.me.rlottie.RLottieDrawable r0 = r1.b
            android.graphics.Bitmap r0 = r0.O0
            if (r0 != 0) goto L_0x0051
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ all -> 0x0049 }
            int r2 = r0.a     // Catch:{ all -> 0x0049 }
            int r3 = r0.b     // Catch:{ all -> 0x0049 }
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0049 }
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r4)     // Catch:{ all -> 0x0049 }
            r0.O0 = r2     // Catch:{ all -> 0x0049 }
            goto L_0x0051
        L_0x0049:
            r0 = move-exception
            gg9 r2 = one.me.rlottie.RLottie.getLogger()
            r2.o(r0)
        L_0x0051:
            one.me.rlottie.RLottieDrawable r0 = r1.b
            android.graphics.Bitmap r0 = r0.O0
            if (r0 == 0) goto L_0x027d
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0098 }
            java.util.HashMap r0 = r0.y0     // Catch:{ Exception -> 0x0098 }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x0098 }
            if (r0 != 0) goto L_0x0098
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0098 }
            java.util.HashMap r0 = r0.y0     // Catch:{ Exception -> 0x0098 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ Exception -> 0x0098 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0098 }
        L_0x006d:
            boolean r2 = r0.hasNext()     // Catch:{ Exception -> 0x0098 }
            if (r2 == 0) goto L_0x0091
            java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x0098 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ Exception -> 0x0098 }
            one.me.rlottie.RLottieDrawable r3 = r1.b     // Catch:{ Exception -> 0x0098 }
            long r3 = r3.h1     // Catch:{ Exception -> 0x0098 }
            java.lang.Object r5 = r2.getKey()     // Catch:{ Exception -> 0x0098 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0098 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ Exception -> 0x0098 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x0098 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x0098 }
            one.me.rlottie.RLottieDrawable.setLayerColor(r3, r5, r2)     // Catch:{ Exception -> 0x0098 }
            goto L_0x006d
        L_0x0091:
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0098 }
            java.util.HashMap r0 = r0.y0     // Catch:{ Exception -> 0x0098 }
            r0.clear()     // Catch:{ Exception -> 0x0098 }
        L_0x0098:
            one.me.rlottie.RLottieDrawable r0 = r1.b
            int[] r2 = r0.w0
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x00b6
            long r6 = r0.h1
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00b6
            one.me.rlottie.RLottieDrawable r0 = r1.b
            long r6 = r0.h1
            one.me.rlottie.RLottieDrawable r0 = r1.b
            int[] r0 = r0.w0
            one.me.rlottie.RLottieDrawable.replaceColors(r6, r0)
            one.me.rlottie.RLottieDrawable r0 = r1.b
            r0.w0 = r3
        L_0x00b6:
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0106 }
            boolean r0 = r0.X0     // Catch:{ Exception -> 0x0106 }
            r2 = 2
            r6 = 1
            if (r0 == 0) goto L_0x00c0
            r7 = r2
            goto L_0x00c1
        L_0x00c0:
            r7 = r6
        L_0x00c1:
            java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0106 }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0106 }
            boolean r8 = r0.m1     // Catch:{ Exception -> 0x0106 }
            r9 = 0
            if (r8 == 0) goto L_0x0109
            rn0 r8 = r0.w1     // Catch:{ Exception -> 0x0106 }
            if (r8 == 0) goto L_0x0109
            int r10 = r0.W0     // Catch:{ Exception -> 0x00fc }
            int r10 = r10 / r7
            android.graphics.Bitmap r0 = r0.O0     // Catch:{ Exception -> 0x00fc }
            int r8 = r8.f(r0, r10)     // Catch:{ Exception -> 0x00fc }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x00fa }
            rn0 r0 = r0.w1     // Catch:{ Exception -> 0x00fa }
            boolean r0 = r0.g()     // Catch:{ Exception -> 0x00fa }
            if (r0 != 0) goto L_0x0125
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x00fa }
            boolean r10 = r0.z1     // Catch:{ Exception -> 0x00fa }
            if (r10 == 0) goto L_0x0125
            long r10 = r0.h1     // Catch:{ Exception -> 0x00fa }
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0125
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x00fa }
            long r10 = r0.h1     // Catch:{ Exception -> 0x00fa }
            one.me.rlottie.RLottieDrawable.destroy(r10)     // Catch:{ Exception -> 0x00fa }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x00fa }
            r0.h1 = r4     // Catch:{ Exception -> 0x00fa }
            goto L_0x0125
        L_0x00fa:
            r0 = move-exception
            goto L_0x00fe
        L_0x00fc:
            r0 = move-exception
            r8 = r9
        L_0x00fe:
            gg9 r10 = one.me.rlottie.RLottie.getLogger()     // Catch:{ Exception -> 0x0106 }
            r10.o(r0)     // Catch:{ Exception -> 0x0106 }
            goto L_0x0125
        L_0x0106:
            r0 = move-exception
            goto L_0x0275
        L_0x0109:
            long r11 = r0.h1     // Catch:{ Exception -> 0x0106 }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0106 }
            int r13 = r0.W0     // Catch:{ Exception -> 0x0106 }
            android.graphics.Bitmap r14 = r0.O0     // Catch:{ Exception -> 0x0106 }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0106 }
            int r15 = r0.a     // Catch:{ Exception -> 0x0106 }
            int r8 = r0.b     // Catch:{ Exception -> 0x0106 }
            android.graphics.Bitmap r0 = r0.O0     // Catch:{ Exception -> 0x0106 }
            int r17 = r0.getRowBytes()     // Catch:{ Exception -> 0x0106 }
            r18 = 1
            r16 = r8
            int r8 = one.me.rlottie.RLottieDrawable.getFrame(r11, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x0106 }
        L_0x0125:
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0106 }
            rn0 r0 = r0.w1     // Catch:{ Exception -> 0x0106 }
            r10 = -1
            r11 = 3
            if (r0 == 0) goto L_0x0199
            boolean r0 = r0.g()     // Catch:{ Exception -> 0x0106 }
            if (r0 == 0) goto L_0x0199
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0106 }
            boolean r8 = r0.y1     // Catch:{ Exception -> 0x0106 }
            if (r8 != 0) goto L_0x0142
            r0.y1 = r6     // Catch:{ Exception -> 0x0106 }
            android.os.Handler r8 = one.me.rlottie.RLottieDrawable.L1     // Catch:{ Exception -> 0x0106 }
            rwb r0 = r0.u1     // Catch:{ Exception -> 0x0106 }
            r8.post(r0)     // Catch:{ Exception -> 0x0106 }
        L_0x0142:
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0106 }
            boolean r8 = r0.z1     // Catch:{ Exception -> 0x0106 }
            if (r8 == 0) goto L_0x0198
            long r12 = r0.h1     // Catch:{ Exception -> 0x0106 }
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0177
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0106 }
            di9 r4 = r0.q1     // Catch:{ Exception -> 0x0106 }
            java.lang.Object r4 = r4.c     // Catch:{ Exception -> 0x0106 }
            java.io.File r4 = (java.io.File) r4     // Catch:{ Exception -> 0x0106 }
            java.lang.String r12 = r4.toString()     // Catch:{ Exception -> 0x0106 }
            one.me.rlottie.RLottieDrawable r4 = r1.b     // Catch:{ Exception -> 0x0106 }
            di9 r5 = r4.q1     // Catch:{ Exception -> 0x0106 }
            r5.getClass()     // Catch:{ Exception -> 0x0106 }
            int r13 = r4.a     // Catch:{ Exception -> 0x0106 }
            int r14 = r4.b     // Catch:{ Exception -> 0x0106 }
            int[] r15 = new int[r11]     // Catch:{ Exception -> 0x0106 }
            java.lang.Object r4 = r5.b     // Catch:{ Exception -> 0x0106 }
            r16 = r4
            int[] r16 = (int[]) r16     // Catch:{ Exception -> 0x0106 }
            int r4 = r5.a     // Catch:{ Exception -> 0x0106 }
            r17 = r4
            long r4 = one.me.rlottie.RLottieDrawable.create(r12, (java.lang.String) null, r13, r14, r15, false, r16, false, r17)     // Catch:{ Exception -> 0x0106 }
            r0.h1 = r4     // Catch:{ Exception -> 0x0106 }
        L_0x0177:
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0106 }
            long r12 = r0.h1     // Catch:{ Exception -> 0x0106 }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0106 }
            int r14 = r0.W0     // Catch:{ Exception -> 0x0106 }
            android.graphics.Bitmap r15 = r0.O0     // Catch:{ Exception -> 0x0106 }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0106 }
            int r4 = r0.a     // Catch:{ Exception -> 0x0106 }
            int r5 = r0.b     // Catch:{ Exception -> 0x0106 }
            android.graphics.Bitmap r0 = r0.O0     // Catch:{ Exception -> 0x0106 }
            int r18 = r0.getRowBytes()     // Catch:{ Exception -> 0x0106 }
            r19 = 1
            r16 = r4
            r17 = r5
            int r8 = one.me.rlottie.RLottieDrawable.getFrame(r12, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0106 }
            goto L_0x0199
        L_0x0198:
            r8 = r10
        L_0x0199:
            if (r8 != r10) goto L_0x01b8
            gg9 r0 = one.me.rlottie.RLottie.getLogger()     // Catch:{ Exception -> 0x0106 }
            java.lang.String r2 = "RLottieDrawable. Load frame result == -1"
            r0.e(r2)     // Catch:{ Exception -> 0x0106 }
            android.os.Handler r0 = one.me.rlottie.RLottieDrawable.L1     // Catch:{ Exception -> 0x0106 }
            one.me.rlottie.RLottieDrawable r2 = r1.b     // Catch:{ Exception -> 0x0106 }
            rwb r2 = r2.r1     // Catch:{ Exception -> 0x0106 }
            r0.post(r2)     // Catch:{ Exception -> 0x0106 }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0106 }
            java.util.concurrent.CountDownLatch r0 = r0.Q0     // Catch:{ Exception -> 0x0106 }
            if (r0 == 0) goto L_0x0298
            r0.countDown()     // Catch:{ Exception -> 0x0106 }
            goto L_0x0298
        L_0x01b8:
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0106 }
            android.graphics.Bitmap r4 = r0.O0     // Catch:{ Exception -> 0x0106 }
            r0.N0 = r4     // Catch:{ Exception -> 0x0106 }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0106 }
            int r4 = r0.X     // Catch:{ Exception -> 0x0106 }
            if (r4 < 0) goto L_0x01f0
            boolean r5 = r0.Y     // Catch:{ Exception -> 0x0106 }
            if (r5 == 0) goto L_0x01f0
            int r2 = r0.W0     // Catch:{ Exception -> 0x0106 }
            if (r2 <= r4) goto L_0x01de
            int r2 = r2 - r7
            if (r2 < r4) goto L_0x01d5
            r0.W0 = r2     // Catch:{ Exception -> 0x0106 }
            r0.J0 = r9     // Catch:{ Exception -> 0x0106 }
            goto L_0x0286
        L_0x01d5:
            r0.J0 = r6     // Catch:{ Exception -> 0x0106 }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0106 }
            one.me.rlottie.RLottieDrawable.c(r0)     // Catch:{ Exception -> 0x0106 }
            goto L_0x0286
        L_0x01de:
            int r2 = r2 + r7
            if (r2 >= r4) goto L_0x01e7
            r0.W0 = r2     // Catch:{ Exception -> 0x0106 }
            r0.J0 = r9     // Catch:{ Exception -> 0x0106 }
            goto L_0x0286
        L_0x01e7:
            r0.J0 = r6     // Catch:{ Exception -> 0x0106 }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0106 }
            one.me.rlottie.RLottieDrawable.c(r0)     // Catch:{ Exception -> 0x0106 }
            goto L_0x0286
        L_0x01f0:
            if (r4 < 0) goto L_0x021e
            boolean r5 = r0.Y     // Catch:{ Exception -> 0x0106 }
            if (r5 == 0) goto L_0x021e
            int r2 = r0.W0     // Catch:{ Exception -> 0x0106 }
            if (r2 <= r4) goto L_0x020c
            int r2 = r2 - r7
            if (r2 < r4) goto L_0x0203
            r0.W0 = r2     // Catch:{ Exception -> 0x0106 }
            r0.J0 = r9     // Catch:{ Exception -> 0x0106 }
            goto L_0x0286
        L_0x0203:
            r0.J0 = r6     // Catch:{ Exception -> 0x0106 }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0106 }
            one.me.rlottie.RLottieDrawable.c(r0)     // Catch:{ Exception -> 0x0106 }
            goto L_0x0286
        L_0x020c:
            int r2 = r2 + r7
            if (r2 >= r4) goto L_0x0215
            r0.W0 = r2     // Catch:{ Exception -> 0x0106 }
            r0.J0 = r9     // Catch:{ Exception -> 0x0106 }
            goto L_0x0286
        L_0x0215:
            r0.J0 = r6     // Catch:{ Exception -> 0x0106 }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0106 }
            one.me.rlottie.RLottieDrawable.c(r0)     // Catch:{ Exception -> 0x0106 }
            goto L_0x0286
        L_0x021e:
            int r5 = r0.W0     // Catch:{ Exception -> 0x0106 }
            int r5 = r5 + r7
            if (r4 < 0) goto L_0x0224
            goto L_0x0228
        L_0x0224:
            int[] r4 = r0.c     // Catch:{ Exception -> 0x0106 }
            r4 = r4[r9]     // Catch:{ Exception -> 0x0106 }
        L_0x0228:
            if (r5 >= r4) goto L_0x023d
            int r2 = r0.F0     // Catch:{ Exception -> 0x0106 }
            if (r2 != r11) goto L_0x0238
            r0.J0 = r6     // Catch:{ Exception -> 0x0106 }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0106 }
            int r2 = r0.H0     // Catch:{ Exception -> 0x0106 }
            int r2 = r2 + r6
            r0.H0 = r2     // Catch:{ Exception -> 0x0106 }
            goto L_0x0286
        L_0x0238:
            r0.W0 = r5     // Catch:{ Exception -> 0x0106 }
            r0.J0 = r9     // Catch:{ Exception -> 0x0106 }
            goto L_0x0286
        L_0x023d:
            int r4 = r0.F0     // Catch:{ Exception -> 0x0106 }
            if (r4 != r6) goto L_0x0257
            r0.W0 = r9     // Catch:{ Exception -> 0x0106 }
            r0.J0 = r9     // Catch:{ Exception -> 0x0106 }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0106 }
            boolean r2 = r0.A0     // Catch:{ Exception -> 0x0106 }
            if (r2 == 0) goto L_0x024f
            r0.z0 = r3     // Catch:{ Exception -> 0x0106 }
            r0.A0 = r9     // Catch:{ Exception -> 0x0106 }
        L_0x024f:
            int r2 = r0.G0     // Catch:{ Exception -> 0x0106 }
            if (r2 <= 0) goto L_0x0286
            int r2 = r2 - r6
            r0.G0 = r2     // Catch:{ Exception -> 0x0106 }
            goto L_0x0286
        L_0x0257:
            if (r4 != r2) goto L_0x026d
            r0.W0 = r9     // Catch:{ Exception -> 0x0106 }
            r0.J0 = r6     // Catch:{ Exception -> 0x0106 }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0106 }
            int r2 = r0.H0     // Catch:{ Exception -> 0x0106 }
            int r2 = r2 + r6
            r0.H0 = r2     // Catch:{ Exception -> 0x0106 }
            boolean r2 = r0.A0     // Catch:{ Exception -> 0x0106 }
            if (r2 == 0) goto L_0x0286
            r0.z0 = r3     // Catch:{ Exception -> 0x0106 }
            r0.A0 = r9     // Catch:{ Exception -> 0x0106 }
            goto L_0x0286
        L_0x026d:
            r0.J0 = r6     // Catch:{ Exception -> 0x0106 }
            one.me.rlottie.RLottieDrawable r0 = r1.b     // Catch:{ Exception -> 0x0106 }
            one.me.rlottie.RLottieDrawable.c(r0)     // Catch:{ Exception -> 0x0106 }
            goto L_0x0286
        L_0x0275:
            gg9 r2 = one.me.rlottie.RLottie.getLogger()
            r2.o(r0)
            goto L_0x0286
        L_0x027d:
            gg9 r0 = one.me.rlottie.RLottie.getLogger()
            java.lang.String r2 = "RLottieDrawable. Load frame background bitmap is null"
            r0.e(r2)
        L_0x0286:
            android.os.Handler r0 = one.me.rlottie.RLottieDrawable.L1
            one.me.rlottie.RLottieDrawable r2 = r1.b
            rwb r2 = r2.s1
            r0.post(r2)
            one.me.rlottie.RLottieDrawable r0 = r1.b
            java.util.concurrent.CountDownLatch r0 = r0.Q0
            if (r0 == 0) goto L_0x0298
            r0.countDown()
        L_0x0298:
            return
        L_0x0299:
            one.me.rlottie.RLottieDrawable r0 = r1.b
            java.lang.Runnable r1 = r0.K0
            r2 = 0
            if (r1 == 0) goto L_0x02a5
            defpackage.rn0.c()
            r0.K0 = r2
        L_0x02a5:
            r1 = 0
            r0.t1 = r1
            r0.i()
            java.lang.Runnable r1 = r0.whenCacheDone
            if (r1 == 0) goto L_0x02b4
            r1.run()
            r0.whenCacheDone = r2
        L_0x02b4:
            return
        L_0x02b5:
            one.me.rlottie.RLottieDrawable r0 = r1.b
            boolean r0 = r0.g1
            if (r0 != 0) goto L_0x02ec
            one.me.rlottie.RLottieDrawable r0 = r1.b
            boolean r2 = r0.R0
            if (r2 != 0) goto L_0x02ec
            boolean r0 = r0.canLoadFrames()
            if (r0 == 0) goto L_0x02ec
            one.me.rlottie.RLottieDrawable r0 = r1.b
            java.lang.Runnable r2 = r0.K0
            if (r2 != 0) goto L_0x02ec
            r2 = 1
            r0.t1 = r2
            gi4 r0 = one.me.rlottie.RLottieDrawable.lottieCacheGenerateQueue
            if (r0 != 0) goto L_0x02d7
            one.me.rlottie.RLottieDrawable.createCacheGenQueue()
        L_0x02d7:
            int r0 = defpackage.rn0.B
            int r0 = r0 + r2
            defpackage.rn0.B = r0
            gi4 r0 = one.me.rlottie.RLottieDrawable.lottieCacheGenerateQueue
            one.me.rlottie.RLottieDrawable r2 = r1.b
            eq6 r3 = new eq6
            r4 = 28
            r3.<init>(r4, r1)
            r2.K0 = r3
            r0.b(r3)
        L_0x02ec:
            return
        L_0x02ed:
            one.me.rlottie.RLottieDrawable r0 = r1.b
            r1 = 1
            r0.T0 = r1
            r0.invalidateInternal()
            r0.i()
            java.lang.Runnable r0 = r0.o1
            if (r0 == 0) goto L_0x02ff
            r0.run()
        L_0x02ff:
            return
        L_0x0300:
            r0 = 0
            one.me.rlottie.RLottieDrawable r1 = r1.b
            r1.L0 = r0
            r1.i()
            java.lang.Runnable r0 = r1.o1
            if (r0 == 0) goto L_0x030f
            r0.run()
        L_0x030f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwb.run():void");
    }
}
