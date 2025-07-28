package defpackage;

import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.List;

/* renamed from: xyb  reason: default package */
public final class xyb extends ViewGroup {
    public static final /* synthetic */ k77[] F0;
    public final kc9 A0;
    public final kc9 B0;
    public final int C0;
    public final vyb[] D0;
    public final xb4 E0;
    public u16 a;
    public syb b;
    public boolean c;
    public final yj o = new yj(this);
    public final ub9 w0 = new ub9();
    public s16 x0 = new k6b(16);
    public final TransitionSet y0;
    public final kc9 z0;

    static {
        k77 hc9 = new hc9(xyb.class, "isStackFromEnd", "isStackFromEnd()Z");
        m7c.a.getClass();
        F0 = new k77[]{hc9};
    }

    public xyb(Context context) {
        super(context);
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new lzb(new wyb(this, 2)));
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.setOrdering(1);
        transitionSet.addListener(new f6(2, this));
        this.y0 = transitionSet;
        this.z0 = new kc9();
        this.A0 = new kc9();
        this.B0 = new kc9();
        int i = mzb.a;
        this.C0 = i;
        vyb[] vybArr = new vyb[i];
        for (int i2 = 0; i2 < i; i2++) {
            vybArr[i2] = null;
        }
        this.D0 = vybArr;
        this.E0 = new xb4(15);
    }

    public final void a(kc9 kc9) {
        Object[] objArr = kc9.b;
        long[] jArr = kc9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            View view = (View) objArr[(i << 3) + i3];
                            this.w0.a(view.getId());
                            this.y0.addTarget(view.getId());
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final int b(int i) {
        k77 k77 = F0[0];
        if (!((Boolean) this.o.b).booleanValue()) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            vyb vyb = (vyb) cs.Z(i, this.D0);
            if (vyb == null) {
                break;
            }
            int measuredWidth = vyb.getMeasuredWidth() + (i2 == 0 ? 0 : a24.X(((float) 4) * dh4.c().getDisplayMetrics().density)) + i2;
            if (measuredWidth > getMeasuredWidth()) {
                break;
            }
            i++;
            i2 = measuredWidth;
        }
        return getMeasuredWidth() - i2;
    }

    public final void c() {
        this.z0.b();
        this.A0.b();
        this.B0.b();
    }

    public final void d() {
        int i;
        int i2;
        w48 w48 = this.b;
        if (w48 != null) {
            kc9 kc9 = this.z0;
            long j = 255;
            char c2 = 7;
            long j2 = -9187201950435737472L;
            int i3 = 8;
            if (kc9.d != 0) {
                Object[] objArr = kc9.b;
                long[] jArr = kc9.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j3 = jArr[i4];
                        if ((((~j3) << 7) & j3 & j2) != j2) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((j3 & j) < 128) {
                                    View view = (View) objArr[(i4 << 3) + i6];
                                    vyb vyb = view instanceof vyb ? (vyb) view : null;
                                    if (vyb != null) {
                                        w48 w482 = w48;
                                        i = length;
                                        ((uw8) w482.b).x0.invoke(Long.valueOf(((ao8) ((gt8) w482.c)).N0), vyb.getReaction(), vyb);
                                    } else {
                                        i = length;
                                    }
                                    i2 = 8;
                                } else {
                                    i = length;
                                    i2 = i3;
                                }
                                j3 >>= i2;
                                i6++;
                                i3 = i2;
                                length = i;
                                j = 255;
                            }
                            int i7 = length;
                            if (i5 != i3) {
                                break;
                            }
                            length = i7;
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                        j = 255;
                        j2 = -9187201950435737472L;
                        i3 = 8;
                    }
                }
            }
            kc9 kc92 = this.B0;
            if (kc92.d != 0) {
                Object[] objArr2 = kc92.b;
                long[] jArr2 = kc92.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j4 = jArr2[i8];
                        if ((((~j4) << c2) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i8 - length2)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j4 & 255) < 128) {
                                    View view2 = (View) objArr2[(i8 << 3) + i10];
                                    vyb vyb2 = view2 instanceof vyb ? (vyb) view2 : null;
                                    if (vyb2 != null) {
                                        w48 w483 = w48;
                                        ((uw8) w483.b).x0.invoke(Long.valueOf(((ao8) ((gt8) w483.c)).N0), vyb2.getReaction(), vyb2);
                                    }
                                }
                                j4 >>= 8;
                            }
                            if (i9 != 8) {
                                return;
                            }
                        }
                        if (i8 != length2) {
                            i8++;
                            c2 = 7;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void e() {
        TransitionSet transitionSet = this.y0;
        ub9 ub9 = this.w0;
        int[] iArr = ub9.b;
        long[] jArr = ub9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((j & 255) < 128) {
                            transitionSet.removeTarget(iArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        ub9.d = 0;
        long[] jArr2 = ub9.a;
        if (jArr2 != llc.a) {
            cs.V(jArr2);
            long[] jArr3 = ub9.a;
            int i4 = ub9.c;
            int i5 = i4 >> 3;
            long j2 = 255 << ((i4 & 7) << 3);
            jArr3[i5] = j2 | (jArr3[i5] & (~j2));
        }
        ub9.e = llc.a(ub9.c) - ub9.d;
    }

    public final void f(yr8 yr8, boolean z) {
        bs bsVar;
        List<xr8> list;
        yr8 yr82 = yr8;
        if (getChildCount() != 0 || (yr82 != null && !yr82.a.isEmpty())) {
            c();
            TransitionManager.endTransitions(this);
            kc9 kc9 = this.B0;
            kc9 kc92 = this.z0;
            if (!(yr82 == null || (list = yr82.a) == null)) {
                for (xr8 xr8 : list) {
                    vyb vyb = (vyb) findViewById(xr8.a.b.a.toString().hashCode());
                    ryb ryb = null;
                    yyb yyb = yr82.c;
                    int i = xr8.b;
                    yyb yyb2 = xr8.a;
                    if (vyb == null) {
                        vyb vyb2 = new vyb(getContext());
                        vyb2.setId(yyb2.b.a.toString().hashCode());
                        ryb ryb2 = yyb2.b;
                        vyb2.setReaction(ryb2);
                        vyb2.setCount(i);
                        if (yyb != null) {
                            ryb = yyb.b;
                        }
                        vyb2.setOwn(hhd.f(ryb2, ryb));
                        u16 u16 = this.a;
                        if (u16 != null) {
                            vyb2.setOnChipClickListener(u16);
                        }
                        addView(vyb2);
                        kc92.a(vyb2);
                    } else {
                        ryb ryb3 = yyb2.b;
                        if (yyb != null) {
                            ryb = yyb.b;
                        }
                        vyb.setOwn(hhd.f(ryb3, ryb));
                        vyb.setCount(i);
                        kc9.a(vyb);
                    }
                }
            }
            if (yr82 == null) {
                bsVar = new bs(0);
            } else {
                bs bsVar2 = new bs(0);
                for (xr8 xr82 : yr82.a) {
                    bsVar2.add(Integer.valueOf(xr82.a.b.a.toString().hashCode()));
                }
                bsVar = bsVar2;
            }
            int i2 = 0;
            while (true) {
                boolean z2 = i2 < getChildCount();
                kc9 kc93 = this.A0;
                if (z2) {
                    int i3 = i2 + 1;
                    View childAt = getChildAt(i2);
                    if (childAt != null) {
                        if (!bsVar.contains(Integer.valueOf(childAt.getId()))) {
                            kc93.a(childAt);
                        }
                        i2 = i3;
                    } else {
                        throw new IndexOutOfBoundsException();
                    }
                } else if (!z) {
                    d();
                    Object[] objArr = kc93.b;
                    long[] jArr = kc93.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i4 = 0;
                        while (true) {
                            long j = jArr[i4];
                            if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                for (int i6 = 0; i6 < i5; i6++) {
                                    if ((j & 255) < 128) {
                                        removeView((View) objArr[(i4 << 3) + i6]);
                                    }
                                    j >>= 8;
                                }
                                if (i5 != 8) {
                                    break;
                                }
                            }
                            if (i4 == length) {
                                break;
                            }
                            i4++;
                        }
                    }
                    setVisibility(getChildCount() > 0 ? 0 : 8);
                    c();
                    return;
                } else if (kc93.d == 0 || kc92.d == 0) {
                    setVisibility(0);
                    a(kc93);
                    a(kc92);
                    Object[] objArr2 = kc92.b;
                    long[] jArr2 = kc92.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j2 = jArr2[i7];
                            if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                                int i8 = 8 - ((~(i7 - length2)) >>> 31);
                                for (int i9 = 0; i9 < i8; i9++) {
                                    if ((j2 & 255) < 128) {
                                        ((View) objArr2[(i7 << 3) + i9]).setVisibility(8);
                                    }
                                    j2 >>= 8;
                                }
                                if (i8 != 8) {
                                    break;
                                }
                            }
                            if (i7 == length2) {
                                break;
                            }
                            i7++;
                        }
                    }
                    this.x0 = new wyb(this, 0);
                    wyb wyb = new wyb(this, 1);
                    if (isLaidOut()) {
                        wyb.invoke();
                        return;
                    } else {
                        mcf.b(this, new nya(wyb, 7, this));
                        return;
                    }
                } else {
                    a(kc9);
                    Object[] objArr3 = kc93.b;
                    long[] jArr3 = kc93.a;
                    int length3 = jArr3.length - 2;
                    if (length3 >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j3 = jArr3[i10];
                            if ((((~j3) << 7) & j3 & -9187201950435737472L) != -9187201950435737472L) {
                                int i11 = 8 - ((~(i10 - length3)) >>> 31);
                                for (int i12 = 0; i12 < i11; i12++) {
                                    if ((j3 & 255) < 128) {
                                        removeView((View) objArr3[(i10 << 3) + i12]);
                                    }
                                    j3 >>= 8;
                                }
                                if (i11 != 8) {
                                    break;
                                }
                            }
                            if (i10 == length3) {
                                break;
                            }
                            i10++;
                        }
                    }
                    Object[] objArr4 = kc92.b;
                    long[] jArr4 = kc92.a;
                    int length4 = jArr4.length - 2;
                    if (length4 >= 0) {
                        int i13 = 0;
                        while (true) {
                            long j4 = jArr4[i13];
                            if ((((~j4) << 7) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                                int i14 = 8 - ((~(i13 - length4)) >>> 31);
                                for (int i15 = 0; i15 < i14; i15++) {
                                    if ((j4 & 255) < 128) {
                                        ((View) objArr4[(i13 << 3) + i15]).setVisibility(0);
                                    }
                                    j4 >>= 8;
                                }
                                if (i14 != 8) {
                                    break;
                                }
                            }
                            if (i13 == length4) {
                                break;
                            }
                            i13++;
                        }
                    }
                    this.x0 = new wyb(this, 3);
                    TransitionManager.beginDelayedTransition(this, this.y0);
                    requestLayout();
                    return;
                }
            }
        }
    }

    public final syb getChipObserver() {
        return this.b;
    }

    public final u16 getOnChipClickListener() {
        return this.a;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            vyb vyb = (vyb) cs.Z(i8, this.D0);
            if (vyb != null) {
                int b2 = i6 == 0 ? b(i8) : a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
                if (getMeasuredWidth() - i6 >= vyb.getMeasuredWidth() + b2) {
                    i5 = i6 + b2;
                    n1g.D(vyb, i5, i7, 0, 12);
                } else {
                    i5 = b(i8);
                    i7 += vyb.getMeasuredHeight() + a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
                    n1g.D(vyb, i5, i7, 0, 12);
                }
                i6 = i5 + vyb.getMeasuredWidth();
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        View view;
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.C0;
            view = null;
            objArr = this.D0;
            if (i4 >= i5) {
                break;
            }
            if (i4 < getChildCount()) {
                objArr[i4] = getChildAt(i4);
            } else {
                objArr[i4] = null;
            }
            i4++;
        }
        Arrays.sort(objArr, this.E0);
        int size = View.MeasureSpec.getMode(i) == 0 ? getContext().getResources().getDisplayMetrics().widthPixels : View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            vyb vyb = (vyb) cs.Z(i9, objArr);
            if (vyb != null) {
                vyb.measure(i, i2);
                int measuredWidth = vyb.getMeasuredWidth() + i6 + (i6 == 0 ? 0 : a24.X(((float) 4) * dh4.c().getDisplayMetrics().density));
                if (measuredWidth > size) {
                    i7++;
                    i6 = vyb.getMeasuredWidth();
                } else {
                    i6 = measuredWidth;
                }
                i8 = Math.max(i8, i6);
            }
        }
        if (i6 == 0) {
            i7 = 0;
        }
        boolean z = true;
        if (getChildCount() <= 0) {
            z = false;
        }
        if (z && (view = getChildAt(0)) == null) {
            throw new IndexOutOfBoundsException();
        }
        if (view != null) {
            i3 = view.getMeasuredHeight();
        }
        setMeasuredDimension(i8, (a24.X(((float) 8) * dh4.c().getDisplayMetrics().density) * i7) + ((i7 + 1) * i3));
    }

    public final void setChipObserver(syb syb) {
        this.b = syb;
    }

    public final void setIncoming(boolean z) {
        this.c = z;
    }

    public final void setOnChipClickListener(u16 u16) {
        this.a = u16;
    }

    public final void setStackFromEnd(boolean z) {
        this.o.o1(this, F0[0], Boolean.valueOf(z));
    }
}
