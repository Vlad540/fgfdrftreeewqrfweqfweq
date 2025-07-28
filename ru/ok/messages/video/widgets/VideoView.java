package ru.ok.messages.video.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;

public class VideoView extends FrameLayout implements TextureView.SurfaceTextureListener {
    public uce a;
    public Surface b;
    public SurfaceTexture c;
    public a9f o;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    public VideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [uce, android.view.TextureView] */
    public final void a(a9f a9f) {
        this.o = a9f;
        this.z0 = a9f.j();
        d();
        if (this.a == null) {
            ? textureView = new TextureView(getContext());
            this.a = textureView;
            textureView.setSurfaceTextureListener(this);
            addView(this.a, 0);
        }
    }

    public final void b() {
        this.o = null;
        this.z0 = 0;
        this.w0 = 0;
        this.x0 = 0;
        this.y0 = 0;
        uce uce = this.a;
        if (uce != null) {
            uce.setListener((tce) null);
            this.a.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            removeView(this.a);
            this.a = null;
        }
        Surface surface = this.b;
        if (surface != null) {
            surface.release();
            this.b = null;
        }
        SurfaceTexture surfaceTexture = this.c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.c = null;
        }
    }

    public final void c(int i, int i2, int i3, boolean z) {
        if (!z) {
            this.w0 = i;
            this.x0 = i2;
            this.y0 = i3;
            requestLayout();
        } else if (i > 0 && i2 > 0 && getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && this.z0 != 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            ms msVar = new ms(measuredWidth, measuredHeight, 8);
            ms msVar2 = new ms(i, i2, 8);
            Matrix matrix = new Matrix();
            matrix.postConcat(pfa.s(msVar2, msVar, this.z0));
            float f = ((float) measuredWidth) / 2.0f;
            float f2 = ((float) measuredHeight) / 2.0f;
            matrix.postRotate((float) i3, f, f2);
            if (i3 == 90 || i3 == 270) {
                float measuredHeight2 = ((float) getMeasuredHeight()) / ((float) getMeasuredWidth());
                matrix.postScale(1.0f / measuredHeight2, measuredHeight2, f, f2);
            }
            uce uce = this.a;
            if (uce != null) {
                uce.setTransform(matrix);
            }
            this.w0 = i;
            this.x0 = i2;
            this.y0 = i3;
        }
        uce uce2 = this.a;
        if (uce2 != null) {
            uce2.setVisibility((this.w0 <= 0 || this.x0 <= 0) ? 4 : 0);
        }
    }

    public final void d() {
        a9f a9f = this.o;
        int R = a9f == null ? 0 : a9f.R();
        a9f a9f2 = this.o;
        int M0 = a9f2 == null ? 0 : a9f2.M0();
        a9f a9f3 = this.o;
        c(R, M0, a9f3 == null ? 0 : a9f3.i1(), false);
    }

    public BitmapDrawable getVideoScreenShot() {
        uce uce = this.a;
        if (uce == null || this.y0 != 0 || !uce.isAvailable() || !this.a.isShown() || this.w0 <= 0 || this.x0 <= 0) {
            return null;
        }
        int width = this.a.getWidth();
        int height = this.a.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        float f = (float) width;
        float f2 = 1.0f;
        float f3 = f > 640.0f ? 640.0f / f : 1.0f;
        float f4 = (float) height;
        if (f4 > 480.0f) {
            f2 = 480.0f / f4;
        }
        int min = (int) Math.min(f3, f2);
        Bitmap bitmap = this.a.getBitmap(width * min, height * min);
        if (bitmap == null) {
            return null;
        }
        return new BitmapDrawable(getResources(), bitmap);
    }

    public final void onMeasure(int i, int i2) {
        if (this.w0 <= 0 || this.x0 <= 0) {
            super.onMeasure(i, i2);
            return;
        }
        int[] s = at7.s(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2), this.w0, this.x0);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(s[0], 1073741824), View.MeasureSpec.makeMeasureSpec(s[1], 1073741824));
        c(this.w0, this.x0, this.y0, true);
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = this.b;
        if (surface != null) {
            surface.release();
            this.b = null;
        }
        SurfaceTexture surfaceTexture2 = this.c;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
            this.c = null;
        }
        this.c = surfaceTexture;
        this.b = new Surface(surfaceTexture);
        d();
        a9f a9f = this.o;
        if (a9f != null) {
            a9f.G(this.b);
            this.a.setListener(new xle(this, surfaceTexture));
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        d();
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
