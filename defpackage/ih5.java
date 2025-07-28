package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Base64;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ih5  reason: default package */
public final class ih5 {
    public static final Object j = new Object();
    public static final yr k = new kgd(0);
    public final Context a;
    public final String b;
    public final rh5 c;
    public final l83 d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final v97 g;
    public final jib h;
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r12v2, types: [f83, l83, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:51|52|105) */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r3.remove();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x01ce */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ih5(android.content.Context r11, java.lang.String r12, defpackage.rh5 r13) {
        /*
            r10 = this;
            r0 = 1
            r10.<init>()
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = 0
            r1.<init>(r2)
            r10.e = r1
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>()
            r10.f = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r10.i = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r10.a = r11
            defpackage.a24.k(r12)
            r10.b = r12
            r10.c = r13
            sa0 r12 = com.google.firebase.provider.FirebaseInitProvider.a
            java.lang.String r1 = "Firebase"
            android.os.Trace.beginSection(r1)
            java.lang.String r1 = "ComponentDiscovery"
            android.os.Trace.beginSection(r1)
            java.lang.Class<com.google.firebase.components.ComponentDiscoveryService> r1 = com.google.firebase.components.ComponentDiscoveryService.class
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
            android.content.pm.PackageManager r5 = r11.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0056 }
            if (r5 != 0) goto L_0x0043
            goto L_0x0056
        L_0x0043:
            android.content.ComponentName r6 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0056 }
            r6.<init>(r11, r1)     // Catch:{ NameNotFoundException -> 0x0056 }
            r7 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r5 = r5.getServiceInfo(r6, r7)     // Catch:{ NameNotFoundException -> 0x0056 }
            if (r5 != 0) goto L_0x0054
            java.util.Objects.toString(r1)     // Catch:{ NameNotFoundException -> 0x0056 }
            goto L_0x0056
        L_0x0054:
            android.os.Bundle r4 = r5.metaData     // Catch:{ NameNotFoundException -> 0x0056 }
        L_0x0056:
            if (r4 != 0) goto L_0x005d
            java.util.List r1 = java.util.Collections.emptyList()
            goto L_0x0094
        L_0x005d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Set r5 = r4.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x006a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0094
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r4.get(r6)
            java.lang.String r8 = "com.google.firebase.components.ComponentRegistrar"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x006a
            java.lang.String r7 = "com.google.firebase.components:"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x006a
            r7 = 31
            java.lang.String r6 = r6.substring(r7)
            r1.add(r6)
            goto L_0x006a
        L_0x0094:
            java.util.Iterator r1 = r1.iterator()
        L_0x0098:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00ad
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            h83 r5 = new h83
            r5.<init>(r2, r4)
            r3.add(r5)
            goto L_0x0098
        L_0x00ad:
            android.os.Trace.endSection()
            java.lang.String r1 = "Runtime"
            android.os.Trace.beginSection(r1)
            xte r1 = defpackage.xte.a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.addAll(r3)
            com.google.firebase.FirebaseCommonRegistrar r3 = new com.google.firebase.FirebaseCommonRegistrar
            r3.<init>()
            h83 r5 = new h83
            r5.<init>(r0, r3)
            r1.add(r5)
            com.google.firebase.concurrent.ExecutorsRegistrar r3 = new com.google.firebase.concurrent.ExecutorsRegistrar
            r3.<init>()
            h83 r5 = new h83
            r5.<init>(r0, r3)
            r1.add(r5)
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            java.lang.Class[] r5 = new java.lang.Class[r2]
            t73 r3 = defpackage.t73.b(r11, r3, r5)
            r4.add(r3)
            java.lang.Class<ih5> r3 = defpackage.ih5.class
            java.lang.Class[] r5 = new java.lang.Class[r2]
            t73 r3 = defpackage.t73.b(r10, r3, r5)
            r4.add(r3)
            java.lang.Class<rh5> r3 = defpackage.rh5.class
            java.lang.Class[] r5 = new java.lang.Class[r2]
            t73 r13 = defpackage.t73.b(r13, r3, r5)
            r4.add(r13)
            lk9 r13 = new lk9
            r13.<init>()
            boolean r3 = defpackage.dze.a(r11)
            if (r3 == 0) goto L_0x011d
            java.util.concurrent.atomic.AtomicBoolean r3 = com.google.firebase.provider.FirebaseInitProvider.b
            boolean r3 = r3.get()
            if (r3 == 0) goto L_0x011d
            java.lang.Class<sa0> r3 = defpackage.sa0.class
            java.lang.Class[] r5 = new java.lang.Class[r2]
            t73 r12 = defpackage.t73.b(r12, r3, r5)
            r4.add(r12)
        L_0x011d:
            l83 r12 = new l83
            xte r3 = defpackage.xte.a
            r12.<init>()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r12.a = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r12.b = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r12.c = r3
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r12.d = r3
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>()
            r12.f = r3
            k05 r3 = new k05
            r3.<init>()
            r12.e = r3
            r12.g = r13
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.lang.Class<k05> r5 = defpackage.k05.class
            java.lang.Class<c1e> r6 = defpackage.c1e.class
            java.lang.Class<cjb> r7 = defpackage.cjb.class
            java.lang.Class[] r6 = new java.lang.Class[]{r6, r7}
            t73 r3 = defpackage.t73.b(r3, r5, r6)
            r13.add(r3)
            java.lang.Class<l83> r3 = defpackage.l83.class
            java.lang.Class[] r5 = new java.lang.Class[r2]
            t73 r3 = defpackage.t73.b(r12, r3, r5)
            r13.add(r3)
            java.util.Iterator r3 = r4.iterator()
        L_0x0175:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0187
            java.lang.Object r4 = r3.next()
            t73 r4 = (defpackage.t73) r4
            if (r4 == 0) goto L_0x0175
            r13.add(r4)
            goto L_0x0175
        L_0x0187:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0190:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x019e
            java.lang.Object r4 = r1.next()
            r3.add(r4)
            goto L_0x0190
        L_0x019e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            monitor-enter(r12)
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x01cb }
        L_0x01a8:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x01cb }
            if (r4 == 0) goto L_0x01d2
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x01cb }
            jib r4 = (defpackage.jib) r4     // Catch:{ all -> 0x01cb }
            java.lang.Object r4 = r4.get()     // Catch:{ InvalidRegistrarException -> 0x01ce }
            com.google.firebase.components.ComponentRegistrar r4 = (com.google.firebase.components.ComponentRegistrar) r4     // Catch:{ InvalidRegistrarException -> 0x01ce }
            if (r4 == 0) goto L_0x01a8
            java.lang.Object r5 = r12.g     // Catch:{ InvalidRegistrarException -> 0x01ce }
            lk9 r5 = (defpackage.lk9) r5     // Catch:{ InvalidRegistrarException -> 0x01ce }
            java.util.List r4 = r5.k(r4)     // Catch:{ InvalidRegistrarException -> 0x01ce }
            r13.addAll(r4)     // Catch:{ InvalidRegistrarException -> 0x01ce }
            r3.remove()     // Catch:{ InvalidRegistrarException -> 0x01ce }
            goto L_0x01a8
        L_0x01cb:
            r10 = move-exception
            goto L_0x02d3
        L_0x01ce:
            r3.remove()     // Catch:{ all -> 0x01cb }
            goto L_0x01a8
        L_0x01d2:
            java.util.Iterator r3 = r13.iterator()     // Catch:{ all -> 0x01cb }
        L_0x01d6:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x01cb }
            if (r4 == 0) goto L_0x0219
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x01cb }
            t73 r4 = (defpackage.t73) r4     // Catch:{ all -> 0x01cb }
            java.util.Set r4 = r4.b     // Catch:{ all -> 0x01cb }
            java.lang.Object[] r4 = r4.toArray()     // Catch:{ all -> 0x01cb }
            int r5 = r4.length     // Catch:{ all -> 0x01cb }
            r6 = r2
        L_0x01ea:
            if (r6 >= r5) goto L_0x01d6
            r7 = r4[r6]     // Catch:{ all -> 0x01cb }
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x01cb }
            java.lang.String r9 = "kotlinx.coroutines.CoroutineDispatcher"
            boolean r8 = r8.contains(r9)     // Catch:{ all -> 0x01cb }
            if (r8 == 0) goto L_0x0217
            java.lang.Object r8 = r12.d     // Catch:{ all -> 0x01cb }
            java.util.HashSet r8 = (java.util.HashSet) r8     // Catch:{ all -> 0x01cb }
            java.lang.String r9 = r7.toString()     // Catch:{ all -> 0x01cb }
            boolean r8 = r8.contains(r9)     // Catch:{ all -> 0x01cb }
            if (r8 == 0) goto L_0x020c
            r3.remove()     // Catch:{ all -> 0x01cb }
            goto L_0x01d6
        L_0x020c:
            java.lang.Object r8 = r12.d     // Catch:{ all -> 0x01cb }
            java.util.HashSet r8 = (java.util.HashSet) r8     // Catch:{ all -> 0x01cb }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x01cb }
            r8.add(r7)     // Catch:{ all -> 0x01cb }
        L_0x0217:
            int r6 = r6 + r0
            goto L_0x01ea
        L_0x0219:
            java.lang.Object r0 = r12.a     // Catch:{ all -> 0x01cb }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x01cb }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01cb }
            if (r0 == 0) goto L_0x0227
            defpackage.z3d.m(r13)     // Catch:{ all -> 0x01cb }
            goto L_0x023a
        L_0x0227:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x01cb }
            java.lang.Object r3 = r12.a     // Catch:{ all -> 0x01cb }
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ all -> 0x01cb }
            java.util.Set r3 = r3.keySet()     // Catch:{ all -> 0x01cb }
            r0.<init>(r3)     // Catch:{ all -> 0x01cb }
            r0.addAll(r13)     // Catch:{ all -> 0x01cb }
            defpackage.z3d.m(r0)     // Catch:{ all -> 0x01cb }
        L_0x023a:
            java.util.Iterator r0 = r13.iterator()     // Catch:{ all -> 0x01cb }
        L_0x023e:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x01cb }
            if (r3 == 0) goto L_0x025c
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x01cb }
            t73 r3 = (defpackage.t73) r3     // Catch:{ all -> 0x01cb }
            v97 r4 = new v97     // Catch:{ all -> 0x01cb }
            k83 r5 = new k83     // Catch:{ all -> 0x01cb }
            r5.<init>(r12, r2, r3)     // Catch:{ all -> 0x01cb }
            r4.<init>(r5)     // Catch:{ all -> 0x01cb }
            java.lang.Object r5 = r12.a     // Catch:{ all -> 0x01cb }
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch:{ all -> 0x01cb }
            r5.put(r3, r4)     // Catch:{ all -> 0x01cb }
            goto L_0x023e
        L_0x025c:
            java.util.ArrayList r13 = r12.t(r13)     // Catch:{ all -> 0x01cb }
            r1.addAll(r13)     // Catch:{ all -> 0x01cb }
            java.util.ArrayList r13 = r12.u()     // Catch:{ all -> 0x01cb }
            r1.addAll(r13)     // Catch:{ all -> 0x01cb }
            r12.s()     // Catch:{ all -> 0x01cb }
            monitor-exit(r12)     // Catch:{ all -> 0x01cb }
            java.util.Iterator r13 = r1.iterator()
        L_0x0272:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0282
            java.lang.Object r0 = r13.next()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            goto L_0x0272
        L_0x0282:
            java.lang.Object r13 = r12.f
            java.util.concurrent.atomic.AtomicReference r13 = (java.util.concurrent.atomic.AtomicReference) r13
            java.lang.Object r13 = r13.get()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            if (r13 == 0) goto L_0x0299
            java.lang.Object r0 = r12.a
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r13 = r13.booleanValue()
            r12.j(r0, r13)
        L_0x0299:
            r10.d = r12
            android.os.Trace.endSection()
            v97 r13 = new v97
            k83 r0 = new k83
            r1 = 2
            r0.<init>(r10, r1, r11)
            r13.<init>(r0)
            r10.g = r13
            java.lang.Class<z74> r11 = defpackage.z74.class
            jib r11 = r12.c(r11)
            r10.h = r11
            fh5 r11 = new fh5
            r11.<init>(r10)
            r10.a()
            java.util.concurrent.atomic.AtomicBoolean r12 = r10.e
            boolean r12 = r12.get()
            if (r12 == 0) goto L_0x02ca
            rd0 r12 = defpackage.rd0.X
            java.util.concurrent.atomic.AtomicBoolean r12 = r12.a
            r12.get()
        L_0x02ca:
            java.util.concurrent.CopyOnWriteArrayList r10 = r10.i
            r10.add(r11)
            android.os.Trace.endSection()
            return
        L_0x02d3:
            monitor-exit(r12)     // Catch:{ all -> 0x01cb }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ih5.<init>(android.content.Context, java.lang.String, rh5):void");
    }

    public static ih5 b() {
        ih5 ih5;
        synchronized (j) {
            try {
                ih5 = (ih5) k.get("[DEFAULT]");
                if (ih5 == null) {
                    StringBuilder sb = new StringBuilder("Default FirebaseApp is not initialized in this process ");
                    if (am7.g == null) {
                        am7.g = Application.getProcessName();
                    }
                    sb.append(am7.g);
                    sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                    throw new IllegalStateException(sb.toString());
                }
                ((z74) ih5.h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return ih5;
    }

    public static ih5 e(Context context) {
        synchronized (j) {
            try {
                if (k.containsKey("[DEFAULT]")) {
                    ih5 b2 = b();
                    return b2;
                }
                rh5 a2 = rh5.a(context);
                if (a2 == null) {
                    return null;
                }
                ih5 f2 = f(context, a2);
                return f2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ih5 f(Context context, rh5 rh5) {
        ih5 ih5;
        AtomicReference atomicReference = gh5.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = gh5.a;
            if (atomicReference2.get() == null) {
                Object obj = new Object();
                while (true) {
                    if (!atomicReference2.compareAndSet((Object) null, obj)) {
                        if (atomicReference2.get() != null) {
                            break;
                        }
                    } else {
                        rd0.a(application);
                        rd0 rd0 = rd0.X;
                        rd0.getClass();
                        synchronized (rd0) {
                            rd0.c.add(obj);
                        }
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (j) {
            yr yrVar = k;
            a24.q("FirebaseApp name " + "[DEFAULT]" + " already exists!", !yrVar.containsKey("[DEFAULT]"));
            a24.p(context, "Application context cannot be null.");
            ih5 = new ih5(context, "[DEFAULT]", rh5);
            yrVar.put("[DEFAULT]", ih5);
        }
        ih5.d();
        return ih5;
    }

    public final void a() {
        a24.q("FirebaseApp was deleted", !this.f.get());
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.b.getBytes(Charset.defaultCharset());
        String str = null;
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.c.b.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str = Base64.encodeToString(bytes2, 11);
        }
        sb.append(str);
        return sb.toString();
    }

    public final void d() {
        HashMap hashMap;
        if (!dze.a(this.a)) {
            a();
            Context context = this.a;
            AtomicReference atomicReference = hh5.b;
            if (atomicReference.get() == null) {
                hh5 hh5 = new hh5(context);
                while (!atomicReference.compareAndSet((Object) null, hh5)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(hh5, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        a();
        l83 l83 = this.d;
        a();
        boolean equals = "[DEFAULT]".equals(this.b);
        AtomicReference atomicReference2 = (AtomicReference) l83.f;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (!atomicReference2.compareAndSet((Object) null, valueOf)) {
                if (atomicReference2.get() != null) {
                    break;
                }
            } else {
                synchronized (l83) {
                    hashMap = new HashMap((HashMap) l83.a);
                }
                l83.j(hashMap, equals);
                break;
            }
        }
        ((z74) this.h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ih5)) {
            return false;
        }
        ih5 ih5 = (ih5) obj;
        ih5.a();
        return this.b.equals(ih5.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        mn mnVar = new mn((Object) this);
        mnVar.r(this.b, "name");
        mnVar.r(this.c, "options");
        return mnVar.toString();
    }
}
