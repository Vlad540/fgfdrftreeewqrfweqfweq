package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: nc6  reason: default package */
public final class nc6 extends View {
    public static final /* synthetic */ int o = 0;
    public final Paint a;
    public final lc6 b;
    public mc6 c = jk9.i();

    public nc6(Context context) {
        super(context, (AttributeSet) null, 0);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.b = getDrawConfiguration();
    }

    public static void a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Pages number is negative".toString());
        } else if (i2 >= i) {
            throw new IllegalArgumentException("Selected page index is equal or bigger than pages number".toString());
        } else if (i2 < 0) {
            throw new IllegalArgumentException("Selected page index is negative".toString());
        }
    }

    private final int getBigDotsNumber() {
        return Math.min(1, this.c.a);
    }

    private static final mc6 getDefaultPageState() {
        return jk9.i();
    }

    private final float getDotsAnimationShift() {
        int t = hr1.t(this.c.f);
        if (t == 0 || t == 1) {
            return 0.0f;
        }
        lc6 lc6 = this.b;
        if (t == 2) {
            return (-this.c.c) * ((float) lc6.d);
        }
        if (t == 3) {
            return (1.0f - this.c.c) * ((float) lc6.d);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final lc6 getDrawConfiguration() {
        return new lc6(dh4.c().getDisplayMetrics().density * 3.0f, dh4.c().getDisplayMetrics().density * 2.0f, dh4.c().getDisplayMetrics().density * 1.0f, a24.X(((float) 12) * dh4.c().getDisplayMetrics().density));
    }

    private final float getSelectedBigDotAnimationShift() {
        int t = hr1.t(this.c.f);
        if (t == 0) {
            return 0.0f;
        }
        if (t == 1) {
            return this.c.c * ((float) this.b.d);
        }
        if (t == 2 || t == 3) {
            return 0.0f;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void b(int i, int i2) {
        if (i == 0) {
            this.c = jk9.i();
            invalidate();
            return;
        }
        a(i, i2);
        mc6 mc6 = this.c;
        if (i == mc6.a) {
            c(i2, 0.0f);
            return;
        }
        mc6.a = i;
        mc6.b = i2;
        mc6.c = 0.0f;
        if (mc6.d >= i) {
            mc6.d = Math.min(i - 1, 0);
        } else if (i <= 1) {
            mc6.d = i2;
        }
        mc6 mc62 = this.c;
        mc62.f = 1;
        mc62.e = false;
        invalidate();
    }

    public final void c(int i, float f) {
        mc6 mc6 = this.c;
        int i2 = mc6.b;
        mc6.b = i;
        int i3 = i - i2;
        int i4 = mc6.d;
        int i5 = i4 + i3;
        int i6 = 1;
        if (mc6.e && i3 == 1) {
            mc6.e = false;
            i3 = 0;
            i5 = 0;
        }
        if (i3 != 0) {
            mc6.e = i5 < 0;
        }
        mc6.d = gwf.j(i5, 0, 0);
        mc6 mc62 = this.c;
        int i7 = mc62.f;
        int i8 = mc62.b;
        int i9 = mc62.d;
        if (f != 0.0f) {
            if (i7 == 1 || i8 != i2) {
                i6 = 2;
                if (i8 < i2) {
                    if (i4 == 0 && i9 == 0) {
                        i6 = 4;
                    }
                } else if (i9 == 0) {
                    i6 = 3;
                }
            } else {
                i6 = i7;
            }
        }
        mc62.f = i6;
        mc62.c = f;
        invalidate();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0140 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            mc6 r2 = r0.c
            int r2 = r2.a
            r3 = 1
            if (r2 > r3) goto L_0x000c
            return
        L_0x000c:
            android.graphics.Paint r2 = r0.a
            lc6 r4 = r0.b
            r4.getClass()
            r5 = 1207959551(0x47ffffff, float:131071.99)
            r2.setColor(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            mc6 r6 = r0.c
            int r7 = r6.b
            int r6 = r6.d
            int r7 = r7 - r6
            r6 = 0
            r8 = 2
            if (r7 < r8) goto L_0x0032
            kc6 r9 = new kc6
            r10 = -3
            r9.<init>(r10, r6)
            r5.add(r9)
        L_0x0032:
            float r9 = r4.c
            if (r7 < r3) goto L_0x003f
            kc6 r10 = new kc6
            r11 = -2
            r10.<init>(r11, r9)
            r5.add(r10)
        L_0x003f:
            r10 = -1
            float r11 = r4.b
            if (r7 < 0) goto L_0x004c
            kc6 r7 = new kc6
            r7.<init>(r10, r11)
            r5.add(r7)
        L_0x004c:
            mc6 r7 = r0.c
            int r7 = r7.a
            int r7 = java.lang.Math.min(r3, r7)
            r12 = 0
            r13 = r12
        L_0x0056:
            float r14 = r4.a
            if (r13 >= r7) goto L_0x0065
            kc6 r15 = new kc6
            r15.<init>(r13, r14)
            r5.add(r15)
            int r13 = r13 + 1
            goto L_0x0056
        L_0x0065:
            mc6 r7 = r0.c
            int r13 = r7.f
            r15 = 3
            r10 = 4
            if (r13 == r15) goto L_0x0072
            if (r13 != r10) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r13 = r12
            goto L_0x0073
        L_0x0072:
            r13 = r3
        L_0x0073:
            int r10 = r7.a
            if (r10 > r3) goto L_0x0079
        L_0x0077:
            r10 = r12
            goto L_0x008b
        L_0x0079:
            int r6 = r10 + -1
            int r15 = r7.b
            int r8 = r15 + 1
            if (r6 > r8) goto L_0x0084
            if (r13 == 0) goto L_0x0084
            goto L_0x0077
        L_0x0084:
            int r6 = r7.d
            int r6 = 0 - r6
            int r10 = r10 - r15
            int r10 = r10 - r3
            int r10 = r10 - r6
        L_0x008b:
            if (r10 < 0) goto L_0x0095
            kc6 r6 = new kc6
            r6.<init>(r3, r11)
            r5.add(r6)
        L_0x0095:
            if (r10 < r3) goto L_0x00a1
            kc6 r6 = new kc6
            r7 = 2
            r6.<init>(r7, r9)
            r5.add(r6)
            goto L_0x00a2
        L_0x00a1:
            r7 = 2
        L_0x00a2:
            if (r10 < r7) goto L_0x00ae
            kc6 r6 = new kc6
            r7 = 0
            r8 = 3
            r6.<init>(r8, r7)
            r5.add(r6)
        L_0x00ae:
            int r6 = r20.getBigDotsNumber()
            android.graphics.PointF r7 = new android.graphics.PointF
            int r8 = r21.getWidth()
            float r8 = (float) r8
            r9 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r9
            int r10 = r21.getHeight()
            float r10 = (float) r10
            float r10 = r10 / r9
            r7.<init>(r8, r10)
            float r8 = r20.getDotsAnimationShift()
            int r6 = r6 - r3
            float r6 = (float) r6
            float r6 = r6 / r9
            int r10 = r5.size()
        L_0x00d0:
            int r11 = r4.d
            if (r12 >= r10) goto L_0x0140
            java.lang.Object r13 = r5.get(r12)
            kc6 r13 = (defpackage.kc6) r13
            int r15 = r13.b
            float r15 = (float) r15
            float r15 = r15 - r6
            float r11 = (float) r11
            float r15 = r15 * r11
            float r11 = r7.x
            float r11 = r11 + r15
            float r11 = r11 + r8
            int r15 = r12 + -1
            java.lang.Object r15 = defpackage.o23.Y(r15, r5)
            kc6 r15 = (defpackage.kc6) r15
            int r12 = r12 + 1
            java.lang.Object r17 = defpackage.o23.Y(r12, r5)
            r3 = r17
            kc6 r3 = (defpackage.kc6) r3
            mc6 r9 = r0.c
            r18 = r4
            int r4 = r9.f
            r19 = r5
            float r13 = r13.a
            r5 = 3
            if (r4 != r5) goto L_0x0113
            if (r15 == 0) goto L_0x0113
            float r3 = r9.c
            float r4 = r15.a
            float r4 = r4 * r3
            r9 = 1065353216(0x3f800000, float:1.0)
            float r3 = us8.g(r9, r3, r13, r4)
            r4 = 0
            r5 = 4
            goto L_0x012e
        L_0x0113:
            r16 = 1065353216(0x3f800000, float:1.0)
            r5 = 4
            if (r4 != r5) goto L_0x0126
            if (r3 == 0) goto L_0x0126
            float r4 = r9.c
            float r13 = r13 * r4
            float r4 = r16 - r4
            float r3 = r3.a
            float r4 = r4 * r3
            float r3 = r4 + r13
        L_0x0124:
            r4 = 0
            goto L_0x012e
        L_0x0126:
            if (r15 == 0) goto L_0x012c
            if (r3 == 0) goto L_0x012c
            r3 = r13
            goto L_0x0124
        L_0x012c:
            r3 = 0
            goto L_0x0124
        L_0x012e:
            int r9 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x0133
            goto L_0x0138
        L_0x0133:
            float r9 = r7.y
            r1.drawCircle(r11, r9, r3, r2)
        L_0x0138:
            r4 = r18
            r5 = r19
            r3 = 1
            r9 = 1073741824(0x40000000, float:2.0)
            goto L_0x00d0
        L_0x0140:
            r3 = -1
            r2.setColor(r3)
            int r3 = r20.getBigDotsNumber()
            android.graphics.PointF r4 = new android.graphics.PointF
            int r5 = r21.getWidth()
            float r5 = (float) r5
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            int r7 = r21.getHeight()
            float r7 = (float) r7
            float r7 = r7 / r6
            r4.<init>(r5, r7)
            float r5 = r20.getSelectedBigDotAnimationShift()
            r7 = 1
            int r3 = r3 - r7
            float r3 = (float) r3
            float r3 = r3 / r6
            mc6 r0 = r0.c
            int r0 = r0.d
            float r0 = (float) r0
            float r0 = r0 - r3
            float r3 = (float) r11
            float r0 = r0 * r3
            float r3 = r4.x
            float r3 = r3 + r0
            float r3 = r3 + r5
            float r0 = r4.y
            r1.drawCircle(r3, r0, r14, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc6.onDraw(android.graphics.Canvas):void");
    }

    public final void setSelectedPageIndex(int i) {
        a(this.c.a, i);
        c(i, 0.0f);
    }
}
