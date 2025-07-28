package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: zy6  reason: default package */
public abstract class zy6 {
    public static final /* synthetic */ int a = 0;

    static {
        new rb9(0);
    }

    public static final rb9 a(int i, int i2, int i3) {
        rb9 rb9 = new rb9();
        rb9.e(8192, i);
        rb9.e(4, i2);
        rb9.e(16384, i3);
        return rb9;
    }

    public static final rb9 b(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        rb9 rb9 = new rb9();
        rb9.e(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, i);
        rb9.e(2048, i2);
        rb9.e(i3, i4);
        rb9.e(i5, i6);
        rb9.e(128, i7);
        return rb9;
    }
}
