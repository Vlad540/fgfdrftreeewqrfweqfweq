package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: pc7  reason: default package */
public final class pc7 {
    public AtomicReference a = new AtomicReference((Object) null);
    public final boolean b = true;
    public q85 c = new q85();
    public ob7 d;
    public final WeakReference e;
    public int f;
    public boolean g;
    public boolean h;
    public final ArrayList i;
    public final grd j;

    public pc7(nc7 nc7) {
        ob7 ob7 = ob7.b;
        this.d = ob7;
        this.i = new ArrayList();
        this.e = new WeakReference(nc7);
        this.j = hrd.a(ob7);
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [oc7, java.lang.Object] */
    public final void a(jc7 jc7) {
        dc7 dc7;
        nc7 nc7;
        ArrayList arrayList = this.i;
        boolean z = false;
        c("addObserver");
        ob7 ob7 = this.d;
        ob7 ob72 = ob7.a;
        if (ob7 != ob72) {
            ob72 = ob7.b;
        }
        ? obj = new Object();
        HashMap hashMap = rc7.a;
        boolean z2 = jc7 instanceof dc7;
        boolean z3 = jc7 instanceof x84;
        if (z2 && z3) {
            dc7 = new z84((x84) jc7, 0, (dc7) jc7);
        } else if (z3) {
            dc7 = new z84((x84) jc7, 0, (Object) null);
        } else if (z2) {
            dc7 = (dc7) jc7;
        } else {
            Class<?> cls = jc7.getClass();
            if (rc7.b(cls) == 2) {
                List list = (List) rc7.b.get(cls);
                if (list.size() != 1) {
                    int size = list.size();
                    s66[] s66Arr = new s66[size];
                    if (size <= 0) {
                        dc7 = new d6c(2, s66Arr);
                    } else {
                        rc7.a((Constructor) list.get(0), jc7);
                        throw null;
                    }
                } else {
                    rc7.a((Constructor) list.get(0), jc7);
                    throw null;
                }
            } else {
                dc7 = new z84(jc7);
            }
        }
        obj.b = dc7;
        obj.a = ob72;
        if (((oc7) this.c.b(jc7, obj)) == null && (nc7 = (nc7) this.e.get()) != null) {
            if (this.f != 0 || this.g) {
                z = true;
            }
            ob7 b2 = b(jc7);
            this.f++;
            while (obj.a.compareTo(b2) < 0 && this.c.X.containsKey(jc7)) {
                arrayList.add(obj.a);
                lb7 lb7 = nb7.Companion;
                ob7 ob73 = obj.a;
                lb7.getClass();
                int ordinal = ob73.ordinal();
                nb7 nb7 = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : nb7.ON_RESUME : nb7.ON_START : nb7.ON_CREATE;
                if (nb7 != null) {
                    obj.a(nc7, nb7);
                    arrayList.remove(arrayList.size() - 1);
                    b2 = b(jc7);
                } else {
                    throw new IllegalStateException("no event up from " + obj.a);
                }
            }
            if (!z) {
                g();
            }
            this.f--;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: ob7} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ob7 b(defpackage.jc7 r5) {
        /*
            r4 = this;
            q85 r0 = r4.c
            java.util.HashMap r0 = r0.X
            boolean r1 = r0.containsKey(r5)
            r2 = 0
            if (r1 == 0) goto L_0x0014
            java.lang.Object r5 = r0.get(r5)
            fjc r5 = (defpackage.fjc) r5
            fjc r5 = r5.o
            goto L_0x0015
        L_0x0014:
            r5 = r2
        L_0x0015:
            if (r5 == 0) goto L_0x0020
            java.lang.Object r5 = r5.b
            oc7 r5 = (defpackage.oc7) r5
            if (r5 == 0) goto L_0x0020
            ob7 r5 = r5.a
            goto L_0x0021
        L_0x0020:
            r5 = r2
        L_0x0021:
            java.util.ArrayList r0 = r4.i
            boolean r1 = r0.isEmpty()
            r3 = 1
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x0032
            java.lang.Object r0 = rf0.e(r0, r3)
            r2 = r0
            ob7 r2 = (defpackage.ob7) r2
        L_0x0032:
            ob7 r4 = r4.d
            if (r5 == 0) goto L_0x003d
            int r0 = r5.compareTo(r4)
            if (r0 >= 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r5 = r4
        L_0x003e:
            if (r2 == 0) goto L_0x0047
            int r4 = r2.compareTo(r5)
            if (r4 >= 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r2 = r5
        L_0x0048:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc7.b(jc7):ob7");
    }

    public final void c(String str) {
        if (this.b) {
            hr.U().j.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(wn6.i("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(nb7 nb7) {
        c("handleLifecycleEvent");
        e(nb7.a());
    }

    public final void e(ob7 ob7) {
        ob7 ob72 = this.d;
        if (ob72 != ob7) {
            ob7 ob73 = ob7.b;
            ob7 ob74 = ob7.a;
            if (ob72 == ob73 && ob7 == ob74) {
                throw new IllegalStateException(("State must be at least CREATED to move to " + ob7 + ", but was " + this.d + " in component " + this.e.get()).toString());
            }
            this.d = ob7;
            if (this.g || this.f != 0) {
                this.h = true;
                return;
            }
            this.g = true;
            g();
            this.g = false;
            if (this.d == ob74) {
                this.c = new q85();
            }
        }
    }

    public final void f(jc7 jc7) {
        c("removeObserver");
        this.c.c(jc7);
    }

    public final void g() {
        ob7 ob7;
        ob7 ob72;
        nc7 nc7 = (nc7) this.e.get();
        if (nc7 != null) {
            while (true) {
                q85 q85 = this.c;
                if (!(q85.o == 0 || ((ob7 = ((oc7) q85.a.b).a) == (ob72 = ((oc7) q85.b.b).a) && this.d == ob72))) {
                    this.h = false;
                    if (this.d.compareTo(ob7) < 0) {
                        q85 q852 = this.c;
                        ejc ejc = new ejc(q852.b, q852.a, 1);
                        q852.c.put(ejc, Boolean.FALSE);
                        while (ejc.hasNext() && !this.h) {
                            Map.Entry entry = (Map.Entry) ejc.next();
                            jc7 jc7 = (jc7) entry.getKey();
                            oc7 oc7 = (oc7) entry.getValue();
                            while (oc7.a.compareTo(this.d) > 0 && !this.h && this.c.X.containsKey(jc7)) {
                                lb7 lb7 = nb7.Companion;
                                ob7 ob73 = oc7.a;
                                lb7.getClass();
                                int ordinal = ob73.ordinal();
                                nb7 nb7 = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : nb7.ON_PAUSE : nb7.ON_STOP : nb7.ON_DESTROY;
                                if (nb7 != null) {
                                    this.i.add(nb7.a());
                                    oc7.a(nc7, nb7);
                                    ArrayList arrayList = this.i;
                                    arrayList.remove(arrayList.size() - 1);
                                } else {
                                    throw new IllegalStateException("no event down from " + oc7.a);
                                }
                            }
                        }
                    }
                    fjc fjc = this.c.b;
                    if (!this.h && fjc != null && this.d.compareTo(((oc7) fjc.b).a) > 0) {
                        q85 q853 = this.c;
                        q853.getClass();
                        gjc gjc = new gjc(q853);
                        q853.c.put(gjc, Boolean.FALSE);
                        while (gjc.hasNext() && !this.h) {
                            Map.Entry entry2 = (Map.Entry) gjc.next();
                            jc7 jc72 = (jc7) entry2.getKey();
                            oc7 oc72 = (oc7) entry2.getValue();
                            while (oc72.a.compareTo(this.d) < 0 && !this.h && this.c.X.containsKey(jc72)) {
                                this.i.add(oc72.a);
                                lb7 lb72 = nb7.Companion;
                                ob7 ob74 = oc72.a;
                                lb72.getClass();
                                int ordinal2 = ob74.ordinal();
                                nb7 nb72 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : nb7.ON_RESUME : nb7.ON_START : nb7.ON_CREATE;
                                if (nb72 != null) {
                                    oc72.a(nc7, nb72);
                                    ArrayList arrayList2 = this.i;
                                    arrayList2.remove(arrayList2.size() - 1);
                                } else {
                                    throw new IllegalStateException("no event up from " + oc72.a);
                                }
                            }
                        }
                    }
                }
            }
            this.h = false;
            this.j.setValue(this.d);
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }
}
