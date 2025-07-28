package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bvc  reason: default package */
public abstract class bvc {
    public static final kuc a = new kuc(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(kuc kuc) {
        if (kuc.f != null || kuc.g != null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!kuc.d) {
            AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
            kuc kuc2 = (kuc) atomicReference.get();
            if (kuc2 != a) {
                int i = kuc2 != null ? kuc2.c : 0;
                if (i < 65536) {
                    kuc.f = kuc2;
                    kuc.b = 0;
                    kuc.c = i + 8192;
                    while (!atomicReference.compareAndSet(kuc2, kuc)) {
                        if (atomicReference.get() != kuc2) {
                            kuc.f = null;
                            return;
                        }
                    }
                }
            }
        }
    }

    public static final kuc b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        kuc kuc = a;
        kuc kuc2 = (kuc) atomicReference.getAndSet(kuc);
        if (kuc2 == kuc) {
            return new kuc();
        }
        if (kuc2 == null) {
            atomicReference.set((Object) null);
            return new kuc();
        }
        atomicReference.set(kuc2.f);
        kuc2.f = null;
        kuc2.c = 0;
        return kuc2;
    }
}
