package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: c5e  reason: default package */
public final class c5e extends io9 {
    public SurfaceView e;
    public final b5e f = new b5e(this);

    public c5e(FrameLayout frameLayout, f3b f3b) {
        super(frameLayout, f3b);
    }

    public final View f() {
        return this.e;
    }

    public final Bitmap g() {
        SurfaceView surfaceView = this.e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.e.getHolder().getSurface().isValid()) {
            return null;
        }
        Semaphore semaphore = new Semaphore(0);
        Bitmap createBitmap = Bitmap.createBitmap(this.e.getWidth(), this.e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        PixelCopy.request(this.e, createBitmap, new a5e(semaphore), new Handler(handlerThread.getLooper()));
        try {
            semaphore.tryAcquire(1, 100, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            handlerThread.quitSafely();
            throw th;
        }
        handlerThread.quitSafely();
        return createBitmap;
    }

    public final void j() {
    }

    public final void k() {
    }

    public final void l(y4e y4e, xz xzVar) {
        SurfaceView surfaceView = this.e;
        boolean equals = Objects.equals((Size) this.b, y4e.b);
        if (surfaceView == null || !equals) {
            this.b = y4e.b;
            FrameLayout frameLayout = (FrameLayout) this.c;
            frameLayout.getClass();
            ((Size) this.b).getClass();
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.e = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(((Size) this.b).getWidth(), ((Size) this.b).getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.e);
            this.e.getHolder().addCallback(this.f);
        }
        Executor a = kq3.a(this.e.getContext());
        y4e.k.a(new pzb(22, xzVar), a);
        this.e.post(new ncd(this, y4e, xzVar, 6));
    }

    public final ch7 o() {
        return as6.c;
    }
}
