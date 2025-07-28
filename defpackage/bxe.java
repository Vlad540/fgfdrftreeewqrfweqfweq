package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: bxe  reason: default package */
public final class bxe extends l5e implements i26 {
    public final /* synthetic */ UploadFileAttachWorker X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bxe(UploadFileAttachWorker uploadFileAttachWorker, Continuation continuation) {
        super(2, continuation);
        this.X = uploadFileAttachWorker;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((bt8) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bxe(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        return Boolean.valueOf(!(this.X.G0 instanceof dh7));
    }
}
