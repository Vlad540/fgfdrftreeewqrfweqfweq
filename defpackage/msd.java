package defpackage;

import android.util.Size;
import one.me.sdk.gl.effects.VideoMessageStencilHolder;
import one.me.sdk.gl.effects.objects.FrameBuffer;

/* renamed from: msd  reason: default package */
public final class msd {
    public final Size a;
    public final int b;
    public final int c;
    public final String d;
    public final VideoMessageStencilHolder e;
    public final FrameBuffer f;

    public msd(Size size) {
        this.a = size;
        this.b = size.getWidth();
        this.c = size.getHeight();
        String name = msd.class.getName();
        this.d = name;
        VideoMessageStencilHolder videoMessageStencilHolder = new VideoMessageStencilHolder(size.getWidth(), size.getHeight());
        this.e = videoMessageStencilHolder;
        this.f = new FrameBuffer(size.getWidth(), size.getHeight());
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, name, "init, previewSize=" + size, (Throwable) null);
        }
        videoMessageStencilHolder.notifyRecording(true);
    }
}
