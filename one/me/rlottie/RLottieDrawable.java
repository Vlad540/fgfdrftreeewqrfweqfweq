package one.me.rlottie;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArraySet;
import android.view.View;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;

public class RLottieDrawable extends BitmapDrawable implements Animatable, pn0, jg9 {
    public static final Handler L1 = new Handler(Looper.getMainLooper());
    public static final ThreadLocal M1 = new ThreadLocal();
    public static final ThreadLocal N1 = new ThreadLocal();
    public static final ji4 O1 = new ji4();
    public static final Rect P1 = new Rect();
    public static Gson gson;
    public static gi4 lottieCacheGenerateQueue;
    public boolean A0;
    public final rwb A1;
    public boolean B0;
    public long B1;
    public WeakReference C0;
    public int C1;
    public View D0;
    public Bitmap D1;
    public final ArraySet E0;
    public String E1;
    public int F0;
    public volatile boolean F1;
    public int G0;
    public volatile Throwable G1;
    public int H0;
    public String H1;
    public long I0;
    public final Set I1;
    public volatile boolean J0;
    public final Set J1;
    public Runnable K0;
    public final Set K1;
    public Runnable L0;
    public volatile Bitmap M0;
    public volatile Bitmap N0;
    public volatile Bitmap O0;
    public boolean P0;
    public CountDownLatch Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public int W0;
    public int X;
    public boolean X0;
    public boolean Y;
    public float Y0;
    public int[] Z;
    public float Z0;
    public final int a;
    public boolean a1;
    public final int b;
    public boolean b1;
    public final int[] c;
    public final RectF c1;
    public final RectF[] d1;
    public final Paint[] e1;
    public volatile boolean f1;
    public volatile boolean g1;
    public volatile long h1;
    public boolean i1;
    public boolean j1;
    public boolean k1;
    public File l1;
    public boolean m1;
    public Runnable n1;
    public int o;
    public Runnable o1;
    public View p1;
    public di9 q1;
    public final rwb r1;
    public final rwb s1;
    public boolean scaleByCanvas;
    public boolean skipFrameUpdate;
    public Rect srcRect;
    public boolean t1;
    public final rwb u1;
    public final rwb v1;
    public int[] w0;
    public rn0 w1;
    public Runnable whenCacheDone;
    public final HashMap x0;
    public int x1;
    public volatile HashMap y0;
    public boolean y1;
    public HashMap z0;
    public boolean z1;

    public interface DrawableLoadListener {
        void onError(Throwable th) {
        }

        void onLoaded(RLottieDrawable rLottieDrawable) {
        }
    }

    public interface OnAllFramesRenderedListener {
        void onAllFramesRendered(RLottieDrawable rLottieDrawable, boolean z);
    }

    public interface OnNextFrameRenderedListener {
        void onNextFrameRendered(RLottieDrawable rLottieDrawable, int i);
    }

    public RLottieDrawable(File file, int i, int i2, on0 on0, boolean z) {
        this(file, i, i2, on0, z, (int[]) null, 0);
    }

    public static /* synthetic */ void a(long j, long j2) {
        if (j != 0) {
            destroy(j);
        }
        if (j2 != 0) {
            destroy(j2);
        }
    }

    public static /* synthetic */ void b(long j, long j2) {
        if (j != 0) {
            destroy(j);
        }
        if (j2 != 0) {
            destroy(j2);
        }
    }

    public static void c(RLottieDrawable rLottieDrawable) {
        Runnable runnable = rLottieDrawable.n1;
        if (runnable != null) {
            runnable.run();
            rLottieDrawable.n1 = null;
        }
    }

    /* access modifiers changed from: private */
    public static native long create(String str, String str2, int i, int i2, int[] iArr, boolean z, int[] iArr2, boolean z2, int i3);

    public static void createCacheGenQueue() {
        lottieCacheGenerateQueue = new gi4("rlottie-generator-queue");
    }

    private static native long createWithJson(String str, String str2, int[] iArr, int[] iArr2);

    /* access modifiers changed from: private */
    public static native void destroy(long j);

    public static native int foo();

    public static native double getDuration(String str, String str2);

    public static native int getFrame(long j, int i, Bitmap bitmap, int i2, int i3, int i4, boolean z);

    public static native long getFramesCount(String str, String str2);

    /* access modifiers changed from: private */
    public static native void replaceColors(long j, int[] iArr);

    /* access modifiers changed from: private */
    public static native void setLayerColor(long j, String str, int i);

    public void addDrawableLoadListener(DrawableLoadListener drawableLoadListener) {
        this.I1.add(drawableLoadListener);
        if (this.F1) {
            drawableLoadListener.onLoaded(this);
        } else if (this.G1 != null) {
            drawableLoadListener.onError(this.G1);
        }
    }

    public void addOnAllFramesRenderedListener(OnAllFramesRenderedListener onAllFramesRenderedListener) {
        this.K1.add(onAllFramesRenderedListener);
    }

    public void addOnNextFrameRenderedListener(OnNextFrameRenderedListener onNextFrameRenderedListener) {
        this.J1.add(onNextFrameRenderedListener);
    }

