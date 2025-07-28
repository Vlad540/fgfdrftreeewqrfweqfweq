package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* renamed from: rk4  reason: default package */
public final class rk4 extends l5e implements i26 {
    public final /* synthetic */ DownloadFileAttachWorker X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rk4(DownloadFileAttachWorker downloadFileAttachWorker, Continuation continuation) {
        super(2, continuation);
        this.X = downloadFileAttachWorker;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rk4(this.X, continuation);
    }

    public final Object o(Object obj) {
        v00 v00;
        String str;
        wx3.H(obj);
        DownloadFileAttachWorker downloadFileAttachWorker = this.X;
        if (downloadFileAttachWorker.g().c > 0) {
            return ((mg5) downloadFileAttachWorker.d()).s(downloadFileAttachWorker.g().c);
        } else if (downloadFileAttachWorker.g().d > 0) {
            return ((mg5) downloadFileAttachWorker.d()).d(downloadFileAttachWorker.g().d);
        } else if (downloadFileAttachWorker.g().e > 0) {
            return ((mg5) downloadFileAttachWorker.d()).k(downloadFileAttachWorker.g().e);
        } else if (downloadFileAttachWorker.g().f > 0) {
            bf5 d = downloadFileAttachWorker.d();
            long j = downloadFileAttachWorker.g().f;
            mg5 mg5 = (mg5) d;
            mg5.getClass();
            return new File(mg5.g(mg5.b(), "stickerCache"), us8.i(j, "sticker_"));
        } else {
            File file = null;
            if (downloadFileAttachWorker.g().j > 0) {
                vo8 q = downloadFileAttachWorker.e().q(downloadFileAttachWorker.g().a);
                if (q != null) {
                    jj7 jj7 = q.D0;
                    if (jj7 != null) {
                        o10 x = jj7.x(j10.y0);
                        if (!(x == null || (v00 = x.j) == null || (str = x.r) == null || str.length() == 0)) {
                            File file2 = new File(str);
                            if (file2.exists() && file2.length() == v00.b && file2.lastModified() == x.v) {
                                file = file2;
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                if (file == null) {
                    return ((mg5) downloadFileAttachWorker.d()).i(downloadFileAttachWorker.g().k);
                }
            }
            return file;
        }
    }
}
