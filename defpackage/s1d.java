package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.tamtam.api.SessionSendLimitException;

/* renamed from: s1d  reason: default package */
public final class s1d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u1d b;

    public /* synthetic */ s1d(u1d u1d, int i) {
        this.a = i;
        this.b = u1d;
    }

    public boolean a(nia nia) {
        u1d u1d = this.b;
        if (u1d.c.get() != 2 && !u1d.a(u1d, nia, io7.class)) {
            return false;
        }
        nia.b.c.d(new uae("session.state", "session is in logged in state or login already in progress", (String) null));
        return true;
    }

    public void b() {
        boolean z;
        long j;
        boolean z2;
        mia mia;
        long currentTimeMillis = System.currentTimeMillis();
        yd3 a2 = this.b.m.a();
        wd3 b2 = ((ed3) ((t97) a2.b).getValue()).b();
        Class<yd3> cls = yd3.class;
        int i = 1;
        if (((wd3) ((AtomicReference) a2.d).getAndSet(b2)) != b2) {
            String name = cls.getName();
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.X, name, "reset timeoutIndex", (Throwable) null);
            }
            ((AtomicInteger) a2.c).set(0);
            z = true;
        } else {
            z = false;
        }
        long[] jArr = (long[]) ((Map) ((r7e) a2.f).getValue()).getOrDefault(b2, xy6.c);
        int i2 = ((AtomicInteger) a2.c).get();
        if (i2 >= 0 && i2 < jArr.length) {
            j = jArr[i2];
        } else if (i2 >= jArr.length) {
            if (jArr.length != 0) {
                j = jArr[jArr.length - 1];
            } else {
                throw new NoSuchElementException("Array is empty.");
            }
        } else if (jArr.length != 0) {
            j = jArr[0];
        } else {
            throw new NoSuchElementException("Array is empty.");
        }
        if (z) {
            String name2 = cls.getName();
            fn6 fn62 = udd.e;
            if (fn62 != null && fn62.c()) {
                fn62.d(tn7.X, name2, "connType=" + b2 + ", timeout = " + j, (Throwable) null);
            }
        }
        u1d u1d = this.b;
        int size = u1d.v.size();
        boolean z3 = u1d.z > 0 && u1d.h();
        if (z3 && !u1d.A && u1d.z < size) {
            udd.R(u1d.a, (IOException) null, "amount of send_tasks=%d has exceeded the specified limit=%d", Arrays.copyOf(new Object[]{Integer.valueOf(size), Integer.valueOf(u1d.z)}, 2));
            u1d.l(new SessionSendLimitException(u1d.z, size));
            u1d.A = true;
        }
        if (z3) {
            udd.p(this.b.a, "!==! invalidate start time for cmds, tasks=%d, limit=%d", new Object[]{Integer.valueOf(this.b.v.size()), Integer.valueOf(this.b.z)});
        }
        synchronized (this.b.w) {
            try {
                if (this.b.v.size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (nia nia : this.b.v) {
                        if (!(nia == null || nia.a != i || (mia = nia.b) == null)) {
                            if (z3) {
                                int i3 = m77.a;
                                int i4 = zp4.o;
                                mia.d = mt0.Q(System.currentTimeMillis(), eq4.c);
                            } else {
                                long e = currentTimeMillis - zp4.e(mia.d);
                                if (e > j) {
                                    this.b.j(cn7.EXCEPTION, nia.b.c.f(), 0, nia.b.a.N(), true, "send timeout: diff=" + e + " requestTimeout=" + j);
                                    nia.b.c.d(new lae());
                                    this.b.m.f();
                                    arrayList.add(nia);
                                }
                            }
                        }
                        i = 1;
                    }
                    this.b.v.removeAll(arrayList);
                }
            } finally {
                while (true) {
                }
            }
        }
        if (this.b.u.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = this.b.u.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (currentTimeMillis - zp4.e(((lia) entry.getValue()).c) > j && currentTimeMillis - this.b.d.get() > j) {
                    this.b.j(cn7.EXCEPTION, ((lia) entry.getValue()).a.f(), ((Short) entry.getKey()).shortValue(), ((lia) entry.getValue()).b.b.a.N(), false, "read timeout");
                    this.b.m.f();
                    arrayList2.add((Short) entry.getKey());
                    z2 = true;
                    break;
                }
            }
            lae lae = new lae();
            if (z2) {
                udd.R(this.b.a, (IOException) null, "session timeout", Arrays.copyOf(new Object[0], 0));
                for (lia lia : this.b.u.values()) {
                    lia.a.d(lae);
                }
                this.b.u.clear();
                this.b.m(0);
                this.b.g.set(false);
                return;
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Short sh = (Short) it2.next();
                lia lia2 = (lia) this.b.u.get(sh);
                if (lia2 != null) {
                    lia2.a.d(lae);
                    this.b.u.remove(sh);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [kia, java.io.IOException, java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010c, code lost:
        if (a(r5) != false) goto L_0x010e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c() {
        /*
            r26 = this;
            r1 = r26
            java.util.concurrent.atomic.AtomicInteger r0 = defpackage.u1d.D
            u1d r2 = r1.b
            boolean r0 = r2.i()
            if (r0 == 0) goto L_0x0272
            java.util.List r0 = r2.v
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0016
            goto L_0x0272
        L_0x0016:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r0 = r2.v
            java.util.Iterator r4 = r0.iterator()
        L_0x0021:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x026a
            java.lang.Object r0 = r4.next()
            r5 = r0
            nia r5 = (defpackage.nia) r5
            boolean r0 = r2.i()
            r6 = 0
            java.lang.String r8 = r2.a
            if (r0 == 0) goto L_0x003d
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x0040
        L_0x003d:
            r1 = 0
            goto L_0x025f
        L_0x0040:
            int r0 = r5.a
            r9 = 1
            r10 = 2
            java.util.concurrent.atomic.AtomicBoolean r11 = r2.g
            if (r0 != r9) goto L_0x020e
            mia r9 = r5.b
            if (r9 == 0) goto L_0x020e
            ibe r12 = r9.a
            boolean r0 = r12 instanceof defpackage.io7
            boolean r13 = r12 instanceof defpackage.kp7
            boolean r14 = r12 instanceof defpackage.j2d
            java.util.concurrent.ConcurrentHashMap r15 = r2.u
            if (r0 != 0) goto L_0x00a5
            if (r13 != 0) goto L_0x00a5
            java.util.List r13 = r2.v
            java.util.Iterator r13 = r13.iterator()
        L_0x0060:
            boolean r16 = r13.hasNext()
            if (r16 == 0) goto L_0x007b
            java.lang.Object r16 = r13.next()
            r7 = r16
            nia r7 = (defpackage.nia) r7
            mia r7 = r7.b
            if (r7 == 0) goto L_0x0060
            ibe r7 = r7.a
            if (r7 == 0) goto L_0x0060
            boolean r7 = r7 instanceof defpackage.kp7
            if (r7 == 0) goto L_0x0060
            goto L_0x0021
        L_0x007b:
            java.util.Set r7 = r15.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x0083:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto L_0x00a5
            java.lang.Object r13 = r7.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r13 = r13.getValue()
            lia r13 = (defpackage.lia) r13
            nia r13 = r13.b
            mia r13 = r13.b
            if (r13 == 0) goto L_0x0083
            ibe r13 = r13.a
            if (r13 == 0) goto L_0x0083
            boolean r13 = r13 instanceof defpackage.kp7
            if (r13 == 0) goto L_0x0083
            goto L_0x0021
        L_0x00a5:
            boolean r7 = r12.V()
            if (r7 == 0) goto L_0x00b3
            java.util.concurrent.atomic.AtomicInteger r7 = r2.c
            int r7 = r7.get()
            if (r7 != r10) goto L_0x0021
        L_0x00b3:
            boolean r7 = r11.get()
            if (r7 != 0) goto L_0x00bd
            if (r14 != 0) goto L_0x00bd
            goto L_0x0021
        L_0x00bd:
            iae r7 = r9.c
            if (r14 == 0) goto L_0x00eb
            boolean r13 = r11.get()
            java.lang.String r14 = "session.state"
            if (r13 == 0) goto L_0x00d4
            uae r0 = new uae
            java.lang.String r8 = "SESSION_INIT already initialized"
            r0.<init>(r14, r8, r6)
            r7.d(r0)
            goto L_0x00e6
        L_0x00d4:
            java.lang.Class<j2d> r13 = defpackage.j2d.class
            boolean r13 = defpackage.u1d.a(r2, r5, r13)
            if (r13 == 0) goto L_0x00eb
            uae r0 = new uae
            java.lang.String r8 = "SESSION_INIT already requested"
            r0.<init>(r14, r8, r6)
            r7.d(r0)
        L_0x00e6:
            r3.add(r5)
            goto L_0x0021
        L_0x00eb:
            long r13 = java.lang.System.currentTimeMillis()
            r17 = r11
            long r10 = r5.c
            long r10 = zp4.e(r10)
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x00fd
            goto L_0x0021
        L_0x00fd:
            java.util.concurrent.atomic.AtomicInteger r10 = r2.b
            r10.incrementAndGet()
            short r10 = r10.shortValue()
            if (r0 == 0) goto L_0x011b
            boolean r0 = r1.a(r5)     // Catch:{ IOException -> 0x0118, Exception -> 0x0116 }
            if (r0 == 0) goto L_0x011b
        L_0x010e:
            r3.add(r5)
            goto L_0x0021
        L_0x0113:
            r0 = move-exception
            goto L_0x020a
        L_0x0116:
            r0 = move-exception
            goto L_0x016a
        L_0x0118:
            r0 = move-exception
            goto L_0x01cf
        L_0x011b:
            lia r0 = new lia     // Catch:{ IOException -> 0x0118, Exception -> 0x0116 }
            r0.<init>(r7, r5)     // Catch:{ IOException -> 0x0118, Exception -> 0x0116 }
            java.lang.Short r11 = java.lang.Short.valueOf(r10)     // Catch:{ IOException -> 0x0118, Exception -> 0x0116 }
            r15.put(r11, r0)     // Catch:{ IOException -> 0x0118, Exception -> 0x0116 }
            boolean r0 = r9.b     // Catch:{ IOException -> 0x0118, Exception -> 0x0116 }
            if (r0 == 0) goto L_0x012e
            r0 = 2
        L_0x012c:
            r9 = 0
            goto L_0x0130
        L_0x012e:
            r0 = 0
            goto L_0x012c
        L_0x0130:
            kia r6 = defpackage.kia.a(r12, r0, r9)     // Catch:{ IOException -> 0x0118, Exception -> 0x0116 }
            u1d r0 = r1.b     // Catch:{ IOException -> 0x0118, Exception -> 0x0116 }
            cn7 r19 = defpackage.cn7.SEND     // Catch:{ IOException -> 0x0118, Exception -> 0x0116 }
            long r20 = r7.f()     // Catch:{ IOException -> 0x0118, Exception -> 0x0116 }
            short r23 = r12.N()     // Catch:{ IOException -> 0x0118, Exception -> 0x0116 }
            java.lang.Object r9 = r12.b     // Catch:{ IOException -> 0x0118, Exception -> 0x0116 }
            java.util.HashMap r9 = (java.util.HashMap) r9     // Catch:{ IOException -> 0x0118, Exception -> 0x0116 }
            java.lang.String r25 = ete.S(r9)     // Catch:{ IOException -> 0x0118, Exception -> 0x0116 }
            r24 = 1
            r18 = r0
            r22 = r10
            r18.j(r19, r20, r22, r23, r24, r25)     // Catch:{ IOException -> 0x0118, Exception -> 0x0116 }
            zz2 r0 = r2.m     // Catch:{ IOException -> 0x0118, Exception -> 0x0116 }
            boolean r0 = r0.e()     // Catch:{ IOException -> 0x0118, Exception -> 0x0116 }
            if (r0 == 0) goto L_0x015e
            byte[] r0 = r6.c(r10)     // Catch:{ IOException -> 0x0118, Exception -> 0x0116 }
            goto L_0x0162
        L_0x015e:
            byte[] r0 = r6.b(r10)     // Catch:{ IOException -> 0x0118, Exception -> 0x0116 }
        L_0x0162:
            java.io.DataOutputStream r9 = r2.q     // Catch:{ IOException -> 0x0118, Exception -> 0x0116 }
            int r11 = r0.length     // Catch:{ IOException -> 0x0118, Exception -> 0x0116 }
            r13 = 0
            r9.write(r0, r13, r11)     // Catch:{ IOException -> 0x0118, Exception -> 0x0116 }
            goto L_0x010e
        L_0x016a:
            u1d r9 = r1.b     // Catch:{ all -> 0x0113 }
            cn7 r19 = defpackage.cn7.EXCEPTION     // Catch:{ all -> 0x0113 }
            long r20 = r7.f()     // Catch:{ all -> 0x0113 }
            short r23 = r12.N()     // Catch:{ all -> 0x0113 }
            java.lang.String r25 = r0.getMessage()     // Catch:{ all -> 0x0113 }
            r24 = 1
            r18 = r9
            r22 = r10
            r18.j(r19, r20, r22, r23, r24, r25)     // Catch:{ all -> 0x0113 }
            boolean r9 = r0 instanceof java.lang.ArrayIndexOutOfBoundsException     // Catch:{ all -> 0x0113 }
            if (r9 != 0) goto L_0x018b
            boolean r9 = r0 instanceof net.jpountz.lz4.LZ4Exception     // Catch:{ all -> 0x0113 }
            if (r9 == 0) goto L_0x01bb
        L_0x018b:
            if (r6 == 0) goto L_0x01bb
            byte[] r6 = r6.b(r10)     // Catch:{ all -> 0x0113 }
            java.lang.String r9 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x01b4 }
            byte[] r6 = defpackage.pa2.l(r6)     // Catch:{ UnsupportedEncodingException -> 0x01b4 }
            java.lang.String r11 = "US-ASCII"
            r9.<init>(r6, r11)     // Catch:{ UnsupportedEncodingException -> 0x01b4 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0113 }
            r6.<init>()     // Catch:{ all -> 0x0113 }
            java.lang.String r11 = "exception in LZ4, packet = "
            r6.append(r11)     // Catch:{ all -> 0x0113 }
            r6.append(r9)     // Catch:{ all -> 0x0113 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0113 }
            r9 = 0
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x0113 }
            udd.u(r8, r0, r6, r9)     // Catch:{ all -> 0x0113 }
            goto L_0x01bb
        L_0x01b4:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x0113 }
            r1.<init>(r0)     // Catch:{ all -> 0x0113 }
            throw r1     // Catch:{ all -> 0x0113 }
        L_0x01bb:
            lae r6 = new lae     // Catch:{ all -> 0x0113 }
            r6.<init>()     // Catch:{ all -> 0x0113 }
            r7.d(r6)     // Catch:{ all -> 0x0113 }
            java.lang.Short r6 = java.lang.Short.valueOf(r10)     // Catch:{ all -> 0x0113 }
            r15.remove(r6)     // Catch:{ all -> 0x0113 }
            r2.l(r0)     // Catch:{ all -> 0x0113 }
            goto L_0x010e
        L_0x01cf:
            u1d r1 = r1.b     // Catch:{ all -> 0x0113 }
            cn7 r19 = defpackage.cn7.EXCEPTION     // Catch:{ all -> 0x0113 }
            long r20 = r7.f()     // Catch:{ all -> 0x0113 }
            short r23 = r12.N()     // Catch:{ all -> 0x0113 }
            java.lang.String r25 = r0.getMessage()     // Catch:{ all -> 0x0113 }
            r24 = 1
            r18 = r1
            r22 = r10
            r18.j(r19, r20, r22, r23, r24, r25)     // Catch:{ all -> 0x0113 }
            lae r1 = new lae     // Catch:{ all -> 0x0113 }
            r1.<init>()     // Catch:{ all -> 0x0113 }
            r7.d(r1)     // Catch:{ all -> 0x0113 }
            java.lang.Short r1 = java.lang.Short.valueOf(r10)     // Catch:{ all -> 0x0113 }
            r15.remove(r1)     // Catch:{ all -> 0x0113 }
            r1 = 0
            r2.m(r1)     // Catch:{ all -> 0x0113 }
            r6 = r17
            r6.set(r1)     // Catch:{ all -> 0x0113 }
            r2.k()     // Catch:{ all -> 0x0113 }
            r2.l(r0)     // Catch:{ all -> 0x0113 }
            r3.add(r5)
            goto L_0x026a
        L_0x020a:
            r3.add(r5)
            throw r0
        L_0x020e:
            r6 = r11
            r7 = r10
            if (r0 != r7) goto L_0x0021
            kia r7 = r5.d
            if (r7 == 0) goto L_0x0021
            u1d r8 = r1.b     // Catch:{ IOException -> 0x023a }
            cn7 r9 = defpackage.cn7.SEND_ACK     // Catch:{ IOException -> 0x023a }
            short r12 = r7.c     // Catch:{ IOException -> 0x023a }
            short r13 = r7.d     // Catch:{ IOException -> 0x023a }
            java.lang.String r15 = ""
            r10 = 0
            r14 = 1
            r8.j(r9, r10, r12, r13, r14, r15)     // Catch:{ IOException -> 0x023a }
            short r0 = r7.c     // Catch:{ IOException -> 0x023a }
            byte[] r0 = r7.b(r0)     // Catch:{ IOException -> 0x023a }
            java.io.DataOutputStream r8 = r2.q     // Catch:{ IOException -> 0x023a }
            int r9 = r0.length     // Catch:{ IOException -> 0x023a }
            r10 = 0
            r8.write(r0, r10, r9)     // Catch:{ IOException -> 0x023a }
        L_0x0233:
            r3.add(r5)
            goto L_0x0021
        L_0x0238:
            r0 = move-exception
            goto L_0x025b
        L_0x023a:
            r0 = move-exception
            u1d r8 = r1.b     // Catch:{ all -> 0x0238 }
            cn7 r9 = defpackage.cn7.EXCEPTION     // Catch:{ all -> 0x0238 }
            short r12 = r7.c     // Catch:{ all -> 0x0238 }
            short r13 = r7.d     // Catch:{ all -> 0x0238 }
            java.lang.String r15 = r0.getMessage()     // Catch:{ all -> 0x0238 }
            r10 = 0
            r14 = 1
            r8.j(r9, r10, r12, r13, r14, r15)     // Catch:{ all -> 0x0238 }
            r7 = 0
            r2.m(r7)     // Catch:{ all -> 0x0238 }
            r6.set(r7)     // Catch:{ all -> 0x0238 }
            r2.k()     // Catch:{ all -> 0x0238 }
            r2.l(r0)     // Catch:{ all -> 0x0238 }
            goto L_0x0233
        L_0x025b:
            r3.add(r5)
            throw r0
        L_0x025f:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r1 = "detect INACTIVE session or has NO connection"
            udd.R(r8, r6, r1, r0)
        L_0x026a:
            java.util.List r0 = r2.v
            r0.removeAll(r3)
            r3.clear()
        L_0x0272:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s1d.c():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: vae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: uae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: vae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v22, resolved type: vae} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(defpackage.kia r27, byte[] r28) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            r3 = 1
            u1d r4 = r1.b
            java.util.concurrent.ConcurrentHashMap r0 = r4.u
            short r5 = r2.c
            java.lang.Short r6 = java.lang.Short.valueOf(r5)
            java.lang.Object r0 = r0.get(r6)
            r6 = r0
            lia r6 = (defpackage.lia) r6
            java.lang.String r0 = r4.a
            r8 = 0
            if (r6 == 0) goto L_0x02a1
            iae r9 = r6.a
            byte r10 = r2.b
            if (r10 == r3) goto L_0x0292
            r11 = 3
            if (r10 == r11) goto L_0x0036
            java.lang.String r1 = "illegal state in handleResponse, cmd: "
            java.lang.String r1 = defpackage.wn6.h(r10, r1)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r1)
            udd.s(r0, r1, r2)
            r4.l(r2)
            return
        L_0x0036:
            kbe r0 = defpackage.lbe.b
            ws8 r10 = defpackage.lr8.a(r28)
            java.lang.String r11 = "payloadCatching catch error"
            java.lang.String r12 = "ServerPayload/PayloadCatching"
            boolean r0 = r10.m()
            if (r0 == 0) goto L_0x0240
            int r0 = jjd.K(r10)     // Catch:{ all -> 0x004c }
            r13 = r0
            goto L_0x007c
        L_0x004c:
            r0 = move-exception
            r13 = r0
            udd.S(r12, r11, r13)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0057:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x006a
            java.lang.Object r14 = r0.next()
            ny9 r14 = (ny9) r14
            r14.getClass()
            ny9.a(r13)
            goto L_0x0057
        L_0x006a:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x007b
            if (r0 == r3) goto L_0x007a
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x007a:
            throw r13
        L_0x007b:
            r13 = r8
        L_0x007c:
            r14 = r8
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
        L_0x0086:
            if (r14 >= r13) goto L_0x0237
            java.lang.String r0 = jjd.M(r10)     // Catch:{ all -> 0x008d }
            goto L_0x00bd
        L_0x008d:
            r0 = move-exception
            r7 = r0
            udd.S(r12, r11, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0098:
            boolean r20 = r0.hasNext()
            if (r20 == 0) goto L_0x00ab
            java.lang.Object r20 = r0.next()
            ny9 r20 = (ny9) r20
            r20.getClass()
            ny9.a(r7)
            goto L_0x0098
        L_0x00ab:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x00bc
            if (r0 == r3) goto L_0x00bb
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00bb:
            throw r7
        L_0x00bc:
            r0 = 0
        L_0x00bd:
            if (r0 != 0) goto L_0x00c1
            goto L_0x0234
        L_0x00c1:
            int r7 = r0.hashCode()
            switch(r7) {
                case -1724546052: goto L_0x01c5;
                case 96784904: goto L_0x0187;
                case 110371416: goto L_0x0148;
                case 954925063: goto L_0x0109;
                case 1122960396: goto L_0x00ca;
                default: goto L_0x00c8;
            }
        L_0x00c8:
            goto L_0x01cd
        L_0x00ca:
            java.lang.String r7 = "localizedMessage"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x00d4
            goto L_0x01cd
        L_0x00d4:
            java.lang.String r19 = jjd.M(r10)     // Catch:{ all -> 0x00da }
            goto L_0x0234
        L_0x00da:
            r0 = move-exception
            r7 = r0
            udd.S(r12, r11, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x00e5:
            boolean r20 = r0.hasNext()
            if (r20 == 0) goto L_0x00f8
            java.lang.Object r20 = r0.next()
            ny9 r20 = (ny9) r20
            r20.getClass()
            ny9.a(r7)
            goto L_0x00e5
        L_0x00f8:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0234
            if (r0 == r3) goto L_0x0108
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0108:
            throw r7
        L_0x0109:
            java.lang.String r7 = "message"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0113
            goto L_0x01cd
        L_0x0113:
            java.lang.String r16 = jjd.M(r10)     // Catch:{ all -> 0x0119 }
            goto L_0x0234
        L_0x0119:
            r0 = move-exception
            r7 = r0
            udd.S(r12, r11, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0124:
            boolean r20 = r0.hasNext()
            if (r20 == 0) goto L_0x0137
            java.lang.Object r20 = r0.next()
            ny9 r20 = (ny9) r20
            r20.getClass()
            ny9.a(r7)
            goto L_0x0124
        L_0x0137:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0234
            if (r0 == r3) goto L_0x0147
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0147:
            throw r7
        L_0x0148:
            java.lang.String r7 = "title"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0152
            goto L_0x01cd
        L_0x0152:
            java.lang.String r18 = jjd.M(r10)     // Catch:{ all -> 0x0158 }
            goto L_0x0234
        L_0x0158:
            r0 = move-exception
            r7 = r0
            udd.S(r12, r11, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0163:
            boolean r20 = r0.hasNext()
            if (r20 == 0) goto L_0x0176
            java.lang.Object r20 = r0.next()
            ny9 r20 = (ny9) r20
            r20.getClass()
            ny9.a(r7)
            goto L_0x0163
        L_0x0176:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0234
            if (r0 == r3) goto L_0x0186
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0186:
            throw r7
        L_0x0187:
            java.lang.String r7 = "error"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0190
            goto L_0x01cd
        L_0x0190:
            java.lang.String r15 = jjd.M(r10)     // Catch:{ all -> 0x0196 }
            goto L_0x0234
        L_0x0196:
            r0 = move-exception
            r7 = r0
            udd.S(r12, r11, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01a1:
            boolean r20 = r0.hasNext()
            if (r20 == 0) goto L_0x01b4
            java.lang.Object r20 = r0.next()
            ny9 r20 = (ny9) r20
            r20.getClass()
            ny9.a(r7)
            goto L_0x01a1
        L_0x01b4:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0234
            if (r0 == r3) goto L_0x01c4
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01c4:
            throw r7
        L_0x01c5:
            java.lang.String r7 = "description"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0200
        L_0x01cd:
            r10.z()     // Catch:{ all -> 0x01d1 }
            goto L_0x0234
        L_0x01d1:
            r0 = move-exception
            r7 = r0
            udd.S(r12, r11, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01dc:
            boolean r20 = r0.hasNext()
            if (r20 == 0) goto L_0x01ef
            java.lang.Object r20 = r0.next()
            ny9 r20 = (ny9) r20
            r20.getClass()
            ny9.a(r7)
            goto L_0x01dc
        L_0x01ef:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0234
            if (r0 == r3) goto L_0x01ff
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01ff:
            throw r7
        L_0x0200:
            java.lang.String r17 = jjd.M(r10)     // Catch:{ all -> 0x0205 }
            goto L_0x0234
        L_0x0205:
            r0 = move-exception
            r7 = r0
            udd.S(r12, r11, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0210:
            boolean r20 = r0.hasNext()
            if (r20 == 0) goto L_0x0223
            java.lang.Object r20 = r0.next()
            ny9 r20 = (ny9) r20
            r20.getClass()
            ny9.a(r7)
            goto L_0x0210
        L_0x0223:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0234
            if (r0 == r3) goto L_0x0233
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0233:
            throw r7
        L_0x0234:
            int r14 = r14 + r3
            goto L_0x0086
        L_0x0237:
            r0 = r16
            r25 = r17
            r24 = r18
            r7 = r19
            goto L_0x0247
        L_0x0240:
            r0 = 0
            r7 = 0
            r15 = 0
            r24 = 0
            r25 = 0
        L_0x0247:
            if (r25 == 0) goto L_0x0257
            vae r10 = new vae
            r20 = r10
            r21 = r15
            r22 = r0
            r23 = r7
            r20.<init>(r21, r22, r23, r24, r25)
            goto L_0x025c
        L_0x0257:
            uae r10 = new uae
            r10.<init>(r15, r0, r7)
        L_0x025c:
            cn7 r12 = defpackage.cn7.ERROR
            long r13 = r9.f()
            nia r0 = r6.b
            mia r0 = r0.b
            ibe r0 = r0.a
            short r16 = r0.N()
            java.lang.String r18 = r10.toString()
            java.util.concurrent.atomic.AtomicInteger r0 = defpackage.u1d.D
            r17 = 0
            short r15 = r2.c
            u1d r11 = r1.b
            r11.j(r12, r13, r15, r16, r17, r18)
            java.lang.String r0 = "proto.state"
            java.lang.String r1 = r10.b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x028e
            boolean r0 = r4.e()
            if (r0 == 0) goto L_0x028e
            r4.f(r3, r8)
        L_0x028e:
            r9.d(r10)
            goto L_0x0297
        L_0x0292:
            r0 = r28
            r1.e(r0, r2, r9)
        L_0x0297:
            java.util.concurrent.ConcurrentHashMap r0 = r4.u
            java.lang.Short r1 = java.lang.Short.valueOf(r5)
            r0.remove(r1)
            goto L_0x02ad
        L_0x02a1:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r8)
            java.lang.String r2 = "illegal state in handleResponse, reader task is null"
            r3 = 0
            udd.R(r0, r3, r2, r1)
        L_0x02ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s1d.d(kia, byte[]):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v435, resolved type: im3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v436, resolved type: im3} */
    /* JADX WARNING: type inference failed for: r16v1, types: [lbe] */
    /* JADX WARNING: type inference failed for: r16v2, types: [lbe] */
    /* JADX WARNING: type inference failed for: r16v3, types: [lbe] */
    /* JADX WARNING: type inference failed for: r16v4, types: [lbe] */
    /* JADX WARNING: type inference failed for: r16v5, types: [lbe] */
    /* JADX WARNING: type inference failed for: r16v6, types: [qn2] */
    /* JADX WARNING: type inference failed for: r16v7, types: [bl1] */
    /* JADX WARNING: type inference failed for: r16v8, types: [lbe] */
    /* JADX WARNING: type inference failed for: r16v9, types: [pm9] */
    /* JADX WARNING: type inference failed for: r16v10, types: [lbe] */
    /* JADX WARNING: type inference failed for: r16v11, types: [n89] */
    /* JADX WARNING: type inference failed for: r16v12, types: [lbe] */
    /* JADX WARNING: type inference failed for: r16v13, types: [lbe] */
    /* JADX WARNING: type inference failed for: r0v118, types: [zl9, lbe] */
    /* JADX WARNING: type inference failed for: r16v14, types: [lbe] */
    /* JADX WARNING: type inference failed for: r16v15, types: [a99] */
    /* JADX WARNING: type inference failed for: r16v16, types: [q89] */
    /* JADX WARNING: type inference failed for: r16v17, types: [g99] */
    /* JADX WARNING: type inference failed for: r16v18, types: [k89] */
    /* JADX WARNING: type inference failed for: r16v19, types: [lbe] */
    /* JADX WARNING: type inference failed for: r0v124, types: [qm3, lbe] */
    /* JADX WARNING: type inference failed for: r0v126, types: [en3, lbe] */
    /* JADX WARNING: type inference failed for: r0v127, types: [lbe, fk3] */
    /* JADX WARNING: type inference failed for: r0v128, types: [tm3, lbe] */
    /* JADX WARNING: type inference failed for: r16v20, types: [lbe] */
    /* JADX WARNING: type inference failed for: r16v21, types: [lbe] */
    /* JADX WARNING: type inference failed for: r0v132, types: [ra2, lbe] */
    /* JADX WARNING: type inference failed for: r0v133, types: [n92, lbe] */
    /* JADX WARNING: type inference failed for: r0v135, types: [f92] */
    /* JADX WARNING: type inference failed for: r0v224, types: [y60] */
    /* JADX WARNING: type inference failed for: r0v274 */
    /* JADX WARNING: type inference failed for: r0v276, types: [x60] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0665, code lost:
        r10.z();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:862:0x0e23  */
    /* JADX WARNING: Removed duplicated region for block: B:866:0x0e35  */
    /* JADX WARNING: Removed duplicated region for block: B:874:0x0e4e  */
    /* JADX WARNING: Removed duplicated region for block: B:878:0x0e69  */
    /* JADX WARNING: Removed duplicated region for block: B:880:0x0ea4  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(byte[] r33, defpackage.kia r34, defpackage.iae r35) {
        /*
            r32 = this;
            r1 = r32
            r2 = r34
            r3 = r35
            r4 = -1
            r7 = 1
            byte r0 = r2.b
            if (r0 != r7) goto L_0x0012
            cn7 r0 = defpackage.cn7.RECEIVE
        L_0x000e:
            r9 = r0
            r0 = r33
            goto L_0x0015
        L_0x0012:
            cn7 r0 = defpackage.cn7.NOTIF
            goto L_0x000e
        L_0x0015:
            int r8 = r0.length
            if (r8 <= 0) goto L_0x0ede
            short r8 = r2.d
            kbe r10 = defpackage.lbe.b
            ws8 r10 = defpackage.lr8.a(r33)
            jk9 r0 = defpackage.dfa.c
            hw4 r11 = hw4.a
            r0 = 18
            java.lang.String r14 = "token"
            java.lang.String r15 = "ServerPayload/PayloadCatching"
            java.lang.String r5 = "payloadCatching catch error"
            r16 = 0
            if (r8 != r0) goto L_0x02d6
            boolean r0 = r10.m()
            if (r0 != 0) goto L_0x003a
        L_0x0036:
            r22 = r9
            goto L_0x02d2
        L_0x003a:
            int r0 = jjd.K(r10)     // Catch:{ all -> 0x0040 }
            r4 = r0
            goto L_0x0070
        L_0x0040:
            r0 = move-exception
            r4 = r0
            udd.S(r15, r5, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x004b:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x005e
            java.lang.Object r8 = r0.next()
            ny9 r8 = (ny9) r8
            r8.getClass()
            ny9.a(r4)
            goto L_0x004b
        L_0x005e:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x006f
            if (r0 == r7) goto L_0x006e
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x006e:
            throw r4
        L_0x006f:
            r4 = 0
        L_0x0070:
            if (r4 != 0) goto L_0x0073
            goto L_0x0036
        L_0x0073:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r12 = 0
        L_0x007e:
            if (r12 >= r4) goto L_0x02c9
            java.lang.String r0 = jjd.M(r10)     // Catch:{ all -> 0x0085 }
            goto L_0x00b6
        L_0x0085:
            r0 = move-exception
            r13 = r0
            udd.S(r15, r5, r13)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0090:
            boolean r17 = r0.hasNext()
            if (r17 == 0) goto L_0x00a3
            java.lang.Object r17 = r0.next()
            ny9 r17 = (ny9) r17
            r17.getClass()
            ny9.a(r13)
            goto L_0x0090
        L_0x00a3:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x00b4
            if (r0 == r7) goto L_0x00b3
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00b3:
            throw r13
        L_0x00b4:
            r0 = r16
        L_0x00b6:
            if (r0 != 0) goto L_0x00c1
            r33 = r4
            r2 = r7
            r22 = r9
            r18 = r11
            goto L_0x02bb
        L_0x00c1:
            java.lang.String r13 = "tokenAttrs"
            boolean r13 = r0.equals(r13)
            if (r13 == 0) goto L_0x0272
            int r0 = jjd.K(r10)     // Catch:{ all -> 0x00d2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00d2 }
            goto L_0x0102
        L_0x00d2:
            r0 = move-exception
            udd.S(r15, r5, r0)
            java.util.concurrent.CopyOnWriteArraySet r13 = defpackage.uzc.a
            java.util.Iterator r13 = r13.iterator()
        L_0x00dc:
            boolean r17 = r13.hasNext()
            if (r17 == 0) goto L_0x00ef
            java.lang.Object r17 = r13.next()
            ny9 r17 = (ny9) r17
            r17.getClass()
            ny9.a(r0)
            goto L_0x00dc
        L_0x00ef:
            int r13 = defpackage.m4b.a
            int r13 = hr1.t(r13)
            if (r13 == 0) goto L_0x0100
            if (r13 == r7) goto L_0x00ff
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00ff:
            throw r0
        L_0x0100:
            r0 = r16
        L_0x0102:
            if (r0 == 0) goto L_0x026a
            int r13 = r0.intValue()
            r7 = 0
        L_0x0109:
            if (r7 >= r13) goto L_0x0263
            java.lang.String r0 = jjd.M(r10)     // Catch:{ all -> 0x0115 }
            r33 = r4
            r18 = r11
            r4 = r0
            goto L_0x014b
        L_0x0115:
            r0 = move-exception
            r33 = r4
            r4 = r0
            udd.S(r15, r5, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0122:
            boolean r18 = r0.hasNext()
            if (r18 == 0) goto L_0x0135
            java.lang.Object r18 = r0.next()
            ny9 r18 = (ny9) r18
            r18.getClass()
            ny9.a(r4)
            goto L_0x0122
        L_0x0135:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0147
            r11 = 1
            if (r0 == r11) goto L_0x0146
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0146:
            throw r4
        L_0x0147:
            r18 = r11
            r4 = r16
        L_0x014b:
            if (r4 != 0) goto L_0x0154
            r22 = r9
            r19 = r13
            r2 = 1
            goto L_0x0254
        L_0x0154:
            int r11 = r10.x0()
            r19 = r13
            r20 = r16
            r13 = 0
        L_0x015d:
            if (r13 >= r11) goto L_0x0248
            java.lang.String r0 = jjd.M(r10)     // Catch:{ all -> 0x0168 }
            r22 = r9
            r21 = r11
            goto L_0x019e
        L_0x0168:
            r0 = move-exception
            r21 = r11
            r11 = r0
            udd.S(r15, r5, r11)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0175:
            boolean r22 = r0.hasNext()
            if (r22 == 0) goto L_0x0188
            java.lang.Object r22 = r0.next()
            ny9 r22 = (ny9) r22
            r22.getClass()
            ny9.a(r11)
            goto L_0x0175
        L_0x0188:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x019a
            r9 = 1
            if (r0 == r9) goto L_0x0199
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0199:
            throw r11
        L_0x019a:
            r22 = r9
            r0 = r16
        L_0x019e:
            boolean r9 = hhd.f(r0, r14)
            if (r9 == 0) goto L_0x01df
            java.lang.String r0 = jjd.M(r10)     // Catch:{ all -> 0x01ab }
            r20 = r0
            goto L_0x01dd
        L_0x01ab:
            r0 = move-exception
            r9 = r0
            udd.S(r15, r5, r9)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01b6:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x01c9
            java.lang.Object r11 = r0.next()
            ny9 r11 = (ny9) r11
            r11.getClass()
            ny9.a(r9)
            goto L_0x01b6
        L_0x01c9:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x01db
            r11 = 1
            if (r0 == r11) goto L_0x01da
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01da:
            throw r9
        L_0x01db:
            r20 = r16
        L_0x01dd:
            r2 = 1
            goto L_0x023d
        L_0x01df:
            java.lang.String r9 = "tokenTtl"
            boolean r0 = hhd.f(r0, r9)
            if (r0 == 0) goto L_0x0239
            boolean r0 = r10.m()
            if (r0 == 0) goto L_0x0233
            org.msgpack.core.buffer.MessageBuffer r0 = r10.w0
            int r9 = r10.x0
            byte r0 = r0.getByte(r9)
            r9 = -64
            if (r0 != r9) goto L_0x01fd
            r10.readByte()
            goto L_0x01dd
        L_0x01fd:
            r2 = 0
            jjd.J(r10, r2)     // Catch:{ all -> 0x0203 }
            goto L_0x01dd
        L_0x0203:
            r0 = move-exception
            r2 = r0
            udd.S(r15, r5, r2)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x020e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0221
            java.lang.Object r3 = r0.next()
            ny9 r3 = (ny9) r3
            r3.getClass()
            ny9.a(r2)
            goto L_0x020e
        L_0x0221:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x01dd
            r3 = 1
            if (r0 == r3) goto L_0x0232
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0232:
            throw r2
        L_0x0233:
            org.msgpack.core.MessageInsufficientBufferException r0 = new org.msgpack.core.MessageInsufficientBufferException
            r0.<init>()
            throw r0
        L_0x0239:
            r10.z()
            goto L_0x01dd
        L_0x023d:
            int r13 = r13 + r2
            r2 = r34
            r3 = r35
            r11 = r21
            r9 = r22
            goto L_0x015d
        L_0x0248:
            r22 = r9
            r2 = 1
            if (r20 != 0) goto L_0x024f
            java.lang.String r20 = ""
        L_0x024f:
            r0 = r20
            r8.put(r4, r0)
        L_0x0254:
            int r7 = r7 + r2
            r4 = r33
            r2 = r34
            r3 = r35
            r11 = r18
            r13 = r19
            r9 = r22
            goto L_0x0109
        L_0x0263:
            r33 = r4
            r22 = r9
            r18 = r11
            goto L_0x02ba
        L_0x026a:
            r33 = r4
            r22 = r9
            r18 = r11
            r2 = r7
            goto L_0x02bb
        L_0x0272:
            r33 = r4
            r22 = r9
            r18 = r11
            java.lang.String r2 = "presetAvatars"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x02b7
            sp8 r0 = r10.n()
            int r0 = r0.a()
            r2 = 7
            if (r0 != r2) goto L_0x02a1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r2 = r10.s0()
            r3 = 0
        L_0x0295:
            if (r3 >= r2) goto L_0x02a6
            si9 r4 = n06.z(r10)
            r0.add(r4)
            r4 = 1
            int r3 = r3 + r4
            goto L_0x0295
        L_0x02a1:
            r10.z()
            r0 = r16
        L_0x02a6:
            if (r0 == 0) goto L_0x02ad
            java.util.List r0 = o23.T(r0)
            goto L_0x02af
        L_0x02ad:
            r0 = r16
        L_0x02af:
            if (r0 != 0) goto L_0x02b3
            r0 = r18
        L_0x02b3:
            r6.addAll(r0)
            goto L_0x02ba
        L_0x02b7:
            r10.z()
        L_0x02ba:
            r2 = 1
        L_0x02bb:
            int r12 = r12 + r2
            r4 = r33
            r3 = r35
            r7 = r2
            r11 = r18
            r9 = r22
            r2 = r34
            goto L_0x007e
        L_0x02c9:
            r22 = r9
            x60 r0 = new x60
            r0.<init>(r8, r6)
        L_0x02d0:
            r16 = r0
        L_0x02d2:
            r0 = r16
            goto L_0x0e1f
        L_0x02d6:
            r22 = r9
            r18 = r11
            r0 = 23
            if (r8 != r0) goto L_0x04ac
            boolean r0 = r10.m()
            if (r0 != 0) goto L_0x02e5
            goto L_0x02d2
        L_0x02e5:
            int r0 = jjd.K(r10)     // Catch:{ all -> 0x02eb }
            r2 = r0
            goto L_0x031c
        L_0x02eb:
            r0 = move-exception
            r2 = r0
            udd.S(r15, r5, r2)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x02f6:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0309
            java.lang.Object r3 = r0.next()
            ny9 r3 = (ny9) r3
            r3.getClass()
            ny9.a(r2)
            goto L_0x02f6
        L_0x0309:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x031b
            r3 = 1
            if (r0 == r3) goto L_0x031a
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x031a:
            throw r2
        L_0x031b:
            r2 = 0
        L_0x031c:
            if (r2 != 0) goto L_0x031f
            goto L_0x02d2
        L_0x031f:
            ep7 r3 = defpackage.ep7.LOGIN
            r9 = r3
            r7 = r16
            r8 = r7
            r11 = r8
            r6 = 0
        L_0x0327:
            if (r6 >= r2) goto L_0x049f
            java.lang.String r0 = jjd.M(r10)     // Catch:{ all -> 0x032e }
            goto L_0x0360
        L_0x032e:
            r0 = move-exception
            r12 = r0
            udd.S(r15, r5, r12)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0339:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L_0x034c
            java.lang.Object r13 = r0.next()
            ny9 r13 = (ny9) r13
            r13.getClass()
            ny9.a(r12)
            goto L_0x0339
        L_0x034c:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x035e
            r13 = 1
            if (r0 == r13) goto L_0x035d
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x035d:
            throw r12
        L_0x035e:
            r0 = r16
        L_0x0360:
            if (r0 != 0) goto L_0x0365
        L_0x0362:
            r12 = 1
            goto L_0x049c
        L_0x0365:
            int r12 = r0.hashCode()
            switch(r12) {
                case -309425751: goto L_0x0489;
                case 110541305: goto L_0x0448;
                case 141498579: goto L_0x03b1;
                case 329221358: goto L_0x036e;
                default: goto L_0x036c;
            }
        L_0x036c:
            goto L_0x0491
        L_0x036e:
            java.lang.String r12 = "userToken"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x0378
            goto L_0x0491
        L_0x0378:
            java.lang.String r0 = jjd.M(r10)     // Catch:{ all -> 0x037e }
            r11 = r0
            goto L_0x0362
        L_0x037e:
            r0 = move-exception
            r11 = r0
            udd.S(r15, r5, r11)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0389:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto L_0x039c
            java.lang.Object r12 = r0.next()
            ny9 r12 = (ny9) r12
            r12.getClass()
            ny9.a(r11)
            goto L_0x0389
        L_0x039c:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x03ae
            r12 = 1
            if (r0 == r12) goto L_0x03ad
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x03ad:
            throw r11
        L_0x03ae:
            r11 = r16
            goto L_0x0362
        L_0x03b1:
            java.lang.String r12 = "tokenType"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x03bb
            goto L_0x0491
        L_0x03bb:
            java.lang.String r0 = jjd.M(r10)     // Catch:{ all -> 0x03c0 }
            goto L_0x03f2
        L_0x03c0:
            r0 = move-exception
            r9 = r0
            udd.S(r15, r5, r9)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x03cb:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto L_0x03de
            java.lang.Object r12 = r0.next()
            ny9 r12 = (ny9) r12
            r12.getClass()
            ny9.a(r9)
            goto L_0x03cb
        L_0x03de:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x03f0
            r12 = 1
            if (r0 == r12) goto L_0x03ef
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x03ef:
            throw r9
        L_0x03f0:
            r0 = r16
        L_0x03f2:
            r0.getClass()
            int r9 = r0.hashCode()
            switch(r9) {
                case -1154090892: goto L_0x041f;
                case -94752593: goto L_0x0414;
                case -16486507: goto L_0x0409;
                case 72611657: goto L_0x03fe;
                default: goto L_0x03fc;
            }
        L_0x03fc:
            r9 = r4
            goto L_0x0429
        L_0x03fe:
            java.lang.String r9 = "LOGIN"
            boolean r9 = r0.equals(r9)
            if (r9 != 0) goto L_0x0407
            goto L_0x03fc
        L_0x0407:
            r9 = 3
            goto L_0x0429
        L_0x0409:
            java.lang.String r9 = "RECOVERY"
            boolean r9 = r0.equals(r9)
            if (r9 != 0) goto L_0x0412
            goto L_0x03fc
        L_0x0412:
            r9 = 2
            goto L_0x0429
        L_0x0414:
            java.lang.String r9 = "PHONE_CONFIRM"
            boolean r9 = r0.equals(r9)
            if (r9 != 0) goto L_0x041d
            goto L_0x03fc
        L_0x041d:
            r9 = 1
            goto L_0x0429
        L_0x041f:
            java.lang.String r9 = "PHONE_BINDING"
            boolean r9 = r0.equals(r9)
            if (r9 != 0) goto L_0x0428
            goto L_0x03fc
        L_0x0428:
            r9 = 0
        L_0x0429:
            switch(r9) {
                case 0: goto L_0x0445;
                case 1: goto L_0x0442;
                case 2: goto L_0x043d;
                case 3: goto L_0x043a;
                default: goto L_0x042c;
            }
        L_0x042c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "No such value "
            java.lang.String r3 = " for LoginTokenType"
            java.lang.String r0 = defpackage.wn6.i(r2, r0, r3)
            r1.<init>(r0)
            throw r1
        L_0x043a:
            r9 = r3
            goto L_0x0362
        L_0x043d:
            ep7 r0 = defpackage.ep7.RECOVERY
        L_0x043f:
            r9 = r0
            goto L_0x0362
        L_0x0442:
            ep7 r0 = defpackage.ep7.PHONE_CONFIRM
            goto L_0x043f
        L_0x0445:
            ep7 r0 = defpackage.ep7.PHONE_BINDING
            goto L_0x043f
        L_0x0448:
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x0491
            java.lang.String r0 = jjd.M(r10)     // Catch:{ all -> 0x0455 }
            r8 = r0
            goto L_0x0362
        L_0x0455:
            r0 = move-exception
            r8 = r0
            udd.S(r15, r5, r8)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0460:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto L_0x0473
            java.lang.Object r12 = r0.next()
            ny9 r12 = (ny9) r12
            r12.getClass()
            ny9.a(r8)
            goto L_0x0460
        L_0x0473:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0485
            r12 = 1
            if (r0 == r12) goto L_0x0484
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0484:
            throw r8
        L_0x0485:
            r8 = r16
            goto L_0x0362
        L_0x0489:
            java.lang.String r12 = "profile"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x0496
        L_0x0491:
            r10.z()
            goto L_0x0362
        L_0x0496:
            uj3 r7 = defpackage.uj3.e(r10)
            goto L_0x0362
        L_0x049c:
            int r6 = r6 + r12
            goto L_0x0327
        L_0x049f:
            if (r8 == 0) goto L_0x02d2
            y60 r0 = new y60
            if (r7 != 0) goto L_0x04a7
            goto L_0x02d2
        L_0x04a7:
            r0.<init>(r8, r9, r11, r7)
            goto L_0x02d0
        L_0x04ac:
            r0 = 17
            if (r8 != r0) goto L_0x06b1
            boolean r0 = r10.m()
            if (r0 != 0) goto L_0x04b8
            goto L_0x02d2
        L_0x04b8:
            int r0 = jjd.K(r10)     // Catch:{ all -> 0x04be }
            r2 = r0
            goto L_0x04ef
        L_0x04be:
            r0 = move-exception
            r2 = r0
            udd.S(r15, r5, r2)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x04c9:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x04dc
            java.lang.Object r3 = r0.next()
            ny9 r3 = (ny9) r3
            r3.getClass()
            ny9.a(r2)
            goto L_0x04c9
        L_0x04dc:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x04ee
            r3 = 1
            if (r0 == r3) goto L_0x04ed
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x04ed:
            throw r2
        L_0x04ee:
            r2 = 0
        L_0x04ef:
            if (r2 != 0) goto L_0x04f3
            goto L_0x02d2
        L_0x04f3:
            r24 = r16
            r3 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r30 = 0
        L_0x04fe:
            if (r3 >= r2) goto L_0x06a6
            java.lang.String r0 = jjd.M(r10)     // Catch:{ all -> 0x0505 }
            goto L_0x0537
        L_0x0505:
            r0 = move-exception
            r4 = r0
            udd.S(r15, r5, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0510:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0523
            java.lang.Object r6 = r0.next()
            ny9 r6 = (ny9) r6
            r6.getClass()
            ny9.a(r4)
            goto L_0x0510
        L_0x0523:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0535
            r6 = 1
            if (r0 == r6) goto L_0x0534
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0534:
            throw r4
        L_0x0535:
            r0 = r16
        L_0x0537:
            if (r0 != 0) goto L_0x053b
            goto L_0x05ca
        L_0x053b:
            int r4 = r0.hashCode()
            switch(r4) {
                case -1135546573: goto L_0x065b;
                case -1007074317: goto L_0x0615;
                case 6808551: goto L_0x05d2;
                case 110541305: goto L_0x058b;
                case 575768841: goto L_0x0546;
                default: goto L_0x0542;
            }
        L_0x0542:
            r6 = 0
            goto L_0x0665
        L_0x0546:
            java.lang.String r4 = "requestMaxDuration"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x054f
            goto L_0x0542
        L_0x054f:
            r6 = 0
            long r8 = jjd.J(r10, r6)     // Catch:{ all -> 0x0556 }
            goto L_0x0588
        L_0x0556:
            r0 = move-exception
            r4 = r0
            udd.S(r15, r5, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0561:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0574
            java.lang.Object r6 = r0.next()
            ny9 r6 = (ny9) r6
            r6.getClass()
            ny9.a(r4)
            goto L_0x0561
        L_0x0574:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0586
            r6 = 1
            if (r0 == r6) goto L_0x0585
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0585:
            throw r4
        L_0x0586:
            r8 = 0
        L_0x0588:
            r28 = r8
            goto L_0x05ca
        L_0x058b:
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x0542
            java.lang.String r0 = jjd.M(r10)     // Catch:{ all -> 0x0596 }
            goto L_0x05c8
        L_0x0596:
            r0 = move-exception
            r4 = r0
            udd.S(r15, r5, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x05a1:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x05b4
            java.lang.Object r6 = r0.next()
            ny9 r6 = (ny9) r6
            r6.getClass()
            ny9.a(r4)
            goto L_0x05a1
        L_0x05b4:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x05c6
            r6 = 1
            if (r0 == r6) goto L_0x05c5
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x05c5:
            throw r4
        L_0x05c6:
            r0 = r16
        L_0x05c8:
            if (r0 != 0) goto L_0x05cf
        L_0x05ca:
            r6 = 0
        L_0x05cc:
            r8 = 1
            goto L_0x06a3
        L_0x05cf:
            r24 = r0
            goto L_0x05ca
        L_0x05d2:
            java.lang.String r4 = "requestCountLeft"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x05dc
            goto L_0x0542
        L_0x05dc:
            int r0 = jjd.I(r10)     // Catch:{ all -> 0x05e1 }
            goto L_0x0612
        L_0x05e1:
            r0 = move-exception
            r4 = r0
            udd.S(r15, r5, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x05ec:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x05ff
            java.lang.Object r6 = r0.next()
            ny9 r6 = (ny9) r6
            r6.getClass()
            ny9.a(r4)
            goto L_0x05ec
        L_0x05ff:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0611
            r6 = 1
            if (r0 == r6) goto L_0x0610
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0610:
            throw r4
        L_0x0611:
            r0 = 0
        L_0x0612:
            r30 = r0
            goto L_0x05ca
        L_0x0615:
            java.lang.String r4 = "altActionDuration"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x061f
            goto L_0x0542
        L_0x061f:
            r6 = 0
            long r8 = jjd.J(r10, r6)     // Catch:{ all -> 0x0626 }
            goto L_0x0657
        L_0x0626:
            r0 = move-exception
            r4 = r0
            udd.S(r15, r5, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0631:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0644
            java.lang.Object r8 = r0.next()
            ny9 r8 = (ny9) r8
            r8.getClass()
            ny9.a(r4)
            goto L_0x0631
        L_0x0644:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0656
            r8 = 1
            if (r0 == r8) goto L_0x0655
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0655:
            throw r4
        L_0x0656:
            r8 = r6
        L_0x0657:
            r26 = r8
            goto L_0x05cc
        L_0x065b:
            r6 = 0
            java.lang.String r4 = "codeLength"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x066a
        L_0x0665:
            r10.z()
            goto L_0x05cc
        L_0x066a:
            int r0 = jjd.I(r10)     // Catch:{ all -> 0x0670 }
            r8 = 1
            goto L_0x06a1
        L_0x0670:
            r0 = move-exception
            r4 = r0
            udd.S(r15, r5, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x067b:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x068e
            java.lang.Object r8 = r0.next()
            ny9 r8 = (ny9) r8
            r8.getClass()
            ny9.a(r4)
            goto L_0x067b
        L_0x068e:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            r8 = 1
            if (r0 == 0) goto L_0x06a0
            if (r0 == r8) goto L_0x069f
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x069f:
            throw r4
        L_0x06a0:
            r0 = 0
        L_0x06a1:
            r25 = r0
        L_0x06a3:
            int r3 = r3 + r8
            goto L_0x04fe
        L_0x06a6:
            if (r24 == 0) goto L_0x02d2
            g70 r16 = new g70
            r23 = r16
            r23.<init>(r24, r25, r26, r28, r30)
            goto L_0x02d2
        L_0x06b1:
            r0 = 49
            if (r8 != r0) goto L_0x07ca
            boolean r0 = r10.m()
            if (r0 != 0) goto L_0x06bd
            goto L_0x02d2
        L_0x06bd:
            int r0 = jjd.K(r10)     // Catch:{ all -> 0x06c3 }
            r2 = r0
            goto L_0x06f4
        L_0x06c3:
            r0 = move-exception
            r2 = r0
            udd.S(r15, r5, r2)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x06ce:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x06e1
            java.lang.Object r3 = r0.next()
            ny9 r3 = (ny9) r3
            r3.getClass()
            ny9.a(r2)
            goto L_0x06ce
        L_0x06e1:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x06f3
            r3 = 1
            if (r0 == r3) goto L_0x06f2
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x06f2:
            throw r2
        L_0x06f3:
            r2 = 0
        L_0x06f4:
            if (r2 != 0) goto L_0x06f8
            goto L_0x02d2
        L_0x06f8:
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            r6 = r16
            r11 = r18
            r4 = 0
        L_0x0702:
            if (r4 >= r2) goto L_0x07c3
            java.lang.String r0 = jjd.M(r10)     // Catch:{ all -> 0x0709 }
            goto L_0x073b
        L_0x0709:
            r0 = move-exception
            r7 = r0
            udd.S(r15, r5, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0714:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0727
            java.lang.Object r8 = r0.next()
            ny9 r8 = (ny9) r8
            r8.getClass()
            ny9.a(r7)
            goto L_0x0714
        L_0x0727:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0739
            r8 = 1
            if (r0 == r8) goto L_0x0738
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0738:
            throw r7
        L_0x0739:
            r0 = r16
        L_0x073b:
            if (r0 != 0) goto L_0x0740
        L_0x073d:
            r8 = 1
            goto L_0x07c0
        L_0x0740:
            int r7 = r0.hashCode()
            r8 = -1690743503(0xffffffff9b394d31, float:-1.5327783E-22)
            if (r7 == r8) goto L_0x076f
            r8 = -462094004(0xffffffffe475014c, float:-1.8078183E22)
            if (r7 == r8) goto L_0x0762
            r8 = 3052376(0x2e9358, float:4.27729E-39)
            if (r7 == r8) goto L_0x0754
            goto L_0x0777
        L_0x0754:
            java.lang.String r7 = "chat"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x075d
            goto L_0x0777
        L_0x075d:
            j22 r6 = defpackage.j22.a(r10)
            goto L_0x073d
        L_0x0762:
            java.lang.String r7 = "messages"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0777
            zy r11 = defpackage.zy.e(r10)
            goto L_0x073d
        L_0x076f:
            java.lang.String r7 = "messageIds"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x07ab
        L_0x0777:
            r10.z()     // Catch:{ all -> 0x077b }
            goto L_0x073d
        L_0x077b:
            r0 = move-exception
            r7 = r0
            udd.S(r15, r5, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0786:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0799
            java.lang.Object r8 = r0.next()
            ny9 r8 = (ny9) r8
            r8.getClass()
            ny9.a(r7)
            goto L_0x0786
        L_0x0799:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x073d
            r8 = 1
            if (r0 == r8) goto L_0x07aa
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x07aa:
            throw r7
        L_0x07ab:
            int r0 = jjd.D(r10)
            r7 = 0
        L_0x07b0:
            if (r7 >= r0) goto L_0x073d
            long r8 = r10.w0()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r3.add(r8)
            r8 = 1
            int r7 = r7 + r8
            goto L_0x07b0
        L_0x07c0:
            int r4 = r4 + r8
            goto L_0x0702
        L_0x07c3:
            f92 r0 = new f92
            r0.<init>(r11, r6, r3)
            goto L_0x02d0
        L_0x07ca:
            r0 = 48
            if (r8 != r0) goto L_0x07df
            n92 r0 = new n92
            r0.<init>(r10)
            java.util.List r2 = r0.c
            if (r2 != 0) goto L_0x0e1f
            java.util.List r2 = java.util.Collections.emptyList()
            r0.c = r2
            goto L_0x0e1f
        L_0x07df:
            r0 = 50
            if (r8 != r0) goto L_0x07ec
            ra2 r0 = new ra2
            r0.<init>(r10)
            r0.o = r4
            goto L_0x0e1f
        L_0x07ec:
            r0 = 34
            if (r8 != r0) goto L_0x07f7
            pn3 r0 = new pn3
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x07f7:
            r0 = 32
            if (r8 != r0) goto L_0x0803
            bqc r0 = defpackage.bqc.c
            lbe r16 = r0.q(r10)
            goto L_0x02d2
        L_0x0803:
            r0 = 46
            if (r8 != r0) goto L_0x080f
            j06 r0 = j06.c
            lbe r16 = r0.q(r10)
            goto L_0x02d2
        L_0x080f:
            r0 = 35
            if (r8 != r0) goto L_0x0824
            tm3 r0 = new tm3
            r0.<init>(r10)
            java.util.Map r2 = r0.c
            if (r2 != 0) goto L_0x0e1f
            java.util.Map r2 = java.util.Collections.emptyMap()
            r0.c = r2
            goto L_0x0e1f
        L_0x0824:
            r0 = 36
            if (r8 != r0) goto L_0x0839
            fk3 r0 = new fk3
            r0.<init>(r10)
            java.util.List r2 = r0.c
            if (r2 != 0) goto L_0x0e1f
            java.util.List r2 = java.util.Collections.emptyList()
            r0.c = r2
            goto L_0x0e1f
        L_0x0839:
            r0 = 37
            if (r8 != r0) goto L_0x084e
            en3 r0 = new en3
            r0.<init>(r10)
            java.util.List r2 = r0.c
            if (r2 != 0) goto L_0x0e1f
            java.util.List r2 = java.util.Collections.emptyList()
            r0.c = r2
            goto L_0x0e1f
        L_0x084e:
            r0 = 38
            if (r8 != r0) goto L_0x0866
            im3 r0 = new im3
            r2 = 0
            r0.<init>(r10, r2)
            java.lang.Object r2 = r0.o
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L_0x0e1f
            java.util.List r2 = java.util.Collections.emptyList()
            r0.o = r2
            goto L_0x0e1f
        L_0x0866:
            r0 = 39
            if (r8 != r0) goto L_0x0885
            qm3 r0 = new qm3
            r0.<init>(r10)
            java.util.List r2 = r0.c
            if (r2 != 0) goto L_0x0879
            java.util.List r2 = java.util.Collections.emptyList()
            r0.c = r2
        L_0x0879:
            java.util.List r2 = r0.o
            if (r2 != 0) goto L_0x0e1f
            java.util.List r2 = java.util.Collections.emptyList()
            r0.o = r2
            goto L_0x0e1f
        L_0x0885:
            r0 = 19
            if (r8 != r0) goto L_0x0891
            g02 r0 = defpackage.g02.X
            lbe r16 = r0.q(r10)
            goto L_0x02d2
        L_0x0891:
            kbe r0 = defpackage.lbe.b
            r2 = 20
            if (r8 != r2) goto L_0x0899
            goto L_0x0e1f
        L_0x0899:
            r2 = 66
            if (r8 != r2) goto L_0x08a3
            k89 r16 = defpackage.k89.c(r10)
            goto L_0x02d2
        L_0x08a3:
            r2 = 64
            if (r8 != r2) goto L_0x08ad
            g99 r16 = defpackage.g99.c(r10)
            goto L_0x02d2
        L_0x08ad:
            r2 = 65
            if (r8 != r2) goto L_0x08b3
            goto L_0x0e1f
        L_0x08b3:
            r2 = 67
            if (r8 != r2) goto L_0x08bd
            q89 r16 = defpackage.q89.c(r10)
            goto L_0x02d2
        L_0x08bd:
            r2 = 178(0xb2, float:2.5E-43)
            if (r8 != r2) goto L_0x08c7
            a99 r16 = defpackage.a99.c(r10)
            goto L_0x02d2
        L_0x08c7:
            r2 = 179(0xb3, float:2.51E-43)
            if (r8 != r2) goto L_0x08d2
            h89 r0 = new h89
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x08d2:
            r2 = 180(0xb4, float:2.52E-43)
            if (r8 != r2) goto L_0x08de
            om3 r0 = defpackage.om3.o
            lbe r16 = r0.q(r10)
            goto L_0x02d2
        L_0x08de:
            r2 = 181(0xb5, float:2.54E-43)
            if (r8 != r2) goto L_0x08e9
            s89 r0 = new s89
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x08e9:
            r2 = 52
            if (r8 != r2) goto L_0x08ef
            goto L_0x0e1f
        L_0x08ef:
            r2 = 54
            if (r8 != r2) goto L_0x08f5
            goto L_0x0e1f
        L_0x08f5:
            dfa r2 = defpackage.dfa.NOTIF_CONTACT
            short r2 = r2.a
            if (r8 != r2) goto L_0x0902
            ql9 r0 = new ql9
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0902:
            dfa r2 = defpackage.dfa.NOTIF_MARK
            short r2 = r2.a
            if (r8 != r2) goto L_0x0911
            zl9 r0 = new zl9
            r0.<init>(r10)
            r0.Y = r4
            goto L_0x0e1f
        L_0x0911:
            dfa r2 = defpackage.dfa.NOTIF_MESSAGE
            short r3 = r2.a
            if (r8 != r3) goto L_0x091f
            i13 r0 = r2.b
            lbe r16 = r0.q(r10)
            goto L_0x02d2
        L_0x091f:
            dfa r2 = defpackage.dfa.NOTIF_PRESENCE
            short r2 = r2.a
            if (r8 != r2) goto L_0x092c
            sm9 r0 = new sm9
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x092c:
            dfa r2 = defpackage.dfa.NOTIF_CONFIG
            short r2 = r2.a
            if (r8 != r2) goto L_0x0939
            ol9 r0 = new ol9
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0939:
            dfa r2 = defpackage.dfa.NOTIF_TYPING
            short r2 = r2.a
            if (r8 != r2) goto L_0x0946
            tm9 r0 = new tm9
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0946:
            dfa r2 = defpackage.dfa.NOTIF_CHAT
            short r2 = r2.a
            if (r8 != r2) goto L_0x0953
            ml9 r0 = new ml9
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0953:
            dfa r2 = defpackage.dfa.NOTIF_ATTACH
            short r2 = r2.a
            if (r8 != r2) goto L_0x0960
            il9 r0 = new il9
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0960:
            r2 = 80
            if (r8 != r2) goto L_0x096b
            qpa r0 = new qpa
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x096b:
            r2 = 1
            if (r8 != r2) goto L_0x0970
            goto L_0x0e1f
        L_0x0970:
            r2 = 16
            if (r8 != r2) goto L_0x097b
            h6b r0 = new h6b
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x097b:
            r2 = 21
            if (r8 != r2) goto L_0x0986
            h7e r0 = new h7e
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0986:
            r2 = 22
            if (r8 != r2) goto L_0x0991
            la3 r0 = new la3
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0991:
            r2 = 68
            if (r8 != r2) goto L_0x099c
            on2 r0 = new on2
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x099c:
            r2 = 73
            if (r8 != r2) goto L_0x09a7
            c99 r0 = new c99
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x09a7:
            r2 = 31
            if (r8 != r2) goto L_0x09ad
            goto L_0x0e1f
        L_0x09ad:
            dfa r2 = defpackage.dfa.MSG_SHARE_PREVIEW
            short r2 = r2.c()
            if (r8 != r2) goto L_0x09bc
            k99 r0 = new k99
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x09bc:
            dfa r2 = defpackage.dfa.VIDEO_PLAY
            short r2 = r2.c()
            if (r8 != r2) goto L_0x09cb
            g7f r0 = new g7f
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x09cb:
            dfa r2 = defpackage.dfa.CHAT_PIN_SET_VISIBILITY
            short r2 = r2.c()
            if (r8 != r2) goto L_0x09da
            rj2 r0 = new rj2
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x09da:
            dfa r2 = defpackage.dfa.VIDEO_UPLOAD
            short r2 = r2.c()
            if (r8 != r2) goto L_0x09e9
            x8f r0 = new x8f
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x09e9:
            dfa r2 = defpackage.dfa.CHAT_MEDIA
            short r2 = r2.c()
            if (r8 != r2) goto L_0x09f8
            eb2 r0 = new eb2
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x09f8:
            dfa r2 = defpackage.dfa.SESSIONS_INFO
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0a07
            s3d r0 = new s3d
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0a07:
            dfa r2 = defpackage.dfa.SESSIONS_CLOSE
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0a16
            q3d r0 = new q3d
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0a16:
            dfa r2 = defpackage.dfa.PHONE_BIND_REQUEST
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0a25
            eoa r0 = new eoa
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0a25:
            dfa r2 = defpackage.dfa.PHONE_BIND_CONFIRM
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0a34
            doa r0 = new doa
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0a34:
            dfa r2 = defpackage.dfa.PRESET_AVATARS
            short r3 = r2.c()
            if (r8 != r3) goto L_0x0a46
            i13 r0 = r2.a()
            lbe r16 = r0.q(r10)
            goto L_0x02d2
        L_0x0a46:
            dfa r2 = defpackage.dfa.RECONNECT
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0a55
            x2c r0 = new x2c
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0a55:
            dfa r2 = defpackage.dfa.DEBUG
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0a64
            q14 r0 = new q14
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0a64:
            dfa r2 = defpackage.dfa.LOG
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0a6e
            goto L_0x0e1f
        L_0x0a6e:
            dfa r2 = defpackage.dfa.CHATS_LIST
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0a7d
            nq2 r0 = new nq2
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0a7d:
            dfa r2 = defpackage.dfa.ASSETS_GET
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0a8c
            kt r0 = new kt
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0a8c:
            dfa r2 = defpackage.dfa.ASSETS_UPDATE
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0a9b
            vt r0 = new vt
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0a9b:
            dfa r2 = defpackage.dfa.ASSETS_GET_BY_IDS
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0aaa
            ht r0 = new ht
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0aaa:
            dfa r2 = defpackage.dfa.MSG_GET
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0ab9
            r89 r0 = new r89
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0ab9:
            dfa r2 = defpackage.dfa.MSG_GET_STAT
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0ac8
            im3 r0 = new im3
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0ac8:
            dfa r2 = defpackage.dfa.SESSION_INIT
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0ad7
            k2d r0 = new k2d
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0ad7:
            dfa r2 = defpackage.dfa.CHAT_CHECK_LINK
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0ae1
            goto L_0x0e1f
        L_0x0ae1:
            dfa r2 = defpackage.dfa.CHAT_UPDATE
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0af0
            np2 r0 = new np2
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0af0:
            dfa r2 = defpackage.dfa.CHAT_JOIN
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0aff
            r92 r0 = new r92
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0aff:
            dfa r2 = defpackage.dfa.CHAT_MEMBERS
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0b0e
            dh2 r0 = new dh2
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0b0e:
            dfa r2 = defpackage.dfa.PUBLIC_SEARCH
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0b1d
            xib r0 = new xib
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0b1d:
            dfa r2 = defpackage.dfa.CHAT_LEAVE
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0b27
            goto L_0x0e1f
        L_0x0b27:
            dfa r2 = defpackage.dfa.CHAT_CLOSE
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0b31
            goto L_0x0e1f
        L_0x0b31:
            dfa r2 = defpackage.dfa.CHAT_CREATE
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0b40
            v52 r0 = new v52
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0b40:
            dfa r2 = defpackage.dfa.CHAT_MEMBERS_UPDATE
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0b4f
            uh2 r0 = new uh2
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0b4f:
            dfa r2 = defpackage.dfa.CHAT_SUBSCRIBE
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0b59
            goto L_0x0e1f
        L_0x0b59:
            dfa r2 = defpackage.dfa.VIDEO_CHAT_START
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0b68
            lk1 r0 = new lk1
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0b68:
            dfa r2 = defpackage.dfa.NOTIF_CALL_START
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0b77
            jl9 r0 = new jl9
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0b77:
            dfa r2 = defpackage.dfa.FILE_UPLOAD
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0b86
            of5 r0 = new of5
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0b86:
            dfa r2 = defpackage.dfa.FILE_DOWNLOAD
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0b95
            pd5 r0 = new pd5
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0b95:
            dfa r2 = defpackage.dfa.NOTIF_CONTACT_SORT
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0ba4
            rl9 r0 = new rl9
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0ba4:
            dfa r2 = defpackage.dfa.LINK_INFO
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0bb3
            pd7 r0 = new pd7
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0bb3:
            dfa r2 = defpackage.dfa.CONTACT_VERIFY
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0bc2
            qn3 r0 = new qn3
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0bc2:
            dfa r2 = defpackage.dfa.REMOVE_CONTACT_PHOTO
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0bd1
            b9c r0 = new b9c
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0bd1:
            dfa r2 = defpackage.dfa.VIDEO_CHAT_HISTORY
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0be0
            k2f r0 = new k2f
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0be0:
            dfa r2 = defpackage.dfa.NOTIF_MSG_DELETE_RANGE
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0bef
            nm9 r0 = new nm9
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0bef:
            dfa r2 = defpackage.dfa.MSG_DELETE_RANGE
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0bfd
            n89 r16 = defpackage.n89.c(r10)
            goto L_0x02d2
        L_0x0bfd:
            dfa r2 = defpackage.dfa.NOTIF_MSG_DELETE
            short r3 = r2.c()
            if (r8 != r3) goto L_0x0c0f
            i13 r0 = r2.a()
            lbe r16 = r0.q(r10)
            goto L_0x02d2
        L_0x0c0f:
            dfa r2 = defpackage.dfa.NOTIF_MSG_REACTIONS_CHANGED
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0c1d
            pm9 r16 = defpackage.pm9.c(r10)
            goto L_0x02d2
        L_0x0c1d:
            dfa r2 = defpackage.dfa.NOTIF_MSG_YOU_REACTED
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0c2c
            rm9 r0 = new rm9
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0c2c:
            dfa r2 = defpackage.dfa.CONFIRM_PRESENT
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0c36
            goto L_0x0e1f
        L_0x0c36:
            dfa r2 = defpackage.dfa.CHAT_COMPLAIN
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0c40
            goto L_0x0e1f
        L_0x0c40:
            dfa r2 = defpackage.dfa.MSG_SEND_CALLBACK
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0c4f
            f99 r0 = new f99
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0c4f:
            dfa r2 = defpackage.dfa.NOTIF_CALLBACK_ANSWER
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0c5e
            kl9 r0 = new kl9
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0c5e:
            dfa r2 = defpackage.dfa.CHAT_BOT_COMMANDS
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0c6d
            l32 r0 = new l32
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0c6d:
            dfa r2 = defpackage.dfa.BOT_INFO
            short r3 = r2.c()
            if (r8 != r3) goto L_0x0c7f
            i13 r0 = r2.a()
            lbe r16 = r0.q(r10)
            goto L_0x02d2
        L_0x0c7f:
            dfa r2 = defpackage.dfa.LOCATION_SEND
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0c89
            goto L_0x0e1f
        L_0x0c89:
            dfa r2 = defpackage.dfa.LOCATION_STOP
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0c98
            tm7 r0 = new tm7
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0c98:
            dfa r2 = defpackage.dfa.LOCATION_REQUEST
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0ca8
            im3 r0 = new im3
            r2 = 2
            r0.<init>(r10, r2)
            goto L_0x0e1f
        L_0x0ca8:
            dfa r2 = defpackage.dfa.NOTIF_LOCATION_REQUEST
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0cb2
            goto L_0x0e1f
        L_0x0cb2:
            dfa r2 = defpackage.dfa.NOTIF_LOCATION
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0cc1
            xl9 r0 = new xl9
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0cc1:
            dfa r2 = defpackage.dfa.GET_LAST_MENTIONS
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0cd1
            im3 r0 = new im3
            r2 = 1
            r0.<init>(r10, r2)
            goto L_0x0e1f
        L_0x0cd1:
            dfa r2 = defpackage.dfa.GET_INBOUND_CALLS
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0ce1
            i86 r0 = new i86
            r2 = 0
            r0.<init>(r10, r2)
            goto L_0x0e1f
        L_0x0ce1:
            dfa r2 = defpackage.dfa.CALLS_TOKEN
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0cef
            bl1 r16 = gwf.J(r10)
            goto L_0x02d2
        L_0x0cef:
            dfa r2 = defpackage.dfa.NOTIF_ASSETS_UPDATE
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0cfe
            hl9 r0 = new hl9
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0cfe:
            dfa r2 = defpackage.dfa.ASSETS_LIST_MODIFY
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0d0d
            mt r0 = new mt
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0d0d:
            dfa r2 = defpackage.dfa.ASSETS_REMOVE
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0d1c
            st r0 = new st
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0d1c:
            dfa r2 = defpackage.dfa.ASSETS_MOVE
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0d2b
            pt r0 = new pt
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0d2b:
            dfa r2 = defpackage.dfa.ASSETS_ADD
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0d3a
            et r0 = new et
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0d3a:
            dfa r2 = defpackage.dfa.STICKER_CREATE
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0d49
            atd r0 = new atd
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0d49:
            dfa r2 = defpackage.dfa.STICKER_UPLOAD
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0d58
            tud r0 = new tud
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0d58:
            dfa r2 = defpackage.dfa.STICKER_SUGGEST
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0d67
            rud r0 = new rud
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0d67:
            dfa r2 = defpackage.dfa.NOTIF_DRAFT
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0d76
            tl9 r0 = new tl9
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0d76:
            dfa r2 = defpackage.dfa.NOTIF_DRAFT_DISCARD
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0d85
            ul9 r0 = new ul9
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0d85:
            dfa r2 = defpackage.dfa.DRAFT_SAVE
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0d94
            cm4 r0 = new cm4
            r0.<init>(r10)
            goto L_0x0e1f
        L_0x0d94:
            dfa r2 = defpackage.dfa.DRAFT_DISCARD
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0d9e
            goto L_0x0e1f
        L_0x0d9e:
            dfa r2 = defpackage.dfa.CHAT_HIDE
            short r2 = r2.c()
            if (r8 != r2) goto L_0x0da8
            goto L_0x0e1f
        L_0x0da8:
            dfa r0 = defpackage.dfa.VIDEO_CHAT_MEMBERS
            short r0 = r0.c()
            if (r8 != r0) goto L_0x0db7
            i86 r0 = new i86
            r2 = 1
            r0.<init>(r10, r2)
            goto L_0x0e1f
        L_0x0db7:
            dfa r0 = defpackage.dfa.CHAT_SEARCH_COMMON_PARTICIPANTS
            short r0 = r0.c()
            if (r8 != r0) goto L_0x0dc5
            qn2 r16 = defpackage.qn2.c(r10)
            goto L_0x02d2
        L_0x0dc5:
            dfa r0 = defpackage.dfa.NOTIF_MSG_DELAYED
            short r2 = r0.c()
            if (r8 != r2) goto L_0x0dd7
            i13 r0 = r0.a()
            lbe r16 = r0.q(r10)
            goto L_0x02d2
        L_0x0dd7:
            dfa r0 = defpackage.dfa.PROFILE_DELETE
            short r2 = r0.c()
            if (r8 != r2) goto L_0x0de9
            i13 r0 = r0.a()
            lbe r16 = r0.q(r10)
            goto L_0x02d2
        L_0x0de9:
            dfa r0 = defpackage.dfa.PROFILE_DELETE_TIME
            short r2 = r0.c()
            if (r8 != r2) goto L_0x0dfb
            i13 r0 = r0.a()
            lbe r16 = r0.q(r10)
            goto L_0x02d2
        L_0x0dfb:
            dfa r0 = defpackage.dfa.WEB_APP_INIT_DATA
            short r2 = r0.c()
            if (r8 != r2) goto L_0x0e0d
            i13 r0 = r0.a()
            lbe r16 = r0.q(r10)
            goto L_0x02d2
        L_0x0e0d:
            dfa r0 = defpackage.dfa.EXTERNAL_CALLBACK
            short r2 = r0.c()
            if (r8 != r2) goto L_0x02d2
            i13 r0 = r0.a()
            lbe r16 = r0.q(r10)
            goto L_0x02d2
        L_0x0e1f:
            boolean r2 = r0 instanceof defpackage.k2d
            if (r2 == 0) goto L_0x0e35
            r3 = r0
            k2d r3 = (defpackage.k2d) r3
            int r3 = r3.X
            r4 = 1
            if (r3 == r4) goto L_0x0e36
            u1d r2 = r1.b
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.g
            r2.set(r4)
        L_0x0e32:
            r2 = r35
            goto L_0x0e4a
        L_0x0e35:
            r4 = 1
        L_0x0e36:
            if (r2 == 0) goto L_0x0e32
            r2 = r0
            k2d r2 = (defpackage.k2d) r2
            int r2 = r2.X
            if (r2 != r4) goto L_0x0e32
            r2 = r35
            r2.c(r0)
            u1d r0 = r1.b
            r0.d(r4)
            return
        L_0x0e4a:
            boolean r3 = r0 instanceof defpackage.jo7
            if (r3 == 0) goto L_0x0e67
            u1d r3 = r1.b
            java.util.concurrent.atomic.AtomicInteger r4 = defpackage.u1d.D
            r4 = 2
            r3.m(r4)
            u1d r3 = r1.b
            boolean r5 = r3.i()
            if (r5 == 0) goto L_0x0e67
            kd3 r3 = r3.s
            h3d r3 = (defpackage.h3d) r3
            r3.i = r4
            r3.b()
        L_0x0e67:
            if (r0 != 0) goto L_0x0ea4
            r3 = r34
            short r0 = r3.d
            jk9 r4 = defpackage.dfa.c
            r4.getClass()
            java.lang.String r0 = jk9.l(r0)
            java.lang.String r4 = "Unknown response type, define it in TamResponse.decode: "
            java.lang.String r0 = r4.concat(r0)
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r0)
            u1d r8 = r1.b
            long r10 = r35.f()
            short r12 = r3.c
            short r13 = r3.d
            java.lang.String r15 = r4.toString()
            java.util.concurrent.atomic.AtomicInteger r2 = defpackage.u1d.D
            r14 = 0
            r9 = r22
            r8.j(r9, r10, r12, r13, r14, r15)
            u1d r2 = r1.b
            java.lang.String r2 = r2.a
            udd.s(r2, r0, r4)
            u1d r0 = r1.b
            r0.l(r4)
            return
        L_0x0ea4:
            r3 = r34
            boolean r4 = r0 instanceof defpackage.co7
            if (r4 == 0) goto L_0x0ec3
            r4 = r0
            co7 r4 = (defpackage.co7) r4
            u1d r5 = r1.b
            yz9 r5 = r5.o
            boolean r5 = r5.a()
            u1d r6 = r1.b
            yz9 r6 = r6.o
            boolean r6 = r6.b()
            java.lang.String r4 = r4.a(r5, r6)
        L_0x0ec1:
            r15 = r4
            goto L_0x0ec8
        L_0x0ec3:
            java.lang.String r4 = r0.toString()
            goto L_0x0ec1
        L_0x0ec8:
            u1d r8 = r1.b
            long r10 = r35.f()
            short r12 = r3.c
            short r13 = r3.d
            java.util.concurrent.atomic.AtomicInteger r1 = defpackage.u1d.D
            r14 = 0
            r9 = r22
            r8.j(r9, r10, r12, r13, r14, r15)
            r2.c(r0)
            goto L_0x0f21
        L_0x0ede:
            r22 = r9
            r31 = r3
            r3 = r2
            r2 = r31
            u1d r8 = r1.b
            long r10 = r35.f()
            short r12 = r3.c
            short r13 = r3.d
            java.util.concurrent.atomic.AtomicInteger r0 = defpackage.u1d.D
            r14 = 0
            java.lang.String r15 = "empty"
            r9 = r22
            r8.j(r9, r10, r12, r13, r14, r15)
            short r0 = r3.d
            dfa r4 = defpackage.dfa.LOGOUT
            short r4 = r4.c()
            if (r0 != r4) goto L_0x0f1c
            u1d r0 = r1.b
            java.util.concurrent.ConcurrentHashMap r0 = r0.u
            short r3 = r3.c
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            r0.remove(r3)
            kbe r0 = defpackage.lbe.b
            r2.c(r0)
            u1d r0 = r1.b
            r1 = 0
            r0.f(r1, r1)
            goto L_0x0f21
        L_0x0f1c:
            kbe r0 = defpackage.lbe.b
            r2.c(r0)
        L_0x0f21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s1d.e(byte[], kia, iae):void");
    }

    public kia f() {
        byte[] bArr = new byte[10];
        this.b.r.readFully(bArr, 0, 10);
        return new kia(bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        r2 = r14.b;
        r3 = defpackage.u1d.D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r2.i() == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2 = r14.b.w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003f, code lost:
        udd.s(r14.b.a, "exception in packet sender", r2);
        r14.b.l(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = defpackage.u1d.D;
        r0 = r14.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0052, code lost:
        r2 = defpackage.u1d.D;
        r2 = r14.b;
        r3 = r2.i();
        r4 = r2.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005c, code lost:
        if (r3 == false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0063, code lost:
        if (r2.h() == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0069, code lost:
        if (r2.i() != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        java.lang.Thread.sleep(100);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r0.i() == false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0071, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0074, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0077, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r5 = f();
        r9 = r5.g;
        r7 = new byte[r9];
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0083, code lost:
        r8 = r5.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0085, code lost:
        if (r6 >= r8) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0087, code lost:
        r8 = r2.r.read(r7, r6, java.lang.Math.min(256, r9 - r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0095, code lost:
        if (r8 < 0) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0097, code lost:
        r6 = r6 + r8;
        r2.d.set(java.lang.System.currentTimeMillis());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a7, code lost:
        throw new java.io.EOFException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a8, code lost:
        r6 = r5.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00aa, code lost:
        if (r6 == 0) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ac, code lost:
        r12 = r8 * r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r13 = new byte[r12];
        defpackage.x87.N().safeDecompressor().decompress(r7, 0, r9, r13, 0, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00be, code lost:
        r7 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c0, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        udd.u(r4, r6, "LZ4Utils.decompress failure! packet = %s", new java.lang.Object[]{r5});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ca, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00cd, code lost:
        if (r5.b != 0) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00cf, code lost:
        e(r7, r5, new s5c(r14, 2, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00da, code lost:
        d(r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00df, code lost:
        udd.s(r4, "exception in packet reader", r3);
        r2.l(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e9, code lost:
        udd.R(r4, r5, "IOException in packet reader", new java.lang.Object[0]);
        r2.f(false, false);
        r2.l(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00f8, code lost:
        udd.u(r4, r5, "Malformed input packet detected", new java.lang.Object[0]);
        r2.f(false, false);
        r2.l(new java.io.IOException("Corrupted input data"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        udd.s(r0.a, "exception in timeout handler", r1);
        r0.l(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            r0 = 100
            int r2 = r14.a
            switch(r2) {
                case 0: goto L_0x0052;
                case 1: goto L_0x0027;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.util.concurrent.atomic.AtomicInteger r0 = defpackage.u1d.D
            u1d r0 = r14.b
            boolean r1 = r0.i()
            if (r1 == 0) goto L_0x0026
            r14.b()     // Catch:{ Exception -> 0x0015 }
            goto L_0x0020
        L_0x0015:
            r1 = move-exception
            java.lang.String r2 = r0.a
            java.lang.String r3 = "exception in timeout handler"
            udd.s(r2, r3, r1)
            r0.l(r1)
        L_0x0020:
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0026 }
            goto L_0x0007
        L_0x0026:
            return
        L_0x0027:
            u1d r2 = r14.b
            java.util.concurrent.atomic.AtomicInteger r3 = defpackage.u1d.D
            boolean r2 = r2.i()
            if (r2 == 0) goto L_0x0051
            u1d r2 = r14.b     // Catch:{ Exception -> 0x003e }
            java.lang.Object r2 = r2.w     // Catch:{ Exception -> 0x003e }
            monitor-enter(r2)     // Catch:{ Exception -> 0x003e }
            r14.c()     // Catch:{ all -> 0x003b }
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            goto L_0x004d
        L_0x003b:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            throw r3     // Catch:{ Exception -> 0x003e }
        L_0x003e:
            r2 = move-exception
            u1d r3 = r14.b
            java.lang.String r3 = r3.a
            java.lang.String r4 = "exception in packet sender"
            udd.s(r3, r4, r2)
            u1d r3 = r14.b
            r3.l(r2)
        L_0x004d:
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0051 }
            goto L_0x0027
        L_0x0051:
            return
        L_0x0052:
            java.util.concurrent.atomic.AtomicInteger r2 = defpackage.u1d.D
            u1d r2 = r14.b
            boolean r3 = r2.i()
            java.lang.String r4 = r2.a
            if (r3 == 0) goto L_0x010e
        L_0x005e:
            r3 = 0
            boolean r5 = r2.h()     // Catch:{ MalformedPacketException -> 0x0077, IOException -> 0x0074, Exception -> 0x0071 }
            if (r5 == 0) goto L_0x007a
            boolean r5 = r2.i()     // Catch:{ MalformedPacketException -> 0x0077, IOException -> 0x0074, Exception -> 0x0071 }
            if (r5 != 0) goto L_0x006d
            goto L_0x010e
        L_0x006d:
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x010e }
            goto L_0x005e
        L_0x0071:
            r3 = move-exception
            goto L_0x00df
        L_0x0074:
            r5 = move-exception
            goto L_0x00e9
        L_0x0077:
            r5 = move-exception
            goto L_0x00f8
        L_0x007a:
            kia r5 = r14.f()     // Catch:{ MalformedPacketException -> 0x0077, IOException -> 0x0074, Exception -> 0x0071 }
            int r9 = r5.g     // Catch:{ MalformedPacketException -> 0x0077, IOException -> 0x0074, Exception -> 0x0071 }
            byte[] r7 = new byte[r9]     // Catch:{ MalformedPacketException -> 0x0077, IOException -> 0x0074, Exception -> 0x0071 }
            r6 = r3
        L_0x0083:
            int r8 = r5.g     // Catch:{ MalformedPacketException -> 0x0077, IOException -> 0x0074, Exception -> 0x0071 }
            if (r6 >= r8) goto L_0x00a8
            java.io.DataInputStream r8 = r2.r     // Catch:{ MalformedPacketException -> 0x0077, IOException -> 0x0074, Exception -> 0x0071 }
            int r10 = r9 - r6
            r11 = 256(0x100, float:3.59E-43)
            int r10 = java.lang.Math.min(r11, r10)     // Catch:{ MalformedPacketException -> 0x0077, IOException -> 0x0074, Exception -> 0x0071 }
            int r8 = r8.read(r7, r6, r10)     // Catch:{ MalformedPacketException -> 0x0077, IOException -> 0x0074, Exception -> 0x0071 }
            if (r8 < 0) goto L_0x00a2
            int r6 = r6 + r8
            java.util.concurrent.atomic.AtomicLong r8 = r2.d     // Catch:{ MalformedPacketException -> 0x0077, IOException -> 0x0074, Exception -> 0x0071 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ MalformedPacketException -> 0x0077, IOException -> 0x0074, Exception -> 0x0071 }
            r8.set(r10)     // Catch:{ MalformedPacketException -> 0x0077, IOException -> 0x0074, Exception -> 0x0071 }
            goto L_0x0083
        L_0x00a2:
            java.io.EOFException r5 = new java.io.EOFException     // Catch:{ MalformedPacketException -> 0x0077, IOException -> 0x0074, Exception -> 0x0071 }
            r5.<init>()     // Catch:{ MalformedPacketException -> 0x0077, IOException -> 0x0074, Exception -> 0x0071 }
            throw r5     // Catch:{ MalformedPacketException -> 0x0077, IOException -> 0x0074, Exception -> 0x0071 }
        L_0x00a8:
            byte r6 = r5.e     // Catch:{ MalformedPacketException -> 0x0077, IOException -> 0x0074, Exception -> 0x0071 }
            if (r6 == 0) goto L_0x00cb
            int r12 = r8 * r6
            byte[] r13 = new byte[r12]     // Catch:{ all -> 0x00c0 }
            net.jpountz.lz4.LZ4Factory r6 = defpackage.x87.N()     // Catch:{ all -> 0x00c0 }
            net.jpountz.lz4.LZ4SafeDecompressor r6 = r6.safeDecompressor()     // Catch:{ all -> 0x00c0 }
            r11 = 0
            r8 = 0
            r10 = r13
            r6.decompress(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00c0 }
            r7 = r13
            goto L_0x00cb
        L_0x00c0:
            r6 = move-exception
            java.lang.String r7 = "LZ4Utils.decompress failure! packet = %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch:{ MalformedPacketException -> 0x0077, IOException -> 0x0074, Exception -> 0x0071 }
            udd.u(r4, r6, r7, r5)     // Catch:{ MalformedPacketException -> 0x0077, IOException -> 0x0074, Exception -> 0x0071 }
            throw r6     // Catch:{ MalformedPacketException -> 0x0077, IOException -> 0x0074, Exception -> 0x0071 }
        L_0x00cb:
            byte r6 = r5.b     // Catch:{ MalformedPacketException -> 0x0077, IOException -> 0x0074, Exception -> 0x0071 }
            if (r6 != 0) goto L_0x00da
            s5c r6 = new s5c     // Catch:{ MalformedPacketException -> 0x0077, IOException -> 0x0074, Exception -> 0x0071 }
            r8 = 2
            r6.<init>(r14, r8, r5)     // Catch:{ MalformedPacketException -> 0x0077, IOException -> 0x0074, Exception -> 0x0071 }
            r14.e(r7, r5, r6)     // Catch:{ MalformedPacketException -> 0x0077, IOException -> 0x0074, Exception -> 0x0071 }
            goto L_0x0052
        L_0x00da:
            r14.d(r5, r7)     // Catch:{ MalformedPacketException -> 0x0077, IOException -> 0x0074, Exception -> 0x0071 }
            goto L_0x0052
        L_0x00df:
            java.lang.String r5 = "exception in packet reader"
            udd.s(r4, r5, r3)
            r2.l(r3)
            goto L_0x0052
        L_0x00e9:
            java.lang.String r6 = "IOException in packet reader"
            java.lang.Object[] r7 = new java.lang.Object[r3]
            udd.R(r4, r5, r6, r7)
            r2.f(r3, r3)
            r2.l(r5)
            goto L_0x0052
        L_0x00f8:
            java.lang.String r6 = "Malformed input packet detected"
            java.lang.Object[] r7 = new java.lang.Object[r3]
            udd.u(r4, r5, r6, r7)
            r2.f(r3, r3)
            ru.ok.tamtam.api.CorruptedInputDataException r3 = new ru.ok.tamtam.api.CorruptedInputDataException
            java.lang.String r4 = "Corrupted input data"
            r3.<init>(r4)
            r2.l(r3)
            goto L_0x0052
        L_0x010e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s1d.run():void");
    }
}
