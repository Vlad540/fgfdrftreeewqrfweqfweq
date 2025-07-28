package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.messages.NotificationsImagesProvider;

/* renamed from: aq9  reason: default package */
public final class aq9 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ NotificationsImagesProvider Y;
    public final /* synthetic */ Uri Z;
    public final /* synthetic */ ov0 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aq9(NotificationsImagesProvider notificationsImagesProvider, Uri uri, ngd ngd, Continuation continuation) {
        super(2, continuation);
        this.Y = notificationsImagesProvider;
        this.Z = uri;
        this.w0 = ngd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new aq9(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            zp9 zp9 = new zp9(this.Y, this.Z, this.w0, (Continuation) null);
            this.X = 1;
            obj = ez3.l0(CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, zp9, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
