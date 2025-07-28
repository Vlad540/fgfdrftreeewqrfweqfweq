package defpackage;

import android.content.Context;
import android.media.MediaCodec;

/* renamed from: nw3  reason: default package */
public final class nw3 {
    public Object a;
    public Object b;
    public int c;
    public Object d;
    public Object e;
    public int f;
    public int g;
    public int h;
    public final Object i;
    public Object j;

    public nw3(ocd ocd, Context context, fe1 fe1, xwb xwb) {
        this.a = ocd;
        this.b = context;
        this.d = fe1;
        this.e = xwb;
        this.i = new zzc();
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [otf, java.lang.Object] */
    public nw3(int i2) {
        Object obj;
        switch (i2) {
            case 1:
                MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
                this.i = cryptoInfo;
                this.j = oze.a >= 24 ? new qe4(cryptoInfo) : null;
                return;
            default:
                MediaCodec.CryptoInfo cryptoInfo2 = new MediaCodec.CryptoInfo();
                this.i = cryptoInfo2;
                if (mze.a >= 24) {
                    ? obj2 = new Object();
                    obj2.a = cryptoInfo2;
                    obj2.b = new MediaCodec.CryptoInfo.Pattern(0, 0);
                    obj = obj2;
                } else {
                    obj = null;
                }
                this.j = obj;
                return;
        }
    }
}
