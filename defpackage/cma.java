package defpackage;

/* renamed from: cma  reason: default package */
public final class cma {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final Integer e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final bma j;
    public final boolean k;
    public final String l;

    public cma(boolean z, boolean z2, String str, String str2, Integer num, boolean z3, boolean z4, boolean z5, boolean z6, bma bma, boolean z7, String str3) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = num;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = bma;
        this.k = z7;
        this.l = str3;
    }

    public static String a(boolean z) {
        return hr1.g(hr1.g(hr1.g(!z ? "CallsSDK-Audio-OpusNOLACE/Enabled/" : "", "WebRTC-AdjustOpusBandwidth/Enabled/"), "CallsSDK-DREDLowBitrate/Enabled/"), "WebRTC-Audio-StableTargetAdaptation/Enabled/");
    }

    public final ama b() {
        ama ama;
        Integer num;
        bma bma = this.j;
        if (bma != null) {
            if (!bma.a || bma.f == null || (num = bma.e) == null) {
                ama = null;
            } else {
                Integer valueOf = Integer.valueOf(a24.X(((float) num.intValue()) / 1000.0f));
                ama = new ama(valueOf, Integer.valueOf(a24.X(((float) num.intValue()) / 1000.0f)), Boolean.TRUE, (Integer) null, (Integer) null, (Double) null);
            }
            if (ama != null) {
                return ama;
            }
        }
        return new ama((Integer) null, (Integer) null, (Boolean) null, (Integer) null, (Integer) null, (Double) null);
    }
}
