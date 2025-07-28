package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.factory.JoinByLinkParams;

/* renamed from: vs3  reason: default package */
public final /* synthetic */ class vs3 implements pf3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ JoinByLinkParams b;

    public /* synthetic */ vs3(JoinByLinkParams joinByLinkParams, int i) {
        this.a = i;
        this.b = joinByLinkParams;
    }

    public final void accept(Object obj) {
        int i = this.a;
        JoinByLinkParams joinByLinkParams = this.b;
        switch (i) {
            case 0:
                joinByLinkParams.getOnPrepared().invoke((Conversation) obj);
                return;
            default:
                joinByLinkParams.getOnError().invoke((Throwable) obj);
                return;
        }
    }
}
