package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.factory.StartCallParams;

/* renamed from: ts3  reason: default package */
public final /* synthetic */ class ts3 implements pf3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StartCallParams b;

    public /* synthetic */ ts3(StartCallParams startCallParams, int i) {
        this.a = i;
        this.b = startCallParams;
    }

    public final void accept(Object obj) {
        int i = this.a;
        StartCallParams startCallParams = this.b;
        switch (i) {
            case 0:
                startCallParams.getOnPrepared().invoke((Conversation) obj);
                return;
            default:
                startCallParams.getOnError().invoke((Throwable) obj);
                return;
        }
    }
}
