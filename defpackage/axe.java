package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: axe  reason: default package */
public final class axe extends er3 {
    public long X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ UploadFileAttachWorker Z;
    public UploadFileAttachWorker o;
    public int w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public axe(UploadFileAttachWorker uploadFileAttachWorker, Continuation continuation) {
        super(continuation);
        this.Z = uploadFileAttachWorker;
    }

    public final Object o(Object obj) {
        this.Y = obj;
        this.w0 |= Integer.MIN_VALUE;
        return this.Z.k(this);
    }
}
