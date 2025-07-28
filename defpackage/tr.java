package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: tr  reason: default package */
public final class tr extends AbstractSet {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public tr(uze[] uzeArr) {
        this.b = uzeArr;
    }

    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new wr((yr) this.b);
            default:
                return new ds6((uze[]) this.b, 1);
        }
    }

    public final int size() {
        switch (this.a) {
            case 0:
                return ((yr) this.b).c;
            default:
                return ((uze[]) this.b).length / 2;
        }
    }

    public tr(yr yrVar) {
        this.b = yrVar;
    }
}
