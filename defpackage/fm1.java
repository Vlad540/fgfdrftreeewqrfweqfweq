package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: fm1  reason: default package */
public final class fm1 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ gm1 o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fm1(defpackage.gm1 r1, int r2) {
        /*
            r0 = this;
            r0.c = r2
            switch(r2) {
                case 1: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            cm1 r2 = defpackage.cm1.b
            r0.o = r1
            r1 = 9
            r0.<init>(r1, r2)
            return
        L_0x000f:
            dm1 r2 = defpackage.dm1.o
            r0.o = r1
            r1 = 9
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fm1.<init>(gm1, int):void");
    }

    public final void L1(Object obj, Object obj2) {
        jdd background;
        jdd background2;
        jdd background3;
        jdd background4;
        switch (this.c) {
            case 0:
                if (!hhd.f(obj, obj2)) {
                    cm1 cm1 = (cm1) obj;
                    int ordinal = ((cm1) obj2).ordinal();
                    yfc yfc = yfc.b;
                    gm1 gm1 = this.o;
                    if (ordinal == 0) {
                        gm1.getNegativeButtonView().setMode(yfc.c);
                        gm1.getPositiveButtonView().setMode(yfc);
                        return;
                    } else if (ordinal == 1) {
                        gm1.getNegativeButtonView().setMode(yfc.a);
                        gm1.getPositiveButtonView().setMode(yfc);
                        return;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    return;
                }
            default:
                if (!hhd.f(obj, obj2)) {
                    dm1 dm1 = (dm1) obj2;
                    dm1 dm12 = (dm1) obj;
                    int ordinal2 = dm1.ordinal();
                    qda qda = qda.a;
                    gm1 gm12 = this.o;
                    if (ordinal2 == 0 || ordinal2 == 1) {
                        if (gm12.getBackground() == null) {
                            gm12.setBackground(gm12.getAnimatedBackground());
                        }
                        dm1 dm13 = dm1.b;
                        dm1 dm14 = dm1.a;
                        if (dm12 == dm13 && dm1 == dm14 && (background2 = gm12.getBackground()) != null) {
                            background2.setAlpha(128);
                        }
                        jdd background5 = gm12.getBackground();
                        if (background5 != null) {
                            background5.b.b(dm1 == dm14 ? fdd.c : fdd.b);
                        }
                        if (gm12.isAttachedToWindow() && (background = gm12.getBackground()) != null && !background.isRunning()) {
                            jdd background6 = gm12.getBackground();
                            if (background6 != null) {
                                background6.onThemeChanged(qda);
                            }
                            jdd background7 = gm12.getBackground();
                            if (background7 != null) {
                                background7.start();
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (ordinal2 == 2) {
                        if (gm12.getBackground() == null) {
                            gm12.setBackground(gm12.getAnimatedBackground());
                        }
                        jdd background8 = gm12.getBackground();
                        if (background8 != null) {
                            background8.b.b(fdd.o);
                        }
                        if (gm12.isAttachedToWindow() && (background3 = gm12.getBackground()) != null && !background3.isRunning()) {
                            jdd background9 = gm12.getBackground();
                            if (background9 != null) {
                                background9.onThemeChanged(qda);
                            }
                            jdd background10 = gm12.getBackground();
                            if (background10 != null) {
                                background10.start();
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (ordinal2 == 3) {
                        if (gm12.isAttachedToWindow() && (background4 = gm12.getBackground()) != null) {
                            background4.stop();
                        }
                        gm12.setBackground((Drawable) null);
                        return;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    return;
                }
        }
    }
}
