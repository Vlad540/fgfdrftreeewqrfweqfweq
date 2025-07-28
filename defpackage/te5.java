package defpackage;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Set;

/* renamed from: te5  reason: default package */
public final class te5 implements SharedPreferences.Editor {
    public final HashMap a = new HashMap();
    public final Object b = new Object();
    public boolean c;
    public final /* synthetic */ ue5 d;

    public te5(ue5 ue5) {
        this.d = ue5;
    }

    public final void apply() {
        e3 e3Var = this.d.b;
        if (e3Var != null) {
            e3Var.e("apply");
        }
        commit();
    }

    public final SharedPreferences.Editor clear() {
        synchronized (this.b) {
            this.c = true;
        }
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x011d A[Catch:{ all -> 0x00b9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean commit() {
        /*
            r19 = this;
            r0 = r19
            ue5 r1 = r0.d
            e3 r1 = r1.b
            if (r1 == 0) goto L_0x000d
            java.lang.String r2 = "commit"
            r1.e(r2)
        L_0x000d:
            ue5 r1 = r0.d
            java.lang.Object r2 = r1.g
            monitor-enter(r2)
            jc9 r3 = new jc9     // Catch:{ all -> 0x014f }
            jc9 r4 = r1.d     // Catch:{ all -> 0x014f }
            int r4 = r4.e     // Catch:{ all -> 0x014f }
            r3.<init>(r4)     // Catch:{ all -> 0x014f }
            jc9 r4 = r1.d     // Catch:{ all -> 0x014f }
            java.lang.Object[] r5 = r4.b     // Catch:{ all -> 0x014f }
            java.lang.Object[] r6 = r4.c     // Catch:{ all -> 0x014f }
            long[] r4 = r4.a     // Catch:{ all -> 0x014f }
            int r7 = r4.length     // Catch:{ all -> 0x014f }
            int r7 = r7 + -2
            if (r7 < 0) goto L_0x0063
            r9 = 0
        L_0x0029:
            r10 = r4[r9]     // Catch:{ all -> 0x014f }
            long r12 = ~r10     // Catch:{ all -> 0x014f }
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L_0x005e
            int r12 = r9 - r7
            int r12 = ~r12     // Catch:{ all -> 0x014f }
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L_0x0043:
            if (r14 >= r12) goto L_0x005c
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L_0x0058
            int r15 = r9 << 3
            int r15 = r15 + r14
            r8 = r5[r15]     // Catch:{ all -> 0x014f }
            r15 = r6[r15]     // Catch:{ all -> 0x014f }
            r3.k(r8, r15)     // Catch:{ all -> 0x014f }
        L_0x0058:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L_0x0043
        L_0x005c:
            if (r12 != r13) goto L_0x0063
        L_0x005e:
            if (r9 == r7) goto L_0x0063
            int r9 = r9 + 1
            goto L_0x0029
        L_0x0063:
            kc9 r4 = new kc9     // Catch:{ all -> 0x014f }
            t97 r5 = r1.f     // Catch:{ all -> 0x014f }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x014f }
            java.util.WeakHashMap r5 = (java.util.WeakHashMap) r5     // Catch:{ all -> 0x014f }
            java.util.Set r5 = r5.keySet()     // Catch:{ all -> 0x014f }
            int r5 = r5.size()     // Catch:{ all -> 0x014f }
            r4.<init>(r5)     // Catch:{ all -> 0x014f }
            t97 r5 = r1.f     // Catch:{ all -> 0x014f }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x014f }
            java.util.WeakHashMap r5 = (java.util.WeakHashMap) r5     // Catch:{ all -> 0x014f }
            java.util.Set r5 = r5.keySet()     // Catch:{ all -> 0x014f }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x014f }
        L_0x0088:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x014f }
            if (r6 == 0) goto L_0x009b
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x014f }
            int r7 = r4.c(r6)     // Catch:{ all -> 0x014f }
            java.lang.Object[] r8 = r4.b     // Catch:{ all -> 0x014f }
            r8[r7] = r6     // Catch:{ all -> 0x014f }
            goto L_0x0088
        L_0x009b:
            java.lang.Object r5 = r0.b     // Catch:{ all -> 0x014f }
            monitor-enter(r5)     // Catch:{ all -> 0x014f }
            int r6 = r4.d     // Catch:{ all -> 0x00b9 }
            r7 = 1
            if (r6 == 0) goto L_0x00a5
            r6 = r7
            goto L_0x00a6
        L_0x00a5:
            r6 = 0
        L_0x00a6:
            ec9 r8 = new ec9     // Catch:{ all -> 0x00b9 }
            r8.<init>()     // Catch:{ all -> 0x00b9 }
            boolean r9 = r0.c     // Catch:{ all -> 0x00b9 }
            if (r9 == 0) goto L_0x00d1
            e3 r9 = r1.b     // Catch:{ all -> 0x00b9 }
            if (r9 == 0) goto L_0x00bc
            java.lang.String r10 = "commit: is cleared"
            r9.e(r10)     // Catch:{ all -> 0x00b9 }
            goto L_0x00bc
        L_0x00b9:
            r0 = move-exception
            goto L_0x0151
        L_0x00bc:
            int r9 = r3.e     // Catch:{ all -> 0x00b9 }
            if (r9 == 0) goto L_0x00c8
            r3.a()     // Catch:{ all -> 0x00b9 }
            r10 = r7
            r16 = r10
            r9 = 0
            goto L_0x00cc
        L_0x00c8:
            r9 = 0
            r10 = 0
            r16 = 0
        L_0x00cc:
            r0.c = r9     // Catch:{ all -> 0x00b9 }
            r9 = r16
            goto L_0x00d3
        L_0x00d1:
            r9 = 0
            r10 = r9
        L_0x00d3:
            java.util.HashMap r11 = r0.a     // Catch:{ all -> 0x00b9 }
            java.util.Set r11 = r11.entrySet()     // Catch:{ all -> 0x00b9 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x00b9 }
        L_0x00dd:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x00b9 }
            if (r12 == 0) goto L_0x0122
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x00b9 }
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ all -> 0x00b9 }
            java.lang.Object r13 = r12.getKey()     // Catch:{ all -> 0x00b9 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x00b9 }
            java.lang.Object r12 = r12.getValue()     // Catch:{ all -> 0x00b9 }
            if (r13 == 0) goto L_0x00dd
            if (r12 == r0) goto L_0x0111
            if (r12 != 0) goto L_0x00fa
            goto L_0x0111
        L_0x00fa:
            boolean r14 = r3.b(r13)     // Catch:{ all -> 0x00b9 }
            if (r14 == 0) goto L_0x010d
            java.lang.Object r14 = r3.f(r13)     // Catch:{ all -> 0x00b9 }
            if (r14 == 0) goto L_0x010d
            boolean r14 = r14.equals(r12)     // Catch:{ all -> 0x00b9 }
            if (r14 == 0) goto L_0x010d
            goto L_0x00dd
        L_0x010d:
            r3.k(r13, r12)     // Catch:{ all -> 0x00b9 }
            goto L_0x011b
        L_0x0111:
            boolean r12 = r3.b(r13)     // Catch:{ all -> 0x00b9 }
            if (r12 != 0) goto L_0x0118
            goto L_0x00dd
        L_0x0118:
            r3.i(r13)     // Catch:{ all -> 0x00b9 }
        L_0x011b:
            if (r6 == 0) goto L_0x0120
            r8.b(r13)     // Catch:{ all -> 0x00b9 }
        L_0x0120:
            r10 = r7
            goto L_0x00dd
        L_0x0122:
            java.util.HashMap r0 = r0.a     // Catch:{ all -> 0x00b9 }
            r0.clear()     // Catch:{ all -> 0x00b9 }
            if (r10 == 0) goto L_0x0143
            e3 r0 = r1.b     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x0132
            java.lang.String r6 = "commit: has changes"
            r0.e(r6)     // Catch:{ all -> 0x00b9 }
        L_0x0132:
            r1.d = r3     // Catch:{ all -> 0x00b9 }
            r7e r0 = r1.e     // Catch:{ all -> 0x00b9 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x00b9 }
            ye5 r0 = (defpackage.ye5) r0     // Catch:{ all -> 0x00b9 }
            r0.a(r3)     // Catch:{ all -> 0x00b9 }
            r1.a(r4, r9, r8)     // Catch:{ all -> 0x00b9 }
            goto L_0x014c
        L_0x0143:
            e3 r0 = r1.b     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x014c
            java.lang.String r1 = "commit: no changes"
            r0.e(r1)     // Catch:{ all -> 0x00b9 }
        L_0x014c:
            monitor-exit(r5)     // Catch:{ all -> 0x014f }
            monitor-exit(r2)
            return r7
        L_0x014f:
            r0 = move-exception
            goto L_0x0153
        L_0x0151:
            monitor-exit(r5)     // Catch:{ all -> 0x014f }
            throw r0     // Catch:{ all -> 0x014f }
        L_0x0153:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te5.commit():boolean");
    }

    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        synchronized (this.b) {
            this.a.put(str, Boolean.valueOf(z));
        }
        return this;
    }

    public final SharedPreferences.Editor putFloat(String str, float f) {
        synchronized (this.b) {
            this.a.put(str, Float.valueOf(f));
        }
        return this;
    }

    public final SharedPreferences.Editor putInt(String str, int i) {
        synchronized (this.b) {
            this.a.put(str, Integer.valueOf(i));
        }
        return this;
    }

    public final SharedPreferences.Editor putLong(String str, long j) {
        synchronized (this.b) {
            this.a.put(str, Long.valueOf(j));
        }
        return this;
    }

    public final SharedPreferences.Editor putString(String str, String str2) {
        synchronized (this.b) {
            this.a.put(str, str2);
        }
        return this;
    }

    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        synchronized (this.b) {
            this.a.put(str, set);
        }
        return this;
    }

    public final SharedPreferences.Editor remove(String str) {
        synchronized (this.b) {
            this.a.put(str, this);
        }
        return this;
    }
}
