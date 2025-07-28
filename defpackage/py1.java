package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.SwitchCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: py1  reason: default package */
public final class py1 extends Property {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ py1(int i, Class cls, String str) {
        super(cls, str);
        this.a = i;
    }

    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                sy1 sy1 = (sy1) obj;
                return null;
            case 1:
                sy1 sy12 = (sy1) obj;
                return null;
            case 2:
                View view = (View) obj;
                return null;
            case 3:
                View view2 = (View) obj;
                return null;
            case 4:
                View view3 = (View) obj;
                return null;
            case 5:
                return Float.valueOf(((qy2) obj).x0);
            case 6:
                return Float.valueOf(((qy2) obj).y0);
            case 7:
                return Float.valueOf(((dn4) obj).b());
            case 8:
                return Float.valueOf(((xc7) obj).x0);
            case 9:
                return Float.valueOf(((zc7) obj).y0);
            case 10:
                return Float.valueOf(((SwitchCompat) obj).R0);
            case 11:
                return Float.valueOf(((View) obj).getTransitionAlpha());
            default:
                return ((View) obj).getClipBounds();
        }
    }

    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                sy1 sy1 = (sy1) obj;
                PointF pointF = (PointF) obj2;
                sy1.getClass();
                sy1.a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                sy1.b = round;
                int i = sy1.f + 1;
                sy1.f = i;
                if (i == sy1.g) {
                    int i2 = sy1.a;
                    int i3 = sy1.c;
                    int i4 = sy1.d;
                    py1 py1 = ocf.a;
                    sy1.e.setLeftTopRightBottom(i2, round, i3, i4);
                    sy1.f = 0;
                    sy1.g = 0;
                    return;
                }
                return;
            case 1:
                sy1 sy12 = (sy1) obj;
                PointF pointF2 = (PointF) obj2;
                sy12.getClass();
                sy12.c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                sy12.d = round2;
                int i5 = sy12.g + 1;
                sy12.g = i5;
                if (sy12.f == i5) {
                    int i6 = sy12.a;
                    int i7 = sy12.b;
                    int i8 = sy12.c;
                    py1 py12 = ocf.a;
                    sy12.e.setLeftTopRightBottom(i6, i7, i8, round2);
                    sy12.f = 0;
                    sy12.g = 0;
                    return;
                }
                return;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                int left = view.getLeft();
                int top = view.getTop();
                int round3 = Math.round(pointF3.x);
                int round4 = Math.round(pointF3.y);
                py1 py13 = ocf.a;
                view.setLeftTopRightBottom(left, top, round3, round4);
                return;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                int round5 = Math.round(pointF4.x);
                int round6 = Math.round(pointF4.y);
                int right = view2.getRight();
                int bottom = view2.getBottom();
                py1 py14 = ocf.a;
                view2.setLeftTopRightBottom(round5, round6, right, bottom);
                return;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round7 = Math.round(pointF5.x);
                int round8 = Math.round(pointF5.y);
                py1 py15 = ocf.a;
                view3.setLeftTopRightBottom(round7, round8, view3.getWidth() + round7, view3.getHeight() + round8);
                return;
            case 5:
                qy2 qy2 = (qy2) obj;
                float floatValue = ((Float) obj2).floatValue();
                qy2.x0 = floatValue;
                int i9 = (int) (floatValue * 5400.0f);
                ArrayList arrayList = (ArrayList) qy2.c;
                pn4 pn4 = (pn4) arrayList.get(0);
                float f = qy2.x0 * 1520.0f;
                pn4.a = -20.0f + f;
                pn4.b = f;
                int i10 = 0;
                while (true) {
                    p85 p85 = qy2.Y;
                    if (i10 < 4) {
                        pn4.b = (p85.getInterpolation(ibe.J(i9, qy2.A0[i10], 667)) * 250.0f) + pn4.b;
                        pn4.a = (p85.getInterpolation(ibe.J(i9, qy2.B0[i10], 667)) * 250.0f) + pn4.a;
                        i10++;
                    } else {
                        float f2 = pn4.a;
                        float f3 = pn4.b;
                        pn4.a = (((f3 - f2) * qy2.y0) + f2) / 360.0f;
                        pn4.b = f3 / 360.0f;
                        int i11 = 0;
                        while (true) {
                            if (i11 < 4) {
                                float J = ibe.J(i9, qy2.C0[i11], 333);
                                if (J < 0.0f || J > 1.0f) {
                                    i11++;
                                } else {
                                    int i12 = i11 + qy2.w0;
                                    int[] iArr = qy2.Z.c;
                                    int length = i12 % iArr.length;
                                    int i13 = iArr[length];
                                    int i14 = iArr[(1 + length) % iArr.length];
                                    float interpolation = p85.getInterpolation(J);
                                    Integer valueOf = Integer.valueOf(i13);
                                    Integer valueOf2 = Integer.valueOf(i14);
                                    int intValue = valueOf.intValue();
                                    float f4 = ((float) ((intValue >> 24) & 255)) / 255.0f;
                                    int intValue2 = valueOf2.intValue();
                                    float pow = (float) Math.pow((double) (((float) ((intValue >> 16) & 255)) / 255.0f), 2.2d);
                                    float pow2 = (float) Math.pow((double) (((float) ((intValue >> 8) & 255)) / 255.0f), 2.2d);
                                    float pow3 = (float) Math.pow((double) (((float) (intValue & 255)) / 255.0f), 2.2d);
                                    float pow4 = (float) Math.pow((double) (((float) ((intValue2 >> 16) & 255)) / 255.0f), 2.2d);
                                    float g = us8.g(((float) ((intValue2 >> 24) & 255)) / 255.0f, f4, interpolation, f4);
                                    float g2 = us8.g(pow4, pow, interpolation, pow);
                                    float g3 = us8.g((float) Math.pow((double) (((float) ((intValue2 >> 8) & 255)) / 255.0f), 2.2d), pow2, interpolation, pow2);
                                    ((pn4) arrayList.get(0)).c = Integer.valueOf(Math.round(((float) Math.pow((double) us8.g((float) Math.pow((double) (((float) (intValue2 & 255)) / 255.0f), 2.2d), pow3, interpolation, pow3), 0.45454545454545453d)) * 255.0f) | (Math.round(((float) Math.pow((double) g2, 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(g * 255.0f) << 24) | (Math.round(((float) Math.pow((double) g3, 0.45454545454545453d)) * 255.0f) << 8)).intValue();
                                }
                            }
                        }
                        ((pv6) qy2.b).invalidateSelf();
                        return;
                    }
                }
                break;
            case 6:
                ((qy2) obj).y0 = ((Float) obj2).floatValue();
                return;
            case 7:
                dn4 dn4 = (dn4) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                if (dn4.w0 != floatValue2) {
                    dn4.w0 = floatValue2;
                    dn4.invalidateSelf();
                    return;
                }
                return;
            case 8:
                xc7 xc7 = (xc7) obj;
                float floatValue3 = ((Float) obj2).floatValue();
                xc7.x0 = floatValue3;
                ArrayList arrayList2 = (ArrayList) xc7.c;
                ((pn4) arrayList2.get(0)).a = 0.0f;
                float J2 = ibe.J((int) (floatValue3 * 333.0f), 0, 667);
                p85 p852 = xc7.X;
                float interpolation2 = p852.getInterpolation(J2);
                ((pn4) arrayList2.get(1)).a = interpolation2;
                ((pn4) arrayList2.get(0)).b = interpolation2;
                float interpolation3 = p852.getInterpolation(J2 + 0.49925038f);
                ((pn4) arrayList2.get(2)).a = interpolation3;
                ((pn4) arrayList2.get(1)).b = interpolation3;
                ((pn4) arrayList2.get(2)).b = 1.0f;
                if (xc7.w0 && ((pn4) arrayList2.get(1)).b < 1.0f) {
                    ((pn4) arrayList2.get(2)).c = ((pn4) arrayList2.get(1)).c;
                    ((pn4) arrayList2.get(1)).c = ((pn4) arrayList2.get(0)).c;
                    ((pn4) arrayList2.get(0)).c = xc7.Y.c[xc7.Z];
                    xc7.w0 = false;
                }
                ((pv6) xc7.b).invalidateSelf();
                return;
            case 9:
                zc7 zc7 = (zc7) obj;
                float floatValue4 = ((Float) obj2).floatValue();
                zc7.y0 = floatValue4;
                int i15 = (int) (floatValue4 * 1800.0f);
                int i16 = 0;
                while (true) {
                    ArrayList arrayList3 = (ArrayList) zc7.c;
                    if (i16 < arrayList3.size()) {
                        pn4 pn42 = (pn4) arrayList3.get(i16);
                        int[] iArr2 = zc7.B0;
                        int i17 = i16 * 2;
                        int i18 = iArr2[i17];
                        int[] iArr3 = zc7.A0;
                        float J3 = ibe.J(i15, i18, iArr3[i17]);
                        Interpolator[] interpolatorArr = zc7.Y;
                        pn42.a = xy6.i(interpolatorArr[i17].getInterpolation(J3), 0.0f, 1.0f);
                        int i19 = i17 + 1;
                        pn42.b = xy6.i(interpolatorArr[i19].getInterpolation(ibe.J(i15, iArr2[i19], iArr3[i19])), 0.0f, 1.0f);
                        i16++;
                    } else {
                        if (zc7.x0) {
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                ((pn4) it.next()).c = zc7.Z.c[zc7.w0];
                            }
                            zc7.x0 = false;
                        }
                        ((pv6) zc7.b).invalidateSelf();
                        return;
                    }
                }
            case 10:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                return;
            case 11:
                ((View) obj).setTransitionAlpha(((Float) obj2).floatValue());
                return;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                return;
        }
    }
}
