package defpackage;

import java.util.List;

/* renamed from: xga  reason: default package */
public final class xga {
    public final long a;
    public final String b;
    public final zy c;
    public final zga d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final List h;
    public final nd4 i;
    public final int j;
    public final boolean k;

    public xga(wga wga) {
        this.a = wga.a;
        this.b = wga.b;
        this.c = wga.c;
        this.d = wga.d;
        this.e = wga.e;
        this.f = wga.f;
        this.g = wga.g;
        this.h = wga.h;
        this.i = wga.i;
        this.j = wga.j;
        this.k = wga.k;
    }

    public final yr a() {
        kgd kgd = new kgd(0);
        kgd.put("cid", Long.valueOf(this.a));
        kgd.put("zoom", Integer.valueOf(this.j));
        kgd.put("attachMEL", Boolean.valueOf(this.k));
        String str = this.b;
        if (!r1g.p(str)) {
            kgd.put("text", str);
        }
        kgd.put("detectShare", Boolean.valueOf(this.e));
        zy zyVar = this.c;
        if (zyVar != null && zyVar.size() > 0) {
            kgd.put("attaches", zyVar);
        }
        zga zga = this.d;
        if (zga != null) {
            kgd.put("link", zga);
        }
        int i2 = this.f;
        if (i2 > 0) {
            kgd.put("ttl", Integer.valueOf(i2));
        }
        kgd.put("isLive", Boolean.valueOf(this.g));
        List list = this.h;
        if (list != null) {
            kgd.put("elements", list);
        }
        nd4 nd4 = this.i;
        if (nd4 != null) {
            kgd.put("delayedAttributes", nd4.a());
        }
        return kgd;
    }

    public final String toString() {
        cqc.Y.getClass();
        int p = ete.p(this.h);
        StringBuilder sb = new StringBuilder("OutgoingMessage{cid=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append("***");
        sb.append(", attaches=");
        sb.append(this.c);
        sb.append(", link=");
        sb.append(this.d);
        sb.append(", detectShare=");
        sb.append(this.e);
        sb.append(", ttl=");
        sb.append(this.f);
        sb.append(", live='");
        sb.append(this.g);
        sb.append("', elements=");
        sb.append(p);
        sb.append(", zoom=");
        sb.append(this.j);
        sb.append(", attachMEL=");
        return hr1.j(sb, this.k, "}");
    }
}
