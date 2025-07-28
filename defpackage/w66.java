package defpackage;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool$InvalidSizeException;

/* renamed from: w66  reason: default package */
public class w66 extends hi0 {
    public final int[] z0;

    public w66(lk9 lk9, h0b h0b, mk9 mk9) {
        super(lk9, h0b, mk9);
        SparseIntArray sparseIntArray = h0b.c;
        if (sparseIntArray != null) {
            this.z0 = new int[sparseIntArray.size()];
            int size = sparseIntArray.size();
            for (int i = 0; i < size; i++) {
                this.z0[i] = sparseIntArray.keyAt(i);
            }
        } else {
            this.z0 = new int[0];
        }
        this.b.getClass();
        this.x0.getClass();
    }

    public final Object a(int i) {
        return new byte[i];
    }

    public final /* bridge */ /* synthetic */ void c(Object obj) {
        byte[] bArr = (byte[]) obj;
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
        return ((byte[]) obj).length;
    }

    public final int h(int i) {
        return i;
    }
}