    public void addParentView(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.E0.add(imageReceiver);
        }
    }

    public void beginApplyLayerColors() {
        this.V0 = true;
    }

    public void cacheFrame(int i) {
        if (this.C1 != i || this.D1 == null) {
            if (this.D1 == null) {
                this.D1 = Bitmap.createBitmap(this.a, this.b, Bitmap.Config.ARGB_8888);
            }
            long j = this.h1;
            this.C1 = i;
            Bitmap bitmap = this.D1;
            getFrame(j, i, bitmap, this.a, this.b, bitmap.getRowBytes(), true);
        }
    }

    public boolean canLoadFrames() {
        return this.m1 ? this.w1 != null : this.h1 != 0;
    }

    public void checkCache(Runnable runnable) {
        if (this.w1 == null) {
            je.d(runnable);
            return;
        }
        this.t1 = true;
        if (lottieCacheGenerateQueue == null) {
            createCacheGenQueue();
        }
        if (this.K0 == null) {
            rn0.B++;
            gi4 gi4 = lottieCacheGenerateQueue;
            qwb qwb = new qwb(this, runnable, 0);
            this.K0 = qwb;
            gi4.b(qwb);
        }
    }

    public void checkCacheCancel() {
        if (this.w1 != null && lottieCacheGenerateQueue != null && this.K0 != null && this.E0.isEmpty() && getCallback() == null) {
            View view = this.p1;
            if (view == null || !view.isAttachedToWindow()) {
                Runnable runnable = this.K0;
                if (runnable != null) {
                    lottieCacheGenerateQueue.a(runnable);
                    rn0.c();
                    this.K0 = null;
                }
                this.t1 = false;
                this.y1 = false;
            }
        }
    }

    public void commitApplyLayerColors() {
        if (this.V0) {
            this.V0 = false;
            if (!this.f1 && this.S0) {
                if (this.W0 <= 2) {
                    this.W0 = 0;
                }
                this.J0 = false;
                this.T0 = false;
                if (!o()) {
                    this.U0 = true;
                }
            }
            invalidateInternal();
        }
    }

    public void draw(Canvas canvas) {
        drawInternal(canvas, getPaint(), false, 0, 0);
    }

    public void drawFrame(Canvas canvas, int i) {
        cacheFrame(i);
        if (this.D1 != null) {
            int i2 = this.a;
            int i3 = this.b;
            Rect rect = P1;
            rect.set(0, 0, i2, i3);
            canvas.drawBitmap(this.D1, rect, getBounds(), getPaint());
        }
    }

    public void drawInBackground(Canvas canvas, float f, float f2, float f3, float f4, int i, ColorFilter colorFilter, int i2) {
        RectF[] rectFArr = this.d1;
        RectF rectF = rectFArr[i2];
        Paint[] paintArr = this.e1;
        if (rectF == null) {
            rectFArr[i2] = new RectF();
            paintArr[i2] = new Paint(1);
            paintArr[i2].setFilterBitmap(true);
        }
        paintArr[i2].setAlpha(i);
        paintArr[i2].setColorFilter(colorFilter);
        rectFArr[i2].set(f, f2, f3 + f, f4 + f2);
        drawInternal(canvas, (Paint) null, true, 0, i2);
    }

    public void drawInternal(Canvas canvas, Paint paint, boolean z, long j, int i) {
        float f;
        float f2;
        if (canLoadFrames() && !this.R0) {
            boolean z2 = true;
            if (!z) {
                z = !Looper.getMainLooper().isCurrentThread();
            }
            if (!z) {
                updateCurrentFrame(j, false);
            }
            RectF rectF = z ? this.d1[i] : this.c1;
            if (rectF == null) {
                rectF = this.c1;
            }
            if (paint == null) {
                paint = z ? this.e1[i] : getPaint();
            }
            if (paint.getAlpha() != 0) {
                if (!hasBitmap()) {
                    RLottie.getLogger().e("!hasBitmap() " + this.E1);
                }
                if (this.M0 == null) {
                    RLottie.getLogger().e("rendering bitmap is null");
                }
                if (!this.j1 && this.M0 != null) {
                    if (!z) {
                        rectF.set(getBounds());
                        if (this.a1) {
                            this.Y0 = rectF.width() / ((float) this.a);
                            this.Z0 = rectF.height() / ((float) this.b);
                            this.a1 = false;
                            if (Math.abs(rectF.width() - ((float) this.a)) < ((float) je.a(1.0f)) && Math.abs(rectF.height() - ((float) this.b)) < ((float) je.a(1.0f))) {
                                z2 = false;
                            }
                            this.b1 = z2;
                        }
                        f2 = this.Y0;
                        f = this.Z0;
                        z2 = this.b1;
                    } else {
                        float width = rectF.width() / ((float) this.a);
                        float height = rectF.height() / ((float) this.b);
                        if (Math.abs(rectF.width() - ((float) this.a)) < ((float) je.a(1.0f)) && Math.abs(rectF.height() - ((float) this.b)) < ((float) je.a(1.0f))) {
                            z2 = false;
                        }
                        f2 = width;
                        f = height;
                    }
                    if (!z2) {
                        try {
                            canvas.drawBitmap(this.M0, rectF.left, rectF.top, paint);
                        } catch (Exception e) {
                            RLottie.getLogger().o(e);
                        }
                    } else if (this.scaleByCanvas) {
                        this.srcRect.set(0, 0, this.M0.getWidth(), this.M0.getHeight());
                        canvas.drawBitmap(this.M0, this.srcRect, rectF, paint);
                    } else {
                        canvas.save();
                        canvas.translate(rectF.left, rectF.top);
                        canvas.scale(f2, f);
                        canvas.drawBitmap(this.M0, 0.0f, 0.0f, paint);
                        canvas.restore();
                    }
                    if (this.f1 && !z) {
                        invalidateInternal();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        r4 = (one.me.rlottie.RLottieDrawable) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            if (r3 != r4) goto L_0x0004
            r3 = 1
            return r3
        L_0x0004:
            boolean r0 = r4 instanceof one.me.rlottie.RLottieDrawable
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            one.me.rlottie.RLottieDrawable r4 = (one.me.rlottie.RLottieDrawable) r4
            int r0 = r4.a
            int r2 = r3.a
            if (r2 == r0) goto L_0x0013
            return r1
        L_0x0013:
            int r0 = r3.b
            int r2 = r4.b
            if (r0 == r2) goto L_0x001a
            return r1
        L_0x001a:
            int r0 = r3.F0
            int r2 = r4.F0
            if (r0 == r2) goto L_0x0021
            return r1
        L_0x0021:
            java.lang.String r3 = r3.H1
            java.lang.String r4 = r4.H1
            boolean r3 = java.util.Objects.equals(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.rlottie.RLottieDrawable.equals(java.lang.Object):boolean");
    }

    public final void finalize() {
        try {
            recycle(false);
        } finally {
            super.finalize();
        }
    }

    public Bitmap getAnimatedBitmap() {
        if (this.M0 != null) {
            return this.M0;
        }
        if (this.N0 != null) {
            return this.N0;
        }
        return null;
    }

    public Bitmap getBackgroundBitmap() {
        return this.O0;
    }

    public int getCurrentFrame() {
        return this.W0;
    }

    public String getCurrentUrl() {
        return this.E1;
    }

    public int getCustomEndFrame() {
        return this.X;
    }

    public long getDuration() {
        int[] iArr = this.c;
        return (long) ((((float) iArr[0]) / ((float) iArr[1])) * 1000.0f);
    }

    public Bitmap getFirstFrame(Bitmap bitmap) {
        String file = ((File) this.q1.c).toString();
        di9 di9 = this.q1;
        di9.getClass();
        int i = di9.a;
        int i2 = this.b;
        long create = create(file, (String) null, this.a, i2, new int[3], false, (int[]) di9.b, false, i);
        if (create == 0) {
            return bitmap;
        }
        long j = create;
        Bitmap bitmap2 = bitmap;
        getFrame(j, 0, bitmap2, this.a, this.b, bitmap.getRowBytes(), true);
        destroy(create);
        return bitmap;
    }

    public int getFramesCount() {
        return this.c[0];
    }

    public float getGeneratingCacheProgress() {
        rn0 rn0 = this.w1;
        if (rn0 == null) {
            return 1.0f;
        }
        if (this.K0 != null) {
            float framesCount = ((float) rn0.d.get()) / ((float) getFramesCount());
            if (Float.isNaN(framesCount)) {
                return 0.0f;
            }
            if (Float.isInfinite(framesCount)) {
                return 1.0f;
            }
            return Math.max(Math.min(framesCount, 1.0f), 0.0f);
        } else if (rn0.q) {
            return this.w1.g() ? 0.0f : 1.0f;
        } else {
            return -2.0f;
        }
    }

    public int getIntrinsicHeight() {
        return this.b;
    }

    public int getIntrinsicWidth() {
        return this.a;
    }

    public long getLastFrameTime() {
        return this.I0;
    }

    public int getMinimumHeight() {
        return this.b;
    }

    public int getMinimumWidth() {
        return this.a;
    }

    public int getNextFrame(Bitmap bitmap) {
        long j = this.B1;
        if (j == 0) {
            return -1;
        }
        int i = this.X0 ? 2 : 1;
        if (getFrame(j, this.x1, bitmap, this.a, this.b, bitmap.getRowBytes(), true) == -5) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return getNextFrame(bitmap);
        }
        int i2 = this.x1 + i;
        this.x1 = i2;
        return i2 > this.c[0] ? 0 : 1;
    }

    public Bitmap getNextRenderingBitmap() {
        return this.N0;
    }

    public int getOpacity() {
        return -2;
    }

    public Bitmap getRenderingBitmap() {
        return this.M0;
    }

    public float getScaleX() {
        return this.Y0;
    }

    public float getScaleY() {
        return this.Z0;
    }

    public int getTimeBetweenFrames() {
        return this.o;
    }

    public final void h() {
        Runnable runnable = this.K0;
        if (runnable != null) {
            lottieCacheGenerateQueue.a(runnable);
            rn0.c();
            this.K0 = null;
        }
        if (!hasParent() && this.N0 != null && this.L0 != null) {
            this.L0 = null;
            this.N0 = null;
        }
    }

    public boolean hasBaseDice() {
        return this.h1 != 0;
    }

    public boolean hasBitmap() {
        return !this.g1 && !(this.M0 == null && this.N0 == null) && !this.j1;
    }

    public boolean hasParent() {
        return (this.E0.isEmpty() && this.p1 == null && getCallback() == null) ? false : true;
    }

    public boolean hasParentViews() {
        return !this.E0.isEmpty();
    }

    public boolean hasVibrationPattern() {
        return this.z0 != null;
    }

    public int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        String str = this.H1;
        return Integer.hashCode(this.F0) + ((i + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final void i() {
        if (this.R0) {
            h();
            if (this.L0 == null && this.K0 == null && this.h1 != 0) {
                l(true);
            }
        }
        if (this.h1 == 0 && this.w1 == null) {
            m();
            return;
        }
        this.P0 = true;
        if (!hasParent()) {
            gg9 logger = RLottie.getLogger();
            logger.e("RLottieDrawable. Call stop because !hasParentView() " + this.E1);
            stop();
        }
        if (this.f1) {
            o();
        }
    }

    public void invalidateInternal() {
        if (!this.g1) {
            Iterator it = this.E0.iterator();
            while (it.hasNext()) {
                ((ImageReceiver) it.next()).invalidate();
            }
            View view = this.p1;
            if (view != null) {
                view.invalidate();
            }
            if (getCallback() != null) {
                invalidateSelf();
            }
        }
    }

    public boolean isApplyTransformation() {
        return this.a1;
    }

    public boolean isCacheFallbacked() {
        return false;
    }

    public boolean isForceFrameRedraw() {
        return this.U0;
    }

    public boolean isGeneratingCache() {
        return this.K0 != null;
    }

    public boolean isHeavyDrawable() {
        return true;
    }

    public boolean isLastFrame() {
        return this.W0 == getFramesCount() - 1;
    }

    public boolean isLoadingFailed() {
        return !this.F1 && this.G1 != null;
    }

    public boolean isNeedScale() {
        return this.b1;
    }

    public boolean isRecycled() {
        return this.g1;
    }

    public boolean isRunning() {
        return this.f1;
    }

    public boolean isWaitingForNextTask() {
        return this.P0;
    }

    public final void j() {
        this.F1 = true;
        this.G1 = null;
        if (je.b()) {
            Iterator it = new ArrayList(this.I1).iterator();
            while (it.hasNext()) {
                ((DrawableLoadListener) it.next()).onLoaded(this);
            }
            return;
        }
        je.d(new pwb(this, 1));
    }

    public final void k(File file, int[] iArr) {
        if (gson == null) {
            gson = new Gson();
        }
        Class<swb> cls = swb.class;
        if (file != null) {
            try {
                FileReader fileReader = new FileReader(file.getAbsolutePath());
                hr1.r(gson.fromJson(fileReader, cls));
                try {
                    fileReader.close();
                } catch (Exception unused) {
                }
            } catch (Exception e) {
                RLottie.getLogger().o(e);
                String absolutePath = file.getAbsolutePath();
                di9 di9 = this.q1;
                boolean z = this.X0;
                int i = di9.a;
                int i2 = this.b;
                long create = create(absolutePath, (String) null, this.a, i2, iArr, false, (int[]) di9.b, z, i);
                if (create != 0) {
                    destroy(create);
                    return;
                }
                return;
            }
        } else {
            hr1.r(gson.fromJson((String) null, cls));
        }
        throw null;
    }

    public final void l(boolean z) {
        long j = this.h1;
        this.h1 = 0;
        if (j != 0) {
            if (z) {
                ki4.a(new owb(j, 0, 0), false);
                return;
            }
            wwc wwc = ez3.e.f;
            ((ScheduledExecutorService) ((r7e) wwc.b).getValue()).execute(new owb(j, 0, 1));
        }
    }

    public final void m() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.M0);
        arrayList.add(this.O0);
        arrayList.add(this.N0);
        this.N0 = null;
        this.M0 = null;
        this.O0 = null;
        je.c(arrayList);
        if (this.n1 != null) {
            this.n1 = null;
        }
    }

    public void multiplySpeed(float f) {
        this.o *= (int) (1.0f / f);
    }

    public final void n() {
        if (!this.V0 && !this.f1 && this.S0) {
            if (this.W0 <= 2) {
                this.W0 = 0;
            }
            this.J0 = false;
            this.T0 = false;
            if (!o()) {
                this.U0 = true;
            }
        }
        invalidateInternal();
    }

    public final boolean o() {
        boolean z;
        boolean z2 = false;
        if (this.L0 != null || this.N0 != null || !canLoadFrames() || this.R0 || (!this.f1 && (!(z = this.S0) || (z && this.T0)))) {
            return false;
        }
        if (this.t1 && !this.z1) {
            return false;
        }
        if (!this.x0.isEmpty()) {
            this.y0.putAll(this.x0);
            this.x0.clear();
        }
        int[] iArr = this.Z;
        if (iArr != null) {
            this.w0 = iArr;
            this.Z = null;
        }
        this.L0 = this.A1;
        if (!this.X0 || !je.b()) {
            O1.b(this.L0);
        } else {
            Runnable runnable = this.L0;
            if (this.Q0 != null) {
                z2 = true;
            }
            ki4.a(runnable, z2);
        }
        return true;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.a1 = true;
    }

    public void onFailed(Throwable th) {
        RLottie.getLogger().o(th);
        this.F1 = false;
        this.G1 = th;
        je.d(new hg9(this, 25, th));
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [on0, java.lang.Object] */
    public void onFinished(String str, File file, String str2) {
        getPaint().setFlags(2);
        this.H1 = file.getAbsolutePath();
        this.l1 = file;
        if (this.m1 && lottieCacheGenerateQueue == null) {
            createCacheGenQueue();
        }
        if (this.m1) {
            this.w1 = new rn0(file, this, new Object(), this.a, this.b, !this.X0);
            di9 di9 = new di9(this);
            this.q1 = di9;
            di9.c = file.getAbsoluteFile();
            this.q1.getClass();
            this.h1 = create(file.getAbsolutePath(), (String) null, this.a, this.b, this.c, this.m1, (int[]) null, this.X0, 0);
            destroy(this.h1);
            this.h1 = 0;
        } else {
            this.h1 = create(file.getAbsolutePath(), (String) null, this.a, this.b, this.c, this.m1, (int[]) null, this.X0, 0);
            if (this.h1 == 0) {
                file.delete();
            }
        }
        if (this.X0 && this.c[1] < 60) {
            this.X0 = false;
        }
        this.o = Math.max(this.X0 ? 33 : 16, (int) (1000.0f / ((float) this.c[1])));
        j();
        je.d(new pwb(this, 0));
    }

    public final void p(long j, long j2, boolean z, long j3) {
        int i;
        this.O0 = this.M0;
        this.M0 = this.N0;
        this.N0 = null;
        if (this.J0 || (this.G0 == 0 && this.F0 == 1)) {
            stop();
        }
        this.L0 = null;
        if (this.k1) {
            this.k1 = false;
        } else if (this.j1) {
            this.j1 = false;
        }
        this.T0 = true;
        this.P0 = false;
        if (RLottie.config.screenRefreshRate <= 60.0f) {
            this.I0 = j;
        } else {
            this.I0 = j - Math.min(16, j2 - j3);
        }
        if (z && this.U0) {
            this.T0 = false;
            this.U0 = false;
        }
        Set set = this.J1;
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((OnNextFrameRenderedListener) it.next()).onNextFrameRendered(this, this.W0);
                it.remove();
            }
        }
        if (isLastFrame() && ((i = this.F0) == 2 || i == 1 || i == 3 || this.J0)) {
            for (OnAllFramesRenderedListener onAllFramesRenderedListener : this.K1) {
                int i2 = this.F0;
                onAllFramesRenderedListener.onAllFramesRendered(this, i2 == 2 || i2 == 1 || i2 == 3);
            }
        }
        o();
    }

    public void post(Runnable runnable) {
        if (!this.X0 || !je.b()) {
            O1.b(new k30(runnable, 5));
        } else {
            ki4.a(new k30(runnable, 4), this.Q0 != null);
        }
    }

    public void prepareForGenerateCache() {
        File file;
        String file2 = ((File) this.q1.c).toString();
        di9 di9 = this.q1;
        di9.getClass();
        int i = di9.a;
        int i2 = this.b;
        long create = create(file2, (String) null, this.a, i2, new int[3], false, (int[]) di9.b, false, i);
        this.B1 = create;
        if (create == 0 && (file = this.l1) != null) {
            file.delete();
        }
    }

    public void recycle(boolean z) {
        this.f1 = false;
        this.g1 = true;
        h();
        if (this.L0 == null && this.K0 == null && !this.t1) {
            l(z);
            rn0 rn0 = this.w1;
            if (rn0 != null) {
                RandomAccessFile randomAccessFile = rn0.u;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    rn0.u = null;
                }
                rn0.t = true;
                this.w1 = null;
            }
            m();
            return;
        }
        this.R0 = true;
    }

    public void releaseForGenerateCache() {
        long j = this.B1;
        if (j != 0) {
            destroy(j);
            this.B1 = 0;
        }
    }

    public void removeDrawableLoadListener(DrawableLoadListener drawableLoadListener) {
        this.I1.remove(drawableLoadListener);
    }

    public void removeOnAllFramesRenderedListener(OnAllFramesRenderedListener onAllFramesRenderedListener) {
        this.K1.remove(onAllFramesRenderedListener);
    }

    public void removeOnNextFrameRenderedListener(OnNextFrameRenderedListener onNextFrameRenderedListener) {
        this.J1.remove(onNextFrameRenderedListener);
    }

    public void removeParentView(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.E0.remove(imageReceiver);
            checkCacheCancel();
        }
    }

    public void replaceColors(int[] iArr) {
        this.Z = iArr;
        n();
    }

    public void resetVibrationAfterRestart(boolean z) {
        this.A0 = z;
    }

    public boolean restart() {
        return restart(false);
    }

    public void setAllowDecodeSingleFrame(boolean z) {
        this.S0 = z;
        if (z) {
            o();
        }
    }

    public void setAllowDrawFramesWhileCacheGenerating(boolean z) {
        this.z1 = z;
    }

    public void setAllowVibration(boolean z) {
        this.B0 = z;
    }

    public void setAutoRepeat(int i) {
        if (this.F0 != 2 || i != 3 || this.W0 == 0) {
            this.F0 = i;
        }
    }

    public void setAutoRepeatCount(int i) {
        this.G0 = i;
    }

    public void setAutoRepeatTimeout(long j) {
    }

    public void setCurrentFrame(int i) {
        setCurrentFrame(i, true);
    }

    public void setCurrentParentView(View view) {
        this.D0 = view;
    }

    public boolean setCustomEndFrame(int i) {
        if (this.X == i || i > this.c[0]) {
            return false;
        }
        this.X = i;
        return true;
    }

    public void setGeneratingFrame(int i) {
        this.x1 = i;
    }

    public void setInvalidateOnProgressSet(boolean z) {
        this.i1 = z;
    }

    public void setLayerColor(String str, int i) {
        this.x0.put(str, Integer.valueOf(i));
        n();
    }

    public void setMasterParent(View view) {
        this.p1 = view;
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        this.n1 = runnable;
    }

    public void setOnFinishCallback(Runnable runnable, int i) {
        if (runnable != null) {
            this.C0 = new WeakReference(runnable);
        } else if (this.C0 != null) {
            this.C0 = null;
        }
    }

    public void setOnFrameReadyRunnable(Runnable runnable) {
        this.o1 = runnable;
    }

    public void setPlayInDirectionOfCustomEndFrame(boolean z) {
        this.Y = z;
    }

    public void setProgress(float f) {
        setProgress(f, true);
    }

    public void setProgressMs(long j) {
        setCurrentFrame((int) ((Math.max(0, j) / ((long) this.o)) % ((long) this.c[0])), true, true);
    }

    public void setVibrationPattern(HashMap<Integer, Integer> hashMap) {
        this.z0 = hashMap;
    }

    public void start() {
        if (RLottie.config.isEnabled && !this.f1) {
            if ((this.F0 < 2 || this.H0 == 0) && this.X != this.W0) {
                this.f1 = true;
                if (this.i1) {
                    this.j1 = true;
                    if (this.L0 != null) {
                        this.k1 = true;
                    }
                }
                o();
                invalidateInternal();
            }
        }
    }

    public void stop() {
        gg9 logger = RLottie.getLogger();
        logger.e("Stop url: " + getCurrentUrl() + " class: " + hashCode());
        this.f1 = false;
    }

    public void updateCurrentFrame(long j, boolean z) {
        int i;
        Integer num;
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        long j2 = j;
        long j3 = j2 - this.I0;
        if (!z || this.X0) {
            float f = RLottie.config.screenRefreshRate;
            i = (f <= 60.0f || (z && f <= 80.0f)) ? this.o - 6 : this.o;
        } else {
            i = this.o - 16;
        }
        if (this.f1) {
            if (this.M0 == null && this.N0 == null) {
                o();
            } else if (this.N0 == null) {
            } else {
                if (this.M0 == null || (j3 >= ((long) i) && !this.skipFrameUpdate)) {
                    HashMap hashMap = this.z0;
                    if (!(hashMap == null || this.D0 == null || !this.B0 || (num = (Integer) hashMap.get(Integer.valueOf(this.W0 - 1))) == null)) {
                        this.D0.performHapticFeedback(num.intValue() == 1 ? 0 : 3, 2);
                    }
                    p(j2, j3, false, (long) i);
                }
            }
        } else if ((this.U0 || (this.S0 && j3 >= ((long) i))) && this.N0 != null) {
            p(j2, j3, true, (long) i);
        }
    }

    public RLottieDrawable(File file, int i, int i2, on0 on0, boolean z, int[] iArr, int i3) {
        int[] iArr2;
        char c2;
        File file2 = file;
        boolean z2 = z;
        int[] iArr3 = new int[3];
        this.c = iArr3;
        this.X = -1;
        this.x0 = new HashMap();
        this.y0 = new HashMap();
        this.A0 = false;
        this.B0 = true;
        this.E0 = new ArraySet();
        this.F0 = 1;
        this.G0 = -1;
        this.Y0 = 1.0f;
        this.Z0 = 1.0f;
        this.c1 = new RectF();
        this.d1 = new RectF[2];
        this.e1 = new Paint[2];
        this.r1 = new rwb(this, 0);
        this.s1 = new rwb(this, 1);
        this.u1 = new rwb(this, 2);
        this.v1 = new rwb(this, 3);
        this.A1 = new rwb(this, 4);
        this.srcRect = new Rect();
        this.C1 = -1;
        this.E1 = null;
        this.F1 = false;
        this.G1 = null;
        this.I1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.J1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.K1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.a = i;
        this.b = i2;
        this.X0 = z2;
        this.H1 = file.getAbsolutePath();
        this.m1 = on0 != null;
        getPaint().setFlags(2);
        this.l1 = file2;
        if (this.m1 && lottieCacheGenerateQueue == null) {
            createCacheGenQueue();
        }
        if (this.m1) {
            di9 di9 = new di9(this);
            this.q1 = di9;
            di9.c = file.getAbsoluteFile();
            di9 di92 = this.q1;
            di92.getClass();
            di92.b = iArr;
            di92.a = i3;
            k(file2, iArr3);
            if (this.X0 && iArr3[1] < 60) {
                this.X0 = false;
            }
            this.w1 = new rn0(file, this, on0, i, i2, !z2);
            c2 = 1;
            iArr2 = iArr3;
        } else {
            int[] iArr4 = iArr;
            int i4 = i3;
            c2 = 1;
            iArr2 = iArr3;
            this.h1 = create(file.getAbsolutePath(), (String) null, i, i2, iArr3, this.m1, iArr, this.X0, i3);
            if (this.h1 == 0) {
                RLottie.getLogger().e("RLottieDrawable nativePtr == 0 " + file.getAbsolutePath() + " remove file");
                file.delete();
            }
            if (this.X0 && iArr2[1] < 60) {
                this.X0 = false;
            }
        }
        this.o = Math.max(this.X0 ? 33 : 16, (int) (1000.0f / ((float) iArr2[c2])));
        j();
    }

    public void draw(Canvas canvas, Paint paint) {
        drawInternal(canvas, paint, false, 0, 0);
    }

    public boolean restart(boolean z) {
        if (!z && ((this.F0 < 2 || this.H0 == 0) && this.G0 < 0)) {
            return false;
        }
        this.H0 = 0;
        this.F0 = 2;
        start();
        return true;
    }

    public void setCurrentFrame(int i, boolean z) {
        setCurrentFrame(i, z, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        if (r3 > 1.0f) goto L_0x0005;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setProgress(float r3, boolean r4) {
        /*
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0007
        L_0x0005:
            r3 = r0
            goto L_0x000e
        L_0x0007:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x000e
            goto L_0x0005
        L_0x000e:
            int[] r0 = r2.c
            r1 = 0
            r0 = r0[r1]
            float r0 = (float) r0
            float r0 = r0 * r3
            int r3 = (int) r0
            r2.setCurrentFrame(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.rlottie.RLottieDrawable.setProgress(float, boolean):void");
    }

    public void setCurrentFrame(int i, boolean z, boolean z2) {
        if (i >= 0 && i <= this.c[0]) {
            if (this.W0 != i || z2) {
                this.W0 = i;
                this.J0 = false;
                this.T0 = false;
                if (this.i1) {
                    this.j1 = true;
                    if (this.L0 != null) {
                        this.k1 = true;
                    }
                }
                if ((!z || z2) && this.P0 && this.N0 != null) {
                    this.O0 = this.N0;
                    this.N0 = null;
                    this.L0 = null;
                    this.P0 = false;
                }
                if (!z && this.L0 == null) {
                    this.Q0 = new CountDownLatch(1);
                }
                if (z2 && !this.f1) {
                    this.f1 = true;
                }
                if (!o()) {
                    this.U0 = true;
                } else if (!z) {
                    try {
                        this.Q0.await();
                    } catch (Exception e) {
                        RLottie.getLogger().o(e);
                    }
                    this.Q0 = null;
                }
                invalidateSelf();
            }
        }
    }

    public RLottieDrawable(int i, String str, int i2, int i3) {
        this(i, str, i2, i3, true, (int[]) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0104 A[SYNTHETIC, Splitter:B:30:0x0104] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x010d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RLottieDrawable(int r10, java.lang.String r11, int r12, int r13, boolean r14, int[] r15) {
        /*
            r9 = this;
            r9.<init>()
            r0 = 3
            int[] r0 = new int[r0]
            r9.c = r0
            r0 = -1
            r9.X = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r9.x0 = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r9.y0 = r1
            r1 = 0
            r9.A0 = r1
            r2 = 1
            r9.B0 = r2
            android.util.ArraySet r3 = new android.util.ArraySet
            r3.<init>()
            r9.E0 = r3
            r9.F0 = r2
            r9.G0 = r0
            r3 = 1065353216(0x3f800000, float:1.0)
            r9.Y0 = r3
            r9.Z0 = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r9.c1 = r3
            r3 = 2
            android.graphics.RectF[] r4 = new android.graphics.RectF[r3]
            r9.d1 = r4
            android.graphics.Paint[] r4 = new android.graphics.Paint[r3]
            r9.e1 = r4
            rwb r4 = new rwb
            r5 = 0
            r4.<init>(r9, r5)
            r9.r1 = r4
            rwb r4 = new rwb
            r5 = 1
            r4.<init>(r9, r5)
            r9.s1 = r4
            rwb r4 = new rwb
            r5 = 2
            r4.<init>(r9, r5)
            r9.u1 = r4
            rwb r4 = new rwb
            r5 = 3
            r4.<init>(r9, r5)
            r9.v1 = r4
            rwb r4 = new rwb
            r5 = 4
            r4.<init>(r9, r5)
            r9.A1 = r4
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r9.srcRect = r4
            r9.C1 = r0
            r0 = 0
            r9.E1 = r0
            r9.F1 = r1
            r9.G1 = r0
            java.util.WeakHashMap r4 = new java.util.WeakHashMap
            r4.<init>()
            java.util.Set r4 = java.util.Collections.newSetFromMap(r4)
            java.util.Set r4 = java.util.Collections.synchronizedSet(r4)
            r9.I1 = r4
            java.util.WeakHashMap r4 = new java.util.WeakHashMap
            r4.<init>()
            java.util.Set r4 = java.util.Collections.newSetFromMap(r4)
            java.util.Set r4 = java.util.Collections.synchronizedSet(r4)
            r9.J1 = r4
            java.util.WeakHashMap r4 = new java.util.WeakHashMap
            r4.<init>()
            java.util.Set r4 = java.util.Collections.newSetFromMap(r4)
            java.util.Set r4 = java.util.Collections.synchronizedSet(r4)
            r9.K1 = r4
            r9.a = r12
            r9.b = r13
            r9.F0 = r1
            java.lang.ThreadLocal r12 = M1
            java.lang.Object r13 = r12.get()
            byte[] r13 = (byte[]) r13
            if (r13 != 0) goto L_0x00bc
            r13 = 65536(0x10000, float:9.18355E-41)
            byte[] r13 = new byte[r13]
            r12.set(r13)
        L_0x00bc:
            eg9 r4 = ez3.e     // Catch:{ all -> 0x0101 }
            if (r4 == 0) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            r4 = r0
        L_0x00c2:
            android.content.res.Resources r4 = r4.h     // Catch:{ all -> 0x0101 }
            java.io.InputStream r10 = r4.openRawResource(r10)     // Catch:{ all -> 0x0101 }
            java.lang.ThreadLocal r4 = N1     // Catch:{ all -> 0x0102 }
            java.lang.Object r5 = r4.get()     // Catch:{ all -> 0x0102 }
            byte[] r5 = (byte[]) r5     // Catch:{ all -> 0x0102 }
            if (r5 != 0) goto L_0x00d9
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x0102 }
            r4.set(r5)     // Catch:{ all -> 0x0102 }
        L_0x00d9:
            r4 = r1
        L_0x00da:
            int r6 = r5.length     // Catch:{ all -> 0x0102 }
            int r6 = r10.read(r5, r1, r6)     // Catch:{ all -> 0x0102 }
            if (r6 < 0) goto L_0x00f8
            int r7 = r13.length     // Catch:{ all -> 0x0102 }
            int r8 = r4 + r6
            if (r7 >= r8) goto L_0x00f1
            int r7 = r13.length     // Catch:{ all -> 0x0102 }
            int r7 = r7 * r3
            byte[] r7 = new byte[r7]     // Catch:{ all -> 0x0102 }
            java.lang.System.arraycopy(r13, r1, r7, r1, r4)     // Catch:{ all -> 0x0102 }
            r12.set(r7)     // Catch:{ all -> 0x0102 }
            r13 = r7
        L_0x00f1:
            if (r6 <= 0) goto L_0x00da
            java.lang.System.arraycopy(r5, r1, r13, r4, r6)     // Catch:{ all -> 0x0102 }
            r4 = r8
            goto L_0x00da
        L_0x00f8:
            r10.close()     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r13, r1, r4)
            goto L_0x0107
        L_0x0101:
            r10 = r0
        L_0x0102:
            if (r10 == 0) goto L_0x0107
            r10.close()     // Catch:{ all -> 0x0107 }
        L_0x0107:
            boolean r10 = android.text.TextUtils.isEmpty(r0)
            if (r10 == 0) goto L_0x010e
            return
        L_0x010e:
            android.graphics.Paint r10 = r9.getPaint()
            r10.setFlags(r3)
            int[] r10 = r9.c
            long r10 = createWithJson(r0, r11, r10, r15)
            r9.h1 = r10
            int[] r10 = r9.c
            r10 = r10[r2]
            float r10 = (float) r10
            r11 = 1148846080(0x447a0000, float:1000.0)
            float r11 = r11 / r10
            int r10 = (int) r11
            r11 = 16
            int r10 = java.lang.Math.max(r11, r10)
            r9.o = r10
            if (r14 == 0) goto L_0x0133
            r9.setAllowDecodeSingleFrame(r2)
        L_0x0133:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.rlottie.RLottieDrawable.<init>(int, java.lang.String, int, int, boolean, int[]):void");
    }

    public RLottieDrawable(String str, String str2, int i, int i2, boolean z, int[] iArr) {
        int[] iArr2 = new int[3];
        this.c = iArr2;
        this.X = -1;
        this.x0 = new HashMap();
        this.y0 = new HashMap();
        this.A0 = false;
        this.B0 = true;
        this.E0 = new ArraySet();
        this.F0 = 1;
        this.G0 = -1;
        this.Y0 = 1.0f;
        this.Z0 = 1.0f;
        this.c1 = new RectF();
        this.d1 = new RectF[2];
        this.e1 = new Paint[2];
        this.r1 = new rwb(this, 0);
        this.s1 = new rwb(this, 1);
        this.u1 = new rwb(this, 2);
        this.v1 = new rwb(this, 3);
        this.A1 = new rwb(this, 4);
        this.srcRect = new Rect();
        this.C1 = -1;
        this.E1 = null;
        this.F1 = false;
        this.G1 = null;
        this.I1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.J1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.K1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.a = i;
        this.b = i2;
        this.H1 = str2;
        if (!TextUtils.isEmpty(str)) {
            getPaint().setFlags(2);
            this.h1 = createWithJson(str, str2, iArr2, iArr);
            this.o = Math.max(16, (int) (1000.0f / ((float) iArr2[1])));
            if (z) {
                setAllowDecodeSingleFrame(true);
            }
            j();
        }
    }
}
