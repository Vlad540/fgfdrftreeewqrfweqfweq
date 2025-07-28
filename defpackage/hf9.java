package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: hf9  reason: default package */
public final /* synthetic */ class hf9 implements rf3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ hf9(long j, int i) {
        this.a = i;
        this.b = j;
    }

    public final void accept(Object obj) {
        de9 de9 = (de9) obj;
        switch (this.a) {
            case 0:
                long j = this.b;
                de9.w0 = j;
                if (((al7) de9.Y).j()) {
                    de9.pause();
                }
                ((jf9) ((ge9) de9.b)).A0.setText(xs7.q(TimeUnit.MILLISECONDS.toSeconds(j)));
                de9.Z1();
                de9.z0.c(Long.valueOf(j));
                return;
            default:
                if (((al7) de9.Y).j()) {
                    de9.pause();
                }
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long j2 = this.b;
                ((jf9) ((ge9) de9.b)).B0.setText(xs7.q(timeUnit.toSeconds(j2)));
                de9.Z1();
                de9.z0.c(Long.valueOf(j2));
                return;
        }
    }
}
