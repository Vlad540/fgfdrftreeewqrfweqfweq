package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.messages.NotificationsImagesProvider;

/* renamed from: yp9  reason: default package */
public final class yp9 extends er3 {
    public ov0 X;
    public ou3 Y;
    public /* synthetic */ Object Z;
    public NotificationsImagesProvider o;
    public final /* synthetic */ NotificationsImagesProvider w0;
    public int x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yp9(NotificationsImagesProvider notificationsImagesProvider, Continuation continuation) {
        super(continuation);
        this.w0 = notificationsImagesProvider;
    }

    public final Object o(Object obj) {
        this.Z = obj;
        this.x0 |= Integer.MIN_VALUE;
        return NotificationsImagesProvider.a(this.w0, (ov0) null, (ou3) null, this);
    }
}
