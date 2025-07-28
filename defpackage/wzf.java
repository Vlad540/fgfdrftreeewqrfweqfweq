package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;

/* renamed from: wzf  reason: default package */
public final class wzf extends z59 {
    public final Context b;
    public final /* synthetic */ ma6 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wzf(ma6 ma6, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 2);
        this.c = ma6;
        this.b = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            int i = na6.a;
            ma6 ma6 = this.c;
            Context context = this.b;
            int b2 = ma6.b(context, i);
            int i2 = xa6.e;
            if (b2 == 1 || b2 == 2 || b2 == 3 || b2 == 9) {
                Intent a = ma6.a(b2, context, "n");
                ma6.f(context, b2, a == null ? null : PendingIntent.getActivity(context, 0, a, 201326592));
            }
        }
    }
}
