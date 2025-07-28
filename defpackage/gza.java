package defpackage;

/* renamed from: gza  reason: default package */
public final class gza {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gza(defpackage.xzc r11) {
        /*
            r10 = this;
            r10.<init>()
            java.lang.Class<gza> r0 = defpackage.gza.class
            java.lang.String r0 = r0.getName()
            vqc r11 = (defpackage.vqc) r11
            ru.ok.tamtam.android.prefs.PmsKey r1 = ru.ok.tamtam.android.prefs.PmsKey.f91playerloadcontrol
            r2 = 0
            java.lang.String r11 = r11.v(r1, r2)
            fn6 r1 = udd.e
            if (r1 != 0) goto L_0x0017
            goto L_0x0028
        L_0x0017:
            boolean r3 = r1.c()
            if (r3 == 0) goto L_0x0028
            tn7 r3 = defpackage.tn7.X
            java.lang.String r4 = "Server player control params="
            java.lang.String r4 = defpackage.rf0.h(r4, r11)
            r1.d(r3, r0, r4, r2)
        L_0x0028:
            if (r11 == 0) goto L_0x0036
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0030 }
            r1.<init>((java.lang.String) r11)     // Catch:{ JSONException -> 0x0030 }
            goto L_0x0037
        L_0x0030:
            r11 = move-exception
            java.lang.String r1 = "Failed to parse player control params"
            udd.s(r0, r1, r11)
        L_0x0036:
            r1 = r2
        L_0x0037:
            r11 = 4
            r3 = 1
            r4 = 500(0x1f4, float:7.0E-43)
            r5 = 13000(0x32c8, float:1.8217E-41)
            r6 = 5000(0x1388, float:7.006E-42)
            r7 = 3000(0xbb8, float:4.204E-42)
            r8 = 0
            if (r1 == 0) goto L_0x0085
            java.lang.String r9 = "mp_autoplay_enabled"
            boolean r9 = r1.optBoolean(r9, r8)
            r10.a = r9
            java.lang.String r9 = "time_over_size"
            boolean r8 = r1.optBoolean(r9, r8)
            r10.c = r8
            java.lang.String r8 = "buffer_after_rebuffer_ms"
            int r7 = r1.optInt(r8, r7)
            r10.d = r7
            java.lang.String r7 = "min_buffer_ms"
            int r6 = r1.optInt(r7, r6)
            r10.e = r6
            java.lang.String r6 = "max_buffer_ms"
            int r5 = r1.optInt(r6, r5)
            r10.f = r5
            java.lang.String r5 = "buffer_ms"
            int r4 = r1.optInt(r5, r4)
            r10.g = r4
            java.lang.String r4 = "use_min_size_lc"
            boolean r3 = r1.optBoolean(r4, r3)
            r10.b = r3
            java.lang.String r3 = "min_size_lc_fmt_mis_sf"
            int r11 = r1.optInt(r3, r11)
            r10.h = r11
            goto L_0x0095
        L_0x0085:
            r10.a = r8
            r10.c = r8
            r10.d = r7
            r10.e = r6
            r10.f = r5
            r10.g = r4
            r10.b = r3
            r10.h = r11
        L_0x0095:
            fn6 r11 = udd.e
            if (r11 != 0) goto L_0x009a
            goto L_0x00a9
        L_0x009a:
            boolean r1 = r11.c()
            if (r1 == 0) goto L_0x00a9
            tn7 r1 = defpackage.tn7.X
            java.lang.String r10 = r10.toString()
            r11.d(r1, r0, r10, r2)
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gza.<init>(xzc):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerControl(\n        isAutoPlayEnabledDuringMediaProcessing=");
        sb.append(this.a);
        sb.append("\n        isMinSizeLoadControlRequested=");
        sb.append(this.b);
        sb.append("\n        isPlaybackPrioritizeTimeOverSize=");
        sb.append(this.c);
        sb.append("\n        playbackMinBufferMs=");
        sb.append(this.e);
        sb.append("\n        playbackMaxBufferMs=");
        sb.append(this.f);
        sb.append("\n        playbackBufferMs=");
        sb.append(this.g);
        sb.append("\n        playbackBufferAfterRebufferMs=");
        sb.append(this.d);
        sb.append("\n        formatMaxInputSizeScaleUpFactor=");
        return wn6.j(sb, this.h, "\n        )\n        ");
    }
}
