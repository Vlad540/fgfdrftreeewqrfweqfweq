package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import one.me.android.deeplink.NewWidgetActivity;

/* renamed from: z5a  reason: default package */
public final class z5a {
    public final Context a;
    public final t97 b;

    public z5a(Context context, t97 t97) {
        this.a = context;
        this.b = t97;
    }

    public final void a(long j) {
        Uri d = am7.d(us8.j(j, ":chats?id=", "&type=local"), ((al) this.b.getValue()).b, (String) null);
        int i = NewWidgetActivity.Z0;
        Context context = this.a;
        Intent intent = new Intent(context, NewWidgetActivity.class);
        intent.putExtra("deep_link", d);
        intent.putExtra("snackbar", (Parcelable) null);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
}
