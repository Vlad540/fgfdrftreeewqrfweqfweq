package ru.ok.android.externcalls.sdk.participant;

import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class AddParticipantsCommands$addParticipantByLink$1 extends x26 implements u16 {
    public AddParticipantsCommands$addParticipantByLink$1(Object obj) {
        super(1, 0, pf3.class, obj, "accept", "accept(Ljava/lang/Object;)V");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return jue.a;
    }

    public final void invoke(Throwable th) {
        ((pf3) this.receiver).accept(th);
    }
}
