package defpackage;

import ru.ok.android.externcalls.sdk.factory.AnswerCallParams;

/* renamed from: j21  reason: default package */
public final /* synthetic */ class j21 implements u16 {
    public final /* synthetic */ u16 X;
    public final /* synthetic */ lk a;
    public final /* synthetic */ long b;
    public final /* synthetic */ l21 c;
    public final /* synthetic */ u16 o;

    public /* synthetic */ j21(lk lkVar, long j, l21 l21, to1 to1, f fVar) {
        this.a = lkVar;
        this.b = j;
        this.c = l21;
        this.o = to1;
        this.X = fVar;
    }

    public final Object invoke(Object obj) {
        lk lkVar = this.a;
        AnswerCallParams.Builder opponentId = ((AnswerCallParams.Builder) obj).setOpponentId(xja.c(lkVar.a));
        String str = lkVar.c;
        if (str != null) {
            opponentId.setConversationParams(str);
        }
        return (AnswerCallParams) opponentId.setConversationId(lkVar.b).setMyId(xja.c(this.b)).setEventListener((vp1) this.c.b.getValue()).setOnPrepared(this.o).setOnError(this.X).build();
    }
}
