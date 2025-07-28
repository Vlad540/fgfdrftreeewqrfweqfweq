package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import one.me.image.crop.view.ImageCropView;
import ru.ok.messages.media.crop.FrgTamCropImage;

/* renamed from: j16  reason: default package */
public final /* synthetic */ class j16 implements j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgTamCropImage b;

    public /* synthetic */ j16(FrgTamCropImage frgTamCropImage, int i) {
        this.a = i;
        this.b = frgTamCropImage;
    }

    /* JADX WARNING: type inference failed for: r1v20, types: [android.content.Context, r5] */
    public final void run() {
        switch (this.a) {
            case 0:
                FrgTamCropImage frgTamCropImage = this.b;
                ((k93) frgTamCropImage.t1.b).b().f("LOCAL_MEDIA_ROTATE");
                j76 j76 = frgTamCropImage.F1.a;
                Matrix matrix = j76.H0;
                matrix.reset();
                float currentScale = 1.0f / j76.getCurrentScale();
                matrix.postScale(currentScale, currentScale);
                RectF rectF = j76.I0;
                rectF.set(j76.G0);
                matrix.mapRect(rectF);
                float width = rectF.width();
                j76 j762 = frgTamCropImage.F1.a;
                RectF rectF2 = j762.G0;
                float centerX = rectF2.centerX();
                float centerY = rectF2.centerY();
                Matrix matrix2 = j762.y0;
                matrix2.postRotate(90.0f, centerX, centerY);
                j762.setImageMatrix(matrix2);
                rha rha = frgTamCropImage.F1.b;
                float f = 1.0f / rha.x0;
                rha.x0 = f;
                RectF rectF3 = rha.a;
                rha.a(rectF3, f);
                rha.b();
                ImageCropView imageCropView = rha.Q0;
                if (imageCropView != null) {
                    imageCropView.a.setCropRect(rectF3);
                }
                rha.postInvalidateOnAnimation();
                j76 j763 = frgTamCropImage.F1.a;
                Matrix matrix3 = j763.H0;
                matrix3.reset();
                float currentScale2 = 1.0f / j763.getCurrentScale();
                matrix3.postScale(currentScale2, currentScale2);
                RectF rectF4 = j763.I0;
                rectF4.set(j763.G0);
                matrix3.mapRect(rectF4);
                float height = rectF4.height() / width;
                j76 j764 = frgTamCropImage.F1.a;
                RectF rectF5 = j764.G0;
                float centerX2 = rectF5.centerX();
                float centerY2 = rectF5.centerY();
                if (height != 0.0f) {
                    Matrix matrix4 = j764.y0;
                    matrix4.postScale(height, height, centerX2, centerY2);
                    j764.setImageMatrix(matrix4);
                }
                frgTamCropImage.F1.a();
                return;
            case 1:
                FrgTamCropImage frgTamCropImage2 = this.b;
                ((k93) frgTamCropImage2.t1.b).b().f("LOCAL_MEDIA_FLIP");
                j76 j765 = frgTamCropImage2.F1.a;
                RectF rectF6 = j765.G0;
                float centerX3 = rectF6.centerX();
                float centerY3 = rectF6.centerY();
                Matrix matrix5 = j765.y0;
                matrix5.postScale(-1.0f, 1.0f, centerX3, centerY3);
                j765.setImageMatrix(matrix5);
                frgTamCropImage2.F1.a();
                return;
            case 2:
                j76 j766 = this.b.F1.a;
                j766.J0 = 0.0f;
                j766.f();
                return;
            case 3:
                this.b.f1();
                return;
            case 4:
                FrgTamCropImage frgTamCropImage3 = this.b;
                frgTamCropImage3.getClass();
                new y63(1, new j16(frgTamCropImage3, 5)).k(cnc.a()).h(de.a()).i(new pn1(new k16(frgTamCropImage3, 1), 0, new j16(frgTamCropImage3, 6)));
                return;
            case 5:
                FrgTamCropImage frgTamCropImage4 = this.b;
                ImageCropView imageCropView2 = frgTamCropImage4.F1;
                Bitmap.CompressFormat compressFormat = frgTamCropImage4.Z.getBoolean("ru.ok.tamtam.extra.SAVE_AS_PNG") ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
                j76 j767 = imageCropView2.a;
                j767.i(j767.getViewBitmap(), j767.getImageOutputPath(), compressFormat);
                return;
            case 6:
                FrgTamCropImage frgTamCropImage5 = this.b;
                ? h1 = frgTamCropImage5.h1();
                if (h1 != 0) {
                    Uri uri = (Uri) frgTamCropImage5.Z.getParcelable("ru.ok.tamtam.extra.ADDITIONAL_SOURCE_URI");
                    Uri uri2 = (Uri) frgTamCropImage5.Z.getParcelable("ru.ok.tamtam.extra.ADDITIONAL_RESULT_URI");
                    if (uri == null || uri2 == null) {
                        frgTamCropImage5.t1();
                        return;
                    }
                    int maxBitmapSize = frgTamCropImage5.F1.getMaxBitmapSize();
                    new vm0(h1, (Uri) frgTamCropImage5.Z.getParcelable("ru.ok.tamtam.extra.ADDITIONAL_SOURCE_URI"), (Uri) null, maxBitmapSize, maxBitmapSize, new u5g(13, frgTamCropImage5)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                    return;
                }
                return;
            default:
                this.b.t1();
                return;
        }
    }
}
