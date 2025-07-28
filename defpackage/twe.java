package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.UploadExternalGifWorker;

/* renamed from: twe  reason: default package */
public final class twe extends er3 {
    public gh7 X;
    public UploadExternalGifWorker Y;
    public /* synthetic */ Object Z;
    public UploadExternalGifWorker o;
    public final /* synthetic */ UploadExternalGifWorker w0;
    public int x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public twe(UploadExternalGifWorker uploadExternalGifWorker, Continuation continuation) {
        super(continuation);
        this.w0 = uploadExternalGifWorker;
    }

    public final Object o(Object obj) {
        this.Z = obj;
        this.x0 |= Integer.MIN_VALUE;
        return this.w0.doForegroundWork(this);
    }
}
