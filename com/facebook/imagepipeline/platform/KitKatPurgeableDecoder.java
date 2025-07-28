package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;

@TargetApi(19)
@lj4
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {
    public final zi5 c;

    @lj4
    public KitKatPurgeableDecoder(zi5 zi5) {
        this.c = zi5;
    }

    public final Bitmap b(e13 e13, BitmapFactory.Options options) {
        jl8 jl8 = (jl8) e13.e0();
        int U = jl8.U();
        t54 a = this.c.a(U);
        try {
            byte[] bArr = (byte[]) a.e0();
            jl8.S(0, 0, U, bArr);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, U, options);
            ez3.n(decodeByteArray, "BitmapFactory returned null");
            return decodeByteArray;
        } finally {
            e13.S(a);
        }
    }

    public final Bitmap c(e13 e13, int i, BitmapFactory.Options options) {
        byte[] bArr = DalvikPurgeableDecoder.d(i, e13) ? null : DalvikPurgeableDecoder.b;
        jl8 jl8 = (jl8) e13.e0();
        if (i <= jl8.U()) {
            int i2 = i + 2;
            t54 a = this.c.a(i2);
            try {
                byte[] bArr2 = (byte[]) a.e0();
                jl8.S(0, 0, i, bArr2);
                if (bArr != null) {
                    bArr2[i] = -1;
                    bArr2[i + 1] = -39;
                    i = i2;
                }
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, i, options);
                ez3.n(decodeByteArray, "BitmapFactory returned null");
                return decodeByteArray;
            } finally {
                e13.S(a);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
