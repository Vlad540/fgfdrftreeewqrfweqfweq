package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.location.live.LiveLocationWorker;

/* renamed from: ii7  reason: default package */
public final /* synthetic */ class ii7 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LiveLocationWorker b;

    public /* synthetic */ ii7(LiveLocationWorker liveLocationWorker, int i) {
        this.a = i;
        this.b = liveLocationWorker;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Long.valueOf(this.b.getInputData().d(ApiProtocol.PARAM_CHAT_ID, -1));
            case 1:
                return (hi7) ((nqc) this.b.getTamComponent()).getAccessor().c(hi7.class);
            default:
                return (di7) ((nqc) this.b.getTamComponent()).getAccessor().c(di7.class);
        }
    }
}
