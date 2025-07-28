package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.util.concurrent.Executor;

/* renamed from: jr1  reason: default package */
public final class jr1 implements Runnable {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public final Object o;

    public /* synthetic */ jr1(Object obj, int i, Object obj2) {
        this.a = i;
        this.o = obj;
        this.b = false;
        this.c = obj2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((Executor) this.c).execute(new b(28, this));
                return;
            case 1:
                Bitmap bitmap = (Bitmap) this.c;
                int width = bitmap.getWidth() % 2;
                b46 b46 = (b46) this.o;
                Bitmap bitmap2 = null;
                if (width == 1) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth() + 1, bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.setDensity(bitmap.getDensity());
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawARGB(0, 0, 0, 0);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    b46.getClass();
                    bitmap2 = createBitmap;
                } else {
                    b46.getClass();
                }
                Bitmap bitmap3 = bitmap2 != null ? bitmap2 : bitmap;
                int i = b46.c;
                int[] iArr = new int[1];
                if (i == -1) {
                    GLES20.glGenTextures(1, iArr, 0);
                    GLES20.glBindTexture(3553, iArr[0]);
                    GLES20.glTexParameterf(3553, 10240, 9729.0f);
                    GLES20.glTexParameterf(3553, 10241, 9729.0f);
                    GLES20.glTexParameterf(3553, 10242, 33071.0f);
                    GLES20.glTexParameterf(3553, 10243, 33071.0f);
                    GLUtils.texImage2D(3553, 0, bitmap3, 0);
                } else {
                    GLES20.glBindTexture(3553, i);
                    GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap3);
                    iArr[0] = i;
                }
                if (this.b) {
                    bitmap3.recycle();
                }
                b46.c = iArr[0];
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                b46.x0 = bitmap.getWidth();
                b46.y0 = bitmap.getHeight();
                b46.b();
                return;
            default:
                if (!this.b) {
                    ((pc7) this.c).d((nb7) this.o);
                    this.b = true;
                    return;
                }
                return;
        }
    }

    public jr1(pc7 pc7, nb7 nb7) {
        this.a = 2;
        this.c = pc7;
        this.o = nb7;
    }
}
