package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: di3  reason: default package */
public final class di3 implements moa {
    public static final EnumSet r;
    public static final Set s;
    public static final bs t;
    public static final Set u;
    public static final Set v;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final CopyOnWriteArraySet c = new CopyOnWriteArraySet();
    public final Object d = new Object();
    public volatile boolean e = false;
    public final nj4 f;
    public final tt0 g;
    public final g2b h;
    public final nj4 i;
    public final nj4 j;
    public final nj4 k;
    public final nj4 l;
    public final qmc m;
    public final lne n;
    public final nj4 o;
    public final CopyOnWriteArraySet p = new CopyOnWriteArraySet();
    public ap3 q = null;

    static {
        mi3 mi3 = mi3.b;
        mi3 mi32 = mi3.a;
        r = EnumSet.of(mi3, mi32);
        s = Collections.singleton(mi32);
        li3 li3 = li3.b;
        li3 li32 = li3.a;
        t = kjd.d(new li3[]{null, li3, li32});
        u = Collections.singleton(li32);
        v = Collections.singleton(li3);
    }

    public di3(nj4 nj4, tt0 tt0, g2b g2b, nj4 nj42, nj4 nj43, nj4 nj44, nj4 nj45, qmc qmc, lne lne, nj4 nj46) {
        this.f = nj4;
        this.g = tt0;
        this.h = g2b;
        this.i = nj42;
        this.j = nj43;
        this.k = nj44;
        this.l = nj45;
        this.m = qmc;
        this.n = lne;
        this.o = nj46;
    }

    public final void a(ArrayList arrayList) {
        udd.q("ContactController", "onPhonebookUpdated");
        y(arrayList);
    }

