package ru.ok.android.externcalls.sdk;

public final /* synthetic */ class b implements of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ pf3 c;

    public /* synthetic */ b(Object obj, pf3 pf3, int i) {
        this.a = i;
        this.b = obj;
        this.c = pf3;
    }

    public void a(gx0 gx0) {
        ((ConversationImpl) this.b).lambda$performConnect$22(this.c, gx0);
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((ConversationImpl) this.b).lambda$runStartConversation$18(this.c, (Throwable) obj);
                return;
            default:
                ConversationImpl.lambda$removeJoinLink$37((Runnable) this.b, this.c, (Boolean) obj);
                return;
        }
    }
}
