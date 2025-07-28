package defpackage;

import java.util.Iterator;

/* renamed from: yjd  reason: default package */
public final class yjd implements dyc {
    public final /* synthetic */ dyc a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d = false;

    public yjd(es esVar, int i, int i2) {
        this.a = esVar;
        this.b = i;
        this.c = i2;
    }

    public final Iterator iterator() {
        return pfa.G(this.a.iterator(), this.b, this.c, this.d);
    }
}
