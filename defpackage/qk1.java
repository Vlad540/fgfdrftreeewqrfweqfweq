package defpackage;

import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;

/* renamed from: qk1  reason: default package */
public interface qk1 extends ConversationEventsListener, mk1, MediaConnectionListener {
    void a(String str) {
    }

    void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
    }

    void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
    }
}
