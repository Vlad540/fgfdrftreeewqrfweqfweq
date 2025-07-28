package defpackage;

import java.lang.ref.WeakReference;
import java.util.LinkedList;

/* renamed from: fr7  reason: default package */
public final class fr7 {
    public LinkedList a;
    public WeakReference b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: er7} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.er7 r6) {
        /*
            r5 = this;
            java.util.LinkedList r0 = r5.a
            if (r0 == 0) goto L_0x0083
            java.util.Iterator r0 = r0.descendingIterator()
            if (r0 != 0) goto L_0x000c
            goto L_0x0083
        L_0x000c:
            r1 = 0
            r2 = r1
        L_0x000e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x004a
            java.lang.Object r3 = r0.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r3 = r3.get()
            er7 r3 = (defpackage.er7) r3
            if (r3 != 0) goto L_0x0026
            r0.remove()
            goto L_0x000e
        L_0x0026:
            if (r2 != 0) goto L_0x0029
            r2 = r3
        L_0x0029:
            if (r3 != r6) goto L_0x000e
            if (r2 != r6) goto L_0x0046
            java.util.Set r3 = r6.a
            if (r3 != 0) goto L_0x0032
            goto L_0x0046
        L_0x0032:
            java.util.Iterator r3 = r3.iterator()
        L_0x0036:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0046
            java.lang.Object r4 = r3.next()
            cr7 r4 = (defpackage.cr7) r4
            r4.d()
            goto L_0x0036
        L_0x0046:
            r0.remove()
            goto L_0x000e
        L_0x004a:
            java.lang.ref.WeakReference r6 = r5.b
            if (r6 == 0) goto L_0x0055
            java.lang.Object r6 = r6.get()
            er7 r6 = (defpackage.er7) r6
            goto L_0x0056
        L_0x0055:
            r6 = r1
        L_0x0056:
            if (r6 == 0) goto L_0x005a
            r1 = r6
            goto L_0x007e
        L_0x005a:
            java.util.LinkedList r5 = r5.a
            if (r5 == 0) goto L_0x007e
            java.util.Iterator r5 = r5.descendingIterator()
            if (r5 != 0) goto L_0x0065
            goto L_0x007e
        L_0x0065:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x007e
            java.lang.Object r6 = r5.next()
            java.lang.ref.WeakReference r6 = (java.lang.ref.WeakReference) r6
            java.lang.Object r6 = r6.get()
            r1 = r6
            er7 r1 = (defpackage.er7) r1
            if (r1 != 0) goto L_0x007e
            r5.remove()
            goto L_0x0065
        L_0x007e:
            if (r1 == 0) goto L_0x0083
            r1.a()
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr7.a(er7):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: er7} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.er7 r8) {
        /*
            r7 = this;
            java.util.LinkedList r0 = r7.a
            r1 = 0
            if (r0 != 0) goto L_0x000e
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r7.a = r0
            r2 = r1
            goto L_0x0054
        L_0x000e:
            java.util.Iterator r0 = r0.descendingIterator()
            if (r0 != 0) goto L_0x0015
            return
        L_0x0015:
            r2 = r1
            r3 = r2
        L_0x0017:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0054
            java.lang.Object r4 = r0.next()
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            java.lang.Object r5 = r4.get()
            er7 r5 = (defpackage.er7) r5
            if (r5 != 0) goto L_0x002f
            r0.remove()
            goto L_0x0017
        L_0x002f:
            if (r3 != 0) goto L_0x004d
            if (r5 == r8) goto L_0x004c
            java.util.Set r3 = r5.a
            if (r3 != 0) goto L_0x0038
            goto L_0x004c
        L_0x0038:
            java.util.Iterator r3 = r3.iterator()
        L_0x003c:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x004c
            java.lang.Object r6 = r3.next()
            cr7 r6 = (defpackage.cr7) r6
            r6.d()
            goto L_0x003c
        L_0x004c:
            r3 = r5
        L_0x004d:
            if (r5 != r8) goto L_0x0017
            r0.remove()
            r2 = r4
            goto L_0x0017
        L_0x0054:
            if (r2 != 0) goto L_0x005b
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r8)
        L_0x005b:
            java.util.LinkedList r0 = r7.a
            if (r0 == 0) goto L_0x0062
            r0.add(r2)
        L_0x0062:
            java.lang.ref.WeakReference r7 = r7.b
            if (r7 == 0) goto L_0x006d
            java.lang.Object r7 = r7.get()
            r1 = r7
            er7 r1 = (defpackage.er7) r1
        L_0x006d:
            if (r1 == 0) goto L_0x0075
            if (r8 == r1) goto L_0x0075
            r1.a()
            goto L_0x0078
        L_0x0075:
            r8.a()
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr7.b(er7):void");
    }
}
