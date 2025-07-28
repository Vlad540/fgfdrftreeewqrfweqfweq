package defpackage;

import java.util.List;

/* renamed from: vsc  reason: default package */
public final class vsc {
    public final bqc a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;
    public final List f;
    public final long g;
    public final int h;
    public final boolean i;
    public final long j;
    public final List k;
    public final List l;
    public final String m;
    public final List n;

    public vsc(usc usc) {
        this.a = usc.a;
        this.b = usc.b;
        this.c = usc.c;
        this.d = usc.d;
        this.e = usc.e;
        this.f = usc.f;
        this.g = usc.g;
        this.i = usc.i;
        this.h = usc.h;
        this.j = usc.j;
        this.k = usc.k;
        this.l = usc.l;
        this.m = usc.m;
        this.n = usc.n;
    }

    public final String toString() {
        int p = ete.p(this.d);
        int p2 = ete.p(this.e);
        int p3 = ete.p(this.k);
        int p4 = ete.p(this.l);
        int p5 = ete.p(this.n);
        StringBuilder sb = new StringBuilder("Section{type=");
        sb.append(this.a);
        sb.append(", id='");
        sb.append(this.b);
        sb.append("', title='");
        sb.append(this.c);
        sb.append("', stickers=");
        sb.append(p);
        sb.append(", stickerSets=");
        sb.append(p2);
        sb.append(", marker=");
        sb.append(this.g);
        sb.append(", totalCount=");
        sb.append(this.h);
        sb.append(", collapsed=");
        sb.append(this.i);
        sb.append(", updateTime=");
        sb.append(this.j);
        sb.append(", recentEmojiList=");
        sb.append(p3);
        sb.append(", recentsList=");
        sb.append(p4);
        sb.append(", animojiSets=");
        sb.append(p5);
        sb.append(", mode='");
        return wn6.l(sb, this.m, "'}");
    }
}
