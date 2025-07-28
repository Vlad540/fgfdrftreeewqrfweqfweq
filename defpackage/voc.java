package defpackage;

import java.util.EnumMap;

/* renamed from: voc  reason: default package */
public final class voc implements s16 {
    public final /* synthetic */ zoc a;
    public final /* synthetic */ toc b;
    public final /* synthetic */ boolean c = true;

    public voc(zoc zoc, toc toc) {
        this.a = zoc;
        this.b = toc;
    }

    public final Object invoke() {
        zoc zoc = this.a;
        qoc d = zoc.d(this.b);
        if (this.c) {
            EnumMap enumMap = zoc.z0;
            EnumMap enumMap2 = zoc.y0;
            toc toc = this.b;
            zoc.a(toc, enumMap, enumMap2, new yoc(d, zoc, toc, zoc, d));
        } else {
            d.setVisibility(8);
            zoc.removeView(d);
        }
        return Boolean.TRUE;
    }
}
