package defpackage;

import java.util.Iterator;

/* renamed from: ds  reason: default package */
public final class ds implements Iterable, z67 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ds(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public boolean a(String str) {
        for (hm6 hm6 : (hm6[]) this.b) {
            if (p0e.M(hm6.a, str, true)) {
                return true;
            }
        }
        return false;
    }

    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new u1(2, (Object[]) this.b);
            case 1:
                return new u1(2, (hm6[]) this.b);
            case 2:
                return new gp4((Iterator) ((s16) this.b).invoke());
            case 3:
                return ((dyc) this.b).iterator();
            default:
                return new vyc((syc) this.b, 1);
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "[" + cs.d0((hm6[]) this.b, ", ", 62) + ']';
            default:
                return super.toString();
        }
    }
}
