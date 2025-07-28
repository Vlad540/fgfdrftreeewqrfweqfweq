package defpackage;

import kotlinx.coroutines.internal.Symbol;

/* renamed from: icd  reason: default package */
public abstract class icd {
    public static final Symbol a = new Symbol("NO_VALUE");

    public static final hcd a(int i, int i2, int i3) {
        if (i < 0) {
            throw new IllegalArgumentException(wn6.h(i, "replay cannot be negative, but was ").toString());
        } else if (i2 < 0) {
            throw new IllegalArgumentException(wn6.h(i2, "extraBufferCapacity cannot be negative, but was ").toString());
        } else if (i > 0 || i2 > 0 || i3 == 1) {
            int i4 = i2 + i;
            if (i4 < 0) {
                i4 = Integer.MAX_VALUE;
            }
            return new hcd(i, i4, i3);
        } else {
            throw new IllegalArgumentException("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ".concat(rf0.o(i3)).toString());
        }
    }

    public static /* synthetic */ hcd b(int i, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        return a(i, i2, i3);
    }

    public static final Object c(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    public static final void d(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final pj5 e(dcd dcd, hu3 hu3, int i, int i2) {
        return ((i == 0 || i == -3) && i2 == 1) ? dcd : new w02(dcd, hu3, i, i2);
    }
}
