package defpackage;

import java.io.File;
import java.util.Collections;
import java.util.List;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: l07  reason: default package */
public final class l07 extends sm3 implements tna {
    public static final /* synthetic */ int x0 = 0;
    public final String Z;
    public final ude w0;

    public l07(long j, String str, long j2, long j3, ude ude) {
        super(1, j, j2, Collections.singletonList(Long.valueOf(j3)));
        this.Z = str;
        this.w0 = ude;
    }

    public final void d(uae uae) {
        super.d(uae);
        if (!iu7.F(uae.b)) {
            udd.s("l07", "Can't update msg", (Throwable) null);
            f();
        }
    }

    public final int e() {
        to8 p = p();
        ude ude = this.w0;
        vo8 q = p.q(ude.a);
        if (q != null && q.z0 != ls8.DELETED && q.s()) {
            return 1;
        }
        StringBuilder sb = new StringBuilder("onPreExecute: messageId ");
        long j = ude.a;
        sb.append(j);
        sb.append(" is wrong");
        udd.q("l07", sb.toString());
        w(q);
        l().c(new nl4(j));
        return 3;
    }

    public final void f() {
        udd.q("l07", "onMaxFailCount");
        t().d(this.a);
        to8 p = p();
        ude ude = this.w0;
        w(p.q(ude.a));
        l().c(new nl4(ude.a));
    }

    public final byte[] g() {
        Tasks.FileDownload fileDownload = new Tasks.FileDownload();
        ude ude = this.w0;
        fileDownload.messageId = ude.a;
        fileDownload.attachId = ude.b;
        fileDownload.videoId = ude.c;
        fileDownload.audioId = ude.d;
        fileDownload.mp4GifId = ude.e;
        fileDownload.stickerId = ude.f;
        fileDownload.fileId = ude.j;
        fileDownload.fileName = ude.k;
        fileDownload.url = ude.g;
        fileDownload.notifyProgress = ude.h;
        fileDownload.checkAutoloadConnection = ude.i;
        fileDownload.invalidateCount = ude.l;
        fileDownload.useOriginalExtension = ude.m;
        fileDownload.notCopyVideoToGallery = ude.n;
        Tasks.InvalidateAndDownloadAudio invalidateAndDownloadAudio = new Tasks.InvalidateAndDownloadAudio();
        invalidateAndDownloadAudio.requestId = this.a;
        invalidateAndDownloadAudio.outputPath = this.Z;
        invalidateAndDownloadAudio.chatServerId = this.X;
        invalidateAndDownloadAudio.serverMessageId = ((Number) ((List) this.Y).get(0)).longValue();
        invalidateAndDownloadAudio.fileDownload = fileDownload;
        return gr8.toByteArray(invalidateAndDownloadAudio);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_INVALIDATE_AND_DOWNLOAD_AUDIO;
    }

    public final int h() {
        return 1000000;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [tde, java.lang.Object] */
    /* renamed from: u */
    public final void c(r89 r89) {
        String str;
        super.u(r89);
        udd.q("l07", "Receive msg get response");
        to8 p = p();
        ude ude = this.w0;
        vo8 q = p.q(ude.a);
        pl plVar = null;
        if (q == null || !q.s()) {
            udd.s("l07", "No message after msg get", (Throwable) null);
            f();
            return;
        }
        vo8 vo8 = q.o() ? q.G0 : null;
        udd.q("l07", "messageDb = " + q + ", forwardLink = " + vo8);
        l00 c = q.c();
        if (c != null && (str = c.b) != null) {
            ? obj = new Object();
            obj.a = ude.a;
            obj.b = ude.b;
            obj.c = ude.c;
            obj.d = ude.d;
            obj.e = ude.e;
            obj.f = ude.f;
            obj.j = ude.j;
            obj.k = ude.k;
            obj.h = ude.h;
            obj.i = ude.i;
            obj.m = ude.m;
            obj.n = ude.n;
            obj.l = ude.l + 1;
            obj.g = str;
            ude ude2 = new ude(obj);
            pl plVar2 = this.c;
            if (plVar2 != null) {
                plVar = plVar2;
            }
            ((jc5) plVar.G.getValue()).a(ude2);
        }
    }

    public final void w(vo8 vo8) {
        if (vo8 != null && vo8.z0 != ls8.DELETED) {
            ude ude = this.w0;
            o10 x = ete.x(vo8, ude.b);
            if (x == null) {
                return;
            }
            if (x.n.a()) {
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                ((cm6) plVar.F.getValue()).a.a(new File(this.Z), ude.b);
                return;
            }
            p().v(vo8.b, x.q, new yc5(27));
            l().c(new ove(vo8.x0, vo8.b, 0));
        }
    }
}
