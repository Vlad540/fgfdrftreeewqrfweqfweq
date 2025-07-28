package ru.ok.android.externcalls.sdk;

import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;

public final /* synthetic */ class p implements of3, StereoRoomManagerImpl.GrantRolesRequest {
    public final /* synthetic */ ConversationImpl a;

    public /* synthetic */ p(ConversationImpl conversationImpl) {
        this.a = conversationImpl;
    }

    public void accept(Object obj) {
        this.a.lambda$addParticipant$29((Throwable) obj);
    }

    public void grantRoles(ge1 ge1, boolean z, je1[] je1Arr, Runnable runnable, Runnable runnable2) {
        this.a.grantRoles(ge1, z, je1Arr, runnable, runnable2);
    }
}
