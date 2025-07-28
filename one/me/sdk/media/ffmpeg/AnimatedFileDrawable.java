package one.me.sdk.media.ffmpeg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import one.me.rlottie.ImageReceiver;
import one.me.rlottie.RLottieDrawable;

public class AnimatedFileDrawable extends BitmapDrawable implements Animatable, pn0, jg9 {
    public static final float[] M1 = new float[8];
    public static final ScheduledThreadPoolExecutor N1 = new ScheduledThreadPoolExecutor(8, new ThreadPoolExecutor.DiscardPolicy());
    public static final Rect rectTmp = new Rect();
    public int A0;
    public final af A1;
    public boolean B0;
    public final af B1;
    public boolean C0;
    public int C1;
    public boolean D0;
    public final af D1;
    public boolean E0;
    public final ze E1;
    public boolean F0;
    public ze F1;
    public File G0;
    public long G1;
    public final String H0;
    public Bitmap H1;
    public boolean I0;
    public long I1;
    public volatile long J0 = -1;
    public int J1;
    public volatile long K0 = -1;
    public int K1;
    public boolean L0;
    public final Set L1;
    public final Object M0 = new Object();
    public boolean N0;
    public long O0;
    public final RectF P0 = new RectF();
    public final BitmapShader[] Q0 = new BitmapShader[3];
    public final BitmapShader[] R0 = new BitmapShader[3];
    public final BitmapShader[] S0 = new BitmapShader[3];
    public final BitmapShader[] T0 = new BitmapShader[3];
    public final ArrayList U0 = new ArrayList();
    public final int[] V0 = new int[4];
    public int[] W0;
    public Runnable X;
    public final Path[] X0 = new Path[3];
    public Bitmap Y;
    public float Y0 = 1.0f;
    public int Z;
    public float Z0 = 1.0f;
    public long a;
    public boolean a1;
    public int b;
    public final RectF b1 = new RectF();
    public int c = 50;
    public volatile boolean c1;
    public volatile boolean d1;
    public boolean e1;
    public gi4 f1;
    public float g1;
    public float h1;
    public final int i1;
    public boolean ignoreNoParent;
    public boolean isWebmSticker;
    public final int j1;
    public final boolean k1;
    public final on0 l1;
    public float m1 = 1.0f;
    public final RectF[] n1 = new RectF[2];
    public volatile long nativePtr;
    public final int[] o = new int[6];
    public final Paint[] o1 = new Paint[2];
    public View p1;
    public final ArrayList q1 = new ArrayList();
    public final ArrayList r1 = new ArrayList();
    public int repeatCount;
    public boolean s1;
    public boolean skipFrameUpdate;
    public boolean t1;
    public boolean u1;
    public rn0 v1;
    public Bitmap w0;
    public ii5 w1;
    public int x0;
    public final af x1;
    public int y0;
    public boolean y1;
    public Bitmap z0;
    public bf z1;

    public interface OnNextFrameRenderedListener {
        void onNextFrameRendered(AnimatedFileDrawable animatedFileDrawable);
    }

    public AnimatedFileDrawable(File file, int i, int i2, on0 on0, String str) {
        boolean z = true;
        this.t1 = true;
        this.x1 = new af(this, 0);
        this.A1 = new af(this, 1);
        this.B1 = new af(this, 2);
        this.C1 = 0;
        this.D1 = new af(this, 3);
        this.E1 = new ze(this, 1);
        this.L1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        setIsWebmSticker(true);
        this.i1 = i2;
        this.j1 = i;
        this.k1 = (on0 == null || i <= 0 || i2 <= 0) ? false : z;
        this.l1 = on0;
        this.H0 = str;
        if (file != null) {
            d(file, on0);
        }
    }

    public static void a(AnimatedFileDrawable animatedFileDrawable) {
        if (animatedFileDrawable.D1 == null && animatedFileDrawable.B0 && animatedFileDrawable.nativePtr != 0 && !animatedFileDrawable.y1) {
            destroyDecoder(animatedFileDrawable.nativePtr);
            animatedFileDrawable.nativePtr = 0;
        }
        if (!animatedFileDrawable.canLoadFrames()) {
            Bitmap bitmap = animatedFileDrawable.Y;
            if (bitmap != null) {
                bitmap.recycle();
                animatedFileDrawable.Y = null;
            }
            Bitmap bitmap2 = animatedFileDrawable.z0;
            if (bitmap2 != null) {
                bitmap2.recycle();
                animatedFileDrawable.z0 = null;
            }
            gi4 gi4 = animatedFileDrawable.f1;
            if (gi4 != null) {
                gi4.a.getLooper().quit();
                animatedFileDrawable.f1 = null;
            }
            for (int i = 0; i < animatedFileDrawable.U0.size(); i++) {
                ((Bitmap) animatedFileDrawable.U0.get(i)).recycle();
            }
            animatedFileDrawable.U0.clear();
            animatedFileDrawable.invalidateInternal();
        }
    }

