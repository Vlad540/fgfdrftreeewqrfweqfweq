package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: mea  reason: default package */
public final class mea extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ nea o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mea(nea nea, int i, boolean z) {
        super(9, (Object) null);
        this.c = i;
        this.o = nea;
    }

    public final void L1(Object obj, Object obj2) {
        OneMeButton oneMeButton;
        int i;
        int i2;
        int intValue;
        int intValue2;
        switch (this.c) {
            case 0:
                pda pda = (pda) obj2;
                if (!hhd.f((pda) obj, pda)) {
                    nea nea = this.o;
                    if (pda == null) {
                        pda = km4.y0.r(nea);
                    }
                    nea.onThemeChanged(pda);
                    return;
                }
                return;
            case 1:
                if (((fea) obj) != ((fea) obj2)) {
                    nea nea2 = this.o;
                    nea2.l();
                    nea2.k();
                    if (!nea2.g()) {
                        nea2.requestLayout();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                dea dea = (dea) obj2;
                if (!hhd.f((dea) obj, dea)) {
                    nea nea3 = this.o;
                    nea.d(nea3, dea);
                    nea3.k();
                    if (!nea3.g()) {
                        nea3.requestLayout();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                bea bea = (bea) obj2;
                bea bea2 = (bea) obj;
                nea nea4 = this.o;
                if ((nea4.getForm() == fea.a || nea4.getForm() == fea.c) && !hhd.f(bea2, bea)) {
                    nea4.removeView(nea4.E0);
                    Context context = nea4.getContext();
                    pda customTheme = nea4.getCustomTheme();
                    OneMeButton oneMeButton2 = null;
                    if (bea instanceof vda) {
                        oneMeButton = new OneMeButton(context, (AttributeSet) null);
                        oneMeButton.setCustomTheme(customTheme);
                        oneMeButton.d(Integer.valueOf(phc.d0), true);
                        a24.a0(oneMeButton, new zle(bea, 0));
                    } else if (bea instanceof wda) {
                        oneMeButton = new OneMeButton(context, (AttributeSet) null);
                        oneMeButton.setCustomTheme(customTheme);
                        oneMeButton.d(Integer.valueOf(phc.p0), true);
                        a24.a0(oneMeButton, new zle(bea, 1));
                    } else if (bea instanceof zda) {
                        jea jea = ((zda) bea).a;
                        if (jea instanceof gea) {
                            OneMeButton oneMeButton3 = new OneMeButton(context, (AttributeSet) null);
                            oneMeButton3.setCustomTheme(customTheme);
                            oneMeButton3.d(Integer.valueOf(((gea) jea).a), true);
                            a24.a0(oneMeButton3, new zle(bea, 2));
                            oneMeButton = oneMeButton3;
                        } else if ((jea instanceof iea) || (jea instanceof hea)) {
                            throw new Error("Left action should not support search icon");
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (bea instanceof yda) {
                        oneMeButton = null;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (oneMeButton != null) {
                        oneMeButton.setId(qhc.N);
                        oneMeButton2 = oneMeButton;
                    }
                    nea4.E0 = oneMeButton2;
                    if (oneMeButton2 != null) {
                        nea4.addView(oneMeButton2);
                        x87.H(oneMeButton2, a24.X(((float) 40) * dh4.c().getDisplayMetrics().density), a24.X(((float) 52) * dh4.c().getDisplayMetrics().density));
                    }
                    nea4.k();
                    if (!nea4.g()) {
                        nea4.requestLayout();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                wia wia = (wia) obj2;
                wia wia2 = (wia) obj;
                nea nea5 = this.o;
                int ordinal = nea5.getForm().ordinal();
                if (ordinal == 0) {
                    intValue = wia != null ? ((Number) wia.a).intValue() : a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
                    intValue2 = wia != null ? ((Number) wia.b).intValue() : a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
                } else if (ordinal == 1) {
                    intValue = wia != null ? ((Number) wia.a).intValue() : a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
                    intValue2 = wia != null ? ((Number) wia.b).intValue() : a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
                } else if (ordinal == 2) {
                    i2 = wia != null ? ((Number) wia.a).intValue() : a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
                    i = wia != null ? ((Number) wia.b).intValue() : a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
                    nea5.setPadding(i2, 0, i, 0);
                    return;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = intValue;
                i = intValue2;
                nea5.setPadding(i2, 0, i, 0);
                return;
            default:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                nea nea6 = this.o;
                if (booleanValue2 != booleanValue) {
                    nea6.k();
                }
                if (nea6.z0.a()) {
                    ((ddd) nea6.z0.getValue()).a(booleanValue);
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public mea(defpackage.nea r1, int r2) {
        /*
            r0 = this;
            r0.c = r2
            switch(r2) {
                case 2: goto L_0x0023;
                case 3: goto L_0x0019;
                case 4: goto L_0x0005;
                case 5: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            fea r2 = defpackage.fea.a
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        L_0x000f:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        L_0x0019:
            yda r2 = defpackage.yda.a
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        L_0x0023:
            yda r2 = defpackage.yda.a
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mea.<init>(nea, int):void");
    }
}
