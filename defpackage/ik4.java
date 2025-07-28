package defpackage;

import java.io.File;

/* renamed from: ik4  reason: default package */
public final /* synthetic */ class ik4 implements of3 {
    public final /* synthetic */ File X;
    public final /* synthetic */ g10 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long o;

    public /* synthetic */ ik4(g10 g10, int i, long j, long j2, File file) {
        this.a = g10;
        this.b = i;
        this.c = j;
        this.o = j2;
        this.X = file;
    }

    public final void accept(Object obj) {
        m00 m00 = (m00) obj;
        m00.i = this.a;
        int i = this.b;
        m00.k = (float) i;
        m00.p = this.c;
        m00.o = this.o;
        File file = this.X;
        if (file != null && i == 100) {
            if ((m00.r != null || m00.d != null) && file.exists()) {
                m00.u = file.lastModified();
                m00.m = file.getAbsolutePath();
            }
        }
    }
}
