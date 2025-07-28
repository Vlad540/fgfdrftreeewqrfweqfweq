package defpackage;

import java.util.Collections;

/* renamed from: oo8  reason: default package */
public final /* synthetic */ class oo8 implements j6 {
    public final /* synthetic */ to8 a;
    public final /* synthetic */ xm8 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ zs8 d;

    public /* synthetic */ oo8(to8 to8, xm8 xm8, String str, zs8 zs8) {
        this.a = to8;
        this.b = xm8;
        this.c = str;
        this.d = zs8;
    }

    public final void run() {
        to8 to8 = this.a;
        to8.getClass();
        xm8 xm8 = this.b;
        int v = xm8.a.D0.v();
        String str = this.c;
        vo8 vo8 = xm8.a;
        if (v == 1) {
            long j = vo8.x0;
            xhd xhd = md4.o;
            to8.e.a(new j0d(j, Collections.singletonList(Long.valueOf(vo8.b)), (j63) null, true, vo8.Y0));
        } else {
            ((hz3) to8.a).c.n(vo8.b, new q52(str, 2));
        }
        long j2 = vo8.b;
        uc5 uc5 = (uc5) this.d.c.getValue();
        uc5.getClass();
        StringBuilder sb = new StringBuilder("UploadFileAttachWorker:");
        long j3 = vo8.x0;
        sb.append(j3);
        hr1.s(sb, ":", j2, ":");
        sb.append(str);
        uc5.a.c(sb.toString());
        to8.b.c(new ove(j3, vo8.b, 0));
    }
}
