package defpackage;

import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* renamed from: f11  reason: default package */
public final class f11 extends FrameLayout {
    public final k3b a;
    public final t97 b = ez3.O(3, new c6(17, this));

    public f11(Context context) {
        super(context, (AttributeSet) null, 0);
        k3b k3b = new k3b(context);
        this.a = k3b;
        addView(k3b, -1, -1);
        e11 cameraPreviewController = getCameraPreviewController();
        cameraPreviewController.getClass();
        e4b e4b = e4b.f;
        oy1 M = x87.M(context);
        M.c(new c(cameraPreviewController, 14, M), kq3.a(context));
    }

    private final e11 getCameraPreviewController() {
        return (e11) this.b.getValue();
    }

    public final void a(boolean z, boolean z2) {
        int i = 0;
        if (hhd.f((Object) null, Boolean.valueOf(z)) && hhd.f((Object) null, Boolean.valueOf(z2))) {
            return;
        }
        if (z) {
            e11 cameraPreviewController = getCameraPreviewController();
            e4b e4b = cameraPreviewController.b;
            if (e4b != null) {
                if (e4b != null) {
                    e4b.f();
                }
                boolean z3 = !z2;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                e07.p("The specified lens facing is invalid.", !z3);
                linkedHashSet.add(new db7(z3 ? 1 : 0));
                wu1 wu1 = new wu1(linkedHashSet);
                b3b b2 = new hp6(2).b();
                b2.G(this.a.getSurfaceProvider());
                nc7 nc7 = cameraPreviewController.a;
                mye[] myeArr = {b2};
                Trace.beginSection(am7.C("CX:bindToLifecycle"));
                try {
                    hv1 hv1 = e4b.d;
                    if (hv1 != null) {
                        zd2 zd2 = hv1.f;
                        if (zd2 != null) {
                            i = ((ope) zd2.c).b;
                        } else {
                            throw new IllegalStateException("CameraX not initialized yet.");
                        }
                    }
                    if (i != 2) {
                        e4b.b(e4b, 1);
                        e4b.d(nc7, wu1, (ybf) null, hw4.a, (mye[]) Arrays.copyOf(myeArr, 1));
                        return;
                    }
                    throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
                } finally {
                    Trace.endSection();
                }
            }
        } else {
            e4b e4b2 = getCameraPreviewController().b;
            if (e4b2 != null) {
                e4b2.f();
            }
        }
    }
}
