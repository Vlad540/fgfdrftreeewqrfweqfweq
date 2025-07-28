package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* renamed from: xa4  reason: default package */
public final class xa4 {
    public final ViewGroup a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d;
    public boolean e;

    public xa4(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public final void a(jmd jmd) {
        if (jmd.i) {
            c3d.a(jmd.a, jmd.c.W0(), this.a);
            jmd.i = false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: jmd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: jmd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: jmd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: jmd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.util.ArrayList r13, boolean r14) {
        /*
            r12 = this;
            java.util.Iterator r0 = r13.iterator()
        L_0x0004:
            boolean r1 = r0.hasNext()
            r2 = 2
            r3 = 0
            java.lang.String r4 = "Unknown visibility "
            r5 = 8
            r6 = 4
            r7 = 0
            if (r1 == 0) goto L_0x0046
            java.lang.Object r1 = r0.next()
            r8 = r1
            jmd r8 = (defpackage.jmd) r8
            androidx.fragment.app.a r9 = r8.c
            android.view.View r9 = r9.Y0
            float r10 = r9.getAlpha()
            int r10 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x002c
            int r10 = r9.getVisibility()
            if (r10 != 0) goto L_0x002c
            goto L_0x0004
        L_0x002c:
            int r9 = r9.getVisibility()
            if (r9 == 0) goto L_0x0041
            if (r9 == r6) goto L_0x0004
            if (r9 != r5) goto L_0x0037
            goto L_0x0004
        L_0x0037:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = wn6.h(r9, r4)
            r12.<init>(r13)
            throw r12
        L_0x0041:
            int r8 = r8.a
            if (r8 == r2) goto L_0x0004
            goto L_0x0047
        L_0x0046:
            r1 = r3
        L_0x0047:
            jmd r1 = (defpackage.jmd) r1
            int r0 = r13.size()
            java.util.ListIterator r0 = r13.listIterator(r0)
        L_0x0051:
            boolean r8 = r0.hasPrevious()
            if (r8 == 0) goto L_0x008b
            java.lang.Object r8 = r0.previous()
            r9 = r8
            jmd r9 = (defpackage.jmd) r9
            androidx.fragment.app.a r10 = r9.c
            android.view.View r10 = r10.Y0
            float r11 = r10.getAlpha()
            int r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0071
            int r11 = r10.getVisibility()
            if (r11 != 0) goto L_0x0071
            goto L_0x0086
        L_0x0071:
            int r10 = r10.getVisibility()
            if (r10 == 0) goto L_0x0051
            if (r10 == r6) goto L_0x0086
            if (r10 != r5) goto L_0x007c
            goto L_0x0086
        L_0x007c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = wn6.h(r10, r4)
            r12.<init>(r13)
            throw r12
        L_0x0086:
            int r9 = r9.a
            if (r9 != r2) goto L_0x0051
            r3 = r8
        L_0x008b:
            jmd r3 = (defpackage.jmd) r3
            java.lang.String r0 = "FragmentManager"
            boolean r4 = android.util.Log.isLoggable(r0, r2)
            if (r4 == 0) goto L_0x009b
            java.util.Objects.toString(r1)
            java.util.Objects.toString(r3)
        L_0x009b:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Object r6 = defpackage.o23.e0(r13)
            jmd r6 = (defpackage.jmd) r6
            androidx.fragment.app.a r6 = r6.c
            java.util.Iterator r7 = r13.iterator()
        L_0x00b1:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00d4
            java.lang.Object r8 = r7.next()
            jmd r8 = (defpackage.jmd) r8
            androidx.fragment.app.a r8 = r8.c
            ex5 r8 = r8.b1
            ex5 r9 = r6.b1
            int r10 = r9.b
            r8.b = r10
            int r10 = r9.c
            r8.c = r10
            int r10 = r9.d
            r8.d = r10
            int r9 = r9.e
            r8.e = r9
            goto L_0x00b1
        L_0x00d4:
            java.util.Iterator r13 = r13.iterator()
        L_0x00d8:
            boolean r6 = r13.hasNext()
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x0139
            java.lang.Object r6 = r13.next()
            jmd r6 = (defpackage.jmd) r6
            ra4 r9 = new ra4
            r9.<init>(r6, r14)
            r4.add(r9)
            wa4 r9 = new wa4
            if (r14 == 0) goto L_0x00f6
            if (r6 != r1) goto L_0x00f9
        L_0x00f4:
            r7 = r8
            goto L_0x00f9
        L_0x00f6:
            if (r6 != r3) goto L_0x00f9
            goto L_0x00f4
        L_0x00f9:
            r8 = 4
            r9.<init>(r8, r6)
            int r8 = r6.a
            r10 = 2
            androidx.fragment.app.a r11 = r6.c
            if (r8 != r10) goto L_0x010d
            if (r14 == 0) goto L_0x0109
            ex5 r8 = r11.b1
            goto L_0x0115
        L_0x0109:
            r11.getClass()
            goto L_0x0115
        L_0x010d:
            if (r14 == 0) goto L_0x0112
            ex5 r8 = r11.b1
            goto L_0x0115
        L_0x0112:
            r11.getClass()
        L_0x0115:
            int r8 = r6.a
            if (r8 != r10) goto L_0x0120
            if (r14 == 0) goto L_0x011e
            ex5 r8 = r11.b1
            goto L_0x0120
        L_0x011e:
            ex5 r8 = r11.b1
        L_0x0120:
            if (r7 == 0) goto L_0x012a
            if (r14 == 0) goto L_0x0127
            ex5 r7 = r11.b1
            goto L_0x012a
        L_0x0127:
            r11.getClass()
        L_0x012a:
            r5.add(r9)
            oa4 r7 = new oa4
            r8 = 0
            r7.<init>(r12, r6, r8)
            java.util.ArrayList r6 = r6.d
            r6.add(r7)
            goto L_0x00d8
        L_0x0139:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r14 = r5.iterator()
        L_0x0142:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x0159
            java.lang.Object r1 = r14.next()
            r3 = r1
            wa4 r3 = (defpackage.wa4) r3
            boolean r3 = r3.U1()
            if (r3 != 0) goto L_0x0142
            r13.add(r1)
            goto L_0x0142
        L_0x0159:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x0162:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0172
            java.lang.Object r1 = r13.next()
            wa4 r1 = (defpackage.wa4) r1
            r1.getClass()
            goto L_0x0162
        L_0x0172:
            java.util.Iterator r13 = r14.iterator()
        L_0x0176:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0186
            java.lang.Object r14 = r13.next()
            wa4 r14 = (defpackage.wa4) r14
            r14.getClass()
            goto L_0x0176
        L_0x0186:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r1 = r4.iterator()
        L_0x0194:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01aa
            java.lang.Object r3 = r1.next()
            ra4 r3 = (defpackage.ra4) r3
            java.lang.Object r3 = r3.b
            jmd r3 = (defpackage.jmd) r3
            java.util.ArrayList r3 = r3.k
            defpackage.u23.K(r3, r14)
            goto L_0x0194
        L_0x01aa:
            boolean r14 = r14.isEmpty()
            r14 = r14 ^ r8
            java.util.Iterator r1 = r4.iterator()
            r3 = r7
        L_0x01b4:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0203
            java.lang.Object r4 = r1.next()
            ra4 r4 = (defpackage.ra4) r4
            android.view.ViewGroup r5 = r12.a
            android.content.Context r5 = r5.getContext()
            java.lang.Object r6 = r4.b
            jmd r6 = (defpackage.jmd) r6
            nu7 r5 = r4.Z1(r5)
            if (r5 != 0) goto L_0x01d1
            goto L_0x01b4
        L_0x01d1:
            java.lang.Object r5 = r5.b
            android.animation.AnimatorSet r5 = (android.animation.AnimatorSet) r5
            if (r5 != 0) goto L_0x01db
            r13.add(r4)
            goto L_0x01b4
        L_0x01db:
            androidx.fragment.app.a r5 = r6.c
            java.util.ArrayList r9 = r6.k
            boolean r9 = r9.isEmpty()
            r9 = r9 ^ r8
            if (r9 == 0) goto L_0x01f0
            boolean r4 = android.util.Log.isLoggable(r0, r2)
            if (r4 == 0) goto L_0x01b4
            java.util.Objects.toString(r5)
            goto L_0x01b4
        L_0x01f0:
            int r3 = r6.a
            r5 = 3
            if (r3 != r5) goto L_0x01f7
            r6.i = r7
        L_0x01f7:
            ta4 r3 = new ta4
            r3.<init>(r4)
            java.util.ArrayList r4 = r6.j
            r4.add(r3)
            r3 = r8
            goto L_0x01b4
        L_0x0203:
            java.util.Iterator r12 = r13.iterator()
        L_0x0207:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x023c
            java.lang.Object r13 = r12.next()
            ra4 r13 = (defpackage.ra4) r13
            java.lang.Object r1 = r13.b
            jmd r1 = (defpackage.jmd) r1
            androidx.fragment.app.a r4 = r1.c
            if (r14 == 0) goto L_0x0225
            boolean r13 = android.util.Log.isLoggable(r0, r2)
            if (r13 == 0) goto L_0x0207
            java.util.Objects.toString(r4)
            goto L_0x0207
        L_0x0225:
            if (r3 == 0) goto L_0x0231
            boolean r13 = android.util.Log.isLoggable(r0, r2)
            if (r13 == 0) goto L_0x0207
            java.util.Objects.toString(r4)
            goto L_0x0207
        L_0x0231:
            qa4 r4 = new qa4
            r4.<init>(r13)
            java.util.ArrayList r13 = r1.j
            r13.add(r4)
            goto L_0x0207
        L_0x023c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa4.b(java.util.ArrayList, boolean):void");
    }

    public final void c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u23.K(((jmd) it.next()).k, arrayList2);
        }
        List s0 = o23.s0(o23.w0(arrayList2));
        int size = s0.size();
        for (int i = 0; i < size; i++) {
            ((imd) s0.get(i)).b(this.a);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a((jmd) arrayList.get(i2));
        }
        List s02 = o23.s0(arrayList);
        int size3 = s02.size();
        for (int i3 = 0; i3 < size3; i3++) {
            jmd jmd = (jmd) s02.get(i3);
            if (jmd.k.isEmpty()) {
                jmd.b();
            }
        }
    }

    public final void d(int i, int i2, e eVar) {
        synchronized (this.b) {
            try {
                jmd f = f(eVar.c);
                if (f == null) {
                    a aVar = eVar.c;
                    f = aVar.C0 ? g(aVar) : null;
                }
                if (f != null) {
                    f.d(i, i2);
                    return;
                }
                jmd jmd = new jmd(i, i2, eVar);
                this.b.add(jmd);
                jmd.d.add(new oa4(this, jmd, 1));
                jmd.d.add(new oa4(this, jmd, 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x015a, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x010d A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0138 A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x013f A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x010e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r9 = this;
            boolean r0 = r9.e
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            android.view.ViewGroup r0 = r9.a
            boolean r0 = r0.isAttachedToWindow()
            r1 = 0
            if (r0 != 0) goto L_0x0014
            r9.h()
            r9.d = r1
            return
        L_0x0014:
            java.util.ArrayList r0 = r9.b
            monitor-enter(r0)
            java.util.ArrayList r2 = r9.b     // Catch:{ all -> 0x0048 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0048 }
            r3 = 2
            if (r2 == 0) goto L_0x005f
            java.util.ArrayList r1 = r9.c     // Catch:{ all -> 0x0048 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0048 }
            r2.<init>(r1)     // Catch:{ all -> 0x0048 }
            java.util.ArrayList r1 = r9.c     // Catch:{ all -> 0x0048 }
            r1.clear()     // Catch:{ all -> 0x0048 }
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x0048 }
        L_0x0030:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0048 }
            if (r2 == 0) goto L_0x0159
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0048 }
            jmd r2 = (defpackage.jmd) r2     // Catch:{ all -> 0x0048 }
            java.lang.String r4 = "FragmentManager"
            boolean r4 = android.util.Log.isLoggable(r4, r3)     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x004b
            java.util.Objects.toString(r2)     // Catch:{ all -> 0x0048 }
            goto L_0x004b
        L_0x0048:
            r9 = move-exception
            goto L_0x015b
        L_0x004b:
            android.view.ViewGroup r4 = r9.a     // Catch:{ all -> 0x0048 }
            boolean r5 = r2.e     // Catch:{ all -> 0x0048 }
            if (r5 == 0) goto L_0x0052
            goto L_0x0055
        L_0x0052:
            r2.a(r4)     // Catch:{ all -> 0x0048 }
        L_0x0055:
            boolean r4 = r2.f     // Catch:{ all -> 0x0048 }
            if (r4 != 0) goto L_0x0030
            java.util.ArrayList r4 = r9.c     // Catch:{ all -> 0x0048 }
            r4.add(r2)     // Catch:{ all -> 0x0048 }
            goto L_0x0030
        L_0x005f:
            java.util.ArrayList r2 = r9.c     // Catch:{ all -> 0x0048 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0048 }
            r4.<init>(r2)     // Catch:{ all -> 0x0048 }
            java.util.ArrayList r2 = r9.c     // Catch:{ all -> 0x0048 }
            r2.clear()     // Catch:{ all -> 0x0048 }
            java.util.Iterator r2 = r4.iterator()     // Catch:{ all -> 0x0048 }
        L_0x006f:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0048 }
            r5 = 1
            if (r4 == 0) goto L_0x00a3
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0048 }
            jmd r4 = (defpackage.jmd) r4     // Catch:{ all -> 0x0048 }
            java.lang.String r6 = "FragmentManager"
            boolean r6 = android.util.Log.isLoggable(r6, r3)     // Catch:{ all -> 0x0048 }
            if (r6 == 0) goto L_0x0087
            java.util.Objects.toString(r4)     // Catch:{ all -> 0x0048 }
        L_0x0087:
            android.view.ViewGroup r6 = r9.a     // Catch:{ all -> 0x0048 }
            androidx.fragment.app.a r7 = r4.c     // Catch:{ all -> 0x0048 }
            boolean r7 = r7.C0     // Catch:{ all -> 0x0048 }
            boolean r8 = r4.e     // Catch:{ all -> 0x0048 }
            if (r8 == 0) goto L_0x0092
            goto L_0x0099
        L_0x0092:
            if (r7 == 0) goto L_0x0096
            r4.g = r5     // Catch:{ all -> 0x0048 }
        L_0x0096:
            r4.a(r6)     // Catch:{ all -> 0x0048 }
        L_0x0099:
            boolean r5 = r4.f     // Catch:{ all -> 0x0048 }
            if (r5 != 0) goto L_0x006f
            java.util.ArrayList r5 = r9.c     // Catch:{ all -> 0x0048 }
            r5.add(r4)     // Catch:{ all -> 0x0048 }
            goto L_0x006f
        L_0x00a3:
            r9.k()     // Catch:{ all -> 0x0048 }
            java.util.ArrayList r2 = r9.b     // Catch:{ all -> 0x0048 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0048 }
            r3.<init>(r2)     // Catch:{ all -> 0x0048 }
            boolean r2 = r3.isEmpty()     // Catch:{ all -> 0x0048 }
            if (r2 == 0) goto L_0x00b5
            monitor-exit(r0)
            return
        L_0x00b5:
            java.util.ArrayList r2 = r9.b     // Catch:{ all -> 0x0048 }
            r2.clear()     // Catch:{ all -> 0x0048 }
            java.util.ArrayList r2 = r9.c     // Catch:{ all -> 0x0048 }
            r2.addAll(r3)     // Catch:{ all -> 0x0048 }
            boolean r2 = r9.d     // Catch:{ all -> 0x0048 }
            r9.b(r3, r2)     // Catch:{ all -> 0x0048 }
            java.util.Iterator r2 = r3.iterator()     // Catch:{ all -> 0x0048 }
            r4 = r5
            r6 = r4
        L_0x00ca:
            boolean r7 = r2.hasNext()     // Catch:{ all -> 0x0048 }
            if (r7 == 0) goto L_0x0110
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x0048 }
            jmd r6 = (defpackage.jmd) r6     // Catch:{ all -> 0x0048 }
            java.util.ArrayList r7 = r6.k     // Catch:{ all -> 0x0048 }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x0048 }
            r7 = r7 ^ r5
            if (r7 == 0) goto L_0x0106
            java.util.ArrayList r7 = r6.k     // Catch:{ all -> 0x0048 }
            boolean r8 = r7 instanceof java.util.Collection     // Catch:{ all -> 0x0048 }
            if (r8 == 0) goto L_0x00ec
            boolean r8 = r7.isEmpty()     // Catch:{ all -> 0x0048 }
            if (r8 == 0) goto L_0x00ec
            goto L_0x0104
        L_0x00ec:
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0048 }
        L_0x00f0:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0048 }
            if (r8 == 0) goto L_0x0104
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0048 }
            imd r8 = (defpackage.imd) r8     // Catch:{ all -> 0x0048 }
            r8.getClass()     // Catch:{ all -> 0x0048 }
            boolean r8 = r8 instanceof defpackage.ta4     // Catch:{ all -> 0x0048 }
            if (r8 != 0) goto L_0x00f0
            goto L_0x0106
        L_0x0104:
            r7 = r5
            goto L_0x0107
        L_0x0106:
            r7 = r1
        L_0x0107:
            androidx.fragment.app.a r6 = r6.c     // Catch:{ all -> 0x0048 }
            boolean r6 = r6.C0     // Catch:{ all -> 0x0048 }
            if (r6 != 0) goto L_0x010e
            r4 = r1
        L_0x010e:
            r6 = r7
            goto L_0x00ca
        L_0x0110:
            if (r6 == 0) goto L_0x0135
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0048 }
            r2.<init>()     // Catch:{ all -> 0x0048 }
            java.util.Iterator r6 = r3.iterator()     // Catch:{ all -> 0x0048 }
        L_0x011b:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0048 }
            if (r7 == 0) goto L_0x012d
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0048 }
            jmd r7 = (defpackage.jmd) r7     // Catch:{ all -> 0x0048 }
            java.util.ArrayList r7 = r7.k     // Catch:{ all -> 0x0048 }
            defpackage.u23.K(r7, r2)     // Catch:{ all -> 0x0048 }
            goto L_0x011b
        L_0x012d:
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0048 }
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x0135
            goto L_0x0136
        L_0x0135:
            r5 = r1
        L_0x0136:
            if (r4 != 0) goto L_0x013f
            r9.j(r3)     // Catch:{ all -> 0x0048 }
            r9.c(r3)     // Catch:{ all -> 0x0048 }
            goto L_0x0157
        L_0x013f:
            if (r5 == 0) goto L_0x0157
            r9.j(r3)     // Catch:{ all -> 0x0048 }
            int r2 = r3.size()     // Catch:{ all -> 0x0048 }
            r4 = r1
        L_0x0149:
            if (r4 >= r2) goto L_0x0157
            java.lang.Object r5 = r3.get(r4)     // Catch:{ all -> 0x0048 }
            jmd r5 = (defpackage.jmd) r5     // Catch:{ all -> 0x0048 }
            r9.a(r5)     // Catch:{ all -> 0x0048 }
            int r4 = r4 + 1
            goto L_0x0149
        L_0x0157:
            r9.d = r1     // Catch:{ all -> 0x0048 }
        L_0x0159:
            monitor-exit(r0)
            return
        L_0x015b:
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa4.e():void");
    }

    public final jmd f(a aVar) {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            jmd jmd = (jmd) obj;
            if (hhd.f(jmd.c, aVar) && !jmd.e) {
                break;
            }
        }
        return (jmd) obj;
    }

    public final jmd g(a aVar) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            jmd jmd = (jmd) obj;
            if (hhd.f(jmd.c, aVar) && !jmd.e) {
                break;
            }
        }
        return (jmd) obj;
    }

    public final void h() {
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                k();
                j(this.b);
                Iterator it = new ArrayList(this.c).iterator();
                while (it.hasNext()) {
                    jmd jmd = (jmd) it.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (!isAttachedToWindow) {
                            Objects.toString(this.a);
                        }
                        Objects.toString(jmd);
                    }
                    jmd.a(this.a);
                }
                Iterator it2 = new ArrayList(this.b).iterator();
                while (it2.hasNext()) {
                    jmd jmd2 = (jmd) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (!isAttachedToWindow) {
                            Objects.toString(this.a);
                        }
                        Objects.toString(jmd2);
                    }
                    jmd2.a(this.a);
                }
            } finally {
            }
        }
    }

    public final void i() {
        Object obj;
        synchronized (this.b) {
            try {
                k();
                ArrayList arrayList = this.b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    jmd jmd = (jmd) obj;
                    View view = jmd.c.Y0;
                    char c2 = 4;
                    if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                        int visibility = view.getVisibility();
                        if (visibility == 0) {
                            c2 = 2;
                        } else if (visibility != 4) {
                            if (visibility == 8) {
                                c2 = 3;
                            } else {
                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                            }
                        }
                    }
                    if (jmd.a == 2 && c2 != 2) {
                        break;
                    }
                }
                jmd jmd2 = (jmd) obj;
                this.e = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            jmd jmd = (jmd) arrayList.get(i);
            if (!jmd.h) {
                jmd.h = true;
                int i2 = jmd.b;
                e eVar = jmd.l;
                if (i2 == 2) {
                    a aVar = eVar.c;
                    View findFocus = aVar.Y0.findFocus();
                    if (findFocus != null) {
                        aVar.b0().k = findFocus;
                        if (Log.isLoggable("FragmentManager", 2)) {
                            findFocus.toString();
                            aVar.toString();
                        }
                    }
                    View W0 = jmd.c.W0();
                    if (W0.getParent() == null) {
                        eVar.b();
                        W0.setAlpha(0.0f);
                    }
                    if (W0.getAlpha() == 0.0f && W0.getVisibility() == 0) {
                        W0.setVisibility(4);
                    }
                    ex5 ex5 = aVar.b1;
                    W0.setAlpha(ex5 == null ? 1.0f : ex5.j);
                } else if (i2 == 3) {
                    a aVar2 = eVar.c;
                    View W02 = aVar2.W0();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(W02.findFocus());
                        W02.toString();
                        aVar2.toString();
                    }
                    W02.clearFocus();
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u23.K(((jmd) it.next()).k, arrayList2);
        }
        List s0 = o23.s0(o23.w0(arrayList2));
        int size2 = s0.size();
        for (int i3 = 0; i3 < size2; i3++) {
            imd imd = (imd) s0.get(i3);
            if (!imd.a) {
                imd.d(this.a);
            }
            imd.a = true;
        }
    }

    public final void k() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            jmd jmd = (jmd) it.next();
            int i = 2;
            if (jmd.b == 2) {
                int visibility = jmd.c.W0().getVisibility();
                if (visibility != 0) {
                    i = 4;
                    if (visibility != 4) {
                        if (visibility == 8) {
                            i = 3;
                        } else {
                            throw new IllegalArgumentException(wn6.h(visibility, "Unknown visibility "));
                        }
                    }
                }
                jmd.d(i, 1);
            }
        }
    }
}
