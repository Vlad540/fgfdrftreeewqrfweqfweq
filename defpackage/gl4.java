package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;

/* renamed from: gl4  reason: default package */
public final class gl4 extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ hl4 Y;
    public int Z;
    public DownloadFileFromWebAppWorker o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gl4(hl4 hl4, Continuation continuation) {
        super(continuation);
        this.Y = hl4;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.c(0.0f, 0, 0, this);
    }
}
