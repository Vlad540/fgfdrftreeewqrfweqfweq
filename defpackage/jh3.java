package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;

/* renamed from: jh3  reason: default package */
public final class jh3 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ kh3 o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public jh3(defpackage.kh3 r1, int r2) {
        /*
            r0 = this;
            r0.c = r2
            switch(r2) {
                case 1: goto L_0x0022;
                case 2: goto L_0x0019;
                case 3: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.o = r1
            r1 = 9
            r0.<init>(r1, r2)
            return
        L_0x000f:
            ih3 r2 = defpackage.ih3.a
            r0.o = r1
            r1 = 9
            r0.<init>(r1, r2)
            return
        L_0x0019:
            r0.o = r1
            r1 = 0
            r2 = 9
            r0.<init>(r2, r1)
            return
        L_0x0022:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.o = r1
            r1 = 9
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jh3.<init>(kh3, int):void");
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                if (((Boolean) obj).booleanValue() != booleanValue) {
                    kh3 kh3 = this.o;
                    if (kh3.T0.a() || booleanValue) {
                        ((View) kh3.T0.getValue()).setVisibility(booleanValue ? 0 : 8);
                        kh3.x(kh3);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                if (((Boolean) obj).booleanValue() != booleanValue2) {
                    t97 t97 = this.o.T0;
                    if (t97.a()) {
                        ((AppCompatCheckBox) t97.getValue()).setChecked(booleanValue2);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                pda pda = (pda) obj2;
                if (!hhd.f((pda) obj, pda)) {
                    kh3 kh32 = this.o;
                    if (pda == null) {
                        pda = km4.y0.r(kh32);
                    }
                    kh32.onThemeChanged(pda);
                    return;
                }
                return;
            default:
                if (((ih3) obj) != ((ih3) obj2)) {
                    this.o.T();
                    return;
                }
                return;
        }
    }
}
