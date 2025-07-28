package defpackage;

import android.os.Trace;
import java.util.Arrays;

/* renamed from: f4b  reason: default package */
public final class f4b {
    public final e4b a;

    public f4b(e4b e4b) {
        this.a = e4b;
    }

    public final void a(mye... myeArr) {
        int i;
        e4b e4b = this.a;
        e4b.getClass();
        Trace.beginSection(am7.C("CX:unbind"));
        try {
            gt0.i();
            hv1 hv1 = e4b.d;
            if (hv1 == null) {
                i = 0;
            } else {
                zd2 zd2 = hv1.f;
                if (zd2 != null) {
                    i = ((ope) zd2.c).b;
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            if (i != 2) {
                e4b.c.q(p23.B(Arrays.copyOf(myeArr, myeArr.length)));
                return;
            }
            throw new UnsupportedOperationException("Unbind usecase is not supported in concurrent camera mode, call unbindAll() first.");
        } finally {
            Trace.endSection();
        }
    }
}
