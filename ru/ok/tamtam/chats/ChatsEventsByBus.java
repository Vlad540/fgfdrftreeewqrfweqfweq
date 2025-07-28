package ru.ok.tamtam.chats;

import androidx.annotation.Keep;
import java.util.Collections;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lru/ok/tamtam/chats/ChatsEventsByBus;", "Lxg0;", "Love;", "updateMessageEvent", "Ljue;", "onEvent", "(Love;)V", "Lmw2;", "chatsUpdateEvent", "(Lmw2;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
final class ChatsEventsByBus extends xg0 {
    @a1e
    @Keep
    public final void onEvent(ove ove) {
        if (ove.X) {
            a(new bq2(Collections.singleton(Long.valueOf(ove.b)), false, qw4.a));
        }
    }

    @a1e
    @Keep
    public final void onEvent(mw2 mw2) {
        a(new bq2(new bs(mw2.b), mw2.c, mw2.w0));
    }
}
