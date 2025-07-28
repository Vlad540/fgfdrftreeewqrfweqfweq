package defpackage;

import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: x21  reason: default package */
public final class x21 implements i34 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean o;

    public /* synthetic */ x21(long j, boolean z, boolean z2, int i) {
        this.a = i;
        this.b = j;
        this.c = z;
        this.o = z2;
    }

    public final Object a() {
        switch (this.a) {
            case 0:
                CallScreen.T0.getClass();
                return new CallScreen(jjd.j(new wia("type", "ONE_TO_ONE"), new wia("opponent_id", Long.valueOf(this.b)), new wia("video_enabled", Boolean.valueOf(this.c)), new wia("microphone_enabled", Boolean.valueOf(this.o))));
            default:
                CallScreen.T0.getClass();
                return new CallScreen(jjd.j(new wia("type", "CHAT"), new wia("chat_id", Long.valueOf(this.b)), new wia("video_enabled", Boolean.valueOf(this.c)), new wia("microphone_enabled", Boolean.valueOf(this.o))));
        }
    }
}
