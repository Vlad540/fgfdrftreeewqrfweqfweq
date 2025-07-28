package defpackage;

import android.graphics.Bitmap;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: vq6  reason: default package */
public final class vq6 extends sg0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public vq6(zv1 zv1, g0 g0Var, r8c r8c) {
        this.b = zv1;
        this.c = g0Var;
        this.d = r8c;
    }

    public void d() {
        switch (this.a) {
            case 1:
                yv1 yv1 = (yv1) this.b;
                if (yv1.isActive()) {
                    yv1.cancel(new Throwable("Cancelled with fresco pipeline"));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void e(g0 g0Var) {
        switch (this.a) {
            case 0:
                ((xq6) this.d).b((wq6) this.b);
                return;
            default:
                yv1 yv1 = (yv1) this.b;
                if (yv1.isActive()) {
                    yv1.resumeWith((Object) null);
                    return;
                }
                return;
        }
    }

    public final void g(Bitmap bitmap) {
        Object obj = this.d;
        FileOutputStream fileOutputStream = null;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case 0:
                wq6 wq6 = (wq6) obj3;
                xq6 xq6 = (xq6) obj;
                if (bitmap == null) {
                    udd.s("xq6", "onNewResultImpl: bitmap is null in shareWebpImage", (Throwable) null);
                    xq6.b(wq6);
                    return;
                }
                try {
                    String absolutePath = ((bf5) obj2).a("png").getAbsolutePath();
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                    xq6.getClass();
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(absolutePath);
                        try {
                            bitmap.compress(compressFormat, 100, fileOutputStream2);
                            ete.n(fileOutputStream2);
                            if (wq6 != null) {
                                xq6.c(new zo5(wq6, 6, absolutePath));
                                return;
                            }
                            return;
                        } catch (IOException e) {
                            e = e;
                            fileOutputStream = fileOutputStream2;
                            try {
                                udd.s("xq6", "saveBitmap failure!", e);
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                ete.n(fileOutputStream);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            ete.n(fileOutputStream);
                            throw th;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        udd.s("xq6", "saveBitmap failure!", e);
                        throw e;
                    }
                } catch (Exception e3) {
                    udd.s("xq6", "onNewResultImpl: failed to save webp image", e3);
                    xq6.b(wq6);
                    return;
                }
            default:
                yv1 yv1 = (yv1) obj3;
                if (!yv1.isActive()) {
                    if (bitmap != null) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                } else if (!((g0) obj2).h()) {
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    yv1.resumeWith((Object) null);
                    return;
                } else if (bitmap == null) {
                    yv1.resumeWith((Object) null);
                    return;
                } else {
                    uy5 uy5 = ((r8c) obj).c;
                    yv1.resumeWith(new vy5(uy5.b, uy5.c, bitmap));
                    return;
                }
        }
    }

    public vq6(xq6 xq6, wq6 wq6, bf5 bf5) {
        this.d = xq6;
        this.b = wq6;
        this.c = bf5;
    }
}
