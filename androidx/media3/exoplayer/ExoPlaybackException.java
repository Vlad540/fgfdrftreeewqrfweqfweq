package androidx.media3.exoplayer;

import android.os.Bundle;
import androidx.media3.common.PlaybackException;

public final class ExoPlaybackException extends PlaybackException {
    public static final String F0 = Integer.toString(1001, 36);
    public static final String G0 = Integer.toString(1002, 36);
    public static final String H0 = Integer.toString(1003, 36);
    public static final String I0 = Integer.toString(1004, 36);
    public static final String J0 = Integer.toString(1005, 36);
    public static final String K0 = Integer.toString(1006, 36);
    public final int A0;
    public final xu5 B0;
    public final int C0;
    public final se8 D0;
    public final boolean E0;
    public final int y0;
    public final String z0;

    static {
        int i = oze.a;
    }

    public ExoPlaybackException(int i, Throwable th, int i2) {
        this(i, th, i2, (String) null, -1, (xu5) null, 4, false);
    }

    public final boolean a(PlaybackException playbackException) {
        if (!super.a(playbackException)) {
            return false;
        }
        int i = oze.a;
        ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
        return this.y0 == exoPlaybackException.y0 && oze.a(this.z0, exoPlaybackException.z0) && this.A0 == exoPlaybackException.A0 && oze.a(this.B0, exoPlaybackException.B0) && this.C0 == exoPlaybackException.C0 && oze.a(this.D0, exoPlaybackException.D0) && this.E0 == exoPlaybackException.E0;
    }

    public final Bundle c() {
        Bundle c = super.c();
        c.putInt(F0, this.y0);
        c.putString(G0, this.z0);
        c.putInt(H0, this.A0);
        xu5 xu5 = this.B0;
        if (xu5 != null) {
            c.putBundle(I0, xu5.d(false));
        }
        c.putInt(J0, this.C0);
        c.putBoolean(K0, this.E0);
        return c;
    }

    public final ExoPlaybackException d(se8 se8) {
        String message = getMessage();
        int i = oze.a;
        return new ExoPlaybackException(message, getCause(), this.a, this.y0, this.z0, this.A0, this.B0, this.C0, se8, this.b, this.E0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, xu5 xu5, int i4, se8 se8, long j, boolean z) {
        super(str, th, i, Bundle.EMPTY, j);
        int i5 = i2;
        boolean z2 = z;
        boolean z3 = false;
        oyb.d(!z2 || i5 == 1);
        oyb.d((th != null || i5 == 3) ? true : z3);
        this.y0 = i5;
        this.z0 = str2;
        this.A0 = i3;
        this.B0 = xu5;
        this.C0 = i4;
        this.D0 = se8;
        this.E0 = z2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExoPlaybackException(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, defpackage.xu5 r19, int r20, boolean r21) {
        /*
            r13 = this;
            r4 = r14
            if (r4 == 0) goto L_0x0044
            r0 = 1
            if (r4 == r0) goto L_0x0015
            r0 = 3
            if (r4 == r0) goto L_0x0012
            java.lang.String r0 = "Unexpected runtime error"
        L_0x000b:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L_0x004c
        L_0x0012:
            java.lang.String r0 = "Remote error"
            goto L_0x000b
        L_0x0015:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r5 = r17
            r0.append(r5)
            java.lang.String r1 = " error, index="
            r0.append(r1)
            r6 = r18
            r0.append(r6)
            java.lang.String r1 = ", format="
            r0.append(r1)
            r7 = r19
            r0.append(r7)
            java.lang.String r1 = ", format_supported="
            r0.append(r1)
            java.lang.String r1 = defpackage.oze.z(r20)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x004c
        L_0x0044:
            r5 = r17
            r6 = r18
            r7 = r19
            java.lang.String r0 = "Source error"
        L_0x004c:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0059
            java.lang.String r1 = ": null"
            java.lang.String r0 = defpackage.hr1.g(r0, r1)
        L_0x0059:
            r1 = r0
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlaybackException.<init>(int, java.lang.Throwable, int, java.lang.String, int, xu5, int, boolean):void");
    }
}
