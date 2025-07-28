package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.factory.JoinAnonByLinkParams;

/* renamed from: us3  reason: default package */
public final /* synthetic */ class us3 implements pf3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ JoinAnonByLinkParams b;

    public /* synthetic */ us3(JoinAnonByLinkParams joinAnonByLinkParams, int i) {
        this.a = i;
        this.b = joinAnonByLinkParams;
    }

    public final void accept(Object obj) {
        int i = this.a;
        JoinAnonByLinkParams joinAnonByLinkParams = this.b;
        switch (i) {
            case 0:
                joinAnonByLinkParams.getOnPrepared().invoke((Conversation) obj);
                return;
            default:
                joinAnonByLinkParams.getOnError().invoke((Throwable) obj);
                return;
        }
    }
}
