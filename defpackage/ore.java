package defpackage;

import android.content.Context;

/* renamed from: ore  reason: default package */
public final class ore extends Thread {
    public final /* synthetic */ a4d a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ore(a4d a4d, Context context, String str, long j) {
        super("TransmuxTranscodeHelper:Mp4Info");
        this.a = a4d;
        this.b = context;
        this.c = str;
        this.o = j;
    }

    public final void run() {
        a4d a4d = this.a;
        try {
            a4d.l(t79.a(this.b, this.o, this.c));
        } catch (Exception e) {
            a4d.m(e);
        }
    }
}
