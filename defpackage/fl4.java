package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;

/* renamed from: fl4  reason: default package */
public final class fl4 extends l5e implements i26 {
    public final /* synthetic */ DownloadFileFromWebAppWorker X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fl4(DownloadFileFromWebAppWorker downloadFileFromWebAppWorker, Continuation continuation) {
        super(2, continuation);
        this.X = downloadFileFromWebAppWorker;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fl4(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.X;
        return ((mg5) ((bf5) downloadFileFromWebAppWorker.c.getValue())).i(downloadFileFromWebAppWorker.c().d);
    }
}
