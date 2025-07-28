package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: hcd  reason: default package */
public class hcd extends p3 implements lc9, cw1, g36 {
    public int A0;
    public final int X;
    public final int Y;
    public final int Z;
    public Object[] w0;
    public long x0;
    public long y0;
    public int z0;

    public hcd(int i, int i2, int i3) {
        this.X = i;
        this.Y = i2;
        this.Z = i3;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0090 A[EDGE_INSN: B:52:0x0090->B:38:0x0090 ?: BREAK  , SYNTHETIC] */
    public static void n(defpackage.hcd r8, defpackage.rj5 r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof defpackage.gcd
            if (r0 == 0) goto L_0x0013
            r0 = r10
            gcd r0 = (defpackage.gcd) r0
            int r1 = r0.y0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y0 = r1
            goto L_0x0018
        L_0x0013:
            gcd r0 = new gcd
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.w0
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.y0
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L_0x005e
            r8 = 1
            if (r2 == r8) goto L_0x004f
            if (r2 == r4) goto L_0x0043
            if (r2 != r3) goto L_0x003b
            g37 r8 = r0.Z
            jcd r9 = r0.Y
            rj5 r2 = r0.X
            hcd r5 = r0.o
            defpackage.wx3.H(r10)     // Catch:{ all -> 0x0038 }
        L_0x0034:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L_0x0074
        L_0x0038:
            r8 = move-exception
            goto L_0x00b2
        L_0x003b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0043:
            g37 r8 = r0.Z
            jcd r9 = r0.Y
            rj5 r2 = r0.X
            hcd r5 = r0.o
            defpackage.wx3.H(r10)     // Catch:{ all -> 0x0038 }
            goto L_0x0077
        L_0x004f:
            jcd r9 = r0.Y
            rj5 r8 = r0.X
            hcd r2 = r0.o
            defpackage.wx3.H(r10)     // Catch:{ all -> 0x005b }
            r10 = r8
            r8 = r2
            goto L_0x006a
        L_0x005b:
            r8 = move-exception
            r5 = r2
            goto L_0x00b2
        L_0x005e:
            defpackage.wx3.H(r10)
            q3 r10 = r8.e()
            jcd r10 = (defpackage.jcd) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x006a:
            hu3 r2 = r0.b     // Catch:{ all -> 0x00af }
            xhd r5 = xhd.c     // Catch:{ all -> 0x00af }
            fu3 r2 = r2.get(r5)     // Catch:{ all -> 0x00af }
            g37 r2 = (defpackage.g37) r2     // Catch:{ all -> 0x00af }
        L_0x0074:
            r5 = r8
            r8 = r2
            r2 = r10
        L_0x0077:
            java.lang.Object r10 = r5.v(r9)     // Catch:{ all -> 0x0038 }
            kotlinx.coroutines.internal.Symbol r6 = defpackage.icd.a     // Catch:{ all -> 0x0038 }
            if (r10 != r6) goto L_0x0090
            r0.o = r5     // Catch:{ all -> 0x0038 }
            r0.X = r2     // Catch:{ all -> 0x0038 }
            r0.Y = r9     // Catch:{ all -> 0x0038 }
            r0.Z = r8     // Catch:{ all -> 0x0038 }
            r0.y0 = r4     // Catch:{ all -> 0x0038 }
            java.lang.Object r10 = r5.l(r9, r0)     // Catch:{ all -> 0x0038 }
            if (r10 != r1) goto L_0x0077
            return
        L_0x0090:
            if (r8 == 0) goto L_0x009e
            boolean r6 = r8.isActive()     // Catch:{ all -> 0x0038 }
            if (r6 == 0) goto L_0x0099
            goto L_0x009e
        L_0x0099:
            java.util.concurrent.CancellationException r8 = r8.getCancellationException()     // Catch:{ all -> 0x0038 }
            throw r8     // Catch:{ all -> 0x0038 }
        L_0x009e:
            r0.o = r5     // Catch:{ all -> 0x0038 }
            r0.X = r2     // Catch:{ all -> 0x0038 }
            r0.Y = r9     // Catch:{ all -> 0x0038 }
            r0.Z = r8     // Catch:{ all -> 0x0038 }
            r0.y0 = r3     // Catch:{ all -> 0x0038 }
            java.lang.Object r10 = r2.a(r10, r0)     // Catch:{ all -> 0x0038 }
            if (r10 != r1) goto L_0x0034
            return
        L_0x00af:
            r10 = move-exception
            r5 = r8
            r8 = r10
        L_0x00b2:
            r5.k(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hcd.n(hcd, rj5, kotlin.coroutines.Continuation):void");
    }

    public final Object a(Object obj, Continuation continuation) {
        ecd ecd;
        Continuation[] continuationArr;
        if (g(obj)) {
            return jue.a;
        }
        zv1 zv1 = new zv1(1, urd.y(continuation));
        zv1.n();
        Continuation[] continuationArr2 = js.a;
        synchronized (this) {
            try {
                if (t(obj)) {
                    zv1.resumeWith(jue.a);
                    continuationArr = q(continuationArr2);
                    ecd = null;
                } else {
                    ecd ecd2 = new ecd(this, ((long) (this.z0 + this.A0)) + r(), obj, zv1);
                    p(ecd2);
                    this.A0++;
                    if (this.Y == 0) {
                        continuationArr2 = q(continuationArr2);
                    }
                    continuationArr = continuationArr2;
                    ecd = ecd2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ecd != null) {
            bm3.s(zv1, new ov1(2, ecd));
        }
        for (Continuation continuation2 : continuationArr) {
            if (continuation2 != null) {
                continuation2.resumeWith(jue.a);
            }
        }
        Object m = zv1.m();
        pu3 pu3 = pu3.a;
        if (m != pu3) {
            m = jue.a;
        }
        return m == pu3 ? m : jue.a;
    }

    public final Object c(rj5 rj5, Continuation continuation) {
        n(this, rj5, continuation);
        return pu3.a;
    }

    public final pj5 d(hu3 hu3, int i, int i2) {
        return icd.e(this, hu3, i, i2);
    }

    public final void f() {
        synchronized (this) {
            w(r() + ((long) this.z0), this.y0, r() + ((long) this.z0), r() + ((long) this.z0) + ((long) this.A0));
        }
    }

    public final boolean g(Object obj) {
        int i;
        boolean z;
        Continuation[] continuationArr = js.a;
        synchronized (this) {
            if (t(obj)) {
                continuationArr = q(continuationArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (Continuation continuation : continuationArr) {
            if (continuation != null) {
                continuation.resumeWith(jue.a);
            }
        }
        return z;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [q3, java.lang.Object, jcd] */
    public final q3 h() {
        ? obj = new Object();
        obj.a = -1;
        return obj;
    }

    public final q3[] j() {
        return new jcd[2];
    }

    public final Object l(jcd jcd, gcd gcd) {
        zv1 zv1 = new zv1(1, urd.y(gcd));
        zv1.n();
        synchronized (this) {
            if (u(jcd) < 0) {
                jcd.b = zv1;
            } else {
                zv1.resumeWith(jue.a);
            }
        }
        Object m = zv1.m();
        return m == pu3.a ? m : jue.a;
    }

    public final void m() {
        if (this.Y != 0 || this.A0 > 1) {
            Object[] objArr = this.w0;
            while (this.A0 > 0 && icd.c(objArr, (r() + ((long) (this.z0 + this.A0))) - 1) == icd.a) {
                this.A0--;
                icd.d(objArr, r() + ((long) (this.z0 + this.A0)), (Object) null);
            }
        }
    }

    public final void o() {
        q3[] q3VarArr;
        icd.d(this.w0, r(), (Object) null);
        this.z0--;
        long r = r() + 1;
        if (this.x0 < r) {
            this.x0 = r;
        }
        if (this.y0 < r) {
            if (!(this.b == 0 || (q3VarArr = this.a) == null)) {
                for (q3 q3Var : q3VarArr) {
                    if (q3Var != null) {
                        jcd jcd = (jcd) q3Var;
                        long j = jcd.a;
                        if (j >= 0 && j < r) {
                            jcd.a = r;
                        }
                    }
                }
            }
            this.y0 = r;
        }
    }

    public final void p(Object obj) {
        int i = this.z0 + this.A0;
        Object[] objArr = this.w0;
        if (objArr == null) {
            objArr = s(0, 2, (Object[]) null);
        } else if (i >= objArr.length) {
            objArr = s(i, objArr.length * 2, objArr);
        }
        icd.d(objArr, r() + ((long) i), obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: kotlin.coroutines.Continuation[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: kotlin.coroutines.Continuation[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: kotlin.coroutines.Continuation[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: kotlin.coroutines.Continuation[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: kotlin.coroutines.Continuation[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: kotlin.coroutines.Continuation[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: kotlin.coroutines.Continuation[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: kotlin.coroutines.Continuation[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: kotlin.coroutines.Continuation[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r4 = (defpackage.jcd) r4;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=kotlin.coroutines.Continuation[], code=java.lang.Object[], for r11v0, types: [kotlin.coroutines.Continuation[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.coroutines.Continuation[] q(java.lang.Object[] r11) {
        /*
            r10 = this;
            int r0 = r11.length
            int r1 = r10.b
            if (r1 == 0) goto L_0x003e
            q3[] r1 = r10.a
            if (r1 == 0) goto L_0x003e
            int r2 = r1.length
            r3 = 0
        L_0x000b:
            if (r3 >= r2) goto L_0x003e
            r4 = r1[r3]
            if (r4 == 0) goto L_0x003b
            jcd r4 = (defpackage.jcd) r4
            zv1 r5 = r4.b
            if (r5 != 0) goto L_0x0018
            goto L_0x003b
        L_0x0018:
            long r6 = r10.u(r4)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x003b
            int r6 = r11.length
            if (r0 < r6) goto L_0x0030
            int r6 = r11.length
            r7 = 2
            int r6 = r6 * r7
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r6)
        L_0x0030:
            r6 = r11
            kotlin.coroutines.Continuation[] r6 = (kotlin.coroutines.Continuation[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.b = r0
            r0 = r7
        L_0x003b:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x003e:
            kotlin.coroutines.Continuation[] r11 = (kotlin.coroutines.Continuation[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hcd.q(kotlin.coroutines.Continuation[]):kotlin.coroutines.Continuation[]");
    }

    public final long r() {
        return Math.min(this.y0, this.x0);
    }

    public final Object[] s(int i, int i2, Object[] objArr) {
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.w0 = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long r = r();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + r;
                icd.d(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    public final boolean t(Object obj) {
        int i = this.b;
        int i2 = this.X;
        if (i == 0) {
            if (i2 != 0) {
                p(obj);
                int i3 = this.z0 + 1;
                this.z0 = i3;
                if (i3 > i2) {
                    o();
                }
                this.y0 = r() + ((long) this.z0);
            }
            return true;
        }
        int i4 = this.z0;
        int i5 = this.Y;
        if (i4 >= i5 && this.y0 <= this.x0) {
            int i6 = fcd.$EnumSwitchMapping$0[hr1.t(this.Z)];
            if (i6 == 1) {
                return false;
            }
            if (i6 == 2) {
                return true;
            }
            if (i6 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        p(obj);
        int i7 = this.z0 + 1;
        this.z0 = i7;
        if (i7 > i5) {
            o();
        }
        long r = r() + ((long) this.z0);
        long j = this.x0;
        if (((int) (r - j)) > i2) {
            w(1 + j, this.y0, r() + ((long) this.z0), r() + ((long) this.z0) + ((long) this.A0));
        }
        return true;
    }

    public final long u(jcd jcd) {
        long j = jcd.a;
        if (j < r() + ((long) this.z0)) {
            return j;
        }
        if (this.Y <= 0 && j <= r() && this.A0 != 0) {
            return j;
        }
        return -1;
    }

    public final Object v(jcd jcd) {
        Object obj;
        Continuation[] continuationArr = js.a;
        synchronized (this) {
            try {
                long u = u(jcd);
                if (u < 0) {
                    obj = icd.a;
                } else {
                    long j = jcd.a;
                    Object c = icd.c(this.w0, u);
                    if (c instanceof ecd) {
                        c = ((ecd) c).c;
                    }
                    jcd.a = u + 1;
                    Object obj2 = c;
                    continuationArr = x(j);
                    obj = obj2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : continuationArr) {
            if (continuation != null) {
                continuation.resumeWith(jue.a);
            }
        }
        return obj;
    }

    public final void w(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long r = r(); r < min; r++) {
            icd.d(this.w0, r, (Object) null);
        }
        this.x0 = j;
        this.y0 = j2;
        this.z0 = (int) (j3 - min);
        this.A0 = (int) (j4 - j3);
    }

    public final Continuation[] x(long j) {
        long j2;
        long j3;
        Continuation[] continuationArr;
        long j4;
        q3[] q3VarArr;
        int i = (j > this.y0 ? 1 : (j == this.y0 ? 0 : -1));
        Continuation[] continuationArr2 = js.a;
        if (i > 0) {
            return continuationArr2;
        }
        long r = r();
        long j5 = ((long) this.z0) + r;
        int i2 = this.Y;
        if (i2 == 0 && this.A0 > 0) {
            j5++;
        }
        if (!(this.b == 0 || (q3VarArr = this.a) == null)) {
            for (q3 q3Var : q3VarArr) {
                if (q3Var != null) {
                    long j6 = ((jcd) q3Var).a;
                    if (j6 >= 0 && j6 < j5) {
                        j5 = j6;
                    }
                }
            }
        }
        if (j5 <= this.y0) {
            return continuationArr2;
        }
        long r2 = r() + ((long) this.z0);
        int min = this.b > 0 ? Math.min(this.A0, i2 - ((int) (r2 - j5))) : this.A0;
        long j7 = ((long) this.A0) + r2;
        if (min > 0) {
            Continuation[] continuationArr3 = new Continuation[min];
            Object[] objArr = this.w0;
            long j8 = r2;
            int i3 = 0;
            while (true) {
                if (r2 >= j7) {
                    j3 = j5;
                    j2 = j7;
                    break;
                }
                Object c = icd.c(objArr, r2);
                j3 = j5;
                Symbol symbol = icd.a;
                if (c != symbol) {
                    ecd ecd = (ecd) c;
                    int i4 = i3 + 1;
                    j2 = j7;
                    continuationArr3[i3] = ecd.o;
                    icd.d(objArr, r2, symbol);
                    icd.d(objArr, j8, ecd.c);
                    j4 = 1;
                    j8++;
                    if (i4 >= min) {
                        break;
                    }
                    i3 = i4;
                } else {
                    j2 = j7;
                    j4 = 1;
                }
                r2 += j4;
                j5 = j3;
                j7 = j2;
            }
            continuationArr = continuationArr3;
            r2 = j8;
        } else {
            j3 = j5;
            j2 = j7;
            continuationArr = continuationArr2;
        }
        int i5 = (int) (r2 - r);
        long j9 = this.b == 0 ? r2 : j3;
        long max = Math.max(this.x0, r2 - ((long) Math.min(this.X, i5)));
        if (i2 == 0 && max < j2 && hhd.f(icd.c(this.w0, max), icd.a)) {
            r2++;
            max++;
        }
        w(max, j9, r2, j2);
        m();
        return (continuationArr.length == 0) ^ true ? q(continuationArr) : continuationArr;
    }
}
