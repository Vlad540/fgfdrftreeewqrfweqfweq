package defpackage;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool$InvalidSizeException;

/* renamed from: il8  reason: default package */
public abstract class il8 extends hi0 {
    public final int[] z0;

    public il8(ll8 ll8, h0b h0b, i0b i0b) {
        super(ll8, h0b, i0b);
        SparseIntArray sparseIntArray = h0b.c;
        sparseIntArray.getClass();
        this.z0 = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.z0;
            if (i < iArr.length) {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            } else {
                this.b.getClass();
                this.x0.getClass();
                return;
            }
        }
    }

    public final void c(Object obj) {
        hl8 hl8 = (hl8) obj;
        hl8.getClass();
        hl8.close();
    }

    public final int e(int i) {
        if (i > 0) {
            for (int i2 : this.z0) {
                if (i2 >= i) {
                    return i2;
                }
            }
            return i;
        }
        throw new BasePool$InvalidSizeException(Integer.valueOf(i));
    }

    public final int f(Object obj) {
        hl8 hl8 = (hl8) obj;
        hl8.getClass();
        return hl8.getSize();
    }

    public final int h(int i) {
        return i;
    }

    public final boolean k(Object obj) {
        hl8 hl8 = (hl8) obj;
        hl8.getClass();
        return !hl8.isClosed();
    }
}
