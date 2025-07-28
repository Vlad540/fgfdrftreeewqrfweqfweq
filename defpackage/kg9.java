package defpackage;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: kg9  reason: default package */
public abstract class kg9 {
    public static final AtomicReference a = new AtomicReference(new HashMap());
    public static final t97 b;
    public static final x3a c;
    public static final r7e d = new r7e(new m29(2));
    public static final r7e e = new r7e(new m29(3));

    static {
        eg9 eg9 = ez3.e;
        b = (eg9 != null ? eg9 : null).a;
        if (eg9 == null) {
            eg9 = null;
        }
        c = eg9.c;
    }

    public static final ig9 a(String str, int i, boolean z) {
        r94 r94;
        while (true) {
            AtomicReference atomicReference = a;
            HashMap hashMap = (HashMap) atomicReference.get();
            HashMap hashMap2 = new HashMap(hashMap);
            ig9 ig9 = (ig9) hashMap2.get(str);
            if (ig9 == null) {
                eg9 eg9 = ez3.e;
                if (eg9 == null) {
                    eg9 = null;
                }
                n7a n7a = eg9.b;
                int t = hr1.t(i);
                if (t == 0) {
                    r94 = (r94) d.getValue();
                } else if (t == 1) {
                    r94 = (r94) e.getValue();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                ig9 = new ig9(n7a, r94, (ExecutorService) b.getValue(), str, z);
                hashMap2.put(str, ig9);
                ig9.d();
                hashMap2.put(str, ig9);
            }
            while (true) {
                if (atomicReference.compareAndSet(hashMap, hashMap2)) {
                    if (z) {
                        boolean z2 = ig9.e;
                        ig9.e = true;
                        if (!z2 && ig9.e) {
                            ig9.d();
                        }
                    }
                    return ig9;
                } else if (atomicReference.get() != hashMap) {
                }
            }
        }
    }
}
