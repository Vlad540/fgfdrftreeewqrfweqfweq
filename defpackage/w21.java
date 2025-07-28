package defpackage;

import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: w21  reason: default package */
public final class w21 implements i34 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean o;

    public w21(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.o = z3;
        this.X = z4;
    }

    public final Object a() {
        CallScreen.T0.getClass();
        return new CallScreen(jjd.j(new wia("type", "LINK"), new wia("link", this.a), new wia("video_enabled", Boolean.valueOf(this.b)), new wia("microphone_enabled", Boolean.valueOf(this.c)), new wia("front_camera_enabled", Boolean.valueOf(this.o)), new wia("is_new", Boolean.valueOf(this.X))));
    }
}
