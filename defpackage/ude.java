package defpackage;

/* renamed from: ude  reason: default package */
public final class ude {
    public final long a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final String k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final long o;

    public ude(tde tde) {
        long j2 = tde.a;
        this.a = j2;
        String str = tde.b;
        this.b = str;
        this.c = tde.c;
        this.d = tde.d;
        this.e = tde.e;
        this.f = tde.f;
        this.j = tde.j;
        this.k = tde.k;
        this.g = tde.g;
        this.h = tde.h;
        this.i = tde.i;
        this.l = tde.l;
        this.m = tde.m;
        this.n = tde.n;
        this.o = (j2 * 31) + ((long) str.hashCode());
    }

    public final boolean a() {
        return this.c > 0 || this.d > 0 || this.e > 0 || this.j > 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaskAttachDownloadData{messageId=");
        sb.append(this.a);
        sb.append(", attachId='");
        sb.append(this.b);
        sb.append("', videoId=");
        sb.append(this.c);
        sb.append(", audioId=");
        sb.append(this.d);
        sb.append(", mp4GifId=");
        sb.append(this.e);
        sb.append(", stickerId=");
        sb.append(this.f);
        sb.append(", url='");
        sb.append(this.g);
        sb.append("', notifyProgress=");
        sb.append(this.h);
        sb.append(", checkAutoLoadConnection=");
        sb.append(this.i);
        sb.append(", fileId=");
        sb.append(this.j);
        sb.append(", fileName='");
        sb.append(this.k);
        sb.append("', invalidateCount=");
        sb.append(this.l);
        sb.append(", useOriginalExtension=");
        sb.append(this.m);
        sb.append(", notCopyVideoToGallery=");
        return hr1.j(sb, this.n, "}");
    }
}
