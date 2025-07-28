package defpackage;

import ru.ok.android.externcalls.sdk.ConversationFactory;

/* renamed from: ys3  reason: default package */
public final /* synthetic */ class ys3 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConversationFactory b;

    public /* synthetic */ ys3(ConversationFactory conversationFactory, int i) {
        this.a = i;
        this.b = conversationFactory;
    }

    public final Object invoke() {
        int i = this.a;
        ConversationFactory conversationFactory = this.b;
        switch (i) {
            case 0:
                return conversationFactory.lambda$new$0();
            default:
                return conversationFactory.lambda$new$1();
        }
    }
}
