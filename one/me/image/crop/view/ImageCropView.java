package one.me.image.crop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0010J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lone/me/image/crop/view/ImageCropView;", "Landroid/widget/FrameLayout;", "Liw3;", "Lsha;", "", "freestyleCropModeEnable", "Ljue;", "setFreestyleCropMode", "(I)V", "", "enabled", "setRotateEnabled", "(Z)V", "", "factor", "setMaxScaleMultiplier", "(F)V", "size", "setMinImageSize", "Ljw3;", "getCropState", "()Ljw3;", "getMinOverlaySize", "()F", "getMaxBitmapSize", "()I", "photo-crop_release"}, k = 1, mv = {2, 0, 0})
public final class ImageCropView extends FrameLayout implements iw3, sha {
    public final j76 a;
    public final rha b;

    /* JADX WARNING: type inference failed for: r4v2, types: [j76, android.view.View, oz6] */
    public ImageCropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ? oz6 = new oz6(context);
        oz6.Y0 = true;
        oz6.Z0 = true;
        oz6.a1 = 5;
        this.a = oz6;
        addView(oz6, new FrameLayout.LayoutParams(-1, -1));
        rha rha = new rha(context);
        this.b = rha;
        addView(rha, new FrameLayout.LayoutParams(-1, -1));
        oz6.setCropBoundsChangeListener(this);
        rha.setOverlayViewChangeListener(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r8 = this;
            j76 r8 = r8.a
            float r0 = r8.getCurrentScale()
            float r1 = r8.getMinScale()
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x0020
            android.graphics.Matrix r2 = new android.graphics.Matrix
            android.graphics.Matrix r3 = r8.getCurrentImageMatrix()
            r2.<init>(r3)
            float r1 = r1 / r0
            float r3 = r8.W0
            float r4 = r8.X0
            r2.postScale(r1, r1, r3, r4)
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            float r1 = r8.getMaxScale()
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            android.graphics.RectF r4 = r8.G0
            if (r3 <= 0) goto L_0x0044
            android.graphics.Matrix r2 = new android.graphics.Matrix
            android.graphics.Matrix r3 = r8.getCurrentImageMatrix()
            r2.<init>(r3)
            float r1 = r1 / r0
            float r0 = r4.width()
            r3 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r3
            float r5 = r4.height()
            float r5 = r5 / r3
            r2.postScale(r1, r1, r0, r5)
        L_0x0044:
            android.graphics.RectF r0 = new android.graphics.RectF
            android.graphics.drawable.Drawable r1 = r8.getDrawable()
            int r1 = r1.getIntrinsicWidth()
            float r1 = (float) r1
            android.graphics.drawable.Drawable r3 = r8.getDrawable()
            int r3 = r3.getIntrinsicHeight()
            float r3 = (float) r3
            r5 = 0
            r0.<init>(r5, r5, r1, r3)
            float[] r0 = defpackage.js.o(r0)
            if (r2 == 0) goto L_0x0065
            r2.mapPoints(r0)
        L_0x0065:
            if (r2 == 0) goto L_0x0069
            r0 = r2
            goto L_0x006d
        L_0x0069:
            android.graphics.Matrix r0 = r8.getCurrentImageMatrix()
        L_0x006d:
            float[] r1 = r8.z0
            int r3 = r1.length
            float[] r3 = new float[r3]
            r0.mapPoints(r3, r1)
            android.graphics.RectF r0 = defpackage.js.H(r3)
            float r1 = r0.right
            float r3 = r4.right
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 >= 0) goto L_0x0083
        L_0x0081:
            float r3 = r3 - r1
            goto L_0x008d
        L_0x0083:
            float r1 = r0.left
            float r3 = r4.left
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x008c
            goto L_0x0081
        L_0x008c:
            r3 = r5
        L_0x008d:
            float r1 = r0.bottom
            float r6 = r4.bottom
            int r7 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x0097
            float r6 = r6 - r1
            goto L_0x00a3
        L_0x0097:
            float r0 = r0.top
            float r1 = r4.top
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x00a2
            float r6 = r1 - r0
            goto L_0x00a3
        L_0x00a2:
            r6 = r5
        L_0x00a3:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x00ab
            int r0 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00b9
        L_0x00ab:
            if (r2 != 0) goto L_0x00b6
            android.graphics.Matrix r2 = new android.graphics.Matrix
            android.graphics.Matrix r0 = r8.getCurrentImageMatrix()
            r2.<init>(r0)
        L_0x00b6:
            r2.postTranslate(r3, r6)
        L_0x00b9:
            if (r2 == 0) goto L_0x00be
            r8.setImageMatrix(r2)
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.image.crop.view.ImageCropView.a():void");
    }

    public final jw3 getCropState() {
        return this.a.getCropState();
    }

    public final int getMaxBitmapSize() {
        return this.a.getMaxBitmapSize();
    }

    public float getMinOverlaySize() {
        return this.a.getMinOverlaySize();
    }

    public final void setFreestyleCropMode(int i) {
        this.b.setFreestyleCropMode(i);
    }

    public final void setMaxScaleMultiplier(float f) {
        this.a.setMaxScaleMultiplier(f);
    }

    public final void setMinImageSize(float f) {
        this.a.setMinImageSize(f);
    }

    public final void setRotateEnabled(boolean z) {
        this.a.Y0 = z;
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
