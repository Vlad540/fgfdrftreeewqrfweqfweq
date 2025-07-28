package ru.ok.messages.media.trim.rangeSeekBar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.LongSparseArray;
import android.view.View;
import java.util.Set;
import ru.ok.messages.media.trim.FrgTrimVideo;

public class RangeSeekBarView extends View implements kjb {
    public static int U0 = 0;
    public static float V0 = 1.0f;
    public static float W0 = 1.0f;
    public wo0 A0;
    public wo0 B0;
    public boolean C0;
    public float D0;
    public float E0;
    public float F0;
    public float G0;
    public float H0;
    public long I0;
    public boolean J0;
    public final LongSparseArray K0 = new LongSparseArray();
    public Rect L0;
    public FrgTrimVideo M0;
    public c97 N0;
    public final Paint O0;
    public int P0;
    public float Q0;
    public long R0;
    public final zg4 S0;
    public final boolean T0;
    public final int a;
    public final int b;
    public final int c;
    public qx9 o;
    public final int w0;
    public final Paint x0;
    public int y0;
    public yza z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RangeSeekBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        boolean z = false;
        getContext();
        zg4 b2 = zg4.b();
        this.S0 = b2;
        int i = b2.h;
        this.a = i;
        int i2 = b2.e;
        this.b = i2;
        this.c = i + i2;
        Paint paint = new Paint();
        this.x0 = paint;
        Context context2 = getContext();
        r7e r7e = wce.a0;
        wce E = fja.E(context2);
        paint.setColor(n1g.c0(E.m, 0.8f));
        Paint paint2 = new Paint();
        this.O0 = paint2;
        paint2.setColor(E.m);
        paint2.setStrokeWidth(1.0f);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        this.w0 = b2.z;
        setLayerType(1, (Paint) null);
        this.T0 = getContext().getResources().getConfiguration().getLayoutDirection() == 1 ? true : z;
    }

    public final void a() {
        int i = this.y0;
        if (i == 0) {
            if (this.A0.b() > this.B0.b()) {
                this.A0.e(this.B0.b());
            } else if (this.A0.b() < 0.0f) {
                this.A0.e(0.0f);
            }
            if (this.B0.b() - this.A0.b() > this.E0) {
                this.A0.e(this.B0.b() - this.E0);
            } else if (this.B0.b() - this.A0.b() < this.D0) {
                this.A0.e(this.B0.b() - this.D0);
            }
        } else if (i == 1) {
            if (this.B0.b() < this.A0.b()) {
                this.B0.e(this.A0.b());
            } else {
                float b2 = this.B0.b();
                float f = V0;
                if (b2 > f) {
                    this.B0.e(f);
                }
            }
            if (this.B0.b() - this.A0.b() > this.E0) {
                this.B0.e(this.A0.b() + this.E0);
            } else if (this.B0.b() - this.A0.b() < this.D0) {
                this.B0.e(this.A0.b() + this.D0);
            }
        }
        if (this.z0.a() < this.A0.b()) {
            this.z0.c(this.A0.b());
            this.C0 = true;
        } else if (this.z0.a() > this.B0.b()) {
            this.z0.c(this.B0.b());
            this.C0 = true;
        }
        getContext();
        float f2 = this.B0.j.left - ((float) (this.S0.j * 2));
        wo0 wo0 = this.A0;
        RectF rectF = wo0.j;
        float f3 = rectF.right;
        if (((float) zg4.a(48.0f)) > f2 - f3) {
            wo0.d();
            this.B0.d();
            return;
        }
        RectF rectF2 = wo0.k;
        float f4 = rectF.left;
        float f5 = (float) wo0.d;
        rectF2.set(f4 - f5, rectF.top, f3 + f5, rectF.bottom);
        wo0 wo02 = this.B0;
        RectF rectF3 = wo02.k;
        RectF rectF4 = wo02.j;
        float f6 = rectF4.left;
        float f7 = (float) wo02.d;
        rectF3.set(f6 - f7, rectF4.top, rectF4.right + f7, rectF4.bottom);
    }

    public final float b(float f) {
        return (((f - 0.0f) / W0) * ((float) U0)) + ((float) this.S0.j) + ((float) this.a);
    }

    public final float c(float f) {
        return ((((f - ((float) this.S0.j)) - ((float) this.a)) * W0) / ((float) U0)) + 0.0f;
    }

    public final int d(long j) {
        long j2 = this.I0;
        return ((int) (((((float) j) - (0.0f * ((float) j2))) / (W0 * ((float) j2))) * ((float) U0))) + this.S0.j + this.a;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tic.b(this.N0);
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        if (this.J0) {
            boolean z = this.T0;
            if (z) {
                canvas.save();
                canvas2.scale(-1.0f, 1.0f, (float) (canvas.getWidth() / 2), (float) (canvas.getHeight() / 2));
            }
            canvas.save();
            canvas2.translate(0.0f, (float) this.b);
            if (this.R0 != 0) {
                canvas.save();
                canvas2.clipRect(this.L0);
                long j = this.R0;
                long j2 = (((long) (((float) this.I0) * 0.0f)) / j) * j;
                long j3 = (j * ((long) (((int) this.Q0) + 2))) + j2;
                int d = d(j2);
                int d2 = d(j3);
                int i = d;
                while (i < d2) {
                    float f = (float) i;
                    float f2 = f;
                    int i2 = i;
                    canvas.drawLine(f, (float) 0, f2, (float) this.P0, this.O0);
                    i = i2 + this.P0;
                    j3 = j3;
                }
                long j4 = j3;
                LongSparseArray longSparseArray = this.K0;
                if (longSparseArray.size() != 0) {
                    if (z) {
                        canvas.save();
                        canvas2.scale(-1.0f, 1.0f, (float) (canvas.getWidth() / 2), (float) (canvas.getHeight() / 2));
                    }
                    for (int i3 = 0; i3 < longSparseArray.size(); i3++) {
                        long keyAt = longSparseArray.keyAt(i3);
                        int d3 = d(keyAt);
                        if (z) {
                            d3 = getWidth() - d3;
                        }
                        if (keyAt > j2 || keyAt < j4) {
                            canvas2.drawBitmap((Bitmap) longSparseArray.valueAt(i3), (float) d3, (float) 0, (Paint) null);
                        }
                    }
                    if (z) {
                        canvas.restore();
                    }
                }
                canvas.restore();
            }
            float b2 = this.A0.b();
            zg4 zg4 = this.S0;
            int i4 = (b2 > c((float) (zg4.j / 2)) ? 1 : (b2 == c((float) (zg4.j / 2)) ? 0 : -1));
            Paint paint = this.x0;
            if (i4 > 0) {
                canvas.drawRect(b(0.0f), (float) 0, b(this.A0.b()) - ((float) (zg4.j / 2)), (float) zg4.z, paint);
            }
            if (this.B0.b() < V0 - (c((float) (zg4.j / 2)) - 0.0f)) {
                Canvas canvas3 = canvas;
                canvas3.drawRect(((float) (zg4.j / 2)) + b(this.B0.b()), (float) 0, b(V0), (float) zg4.z, paint);
            }
            this.A0.a(canvas2);
            this.B0.a(canvas2);
            canvas.restore();
            yza yza = this.z0;
            RectF rectF = yza.i;
            canvas2.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.width() / 2.0f, yza.c);
            RectF rectF2 = yza.j;
            Paint paint2 = yza.e;
            canvas2.drawRect(rectF2, paint2);
            canvas2.drawRect(yza.k, paint2);
            canvas2.drawCircle(yza.g.centerX(), (float) yza.f, (float) yza.b, yza.d);
            if (z) {
                canvas.restore();
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        zg4 zg4 = this.S0;
        setMeasuredDimension(View.MeasureSpec.getSize(i), zg4.z + this.c + zg4.h + zg4.i);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int width = getWidth();
        zg4 zg4 = this.S0;
        int i5 = width - (zg4.j * 2);
        int i6 = this.a;
        U0 = i5 - (i6 * 2);
        this.z0 = new yza(this.b + zg4.z + this.c + zg4.h, getContext(), this);
        int i7 = 0;
        this.A0 = new wo0(0, getContext(), this);
        this.B0 = new wo0(1, getContext(), this);
        this.A0.e(this.F0);
        this.B0.e(this.G0);
        this.z0.c(this.H0);
        this.y0 = 1;
        a();
        this.y0 = 3;
        int i8 = zg4.j + i6;
        int i9 = this.w0;
        this.L0 = new Rect(i8, 0, U0 + i8, i9);
        this.P0 = i9;
        float width2 = ((float) (getWidth() - (zg4.j * 2))) / ((float) this.P0);
        this.Q0 = width2;
        this.R0 = (long) ((int) ((W0 * ((float) this.I0)) / width2));
        tic.b(this.N0);
        LongSparseArray longSparseArray = this.K0;
        longSparseArray.clear();
        long j = this.R0;
        if (j != 0) {
            long j2 = (((long) (0.0f * ((float) this.I0))) / j) * j;
            long j3 = (j * ((long) (((int) this.Q0) + 2))) + j2;
            while (i7 < longSparseArray.size()) {
                long keyAt = longSparseArray.keyAt(i7);
                long j4 = this.R0 * 30;
                if (keyAt < j2 - j4 || keyAt > j4 + j3) {
                    longSparseArray.removeAt(i7);
                    i7--;
                }
                i7++;
            }
            nu9 n = new n73(2, new sq1(this, j2, 6)).r(cnc.a()).n(de.a());
            c97 c97 = new c97(new ss8(25, (Object) this), new lpa(3), z3d.i);
            n.a(c97);
            this.N0 = c97;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r2 != 3) goto L_0x0287;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            wo0 r0 = r10.A0
            r1 = 0
            if (r0 == 0) goto L_0x029a
            wo0 r0 = r10.B0
            if (r0 == 0) goto L_0x029a
            yza r0 = r10.z0
            if (r0 != 0) goto L_0x000f
            goto L_0x029a
        L_0x000f:
            boolean r0 = r10.T0
            if (r0 == 0) goto L_0x0024
            int r2 = r10.getWidth()
            float r2 = (float) r2
            float r3 = r11.getX()
            float r2 = r2 - r3
            float r3 = r11.getY()
            r11.setLocation(r2, r3)
        L_0x0024:
            int r2 = r11.getAction()
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x022a
            java.lang.String r6 = "ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView"
            java.lang.String r7 = "Unknown moving type: %s"
            if (r2 == r5) goto L_0x0140
            if (r2 == r4) goto L_0x0039
            if (r2 == r3) goto L_0x0140
            goto L_0x0287
        L_0x0039:
            int r2 = r10.y0
            if (r2 == 0) goto L_0x005b
            if (r2 == r5) goto L_0x0055
            if (r2 == r4) goto L_0x004f
            if (r2 == r3) goto L_0x013d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            udd.t(r6, r7, r2)
            goto L_0x0060
        L_0x004f:
            yza r2 = r10.z0
            r2.b(r11)
            goto L_0x0060
        L_0x0055:
            wo0 r2 = r10.B0
            r2.c(r11)
            goto L_0x0060
        L_0x005b:
            wo0 r2 = r10.A0
            r2.c(r11)
        L_0x0060:
            r10.a()
            qx9 r2 = r10.o
            if (r2 != 0) goto L_0x006c
            r10.invalidate()
            goto L_0x013d
        L_0x006c:
            int r8 = r10.y0
            if (r8 == 0) goto L_0x00d6
            if (r8 == r5) goto L_0x00bf
            if (r8 == r4) goto L_0x0082
            if (r8 == r3) goto L_0x00ec
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            udd.t(r6, r7, r2)
            goto L_0x00ec
        L_0x0082:
            yza r3 = r10.z0
            float r3 = r3.a()
            long r6 = r10.I0
            float r4 = (float) r6
            float r3 = r3 * r4
            long r3 = (long) r3
            jf9 r2 = (defpackage.jf9) r2
            java.lang.Object r2 = r2.a
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0097:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00ec
            java.lang.Object r6 = r2.next()
            de9 r6 = (defpackage.de9) r6
            r6.y0 = r3
            q98 r7 = r6.Y
            al7 r7 = (defpackage.al7) r7
            boolean r7 = r7.j()
            if (r7 == 0) goto L_0x00b2
            r6.pause()
        L_0x00b2:
            r6.Z1()
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            ajb r6 = r6.z0
            r6.c(r7)
            goto L_0x0097
        L_0x00bf:
            wo0 r3 = r10.B0
            float r3 = r3.b()
            long r6 = r10.I0
            float r4 = (float) r6
            float r3 = r3 * r4
            long r3 = (long) r3
            jf9 r2 = (defpackage.jf9) r2
            hf9 r6 = new hf9
            r7 = 1
            r6.<init>(r3, r7)
            r2.o(r6)
            goto L_0x00ec
        L_0x00d6:
            wo0 r3 = r10.A0
            float r3 = r3.b()
            long r6 = r10.I0
            float r4 = (float) r6
            float r3 = r3 * r4
            long r3 = (long) r3
            jf9 r2 = (defpackage.jf9) r2
            hf9 r6 = new hf9
            r7 = 0
            r6.<init>(r3, r7)
            r2.o(r6)
        L_0x00ec:
            boolean r2 = r10.C0
            if (r2 == 0) goto L_0x013a
            int r2 = r10.y0
            if (r2 == 0) goto L_0x00f6
            if (r2 != r5) goto L_0x013a
        L_0x00f6:
            qx9 r2 = r10.o
            yza r3 = r10.z0
            float r3 = r3.a()
            long r6 = r10.I0
            float r4 = (float) r6
            float r3 = r3 * r4
            long r3 = (long) r3
            jf9 r2 = (defpackage.jf9) r2
            r2.getClass()
            java.lang.Object r2 = r2.a
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0110:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0138
            java.lang.Object r6 = r2.next()
            de9 r6 = (defpackage.de9) r6
            r6.y0 = r3
            q98 r7 = r6.Y
            al7 r7 = (defpackage.al7) r7
            boolean r7 = r7.j()
            if (r7 == 0) goto L_0x012b
            r6.pause()
        L_0x012b:
            r6.Z1()
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            ajb r6 = r6.z0
            r6.c(r7)
            goto L_0x0110
        L_0x0138:
            r10.C0 = r1
        L_0x013a:
            r10.invalidate()
        L_0x013d:
            r1 = r5
            goto L_0x0287
        L_0x0140:
            qx9 r2 = r10.o
            if (r2 == 0) goto L_0x0224
            int r8 = r10.y0
            if (r8 == 0) goto L_0x01bc
            if (r8 == r5) goto L_0x0189
            if (r8 == r4) goto L_0x015b
            if (r8 == r3) goto L_0x01e7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            udd.t(r6, r7, r2)
            goto L_0x01e7
        L_0x015b:
            yza r4 = r10.z0
            float r4 = r4.a()
            long r6 = r10.I0
            float r6 = (float) r6
            float r4 = r4 * r6
            long r6 = (long) r4
            jf9 r2 = (defpackage.jf9) r2
            java.lang.Object r2 = r2.a
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0170:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x01e7
            java.lang.Object r4 = r2.next()
            de9 r4 = (defpackage.de9) r4
            r4.y0 = r6
            r4.b2()
            q98 r4 = r4.Y
            al7 r4 = (defpackage.al7) r4
            r4.p(r6)
            goto L_0x0170
        L_0x0189:
            wo0 r4 = r10.B0
            float r4 = r4.b()
            long r6 = r10.I0
            float r6 = (float) r6
            float r4 = r4 * r6
            long r6 = (long) r4
            jf9 r2 = (defpackage.jf9) r2
            java.lang.Object r2 = r2.a
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x019e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x01e7
            java.lang.Object r4 = r2.next()
            de9 r4 = (defpackage.de9) r4
            r4.x0 = r6
            r4.c2()
            r4.b2()
            long r8 = r4.y0
            q98 r4 = r4.Y
            al7 r4 = (defpackage.al7) r4
            r4.p(r8)
            goto L_0x019e
        L_0x01bc:
            wo0 r4 = r10.A0
            r4.b()
            jf9 r2 = (defpackage.jf9) r2
            java.lang.Object r2 = r2.a
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x01cb:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x01e7
            java.lang.Object r4 = r2.next()
            de9 r4 = (defpackage.de9) r4
            r4.c2()
            r4.b2()
            long r6 = r4.y0
            q98 r4 = r4.Y
            al7 r4 = (defpackage.al7) r4
            r4.p(r6)
            goto L_0x01cb
        L_0x01e7:
            boolean r2 = r10.C0
            if (r2 == 0) goto L_0x0224
            int r2 = r10.y0
            if (r2 == 0) goto L_0x01f1
            if (r2 != r5) goto L_0x0224
        L_0x01f1:
            qx9 r2 = r10.o
            yza r4 = r10.z0
            float r4 = r4.a()
            long r6 = r10.I0
            float r6 = (float) r6
            float r4 = r4 * r6
            long r6 = (long) r4
            jf9 r2 = (defpackage.jf9) r2
            r2.getClass()
            java.lang.Object r2 = r2.a
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x020b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0224
            java.lang.Object r4 = r2.next()
            de9 r4 = (defpackage.de9) r4
            r4.y0 = r6
            r4.b2()
            q98 r4 = r4.Y
            al7 r4 = (defpackage.al7) r4
            r4.p(r6)
            goto L_0x020b
        L_0x0224:
            r10.y0 = r3
            r10.C0 = r1
            goto L_0x013d
        L_0x022a:
            wo0 r2 = r10.A0
            float r6 = r11.getX()
            float r7 = r11.getY()
            android.graphics.RectF r2 = r2.k
            boolean r2 = r2.contains(r6, r7)
            if (r2 == 0) goto L_0x0244
            r10.y0 = r1
            wo0 r1 = r10.A0
            r1.c(r11)
            goto L_0x027a
        L_0x0244:
            wo0 r1 = r10.B0
            float r2 = r11.getX()
            float r6 = r11.getY()
            android.graphics.RectF r1 = r1.k
            boolean r1 = r1.contains(r2, r6)
            if (r1 == 0) goto L_0x025e
            r10.y0 = r5
            wo0 r1 = r10.B0
            r1.c(r11)
            goto L_0x027a
        L_0x025e:
            yza r1 = r10.z0
            float r2 = r11.getX()
            float r6 = r11.getY()
            android.graphics.RectF r1 = r1.g
            boolean r1 = r1.contains(r2, r6)
            if (r1 == 0) goto L_0x0278
            r10.y0 = r4
            yza r1 = r10.z0
            r1.b(r11)
            goto L_0x027a
        L_0x0278:
            r10.y0 = r3
        L_0x027a:
            int r1 = r10.y0
            if (r1 == r3) goto L_0x013d
            android.view.ViewParent r1 = r10.getParent()
            r1.requestDisallowInterceptTouchEvent(r5)
            goto L_0x013d
        L_0x0287:
            if (r0 == 0) goto L_0x029a
            int r10 = r10.getWidth()
            float r10 = (float) r10
            float r0 = r11.getX()
            float r10 = r10 - r0
            float r0 = r11.getY()
            r11.setLocation(r10, r0)
        L_0x029a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setEndPosition(long j) {
        this.B0.e(((float) j) / ((float) this.I0));
        a();
        invalidate();
    }

    public void setOnChangeRangeSeekBarListener(qx9 qx9) {
        wo0 wo0;
        this.o = qx9;
        if (qx9 != null && (wo0 = this.A0) != null && this.B0 != null && this.z0 != null) {
            wo0.b();
            Set<de9> set = (Set) ((jf9) qx9).a;
            for (de9 de9 : set) {
                de9.c2();
                de9.b2();
                ((al7) de9.Y).p(de9.y0);
            }
            long b2 = (long) (this.B0.b() * ((float) this.I0));
            for (de9 de92 : set) {
                de92.x0 = b2;
                de92.c2();
                de92.b2();
                ((al7) de92.Y).p(de92.y0);
            }
            long a2 = (long) (this.z0.a() * ((float) this.I0));
            for (de9 de93 : set) {
                de93.y0 = a2;
                de93.b2();
                ((al7) de93.Y).p(a2);
            }
        }
    }

    public void setPointerPosition(long j) {
        this.z0.c(((float) j) / ((float) this.I0));
        a();
        invalidate();
    }

    public void setStartPosition(long j) {
        this.A0.e(((float) j) / ((float) this.I0));
        a();
        invalidate();
    }
}
