package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: jl4  reason: default package */
public final class jl4 extends Handler {
    public final HandlerThread a;
    public final vuf b;
    public final ul4 c;
    public final Handler d;
    public final ArrayList e;
    public final HashMap f;
    public int g;
    public boolean h;
    public int i = 3;
    public int j = 5;
    public int k;
    public boolean l;

    public jl4(HandlerThread handlerThread, o64 o64, p64 p64, Handler handler, boolean z) {
        super(handlerThread.getLooper());
        this.a = handlerThread;
        this.b = o64;
        this.c = p64;
        this.d = handler;
        this.h = z;
        this.e = new ArrayList();
        this.f = new HashMap();
    }

    public static zj4 a(zj4 zj4, int i2, int i3) {
        return new zj4(zj4.a, i2, zj4.c, System.currentTimeMillis(), zj4.e, i3, 0, zj4.h);
    }

    public final zj4 b(String str, boolean z) {
        int c2 = c(str);
        if (c2 != -1) {
            return (zj4) this.e.get(c2);
        }
        if (!z) {
            return null;
        }
        try {
            return ((o64) this.b).d(str);
        } catch (IOException e2) {
            ez3.B("Failed to load download: " + str, e2);
            return null;
        }
    }

    public final int c(String str) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i2 >= arrayList.size()) {
                return -1;
            }
            if (((zj4) arrayList.get(i2)).a.a.equals(str)) {
                return i2;
            }
            i2++;
        }
    }

    public final void d(zj4 zj4) {
        int i2 = zj4.b;
        boolean z = true;
        oyb.k((i2 == 3 || i2 == 4) ? false : true);
        int c2 = c(zj4.a.a);
        ArrayList arrayList = this.e;
        if (c2 == -1) {
            arrayList.add(zj4);
            Collections.sort(arrayList, new xb4(2));
        } else {
            if (zj4.c == ((zj4) arrayList.get(c2)).c) {
                z = false;
            }
            arrayList.set(c2, zj4);
            if (z) {
                Collections.sort(arrayList, new xb4(2));
            }
        }
        try {
            ((o64) this.b).i(zj4);
        } catch (IOException e2) {
            ez3.B("Failed to update index.", e2);
        }
        this.d.obtainMessage(3, new il4(zj4, false, new ArrayList(arrayList), (Exception) null)).sendToTarget();
    }

    public final zj4 e(zj4 zj4, int i2, int i3) {
        oyb.k((i2 == 3 || i2 == 4) ? false : true);
        zj4 a2 = a(zj4, i2, i3);
        d(a2);
        return a2;
    }

    public final void f(zj4 zj4, int i2) {
        zj4 zj42 = zj4;
        int i3 = i2;
        if (i3 == 0) {
            if (zj42.b == 1) {
                e(zj4, 0, 0);
            }
        } else if (i3 != zj42.f) {
            int i4 = zj42.b;
            if (i4 == 0 || i4 == 2) {
                i4 = 1;
            }
            d(new zj4(zj42.a, i4, zj42.c, System.currentTimeMillis(), zj42.e, i2, 0, zj42.h));
        }
    }

    public final void g() {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i2 < arrayList.size()) {
                zj4 zj4 = (zj4) arrayList.get(i2);
                HashMap hashMap = this.f;
                ll4 ll4 = (ll4) hashMap.get(zj4.a.a);
                ul4 ul4 = this.c;
                int i4 = zj4.b;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ll4.getClass();
                            oyb.k(!ll4.o);
                            if (this.h || this.g != 0 || i3 >= this.i) {
                                e(zj4, 0, 0);
                                ll4.a(false);
                            }
                        } else if (i4 != 5 && i4 != 7) {
                            throw new IllegalStateException();
                        } else if (ll4 != null) {
                            if (!ll4.o) {
                                ll4.a(false);
                            }
                        } else if (!this.l) {
                            pl4 pl4 = zj4.a;
                            ll4 ll42 = new ll4(zj4.a, ((p64) ul4).a(pl4), zj4.h, true, this.j, this);
                            hashMap.put(pl4.a, ll42);
                            this.l = true;
                            ll42.start();
                        }
                    } else if (ll4 != null) {
                        oyb.k(!ll4.o);
                        ll4.a(false);
                    }
                } else if (ll4 != null) {
                    oyb.k(!ll4.o);
                    ll4.a(false);
                } else if (this.h || this.g != 0 || this.k >= this.i) {
                    ll4 = null;
                } else {
                    zj4 e2 = e(zj4, 2, 0);
                    pl4 pl42 = e2.a;
                    ll4 ll43 = new ll4(e2.a, ((p64) ul4).a(pl42), e2.h, false, this.j, this);
                    hashMap.put(pl42.a, ll43);
                    int i5 = this.k;
                    this.k = i5 + 1;
                    if (i5 == 0) {
                        sendEmptyMessageDelayed(12, 5000);
                    }
                    ll43.start();
                    ll4 = ll43;
                }
                if (ll4 != null && !ll4.o) {
                    i3++;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r10v5, types: [int] */
    /* JADX WARNING: type inference failed for: r10v7, types: [int] */
    /* JADX WARNING: type inference failed for: r10v9, types: [int] */
    /* JADX WARNING: type inference failed for: r10v11 */
    /* JADX WARNING: type inference failed for: r10v12 */
    /* JADX WARNING: type inference failed for: r10v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        r0 = r1.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (r10 >= r0.size()) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        r0 = (defpackage.zj4) r0.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
        if (r0.b != 2) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        ((defpackage.o64) r1.b).i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
        defpackage.ez3.B("Failed to update index.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        sendEmptyMessageDelayed(12, 5000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007b, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r33) {
        /*
            r32 = this;
            r1 = r32
            r0 = r33
            int r2 = r0.what
            r3 = 12
            r4 = 4
            r5 = 7
            r6 = 3
            r7 = 0
            r8 = 2
            r9 = 5
            r10 = 0
            r11 = 1
            switch(r2) {
                case 1: goto L_0x03fd;
                case 2: goto L_0x03f2;
                case 3: goto L_0x03e9;
                case 4: goto L_0x037e;
                case 5: goto L_0x0375;
                case 6: goto L_0x036f;
                case 7: goto L_0x02b4;
                case 8: goto L_0x028f;
                case 9: goto L_0x01e3;
                case 10: goto L_0x00cc;
                case 11: goto L_0x007c;
                case 12: goto L_0x0054;
                case 13: goto L_0x0019;
                default: goto L_0x0013;
            }
        L_0x0013:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0019:
            java.util.HashMap r0 = r1.f
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x0023:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0033
            java.lang.Object r2 = r0.next()
            ll4 r2 = (defpackage.ll4) r2
            r2.a(r11)
            goto L_0x0023
        L_0x0033:
            vuf r0 = r1.b     // Catch:{ IOException -> 0x003b }
            o64 r0 = (defpackage.o64) r0     // Catch:{ IOException -> 0x003b }
            r0.k()     // Catch:{ IOException -> 0x003b }
            goto L_0x0041
        L_0x003b:
            r0 = move-exception
            java.lang.String r2 = "Failed to update index."
            defpackage.ez3.B(r2, r0)
        L_0x0041:
            java.util.ArrayList r0 = r1.e
            r0.clear()
            android.os.HandlerThread r0 = r1.a
            r0.quit()
            monitor-enter(r32)
            r32.notifyAll()     // Catch:{ all -> 0x0051 }
            monitor-exit(r32)     // Catch:{ all -> 0x0051 }
            return
        L_0x0051:
            r0 = move-exception
            monitor-exit(r32)     // Catch:{ all -> 0x0051 }
            throw r0
        L_0x0054:
            java.util.ArrayList r0 = r1.e
            int r2 = r0.size()
            if (r10 >= r2) goto L_0x0076
            java.lang.Object r0 = r0.get(r10)
            zj4 r0 = (defpackage.zj4) r0
            int r2 = r0.b
            if (r2 != r8) goto L_0x0074
            vuf r2 = r1.b     // Catch:{ IOException -> 0x006e }
            o64 r2 = (defpackage.o64) r2     // Catch:{ IOException -> 0x006e }
            r2.i(r0)     // Catch:{ IOException -> 0x006e }
            goto L_0x0074
        L_0x006e:
            r0 = move-exception
            java.lang.String r2 = "Failed to update index."
            defpackage.ez3.B(r2, r0)
        L_0x0074:
            int r10 = r10 + r11
            goto L_0x0054
        L_0x0076:
            r4 = 5000(0x1388, double:2.4703E-320)
            r1.sendEmptyMessageDelayed(r3, r4)
            return
        L_0x007c:
            java.lang.Object r2 = r0.obj
            ll4 r2 = (defpackage.ll4) r2
            int r3 = r0.arg1
            int r0 = r0.arg2
            int r4 = defpackage.oze.a
            long r3 = (long) r3
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            r7 = 32
            long r3 = r3 << r7
            long r7 = (long) r0
            long r5 = r5 & r7
            long r18 = r3 | r5
            pl4 r0 = r2.a
            java.lang.String r0 = r0.a
            zj4 r0 = r1.b(r0, r10)
            r0.getClass()
            long r2 = r0.e
            int r2 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00cb
            r2 = -1
            int r2 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x00ac
            goto L_0x00cb
        L_0x00ac:
            zj4 r2 = new zj4
            long r16 = java.lang.System.currentTimeMillis()
            int r3 = r0.g
            ol4 r4 = r0.h
            pl4 r12 = r0.a
            int r13 = r0.b
            long r14 = r0.c
            int r0 = r0.f
            r11 = r2
            r20 = r0
            r21 = r3
            r22 = r4
            r11.<init>(r12, r13, r14, r16, r18, r20, r21, r22)
            r1.d(r2)
        L_0x00cb:
            return
        L_0x00cc:
            java.lang.Object r0 = r0.obj
            ll4 r0 = (defpackage.ll4) r0
            pl4 r2 = r0.a
            java.lang.String r2 = r2.a
            java.util.HashMap r12 = r1.f
            r12.remove(r2)
            boolean r12 = r0.o
            if (r12 == 0) goto L_0x00e0
            r1.l = r10
            goto L_0x00ea
        L_0x00e0:
            int r13 = r1.k
            int r13 = r13 - r11
            r1.k = r13
            if (r13 != 0) goto L_0x00ea
            r1.removeMessages(r3)
        L_0x00ea:
            boolean r3 = r0.Z
            if (r3 == 0) goto L_0x00f3
            r32.g()
            goto L_0x0467
        L_0x00f3:
            java.lang.Exception r3 = r0.w0
            if (r3 == 0) goto L_0x0112
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Task failed: "
            r13.<init>(r14)
            pl4 r0 = r0.a
            r13.append(r0)
            java.lang.String r0 = ", "
            r13.append(r0)
            r13.append(r12)
            java.lang.String r0 = r13.toString()
            defpackage.ez3.B(r0, r3)
        L_0x0112:
            zj4 r2 = r1.b(r2, r10)
            r2.getClass()
            int r0 = r2.b
            if (r0 == r8) goto L_0x0184
            if (r0 == r9) goto L_0x0128
            if (r0 != r5) goto L_0x0122
            goto L_0x0128
        L_0x0122:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0128:
            defpackage.oyb.k(r12)
            int r0 = r2.b
            if (r0 != r5) goto L_0x013c
            int r0 = r2.f
            if (r0 != 0) goto L_0x0134
            r11 = r10
        L_0x0134:
            r1.e(r2, r11, r0)
            r32.g()
            goto L_0x01de
        L_0x013c:
            pl4 r0 = r2.a
            java.lang.String r3 = r0.a
            int r3 = r1.c(r3)
            java.util.ArrayList r4 = r1.e
            r4.remove(r3)
            vuf r3 = r1.b     // Catch:{ IOException -> 0x016b }
            java.lang.String r0 = r0.a     // Catch:{ IOException -> 0x016b }
            o64 r3 = (defpackage.o64) r3     // Catch:{ IOException -> 0x016b }
            r3.b()     // Catch:{ IOException -> 0x016b }
            c04 r3 = r3.a     // Catch:{ SQLiteException -> 0x0164 }
            android.database.sqlite.SQLiteDatabase r3 = r3.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0164 }
            java.lang.String r5 = "ExoPlayerDownloads"
            java.lang.String r9 = "id = ?"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ SQLiteException -> 0x0164 }
            r3.delete(r5, r9, r0)     // Catch:{ SQLiteException -> 0x0164 }
            goto L_0x0170
        L_0x0164:
            r0 = move-exception
            androidx.media3.database.DatabaseIOException r3 = new androidx.media3.database.DatabaseIOException     // Catch:{ IOException -> 0x016b }
            r3.<init>(r0)     // Catch:{ IOException -> 0x016b }
            throw r3     // Catch:{ IOException -> 0x016b }
        L_0x016b:
            java.lang.String r0 = "Failed to remove from database"
            defpackage.ez3.A(r0)
        L_0x0170:
            il4 r0 = new il4
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r4)
            r0.<init>(r2, r11, r3, r7)
            android.os.Handler r2 = r1.d
            android.os.Message r0 = r2.obtainMessage(r6, r0)
            r0.sendToTarget()
            goto L_0x01de
        L_0x0184:
            r0 = r12 ^ 1
            defpackage.oyb.k(r0)
            zj4 r5 = new zj4
            pl4 r13 = r2.a
            if (r3 != 0) goto L_0x0191
            r14 = r6
            goto L_0x0192
        L_0x0191:
            r14 = r4
        L_0x0192:
            long r17 = java.lang.System.currentTimeMillis()
            if (r3 != 0) goto L_0x019b
            r22 = r10
            goto L_0x019d
        L_0x019b:
            r22 = r11
        L_0x019d:
            ol4 r0 = r2.h
            long r11 = r2.c
            long r8 = r2.e
            int r2 = r2.f
            r15 = r11
            r12 = r5
            r19 = r8
            r21 = r2
            r23 = r0
            r12.<init>(r13, r14, r15, r17, r19, r21, r22, r23)
            java.util.ArrayList r2 = r1.e
            pl4 r0 = r5.a
            java.lang.String r0 = r0.a
            int r0 = r1.c(r0)
            r2.remove(r0)
            vuf r0 = r1.b     // Catch:{ IOException -> 0x01c5 }
            o64 r0 = (defpackage.o64) r0     // Catch:{ IOException -> 0x01c5 }
            r0.i(r5)     // Catch:{ IOException -> 0x01c5 }
            goto L_0x01cb
        L_0x01c5:
            r0 = move-exception
            java.lang.String r4 = "Failed to update index."
            defpackage.ez3.B(r4, r0)
        L_0x01cb:
            il4 r0 = new il4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
            r0.<init>(r5, r10, r4, r3)
            android.os.Handler r2 = r1.d
            android.os.Message r0 = r2.obtainMessage(r6, r0)
            r0.sendToTarget()
        L_0x01de:
            r32.g()
            goto L_0x0467
        L_0x01e3:
            vuf r2 = r1.b
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int[] r0 = new int[]{r6, r4}     // Catch:{ IOException -> 0x0220 }
            r4 = r2
            o64 r4 = (defpackage.o64) r4     // Catch:{ IOException -> 0x0220 }
            r4.b()     // Catch:{ IOException -> 0x0220 }
            java.lang.String r0 = defpackage.o64.g(r0)     // Catch:{ IOException -> 0x0220 }
            android.database.Cursor r4 = r4.c(r0, r7)     // Catch:{ IOException -> 0x0220 }
        L_0x01fc:
            int r0 = r4.getPosition()     // Catch:{ all -> 0x020f }
            int r0 = r0 + r11
            boolean r0 = r4.moveToPosition(r0)     // Catch:{ all -> 0x020f }
            if (r0 == 0) goto L_0x0212
            zj4 r0 = defpackage.o64.e(r4)     // Catch:{ all -> 0x020f }
            r3.add(r0)     // Catch:{ all -> 0x020f }
            goto L_0x01fc
        L_0x020f:
            r0 = move-exception
            r5 = r0
            goto L_0x0216
        L_0x0212:
            r4.close()     // Catch:{ IOException -> 0x0220 }
            goto L_0x0225
        L_0x0216:
            r4.close()     // Catch:{ all -> 0x021a }
            goto L_0x021f
        L_0x021a:
            r0 = move-exception
            r4 = r0
            r5.addSuppressed(r4)     // Catch:{ IOException -> 0x0220 }
        L_0x021f:
            throw r5     // Catch:{ IOException -> 0x0220 }
        L_0x0220:
            java.lang.String r0 = "Failed to load downloads."
            defpackage.ez3.A(r0)
        L_0x0225:
            r0 = r10
        L_0x0226:
            java.util.ArrayList r4 = r1.e
            int r5 = r4.size()
            if (r0 >= r5) goto L_0x023d
            java.lang.Object r5 = r4.get(r0)
            zj4 r5 = (defpackage.zj4) r5
            zj4 r5 = a(r5, r9, r10)
            r4.set(r0, r5)
            int r0 = r0 + r11
            goto L_0x0226
        L_0x023d:
            r0 = r10
        L_0x023e:
            int r5 = r3.size()
            if (r0 >= r5) goto L_0x0253
            java.lang.Object r5 = r3.get(r0)
            zj4 r5 = (defpackage.zj4) r5
            zj4 r5 = a(r5, r9, r10)
            r4.add(r5)
            int r0 = r0 + r11
            goto L_0x023e
        L_0x0253:
            xb4 r0 = new xb4
            r3 = 2
            r0.<init>(r3)
            java.util.Collections.sort(r4, r0)
            o64 r2 = (defpackage.o64) r2     // Catch:{ IOException -> 0x0262 }
            r2.l()     // Catch:{ IOException -> 0x0262 }
            goto L_0x0268
        L_0x0262:
            r0 = move-exception
            java.lang.String r2 = "Failed to update index."
            defpackage.ez3.B(r2, r0)
        L_0x0268:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            r2 = r10
        L_0x026e:
            int r3 = r4.size()
            if (r2 >= r3) goto L_0x028a
            il4 r3 = new il4
            java.lang.Object r5 = r4.get(r2)
            zj4 r5 = (defpackage.zj4) r5
            r3.<init>(r5, r10, r0, r7)
            android.os.Handler r5 = r1.d
            android.os.Message r3 = r5.obtainMessage(r6, r3)
            r3.sendToTarget()
            int r2 = r2 + r11
            goto L_0x026e
        L_0x028a:
            r32.g()
            goto L_0x0466
        L_0x028f:
            java.lang.Object r0 = r0.obj
            java.lang.String r0 = (java.lang.String) r0
            zj4 r2 = r1.b(r0, r11)
            if (r2 != 0) goto L_0x02ac
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to remove nonexistent download: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            defpackage.ez3.A(r0)
            goto L_0x0466
        L_0x02ac:
            r1.e(r2, r9, r10)
            r32.g()
            goto L_0x0466
        L_0x02b4:
            java.lang.Object r2 = r0.obj
            r13 = r2
            pl4 r13 = (defpackage.pl4) r13
            int r0 = r0.arg1
            java.lang.String r2 = r13.a
            zj4 r2 = r1.b(r2, r11)
            long r19 = java.lang.System.currentTimeMillis()
            if (r2 == 0) goto L_0x0356
            int r3 = r2.b
            if (r3 == r9) goto L_0x02d5
            if (r3 == r6) goto L_0x02d5
            if (r3 != r4) goto L_0x02d0
            goto L_0x02d5
        L_0x02d0:
            long r6 = r2.c
            r17 = r6
            goto L_0x02d7
        L_0x02d5:
            r17 = r19
        L_0x02d7:
            if (r3 == r9) goto L_0x02e4
            if (r3 != r5) goto L_0x02dc
            goto L_0x02e4
        L_0x02dc:
            if (r0 == 0) goto L_0x02e1
            r16 = r11
            goto L_0x02e6
        L_0x02e1:
            r16 = r10
            goto L_0x02e6
        L_0x02e4:
            r16 = r5
        L_0x02e6:
            zj4 r3 = new zj4
            pl4 r2 = r2.a
            r2.getClass()
            java.lang.String r4 = r13.a
            java.lang.String r5 = r2.a
            boolean r4 = r5.equals(r4)
            defpackage.oyb.d(r4)
            java.util.List r4 = r2.o
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x0328
            java.util.List r5 = r13.o
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0309
            goto L_0x0328
        L_0x0309:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r4)
        L_0x030e:
            int r4 = r5.size()
            if (r10 >= r4) goto L_0x0325
            java.lang.Object r4 = r5.get(r10)
            izd r4 = (defpackage.izd) r4
            boolean r7 = r6.contains(r4)
            if (r7 != 0) goto L_0x0323
            r6.add(r4)
        L_0x0323:
            int r10 = r10 + r11
            goto L_0x030e
        L_0x0325:
            r28 = r6
            goto L_0x032d
        L_0x0328:
            java.util.List r6 = java.util.Collections.emptyList()
            goto L_0x0325
        L_0x032d:
            pl4 r15 = new pl4
            java.lang.String r4 = r13.Y
            byte[] r5 = r13.Z
            java.lang.String r2 = r2.a
            android.net.Uri r6 = r13.b
            java.lang.String r7 = r13.c
            byte[] r8 = r13.X
            r24 = r15
            r25 = r2
            r26 = r6
            r27 = r7
            r29 = r8
            r30 = r4
            r31 = r5
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            r14 = r3
            r21 = r0
            r14.<init>(r15, r16, r17, r19, r21)
            r1.d(r3)
            goto L_0x036a
        L_0x0356:
            zj4 r2 = new zj4
            if (r0 == 0) goto L_0x035c
            r14 = r11
            goto L_0x035d
        L_0x035c:
            r14 = r10
        L_0x035d:
            r12 = r2
            r15 = r19
            r17 = r19
            r19 = r0
            r12.<init>(r13, r14, r15, r17, r19)
            r1.d(r2)
        L_0x036a:
            r32.g()
            goto L_0x0466
        L_0x036f:
            int r0 = r0.arg1
            r1.j = r0
            goto L_0x0466
        L_0x0375:
            int r0 = r0.arg1
            r1.i = r0
            r32.g()
            goto L_0x0466
        L_0x037e:
            java.lang.Object r2 = r0.obj
            java.lang.String r2 = (java.lang.String) r2
            int r0 = r0.arg1
            vuf r3 = r1.b
            if (r2 != 0) goto L_0x03ca
        L_0x0388:
            java.util.ArrayList r2 = r1.e
            int r4 = r2.size()
            if (r10 >= r4) goto L_0x039b
            java.lang.Object r2 = r2.get(r10)
            zj4 r2 = (defpackage.zj4) r2
            r1.f(r2, r0)
            int r10 = r10 + r11
            goto L_0x0388
        L_0x039b:
            o64 r3 = (defpackage.o64) r3     // Catch:{ IOException -> 0x03c3 }
            r3.b()     // Catch:{ IOException -> 0x03c3 }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ SQLException -> 0x03bc }
            r2.<init>()     // Catch:{ SQLException -> 0x03bc }
            java.lang.String r4 = "stop_reason"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLException -> 0x03bc }
            r2.put(r4, r0)     // Catch:{ SQLException -> 0x03bc }
            c04 r0 = r3.a     // Catch:{ SQLException -> 0x03bc }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ SQLException -> 0x03bc }
            java.lang.String r3 = "ExoPlayerDownloads"
            java.lang.String r4 = defpackage.o64.d     // Catch:{ SQLException -> 0x03bc }
            r0.update(r3, r2, r4, r7)     // Catch:{ SQLException -> 0x03bc }
            goto L_0x03e4
        L_0x03bc:
            r0 = move-exception
            androidx.media3.database.DatabaseIOException r2 = new androidx.media3.database.DatabaseIOException     // Catch:{ IOException -> 0x03c3 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x03c3 }
            throw r2     // Catch:{ IOException -> 0x03c3 }
        L_0x03c3:
            r0 = move-exception
            java.lang.String r2 = "Failed to set manual stop reason"
            defpackage.ez3.B(r2, r0)
            goto L_0x03e4
        L_0x03ca:
            zj4 r4 = r1.b(r2, r10)
            if (r4 == 0) goto L_0x03d4
            r1.f(r4, r0)
            goto L_0x03e4
        L_0x03d4:
            o64 r3 = (defpackage.o64) r3     // Catch:{ IOException -> 0x03da }
            r3.m(r0, r2)     // Catch:{ IOException -> 0x03da }
            goto L_0x03e4
        L_0x03da:
            r0 = move-exception
            java.lang.String r3 = "Failed to set manual stop reason: "
            java.lang.String r2 = r3.concat(r2)
            defpackage.ez3.B(r2, r0)
        L_0x03e4:
            r32.g()
            goto L_0x0466
        L_0x03e9:
            int r0 = r0.arg1
            r1.g = r0
            r32.g()
            goto L_0x0466
        L_0x03f2:
            int r0 = r0.arg1
            if (r0 == 0) goto L_0x03f7
            r10 = r11
        L_0x03f7:
            r1.h = r10
            r32.g()
            goto L_0x0466
        L_0x03fd:
            int r0 = r0.arg1
            vuf r2 = r1.b
            java.util.ArrayList r3 = r1.e
            r1.g = r0
            r0 = r2
            o64 r0 = (defpackage.o64) r0     // Catch:{ IOException -> 0x0449 }
            r0.k()     // Catch:{ IOException -> 0x0449 }
            r4 = 2
            int[] r0 = new int[]{r10, r11, r4, r9, r5}     // Catch:{ IOException -> 0x0449 }
            o64 r2 = (defpackage.o64) r2     // Catch:{ IOException -> 0x0449 }
            r2.b()     // Catch:{ IOException -> 0x0449 }
            java.lang.String r0 = defpackage.o64.g(r0)     // Catch:{ IOException -> 0x0449 }
            android.database.Cursor r0 = r2.c(r0, r7)     // Catch:{ IOException -> 0x0449 }
            sz5 r2 = new sz5     // Catch:{ IOException -> 0x0449 }
            r2.<init>(r11, r0)     // Catch:{ IOException -> 0x0449 }
        L_0x0422:
            java.lang.Object r0 = r2.b     // Catch:{ IOException -> 0x0440, all -> 0x043d }
            android.database.Cursor r0 = (android.database.Cursor) r0     // Catch:{ IOException -> 0x0440, all -> 0x043d }
            int r4 = r0.getPosition()     // Catch:{ IOException -> 0x0440, all -> 0x043d }
            int r4 = r4 + r11
            boolean r0 = r0.moveToPosition(r4)     // Catch:{ IOException -> 0x0440, all -> 0x043d }
            if (r0 == 0) goto L_0x0443
            java.lang.Object r0 = r2.b     // Catch:{ IOException -> 0x0440, all -> 0x043d }
            android.database.Cursor r0 = (android.database.Cursor) r0     // Catch:{ IOException -> 0x0440, all -> 0x043d }
            zj4 r0 = defpackage.o64.e(r0)     // Catch:{ IOException -> 0x0440, all -> 0x043d }
            r3.add(r0)     // Catch:{ IOException -> 0x0440, all -> 0x043d }
            goto L_0x0422
        L_0x043d:
            r0 = move-exception
            r7 = r2
            goto L_0x0478
        L_0x0440:
            r0 = move-exception
            r7 = r2
            goto L_0x044a
        L_0x0443:
            defpackage.oze.h(r2)
            goto L_0x0455
        L_0x0447:
            r0 = move-exception
            goto L_0x0478
        L_0x0449:
            r0 = move-exception
        L_0x044a:
            java.lang.String r2 = "Failed to load index."
            defpackage.ez3.B(r2, r0)     // Catch:{ all -> 0x0447 }
            r3.clear()     // Catch:{ all -> 0x0447 }
            defpackage.oze.h(r7)
        L_0x0455:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            android.os.Handler r2 = r1.d
            android.os.Message r0 = r2.obtainMessage(r11, r0)
            r0.sendToTarget()
            r32.g()
        L_0x0466:
            r10 = r11
        L_0x0467:
            android.os.Handler r0 = r1.d
            java.util.HashMap r1 = r1.f
            int r1 = r1.size()
            r2 = 2
            android.os.Message r0 = r0.obtainMessage(r2, r10, r1)
            r0.sendToTarget()
            return
        L_0x0478:
            defpackage.oze.h(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jl4.handleMessage(android.os.Message):void");
    }
}
