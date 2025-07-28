package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: jlc  reason: default package */
public final class jlc extends fja {
    public static final jlc f = new jlc(0);
    public static final jlc g = new jlc(1);
    public static final jlc h = new jlc(2);
    public static final jlc i = new jlc(3);
    public static final jlc j = new jlc(4);
    public static final jlc k = new jlc(5);
    public static final jlc l = new jlc(6);
    public static final jlc m = new jlc(7);
    public static final jlc n = new jlc(8);
    public final /* synthetic */ int e;

    public /* synthetic */ jlc(int i2) {
        this.e = i2;
    }

    public final void j(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3, float f4, float f5) {
        float f6;
        float f7;
        float f8;
        float f9;
        switch (this.e) {
            case 0:
                matrix.setTranslate((float) ((int) ((((float) (rect.width() - i2)) * 0.5f) + ((float) rect.left) + 0.5f)), (float) ((int) ((((float) (rect.height() - i3)) * 0.5f) + ((float) rect.top) + 0.5f)));
                return;
            case 1:
                if (f5 > f4) {
                    f6 = ((((float) rect.width()) - (((float) i2) * f5)) * 0.5f) + ((float) rect.left);
                    f7 = (float) rect.top;
                    f4 = f5;
                } else {
                    float height = (((float) rect.height()) - (((float) i3) * f4)) * 0.5f;
                    f6 = (float) rect.left;
                    f7 = height + ((float) rect.top);
                }
                matrix.setScale(f4, f4);
                matrix.postTranslate((float) ((int) (f6 + 0.5f)), (float) ((int) (f7 + 0.5f)));
                return;
            case 2:
                float min = Math.min(Math.min(f4, f5), 1.0f);
                float width = ((((float) rect.width()) - (((float) i2) * min)) * 0.5f) + ((float) rect.left);
                float height2 = (((float) rect.height()) - (((float) i3) * min)) * 0.5f;
                matrix.setScale(min, min);
                matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height2 + ((float) rect.top) + 0.5f)));
                return;
            case 3:
                float min2 = Math.min(f4, f5);
                float height3 = ((float) rect.height()) - (((float) i3) * min2);
                matrix.setScale(min2, min2);
                matrix.postTranslate((float) ((int) (((float) rect.left) + 0.5f)), (float) ((int) (height3 + ((float) rect.top) + 0.5f)));
                return;
            case 4:
                float min3 = Math.min(f4, f5);
                float width2 = ((((float) rect.width()) - (((float) i2) * min3)) * 0.5f) + ((float) rect.left);
                float height4 = (((float) rect.height()) - (((float) i3) * min3)) * 0.5f;
                matrix.setScale(min3, min3);
                matrix.postTranslate((float) ((int) (width2 + 0.5f)), (float) ((int) (height4 + ((float) rect.top) + 0.5f)));
                return;
            case 5:
                float min4 = Math.min(f4, f5);
                float width3 = ((float) rect.width()) - (((float) i2) * min4);
                float height5 = (((float) rect.height()) - (((float) i3) * min4)) + ((float) rect.top);
                matrix.setScale(min4, min4);
                matrix.postTranslate((float) ((int) (width3 + ((float) rect.left) + 0.5f)), (float) ((int) (height5 + 0.5f)));
                return;
            case 6:
                float min5 = Math.min(f4, f5);
                matrix.setScale(min5, min5);
                matrix.postTranslate((float) ((int) (((float) rect.left) + 0.5f)), (float) ((int) (((float) rect.top) + 0.5f)));
                return;
            case 7:
                matrix.setScale(f4, f5);
                matrix.postTranslate((float) ((int) (((float) rect.left) + 0.5f)), (float) ((int) (((float) rect.top) + 0.5f)));
                return;
            default:
                if (f5 > f4) {
                    float f10 = ((float) i2) * f5;
                    f9 = Math.max(Math.min((((float) rect.width()) * 0.5f) - (f2 * f10), 0.0f), ((float) rect.width()) - f10) + ((float) rect.left);
                    f8 = (float) rect.top;
                    f4 = f5;
                } else {
                    f9 = (float) rect.left;
                    float f11 = ((float) i3) * f4;
                    f8 = Math.max(Math.min((((float) rect.height()) * 0.5f) - (f3 * f11), 0.0f), ((float) rect.height()) - f11) + ((float) rect.top);
                }
                matrix.setScale(f4, f4);
                matrix.postTranslate((float) ((int) (f9 + 0.5f)), (float) ((int) (f8 + 0.5f)));
                return;
        }
    }

    public final String toString() {
        switch (this.e) {
            case 0:
                return "center";
            case 1:
                return "center_crop";
            case 2:
                return "center_inside";
            case 3:
                return "fit_bottom_start";
            case 4:
                return "fit_center";
            case 5:
                return "fit_end";
            case 6:
                return "fit_start";
            case 7:
                return "fit_xy";
            default:
                return "focus_crop";
        }
    }
}