    public static native long createDecoder(String str, int[] iArr);

    public static native void destroyDecoder(long j);

    public static native int getFrameAtTime(long j, long j2, Bitmap bitmap, int[] iArr, int i);

    public static native int getVideoFrame(long j, Bitmap bitmap, int[] iArr, int i, boolean z, float f, float f2, boolean z2);

    public static native void prepareToSeek(long j);

    public static native void seekToMs(long j, long j2, int[] iArr, boolean z);

    public static native void stopDecoder(long j);

    public void addOnNextFrameRenderedListener(OnNextFrameRenderedListener onNextFrameRenderedListener) {
        this.L1.add(onNextFrameRenderedListener);
    }

    public void addParent(ImageReceiver imageReceiver) {
        if (imageReceiver != null && !this.r1.contains(imageReceiver)) {
            this.r1.add(imageReceiver);
            if (this.c1) {
                e();
            }
        }
        checkCacheCancel();
    }

    public void addSecondParentView(View view) {
        if (view != null) {
            ArrayList arrayList = this.q1;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
            }
        }
    }

    public final void b(RectF rectF, Paint paint, Canvas canvas, float f, float f2) {
        canvas.translate(rectF.left, rectF.top);
        int i = this.o[2];
        if (i == 90) {
            canvas.rotate(90.0f);
            canvas.translate(0.0f, -rectF.width());
        } else if (i == 180) {
            canvas.rotate(180.0f);
            canvas.translate(-rectF.width(), -rectF.height());
        } else if (i == 270) {
            canvas.rotate(270.0f);
            canvas.translate(-rectF.height(), 0.0f);
        }
        canvas.scale(f, f2);
        canvas.drawBitmap(this.Y, 0.0f, 0.0f, paint);
    }

    public final void c() {
        Set set = this.L1;
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((OnNextFrameRenderedListener) it.next()).onNextFrameRendered(this);
                it.remove();
            }
        }
    }

    public boolean canLoadFrames() {
        return this.k1 ? this.v1 != null : this.nativePtr != 0 || !this.C0;
    }

    public void checkCacheCancel() {
        ze zeVar;
        if (this.v1 != null) {
            boolean isEmpty = this.r1.isEmpty();
            if (isEmpty && this.F1 == null) {
                ze zeVar2 = new ze(this, 2);
                this.F1 = zeVar2;
                je.e(zeVar2, 600);
            } else if (!isEmpty && (zeVar = this.F1) != null) {
                je.a.removeCallbacks(zeVar);
                this.F1 = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        r1.printStackTrace();
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x004f A[SYNTHETIC, Splitter:B:35:0x004f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void checkCacheExist() {
        /*
            r7 = this;
            boolean r0 = r7.k1
            if (r0 == 0) goto L_0x005f
            rn0 r7 = r7.v1
            if (r7 == 0) goto L_0x005f
            boolean r0 = r7.r
            if (r0 == 0) goto L_0x000d
            goto L_0x005f
        L_0x000d:
            r0 = 1
            r1 = 0
            java.lang.Object r2 = r7.h     // Catch:{ Exception -> 0x0058, all -> 0x004c }
            monitor-enter(r2)     // Catch:{ Exception -> 0x0058, all -> 0x004c }
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0041 }
            java.io.File r4 = r7.m     // Catch:{ all -> 0x0041 }
            java.lang.String r5 = "r"
            r3.<init>(r4, r5)     // Catch:{ all -> 0x0041 }
            boolean r1 = r3.readBoolean()     // Catch:{ all -> 0x0035 }
            r7.s = r1     // Catch:{ all -> 0x0035 }
            int r1 = r3.readInt()     // Catch:{ all -> 0x0035 }
            long r4 = (long) r1     // Catch:{ all -> 0x0035 }
            r3.seek(r4)     // Catch:{ all -> 0x0035 }
            int r1 = r3.readInt()     // Catch:{ all -> 0x0035 }
            if (r1 > 0) goto L_0x0037
            r1 = 0
            r7.s = r1     // Catch:{ all -> 0x0035 }
            r7.q = r0     // Catch:{ all -> 0x0035 }
            goto L_0x0037
        L_0x0035:
            r1 = move-exception
            goto L_0x0045
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            r3.close()     // Catch:{ IOException -> 0x003c }
            goto L_0x005d
        L_0x003c:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x005d
        L_0x0041:
            r3 = move-exception
            r6 = r3
            r3 = r1
            r1 = r6
        L_0x0045:
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            throw r1     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
        L_0x0047:
            r7 = move-exception
            r1 = r3
            goto L_0x004d
        L_0x004a:
            r1 = r3
            goto L_0x0058
        L_0x004c:
            r7 = move-exception
        L_0x004d:
            if (r1 == 0) goto L_0x0057
            r1.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0057
        L_0x0053:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0057:
            throw r7
        L_0x0058:
            if (r1 == 0) goto L_0x005d
            r1.close()     // Catch:{ IOException -> 0x003c }
        L_0x005d:
            r7.r = r0
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.media.ffmpeg.AnimatedFileDrawable.checkCacheExist():void");
    }

    public final void d(File file, on0 on0) {
        this.G0 = file;
        getPaint().setFlags(3);
        if (!this.k1) {
            this.nativePtr = createDecoder(file.getAbsolutePath(), this.o);
            this.e1 = this.nativePtr == 0 && (!this.isWebmSticker || this.C1 > 15);
            if (this.nativePtr != 0) {
                int[] iArr = this.o;
                if (iArr[0] > 3840 || iArr[1] > 3840) {
                    destroyDecoder(this.nativePtr);
                    this.nativePtr = 0;
                }
            }
            g();
            this.C0 = true;
        }
        if (this.k1) {
            this.nativePtr = createDecoder(file.getAbsolutePath(), this.o);
            this.e1 = this.nativePtr == 0 && (!this.isWebmSticker || this.C1 > 15);
            if (this.nativePtr != 0) {
                int[] iArr2 = this.o;
                if (iArr2[0] > 3840 || iArr2[1] > 3840) {
                    destroyDecoder(this.nativePtr);
                    this.nativePtr = 0;
                    return;
                }
            }
            this.v1 = new rn0(file, this, on0, this.j1, this.i1, !this.u1);
        }
    }

    public boolean decoderFailed() {
        return this.C0 && this.e1;
    }

    public void draw(Canvas canvas) {
        drawInternal(canvas, false, System.currentTimeMillis(), 0);
    }

    public void drawFrame(Canvas canvas, int i) {
        if (this.nativePtr != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                getNextFrame(true);
            }
            Bitmap backgroundBitmap = getBackgroundBitmap();
            if (backgroundBitmap == null) {
                backgroundBitmap = getNextFrame(true);
            }
            Rect rect = rectTmp;
            rect.set(0, 0, backgroundBitmap.getWidth(), backgroundBitmap.getHeight());
            canvas.drawBitmap(getBackgroundBitmap(), rect, getBounds(), getPaint());
        }
    }

    public void drawInBackground(Canvas canvas, float f, float f2, float f3, float f4, int i, ColorFilter colorFilter, int i2) {
        RectF[] rectFArr = this.n1;
        RectF rectF = rectFArr[i2];
        Paint[] paintArr = this.o1;
        if (rectF == null) {
            rectFArr[i2] = new RectF();
            paintArr[i2] = new Paint();
            paintArr[i2].setFilterBitmap(true);
        }
        paintArr[i2].setAlpha(i);
        paintArr[i2].setColorFilter(colorFilter);
        rectFArr[i2].set(f, f2, f3 + f, f4 + f2);
        drawInternal(canvas, true, 0, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drawInternal(android.graphics.Canvas r11, boolean r12, long r13, int r15) {
        /*
            r10 = this;
            boolean r0 = r10.canLoadFrames()
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r10.B0
            if (r0 == 0) goto L_0x000c
            goto L_0x00fa
        L_0x000c:
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0016
            long r13 = java.lang.System.currentTimeMillis()
        L_0x0016:
            if (r12 == 0) goto L_0x001e
            android.graphics.RectF[] r0 = r10.n1
            r0 = r0[r15]
        L_0x001c:
            r2 = r0
            goto L_0x0021
        L_0x001e:
            android.graphics.RectF r0 = r10.b1
            goto L_0x001c
        L_0x0021:
            if (r12 == 0) goto L_0x0029
            android.graphics.Paint[] r0 = r10.o1
            r0 = r0[r15]
        L_0x0027:
            r3 = r0
            goto L_0x002e
        L_0x0029:
            android.graphics.Paint r0 = r10.getPaint()
            goto L_0x0027
        L_0x002e:
            r0 = 0
            if (r12 != 0) goto L_0x0034
            r10.updateCurrentFrame(r13, r0)
        L_0x0034:
            android.graphics.Bitmap r13 = r10.Y
            if (r13 == 0) goto L_0x00fa
            float r14 = r10.Y0
            float r1 = r10.Z0
            r4 = 270(0x10e, float:3.78E-43)
            r5 = 90
            int[] r6 = r10.o
            r7 = 2
            if (r12 == 0) goto L_0x0067
            int r13 = r13.getWidth()
            android.graphics.Bitmap r14 = r10.Y
            int r14 = r14.getHeight()
            r1 = r6[r7]
            if (r1 == r5) goto L_0x0055
            if (r1 != r4) goto L_0x0058
        L_0x0055:
            r9 = r14
            r14 = r13
            r13 = r9
        L_0x0058:
            float r1 = r2.width()
            float r13 = (float) r13
            float r1 = r1 / r13
            float r13 = r2.height()
            float r14 = (float) r14
            float r13 = r13 / r14
        L_0x0064:
            r6 = r13
            r5 = r1
            goto L_0x009a
        L_0x0067:
            boolean r8 = r10.a1
            if (r8 == 0) goto L_0x0098
            int r13 = r13.getWidth()
            android.graphics.Bitmap r14 = r10.Y
            int r14 = r14.getHeight()
            r1 = r6[r7]
            if (r1 == r5) goto L_0x007b
            if (r1 != r4) goto L_0x007e
        L_0x007b:
            r9 = r14
            r14 = r13
            r13 = r9
        L_0x007e:
            android.graphics.Rect r1 = r10.getBounds()
            r2.set(r1)
            float r1 = r2.width()
            float r13 = (float) r13
            float r1 = r1 / r13
            r10.Y0 = r1
            float r13 = r2.height()
            float r14 = (float) r14
            float r13 = r13 / r14
            r10.Z0 = r13
            r10.a1 = r0
            goto L_0x0064
        L_0x0098:
            r5 = r14
            r6 = r1
        L_0x009a:
            r13 = r0
        L_0x009b:
            int[] r14 = r10.V0
            int r1 = r14.length
            if (r13 >= r1) goto L_0x00f5
            r1 = r14[r13]
            if (r1 == 0) goto L_0x00f2
            if (r12 == 0) goto L_0x00a9
            int r15 = r15 + 1
            goto L_0x00aa
        L_0x00a9:
            r15 = r0
        L_0x00aa:
            android.graphics.Path[] r13 = r10.X0
            r1 = r13[r15]
            if (r1 != 0) goto L_0x00b7
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r13[r15] = r1
        L_0x00b7:
            boolean r13 = r10.t1
            if (r13 != 0) goto L_0x00bd
            if (r12 == 0) goto L_0x00e3
        L_0x00bd:
            if (r12 != 0) goto L_0x00c1
            r10.t1 = r0
        L_0x00c1:
            int r13 = r14.length
            float[] r15 = M1
            if (r0 >= r13) goto L_0x00d5
            int r13 = r0 * 2
            r4 = r14[r0]
            float r7 = (float) r4
            r15[r13] = r7
            int r13 = r13 + 1
            float r4 = (float) r4
            r15[r13] = r4
            int r0 = r0 + 1
            goto L_0x00c1
        L_0x00d5:
            r1.rewind()
            if (r12 == 0) goto L_0x00dc
            r12 = r2
            goto L_0x00de
        L_0x00dc:
            android.graphics.RectF r12 = r10.P0
        L_0x00de:
            android.graphics.Path$Direction r13 = android.graphics.Path.Direction.CW
            r1.addRoundRect(r12, r15, r13)
        L_0x00e3:
            r11.save()
            r11.clipPath(r1)
            r1 = r10
            r4 = r11
            r1.b(r2, r3, r4, r5, r6)
            r11.restore()
            goto L_0x00fa
        L_0x00f2:
            int r13 = r13 + 1
            goto L_0x009b
        L_0x00f5:
            r1 = r10
            r4 = r11
            r1.b(r2, r3, r4, r5, r6)
        L_0x00fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.media.ffmpeg.AnimatedFileDrawable.drawInternal(android.graphics.Canvas, boolean, long, int):void");
    }

    public final void e() {
        f(true, false);
    }

    public final void f(boolean z, boolean z2) {
        Runnable runnable;
        Runnable runnable2;
        if ((this.X == null || z2) && this.w0 == null && canLoadFrames() && !this.B0) {
            if (!this.c1) {
                boolean z3 = this.D0;
                if (!z3) {
                    return;
                }
                if (z3 && this.E0) {
                    return;
                }
            }
            if ((this.r1.size() != 0 || this.ignoreNoParent) && !this.y1) {
                long j = 0;
                if (z && this.O0 != 0) {
                    long j2 = (long) this.c;
                    j = Math.min(j2, Math.max(0, j2 - (System.currentTimeMillis() - this.O0)));
                }
                if (!this.s1) {
                    if (this.f1 == null) {
                        this.f1 = new gi4("decodeQueue" + this);
                    }
                    if (z2 && (runnable = this.X) != null) {
                        this.f1.a(runnable);
                    }
                    gi4 gi4 = this.f1;
                    af afVar = this.D1;
                    this.X = afVar;
                    gi4.c(afVar, j);
                } else if (this.u1) {
                    af afVar2 = this.D1;
                    this.X = afVar2;
                    ki4.a(afVar2, false);
                } else {
                    if (z2 && (runnable2 = this.X) != null) {
                        N1.remove(runnable2);
                    }
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = N1;
                    af afVar3 = this.D1;
                    this.X = afVar3;
                    scheduledThreadPoolExecutor.schedule(afVar3, j, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    public final void finalize() {
        try {
            this.q1.clear();
            recycle();
        } finally {
            super.finalize();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r4 = r6.o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r6 = this;
            boolean r0 = r6.isWebmSticker
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x0038
            int r0 = r6.i1
            if (r0 <= 0) goto L_0x0038
            int r2 = r6.j1
            if (r2 <= 0) goto L_0x0038
            r3 = 0
            int[] r4 = r6.o
            r3 = r4[r3]
            if (r3 <= 0) goto L_0x0038
            r5 = 1
            r4 = r4[r5]
            if (r4 <= 0) goto L_0x0038
            float r2 = (float) r2
            float r3 = (float) r3
            float r2 = r2 / r3
            float r0 = (float) r0
            float r3 = (float) r4
            float r0 = r0 / r3
            float r0 = java.lang.Math.max(r2, r0)
            r6.m1 = r0
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0035
            double r2 = (double) r0
            r4 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x003a
        L_0x0035:
            r6.m1 = r1
            goto L_0x003a
        L_0x0038:
            r6.m1 = r1
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.media.ffmpeg.AnimatedFileDrawable.g():void");
    }

    public Bitmap getAnimatedBitmap() {
        Bitmap bitmap = this.Y;
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap bitmap2 = this.w0;
        if (bitmap2 != null) {
            return bitmap2;
        }
        return null;
    }

    public Bitmap getBackgroundBitmap() {
        return this.z0;
    }

    public float getCurrentProgress() {
        float f;
        int i;
        if (this.o[4] == 0) {
            return 0.0f;
        }
        if (this.K0 >= 0) {
            f = (float) this.K0;
            i = this.o[4];
        } else {
            int[] iArr = this.o;
            f = (float) iArr[3];
            i = iArr[4];
        }
        return f / ((float) i);
    }

    public int getCurrentProgressMs() {
        if (this.K0 >= 0) {
            return (int) this.K0;
        }
        int i = this.x0;
        return i != 0 ? i : this.Z;
    }

    public int getDurationMs() {
        return this.o[4];
    }

    public File getFilePath() {
        return this.G0;
    }

    public Bitmap getFirstFrame(Bitmap bitmap) {
        int i = this.j1;
        Bitmap createBitmap = bitmap == null ? Bitmap.createBitmap(i, this.i1, Bitmap.Config.ARGB_8888) : bitmap;
        Canvas canvas = new Canvas(createBitmap);
        String absolutePath = this.G0.getAbsolutePath();
        int[] iArr = this.o;
        long createDecoder = createDecoder(absolutePath, iArr);
        if (createDecoder == 0) {
            return createBitmap;
        }
        if (this.H1 == null) {
            this.H1 = Bitmap.createBitmap(Math.max(1, iArr[0]), Math.max(1, iArr[1]), Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap2 = this.H1;
        getVideoFrame(createDecoder, bitmap2, this.o, bitmap2.getRowBytes(), false, this.g1, this.h1, true);
        destroyDecoder(createDecoder);
        createBitmap.eraseColor(0);
        canvas.save();
        float width = ((float) i) / ((float) this.H1.getWidth());
        canvas.scale(width, width);
        canvas.drawBitmap(this.H1, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        return createBitmap;
    }

    public int getFps() {
        return this.o[5];
    }

    public Bitmap getFrameAtTime(long j) {
        return getFrameAtTime(j, false);
    }

    public int getIntrinsicHeight() {
        int i = 0;
        if (this.C0) {
            int[] iArr = this.o;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[0] : iArr[1];
        }
        return i == 0 ? je.a(100.0f) : (int) (((float) i) * this.m1);
    }

    public int getIntrinsicWidth() {
        int i = 0;
        if (this.C0) {
            int[] iArr = this.o;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[1] : iArr[0];
        }
        return i == 0 ? je.a(100.0f) : (int) (((float) i) * this.m1);
    }

    public long getLastFrameTimestamp() {
        return (long) this.b;
    }

    public int getMinimumHeight() {
        int i = 0;
        if (this.C0) {
            int[] iArr = this.o;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[0] : iArr[1];
        }
        return i == 0 ? je.a(100.0f) : i;
    }

    public int getMinimumWidth() {
        int i = 0;
        if (this.C0) {
            int[] iArr = this.o;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[1] : iArr[0];
        }
        return i == 0 ? je.a(100.0f) : i;
    }

    public Bitmap getNextFrame(boolean z) {
        if (this.nativePtr == 0) {
            return this.z0;
        }
        if (this.z0 == null) {
            if (!this.U0.isEmpty()) {
                this.z0 = (Bitmap) this.U0.remove(0);
            } else {
                int[] iArr = this.o;
                float f = this.m1;
                this.z0 = Bitmap.createBitmap((int) (((float) iArr[0]) * f), (int) (((float) iArr[1]) * f), Bitmap.Config.ARGB_8888);
            }
        }
        long j = this.nativePtr;
        Bitmap bitmap = this.z0;
        getVideoFrame(j, bitmap, this.o, bitmap.getRowBytes(), false, this.g1, this.h1, z);
        return this.z0;
    }

    public Bitmap getNextRenderingBitmap() {
        return this.w0;
    }

    public int getOpacity() {
        return -2;
    }

    public int getOrientation() {
        return this.o[2];
    }

    public int getProgressMs() {
        return this.o[3];
    }

    public Bitmap getRenderingBitmap() {
        return this.Y;
    }

    public int getRenderingHeight() {
        return this.i1;
    }

    public int getRenderingWidth() {
        return this.j1;
    }

    public long getStartTime() {
        return (long) (this.g1 * 1000.0f);
    }

    public boolean hasBitmap() {
        return canLoadFrames() && !(this.Y == null && this.w0 == null);
    }

    public void invalidateInternal() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.r1;
            if (i < arrayList.size()) {
                ((ImageReceiver) arrayList.get(i)).invalidate();
                i++;
            } else {
                return;
            }
        }
    }

    public boolean isRecycled() {
        return this.d1 || this.C1 >= 15;
    }

    public boolean isRunning() {
        return this.c1;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.a1 = true;
    }

    public void onFailed(Throwable th) {
        gg9 logger = WebmConfig.getLogger();
        logger.j("Fail load webm by url: " + this.H0, th);
    }

    public void onFinished(String str, File file, String str2) {
        gg9 logger = WebmConfig.getLogger();
        logger.e("Success load webm by url: " + str);
        d(file, this.l1);
        je.d(new ze(this, 0));
    }

    public void prepareForGenerateCache() {
        this.I1 = createDecoder(this.G0.getAbsolutePath(), this.o);
    }

    public void recycle() {
        if (!this.q1.isEmpty()) {
            this.I0 = true;
            return;
        }
        this.c1 = false;
        this.d1 = true;
        if (this.z1 != null) {
            rn0.c();
            RLottieDrawable.lottieCacheGenerateQueue.a(this.z1);
            this.z1 = null;
        }
        if (this.X == null) {
            if (this.nativePtr != 0) {
                destroyDecoder(this.nativePtr);
                this.nativePtr = 0;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.Y);
            arrayList.add(this.w0);
            arrayList.add(this.z0);
            arrayList.addAll(this.U0);
            this.U0.clear();
            this.Y = null;
            this.w0 = null;
            this.z0 = null;
            gi4 gi4 = this.f1;
            if (gi4 != null) {
                gi4.a.getLooper().quit();
                this.f1 = null;
            }
            getPaint().setShader((Shader) null);
            je.c(arrayList);
        } else {
            this.B0 = true;
        }
        invalidateInternal();
    }

    public void releaseForGenerateCache() {
        long j = this.I1;
        if (j != 0) {
            destroyDecoder(j);
        }
    }

    public void removeOnNextFrameRenderedListener(OnNextFrameRenderedListener onNextFrameRenderedListener) {
        this.L1.remove(onNextFrameRenderedListener);
    }

    public void removeParent(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.r1;
        arrayList.remove(imageReceiver);
        if (arrayList.isEmpty()) {
            this.repeatCount = 0;
        }
        checkCacheCancel();
    }

    public void removeSecondParentView(View view) {
        ArrayList arrayList = this.q1;
        arrayList.remove(view);
        if (!arrayList.isEmpty()) {
            return;
        }
        if (this.I0) {
            recycle();
            return;
        }
        int[] iArr = this.W0;
        if (iArr != null) {
            setRoundRadius(iArr);
        }
    }

    public void replaceAnimatedBitmap(Bitmap bitmap) {
        Bitmap bitmap2 = this.Y;
        ArrayList arrayList = this.U0;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        Bitmap bitmap3 = this.w0;
        if (bitmap3 != null) {
            arrayList.add(bitmap3);
        }
        this.Y = bitmap;
        this.w0 = null;
    }

    public void resetStream(boolean z) {
        if (this.nativePtr == 0) {
            return;
        }
        if (z) {
            stopDecoder(this.nativePtr);
        } else {
            prepareToSeek(this.nativePtr);
        }
    }

    public void seekTo(long j, boolean z) {
        seekTo(j, z, false);
    }

    public void seekToSync(long j) {
        if (this.nativePtr != 0) {
            seekToMs(this.nativePtr, j, this.o, true);
        }
    }

    public void setActualDrawRect(float f, float f2, float f3, float f4) {
        float f5 = f4 + f2;
        float f6 = f3 + f;
        RectF rectF = this.P0;
        if (rectF.left != f || rectF.top != f2 || rectF.right != f6 || rectF.bottom != f5) {
            rectF.set(f, f2, f6, f5);
            this.t1 = true;
        }
    }

    public void setAllowDecodeSingleFrame(boolean z) {
        this.D0 = z;
        if (z) {
            e();
        }
    }

    public void setInvalidateParentViewWithSecond(boolean z) {
        this.N0 = z;
    }

    public void setIsWebmSticker(boolean z) {
        this.isWebmSticker = z;
        if (z) {
            this.s1 = true;
        }
    }

    public void setLimitFps(boolean z) {
        this.u1 = z;
    }

    public void setParentView(View view) {
        if (this.p1 == null) {
            this.p1 = view;
        }
    }

    public void setRoundRadius(int[] iArr) {
        boolean isEmpty = this.q1.isEmpty();
        int[] iArr2 = this.V0;
        if (!isEmpty) {
            if (this.W0 == null) {
                this.W0 = new int[4];
            }
            int[] iArr3 = this.W0;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        }
        for (int i = 0; i < 4; i++) {
            if (!this.t1 && iArr[i] != iArr2[i]) {
                this.t1 = true;
            }
            iArr2[i] = iArr[i];
        }
    }

    public void setStartEndTime(long j, long j2) {
        this.g1 = ((float) j) / 1000.0f;
        this.h1 = ((float) j2) / 1000.0f;
        if (j >= 0 && ((long) getCurrentProgressMs()) < j) {
            seekTo(j, true);
        }
    }

    public void setUseSharedQueue(boolean z) {
        if (!this.isWebmSticker) {
            this.s1 = z;
        }
    }

    public void skipNextFrame(boolean z) {
        if (this.nativePtr != 0) {
            getVideoFrame(this.nativePtr, (Bitmap) null, this.o, 0, false, this.g1, this.h1, z);
        }
    }

    public void start() {
        if (this.c1) {
            return;
        }
        if (!this.r1.isEmpty() || this.ignoreNoParent) {
            this.c1 = true;
            e();
            je.d(this.E1);
        }
    }

    public void stop() {
        this.c1 = false;
    }

    public void updateCurrentFrame(long j, boolean z) {
        if (this.c1) {
            Bitmap bitmap = this.Y;
            if (bitmap == null && this.w0 == null) {
                e();
            } else if (this.w0 == null || (bitmap != null && (Math.abs(j - this.a) < ((long) this.c) || this.skipFrameUpdate || this.K0 >= 0))) {
                invalidateInternal();
            } else {
                this.U0.add(this.Y);
                this.Y = this.w0;
                this.Z = this.x0;
                for (int i = 0; i < this.T0.length; i++) {
                    BitmapShader[] bitmapShaderArr = this.Q0;
                    BitmapShader[] bitmapShaderArr2 = this.R0;
                    bitmapShaderArr[i] = bitmapShaderArr2[i];
                    BitmapShader[] bitmapShaderArr3 = this.S0;
                    bitmapShaderArr2[i] = bitmapShaderArr3[i];
                    bitmapShaderArr3[i] = null;
                }
                this.x0 = this.y0;
                this.w0 = null;
                this.y0 = 0;
                this.a = j;
                c();
                e();
            }
        } else if (!this.c1 && this.D0 && Math.abs(j - this.a) >= ((long) this.c) && this.w0 != null) {
            this.U0.add(this.Y);
            this.Y = this.w0;
            this.Z = this.x0;
            for (int i2 = 0; i2 < this.T0.length; i2++) {
                BitmapShader[] bitmapShaderArr4 = this.Q0;
                BitmapShader[] bitmapShaderArr5 = this.R0;
                bitmapShaderArr4[i2] = bitmapShaderArr5[i2];
                BitmapShader[] bitmapShaderArr6 = this.S0;
                bitmapShaderArr5[i2] = bitmapShaderArr6[i2];
                bitmapShaderArr6[i2] = null;
            }
            this.x0 = this.y0;
            this.w0 = null;
            this.y0 = 0;
            this.a = j;
            c();
            e();
        }
    }

    public Bitmap getFrameAtTime(long j, boolean z) {
        int i;
        if (!this.C0 || this.nativePtr == 0) {
            return null;
        }
        if (!z) {
            seekToMs(this.nativePtr, j, this.o, z);
        }
        int[] iArr = this.o;
        Bitmap createBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        if (z) {
            i = getFrameAtTime(this.nativePtr, j, createBitmap, this.o, createBitmap.getRowBytes());
        } else {
            i = getVideoFrame(this.nativePtr, createBitmap, this.o, createBitmap.getRowBytes(), true, 0.0f, 0.0f, true);
        }
        if (i != 0) {
            return createBitmap;
        }
        return null;
    }

    public void seekTo(long j, boolean z, boolean z2) {
        synchronized (this.M0) {
            try {
                this.J0 = j;
                this.K0 = j;
                if (this.nativePtr != 0) {
                    prepareToSeek(this.nativePtr);
                }
                if (z2 && this.D0) {
                    this.E0 = false;
                    if (this.X == null) {
                        f(false, true);
                    } else {
                        this.F0 = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getNextFrame(Bitmap bitmap) {
        int i;
        Bitmap bitmap2 = bitmap;
        if (this.I1 == 0) {
            return -1;
        }
        Canvas canvas = new Canvas(bitmap2);
        Bitmap bitmap3 = this.H1;
        int[] iArr = this.o;
        if (bitmap3 == null) {
            this.H1 = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        }
        long j = this.I1;
        Bitmap bitmap4 = this.H1;
        getVideoFrame(j, bitmap4, this.o, bitmap4.getRowBytes(), false, this.g1, this.h1, true);
        long j2 = this.G1;
        if (j2 != 0 && ((i = iArr[3]) == 0 || j2 > ((long) i))) {
            return 0;
        }
        int i2 = this.K1;
        int i3 = iArr[3];
        if (i2 == i3) {
            int i4 = this.J1 + 1;
            this.J1 = i4;
            if (i4 > 5) {
                return 0;
            }
        }
        this.K1 = i3;
        bitmap2.eraseColor(0);
        canvas.save();
        float width = ((float) this.j1) / ((float) this.H1.getWidth());
        canvas.scale(width, width);
        canvas.drawBitmap(this.H1, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        this.G1 = (long) iArr[3];
        return 1;
    }
}
