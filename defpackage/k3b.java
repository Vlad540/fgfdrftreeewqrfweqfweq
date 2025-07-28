package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: k3b  reason: default package */
public final class k3b extends FrameLayout {
    public final l3b A0;
    public final xvf B0;
    public fu1 C0;
    public MotionEvent D0;
    public final g3b E0;
    public final s41 F0;
    public final ea6 G0;
    public h3b a = h3b.PERFORMANCE;
    public io9 b;
    public final vnc c;
    public final f3b o;
    public boolean w0;
    public final vb9 x0;
    public final AtomicReference y0;
    public st1 z0;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r8v0, types: [f3b, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [yh7, vb9] */
    /* JADX WARNING: type inference failed for: r0v5, types: [android.view.View, vnc] */
    public k3b(Context context) {
        super(context, (AttributeSet) null, 0, 0);
        ? obj = new Object();
        obj.h = i3b.FILL_CENTER;
        this.o = obj;
        this.w0 = true;
        this.x0 = new yh7(j3b.a);
        this.y0 = new AtomicReference();
        this.A0 = new l3b(obj);
        this.E0 = new g3b(this);
        this.F0 = new s41(4, this);
        this.G0 = new ea6(23, this);
        gt0.i();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, bwb.PreviewView, 0, 0);
        int[] iArr = bwb.PreviewView;
        WeakHashMap weakHashMap = eaf.a;
        z9f.d(this, context, iArr, (AttributeSet) null, obtainStyledAttributes, 0, 0);
        try {
            int integer = obtainStyledAttributes.getInteger(bwb.PreviewView_scaleType, obj.h.a);
            for (i3b i3b : i3b.values()) {
                if (i3b.a == integer) {
                    setScaleType(i3b);
                    int integer2 = obtainStyledAttributes.getInteger(bwb.PreviewView_implementationMode, 0);
                    for (h3b h3b : h3b.values()) {
                        if (h3b.a == integer2) {
                            setImplementationMode(h3b);
                            obtainStyledAttributes.recycle();
                            this.B0 = new xvf(context, new ss8(20, this));
                            if (getBackground() == null) {
                                setBackgroundColor(hq3.a(getContext(), 17170444));
                            }
                            ? view = new View(context, (AttributeSet) null, 0, 0);
                            view.setBackgroundColor(-1);
                            view.setAlpha(0.0f);
                            view.setElevation(Float.MAX_VALUE);
                            this.c = view;
                            view.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static boolean c(y4e y4e, h3b h3b) {
        boolean equals = y4e.e.p().j().equals("androidx.camera.camera2.legacy");
        boolean z = (yf4.a.j(SurfaceViewStretchedQuirk.class) == null && yf4.a.j(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (equals || z) {
            return true;
        }
        int ordinal = h3b.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + h3b);
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private aq6 getScreenFlashInternal() {
        return this.c.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int ordinal = getScaleType().ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (!(ordinal == 3 || ordinal == 4 || ordinal == 5)) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i;
    }

    private void setScreenFlashUiInfo(aq6 aq6) {
        st1 st1 = this.z0;
        if (st1 != null) {
            snc snc = snc.a;
            tnc tnc = new tnc(snc, aq6);
            tnc f = st1.f();
            st1.C.put(snc, tnc);
            tnc f2 = st1.f();
            if (f2 != null && !f2.equals(f)) {
                tnc f3 = st1.f();
                if (f3 == null) {
                    bq6 bq6 = st1.d;
                    qt1 qt1 = st1.D;
                    bq6.getClass();
                    wnc wnc = new wnc(qt1);
                    bq6.u = wnc;
                    bq6.d().g(wnc);
                    return;
                }
                bq6 bq62 = st1.d;
                bq62.getClass();
                wnc wnc2 = new wnc(f3.b);
                bq62.u = wnc2;
                bq62.d().g(wnc2);
                f3.a.name();
            }
        }
    }

    public final void a(boolean z) {
        gt0.i();
        ybf viewPort = getViewPort();
        if (this.z0 != null && viewPort != null && isAttachedToWindow()) {
            try {
                this.z0.a(getSurfaceProvider(), viewPort);
            } catch (IllegalStateException e) {
                if (z) {
                    e.toString();
                    return;
                }
                throw e;
            }
        }
    }

    public final void b() {
        Display display;
        fu1 fu1;
        gt0.i();
        if (this.b != null) {
            if (!(!this.w0 || (display = getDisplay()) == null || (fu1 = this.C0) == null)) {
                int l = fu1.l(display.getRotation());
                int rotation = display.getRotation();
                f3b f3b = this.o;
                if (f3b.g) {
                    f3b.c = l;
                    f3b.e = rotation;
                }
            }
            this.b.m();
        }
        l3b l3b = this.A0;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        l3b.getClass();
        gt0.i();
        synchronized (l3b) {
            try {
                if (!(size.getWidth() == 0 || size.getHeight() == 0)) {
                    Rect rect = l3b.c;
                    if (rect != null) {
                        l3b.d = l3b.b.a(size, layoutDirection, rect);
                    }
                }
                l3b.d = null;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        st1 st1 = this.z0;
        if (st1 != null) {
            getSensorToViewTransform();
            st1.getClass();
            gt0.i();
        }
    }

    public Bitmap getBitmap() {
        Bitmap g;
        gt0.i();
        io9 io9 = this.b;
        if (io9 == null || (g = io9.g()) == null) {
            return null;
        }
        FrameLayout frameLayout = (FrameLayout) io9.c;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        f3b f3b = (f3b) io9.d;
        if (!f3b.f()) {
            return g;
        }
        Matrix d = f3b.d();
        RectF e = f3b.e(size, layoutDirection);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), g.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(d);
        matrix.postScale(e.width() / ((float) f3b.a.getWidth()), e.height() / ((float) f3b.a.getHeight()));
        matrix.postTranslate(e.left, e.top);
        canvas.drawBitmap(g, matrix, new Paint(7));
        return createBitmap;
    }

    public st1 getController() {
        gt0.i();
        return this.z0;
    }

    public h3b getImplementationMode() {
        gt0.i();
        return this.a;
    }

    public q39 getMeteringPointFactory() {
        gt0.i();
        return this.A0;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [lha, java.lang.Object] */
    public lha getOutputTransform() {
        Matrix matrix;
        f3b f3b = this.o;
        gt0.i();
        try {
            matrix = f3b.c(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrix = null;
        }
        Rect rect = f3b.b;
        if (matrix == null || rect == null) {
            return null;
        }
        RectF rectF = hqe.a;
        RectF rectF2 = new RectF(rect);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(hqe.a, rectF2, Matrix.ScaleToFit.FILL);
        matrix.preConcat(matrix2);
        if (this.b instanceof jhe) {
            matrix.postConcat(getMatrix());
        } else {
            getMatrix().isIdentity();
        }
        new Size(rect.width(), rect.height());
        return new Object();
    }

    public yh7 getPreviewStreamState() {
        return this.x0;
    }

    public i3b getScaleType() {
        gt0.i();
        return this.o.h;
    }

    public aq6 getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        gt0.i();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        f3b f3b = this.o;
        if (!f3b.f()) {
            return null;
        }
        Matrix matrix = new Matrix(f3b.d);
        matrix.postConcat(f3b.c(size, layoutDirection));
        return matrix;
    }

    public a3b getSurfaceProvider() {
        gt0.i();
        return this.G0;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, ybf] */
    public ybf getViewPort() {
        gt0.i();
        if (getDisplay() == null) {
            return null;
        }
        int rotation = getDisplay().getRotation();
        gt0.i();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Rational rational = new Rational(getWidth(), getHeight());
        int viewPortScaleType = getViewPortScaleType();
        int layoutDirection = getLayoutDirection();
        ? obj = new Object();
        obj.a = viewPortScaleType;
        obj.b = rational;
        obj.c = rotation;
        obj.d = layoutDirection;
        return obj;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.E0, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.F0);
        io9 io9 = this.b;
        if (io9 != null) {
            io9.j();
        }
        a(true);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.F0);
        io9 io9 = this.b;
        if (io9 != null) {
            io9.k();
        }
        st1 st1 = this.z0;
        if (st1 != null) {
            st1.b();
        }
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this.E0);
        }
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [x87, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v10, types: [x87, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v14, types: [x87, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a9, code lost:
        if (r9 != false) goto L_0x01d8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            st1 r2 = r0.z0
            if (r2 != 0) goto L_0x000d
            boolean r0 = super.onTouchEvent(r19)
            return r0
        L_0x000d:
            int r2 = r19.getPointerCount()
            r3 = 1
            r4 = 0
            if (r2 != r3) goto L_0x0017
            r2 = r3
            goto L_0x0018
        L_0x0017:
            r2 = r4
        L_0x0018:
            int r5 = r19.getAction()
            if (r5 != r3) goto L_0x0020
            r5 = r3
            goto L_0x0021
        L_0x0020:
            r5 = r4
        L_0x0021:
            long r6 = r19.getEventTime()
            long r8 = r19.getDownTime()
            long r6 = r6 - r8
            int r8 = android.view.ViewConfiguration.getLongPressTimeout()
            long r8 = (long) r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x0035
            r6 = r3
            goto L_0x0036
        L_0x0035:
            r6 = r4
        L_0x0036:
            if (r2 == 0) goto L_0x0042
            if (r5 == 0) goto L_0x0042
            if (r6 == 0) goto L_0x0042
            r0.D0 = r1
            r18.performClick()
            return r3
        L_0x0042:
            xvf r0 = r0.B0
            r0.getClass()
            r19.getEventTime()
            r0.getClass()
            int r2 = r19.getActionMasked()
            boolean r5 = r0.c
            if (r5 == 0) goto L_0x005a
            android.view.GestureDetector r5 = r0.l
            r5.onTouchEvent(r1)
        L_0x005a:
            int r5 = r19.getPointerCount()
            int r6 = r19.getButtonState()
            r6 = r6 & 32
            if (r6 == 0) goto L_0x0068
            r6 = r3
            goto L_0x0069
        L_0x0068:
            r6 = r4
        L_0x0069:
            int r7 = r0.k
            r8 = 2
            if (r7 != r8) goto L_0x0072
            if (r6 != 0) goto L_0x0072
            r7 = r3
            goto L_0x0073
        L_0x0072:
            r7 = r4
        L_0x0073:
            if (r2 == r3) goto L_0x007d
            r9 = 3
            if (r2 == r9) goto L_0x007d
            if (r7 == 0) goto L_0x007b
            goto L_0x007d
        L_0x007b:
            r9 = r4
            goto L_0x007e
        L_0x007d:
            r9 = r3
        L_0x007e:
            ss8 r10 = r0.b
            r11 = 0
            if (r2 == 0) goto L_0x0085
            if (r9 == 0) goto L_0x00ad
        L_0x0085:
            boolean r12 = r0.g
            if (r12 == 0) goto L_0x009b
            vvf r12 = new vvf
            r0.a()
            r12.<init>()
            r10.b(r12)
            r0.g = r4
            r0.h = r11
            r0.k = r4
            goto L_0x00a9
        L_0x009b:
            boolean r12 = r0.b()
            if (r12 == 0) goto L_0x00a9
            if (r9 == 0) goto L_0x00a9
            r0.g = r4
            r0.h = r11
            r0.k = r4
        L_0x00a9:
            if (r9 == 0) goto L_0x00ad
            goto L_0x01d8
        L_0x00ad:
            boolean r12 = r0.g
            if (r12 != 0) goto L_0x00cf
            boolean r12 = r0.d
            if (r12 == 0) goto L_0x00cf
            boolean r12 = r0.b()
            if (r12 != 0) goto L_0x00cf
            if (r9 != 0) goto L_0x00cf
            if (r6 == 0) goto L_0x00cf
            float r6 = r19.getX()
            r0.i = r6
            float r6 = r19.getY()
            r0.j = r6
            r0.k = r8
            r0.h = r11
        L_0x00cf:
            r6 = 6
            if (r2 == 0) goto L_0x00dc
            if (r2 == r6) goto L_0x00dc
            r9 = 5
            if (r2 == r9) goto L_0x00dc
            if (r7 == 0) goto L_0x00da
            goto L_0x00dc
        L_0x00da:
            r7 = r4
            goto L_0x00dd
        L_0x00dc:
            r7 = r3
        L_0x00dd:
            if (r2 != r6) goto L_0x00e1
            r6 = r3
            goto L_0x00e2
        L_0x00e1:
            r6 = r4
        L_0x00e2:
            if (r6 == 0) goto L_0x00e9
            int r9 = r19.getActionIndex()
            goto L_0x00ea
        L_0x00e9:
            r9 = -1
        L_0x00ea:
            if (r6 == 0) goto L_0x00ef
            int r6 = r5 + -1
            goto L_0x00f0
        L_0x00ef:
            r6 = r5
        L_0x00f0:
            boolean r12 = r0.b()
            if (r12 == 0) goto L_0x0108
            float r12 = r0.i
            float r13 = r0.j
            float r14 = r19.getY()
            int r14 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r14 >= 0) goto L_0x0104
            r14 = r3
            goto L_0x0105
        L_0x0104:
            r14 = r4
        L_0x0105:
            r0.m = r14
            goto L_0x0125
        L_0x0108:
            r12 = r4
            r13 = r11
            r14 = r13
        L_0x010b:
            if (r12 >= r5) goto L_0x011c
            if (r9 == r12) goto L_0x0119
            float r15 = r1.getX(r12)
            float r13 = r13 + r15
            float r15 = r1.getY(r12)
            float r14 = r14 + r15
        L_0x0119:
            int r12 = r12 + 1
            goto L_0x010b
        L_0x011c:
            float r12 = (float) r6
            float r13 = r13 / r12
            float r12 = r14 / r12
            r17 = r13
            r13 = r12
            r12 = r17
        L_0x0125:
            r15 = r4
            r14 = r11
        L_0x0127:
            if (r15 >= r5) goto L_0x0147
            if (r9 == r15) goto L_0x0144
            float r16 = r1.getX(r15)
            float r16 = r16 - r12
            float r16 = java.lang.Math.abs(r16)
            float r16 = r16 + r11
            float r11 = r1.getY(r15)
            float r11 = r11 - r13
            float r11 = java.lang.Math.abs(r11)
            float r11 = r11 + r14
            r14 = r11
            r11 = r16
        L_0x0144:
            int r15 = r15 + 1
            goto L_0x0127
        L_0x0147:
            float r1 = (float) r6
            float r11 = r11 / r1
            float r14 = r14 / r1
            float r1 = (float) r8
            float r11 = r11 * r1
            float r14 = r14 * r1
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x0154
            goto L_0x015b
        L_0x0154:
            double r5 = (double) r11
            double r14 = (double) r14
            double r5 = java.lang.Math.hypot(r5, r14)
            float r14 = (float) r5
        L_0x015b:
            boolean r1 = r0.g
            defpackage.a24.X(r12)
            r0.getClass()
            defpackage.a24.X(r13)
            r0.getClass()
            boolean r5 = r0.b()
            if (r5 != 0) goto L_0x0189
            boolean r5 = r0.g
            if (r5 == 0) goto L_0x0189
            float r5 = (float) r4
            int r5 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x017a
            if (r7 == 0) goto L_0x0189
        L_0x017a:
            vvf r5 = new vvf
            r0.a()
            r5.<init>()
            r10.b(r5)
            r0.g = r4
            r0.h = r14
        L_0x0189:
            if (r7 == 0) goto L_0x0191
            r0.e = r14
            r0.f = r14
            r0.h = r14
        L_0x0191:
            boolean r5 = r0.b()
            int r6 = r0.a
            if (r5 == 0) goto L_0x019a
            r4 = r6
        L_0x019a:
            boolean r5 = r0.g
            if (r5 != 0) goto L_0x01c0
            float r4 = (float) r4
            int r4 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x01c0
            if (r1 != 0) goto L_0x01b2
            float r1 = r0.h
            float r1 = r14 - r1
            float r1 = java.lang.Math.abs(r1)
            float r4 = (float) r6
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x01c0
        L_0x01b2:
            r0.e = r14
            r0.f = r14
            vvf r1 = new vvf
            r1.<init>()
            r10.b(r1)
            r0.g = r3
        L_0x01c0:
            if (r2 != r8) goto L_0x01d8
            r0.e = r14
            boolean r1 = r0.g
            if (r1 == 0) goto L_0x01d4
            wvf r1 = new wvf
            float r2 = r0.a()
            r1.<init>(r2)
            r10.b(r1)
        L_0x01d4:
            float r1 = r0.e
            r0.f = r1
        L_0x01d8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k3b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean performClick() {
        if (this.z0 != null) {
            MotionEvent motionEvent = this.D0;
            float x = motionEvent != null ? motionEvent.getX() : ((float) getWidth()) / 2.0f;
            MotionEvent motionEvent2 = this.D0;
            float y = motionEvent2 != null ? motionEvent2.getY() : ((float) getHeight()) / 2.0f;
            st1 st1 = this.z0;
            if (st1.h() && st1.t) {
                st1.w.i(1);
                l3b l3b = this.A0;
                p39 a2 = l3b.a(x, y, 0.16666667f);
                p39 a3 = l3b.a(x, y, 0.25f);
                ws4 ws4 = new ws4(a2);
                ws4.b(a3, 2);
                ct0.a(((ot1) st1.m.c.F0.d).h(new ws4(ws4)), new x3a(7, (Object) st1), pa2.j());
            }
        }
        this.D0 = null;
        return super.performClick();
    }

    public void setController(st1 st1) {
        gt0.i();
        st1 st12 = this.z0;
        if (!(st12 == null || st12 == st1)) {
            st12.b();
            setScreenFlashUiInfo((aq6) null);
        }
        this.z0 = st1;
        a(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(h3b h3b) {
        gt0.i();
        this.a = h3b;
    }

    public void setScaleType(i3b i3b) {
        gt0.i();
        this.o.h = i3b;
        b();
        a(false);
    }

    public void setScreenFlashOverlayColor(int i) {
        this.c.setBackgroundColor(i);
    }

    public void setScreenFlashWindow(Window window) {
        gt0.i();
        this.c.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }
}
