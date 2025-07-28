package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: f9f  reason: default package */
public final class f9f extends FrameLayout implements TextureView.SurfaceTextureListener {
    public static final /* synthetic */ k77[] E0;
    public final int[] A0 = new int[2];
    public final e9f B0 = new e9f(this, 0);
    public final e9f C0 = new e9f(this, 1);
    public final Path D0 = new Path();
    public final String a = f9f.class.getName();
    public d9f b;
    public Surface c;
    public SurfaceTexture o;
    public b9f w0;
    public int x0;
    public int y0;
    public int z0;

    static {
        Class<f9f> cls = f9f.class;
        E0 = new k77[]{new hc9(cls, "corners", "getCorners()[F"), c3d.g(m7c.a, cls, "videoContentMode", "getVideoContentMode()Lone/me/sdk/media/player/view/VideoView$VideoContentMode;")};
    }

    public f9f(Context context) {
        super(context);
    }

    public final void a(b9f b9f) {
        String str = this.a;
        fn6 fn6 = udd.e;
        boolean z = false;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str, us8.k("Video view. Bind listener and create surface, has listener:", b9f != null), (Throwable) null);
        }
        this.w0 = b9f;
        this.z0 = b9f != null ? b9f.j() : 0;
        d();
        if (this.b != null) {
            String str2 = this.a;
            fn6 fn62 = udd.e;
            if (fn62 != null && fn62.c()) {
                tn7 tn7 = tn7.X;
                if (this.c != null) {
                    z = true;
                }
                fn62.d(tn7, str2, us8.k("Video view. Already has texture, has surface:", z), (Throwable) null);
            }
            Surface surface = this.c;
            if (surface != null && b9f != null) {
                b9f.G(surface);
                return;
            }
            return;
        }
        d9f d9f = new d9f(this, getContext());
        d9f.setSurfaceTextureListener(this);
        addView(d9f, 0);
        this.b = d9f;
    }

    public final void b() {
        this.w0 = null;
        this.z0 = 0;
        this.x0 = 0;
        this.y0 = 0;
        d9f d9f = this.b;
        if (d9f != null) {
            d9f.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            removeView(d9f);
            this.b = null;
        }
        Surface surface = this.c;
        if (surface != null) {
            surface.release();
        }
        this.c = null;
        SurfaceTexture surfaceTexture = this.o;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.o = null;
    }

    public final void c(int i, int i2, boolean z) {
        int i3 = 0;
        if (z) {
            int i4 = this.z0;
            boolean z2 = true;
            boolean z3 = i > 0 && i2 > 0;
            if (getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0) {
                z2 = false;
            }
            if (z3 && z2 && i4 != 0) {
                ms msVar = new ms(getMeasuredWidth(), getMeasuredHeight(), 8);
                ms msVar2 = new ms(i, i2, 8);
                Matrix matrix = new Matrix();
                matrix.postConcat(pfa.s(msVar2, msVar, i4));
                d9f d9f = this.b;
                if (d9f != null) {
                    d9f.setTransform(matrix);
                }
                this.x0 = i;
                this.y0 = i2;
            }
        } else {
            this.x0 = i;
            this.y0 = i2;
            requestLayout();
        }
        d9f d9f2 = this.b;
        if (d9f2 != null) {
            if (this.x0 <= 0 || this.y0 <= 0) {
                i3 = 4;
            }
            d9f2.setVisibility(i3);
        }
    }

    public final void d() {
        b9f b9f = this.w0;
        int R = b9f != null ? b9f.R() : 0;
        b9f b9f2 = this.w0;
        c(R, b9f2 != null ? b9f2.M0() : 0, false);
    }

    public final void dispatchDraw(Canvas canvas) {
        Path path = this.D0;
        if (!path.isEmpty()) {
            int save = canvas.save();
            canvas.clipPath(path);
            try {
                super.dispatchDraw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            super.dispatchDraw(canvas);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        return ((canvas instanceof RecordingCanvas) || canvas.getClass().equals(Canvas.class)) && super.drawChild(canvas, view, j);
    }

    public final float[] getCorners() {
        k77 k77 = E0[0];
        return (float[]) this.B0.b;
    }

    public final c9f getVideoContentMode() {
        k77 k77 = E0[1];
        return (c9f) this.C0.b;
    }

    public final void onMeasure(int i, int i2) {
        if (this.x0 <= 0 || this.y0 <= 0) {
            super.onMeasure(i, i2);
        } else {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int ordinal = getVideoContentMode().ordinal();
            int[] iArr = this.A0;
            if (ordinal == 0) {
                oyb.B(size, size2, this.x0, this.y0, iArr);
            } else if (ordinal == 1) {
                iArr[0] = size;
                iArr[1] = size2;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iArr[0], 1073741824), View.MeasureSpec.makeMeasureSpec(iArr[1], 1073741824));
            c(this.x0, this.y0, true);
        }
        float[] corners = getCorners();
        if (corners != null && getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            Path path = this.D0;
            path.reset();
            path.addRoundRect(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), corners, Path.Direction.CW);
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        String str = this.a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            boolean z = this.w0 != null;
            fn6.d(tn7, str, "Video view. Surface available " + surfaceTexture + ", has listener:" + z, (Throwable) null);
        }
        Surface surface = this.c;
        if (surface != null) {
            surface.release();
        }
        this.c = null;
        SurfaceTexture surfaceTexture2 = this.o;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        this.o = surfaceTexture;
        this.c = new Surface(surfaceTexture);
        d();
        b9f b9f = this.w0;
        if (b9f != null) {
            b9f.G(this.c);
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

    public final void setCorners(float[] fArr) {
        this.B0.o1(this, E0[0], fArr);
    }

    public final void setVideoContentMode(c9f c9f) {
        this.C0.o1(this, E0[1], c9f);
    }
}
