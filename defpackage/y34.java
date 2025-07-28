package defpackage;

import android.media.MediaCodecInfo;
import android.util.Size;

/* renamed from: y34  reason: default package */
public final /* synthetic */ class y34 implements lh7, n74, tn1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y34(int i, int i2, Object obj) {
        this.c = obj;
        this.a = i;
        this.b = i2;
    }

    public int a(MediaCodecInfo mediaCodecInfo) {
        int i = this.a;
        int i2 = this.b;
        Size h = by4.h(mediaCodecInfo, (String) this.c, i, i2);
        if (h == null) {
            return Integer.MAX_VALUE;
        }
        return Math.abs((i * i2) - (h.getHeight() * h.getWidth()));
    }

    public void invoke(Object obj) {
        ((hd) obj).J((gd) this.c, this.a, this.b);
    }

    public String z(sn1 sn1) {
        bb4 bb4 = (bb4) this.c;
        bb4.getClass();
        bb4.e(new dr1(bb4, 23, new b90(this.a, this.b, sn1)), new ya4(sn1, 0));
        return "DefaultSurfaceProcessor#snapshot";
    }
}