    public final void b() {
        if (!this.e) {
            synchronized (this.d) {
                try {
                    if (!this.e) {
                        n();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final tf3 c(long j2, of3 of3) {
        b();
        boolean z = false;
        tf3 i2 = i(j2, false);
        if (i2 == null) {
            ((g15) this.i.get()).c(new Exception("contact is null"), true);
            return null;
        }
        oi3 oi3 = i2.a;
        gi3 c2 = oi3.c.c();
        try {
            of3.accept(c2);
            ni3 a2 = c2.a();
            if (a2.a == ((j2b) this.h).a.s()) {
                z = true;
            }
            tf3 tf3 = new tf3(new oi3(oi3.b, a2), z, (w6a) this.j.get());
            q(j2, tf3, false, true);
            uq7 uq7 = new uq7(1);
            uq7.f(j2, tf3);
            f(uq7);
            return tf3;
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public final void d(long j2, String str, String str2) {
        j2b j2b = (j2b) this.h;
        j2b.a.l("user.deviceAvatarPath", (String) null);
        long s2 = j2b.a.s();
        c(s2, new b52((Object) str, (Object) str2, j2, 3));
        this.g.c(new lp3(s2));
    }

    public final void e() {
        if (this.e && !this.a.isEmpty()) {
            for (tf3 tf3 : this.a.values()) {
                tf3.b = null;
                tf3.c = null;
                tf3.o = null;
            }
            this.g.c(new lp3((Collection) this.a.keySet()));
        }
    }

    public final void f(uq7 uq7) {
        ap3 ap3 = this.q;
        if (ap3 != null && uq7.h() != 0) {
            int h2 = uq7.h();
            for (int i2 = 0; i2 < h2; i2++) {
                long e2 = uq7.e(i2);
                tf3 tf3 = (tf3) uq7.i(i2);
                if (e2 > 0) {
                    ((mc9) ap3.e.computeIfAbsent(Long.valueOf(e2), new di(8, new yo3(ap3, e2, 0)))).setValue(tf3);
                }
            }
        }
    }

    public final boolean g(long j2) {
        tf3 i2 = i(j2, false);
        return i2 != null && i2.c();
    }

    public final tf3 h(long j2, boolean z) {
        tf3 tf3 = (tf3) this.a.get(Long.valueOf(j2));
        if (tf3 != null || !z) {
            return tf3;
        }
        tf3 b2 = tf3.b(j2, ((j2b) this.h).a.m(), (w6a) this.j.get());
        q(j2, b2, true, true);
        return b2;
    }

    public final tf3 i(long j2, boolean z) {
        tf3 tf3;
        if (j2 > 0 && ((tf3 = (tf3) this.a.get(Long.valueOf(j2))) == null || tf3.a.b == 0 || tf3.w())) {
            b();
        }
        return h(j2, z);
    }

    public final List j(Set set, Set set2) {
        tf3 i2 = i(((j2b) this.h).a.s(), false);
        ArrayList arrayList = null;
        for (tf3 tf3 : this.a.values()) {
            if (!(i2 == null || tf3 == i2 || !set.contains(tf3.a.c.k))) {
                if (set2 == null || set2.contains(tf3.a.c.i)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(tf3);
                }
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public final List k() {
        return j(s, (Set) null);
    }

    public final void l() {
        b();
        ConcurrentHashMap concurrentHashMap = this.a;
        if (!concurrentHashMap.isEmpty()) {
            for (tf3 tf3 : concurrentHashMap.values()) {
                w6a w6a = (w6a) this.j.get();
                boolean z = true;
                boolean z2 = tf3.b != null;
                boolean z3 = tf3.c != null;
                if (tf3.o == null) {
                    z = false;
                }
                tf3.b = null;
                tf3.c = null;
                tf3.o = null;
                if (z2) {
                    tf3.b = w6a.j.b(0, tf3.d());
                }
                if (z3) {
                    tf3.l(w6a);
                }
                if (z) {
                    tf3.m();
                }
            }
            this.g.c(new lp3((Collection) concurrentHashMap.keySet()));
        }
    }

    public final boolean m(long j2) {
        b();
        if (j2 <= 0 || j2 == -1) {
            return false;
        }
        g2b g2b = this.h;
        if (j2 == ((j2b) g2b).a.s()) {
            return false;
        }
        tf3 h2 = h(j2, false);
        if (e07.A(h2)) {
            return true;
        }
        if (h2.c()) {
            return false;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        j2b j2b = (j2b) g2b;
        yzc yzc = j2b.b;
        yzc.getClass();
        return j2b.a.m() - timeUnit.toMillis(yzc.o(PmsKey.f90noncontactsynctime, TimeUnit.HOURS.toSeconds(24))) >= h2.a.c.s;
    }

    /* JADX INFO: finally extract failed */
    public final void n() {
        if (!this.e) {
            this.n.getClass();
            lne.a("ContactController.load()");
            udd.q("ContactController", "contacts loading started");
            long currentTimeMillis = System.currentTimeMillis();
            this.n.getClass();
            lne.a("ContactController.selectContacts()");
            uq7 uq7 = new uq7(32);
            ydc ydc = ((hz3) ((a04) this.f.get())).d;
            do3 x = ydc.x();
            x.getClass();
            pec a2 = pec.a(0, "SELECT * FROM contacts ORDER BY presence ASC");
            aec aec = x.a;
            aec.b();
            Cursor o2 = aec.o(a2, (CancellationSignal) null);
            try {
                int o3 = gp0.o(o2, ApiProtocol.KEY_ID);
                int o4 = gp0.o(o2, "server_id");
                int o5 = gp0.o(o2, "presence");
                int o6 = gp0.o(o2, "presence_type");
                int o7 = gp0.o(o2, "data");
                ArrayList arrayList = new ArrayList(o2.getCount());
                while (o2.moveToNext()) {
                    arrayList.add(new ij3(o2.getLong(o3), o2.getLong(o4), o2.getInt(o5), o2.getInt(o6), ni3.b(o2.isNull(o7) ? null : o2.getBlob(o7))));
                }
                o2.close();
                a2.m();
                ArrayList arrayList2 = new ArrayList(q23.H(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ij3 ij3 = (ij3) it.next();
                    ConcurrentHashMap concurrentHashMap = ((l16) ((r7e) ydc.o).getValue()).a;
                    long j2 = ij3.a;
                    ni3 ni3 = ij3.e;
                    concurrentHashMap.put(Long.valueOf(j2), Integer.valueOf(ni3.f.hashCode()));
                    arrayList2.add(new oi3(ij3.a, ni3, new l2b(ij3.d, ij3.c)));
                }
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean z = true;
                    if (!it2.hasNext()) {
                        break;
                    }
                    oi3 oi3 = (oi3) it2.next();
                    long j3 = oi3.c.a;
                    if (j3 != ((j2b) this.h).a.s()) {
                        z = false;
                    }
                    tf3 tf3 = new tf3(oi3, z, (w6a) this.j.get());
                    uq7.f(j3, tf3);
                    q(tf3.n(), tf3, false, false);
                    q2b q2b = (q2b) this.k.get();
                    q2b.getClass();
                    q2b.d().f(tf3.n(), oi3.o);
                }
                Trace.endSection();
                this.e = true;
                fn6 fn6 = udd.e;
                if (fn6 != null && fn6.c()) {
                    tn7 tn7 = tn7.X;
                    fn6.d(tn7, "ContactController", "contacts loaded in " + (System.currentTimeMillis() - currentTimeMillis) + "ms", (Throwable) null);
                }
                this.n.getClass();
                Trace.endSection();
                f(uq7);
            } catch (Throwable th) {
                o2.close();
                a2.m();
                throw th;
            }
        }
    }

    public final void o(long j2) {
        udd.q("ContactController", "markAsNotFoundContact, id = " + j2);
        c(j2, new ak0(26));
        nm3 nm3 = new nm3(Collections.singletonList(Long.valueOf(j2)));
        tt0 tt0 = this.g;
        tt0.c(nm3);
        tt0.c(new lp3(j2));
    }

    public final void p(ArrayList arrayList) {
        udd.q("ContactController", "onLogin start");
        u(arrayList);
        udd.q("ContactController", "onLogin finished");
    }

    public final void q(long j2, tf3 tf3, boolean z, boolean z2) {
        nj4 nj4 = this.f;
        if (z && j2 != 0) {
            b();
        }
        this.a.put(Long.valueOf(j2), tf3);
        boolean p2 = r1g.p(tf3.a.c.p);
        ConcurrentHashMap concurrentHashMap = this.b;
        if (!p2) {
            concurrentHashMap.put(Long.valueOf(j2), tf3);
        } else {
            concurrentHashMap.remove(Long.valueOf(j2));
        }
        if (z2 && !tf3.w()) {
            try {
                ((hz3) ((a04) nj4.get())).a();
                x(tf3.a.b, tf3);
                ((hz3) ((a04) nj4.get())).c();
            } finally {
                ((hz3) ((a04) nj4.get())).b();
            }
        }
        Iterator it = this.p.iterator();
        if (it.hasNext()) {
            hr1.r(it.next());
            throw null;
        }
    }

    public final void r(long j2, boolean z) {
        udd.q("ContactController", "setShowBlockPanel, id = " + j2 + ", show = " + z);
        c(j2, new bi3(z ^ true));
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e5 A[Catch:{ all -> 0x009b }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x006a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(java.util.List r17, long[] r18) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            nj4 r8 = r0.j
            nj4 r9 = r0.f
            r10 = 0
            if (r7 == 0) goto L_0x0046
            int r1 = r7.length
            if (r1 != 0) goto L_0x000f
            goto L_0x0046
        L_0x000f:
            bs r1 = new bs
            int r2 = r7.length
            r1.<init>(r2)
            int r2 = r7.length
            r3 = r10
        L_0x0017:
            if (r3 >= r2) goto L_0x0025
            r4 = r7[r3]
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.add(r4)
            int r3 = r3 + 1
            goto L_0x0017
        L_0x0025:
            java.util.Iterator r2 = r17.iterator()
        L_0x0029:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x003f
            java.lang.Object r3 = r2.next()
            uj3 r3 = (defpackage.uj3) r3
            long r3 = r3.a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.remove(r3)
            goto L_0x0029
        L_0x003f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
        L_0x0044:
            r11 = r2
            goto L_0x004b
        L_0x0046:
            java.util.List r2 = java.util.Collections.emptyList()
            goto L_0x0044
        L_0x004b:
            boolean r1 = r11.isEmpty()
            if (r1 != 0) goto L_0x0123
            g2b r1 = r0.h
            j2b r1 = (defpackage.j2b) r1
            i03 r1 = r1.a
            long r12 = r1.m()
            java.lang.Object r1 = r9.get()     // Catch:{ all -> 0x009b }
            a04 r1 = (defpackage.a04) r1     // Catch:{ all -> 0x009b }
            hz3 r1 = (defpackage.hz3) r1     // Catch:{ all -> 0x009b }
            r1.a()     // Catch:{ all -> 0x009b }
            java.util.Iterator r14 = r11.iterator()     // Catch:{ all -> 0x009b }
        L_0x006a:
            boolean r1 = r14.hasNext()     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x00ee
            java.lang.Object r1 = r14.next()     // Catch:{ all -> 0x009b }
            r15 = r1
            java.lang.Long r15 = (java.lang.Long) r15     // Catch:{ all -> 0x009b }
            long r1 = r15.longValue()     // Catch:{ all -> 0x009b }
            tf3 r1 = r0.i(r1, r10)     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x009e
            oi3 r1 = r1.a     // Catch:{ all -> 0x009b }
            long r1 = r1.b     // Catch:{ all -> 0x009b }
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x008c
            goto L_0x009e
        L_0x008c:
            long r1 = r15.longValue()     // Catch:{ all -> 0x009b }
            f00 r3 = new f00     // Catch:{ all -> 0x009b }
            r4 = 12
            r3.<init>(r12, r4)     // Catch:{ all -> 0x009b }
            r0.c(r1, r3)     // Catch:{ all -> 0x009b }
            goto L_0x00db
        L_0x009b:
            r0 = move-exception
            goto L_0x0117
        L_0x009e:
            long r1 = r15.longValue()     // Catch:{ all -> 0x009b }
            java.lang.Object r3 = r8.get()     // Catch:{ all -> 0x009b }
            w6a r3 = (w6a) r3     // Catch:{ all -> 0x009b }
            tf3 r1 = defpackage.tf3.a(r1, r12, r3)     // Catch:{ all -> 0x009b }
            oi3 r1 = r1.a
            java.lang.Object r2 = r9.get()     // Catch:{ all -> 0x009b }
            a04 r2 = (defpackage.a04) r2     // Catch:{ all -> 0x009b }
            hz3 r2 = (defpackage.hz3) r2     // Catch:{ all -> 0x009b }
            ydc r2 = r2.d     // Catch:{ all -> 0x009b }
            ni3 r3 = r1.c     // Catch:{ all -> 0x009b }
            long r2 = r2.C(r3)     // Catch:{ all -> 0x009b }
            tf3 r4 = new tf3     // Catch:{ all -> 0x009b }
            oi3 r5 = new oi3     // Catch:{ all -> 0x009b }
            ni3 r1 = r1.c     // Catch:{ all -> 0x009b }
            r5.<init>(r2, r1)     // Catch:{ all -> 0x009b }
            java.lang.Object r1 = r8.get()     // Catch:{ all -> 0x009b }
            w6a r1 = (w6a) r1     // Catch:{ all -> 0x009b }
            r4.<init>(r5, r10, r1)     // Catch:{ all -> 0x009b }
            long r2 = r15.longValue()     // Catch:{ all -> 0x009b }
            r5 = 1
            r6 = 1
            r1 = r16
            r1.q(r2, r4, r5, r6)     // Catch:{ all -> 0x009b }
        L_0x00db:
            long r1 = r15.longValue()     // Catch:{ all -> 0x009b }
            tf3 r1 = r0.i(r1, r10)     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x006a
            r2 = 0
            r1.b = r2     // Catch:{ all -> 0x009b }
            r1.c = r2     // Catch:{ all -> 0x009b }
            r1.o = r2     // Catch:{ all -> 0x009b }
            goto L_0x006a
        L_0x00ee:
            java.lang.Object r1 = r9.get()     // Catch:{ all -> 0x009b }
            a04 r1 = (defpackage.a04) r1     // Catch:{ all -> 0x009b }
            hz3 r1 = (defpackage.hz3) r1     // Catch:{ all -> 0x009b }
            r1.c()     // Catch:{ all -> 0x009b }
            java.lang.Object r1 = r9.get()
            a04 r1 = (defpackage.a04) r1
            hz3 r1 = (defpackage.hz3) r1
            r1.b()
            nm3 r1 = new nm3
            r1.<init>(r11)
            tt0 r2 = r0.g
            r2.c(r1)
            lp3 r1 = new lp3
            r1.<init>((java.util.Collection) r11)
            r2.c(r1)
            goto L_0x0123
        L_0x0117:
            java.lang.Object r1 = r9.get()
            a04 r1 = (defpackage.a04) r1
            hz3 r1 = (defpackage.hz3) r1
            r1.b()
            throw r0
        L_0x0123:
            if (r7 == 0) goto L_0x0160
            boolean r1 = r17.isEmpty()
            if (r1 == 0) goto L_0x012c
            goto L_0x0160
        L_0x012c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r17.iterator()
        L_0x013a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0156
            java.lang.Object r4 = r3.next()
            uj3 r4 = (defpackage.uj3) r4
            long r5 = r4.a
            boolean r5 = r0.g(r5)
            if (r5 == 0) goto L_0x0152
            r1.add(r4)
            goto L_0x013a
        L_0x0152:
            r2.add(r4)
            goto L_0x013a
        L_0x0156:
            mi3 r3 = defpackage.mi3.a
            r0.t(r1, r3)
            mi3 r1 = defpackage.mi3.b
            r0.t(r2, r1)
        L_0x0160:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.di3.s(java.util.List, long[]):void");
    }

    public final List t(List list, mi3 mi3) {
        tf3 tf3;
        mi3 mi32 = mi3;
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        b();
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, "ContactController", "storeContactsFromServer, size = " + list.size() + ", type = " + mi32, (Throwable) null);
        }
        ((hz3) ((a04) this.f.get())).a();
        long m2 = ((j2b) this.h).a.m();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            yzc yzc = ((j2b) this.h).b;
            yzc.getClass();
            List list2 = list;
            List<ni3> D = am7.D(list2, new zx1(18, this), new zx1(18, this), mi3, timeUnit.toMillis(yzc.o(PmsKey.f90noncontactsynctime, TimeUnit.HOURS.toSeconds(24))), m2);
            uq7 uq7 = new uq7(D.size());
            ArrayList arrayList = new ArrayList(D.size());
            for (ni3 ni3 : D) {
                boolean z = false;
                tf3 i2 = i(ni3.a, false);
                if (ni3.a == ((j2b) this.h).a.s()) {
                    z = true;
                }
                if (i2 != null) {
                    long j2 = i2.a.b;
                    if (j2 != 0) {
                        tf3 = new tf3(new oi3(j2, ni3), z, (w6a) this.j.get());
                        tf3 tf32 = tf3;
                        q(tf32.n(), tf32, true, true);
                        uq7.f(tf32.n(), tf32);
                        arrayList.add(Long.valueOf(ni3.a));
                    }
                }
                tf3 = new tf3(new oi3(((hz3) ((a04) this.f.get())).d.C(ni3), ni3), z, (w6a) this.j.get());
                tf3 tf322 = tf3;
                q(tf322.n(), tf322, true, true);
                uq7.f(tf322.n(), tf322);
                arrayList.add(Long.valueOf(ni3.a));
            }
            if (mi32 == mi3.a) {
                w(list);
            }
            ((hz3) ((a04) this.f.get())).c();
            f(uq7);
            ((hz3) ((a04) this.f.get())).b();
            return arrayList;
        } catch (Throwable th) {
            ((hz3) ((a04) this.f.get())).b();
            throw th;
        }
    }

    public final void u(List list) {
        if (!list.isEmpty()) {
            List t2 = t(list, mi3.a);
            nj4 nj4 = this.o;
            if (nj4.get() != null) {
                b92 b92 = (b92) ((v72) nj4.get());
                qod qod = b92.L0;
                if (qod != null) {
                    qod.cancel((CancellationException) null);
                }
                y82 y82 = new y82(b92, (Continuation) null);
                b92.L0 = xs7.E(b92.Z, b92.Y, (ru3) null, y82, 2);
            }
            this.g.c(new lp3((Collection) t2));
        }
    }

    public final void v(List list) {
        if (!list.isEmpty()) {
            List t2 = t(list, mi3.b);
            nj4 nj4 = this.o;
            if (nj4.get() != null) {
                b92 b92 = (b92) ((v72) nj4.get());
                qod qod = b92.L0;
                if (qod != null) {
                    qod.cancel((CancellationException) null);
                }
                y82 y82 = new y82(b92, (Continuation) null);
                b92.L0 = xs7.E(b92.Z, b92.Y, (ru3) null, y82, 2);
            }
            this.g.c(new lp3((Collection) t2));
        }
    }

    public final void w(List list) {
        j2b j2b = (j2b) this.h;
        long j2 = j2b.a.g.getLong("user.contactsLastSync", 0);
        nu7 nu7 = am7.c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j2 = Math.max(j2, ((uj3) it.next()).b);
        }
        j2b.a.k("user.contactsLastSync", Long.valueOf(j2));
    }

    public final void x(long j2, tf3 tf3) {
        ydc ydc = ((hz3) ((a04) this.f.get())).d;
        ni3 ni3 = tf3.a.c;
        do3 x = ydc.x();
        ConcurrentHashMap concurrentHashMap = ((l16) ((r7e) ydc.o).getValue()).a;
        x.getClass();
        if (!ni3.a() || ni3.j != 0) {
            aec aec = x.a;
            aec.b();
            th thVar = x.c;
            yz5 f2 = thVar.f();
            f2.j(1, ni3.a);
            f2.k(2, ni3.d());
            f2.j(3, j2);
            try {
                aec.c();
                f2.n();
                aec.r();
                aec.l();
                thVar.u(f2);
                x.c(ni3, concurrentHashMap);
            } catch (Throwable th) {
                thVar.u(f2);
                throw th;
            }
        }
    }

    public final Set y(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return Collections.emptySet();
        }
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, "ContactController", "updateWithPhoneBookData = " + arrayList.size(), (Throwable) null);
        }
        List j2 = j(r, t);
        nu7 nu7 = am7.c;
        HashMap hashMap = new HashMap();
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ioa ioa = (ioa) it.next();
                Iterator it2 = j2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    tf3 tf3 = (tf3) it2.next();
                    if (tf3.o() > 0 && ioa.Y > 0 && tf3.o() == ioa.Y) {
                        hashMap.put(Long.valueOf(tf3.n()), ioa);
                        break;
                    }
                }
            }
        }
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                c(((Long) entry.getKey()).longValue(), new zx1(17, (ioa) entry.getValue()));
            }
            this.g.c(new lp3((Collection) hashMap.keySet()));
        }
        return hashMap.keySet();
    }
}
