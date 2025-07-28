package defpackage;

import android.transition.TransitionManager;
import android.view.View;

/* renamed from: wyb  reason: default package */
public final /* synthetic */ class wyb implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xyb b;

    public /* synthetic */ wyb(xyb xyb, int i) {
        this.a = i;
        this.b = xyb;
    }

    public final Object invoke() {
        kc9 kc9;
        int i;
        switch (this.a) {
            case 0:
                xyb xyb = this.b;
                xyb.d();
                kc9 kc92 = xyb.A0;
                Object[] objArr = kc92.b;
                long[] jArr = kc92.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    xyb.removeView((View) objArr[(i2 << 3) + i4]);
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                            }
                        }
                        if (i2 != length) {
                            i2++;
                        }
                    }
                }
                xyb.c();
                xyb.e();
                if (xyb.getChildCount() == 0) {
                    xyb.setVisibility(8);
                }
                return jue.a;
            case 1:
                xyb xyb2 = this.b;
                TransitionManager.beginDelayedTransition(xyb2, xyb2.y0);
                kc9 kc93 = xyb2.z0;
                boolean z = kc93.d == 0;
                kc9 kc94 = xyb2.A0;
                if (!z || kc94.d != 0) {
                    Object[] objArr2 = kc93.b;
                    long[] jArr2 = kc93.a;
                    int length2 = jArr2.length - 2;
                    long j2 = 128;
                    if (length2 >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j3 = jArr2[i5];
                            kc9 = kc94;
                            if ((((~j3) << 7) & j3 & -9187201950435737472L) != -9187201950435737472L) {
                                int i6 = 8 - ((~(i5 - length2)) >>> 31);
                                int i7 = 0;
                                while (i7 < i6) {
                                    if ((j3 & 255) < j2) {
                                        ((View) objArr2[(i5 << 3) + i7]).setVisibility(0);
                                    }
                                    j3 >>= 8;
                                    i7++;
                                    j2 = 128;
                                }
                                i = 0;
                                if (i6 != 8) {
                                }
                            } else {
                                i = 0;
                            }
                            if (i5 != length2) {
                                i5++;
                                kc94 = kc9;
                                j2 = 128;
                            }
                        }
                    } else {
                        kc9 = kc94;
                        i = 0;
                    }
                    kc9 kc95 = kc9;
                    Object[] objArr3 = kc95.b;
                    long[] jArr3 = kc95.a;
                    int length3 = jArr3.length - 2;
                    if (length3 >= 0) {
                        int i8 = i;
                        while (true) {
                            long j4 = jArr3[i8];
                            if ((((~j4) << 7) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                                int i9 = 8 - ((~(i8 - length3)) >>> 31);
                                for (int i10 = i; i10 < i9; i10++) {
                                    if ((j4 & 255) < 128) {
                                        ((View) objArr3[(i8 << 3) + i10]).setVisibility(8);
                                    }
                                    j4 >>= 8;
                                }
                                if (i9 != 8) {
                                }
                            }
                            if (i8 != length3) {
                                i8++;
                            }
                        }
                    }
                } else {
                    xyb2.requestLayout();
                }
                return jue.a;
            case 2:
                return Boolean.valueOf(this.b.c);
            default:
                xyb xyb3 = this.b;
                xyb3.d();
                xyb3.c();
                xyb3.e();
                return jue.a;
        }
    }
}
