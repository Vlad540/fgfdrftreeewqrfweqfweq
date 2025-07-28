package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: ywe  reason: default package */
public final class ywe extends l5e implements i26 {
    public final /* synthetic */ UploadFileAttachWorker X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ywe(UploadFileAttachWorker uploadFileAttachWorker, Continuation continuation) {
        super(2, continuation);
        this.X = uploadFileAttachWorker;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ywe(this.X, continuation);
    }

    public final Object o(Object obj) {
        long j;
        wx3.H(obj);
        try {
            j = new File(this.X.c().b).length() / 1024;
        } catch (Throwable th) {
            udd.s("UploadFileAttachWorker", "fileSize fail!", th);
            j = 0;
        }
        return new Long(j);
    }
}
