package defpackage;

import java.util.List;

/* renamed from: dtd  reason: default package */
public final class dtd extends hh0 {
    public final int A0;
    public final long B0;
    public final String C0;
    public final boolean D0;
    public final int E0;
    public final String F0;
    public final int X;
    public final String Y;
    public final long Z;
    public final long c;
    public final int o;
    public final String w0;
    public final String x0;
    public final String y0;
    public final List z0;

    public dtd(ctd ctd) {
        super(ctd.a);
        this.c = ctd.b;
        this.o = ctd.c;
        this.X = ctd.d;
        this.Y = ctd.e;
        this.Z = ctd.f;
        this.w0 = ctd.g;
        this.x0 = ctd.h;
        this.y0 = ctd.i;
        this.z0 = ctd.j;
        this.A0 = ctd.k;
        this.B0 = ctd.l;
        this.C0 = ctd.m;
        this.D0 = ctd.n;
        this.E0 = ctd.o;
        this.F0 = ctd.p;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerDb{stickerId=");
        sb.append(this.c);
        sb.append(", width=");
        sb.append(this.o);
        sb.append(", height=");
        sb.append(this.X);
        sb.append(", url='");
        sb.append(this.Y);
        sb.append("', updateTime=");
        sb.append(this.Z);
        sb.append(", mp4url='");
        sb.append(this.w0);
        sb.append("', firstUrl='");
        sb.append(this.x0);
        sb.append("', previewUrl='");
        sb.append(this.y0);
        sb.append("', tags='");
        sb.append(this.z0);
        sb.append("', token='null', stickerType=");
        sb.append(c3d.s(this.A0));
        sb.append(", setId=");
        sb.append(this.B0);
        sb.append(", lottieUrl='");
        sb.append(this.C0);
        sb.append("', audio=");
        sb.append(this.D0);
        sb.append(", authorType=");
        sb.append(c3d.q(this.E0));
        sb.append(", videoUrl='");
        return wn6.l(sb, this.F0, "'}");
    }
}
