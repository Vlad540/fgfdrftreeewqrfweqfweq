package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: vx4  reason: default package */
public final class vx4 extends MediaCodec.Callback {
    public final kd8 a;
    public final boolean b = true;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public long f = 0;
    public long g = 0;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public final /* synthetic */ xx4 k;

    /* JADX WARNING: type inference failed for: r1v8, types: [java.lang.Object, kd8] */
    public vx4(xx4 xx4) {
        this.k = xx4;
        if (xx4.c) {
            xhd xhd = xx4.q;
            kje kje = xx4.p;
            ? obj = new Object();
            obj.o = -1;
            obj.a = xhd;
            obj.b = kje;
            obj.c = (CameraUseInconsistentTimebaseQuirk) xf4.a.j(CameraUseInconsistentTimebaseQuirk.class);
            this.a = obj;
        } else {
            this.a = null;
        }
        if (((CodecStuckOnFlushQuirk) xf4.a.j(CodecStuckOnFlushQuirk.class)) != null && "video/mp4v-es".equals(xx4.d.getString("mime"))) {
            this.b = false;
        }
    }

    public final void a() {
        xx4 xx4;
        ix4 ix4;
        Executor executor;
        if (!this.e) {
            this.e = true;
            Future future = this.k.C;
            if (future != null) {
                future.cancel(false);
                this.k.C = null;
            }
            synchronized (this.k.b) {
                xx4 = this.k;
                ix4 = xx4.r;
                executor = xx4.s;
            }
            xx4.l(new px4((Object) this, executor, (Object) ix4, 1));
        }
    }

    public final void b(yw4 yw4, ix4 ix4, Executor executor) {
        xx4 xx4 = this.k;
        xx4.n.add(yw4);
        ct0.a(ct0.A(yw4.X), new nu7(this, yw4, false), xx4.h);
        try {
            executor.execute(new ii4(ix4, 16, yw4));
        } catch (RejectedExecutionException unused) {
            yw4.close();
        }
    }

    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        this.k.h.execute(new ii4(this, 13, codecException));
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i2) {
        this.k.h.execute(new n30(i2, 8, this));
    }

    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
        this.k.h.execute(new nx4((Object) this, (Object) bufferInfo, (Object) mediaCodec, i2, 1));
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.k.h.execute(new ii4(this, 14, mediaFormat));
    }
}
