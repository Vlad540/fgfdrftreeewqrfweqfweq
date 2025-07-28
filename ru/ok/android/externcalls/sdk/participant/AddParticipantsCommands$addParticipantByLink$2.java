package ru.ok.android.externcalls.sdk.participant;

import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmfd;", "signaling", "Ljue;", "invoke", "(Lmfd;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class AddParticipantsCommands$addParticipantByLink$2 extends b97 implements u16 {
    final /* synthetic */ String $link;
    final /* synthetic */ pf3 $onError;
    final /* synthetic */ Runnable $onSuccess;
    final /* synthetic */ AddParticipantsCommands this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddParticipantsCommands$addParticipantByLink$2(String str, pf3 pf3, Runnable runnable, AddParticipantsCommands addParticipantsCommands) {
        super(1);
        this.$link = str;
        this.$onError = pf3;
        this.$onSuccess = runnable;
        this.this$0 = addParticipantsCommands;
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$0(Runnable runnable, JSONObject jSONObject) {
        runnable.run();
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$1(pf3 pf3, AddParticipantsCommands addParticipantsCommands, JSONObject jSONObject) {
        pf3.accept(addParticipantsCommands.parseErrorResponse(jSONObject));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((mfd) obj);
        return jue.a;
    }

    public final void invoke(mfd mfd) {
        try {
            String str = this.$link;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("participantIdAsQRCodeLink", (Object) str);
            mfd.d(x87.d(jSONObject, "add-participant"), false, new a(this.$onSuccess), new b(this.$onError, this.this$0, 0));
        } catch (JSONException e) {
            this.$onError.accept(new RuntimeException("Request preparation error", e));
        }
    }
}
