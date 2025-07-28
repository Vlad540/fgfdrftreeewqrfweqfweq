package defpackage;

import android.media.MediaCodec;
import android.util.Range;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;

/* renamed from: mx4  reason: default package */
public final /* synthetic */ class mx4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xx4 b;
    public final /* synthetic */ long c;

    public /* synthetic */ mx4(xx4 xx4, long j, int i) {
        this.a = i;
        this.b = xx4;
        this.c = j;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                xx4 xx4 = this.b;
                switch (hr1.t(xx4.D)) {
                    case 0:
                    case 2:
                    case 3:
                    case 5:
                    case 7:
                        return;
                    case 1:
                        long j = this.c;
                        e07.I(j);
                        xx4.o.addLast(Range.create(Long.valueOf(j), Long.MAX_VALUE));
                        xx4.i(3);
                        return;
                    case 4:
                        xx4.i(6);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(me4.r(xx4.D)));
                }
            default:
                xx4 xx42 = this.b;
                long j2 = this.c;
                switch (hr1.t(xx42.D)) {
                    case 0:
                        xx42.w = null;
                        e07.I(j2);
                        try {
                            if (xx42.z) {
                                xx42.h();
                            }
                            xx42.t = Range.create(Long.valueOf(j2), Long.MAX_VALUE);
                            xx42.e.start();
                            ex4 ex4 = xx42.f;
                            if (ex4 instanceof tx4) {
                                ((tx4) ex4).a(true);
                            }
                            xx42.i(2);
                            return;
                        } catch (MediaCodec.CodecException e) {
                            xx42.b(1, e.getMessage(), e);
                            return;
                        }
                    case 1:
                    case 4:
                    case 7:
                        return;
                    case 2:
                        xx42.w = null;
                        Range range = (Range) xx42.o.removeLast();
                        e07.p("There should be a \"pause\" before \"resume\"", range != null && ((Long) range.getUpper()).longValue() == Long.MAX_VALUE);
                        Long l = (Long) range.getLower();
                        long longValue = l.longValue();
                        xx42.o.addLast(Range.create(l, Long.valueOf(j2)));
                        e07.I(j2);
                        e07.I(j2 - longValue);
                        if ((xx42.c || xf4.a.j(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!xx42.c || xf4.a.j(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                            xx42.e.setParameters(wn6.g(0, "drop-input-frames"));
                            ex4 ex42 = xx42.f;
                            if (ex42 instanceof tx4) {
                                ((tx4) ex42).a(true);
                            }
                        }
                        if (xx42.c) {
                            xx42.g();
                        }
                        xx42.i(2);
                        return;
                    case 3:
                    case 5:
                        xx42.i(5);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(me4.r(xx42.D)));
                }
        }
    }
}
