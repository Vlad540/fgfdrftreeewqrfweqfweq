package ru.ok.android.externcalls.sdk.chat.listener;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.chat.message.InboundMessage;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/chat/listener/ChatManagerListener;", "", "Lru/ok/android/externcalls/sdk/chat/message/InboundMessage;", "message", "Ljue;", "onNewMessage", "(Lru/ok/android/externcalls/sdk/chat/message/InboundMessage;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface ChatManagerListener {
    void onNewMessage(InboundMessage inboundMessage);
}
