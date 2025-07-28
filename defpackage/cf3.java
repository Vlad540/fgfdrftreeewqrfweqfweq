package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashSet;
import java.util.List;
import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpSender;

/* renamed from: cf3  reason: default package */
public abstract class cf3 implements rja {
    public Object X;
    public final Object a;
    public final Object b;
    public final Object c;
    public Object o;

    public cf3(ula ula, xwb xwb, qla qla, gvf gvf) {
        this.a = ula;
        this.b = xwb;
        this.o = qla;
        this.c = new Handler(Looper.getMainLooper());
        this.X = gvf;
    }

    public abstract void b(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack);

    public abstract void c(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack);

    public abstract void d();

    public abstract void e(ge1 ge1, String str);

    public abstract void f();

    public abstract MediaSource g();

    public abstract MediaStreamTrack h(String str, MediaSource mediaSource);

    public abstract Object i();

    public String j() {
        return getClass().getSimpleName();
    }

    public abstract void k(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr);

    public void l() {
        MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) this.X;
        xwb xwb = (xwb) this.c;
        if (mediaStreamTrack != null) {
            String j = j();
            xwb.log(j, this + ": An attempt to create track, while got one, ignore");
        } else if (((MediaSource) this.o) != null) {
            String j2 = j();
            xwb.log(j2, this + ": An attempt to create source, while got one, ignore");
        } else {
            MediaSource g = g();
            this.o = g;
            MediaStreamTrack h = h((String) this.a, g);
            this.X = h;
            b((MediaStream) this.b, h);
        }
    }

    public void m() {
        MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) this.X;
        if (mediaStreamTrack != null) {
            c((MediaStream) this.b, mediaStreamTrack);
        }
        MediaStreamTrack mediaStreamTrack2 = (MediaStreamTrack) this.X;
        xwb xwb = (xwb) this.c;
        if (mediaStreamTrack2 != null) {
            mediaStreamTrack2.dispose();
            String j = j();
            String c2 = d59.c(mediaStreamTrack2);
            xwb.log(j, this + ": " + c2 + " was disposed");
        }
        this.X = null;
        MediaSource mediaSource = (MediaSource) this.o;
        if (mediaSource != null) {
            mediaSource.dispose();
            String j2 = j();
            String c3 = d59.c(mediaSource);
            xwb.log(j2, this + ": " + c3 + " was disposed");
        }
        this.o = null;
    }

    public void n(oe3 oe3) {
        synchronized (this.c) {
            if (((LinkedHashSet) this.X).remove(oe3) && ((LinkedHashSet) this.X).isEmpty()) {
                s();
            }
        }
    }

    public void o(boolean z) {
        MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) this.X;
        if (mediaStreamTrack != null) {
            mediaStreamTrack.setEnabled(z);
        }
    }

    public abstract void p(String str, xm1 xm1, List list);

    public void q(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.o;
            if (obj2 == null || !obj2.equals(obj)) {
                this.o = obj;
                ((m30) ((duf) ((bee) this.a)).c).execute(new dr1(o23.s0((LinkedHashSet) this.X), 12, this));
            }
        }
    }

    public abstract void r();

    public abstract void s();

    public void t(RtpSender rtpSender) {
        MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) this.X;
        if (rtpSender != null && mediaStreamTrack != null && rtpSender.track() != mediaStreamTrack) {
            String j = j();
            String c2 = d59.c(mediaStreamTrack);
            String c3 = d59.c(rtpSender);
            ((xwb) this.c).log(j, this + ": bind " + c2 + " with " + c3);
            rtpSender.setTrack(mediaStreamTrack, false);
        }
    }

    public cf3(String str, MediaStream mediaStream, xwb xwb) {
        this.a = str;
        this.b = mediaStream;
        this.c = xwb;
    }

    public cf3(Context context, duf duf) {
        this.a = duf;
        this.b = context.getApplicationContext();
        this.c = new Object();
        this.X = new LinkedHashSet();
    }
}
