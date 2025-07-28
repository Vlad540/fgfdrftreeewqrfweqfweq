package ru.ok.android.externcalls.sdk.conversation.internal.actions;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.ConversationParams;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldhd;", "Lega;", "Lru/ok/android/externcalls/sdk/api/ConversationParams;", "invoke", "()Ldhd;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class Prepare$executeSimple$1 extends b97 implements s16 {
    final /* synthetic */ Prepare this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Prepare$executeSimple$1(Prepare prepare) {
        super(0);
        this.this$0 = prepare;
    }

    public final dhd invoke() {
        ega ega = null;
        if (this.this$0.providedParams != null || this.this$0.isCaller) {
            ConversationParams access$getProvidedParams$p = this.this$0.providedParams;
            if (access$getProvidedParams$p != null) {
                ega = new ega(access$getProvidedParams$p);
            }
            if (ega == null) {
                ega = ega.b;
            }
            return dhd.g(ega);
        }
        Prepare prepare = this.this$0;
        return prepare.retryForApiCall(prepare.okApiService.getConversationParams((String) null, this.this$0.isAnswer ? ((dt3) this.this$0.cidProvider).a : null)).h(AnonymousClass2.INSTANCE);
    }
}
