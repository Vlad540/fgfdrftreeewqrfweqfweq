package ru.ok.android.externcalls.sdk;

public final /* synthetic */ class d implements pf3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ d(Object obj, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = z;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((ConversationImpl) this.b).lambda$removeParticipant$31(this.c, (ge1) obj);
                return;
            case 1:
                ((ConversationImpl) this.b).lambda$promoteParticipant$32(this.c, (ge1) obj);
                return;
            default:
                ConversationImpl.lambda$setMuteState$40((mfd) this.b, this.c, (ge1) obj);
                return;
        }
    }
}
