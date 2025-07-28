package defpackage;

import one.me.calls.ui.ui.incoming.CallIncomingScreen;

/* renamed from: z21  reason: default package */
public final class z21 implements i34 {
    public final /* synthetic */ long a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean o;

    public z21(long j, String str, String str2, boolean z) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.o = z;
    }

    public final Object a() {
        CallIncomingScreen.Z.getClass();
        return new CallIncomingScreen(jjd.j(new wia("call_incoming_avatar", this.c), new wia("call_incoming_name", this.b), new wia("call_incoming_chat_id", Long.valueOf(this.a)), new wia("call_incoming_video", Boolean.valueOf(this.o))));
    }
}
