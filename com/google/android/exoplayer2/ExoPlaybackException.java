package com.google.android.exoplayer2;

public final class ExoPlaybackException extends PlaybackException {
    public final int X;
    public final vu5 Y;
    public final int Z;
    public final int c;
    public final String o;
    public final v88 w0;
    public final boolean x0;

    public ExoPlaybackException(int i, Throwable th, int i2) {
        this(i, th, i2, (String) null, -1, (vu5) null, 4, false);
    }

    public final ExoPlaybackException a(v88 v88) {
        String message = getMessage();
        int i = mze.a;
        return new ExoPlaybackException(message, getCause(), this.a, this.c, this.o, this.X, this.Y, this.Z, v88, this.b, this.x0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, vu5 vu5, int i4, v88 v88, long j, boolean z) {
        super(str, th, i, j);
        int i5 = i2;
        boolean z2 = z;
        boolean z3 = false;
        swb.e(!z2 || i5 == 1);
        swb.e((th != null || i5 == 3) ? true : z3);
        this.c = i5;
        this.o = str2;
        this.X = i3;
        this.Y = vu5;
        this.Z = i4;
        this.w0 = v88;
        this.x0 = z2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExoPlaybackException(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, defpackage.vu5 r19, int r20, boolean r21) {
        /*
            r13 = this;
            r4 = r14
            r5 = r17
            r8 = r20
            r0 = 2
            if (r4 == 0) goto L_0x0072
            r1 = 3
            r2 = 1
            if (r4 == r2) goto L_0x0016
            if (r4 == r1) goto L_0x0013
            java.lang.String r1 = "Unexpected runtime error"
        L_0x0010:
            r7 = r18
            goto L_0x0076
        L_0x0013:
            java.lang.String r1 = "Remote error"
            goto L_0x0010
        L_0x0016:
            java.lang.String r3 = java.lang.String.valueOf(r19)
            int r6 = defpackage.mze.a
            if (r8 == 0) goto L_0x0039
            if (r8 == r2) goto L_0x0036
            if (r8 == r0) goto L_0x0033
            if (r8 == r1) goto L_0x0030
            r1 = 4
            if (r8 != r1) goto L_0x002a
            java.lang.String r1 = "YES"
            goto L_0x003b
        L_0x002a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0030:
            java.lang.String r1 = "NO_EXCEEDS_CAPABILITIES"
            goto L_0x003b
        L_0x0033:
            java.lang.String r1 = "NO_UNSUPPORTED_DRM"
            goto L_0x003b
        L_0x0036:
            java.lang.String r1 = "NO_UNSUPPORTED_TYPE"
            goto L_0x003b
        L_0x0039:
            java.lang.String r1 = "NO"
        L_0x003b:
            r2 = 53
            int r2 = me4.e(r2, r5)
            int r6 = r3.length()
            int r6 = r6 + r2
            int r2 = r1.length()
            int r2 = r2 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r2)
            r6.append(r5)
            java.lang.String r2 = " error, index="
            r6.append(r2)
            r7 = r18
            r6.append(r7)
            java.lang.String r2 = ", format="
            r6.append(r2)
            r6.append(r3)
            java.lang.String r2 = ", format_supported="
            r6.append(r2)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            goto L_0x0076
        L_0x0072:
            r7 = r18
            java.lang.String r1 = "Source error"
        L_0x0076:
            r2 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x009f
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            int r2 = r2 + r0
            java.lang.String r0 = "null"
            int r0 = r0.length()
            int r0 = r0 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r1)
            java.lang.String r0 = ": null"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1 = r0
        L_0x009f:
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r16
            r4 = r14
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoPlaybackException.<init>(int, java.lang.Throwable, int, java.lang.String, int, vu5, int, boolean):void");
    }
}
