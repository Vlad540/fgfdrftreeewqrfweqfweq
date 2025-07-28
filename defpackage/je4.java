package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: je4  reason: default package */
public final class je4 implements Iterator, z67 {
    public int X;
    public final /* synthetic */ ke4 Y;
    public int a = -1;
    public int b;
    public int c;
    public fz6 o;

    public je4(ke4 ke4) {
        this.Y = ke4;
        int j = gwf.j(ke4.b, 0, ke4.a.length());
        this.b = j;
        this.c = j;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [dz6, fz6] */
    /* JADX WARNING: type inference failed for: r0v8, types: [dz6, fz6] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r6 < r3) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r7 = this;
            int r0 = r7.c
            r1 = 0
            if (r0 >= 0) goto L_0x000b
            r7.a = r1
            r0 = 0
            r7.o = r0
            goto L_0x007b
        L_0x000b:
            ke4 r2 = r7.Y
            int r3 = r2.c
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L_0x001a
            int r6 = r7.X
            int r6 = r6 + r5
            r7.X = r6
            if (r6 >= r3) goto L_0x0022
        L_0x001a:
            java.lang.CharSequence r3 = r2.a
            int r3 = r3.length()
            if (r0 <= r3) goto L_0x0034
        L_0x0022:
            fz6 r0 = new fz6
            int r1 = r7.b
            java.lang.CharSequence r2 = r2.a
            int r2 = defpackage.h0e.V(r2)
            r0.<init>(r1, r2, r5)
            r7.o = r0
            r7.c = r4
            goto L_0x0079
        L_0x0034:
            i26 r0 = r2.d
            java.lang.CharSequence r3 = r2.a
            int r6 = r7.c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.invoke(r3, r6)
            wia r0 = (defpackage.wia) r0
            if (r0 != 0) goto L_0x0058
            fz6 r0 = new fz6
            int r1 = r7.b
            java.lang.CharSequence r2 = r2.a
            int r2 = defpackage.h0e.V(r2)
            r0.<init>(r1, r2, r5)
            r7.o = r0
            r7.c = r4
            goto L_0x0079
        L_0x0058:
            java.lang.Object r2 = r0.a
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.b
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.b
            fz6 r3 = defpackage.gwf.S(r3, r2)
            r7.o = r3
            int r2 = r2 + r0
            r7.b = r2
            if (r0 != 0) goto L_0x0076
            r1 = r5
        L_0x0076:
            int r2 = r2 + r1
            r7.c = r2
        L_0x0079:
            r7.a = r5
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.je4.a():void");
    }

    public final boolean hasNext() {
        if (this.a == -1) {
            a();
        }
        return this.a == 1;
    }

    public final Object next() {
        if (this.a == -1) {
            a();
        }
        if (this.a != 0) {
            fz6 fz6 = this.o;
            this.o = null;
            this.a = -1;
            return fz6;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
