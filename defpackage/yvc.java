package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: yvc  reason: default package */
public final class yvc implements pv1, zvc, fef {
    public static final /* synthetic */ AtomicReferenceFieldUpdater Y = AtomicReferenceFieldUpdater.newUpdater(yvc.class, Object.class, "state$volatile");
    public Object X = bwc.d;
    public final hu3 a;
    public ArrayList b = new ArrayList(2);
    public Object c;
    public int o = -1;
    private volatile /* synthetic */ Object state$volatile = bwc.a;

    public yvc(hu3 hu3) {
        this.a = hu3;
    }

    public final void a(Segment segment, int i) {
        this.c = segment;
        this.o = i;
    }

    public final void b(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != bwc.b) {
                Symbol symbol = bwc.c;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, symbol)) {
                        ArrayList arrayList = this.b;
                        if (arrayList != null) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((wvc) it.next()).a();
                            }
                            this.X = bwc.d;
                            this.b = null;
                            return;
                        }
                        return;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
            } else {
                return;
            }
        }
    }

    public final Object c(Continuation continuation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y;
        wvc wvc = (wvc) atomicReferenceFieldUpdater.get(this);
        Object obj = this.X;
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                wvc wvc2 = (wvc) it.next();
                if (wvc2 != wvc) {
                    wvc2.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, bwc.b);
            this.X = bwc.d;
            this.b = null;
        }
        Object obj2 = wvc.a;
        k26 k26 = wvc.c;
        Object obj3 = wvc.d;
        Object invoke = k26.invoke(obj2, obj3, obj);
        Symbol symbol = bwc.e;
        Object obj4 = wvc.e;
        return obj3 == symbol ? ((u16) obj4).invoke(continuation) : ((i26) obj4).invoke(invoke, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c7 A[PHI: r11 
      PHI: (r11v2 java.lang.Object) = (r11v3 java.lang.Object), (r11v1 java.lang.Object) binds: [B:45:0x00c4, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(kotlin.coroutines.Continuation r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.xvc
            if (r0 == 0) goto L_0x0013
            r0 = r11
            xvc r0 = (defpackage.xvc) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            xvc r0 = new xvc
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.X
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Z
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 == r5) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            defpackage.wx3.H(r11)
            goto L_0x00c7
        L_0x002c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0034:
            yvc r10 = r0.o
            defpackage.wx3.H(r11)
            goto L_0x00bc
        L_0x003b:
            defpackage.wx3.H(r11)
            r0.o = r10
            r0.Z = r5
            zv1 r11 = new zv1
            kotlin.coroutines.Continuation r2 = defpackage.urd.y(r0)
            r11.<init>(r5, r2)
            r11.n()
        L_0x004e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = Y
            java.lang.Object r6 = r2.get(r10)
            kotlinx.coroutines.internal.Symbol r7 = defpackage.bwc.a
            jue r8 = defpackage.jue.a
            if (r6 != r7) goto L_0x006b
        L_0x005a:
            boolean r7 = r2.compareAndSet(r10, r6, r11)
            if (r7 == 0) goto L_0x0064
            bm3.s(r11, r10)
            goto L_0x00b2
        L_0x0064:
            java.lang.Object r7 = r2.get(r10)
            if (r7 == r6) goto L_0x005a
            goto L_0x004e
        L_0x006b:
            boolean r9 = r6 instanceof java.util.List
            if (r9 == 0) goto L_0x0099
        L_0x006f:
            boolean r8 = r2.compareAndSet(r10, r6, r7)
            if (r8 == 0) goto L_0x0092
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r2 = r6.iterator()
        L_0x007b:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x004e
            java.lang.Object r6 = r2.next()
            wvc r6 = r10.e(r6)
            r6.g = r3
            r7 = -1
            r6.h = r7
            r10.f(r6, r5)
            goto L_0x007b
        L_0x0092:
            java.lang.Object r8 = r2.get(r10)
            if (r8 == r6) goto L_0x006f
            goto L_0x004e
        L_0x0099:
            boolean r2 = r6 instanceof defpackage.wvc
            if (r2 == 0) goto L_0x00c8
            wvc r6 = (defpackage.wvc) r6
            java.lang.Object r2 = r10.X
            k26 r5 = r6.f
            if (r5 == 0) goto L_0x00ae
            java.lang.Object r6 = r6.d
            java.lang.Object r2 = r5.invoke(r10, r6, r2)
            k26 r2 = (defpackage.k26) r2
            goto L_0x00af
        L_0x00ae:
            r2 = r3
        L_0x00af:
            r11.e(r8, r2)
        L_0x00b2:
            java.lang.Object r11 = r11.m()
            if (r11 != r1) goto L_0x00b9
            r8 = r11
        L_0x00b9:
            if (r8 != r1) goto L_0x00bc
            return r1
        L_0x00bc:
            r0.o = r3
            r0.Z = r4
            java.lang.Object r11 = r10.c(r0)
            if (r11 != r1) goto L_0x00c7
            return r1
        L_0x00c7:
            return r11
        L_0x00c8:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r11.<init>(r0)
            r11.append(r6)
            java.lang.String r11 = r11.toString()
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yvc.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: wvc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: wvc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: wvc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: wvc} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.wvc e(java.lang.Object r4) {
        /*
            r3 = this;
            java.util.ArrayList r3 = r3.b
            r0 = 0
            if (r3 != 0) goto L_0x0006
            return r0
        L_0x0006:
            java.util.Iterator r3 = r3.iterator()
        L_0x000a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x001c
            java.lang.Object r1 = r3.next()
            r2 = r1
            wvc r2 = (defpackage.wvc) r2
            java.lang.Object r2 = r2.a
            if (r2 != r4) goto L_0x000a
            r0 = r1
        L_0x001c:
            wvc r0 = (defpackage.wvc) r0
            if (r0 == 0) goto L_0x0021
            return r0
        L_0x0021:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Clause with object "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " is not found"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yvc.e(java.lang.Object):wvc");
    }

    public final void f(wvc wvc, boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y;
        if (!(atomicReferenceFieldUpdater.get(this) instanceof wvc)) {
            Object obj = wvc.a;
            if (!z) {
                ArrayList arrayList = this.b;
                if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((wvc) it.next()).a == obj) {
                            throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                        }
                    }
                }
            }
            wvc.b.invoke(obj, this, wvc.d);
            if (this.X == bwc.d) {
                if (!z) {
                    this.b.add(wvc);
                }
                wvc.g = this.c;
                wvc.h = this.o;
                this.c = null;
                this.o = -1;
                return;
            }
            atomicReferenceFieldUpdater.set(this, wvc);
        }
    }

    public final boolean g(Object obj, Object obj2) {
        return h(obj, obj2) == 0;
    }

    public final int h(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof yv1) {
                wvc e = e(obj);
                if (e != null) {
                    k26 k26 = e.f;
                    k26 k262 = k26 != null ? (k26) k26.invoke(this, e.d, obj2) : null;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, e)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        }
                    }
                    yv1 yv1 = (yv1) obj3;
                    this.X = obj2;
                    Symbol symbol = bwc.a;
                    Symbol l = yv1.l(jue.a, k262);
                    if (l == null) {
                        this.X = bwc.d;
                        return 2;
                    }
                    yv1.q(l);
                    return 0;
                }
                continue;
            } else if (hhd.f(obj3, bwc.b) || (obj3 instanceof wvc)) {
                return 3;
            } else {
                if (hhd.f(obj3, bwc.c)) {
                    return 2;
                }
                if (hhd.f(obj3, bwc.a)) {
                    List singletonList = Collections.singletonList(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, singletonList)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        }
                    }
                    return 1;
                } else if (obj3 instanceof List) {
                    ArrayList j0 = o23.j0((Collection) obj3, obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, j0)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        }
                    }
                    return 1;
                } else {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
            }
        }
    }
}
