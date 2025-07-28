package androidx.media3.effect;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public final class DefaultVideoFrameProcessor$Factory$Builder {
    public int a = 0;
    public ExecutorService b;
    public h96 c;
    public q96 d;
    public int e;
    public boolean f = true;

    public qc4 build() {
        int i = this.a;
        boolean z = !this.f;
        h96 h96 = this.c;
        if (h96 == null) {
            h96 = new otf(14);
        }
        return new qc4(i, z, h96, (ScheduledExecutorService) this.b, this.d, this.e);
    }
}
