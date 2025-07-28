package defpackage;

import one.me.sdk.media.ffmpeg.AnimatedFileDrawable;

/* renamed from: af  reason: default package */
public final class af implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnimatedFileDrawable b;

    public /* synthetic */ af(AnimatedFileDrawable animatedFileDrawable, int i) {
        this.a = i;
        this.b = animatedFileDrawable;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r1 = r19
            r0 = 4
            r2 = 3
            r3 = 0
            r4 = -1
            r6 = 0
            r8 = 0
            r9 = 1
            int r10 = r1.a
            switch(r10) {
                case 0: goto L_0x0361;
                case 1: goto L_0x0327;
                case 2: goto L_0x0241;
                default: goto L_0x0010;
            }
        L_0x0010:
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r3 = r1.b
            boolean r3 = r3.d1
            if (r3 != 0) goto L_0x0239
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r3 = r1.b
            boolean r10 = r3.C0
            if (r10 != 0) goto L_0x008f
            long r10 = r3.nativePtr
            int r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x008f
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r3 = r1.b
            java.io.File r10 = r3.G0
            if (r10 == 0) goto L_0x008f
            java.lang.String r10 = r10.getAbsolutePath()
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r11 = r1.b
            int[] r11 = r11.o
            long r10 = one.me.sdk.media.ffmpeg.AnimatedFileDrawable.createDecoder(r10, r11)
            r3.nativePtr = r10
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r3 = r1.b
            long r10 = r3.nativePtr
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            r11 = 15
            if (r10 != 0) goto L_0x004c
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r10 = r1.b
            boolean r12 = r10.isWebmSticker
            if (r12 == 0) goto L_0x004a
            int r10 = r10.C1
            if (r10 <= r11) goto L_0x004c
        L_0x004a:
            r10 = r9
            goto L_0x004d
        L_0x004c:
            r10 = r8
        L_0x004d:
            r3.e1 = r10
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r3 = r1.b
            long r12 = r3.nativePtr
            int r3 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x006e
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r3 = r1.b
            int[] r10 = r3.o
            r12 = r10[r8]
            r13 = 3840(0xf00, float:5.381E-42)
            if (r12 > r13) goto L_0x0065
            r10 = r10[r9]
            if (r10 <= r13) goto L_0x006e
        L_0x0065:
            long r12 = r3.nativePtr
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable.destroyDecoder(r12)
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r3 = r1.b
            r3.nativePtr = r6
        L_0x006e:
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r3 = r1.b
            r3.g()
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r3 = r1.b
            boolean r10 = r3.isWebmSticker
            if (r10 == 0) goto L_0x008c
            long r12 = r3.nativePtr
            int r10 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x008c
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r10 = r1.b
            int r12 = r10.C1
            int r13 = r12 + 1
            r10.C1 = r13
            if (r12 <= r11) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            r10 = r8
            goto L_0x008d
        L_0x008c:
            r10 = r9
        L_0x008d:
            r3.C0 = r10
        L_0x008f:
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r3 = r1.b     // Catch:{ all -> 0x00ae }
            rn0 r10 = r3.v1     // Catch:{ all -> 0x00ae }
            if (r10 == 0) goto L_0x0155
            android.graphics.Bitmap r4 = r3.z0     // Catch:{ all -> 0x00ae }
            if (r4 != 0) goto L_0x00bf
            java.util.ArrayList r3 = r3.U0     // Catch:{ all -> 0x00ae }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x00ae }
            if (r3 != 0) goto L_0x00b1
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r3 = r1.b     // Catch:{ all -> 0x00ae }
            java.util.ArrayList r4 = r3.U0     // Catch:{ all -> 0x00ae }
            java.lang.Object r4 = r4.remove(r8)     // Catch:{ all -> 0x00ae }
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch:{ all -> 0x00ae }
            r3.z0 = r4     // Catch:{ all -> 0x00ae }
            goto L_0x00bf
        L_0x00ae:
            r0 = move-exception
            goto L_0x0230
        L_0x00b1:
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r3 = r1.b     // Catch:{ all -> 0x00ae }
            int r4 = r3.j1     // Catch:{ all -> 0x00ae }
            int r5 = r3.i1     // Catch:{ all -> 0x00ae }
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x00ae }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch:{ all -> 0x00ae }
            r3.z0 = r4     // Catch:{ all -> 0x00ae }
        L_0x00bf:
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r3 = r1.b     // Catch:{ all -> 0x00ae }
            ii5 r4 = r3.w1     // Catch:{ all -> 0x00ae }
            if (r4 != 0) goto L_0x00cc
            ii5 r4 = new ii5     // Catch:{ all -> 0x00ae }
            r4.<init>(r0)     // Catch:{ all -> 0x00ae }
            r3.w1 = r4     // Catch:{ all -> 0x00ae }
        L_0x00cc:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ae }
            r3.O0 = r4     // Catch:{ all -> 0x00ae }
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r3 = r1.b     // Catch:{ all -> 0x00ae }
            ii5 r4 = r3.w1     // Catch:{ all -> 0x00ae }
            int r5 = r4.b     // Catch:{ all -> 0x00ae }
            rn0 r6 = r3.v1     // Catch:{ all -> 0x00ae }
            android.graphics.Bitmap r3 = r3.z0     // Catch:{ all -> 0x00ae }
            int r7 = r6.i     // Catch:{ all -> 0x00ae }
            int r3 = r6.f(r3, r7)     // Catch:{ all -> 0x00ae }
            int r7 = r6.i     // Catch:{ all -> 0x00ae }
            r4.b = r7     // Catch:{ all -> 0x00ae }
            boolean r4 = r6.s     // Catch:{ all -> 0x00ae }
            if (r4 == 0) goto L_0x0101
            java.util.ArrayList r4 = r6.e     // Catch:{ all -> 0x00ae }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x00ae }
            if (r4 != 0) goto L_0x0101
            int r4 = r6.i     // Catch:{ all -> 0x00ae }
            int r4 = r4 + r9
            r6.i = r4     // Catch:{ all -> 0x00ae }
            java.util.ArrayList r7 = r6.e     // Catch:{ all -> 0x00ae }
            int r7 = r7.size()     // Catch:{ all -> 0x00ae }
            if (r4 < r7) goto L_0x0101
            r6.i = r8     // Catch:{ all -> 0x00ae }
        L_0x0101:
            r4 = -1
            if (r3 == r4) goto L_0x010e
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r6 = r1.b     // Catch:{ all -> 0x00ae }
            ii5 r7 = r6.w1     // Catch:{ all -> 0x00ae }
            int r7 = r7.b     // Catch:{ all -> 0x00ae }
            if (r7 >= r5) goto L_0x010e
            r6.L0 = r9     // Catch:{ all -> 0x00ae }
        L_0x010e:
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r5 = r1.b     // Catch:{ all -> 0x00ae }
            int[] r6 = r5.o     // Catch:{ all -> 0x00ae }
            ii5 r7 = r5.w1     // Catch:{ all -> 0x00ae }
            int r7 = r7.b     // Catch:{ all -> 0x00ae }
            r0 = r6[r0]     // Catch:{ all -> 0x00ae }
            rn0 r8 = r5.v1     // Catch:{ all -> 0x00ae }
            java.util.ArrayList r8 = r8.e     // Catch:{ all -> 0x00ae }
            int r8 = r8.size()     // Catch:{ all -> 0x00ae }
            int r8 = java.lang.Math.max(r9, r8)     // Catch:{ all -> 0x00ae }
            int r0 = r0 / r8
            r8 = 16
            int r0 = java.lang.Math.max(r8, r0)     // Catch:{ all -> 0x00ae }
            int r7 = r7 * r0
            r5.A0 = r7     // Catch:{ all -> 0x00ae }
            r6[r2] = r7     // Catch:{ all -> 0x00ae }
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b     // Catch:{ all -> 0x00ae }
            rn0 r0 = r0.v1     // Catch:{ all -> 0x00ae }
            boolean r0 = r0.g()     // Catch:{ all -> 0x00ae }
            if (r0 == 0) goto L_0x0141
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b     // Catch:{ all -> 0x00ae }
            af r0 = r0.A1     // Catch:{ all -> 0x00ae }
            defpackage.je.d(r0)     // Catch:{ all -> 0x00ae }
        L_0x0141:
            if (r3 != r4) goto L_0x014c
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b     // Catch:{ all -> 0x00ae }
            af r0 = r0.x1     // Catch:{ all -> 0x00ae }
            defpackage.je.d(r0)     // Catch:{ all -> 0x00ae }
            goto L_0x0240
        L_0x014c:
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b     // Catch:{ all -> 0x00ae }
            af r0 = r0.B1     // Catch:{ all -> 0x00ae }
            defpackage.je.d(r0)     // Catch:{ all -> 0x00ae }
            goto L_0x0240
        L_0x0155:
            long r10 = r3.nativePtr     // Catch:{ all -> 0x00ae }
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x016f
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b     // Catch:{ all -> 0x00ae }
            int[] r3 = r0.o     // Catch:{ all -> 0x00ae }
            r10 = r3[r8]     // Catch:{ all -> 0x00ae }
            if (r10 == 0) goto L_0x016f
            r3 = r3[r9]     // Catch:{ all -> 0x00ae }
            if (r3 != 0) goto L_0x0168
            goto L_0x016f
        L_0x0168:
            af r0 = r0.x1     // Catch:{ all -> 0x00ae }
            defpackage.je.d(r0)     // Catch:{ all -> 0x00ae }
            goto L_0x0240
        L_0x016f:
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b     // Catch:{ all -> 0x00ae }
            android.graphics.Bitmap r3 = r0.z0     // Catch:{ all -> 0x00ae }
            if (r3 != 0) goto L_0x01b8
            int[] r3 = r0.o     // Catch:{ all -> 0x00ae }
            r10 = r3[r8]     // Catch:{ all -> 0x00ae }
            if (r10 <= 0) goto L_0x01b8
            r3 = r3[r9]     // Catch:{ all -> 0x00ae }
            if (r3 <= 0) goto L_0x01b8
            java.util.ArrayList r0 = r0.U0     // Catch:{ all -> 0x0194 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0194 }
            if (r0 != 0) goto L_0x0196
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b     // Catch:{ all -> 0x0194 }
            java.util.ArrayList r3 = r0.U0     // Catch:{ all -> 0x0194 }
            java.lang.Object r3 = r3.remove(r8)     // Catch:{ all -> 0x0194 }
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch:{ all -> 0x0194 }
            r0.z0 = r3     // Catch:{ all -> 0x0194 }
            goto L_0x01b8
        L_0x0194:
            r0 = move-exception
            goto L_0x01af
        L_0x0196:
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b     // Catch:{ all -> 0x0194 }
            int[] r3 = r0.o     // Catch:{ all -> 0x0194 }
            r10 = r3[r8]     // Catch:{ all -> 0x0194 }
            float r10 = (float) r10     // Catch:{ all -> 0x0194 }
            float r11 = r0.m1     // Catch:{ all -> 0x0194 }
            float r10 = r10 * r11
            int r10 = (int) r10     // Catch:{ all -> 0x0194 }
            r3 = r3[r9]     // Catch:{ all -> 0x0194 }
            float r3 = (float) r3     // Catch:{ all -> 0x0194 }
            float r3 = r3 * r11
            int r3 = (int) r3     // Catch:{ all -> 0x0194 }
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0194 }
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r10, r3, r11)     // Catch:{ all -> 0x0194 }
            r0.z0 = r3     // Catch:{ all -> 0x0194 }
            goto L_0x01b8
        L_0x01af:
            float[] r3 = one.me.sdk.media.ffmpeg.AnimatedFileDrawable.M1     // Catch:{ all -> 0x00ae }
            java.lang.String r3 = "one.me.sdk.media.ffmpeg.AnimatedFileDrawable"
            java.lang.String r10 = "Fail create background bitmap"
            udd.s(r3, r10, r0)     // Catch:{ all -> 0x00ae }
        L_0x01b8:
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b     // Catch:{ all -> 0x00ae }
            long r10 = r0.J0     // Catch:{ all -> 0x00ae }
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x01e8
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b     // Catch:{ all -> 0x00ae }
            int[] r3 = r0.o     // Catch:{ all -> 0x00ae }
            long r6 = r0.J0     // Catch:{ all -> 0x00ae }
            int r0 = (int) r6     // Catch:{ all -> 0x00ae }
            r3[r2] = r0     // Catch:{ all -> 0x00ae }
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b     // Catch:{ all -> 0x00ae }
            long r12 = r0.J0     // Catch:{ all -> 0x00ae }
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b     // Catch:{ all -> 0x00ae }
            java.lang.Object r3 = r0.M0     // Catch:{ all -> 0x00ae }
            monitor-enter(r3)     // Catch:{ all -> 0x00ae }
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b     // Catch:{ all -> 0x01e5 }
            r0.J0 = r4     // Catch:{ all -> 0x01e5 }
            monitor-exit(r3)     // Catch:{ all -> 0x01e5 }
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b     // Catch:{ all -> 0x00ae }
            long r10 = r0.nativePtr     // Catch:{ all -> 0x00ae }
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b     // Catch:{ all -> 0x00ae }
            int[] r14 = r0.o     // Catch:{ all -> 0x00ae }
            r15 = 1
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable.seekToMs(r10, r12, r14, r15)     // Catch:{ all -> 0x00ae }
            r8 = r9
            goto L_0x01e8
        L_0x01e5:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01e5 }
            throw r0     // Catch:{ all -> 0x00ae }
        L_0x01e8:
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b     // Catch:{ all -> 0x00ae }
            android.graphics.Bitmap r3 = r0.z0     // Catch:{ all -> 0x00ae }
            if (r3 == 0) goto L_0x0239
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ae }
            r0.O0 = r3     // Catch:{ all -> 0x00ae }
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b     // Catch:{ all -> 0x00ae }
            long r10 = r0.nativePtr     // Catch:{ all -> 0x00ae }
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b     // Catch:{ all -> 0x00ae }
            android.graphics.Bitmap r12 = r0.z0     // Catch:{ all -> 0x00ae }
            int[] r13 = r0.o     // Catch:{ all -> 0x00ae }
            int r14 = r12.getRowBytes()     // Catch:{ all -> 0x00ae }
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b     // Catch:{ all -> 0x00ae }
            float r3 = r0.g1     // Catch:{ all -> 0x00ae }
            float r0 = r0.h1     // Catch:{ all -> 0x00ae }
            r18 = 1
            r15 = 0
            r16 = r3
            r17 = r0
            int r0 = one.me.sdk.media.ffmpeg.AnimatedFileDrawable.getVideoFrame(r10, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x00ae }
            if (r0 != 0) goto L_0x021d
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b     // Catch:{ all -> 0x00ae }
            af r0 = r0.x1     // Catch:{ all -> 0x00ae }
            defpackage.je.d(r0)     // Catch:{ all -> 0x00ae }
            goto L_0x0240
        L_0x021d:
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b     // Catch:{ all -> 0x00ae }
            int[] r3 = r0.o     // Catch:{ all -> 0x00ae }
            r2 = r3[r2]     // Catch:{ all -> 0x00ae }
            int r3 = r0.b     // Catch:{ all -> 0x00ae }
            if (r2 >= r3) goto L_0x0229
            r0.L0 = r9     // Catch:{ all -> 0x00ae }
        L_0x0229:
            if (r8 == 0) goto L_0x022d
            r0.b = r2     // Catch:{ all -> 0x00ae }
        L_0x022d:
            r0.A0 = r2     // Catch:{ all -> 0x00ae }
            goto L_0x0239
        L_0x0230:
            float[] r2 = one.me.sdk.media.ffmpeg.AnimatedFileDrawable.M1
            java.lang.String r2 = "one.me.sdk.media.ffmpeg.AnimatedFileDrawable"
            java.lang.String r3 = "Fail load frame"
            udd.s(r2, r3, r0)
        L_0x0239:
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b
            af r0 = r0.B1
            defpackage.je.d(r0)
        L_0x0240:
            return
        L_0x0241:
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable.a(r0)
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b
            boolean r10 = r0.F0
            if (r10 != 0) goto L_0x024f
            r0.E0 = r9
            goto L_0x0251
        L_0x024f:
            r0.F0 = r8
        L_0x0251:
            r0.X = r3
            long r10 = r0.K0
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0279
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b
            android.graphics.Bitmap r10 = r0.z0
            r0.w0 = r10
            int r10 = r0.A0
            r0.x0 = r10
            r0.y0 = r8
            r0 = r8
        L_0x0266:
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r10 = r1.b
            android.graphics.BitmapShader[] r11 = r10.T0
            int r12 = r11.length
            if (r0 >= r12) goto L_0x0293
            android.graphics.BitmapShader[] r12 = r10.R0
            r11 = r11[r0]
            r12[r0] = r11
            android.graphics.BitmapShader[] r10 = r10.S0
            r10[r0] = r3
            int r0 = r0 + r9
            goto L_0x0266
        L_0x0279:
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b
            android.graphics.Bitmap r10 = r0.z0
            r0.w0 = r10
            int r10 = r0.A0
            r0.x0 = r10
            r0 = r8
        L_0x0284:
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r10 = r1.b
            android.graphics.BitmapShader[] r11 = r10.T0
            int r12 = r11.length
            if (r0 >= r12) goto L_0x0293
            android.graphics.BitmapShader[] r10 = r10.R0
            r11 = r11[r0]
            r10[r0] = r11
            int r0 = r0 + r9
            goto L_0x0284
        L_0x0293:
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b
            r0.z0 = r3
            r0 = r8
        L_0x0298:
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r10 = r1.b
            android.graphics.BitmapShader[] r11 = r10.T0
            int r12 = r11.length
            if (r0 >= r12) goto L_0x02a3
            r11[r0] = r3
            int r0 = r0 + r9
            goto L_0x0298
        L_0x02a3:
            boolean r0 = r10.L0
            if (r0 == 0) goto L_0x02b1
            r10.L0 = r8
            int r0 = r10.repeatCount
            int r0 = r0 + r9
            r10.repeatCount = r0
            r10.start()
        L_0x02b1:
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b
            int[] r3 = r0.o
            r3 = r3[r2]
            int r10 = r0.b
            if (r3 >= r10) goto L_0x02ca
            float r10 = r0.g1
            r11 = 0
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x02c7
            r11 = 1148846080(0x447a0000, float:1000.0)
            float r10 = r10 * r11
            int r10 = (int) r10
            goto L_0x02c8
        L_0x02c7:
            r10 = r8
        L_0x02c8:
            r0.b = r10
        L_0x02ca:
            int r10 = r0.b
            int r11 = r3 - r10
            if (r11 == 0) goto L_0x02dd
            int r3 = r3 - r10
            r0.c = r3
            boolean r10 = r0.u1
            if (r10 == 0) goto L_0x02dd
            r10 = 32
            if (r3 >= r10) goto L_0x02dd
            r0.c = r10
        L_0x02dd:
            long r10 = r0.K0
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x02f3
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b
            long r6 = r0.J0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x02f3
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b
            r0.K0 = r4
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b
            r0.c = r8
        L_0x02f3:
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b
            int[] r3 = r0.o
            r2 = r3[r2]
            r0.b = r2
            java.util.ArrayList r0 = r0.q1
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x031c
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b
            java.util.ArrayList r0 = r0.q1
            int r0 = r0.size()
        L_0x030b:
            if (r8 >= r0) goto L_0x031c
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r2 = r1.b
            java.util.ArrayList r2 = r2.q1
            java.lang.Object r2 = r2.get(r8)
            android.view.View r2 = (android.view.View) r2
            r2.invalidate()
            int r8 = r8 + r9
            goto L_0x030b
        L_0x031c:
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b
            r0.invalidateInternal()
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b
            r0.e()
            return
        L_0x0327:
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b
            boolean r0 = r0.d1
            if (r0 != 0) goto L_0x0360
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b
            boolean r2 = r0.B0
            if (r2 != 0) goto L_0x0360
            boolean r2 = r0.y1
            if (r2 != 0) goto L_0x0360
            bf r2 = r0.z1
            if (r2 != 0) goto L_0x0360
            long r4 = java.lang.System.currentTimeMillis()
            float r2 = (float) r4
            r0.g1 = r2
            gi4 r0 = one.me.rlottie.RLottieDrawable.lottieCacheGenerateQueue
            if (r0 != 0) goto L_0x0349
            one.me.rlottie.RLottieDrawable.createCacheGenQueue()
        L_0x0349:
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b
            r0.y1 = r9
            r0.X = r3
            int r2 = defpackage.rn0.B
            int r2 = r2 + r9
            defpackage.rn0.B = r2
            gi4 r2 = one.me.rlottie.RLottieDrawable.lottieCacheGenerateQueue
            bf r3 = new bf
            r3.<init>(r1, r8)
            r0.z1 = r3
            r2.b(r3)
        L_0x0360:
            return
        L_0x0361:
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable.a(r0)
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b
            r0.X = r3
            long r2 = r0.K0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0380
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b
            long r2 = r0.J0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0380
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b
            r0.K0 = r4
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b
            r0.c = r8
        L_0x0380:
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b
            r0.e()
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r0 = r1.b
            r0.invalidateInternal()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.af.run():void");
    }
}
