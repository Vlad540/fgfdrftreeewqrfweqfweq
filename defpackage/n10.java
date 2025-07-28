package defpackage;

import java.util.Arrays;

/* renamed from: n10  reason: default package */
public final class n10 {
    public static final n10 r = new k10().a();
    public final long a;
    public final int b;
    public final long c;
    public final String d;
    public final int e;
    public final int f;
    public final boolean g;
    public final String h;
    public final String i;
    public final byte[] j;
    public final long k;
    public final m10 l;
    public final String m;
    public final xx n;
    public final boolean o;
    public final int p;
    public final int q;

    public n10(k10 k10) {
        this.a = k10.a;
        this.b = k10.q;
        this.c = k10.b;
        this.d = k10.c;
        this.e = k10.d;
        this.f = k10.e;
        this.g = k10.f;
        this.h = k10.g;
        this.i = k10.h;
        this.j = k10.i;
        this.k = k10.j;
        this.l = k10.k;
        this.m = k10.l;
        this.n = k10.m;
        this.o = k10.n;
        this.p = k10.o;
        this.q = k10.p;
    }

    public final k10 a() {
        k10 k10 = new k10();
        k10.a = this.a;
        k10.q = this.b;
        k10.b = this.c;
        k10.c = this.d;
        k10.d = this.e;
        k10.e = this.f;
        k10.f = this.g;
        k10.g = this.h;
        k10.h = this.i;
        k10.i = this.j;
        k10.j = this.k;
        k10.k = this.l;
        k10.l = this.m;
        k10.m = this.n;
        k10.n = this.o;
        k10.o = this.p;
        k10.p = this.q;
        return k10;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.j);
        StringBuilder sb = new StringBuilder("Video{videoId=");
        sb.append(this.a);
        sb.append(", videoType=");
        int i2 = this.b;
        sb.append(i2 != 1 ? i2 != 2 ? "null" : "VIDEO_MESSAGE" : "VIDEO");
        sb.append(", duration=");
        sb.append(this.c);
        sb.append(", thumbnail='");
        sb.append(this.d);
        sb.append("', width=");
        sb.append(this.e);
        sb.append(", height=");
        sb.append(this.f);
        sb.append(", live=");
        sb.append(this.g);
        sb.append(", externalUrl='");
        sb.append(this.h);
        sb.append("', externalSiteName='");
        sb.append(this.i);
        sb.append("', previewData=");
        sb.append(arrays);
        sb.append(", startTime=");
        sb.append(this.k);
        sb.append(", convertOptions=");
        sb.append(this.l);
        sb.append(", token='");
        sb.append(this.m);
        sb.append("', videoCollage=");
        sb.append(this.n);
        sb.append(", ignoreAutoplay=");
        sb.append(this.o);
        sb.append(", audioTrackIndex=");
        sb.append(this.p);
        sb.append(", audioGroupIndex=");
        return wn6.j(sb, this.q, "}");
    }
}
